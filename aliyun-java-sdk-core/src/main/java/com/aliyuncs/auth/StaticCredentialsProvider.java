package com.aliyuncs.auth;

import com.aliyuncs.profile.IClientProfile;

public class StaticCredentialsProvider implements AlibabaCloudCredentialsProvider {

    private AlibabaCloudCredentials credentials;

    public StaticCredentialsProvider(AlibabaCloudCredentials credentials) {
        this.credentials = credentials;
    }

    @SuppressWarnings("deprecation")
    public StaticCredentialsProvider(IClientProfile clientProfile) {
        Credential credential = clientProfile.getCredential();
        if (credential == null) {
            this.credentials = new AnonymousCredentials();
        }else if (null != credential.getSecurityToken()) {
            this.credentials = new BasicSessionCredentials(credential.getAccessKeyId(), credential
                    .getAccessSecret(), credential.getSecurityToken());
        } else {
            this.credentials = new LegacyCredentials(credential);
        }
    }

    @Override
    public AlibabaCloudCredentials getCredentials() {
        return this.credentials;
    }
}
