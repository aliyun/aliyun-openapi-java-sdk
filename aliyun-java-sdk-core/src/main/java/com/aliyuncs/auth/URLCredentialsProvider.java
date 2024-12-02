package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.clients.CompatibleUrlConnClient;
import com.aliyuncs.utils.AuthUtils;
import com.aliyuncs.utils.ParameterHelper;
import com.aliyuncs.utils.StringUtils;
import com.google.gson.Gson;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Map;

public class URLCredentialsProvider implements AlibabaCloudCredentialsProvider {

    private final URL credentialsURI;
    /**
     * Unit of millisecond
     */
    private final int connectTimeout;
    private final int readTimeout;

    private URLCredentialsProvider(Builder builder) {
        String credentialsURI = builder.credentialsURI == null ? AuthUtils.getEnvironmentCredentialsURI() : builder.credentialsURI;
        if (StringUtils.isEmpty(credentialsURI)) {
            throw new IllegalArgumentException("Credential URI or environment variable ALIBABA_CLOUD_CREDENTIALS_URI cannot be empty.");
        }
        try {
            this.credentialsURI = new URL(credentialsURI);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Credential URI is not valid.");
        }
        this.connectTimeout = builder.connectionTimeout == null ? 5000 : builder.connectionTimeout;
        this.readTimeout = builder.readTimeout == null ? 10000 : builder.readTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException {
        HttpRequest request = new HttpRequest(this.credentialsURI.toString());
        request.setSysMethod(MethodType.GET);
        request.setSysConnectTimeout(connectTimeout);
        request.setSysReadTimeout(readTimeout);
        HttpResponse response;

        try {
            response = CompatibleUrlConnClient.compatibleGetResponse(request);
        } catch (Exception e) {
            throw new ClientException("Failed to connect Server: " + e);
        }

        if (response.getStatus() != HttpURLConnection.HTTP_OK) {
            throw new ClientException("Failed to get credentials from server: " + this.credentialsURI
                    + "\nHttpCode=" + response.getStatus()
                    + "\nHttpRAWContent=" + response.getHttpContentString());
        }

        Gson gson = new Gson();
        Map<String, String> map;
        try {
            map = gson.fromJson(response.getHttpContentString(), Map.class);
        } catch (Exception e) {
            throw new ClientException("Failed to parse credentials from server: " + this.credentialsURI
                    + "\nHttpCode=" + response.getStatus()
                    + "\nHttpRAWContent=" + response.getHttpContentString());
        }
        if (null == map || !map.containsKey("Code") || !map.get("Code").equals("Success")) {
            throw new ClientException(String.format("Error retrieving credentials from url: %s, result: %s.", this.credentialsURI, response.getHttpContentString()));
        }
        if (!map.containsKey("AccessKeyId") || !map.containsKey("AccessKeySecret") || !map.containsKey("SecurityToken") || !map.containsKey("Expiration")) {
            throw new ClientException(String.format("Error retrieving credentials from url: %s, result: %s.", this.credentialsURI, response.getHttpContentString()));
        }
        long expiration;
        try {
            expiration = ParameterHelper.parseISO8601(map.get("Expiration")).getTime();
        } catch (ParseException e) {
            throw new ClientException(String.format("Error retrieving credentials expiration time from url: %s, result: %s.", this.credentialsURI, response.getHttpContentString()));
        }
        String accessKeyId = map.get("AccessKeyId");
        String accessKeySecret = map.get("AccessKeySecret");
        String securityToken = map.get("SecurityToken");
        return new BasicSessionCredentials(accessKeyId, accessKeySecret, securityToken, expiration - System.currentTimeMillis());
    }

    public static final class Builder {

        private String credentialsURI;
        private Integer connectionTimeout;
        private Integer readTimeout;

        public Builder credentialsURI(URL credentialsURI) {
            this.credentialsURI = credentialsURI.toString();
            return this;
        }

        public Builder credentialsURI(String credentialsURI) {
            this.credentialsURI = credentialsURI;
            return this;
        }

        public Builder connectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public Builder readTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public URLCredentialsProvider build() {
            return new URLCredentialsProvider(this);
        }
    }
}