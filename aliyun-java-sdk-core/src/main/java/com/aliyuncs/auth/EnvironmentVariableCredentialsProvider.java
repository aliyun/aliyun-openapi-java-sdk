package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import com.aliyuncs.utils.StringUtils;

public class EnvironmentVariableCredentialsProvider implements AlibabaCloudCredentialsProvider {
    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException {
        if (!"default".equals(AuthUtils.getClientType())) {
            return null;
        }

        String accessKeyId = AuthUtils.getEnvironmentAccessKeyId();
        String accessKeySecret = AuthUtils.getEnvironmentAccessKeySecret();
        String securityToken = AuthUtils.getEnvironmentSecurityToken();
        if (StringUtils.isEmpty(accessKeyId)) {
            throw new ClientException("Environment variable accessKeyId cannot be empty.");
        }
        if (StringUtils.isEmpty(accessKeySecret)) {
            throw new ClientException("Environment variable accessKeySecret cannot be empty.");
        }
        if (!StringUtils.isEmpty(securityToken)) {
            return new BasicSessionCredentials(accessKeyId, accessKeySecret, securityToken);
        }
        return new BasicCredentials(accessKeyId, accessKeySecret);
    }
}
