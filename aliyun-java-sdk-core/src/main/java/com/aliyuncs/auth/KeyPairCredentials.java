package com.aliyuncs.auth;

public class KeyPairCredentials implements AlibabaCloudCredentials {

    private String privateKeySecret;
    private String publicKeyId;

    public KeyPairCredentials(String publicKeyId, String privateKeySecret) {
        if (publicKeyId == null || privateKeySecret == null) {
            throw new IllegalArgumentException(
                    "You must provide a valid pair of Public Key ID and Private Key Secret.");
        }

        this.publicKeyId = publicKeyId;
        this.privateKeySecret = privateKeySecret;
    }

    @Override
    public String getAccessKeyId() {
        return publicKeyId;
    }

    @Override
    public String getAccessKeySecret() {
        return privateKeySecret;
    }
}
