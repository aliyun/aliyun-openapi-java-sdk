package com.aliyuncs.auth;

@SuppressWarnings("deprecation")
public class LegacyCredentials implements AlibabaCloudCredentials {

    private final Credential legacyCredential;

    public LegacyCredentials(Credential legacyCredential) {
        this.legacyCredential = legacyCredential;
    }

    @Override
    public String getAccessKeyId() {
        return legacyCredential.getAccessKeyId();
    }

    @Override
    public String getAccessKeySecret() {
        return legacyCredential.getAccessSecret();
    }

}
