package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DefaultCredentialsProvider implements AlibabaCloudCredentialsProvider {
    private List<AlibabaCloudCredentialsProvider> defaultProviders = new ArrayList<AlibabaCloudCredentialsProvider>();
    private static final List<AlibabaCloudCredentialsProvider> userConfigurationProviders =
            new Vector<AlibabaCloudCredentialsProvider>();

    public DefaultCredentialsProvider() throws ClientException {
        defaultProviders.add(new SystemPropertiesCredentialsProvider());
        defaultProviders.add(new EnvironmentVariableCredentialsProvider());
        defaultProviders.add(new ProfileCredentialsProvider());
        String roleName = AuthUtils.getEnvironmentECSMetaData();
        if (roleName != null) {
            if (roleName.length() == 0) {
                throw new ClientException("Environment variable roleName('ALIBABA_CLOUD_ECS_METADATA') cannot be empty");
            }
            defaultProviders.add(new InstanceProfileCredentialsProvider(roleName));
        }
    }

    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException {
        AlibabaCloudCredentials credential;
        if (userConfigurationProviders.size() > 0) {
            for (AlibabaCloudCredentialsProvider provider : userConfigurationProviders) {
                credential = provider.getCredentials();
                if (null != credential) {
                    return credential;
                }
            }
        }
        for (AlibabaCloudCredentialsProvider provider : defaultProviders) {
            credential = provider.getCredentials();
            if (null != credential) {
                return credential;
            }
        }
        throw new ClientException("not found credentials");
    }

    public static boolean addCredentialsProvider(AlibabaCloudCredentialsProvider provider) {
        return DefaultCredentialsProvider.userConfigurationProviders.add(provider);
    }

    public static boolean removeCredentialsProvider(AlibabaCloudCredentialsProvider provider) {
        return DefaultCredentialsProvider.userConfigurationProviders.remove(provider);
    }

    public static boolean containsCredentialsProvider(AlibabaCloudCredentialsProvider provider) {
        return DefaultCredentialsProvider.userConfigurationProviders.contains(provider);
    }

    public static void clearCredentialsProvider() {
        DefaultCredentialsProvider.userConfigurationProviders.clear();
    }
}
