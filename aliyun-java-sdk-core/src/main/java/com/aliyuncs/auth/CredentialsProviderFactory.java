package com.aliyuncs.auth;

@Deprecated
public class CredentialsProviderFactory {
    public <T extends AlibabaCloudCredentialsProvider> T createCredentialsProvider(T classInstance) {
        return classInstance;
    }
}
