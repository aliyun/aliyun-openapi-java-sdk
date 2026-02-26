package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import com.aliyuncs.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DefaultCredentialsProvider implements AlibabaCloudCredentialsProvider {
    private List<AlibabaCloudCredentialsProvider> defaultProviders = new ArrayList<AlibabaCloudCredentialsProvider>();
    private static final List<AlibabaCloudCredentialsProvider> USER_CONFIGURATION_PROVIDERS =
            new Vector<AlibabaCloudCredentialsProvider>();
    private volatile AlibabaCloudCredentialsProvider lastUsedCredentialsProvider;
    private final Boolean reuseLastProviderEnabled;

    public DefaultCredentialsProvider() throws ClientException {
        this.reuseLastProviderEnabled = true;
        createDefaultChain();
    }

    private DefaultCredentialsProvider(Builder builder) {
        this.reuseLastProviderEnabled = builder.reuseLastProviderEnabled;
        createDefaultChain();
    }

    public static Builder builder() {
        return new Builder();
    }

    private void createDefaultChain() {
        defaultProviders.add(new SystemPropertiesCredentialsProvider());
        defaultProviders.add(new EnvironmentVariableCredentialsProvider());
        if (AuthUtils.environmentEnableOIDC()) {
            defaultProviders.add(OIDCCredentialsProvider.builder().build());
        }
        defaultProviders.add(CLIProfileCredentialsProvider.builder().build());
        defaultProviders.add(new ProfileCredentialsProvider());
        if (!AuthUtils.isDisableECSMetaData()) {
            defaultProviders.add(InstanceProfileCredentialsProvider.builder().build());
        }
        String uri = AuthUtils.getEnvironmentCredentialsURI();
        if (!StringUtils.isEmpty(uri)) {
            defaultProviders.add(URLCredentialsProvider.builder()
                    .credentialsURI(uri)
                    .build());
        }
    }

    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException {
        if (this.reuseLastProviderEnabled && this.lastUsedCredentialsProvider != null) {
            return this.lastUsedCredentialsProvider.getCredentials();
        }
        AlibabaCloudCredentials credential;
        List<String> errorMessages = new ArrayList<String>();
        if (USER_CONFIGURATION_PROVIDERS.size() > 0) {
            for (AlibabaCloudCredentialsProvider provider : USER_CONFIGURATION_PROVIDERS) {
                try {
                    credential = provider.getCredentials();
                    if (null != credential) {
                        this.lastUsedCredentialsProvider = provider;
                        return credential;
                    }
                } catch (Exception e) {
                    errorMessages.add(provider.getClass().getName() + ": " + e.getMessage());
                }
            }
        }
        for (AlibabaCloudCredentialsProvider provider : defaultProviders) {
            try {
                credential = provider.getCredentials();
                if (null != credential) {
                    this.lastUsedCredentialsProvider = provider;
                    return credential;
                }
            } catch (Exception e) {
                errorMessages.add(provider.getClass().getName() + ": " + e.getMessage());
            }
        }

        throw new ClientException("Unable to load credentials from any of the providers in the chain: " + errorMessages);
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

    public static final class Builder {
        private Boolean reuseLastProviderEnabled = true;

        public Builder reuseLastProviderEnabled(Boolean reuseLastProviderEnabled) {
            this.reuseLastProviderEnabled = reuseLastProviderEnabled;
            return this;
        }

        DefaultCredentialsProvider build() {
            return new DefaultCredentialsProvider(this);
        }
    }
}
