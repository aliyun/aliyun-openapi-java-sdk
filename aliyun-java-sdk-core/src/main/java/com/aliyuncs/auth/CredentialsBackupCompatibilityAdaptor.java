package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;

@Deprecated
public class CredentialsBackupCompatibilityAdaptor extends Credential {

    private final AlibabaCloudCredentialsProvider provider;

    public CredentialsBackupCompatibilityAdaptor(AlibabaCloudCredentialsProvider provider) {
        this.provider = provider;
    }

    private AlibabaCloudCredentials getCredentials() {
        try {
            AlibabaCloudCredentials credentials = this.provider.getCredentials();
            return credentials;
        } catch (ClientException e) {
            throw new RuntimeException(e.toString());
        }
    }

    @Override
    public String getAccessKeyId() {
        return getCredentials().getAccessKeyId();
    }

    @Override
    public String getAccessSecret() {
        return getCredentials().getAccessKeySecret();
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public String getSecurityToken() {
        AlibabaCloudCredentials credentials = getCredentials();
        if (credentials instanceof BasicSessionCredentials) {
            return ((BasicSessionCredentials) credentials).getSessionToken();
        } else {
            return null;
        }
    }

}
