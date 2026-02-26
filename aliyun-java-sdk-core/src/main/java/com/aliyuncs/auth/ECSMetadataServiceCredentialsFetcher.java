package com.aliyuncs.auth;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.clients.CompatibleUrlConnClient;
import com.aliyuncs.utils.StringUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ECSMetadataServiceCredentialsFetcher {
    private static final String URL_IN_ECS_METADATA = "/latest/meta-data/ram/security-credentials/";
    private static final String URL_IN_METADATA_TOKEN = "/latest/api/token";
    private static final int DEFAULT_TIMEOUT_IN_MILLISECONDS = 1000;
    private static final String ECS_METADATA_FETCH_ERROR_MSG = "Failed to get RAM session credentials from ECS metadata service.";
    private static final int DEFAULT_ECS_SESSION_TOKEN_DURATION_SECONDS = 3600 * 6;
    private URL credentialUrl;
    private String roleName;
    private String metadataServiceHost = "100.100.100.200";
    private final boolean disableIMDSv1;
    private final int metadataTokenDuration = 21600;
    private int connectionTimeout;
    private int readTimeout;

    public ECSMetadataServiceCredentialsFetcher() {
        this.connectionTimeout = DEFAULT_TIMEOUT_IN_MILLISECONDS;
        this.readTimeout = DEFAULT_TIMEOUT_IN_MILLISECONDS;
        this.disableIMDSv1 = false;
    }

    public ECSMetadataServiceCredentialsFetcher(String roleName, Boolean disableIMDSv1, Integer connectionTimeout, Integer readTimeout) {
        this.connectionTimeout = connectionTimeout == null ? 1000 : connectionTimeout;
        this.readTimeout = readTimeout == null ? 1000 : readTimeout;
        this.disableIMDSv1 = disableIMDSv1 == null ? false : disableIMDSv1;
        this.roleName = roleName;
    }

    @Deprecated
    public void setRoleName(String roleName) {
        if (null == roleName) {
            throw new IllegalArgumentException("You must specify a valid role name.");
        }
        this.roleName = roleName;
        setCredentialUrl();
    }

    private void setCredentialUrl() {
        try {
            this.credentialUrl = new URL("http://" + metadataServiceHost + URL_IN_ECS_METADATA + roleName);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e.toString());
        }
    }

    @Deprecated
    public ECSMetadataServiceCredentialsFetcher withECSMetadataServiceHost(String host) {
        System.err.println("withECSMetadataServiceHost() method is only for testing, please don't use it");
        this.metadataServiceHost = host;
        setCredentialUrl();
        return this;
    }

    @Deprecated
    public ECSMetadataServiceCredentialsFetcher withConnectionTimeout(int milliseconds) {
        this.connectionTimeout = milliseconds;
        this.readTimeout = milliseconds;
        return this;
    }

    @Deprecated
    public String getMetadata() throws ClientException {
        return getMetadata(credentialUrl.toString());
    }

    private String getMetadata(String url) throws ClientException {
        HttpRequest request = new HttpRequest(url);
        request.setSysMethod(MethodType.GET);
        request.setSysConnectTimeout(connectionTimeout);
        request.setSysReadTimeout(readTimeout);
        String metadataToken = this.getMetadataToken();
        if (metadataToken != null) {
            request.putHeaderParameter("X-aliyun-ecs-metadata-token", metadataToken);
        }

        HttpResponse response;
        try {
            response = CompatibleUrlConnClient.compatibleGetResponse(request);
        } catch (Exception e) {
            throw new ClientException("Failed to connect ECS Metadata Service: " + e.toString());
        }

        if (response.getStatus() == HttpURLConnection.HTTP_NOT_FOUND) {
            throw new ClientException("The role name was not found in the instance.");
        }

        if (response.getStatus() != HttpURLConnection.HTTP_OK) {
            throw new ClientException(ECS_METADATA_FETCH_ERROR_MSG + " HttpCode=" + response.getStatus());
        }

        return new String(response.getHttpContent());
    }

    public InstanceProfileCredentials fetch() throws ClientException {
        String roleName = this.roleName;
        if (StringUtils.isEmpty(this.roleName)) {
            roleName = getMetadata("http://" + metadataServiceHost + URL_IN_ECS_METADATA);
        }
        String jsonContent = getMetadata("http://" + metadataServiceHost + URL_IN_ECS_METADATA + roleName);
        JsonObject jsonObject = JsonParser.parseString(jsonContent).getAsJsonObject();
        if (!jsonObject.has("Code") || !jsonObject.has("AccessKeyId") || !jsonObject.has("AccessKeySecret") || !jsonObject
                .has("SecurityToken") || !jsonObject.has("Expiration")) {
            throw new ClientException("Invalid json got from ECS Metadata service.");
        }

        if (!"Success".equals(jsonObject.get("Code").getAsString())) {
            throw new ClientException(ECS_METADATA_FETCH_ERROR_MSG);
        }
        return new InstanceProfileCredentials(
                jsonObject.get("AccessKeyId").getAsString(),
                jsonObject.get("AccessKeySecret").getAsString(),
                jsonObject.get("SecurityToken").getAsString(),
                jsonObject.get("Expiration").getAsString(),
                DEFAULT_ECS_SESSION_TOKEN_DURATION_SECONDS);
    }

    public InstanceProfileCredentials fetch(int retryTimes) throws ClientException {
        for (int i = 0; i <= retryTimes; i++) {
            try {
                return fetch();
            } catch (ClientException e) {
                if (i == retryTimes) {
                    throw e;
                }
            }
        }
        throw new ClientException("Failed to connect ECS Metadata Service: Max retry times exceeded.");
    }

    private String getMetadataToken() throws ClientException {
        try {
            HttpRequest request = new HttpRequest("http://" + metadataServiceHost + URL_IN_METADATA_TOKEN);
            request.setSysMethod(MethodType.PUT);
            request.setSysConnectTimeout(connectionTimeout);
            request.setSysReadTimeout(readTimeout);
            request.putHeaderParameter("X-aliyun-ecs-metadata-token-ttl-seconds", String.valueOf(this.metadataTokenDuration));
            HttpResponse response;
            try {
                response = CompatibleUrlConnClient.compatibleGetResponse(request);
                ;
            } catch (Exception e) {
                throw new ClientException("Failed to connect ECS Metadata Service: " + e);
            }
            if (response.getStatus() != HttpURLConnection.HTTP_OK) {
                throw new ClientException("Failed to get token from ECS Metadata Service. HttpCode=" + response.getStatus() + ", ResponseMessage=" + response.getHttpContentString());
            }
            return new String(response.getHttpContent());
        } catch (Exception ex) {
            return throwErrorOrReturn(ex);
        }
    }

    private String throwErrorOrReturn(Exception e) throws ClientException {
        if (this.disableIMDSv1) {
            throw new ClientException("Failed to get token from ECS Metadata Service, and fallback to IMDS v1 is disabled via the disableIMDSv1 configuration is turned on. Original error: " + e.getMessage());
        }
        return null;
    }
}