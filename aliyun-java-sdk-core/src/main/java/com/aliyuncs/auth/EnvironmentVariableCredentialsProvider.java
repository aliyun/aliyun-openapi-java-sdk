package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import com.aliyuncs.utils.EnvHelper;

public class EnvironmentVariableCredentialsProvider implements AlibabaCloudCredentialsProvider {
    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException {
        if (!"default".equals(AuthUtils.getClientType())) {
            return null;
        }

        String accessKeyId = EnvHelper.getenv("ALIBABA_CLOUD_ACCESS_KEY_ID");
        String accessKeySecret = EnvHelper.getenv("ALIBABA_CLOUD_ACCESS_KEY_SECRET");

        if (accessKeyId == null || accessKeySecret == null) {
            return null;
        }
        if (accessKeyId.length() == 0) {
            throw new ClientException("Environment variable accessKeyId cannot be empty");
        }
        if (accessKeySecret.length() == 0) {
            throw new ClientException("Environment variable accessKeySecret cannot be empty");
        }
        return new BasicCredentials(accessKeyId, accessKeySecret);
    }
}
