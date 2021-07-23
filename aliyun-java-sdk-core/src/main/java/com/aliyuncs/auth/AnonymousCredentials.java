package com.aliyuncs.auth;

public class AnonymousCredentials implements AlibabaCloudCredentials {

    @Override
    public String getAccessKeyId() {
        return null;
    }

    @Override
    public String getAccessKeySecret() {
        return null;
    }
}
