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
    private final String filePath;
    private volatile Wini ini;
    private AlibabaCloudCredentialsProvider innerProvider;

    private Wini getIni(String filePath) throws IOException {
        if (null == ini) {
            synchronized (this) {
                if (null == ini) {
                    ini = new Wini(new File(filePath));
                }
            }
        }
        return ini;
    }

    // 本包可见
    ProfileCredentialsProvider(String filePath) {
        if (StringUtils.isEmpty(filePath)) {
            filePath = AuthConstant.DEFAULT_CREDENTIALS_FILE_PATH;
        }
        this.filePath = filePath;
    }

    public ProfileCredentialsProvider() {
        this(AuthUtils.getEnvironmentCredentialsFile());
    }

    private AlibabaCloudCredentialsProvider getCredentialsProvider(Map<String, String> clientConfig) throws ClientException {
        if (clientConfig == null) {
            throw new ClientException("Client is not open in the specified credentials file");
        }

        String configType = clientConfig.get(AuthConstant.INI_TYPE);
        if (StringUtils.isEmpty(configType)) {
            throw new ClientException("The configured client type is empty");
        }
        if (AuthConstant.INI_TYPE_ARN.equals(configType)) {
            return getSTSAssumeRoleSessionCredentialsProvider(clientConfig);
        }
        if (AuthConstant.INI_TYPE_KEY_PAIR.equals(configType)) {
            return getSTSGetSessionAccessKeyCredentialsProvider(clientConfig);
        }
        if (AuthConstant.INI_TYPE_RAM.equals(configType)) {
            return getInstanceProfileCredentialsProvider(clientConfig);
        }
        if (AuthConstant.INI_TYPE_ACESS_KEY.equals(configType)) {
            return getStaticCredentialsProvider(clientConfig);
        }

        throw new ClientException(String.format("The configured client type %s is not supported", configType));
    }

    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException {
        // lazy load it
        if (this.innerProvider == null) {
            Wini ini;
            try {
                ini = getIni(filePath);
            } catch (IOException e) {
                throw new ClientException("Client is not open in the specified credentials file");
            }
            Map<String, Map<String, String>> client = loadIni(ini);
            Map<String, String> clientConfig = client.get(AuthUtils.getClientType());
            this.innerProvider = getCredentialsProvider(clientConfig);
        }
        return this.innerProvider.getCredentials();
    }

    private static Map<String, Map<String, String>> loadIni(Wini ini) {
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

    private static AlibabaCloudCredentialsProvider getSTSAssumeRoleSessionCredentialsProvider(Map<String, String> clientConfig)
            throws ClientException {
        String accessKeyId = clientConfig.get(AuthConstant.INI_ACCESS_KEY_ID);
        if (StringUtils.isEmpty(accessKeyId)) {
            throw new ClientException("The configured access_key_id is empty");
        }
        String accessKeySecret = clientConfig.get(AuthConstant.INI_ACCESS_KEY_IDSECRET);
        if (StringUtils.isEmpty(accessKeySecret)) {
            throw new ClientException("The configured access_key_secret is empty");
        }
        String roleSessionName = clientConfig.get(AuthConstant.INI_ROLE_SESSION_NAME);
        if (StringUtils.isEmpty(roleSessionName)) {
            throw new ClientException("The configured role_session_name is empty");
        }
        String roleArn = clientConfig.get(AuthConstant.INI_ROLE_ARN);
        if (StringUtils.isEmpty(roleArn)) {
            throw new ClientException("The configured role_arn is empty");
        }
        String regionId = clientConfig.get(AuthConstant.DEFAULT_REGION);
        String policy = clientConfig.get(AuthConstant.INI_POLICY);

        return new STSAssumeRoleSessionCredentialsProvider(accessKeyId, accessKeySecret, roleSessionName, roleArn, regionId, policy);
    }

    private static AlibabaCloudCredentialsProvider getSTSGetSessionAccessKeyCredentialsProvider(Map<String, String> clientConfig)
            throws ClientException {
        String publicKeyId = clientConfig.get(AuthConstant.INI_PUBLIC_KEY_ID);
        if (StringUtils.isEmpty(publicKeyId)) {
            throw new ClientException("The configured public_key_id is empty");
        }
        String privateKeyFile = clientConfig.get(AuthConstant.INI_PRIVATE_KEY_FILE);
        if (StringUtils.isEmpty(privateKeyFile)) {
            throw new ClientException("The configured private_key_file is empty");
        }
        String privateKey = AuthUtils.readFile(privateKeyFile);
        if (StringUtils.isEmpty(privateKey)) {
            throw new ClientException("The configured private_key_file content is empty");
        }

        return new STSGetSessionAccessKeyCredentialsProvider(publicKeyId, privateKey);
    }

    private static AlibabaCloudCredentialsProvider getInstanceProfileCredentialsProvider(Map<String, String> clientConfig) throws ClientException {
        String roleName = clientConfig.get(AuthConstant.INI_ROLE_NAME);
        if (StringUtils.isEmpty(roleName)) {
            throw new ClientException("The configured role_name is empty");
        }

        return new InstanceProfileCredentialsProvider(roleName);
    }

    private static AlibabaCloudCredentialsProvider getStaticCredentialsProvider(Map<String, String> clientConfig) throws ClientException {
        String accessKeyId = clientConfig.get(AuthConstant.INI_ACCESS_KEY_ID);
        if (StringUtils.isEmpty(accessKeyId)) {
            throw new ClientException("The configured access_key_id is empty");
        }
        String accessKeySecret = clientConfig.get(AuthConstant.INI_ACCESS_KEY_IDSECRET);
        if (StringUtils.isEmpty(accessKeySecret)) {
            throw new ClientException("The configured access_key_secret is empty");
        }

        return new StaticCredentialsProvider(new BasicCredentials(accessKeyId, accessKeySecret));
    }
}
