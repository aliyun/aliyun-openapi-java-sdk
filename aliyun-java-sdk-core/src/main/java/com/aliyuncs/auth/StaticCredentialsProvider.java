package com.aliyuncs.auth;

import com.aliyuncs.profile.IClientProfile;

public class StaticCredentialsProvider implements AlibabaCloudCredentialsProvider {

    private AlibabaCloudCredentials credentials = null;
    private IClientProfile clientProfile = null;

    public StaticCredentialsProvider(AlibabaCloudCredentials credentials) {
        this.credentials = credentials;
    }

    @SuppressWarnings("deprecation")
    public StaticCredentialsProvider(IClientProfile clientProfile) {
        this.clientProfile = clientProfile;
        Credential legacyCredential = this.clientProfile.getCredential();
        if (null != legacyCredential.getSecurityToken()) {
            this.credentials = new BasicSessionCredentials(legacyCredential.getAccessKeyId(), legacyCredential
                    .getAccessSecret(), legacyCredential.getSecurityToken());
        } else {
            this.credentials = new LegacyCredentials(legacyCredential);
        }
    }

    @Override
    public AlibabaCloudCredentials getCredentials() {
        return this.credentials;
    }
}
