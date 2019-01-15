package com.aliyuncs.auth;

public class BasicCredentials implements AlibabaCloudCredentials {

    private final String accessKeyId;
    private final String accessKeySecret;

    public BasicCredentials(String accessKeyId, String accessKeySecret) {
        if (accessKeyId == null) {
            throw new IllegalArgumentException("Access key ID cannot be null.");
        }
        if (accessKeySecret == null) {
            throw new IllegalArgumentException("Access key secret cannot be null.");
        }

        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
    }

    @Override
    public String getAccessKeyId() {
        return accessKeyId;
    }

    @Override
    public String getAccessKeySecret() {
        return accessKeySecret;
    }

}
