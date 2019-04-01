package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import com.aliyuncs.utils.StringUtils;
import org.ini4j.Profile;
import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProfileCredentialsProvider implements AlibabaCloudCredentialsProvider {
    private static volatile Wini ini;

    private static Wini getIni(String filePath) throws IOException {
        if (null == ini) {
            synchronized (ProfileCredentialsProvider.class) {
                if (null == ini) {
                    ini = new Wini(new File(filePath));
                }
            }
        }
        return ini;
    }

    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException {
        String filePath = AuthUtils.getEnvironmentCredentialsFile();
        if (filePath == null) {
            filePath = AuthConstant.DEFAULT_CREDENTIALS_FILE_PATH;
        }
        if (filePath.length() == 0) {
            throw new ClientException("The specified credentials file is empty");
        }
        Wini ini;
        try {
            ini = getIni(filePath);
        } catch (IOException e) {
            return null;
        }
        Map<String, Map<String, String>> client = loadIni(ini);
        Map<String, String> clientConfig = client.get(AuthUtils.getClientType());
        if (clientConfig == null) {
            throw new ClientException("Client is not open in the specified credentials file");
        }
        CredentialsProviderFactory credentialsProviderFactory = new CredentialsProviderFactory();
        return createCredential(clientConfig, credentialsProviderFactory);
    }

    private Map<String, Map<String, String>> loadIni(Wini ini) {
        Map<String, Map<String, String>> client = new HashMap<String, Map<String, String>>();
        boolean enable;
        for (Map.Entry<String, Profile.Section> clientType : ini.entrySet()) {
            enable = clientType.getValue().get(AuthConstant.INI_ENABLE, boolean.class);
            if (enable) {
                Map<String, String> clientConfig = new HashMap<String, String>();
                for (Map.Entry<String, String> enabledClient : clientType.getValue().entrySet()) {
                    clientConfig.put(enabledClient.getKey(), enabledClient.getValue());
                }
                client.put(clientType.getKey(), clientConfig);
            }
        }
        return client;
    }

    private AlibabaCloudCredentials createCredential(Map<String, String> clientConfig,
                                                     CredentialsProviderFactory factory) throws ClientException {
        String configType = clientConfig.get(AuthConstant.INI_TYPE);
        if (StringUtils.isEmpty(configType)) {
            throw new ClientException("The configured client type is empty");
        }
        if (AuthConstant.INI_TYPE_ARN.equals(configType)) {
            return getSTSAssumeRoleSessionCredentials(clientConfig, factory);
        }
        if (AuthConstant.INI_TYPE_KEY_PAIR.equals(configType)) {
            return getSTSGetSessionAccessKeyCredentials(clientConfig, factory);
        }
        if (AuthConstant.INI_TYPE_RAM.equals(configType)) {
            return getInstanceProfileCredentials(clientConfig, factory);
        }
        String accessKeyId = clientConfig.get(AuthConstant.INI_ACCESS_KEY_ID);
        String accessKeySecret = clientConfig.get(AuthConstant.INI_ACCESS_KEY_IDSECRET);
        if (StringUtils.isEmpty(accessKeyId) || StringUtils.isEmpty(accessKeySecret)) {
            return null;
        }
        return new BasicCredentials(accessKeyId, accessKeySecret);
    }

    private AlibabaCloudCredentials getSTSAssumeRoleSessionCredentials(Map<String, String> clientConfig,
                                                                       CredentialsProviderFactory factory)
            throws ClientException {
        String accessKeyId = clientConfig.get(AuthConstant.INI_ACCESS_KEY_ID);
        String accessKeySecret = clientConfig.get(AuthConstant.INI_ACCESS_KEY_IDSECRET);
        String roleSessionName = clientConfig.get(AuthConstant.INI_ROLE_SESSION_NAME);
        String roleArn = clientConfig.get(AuthConstant.INI_ROLE_ARN);
        String regionId = clientConfig.get(AuthConstant.DEFAULT_REGION);
        String policy = clientConfig.get(AuthConstant.INI_POLICY);
        if (StringUtils.isEmpty(accessKeyId) || StringUtils.isEmpty(accessKeySecret)) {
            throw new ClientException("The configured access_key_id or access_key_secret is empty");
        }
        if (StringUtils.isEmpty(roleSessionName) || StringUtils.isEmpty(roleArn)) {
            throw new ClientException("The configured role_session_name or role_arn is empty");
        }
        STSAssumeRoleSessionCredentialsProvider provider =
                factory.createCredentialsProvider(new STSAssumeRoleSessionCredentialsProvider(accessKeyId,
                        accessKeySecret, roleSessionName, roleArn, regionId, policy));
        return provider.getCredentials();
    }

    private AlibabaCloudCredentials getSTSGetSessionAccessKeyCredentials(Map<String, String> clientConfig,
                                                                         CredentialsProviderFactory factory)
            throws ClientException {
        String publicKeyId = clientConfig.get(AuthConstant.INI_PUBLIC_KEY_ID);
        String privateKeyFile = clientConfig.get(AuthConstant.INI_PRIVATE_KEY_FILE);
        if (StringUtils.isEmpty(privateKeyFile)) {
            throw new ClientException("The configured private_key_file is empty");
        }
        String privateKey = AuthUtils.getPrivateKey(privateKeyFile);
        if (StringUtils.isEmpty(publicKeyId) || StringUtils.isEmpty(privateKey)) {
            throw new ClientException("The configured public_key_id or private_key_file content is empty");
        }
        STSGetSessionAccessKeyCredentialsProvider provider =
                factory.createCredentialsProvider(new STSGetSessionAccessKeyCredentialsProvider(publicKeyId, privateKey));
        return provider.getCredentials();
    }

    private AlibabaCloudCredentials getInstanceProfileCredentials(Map<String, String> clientConfig,
                                                                  CredentialsProviderFactory factory)
            throws ClientException {
        String roleName = clientConfig.get(AuthConstant.INI_ROLE_NAME);
        if (StringUtils.isEmpty(roleName)) {
            throw new ClientException("The configured role_name is empty");
        }
        InstanceProfileCredentialsProvider provider =
                factory.createCredentialsProvider(new InstanceProfileCredentialsProvider(roleName));
        return provider.getCredentials();
    }


}
