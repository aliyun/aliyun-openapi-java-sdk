package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;

public class InstanceProfileCredentialsProvider implements AlibabaCloudCredentialsProvider {

    private static final int MAX_ECS_METADATA_FETCH_RETRY_TIMES = 3;
    private final String roleName;
    public int ecsMetadataServiceFetchCount = 0;
    private InstanceProfileCredentials credentials = null;
    private ECSMetadataServiceCredentialsFetcher fetcher;

    public InstanceProfileCredentialsProvider(String roleName) {
        if (null == roleName) {
            throw new NullPointerException("You must specify a valid role name.");
        }
        this.roleName = roleName;
        this.fetcher = new ECSMetadataServiceCredentialsFetcher();
        this.fetcher.setRoleName(this.roleName);
    }

    public InstanceProfileCredentialsProvider withFetcher(ECSMetadataServiceCredentialsFetcher fetcher) {
        this.fetcher = fetcher;
        this.fetcher.setRoleName(roleName);
        return this;
    }

    private InstanceProfileCredentialsProvider(BuilderImpl builder) {
        if (AuthUtils.isDisableECSMetaData()) {
            throw new IllegalArgumentException("IMDS credentials is disabled.");
        }
        this.roleName = builder.roleName == null ? AuthUtils.getEnvironmentECSMetaData() : builder.roleName;
        boolean disableIMDSv1 = builder.disableIMDSv1 == null ? AuthUtils.getDisableECSIMDSv1() : builder.disableIMDSv1;
        this.fetcher = new ECSMetadataServiceCredentialsFetcher(
                roleName,
                disableIMDSv1,
                builder.connectionTimeout,
                builder.readTimeout);
    }

    public static Builder builder() {
        return new BuilderImpl();
    }

    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException {
        if (credentials == null || credentials.isExpired()) {
            ecsMetadataServiceFetchCount += 1;
            credentials = fetcher.fetch(MAX_ECS_METADATA_FETCH_RETRY_TIMES);
        } else if (credentials.willSoonExpire() && credentials.shouldRefresh()) {
            try {
                ecsMetadataServiceFetchCount += 1;
                credentials = fetcher.fetch();
            } catch (ClientException e) {
                // Use the current expiring session token and wait for next round
                credentials.setLastFailedRefreshTime();
            }
        }
        return credentials;
    }

    public interface Builder {
        Builder roleName(String roleName);

        Builder disableIMDSv1(Boolean disableIMDSv1);

        Builder connectionTimeout(Integer connectionTimeout);

        Builder readTimeout(Integer readTimeout);

        InstanceProfileCredentialsProvider build();
    }

    private static final class BuilderImpl implements Builder {
        private String roleName;
        private Boolean disableIMDSv1;
        private Integer connectionTimeout;
        private Integer readTimeout;

        @Override
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        @Override
        public Builder disableIMDSv1(Boolean disableIMDSv1) {
            this.disableIMDSv1 = disableIMDSv1;
            return this;
        }

        @Override
        public Builder connectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        @Override
        public Builder readTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        @Override
        public InstanceProfileCredentialsProvider build() {
            return new InstanceProfileCredentialsProvider(this);
        }
    }
}