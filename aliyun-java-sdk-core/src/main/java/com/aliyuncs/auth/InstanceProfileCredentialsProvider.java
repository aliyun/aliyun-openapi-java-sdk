package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;

public class InstanceProfileCredentialsProvider implements AlibabaCloudCredentialsProvider {

    private static final int MAX_ECS_METADATA_FETCH_RETRY_TIMES = 3;
    private final String roleName;
    public int ecsMetadataServiceFetchCount = 0;
    private InstanceProfileCredentials credentials = null;
    private ECSMetadataServiceCredentialsFetcher fetcher;
    private int maxRetryTimes = MAX_ECS_METADATA_FETCH_RETRY_TIMES;

    public InstanceProfileCredentialsProvider(String roleName) {
        if (null == roleName) {
            throw new NullPointerException("You must specifiy a valid role name.");
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

    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException {
        if (credentials == null || credentials.isExpired()) {
            ecsMetadataServiceFetchCount += 1;
            credentials = fetcher.fetch(maxRetryTimes);
            // } else if (credentials.isExpired()) {
            // throw new ClientException("SDK.SessionTokenExpired", "Current session token
            // has expired.");
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
}