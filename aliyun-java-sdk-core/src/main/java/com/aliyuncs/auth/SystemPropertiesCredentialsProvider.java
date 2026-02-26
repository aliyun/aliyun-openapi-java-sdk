package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import com.aliyuncs.utils.StringUtils;


public class SystemPropertiesCredentialsProvider implements AlibabaCloudCredentialsProvider {
    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException {
        if (!"default".equals(AuthUtils.getClientType())) {
            return null;
        }

        String accessKeyId = System.getProperty(AuthConstant.SYSTEM_ACCESSKEYID);
        String accessKeySecret = System.getProperty(AuthConstant.SYSTEM_ACCESSKEY_SECRET);
        if (!StringUtils.isEmpty(System.getProperty(AuthConstant.SYSTEM_ACCESSKEYSECRET))) {
            accessKeySecret = System.getProperty(AuthConstant.SYSTEM_ACCESSKEYSECRET);
        }
        String securityToken = System.getProperty(AuthConstant.SYSTEM_SESSION_TOKEN);
        if (StringUtils.isEmpty(accessKeyId)) {
            throw new ClientException("System property alibabacloud.accessKeyId cannot be empty.");
        }
        if (StringUtils.isEmpty(accessKeySecret)) {
            throw new ClientException("System property alibabacloud.accessKeySecret cannot be empty.");
        }
        if (!StringUtils.isEmpty(securityToken)) {
            return new BasicSessionCredentials(accessKeyId, accessKeySecret, securityToken);
        }

        return new BasicCredentials(accessKeyId, accessKeySecret);
    }
}
