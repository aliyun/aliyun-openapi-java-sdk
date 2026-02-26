package com.aliyuncs.auth;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.auth.sts.AssumeRoleRequest;
import com.aliyuncs.auth.sts.AssumeRoleResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.utils.AuthUtils;
import com.aliyuncs.utils.StringUtils;

/**
 * This implementation of AlibabaCloudCredentialsProvider accesses Alibaba Cloud STS service to assume a Role and get
 * back a temporary session for authentication.
 */
public class STSAssumeRoleSessionCredentialsProvider implements AlibabaCloudCredentialsProvider {

    /**
     * Default duration for started sessions.
     */
    public static final int DEFAULT_DURATION_SECONDS = 3600;
    /**
     * The arn of the role to be assumed.
     */
    private String roleArn;
    /**
     * For test
     * To know how many rounds AssumeRole has been called
     */
    public long assumeRoleRound = 0;
    /**
     * The client for starting STS sessions.
     */
    private IAcsClient stsClient;
    /**
     * An identifier for the assumed role session.
     */
    private String roleSessionName;
    /**
     * The Duration for assume role sessions.
     */
    private long roleSessionDurationSeconds;

    private String policy;
    private String externalId;
    private BasicSessionCredentials credentials = null;
    /**
     * Unit of millisecond
     */
    private int connectTimeout;
    private int readTimeout;
    private String stsEndpoint;


    public STSAssumeRoleSessionCredentialsProvider(AlibabaCloudCredentials longLivedCredentials,
                                                   String roleArn, IClientProfile clientProfile) {
        this(new StaticCredentialsProvider(longLivedCredentials), roleArn, clientProfile);
    }

    public STSAssumeRoleSessionCredentialsProvider(AlibabaCloudCredentialsProvider longLivedCredentialsProvider,
                                                   String roleArn, IClientProfile clientProfile) {
        if (roleArn == null) {
            throw new NullPointerException(
                    "You must specify a value for roleArn.");
        }
        this.roleArn = roleArn;
        this.roleSessionName = getNewRoleSessionName();
        this.stsClient = new DefaultAcsClient(clientProfile, longLivedCredentialsProvider);
        this.roleSessionDurationSeconds = DEFAULT_DURATION_SECONDS;
        this.connectTimeout = 5000;
        this.readTimeout = 10000;
    }

    public STSAssumeRoleSessionCredentialsProvider(String accessKeyId, String accessKeySecret, String roleSessionName,
                                                   String roleArn, String regionId) {
        this.roleArn = roleArn;
        this.roleSessionName = roleSessionName;
        DefaultProfile profile = DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret);
        this.stsClient = new DefaultAcsClient(profile);
        this.roleSessionDurationSeconds = AuthConstant.TSC_VALID_TIME_SECONDS;
        this.connectTimeout = 5000;
        this.readTimeout = 10000;
    }

    public STSAssumeRoleSessionCredentialsProvider(String accessKeyId, String accessKeySecret, String roleSessionName,
                                                   String roleArn, String regionId, String policy) {
        this(accessKeyId, accessKeySecret, roleSessionName, roleArn, regionId);
        this.policy = policy;
    }

    public static String getNewRoleSessionName() {
        return "aliyun-java-sdk-" + System.currentTimeMillis();
    }

    public STSAssumeRoleSessionCredentialsProvider withRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
        return this;
    }

    public STSAssumeRoleSessionCredentialsProvider withRoleSessionDurationSeconds(long roleSessionDurationSeconds) {
        if (roleSessionDurationSeconds < 900) {
            throw new IllegalArgumentException(
                    "Assume Role session duration should be in the range of 15min - max");
        }
        this.roleSessionDurationSeconds = roleSessionDurationSeconds;
        return this;
    }

    public STSAssumeRoleSessionCredentialsProvider withSTSClient(IAcsClient client) {
        this.stsClient = client;
        return this;
    }

    private STSAssumeRoleSessionCredentialsProvider(Builder builder) {
        this.roleSessionName = builder.roleSessionName == null ? !StringUtils.isEmpty(AuthUtils.getEnvironmentRoleSessionName()) ?
                AuthUtils.getEnvironmentRoleSessionName() : getNewRoleSessionName() : builder.roleSessionName;
        this.roleSessionDurationSeconds = builder.durationSeconds == null ? 3600 : builder.durationSeconds;
        if (this.roleSessionDurationSeconds < 900) {
            throw new IllegalArgumentException("Session duration should be in the range of 900s - max session duration.");
        }

        this.roleArn = builder.roleArn == null ? AuthUtils.getEnvironmentRoleArn() : builder.roleArn;
        if (StringUtils.isEmpty(this.roleArn)) {
            throw new IllegalArgumentException("RoleArn or environment variable ALIBABA_CLOUD_ROLE_ARN cannot be empty.");
        }
        this.policy = builder.policy;
        this.externalId = builder.externalId;
        this.connectTimeout = builder.connectionTimeout == null ? 5000 : builder.connectionTimeout;
        this.readTimeout = builder.readTimeout == null ? 10000 : builder.readTimeout;

        String prefix = builder.enableVpc != null ? (builder.enableVpc ? "sts-vpc" : "sts") : AuthUtils.isEnableVpcEndpoint() ? "sts-vpc" : "sts";
        if (!StringUtils.isEmpty(builder.stsRegionId)) {
            this.stsEndpoint = String.format("%s.%s.aliyuncs.com", prefix, builder.stsRegionId);
        } else if (!StringUtils.isEmpty(AuthUtils.getEnvironmentSTSRegion())) {
            this.stsEndpoint = String.format("%s.%s.aliyuncs.com", prefix, AuthUtils.getEnvironmentSTSRegion());
        } else {
            this.stsEndpoint = "sts.aliyuncs.com";
        }

        DefaultProfile profile = DefaultProfile.getProfile(builder.stsRegionId);


        if (null != builder.credentialsProvider) {
            this.stsClient = new DefaultAcsClient(profile, builder.credentialsProvider);
        } else if (!StringUtils.isEmpty(builder.securityToken)) {
            AlibabaCloudCredentialsProvider credentialsProvider = new StaticCredentialsProvider(
                    new BasicSessionCredentials(builder.accessKeyId, builder.accessKeySecret, builder.securityToken));
            this.stsClient = new DefaultAcsClient(profile, credentialsProvider);
        } else {
            AlibabaCloudCredentialsProvider credentialsProvider = new StaticCredentialsProvider(
                    new BasicCredentials(builder.accessKeyId, builder.accessKeySecret));
            this.stsClient = new DefaultAcsClient(profile, credentialsProvider);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException, ServerException {
        if (credentials == null || credentials.willSoonExpire()) {
            credentials = getNewSessionCredentials();
        }
        return credentials;
    }

    private BasicSessionCredentials getNewSessionCredentials() throws ClientException, ServerException {

        assumeRoleRound += 1;

        AssumeRoleRequest assumeRoleRequest = new AssumeRoleRequest();
        assumeRoleRequest.setRoleArn(roleArn);
        assumeRoleRequest.setRoleSessionName(roleSessionName);
        assumeRoleRequest.setDurationSeconds(roleSessionDurationSeconds);
        assumeRoleRequest.setSysConnectTimeout(connectTimeout);
        assumeRoleRequest.setSysReadTimeout(readTimeout);
        if (!StringUtils.isEmpty(stsEndpoint)) {
            assumeRoleRequest.setSysEndpoint(stsEndpoint);
        }
        if (null != policy) {
            assumeRoleRequest.setPolicy(policy);
        }
        if (null != externalId) {
            assumeRoleRequest.setExternalId(externalId);
        }
        AssumeRoleResponse response = stsClient.getAcsResponse(assumeRoleRequest);
        return new BasicSessionCredentials(
                response.getCredentials().getAccessKeyId(),
                response.getCredentials().getAccessKeySecret(),
                response.getCredentials().getSecurityToken(),
                roleSessionDurationSeconds
        );
    }

    public static final class Builder {
        private String roleSessionName;
        private Integer durationSeconds;
        private String roleArn;
        private String policy;
        private Integer connectionTimeout;
        private Integer readTimeout;
        private String stsRegionId;
        private Boolean enableVpc;
        private String accessKeyId;
        private String accessKeySecret;
        private String securityToken;
        private AlibabaCloudCredentialsProvider credentialsProvider;
        private String externalId;

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

        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        public Builder accessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }

        public Builder securityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        public Builder credentialsProvider(AlibabaCloudCredentialsProvider credentialsProvider) {
            this.credentialsProvider = credentialsProvider;
            return this;
        }

        public Builder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public STSAssumeRoleSessionCredentialsProvider build() {
            return new STSAssumeRoleSessionCredentialsProvider(this);
        }
    }
}