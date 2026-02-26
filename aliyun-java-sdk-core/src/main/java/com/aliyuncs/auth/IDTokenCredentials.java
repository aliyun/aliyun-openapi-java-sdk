package com.aliyuncs.auth;

public class IDTokenCredentials implements AlibabaCloudCredentials {
    private String idToken;

    public IDTokenCredentials(String idToken) {
        this.idToken = idToken;
    }

    @Override
    public String getAccessKeyId() {
        return null;
    }

    @Override
    public String getAccessKeySecret() {
        return null;
    }

    public String getIDToken() {
        return idToken;
    }

    public void setIDToken(String idToken) {
        this.idToken = idToken;
    }
}
