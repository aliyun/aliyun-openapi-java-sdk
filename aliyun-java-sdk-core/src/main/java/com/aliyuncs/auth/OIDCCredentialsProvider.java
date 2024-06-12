package com.aliyuncs.auth;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.clients.CompatibleUrlConnClient;
import com.aliyuncs.utils.AuthUtils;
import com.aliyuncs.utils.ParameterHelper;
import com.aliyuncs.utils.StringUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class OIDCCredentialsProvider implements AlibabaCloudCredentialsProvider {

    private String roleArn;
    private String oidcProviderArn;
    private String oidcTokenFilePath;
    private String roleSessionName;
    private String policy;
    private String stsEndpoint;
    private long durationSeconds;

    public OIDCCredentialsProvider(String roleArn, String providerArn, String oidcTokenFilePath, String roleSessionName, String regionId) throws ClientException {
        if (!StringUtils.isEmpty(roleArn)) {
            this.roleArn = roleArn;
        } else if (!StringUtils.isEmpty(System.getenv("ALIBABA_CLOUD_ROLE_ARN"))) {
            this.roleArn = System.getenv("ALIBABA_CLOUD_ROLE_ARN");
        } else {
            throw new ClientException("roleArn does not exist and env ALIBABA_CLOUD_ROLE_ARN is null.");
        }

        if (!StringUtils.isEmpty(providerArn)) {
            this.oidcProviderArn = providerArn;
        } else if (!StringUtils.isEmpty(System.getenv("ALIBABA_CLOUD_OIDC_PROVIDER_ARN"))) {
            this.oidcProviderArn = System.getenv("ALIBABA_CLOUD_OIDC_PROVIDER_ARN");
        } else {
            throw new ClientException("OIDCProviderArn does not exist and env ALIBABA_CLOUD_OIDC_PROVIDER_ARN is null.");
        }

        if (!StringUtils.isEmpty(oidcTokenFilePath)) {
            this.oidcTokenFilePath = oidcTokenFilePath;
        } else if (!StringUtils.isEmpty(System.getenv("ALIBABA_CLOUD_OIDC_TOKEN_FILE"))) {
            this.oidcTokenFilePath = System.getenv("ALIBABA_CLOUD_OIDC_TOKEN_FILE");
        } else {
            throw new ClientException("OIDCTokenFilePath does not exist and env ALIBABA_CLOUD_OIDC_TOKEN_FILE is null.");
        }

        if (!StringUtils.isEmpty(roleSessionName)) {
            this.roleSessionName = roleSessionName;
        } else if (!StringUtils.isEmpty(System.getenv("ALIBABA_CLOUD_ROLE_SESSION_NAME"))) {
            this.roleSessionName = System.getenv("ALIBABA_CLOUD_ROLE_SESSION_NAME");
        } else {
            this.roleSessionName = "DEFAULT_ROLE_SESSION_NAME_FOR_JAVA_SDK_V1";
        }

        if (StringUtils.isEmpty(regionId)) {
            this.stsEndpoint = "https://sts.aliyuncs.com/";
        } else {
            this.stsEndpoint = String.format("https://sts.%s.aliyuncs.com/", regionId);
        }

        this.durationSeconds = 3600L;
    }

    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException, ServerException {
        String body = this.invokeAssumeRoleWithOIDC();
        Gson gson = new Gson();
        Map<String, Object> map = gson.fromJson(body, Map.class);
        if (null == map) {
            throw new ClientException("Invalid JSON");
        } else if (map.containsKey("Credentials")) {
            Map<String, String> result = (Map<String, String>) map.get("Credentials");
            SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            parser.setTimeZone(TimeZone.getTimeZone("GMT"));
            long expiration;
            try {
                Date date = parser.parse(result.get("Expiration").replace('T', ' ').replace('Z', ' '));
                expiration = date.getTime();
            } catch (ParseException e) {
                throw new IllegalArgumentException("Failed to get valid expiration time");
            }

            String accessKeyId = result.get("AccessKeyId");
            String accessKeySecret = result.get("AccessKeySecret");
            String securityToken = result.get("SecurityToken");
            return new BasicSessionCredentials(
                accessKeyId,
                accessKeySecret,
                securityToken,
                expiration
            );
        } else {
            throw new ClientException(gson.toJson(map));
        }
    }

    private String invokeAssumeRoleWithOIDC() throws ClientException {
        ParameterHelper parameterHelper = new ParameterHelper();

        Map<String, String> queries = new HashMap<String, String>();
        queries.put("Action", "AssumeRoleWithOIDC");
        queries.put("Format", "JSON");
        queries.put("Version", "2015-04-01");
        String url = null;
        try {
            url = this.stsEndpoint + ParameterHelper.getFormData(queries);
        } catch (UnsupportedEncodingException e) {
            throw new ClientException("AssumeRoleWithOIDC failed " + e.toString());
        }

        HttpRequest httpRequest = new HttpRequest(url);
        httpRequest.setSysMethod(MethodType.POST);
        httpRequest.setHttpContentType(FormatType.FORM);

        String oidcToken = null;
        FileInputStream in = null;
        byte[] buffer;
        try {
            in = new FileInputStream(new File(oidcTokenFilePath));
            buffer = new byte[in.available()];
            in.read(buffer);
            oidcToken = new String(buffer, "UTF-8");
        } catch (IOException e) {
            throw new ClientException("Read OIDC token failed " + e.toString());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        Map<String, String> body = new HashMap<String, String>();
        body.put("DurationSeconds", String.valueOf(durationSeconds));
        body.put("RoleArn", this.roleArn);
        body.put("OIDCProviderArn", this.oidcProviderArn);
        body.put("OIDCToken", oidcToken);
        body.put("RoleSessionName", this.roleSessionName);
        body.put("Policy", this.policy);

        StringBuilder content = new StringBuilder();
        
        try {
            boolean first = true;
            for (Map.Entry<String, String> entry : body.entrySet()) {
                if (StringUtils.isEmpty(entry.getValue())) {
                    continue;
                }
                if (first) {
                    first = false;
                } else {
                    content.append("&");
                }
                content.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                content.append("=");
                content.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            httpRequest.setHttpContent(content.toString().getBytes("UTF-8"), "UTF-8", FormatType.FORM);
        } catch (UnsupportedEncodingException e) {
            throw new ClientException("AssumeRoleWithOIDC failed " + e.toString());
        }

        httpRequest.setSysMethod(MethodType.POST);
        HttpResponse response;
        try {
            response = CompatibleUrlConnClient.compatibleGetResponse(httpRequest);
        } catch (Exception e) {
            throw new ClientException("Failed to connect ECS Metadata Service: " + e.toString());
        }

        if (response.getStatus() != HttpURLConnection.HTTP_OK) {
            throw new ClientException("AssumeRoleWithOIDC failed with status code " + response.getStatus());
        }

        return new String(response.getHttpContent());
    }
}
