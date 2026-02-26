package com.aliyuncs.auth;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.UserAgentConfig;
import com.aliyuncs.http.clients.CompatibleUrlConnClient;
import com.aliyuncs.utils.AuthUtils;
import com.aliyuncs.utils.ParameterHelper;
import com.aliyuncs.utils.StringUtils;
import com.google.gson.Gson;

public class OIDCCredentialsProvider implements AlibabaCloudCredentialsProvider {

    private String roleArn;
    String getRoleArn() {
        return roleArn;
    }

    void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    private String oidcProviderArn;
    String getOidcProviderArn() {
        return oidcProviderArn;
    }

    void setOidcProviderArn(String oidcProviderArn) {
        this.oidcProviderArn = oidcProviderArn;
    }

    private String oidcTokenFilePath;
    String getOidcTokenFilePath() {
        return oidcTokenFilePath;
    }

    void setOidcTokenFilePath(String oidcTokenFilePath) {
        this.oidcTokenFilePath = oidcTokenFilePath;
    }

    private String roleSessionName;
    String getRoleSessionName() {
        return roleSessionName;
    }

    void setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
    }

    private String policy;
    String getPolicy() {
        return policy;
    }

    void setPolicy(String policy) {
        this.policy = policy;
    }

    private String stsEndpoint;
    private long durationSeconds;
    private int connectTimeout;
    private int readTimeout;

    // inner cache
    private BasicSessionCredentials credentials;

    public OIDCCredentialsProvider(String roleArn, String providerArn, String oidcTokenFilePath, String roleSessionName, String regionId) throws ClientException {
        this.roleArn = !StringUtils.isEmpty(roleArn) ? roleArn : AuthUtils.getEnvironmentRoleArn();
        if (StringUtils.isEmpty(this.roleArn)) {
            throw new ClientException("roleArn does not exist and env ALIBABA_CLOUD_ROLE_ARN is null.");
        }

        this.oidcProviderArn = !StringUtils.isEmpty(providerArn) ? providerArn : AuthUtils.getEnvironmentOIDCProviderArn();
        if (StringUtils.isEmpty(this.oidcProviderArn)) {
            throw new ClientException("OIDCProviderArn does not exist and env ALIBABA_CLOUD_OIDC_PROVIDER_ARN is null.");
        }

        this.oidcTokenFilePath = !StringUtils.isEmpty(oidcTokenFilePath) ? oidcTokenFilePath : AuthUtils.getEnvironmentOIDCTokenFilePath();
        if (StringUtils.isEmpty(this.oidcTokenFilePath)) {
            throw new ClientException("OIDCTokenFilePath does not exist and env ALIBABA_CLOUD_OIDC_TOKEN_FILE is null.");
        }

        this.roleSessionName = !StringUtils.isEmpty(roleSessionName) ? roleSessionName : AuthUtils.getEnvironmentRoleSessionName();
        if (StringUtils.isEmpty(this.roleSessionName)) {
            this.roleSessionName = "aliyun-java-sdk-" + System.currentTimeMillis();
        }

        if (StringUtils.isEmpty(regionId)) {
            this.stsEndpoint = "https://sts.aliyuncs.com/";
        } else {
            this.stsEndpoint = String.format("https://sts.%s.aliyuncs.com/", regionId);
        }

        this.durationSeconds = 3600L;
        this.connectTimeout = 5000;
        this.readTimeout = 10000;
    }

    private OIDCCredentialsProvider(Builder builder) {
        this.roleSessionName = builder.roleSessionName == null ? !StringUtils.isEmpty(AuthUtils.getEnvironmentRoleSessionName()) ?
                AuthUtils.getEnvironmentRoleSessionName() : "aliyun-java-sdk-" + System.currentTimeMillis() : builder.roleSessionName;
        this.durationSeconds = builder.durationSeconds == null ? 3600 : builder.durationSeconds;
        if (this.durationSeconds < 900) {
            throw new IllegalArgumentException("Session duration should be in the range of 900s - max session duration.");
        }

        this.roleArn = builder.roleArn == null ? AuthUtils.getEnvironmentRoleArn() : builder.roleArn;
        if (StringUtils.isEmpty(this.roleArn)) {
            throw new IllegalArgumentException("RoleArn or environment variable ALIBABA_CLOUD_ROLE_ARN cannot be empty.");
        }

        this.oidcProviderArn = builder.oidcProviderArn == null ? AuthUtils.getEnvironmentOIDCProviderArn() : builder.oidcProviderArn;
        if (StringUtils.isEmpty(this.oidcProviderArn)) {
            throw new IllegalArgumentException("OIDCProviderArn or environment variable ALIBABA_CLOUD_OIDC_PROVIDER_ARN cannot be empty.");
        }

        this.oidcTokenFilePath = builder.oidcTokenFilePath == null ? AuthUtils.getEnvironmentOIDCTokenFilePath() : builder.oidcTokenFilePath;
        if (StringUtils.isEmpty(this.oidcTokenFilePath)) {
            throw new IllegalArgumentException("OIDCTokenFilePath or environment variable ALIBABA_CLOUD_OIDC_TOKEN_FILE cannot be empty.");
        }

        this.policy = builder.policy;
        this.connectTimeout = builder.connectionTimeout == null ? 5000 : builder.connectionTimeout;
        this.readTimeout = builder.readTimeout == null ? 10000 : builder.readTimeout;

        String prefix = builder.enableVpc != null ? (builder.enableVpc ? "sts-vpc" : "sts") : AuthUtils.isEnableVpcEndpoint() ? "sts-vpc" : "sts";
        if (!StringUtils.isEmpty(builder.stsRegionId)) {
            this.stsEndpoint = String.format("https://%s.%s.aliyuncs.com", prefix, builder.stsRegionId);
        } else if (!StringUtils.isEmpty(AuthUtils.getEnvironmentSTSRegion())) {
            this.stsEndpoint = String.format("https://%s.%s.aliyuncs.com", prefix, AuthUtils.getEnvironmentSTSRegion());
        } else {
            this.stsEndpoint = "https://sts.aliyuncs.com";
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException, ServerException {
        if (credentials == null || credentials.willSoonExpire()) {
            String body = this.invokeAssumeRoleWithOIDC();
            credentials = parseCredentials(body, this.durationSeconds);
        }
        return credentials;
    }

    private static BasicSessionCredentials parseCredentials(String body, long durationSeconds) throws ClientException {
        Gson gson = new Gson();
        Map<String, Object> map = gson.fromJson(body, Map.class);
        if (null == map) {
            throw new ClientException("Invalid JSON");
        } else if (map.containsKey("Credentials")) {
            Map<String, String> result = (Map<String, String>) map.get("Credentials");
            String accessKeyId = result.get("AccessKeyId");
            String accessKeySecret = result.get("AccessKeySecret");
            String securityToken = result.get("SecurityToken");
            return new BasicSessionCredentials(accessKeyId, accessKeySecret, securityToken, durationSeconds);
        } else {
            throw new ClientException("AssumeRoleWithOIDC failed: " + body);
        }
    }

    private String invokeAssumeRoleWithOIDC() throws ClientException {
        Map<String, String> queries = new HashMap<String, String>();
        queries.put("Action", "AssumeRoleWithOIDC");
        queries.put("Format", "JSON");
        queries.put("Version", "2015-04-01");
        queries.put("Timestamp", ParameterHelper.getISO8601Time(new Date()));
        String url;
        try {
            url = this.stsEndpoint + "?" + new String(ParameterHelper.getFormData(queries));
        } catch (UnsupportedEncodingException e) {
            throw new ClientException("AssumeRoleWithOIDC failed " + e.toString());
        }

        HttpRequest httpRequest = new HttpRequest(url);
        httpRequest.setSysMethod(MethodType.POST);
        httpRequest.setHttpContentType(FormatType.FORM);
        httpRequest.setSysConnectTimeout(connectTimeout);
        httpRequest.setSysReadTimeout(readTimeout);
        httpRequest.putHeaderParameter("UserAgent", UserAgentConfig.resolve(null, null));
        String oidcToken = AuthUtils.readFile(oidcTokenFilePath);
        if (oidcToken == null) {
            throw new ClientException("Read OIDC token failed");
        }

        Map<String, String> body = new HashMap<String, String>();
        body.put("DurationSeconds", String.valueOf(durationSeconds));
        body.put("RoleArn", this.roleArn);
        body.put("OIDCProviderArn", this.oidcProviderArn);
        body.put("OIDCToken", oidcToken);
        body.put("RoleSessionName", this.roleSessionName);
        if (policy != null) {
            body.put("Policy", this.policy);
        }

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

        HttpResponse response;
        try {
            response = CompatibleUrlConnClient.compatibleGetResponse(httpRequest);
        } catch (Exception e) {
            throw new ClientException(e);
        }

        if (response.getStatus() != HttpURLConnection.HTTP_OK) {
            String responseBody = response.getHttpContentString();
            Gson gson = new Gson();
            Map<String, Object> map = gson.fromJson(responseBody, Map.class);
            String requestID = (String)map.get("RequestId");
            String message = String.format("%s(RequestID: %s, Code: %s)", (String)map.get("Message"), requestID, (String)map.get("Code"));
            throw new ClientException("AssumeRoleWithOIDC failed: " + message);
        }

        return new String(response.getHttpContent());
    }

    public static final class Builder {
        private String roleSessionName;
        private Integer durationSeconds;
        private String roleArn;
        private String oidcProviderArn;
        private String oidcTokenFilePath;
        private String policy;
        private Integer connectionTimeout;
        private Integer readTimeout;
        private String stsRegionId;
        private Boolean enableVpc;

        public Builder roleSessionName(String roleSessionName) {
            this.roleSessionName = roleSessionName;
            return this;
        }

        public Builder durationSeconds(Integer durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder oidcProviderArn(String oidcProviderArn) {
            this.oidcProviderArn = oidcProviderArn;
            return this;
        }

        public Builder oidcTokenFilePath(String oidcTokenFilePath) {
            this.oidcTokenFilePath = oidcTokenFilePath;
            return this;
        }

        public Builder policy(String policy) {
            this.policy = policy;
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

        public Builder stsRegionId(String stsRegionId) {
            this.stsRegionId = stsRegionId;
            return this;
        }

        public Builder enableVpc(Boolean enableVpc) {
            this.enableVpc = enableVpc;
            return this;
        }

        public OIDCCredentialsProvider build() {
            return new OIDCCredentialsProvider(this);
        }
    }
}
