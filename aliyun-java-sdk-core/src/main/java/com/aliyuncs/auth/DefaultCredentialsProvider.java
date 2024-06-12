package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.StringUtils;
import com.aliyuncs.utils.EnvHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DefaultCredentialsProvider implements AlibabaCloudCredentialsProvider {
    private List<AlibabaCloudCredentialsProvider> defaultProviders = new ArrayList<AlibabaCloudCredentialsProvider>();
    private static final List<AlibabaCloudCredentialsProvider> USER_CONFIGURATION_PROVIDERS =
            new Vector<AlibabaCloudCredentialsProvider>();

    public DefaultCredentialsProvider() throws ClientException {
        defaultProviders.add(new SystemPropertiesCredentialsProvider());
        defaultProviders.add(new EnvironmentVariableCredentialsProvider());
        // Add oidc credentials provider
        String oidcProviderArn = System.getenv("ALIBABA_CLOUD_OIDC_PROVIDER_ARN");
        String roleArn = System.getenv("ALIBABA_CLOUD_ROLE_ARN");
        String oidcTokenFile = System.getenv("ALIBABA_CLOUD_OIDC_TOKEN_FILE");
        if (!StringUtils.isEmpty(oidcProviderArn) && !StringUtils.isEmpty(oidcTokenFile) && !StringUtils.isEmpty(roleArn)) {
            defaultProviders.add(new OIDCCredentialsProvider(roleArn, oidcProviderArn, oidcTokenFile, "java-sdk-v1-default-rsn", null));
        }

        defaultProviders.add(new ProfileCredentialsProvider());
        String roleName = EnvHelper.getenv("ALIBABA_CLOUD_ECS_METADATA");
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
        if (USER_CONFIGURATION_PROVIDERS.size() > 0) {
            for (AlibabaCloudCredentialsProvider provider : USER_CONFIGURATION_PROVIDERS) {
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
        return DefaultCredentialsProvider.USER_CONFIGURATION_PROVIDERS.add(provider);
    }

    public static boolean removeCredentialsProvider(AlibabaCloudCredentialsProvider provider) {
        return DefaultCredentialsProvider.USER_CONFIGURATION_PROVIDERS.remove(provider);
    }

    public static boolean containsCredentialsProvider(AlibabaCloudCredentialsProvider provider) {
        return DefaultCredentialsProvider.USER_CONFIGURATION_PROVIDERS.contains(provider);
    }

    public static void clearCredentialsProvider() {
        DefaultCredentialsProvider.USER_CONFIGURATION_PROVIDERS.clear();
    }
}
