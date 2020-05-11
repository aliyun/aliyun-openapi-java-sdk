package com.aliyuncs.v5.auth;

public class CredentialsProviderFactory {
    public <T extends AlibabaCloudCredentialsProvider> T createCredentialsProvider(T classInstance) {
        return classInstance;
    }
}
