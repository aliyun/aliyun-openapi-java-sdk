package com.aliyuncs.auth;

@SuppressWarnings("deprecation")
public class LegacyCredentials implements AlibabaCloudCredentials {

    private final Credential legacyCredential;

    public LegacyCredentials(Credential legacyCrendential) {
        this.legacyCredential = legacyCrendential;
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
