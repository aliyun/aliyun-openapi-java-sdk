package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import com.aliyuncs.utils.StringUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CLIProfileCredentialsProvider implements AlibabaCloudCredentialsProvider {
    private final String CLI_CREDENTIALS_CONFIG_PATH = System.getProperty("user.home") +
            "/.aliyun/config.json";
    private volatile AlibabaCloudCredentialsProvider credentialsProvider;
    private volatile String currentProfileName;
    private final Object credentialsProviderLock = new Object();

    private CLIProfileCredentialsProvider(Builder builder) {
        this.currentProfileName = builder.profileName == null ? System.getenv("ALIBABA_CLOUD_PROFILE") : builder.profileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public AlibabaCloudCredentials getCredentials() throws ClientException {
        if (AuthUtils.isDisableCLIProfile()) {
            throw new ClientException("CLI credentials file is disabled.");
        }
        Config config = null;
        try {
            config = parseProfile(CLI_CREDENTIALS_CONFIG_PATH);
        } catch (IOException e) {
            throw new ClientException("Unable to get profile from CLI credentials file: " + e);
        }
        if (null == config) {
            throw new ClientException("Unable to get profile from empty CLI credentials file.");
        }
        String refreshedProfileName = System.getenv("ALIBABA_CLOUD_PROFILE");
        if (shouldReloadCredentialsProvider(refreshedProfileName)) {
            synchronized (credentialsProviderLock) {
                if (shouldReloadCredentialsProvider(refreshedProfileName)) {
                    if (!StringUtils.isEmpty(refreshedProfileName)) {
                        this.currentProfileName = refreshedProfileName;
                    }
                    this.credentialsProvider = reloadCredentialsProvider(config, this.currentProfileName);
                }
            }
        }
        return this.credentialsProvider.getCredentials();
    }

    AlibabaCloudCredentialsProvider reloadCredentialsProvider(Config config, String profileName) throws ClientException {
        String currentProfileName = !StringUtils.isEmpty(profileName) ? profileName : config.getCurrent();
        List<Profile> profiles = config.getProfiles();
        if (profiles != null && !profiles.isEmpty()) {
            for (Profile profile : profiles) {
                if (!StringUtils.isEmpty(profile.getName()) && profile.getName().equals(currentProfileName)) {
                    String mode = profile.getMode();

                    if ("AK".equals(mode)) {
                        return new StaticCredentialsProvider(
                                new BasicCredentials(profile.getAccessKeyId(), profile.getAccessKeySecret()));
                    } else if ("StsToken".equals(mode)) {
                        return new StaticCredentialsProvider(
                                new BasicSessionCredentials(profile.getAccessKeyId(), profile.getAccessKeySecret(), profile.getSecurityToken()));
                    } else if ("RamRoleArn".equals(mode)) {
                        AlibabaCloudCredentialsProvider innerProvider = new StaticCredentialsProvider(
                                new BasicCredentials(profile.getAccessKeyId(), profile.getAccessKeySecret()));
                        return STSAssumeRoleSessionCredentialsProvider.builder()
                                .credentialsProvider(innerProvider)
                                .durationSeconds(profile.getDurationSeconds())
                                .roleArn(profile.getRoleArn())
                                .roleSessionName(profile.getRoleSessionName())
                                .stsRegionId(profile.getStsRegionId())
                                .enableVpc(profile.getEnableVpc())
                                .policy(profile.getPolicy())
                                .externalId(profile.getExternalId())
                                .build();
                    } else if ("EcsRamRole".equals(mode)) {
                        return InstanceProfileCredentialsProvider.builder()
                                .roleName(profile.getRamRoleName())
                                .build();
                    } else if ("OIDC".equals(mode)) {
                        return OIDCCredentialsProvider.builder()
                                .durationSeconds(profile.getDurationSeconds())
                                .roleArn(profile.getRoleArn())
                                .roleSessionName(profile.getRoleSessionName())
                                .oidcProviderArn(profile.getOidcProviderArn())
                                .oidcTokenFilePath(profile.getOidcTokenFile())
                                .stsRegionId(profile.getStsRegionId())
                                .enableVpc(profile.getEnableVpc())
                                .policy(profile.getPolicy())
                                .build();
                    } else if ("ChainableRamRoleArn".equals(mode)) {
                        AlibabaCloudCredentialsProvider previousProvider = reloadCredentialsProvider(config, profile.getSourceProfile());
                        return STSAssumeRoleSessionCredentialsProvider.builder()
                                .credentialsProvider(previousProvider)
                                .durationSeconds(profile.getDurationSeconds())
                                .roleArn(profile.getRoleArn())
                                .roleSessionName(profile.getRoleSessionName())
                                .stsRegionId(profile.getStsRegionId())
                                .enableVpc(profile.getEnableVpc())
                                .policy(profile.getPolicy())
                                .externalId(profile.getExternalId())
                                .build();
                    } else {
                        throw new ClientException(String.format("Unsupported profile mode '%s' form CLI credentials file.", mode));
                    }
                }
            }
        }
        throw new ClientException(String.format("Unable to get profile with '%s' form CLI credentials file.", currentProfileName));
    }

    Config parseProfile(String configFilePath) throws ClientException, IOException {
        File configFile = new File(configFilePath);
        if (!configFile.exists() || !configFile.isFile() || !configFile.canRead()) {
            throw new ClientException(String.format("Unable to open credentials file: %s.", configFile.getAbsolutePath()));
        }
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(configFile));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            String jsonContent = sb.toString();
            return gson.fromJson(jsonContent, Config.class);
        } catch (Exception e) {
            throw new ClientException(String.format("Failed to parse credential form CLI credentials file: %s.", configFile.getAbsolutePath()));
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }

    boolean shouldReloadCredentialsProvider(String profileName) {
        return this.credentialsProvider == null || (!StringUtils.isEmpty(this.currentProfileName) && !StringUtils.isEmpty(profileName) && !this.currentProfileName.equals(profileName));
    }

    String getProfileName() {
        return this.currentProfileName;
    }

    static final class Builder {
        private String profileName;

        public Builder profileName(String profileName) {
            this.profileName = profileName;
            return this;
        }

        CLIProfileCredentialsProvider build() {
            return new CLIProfileCredentialsProvider(this);
        }
    }

    static class Config {
        @SerializedName("current")
        private String current;
        @SerializedName("profiles")
        private List<Profile> profiles;

        public String getCurrent() {
            return current;
        }

        public List<Profile> getProfiles() {
            return profiles;
        }
    }

    static class Profile {
        @SerializedName("name")
        private String name;
        @SerializedName("mode")
        private String mode;
        @SerializedName("access_key_id")
        private String accessKeyId;
        @SerializedName("access_key_secret")
        private String accessKeySecret;
        @SerializedName("sts_token")
        private String securityToken;
        @SerializedName("ram_role_arn")
        private String roleArn;
        @SerializedName("ram_session_name")
        private String roleSessionName;
        @SerializedName("expired_seconds")
        private Integer durationSeconds;
        @SerializedName("sts_region")
        private String stsRegionId;
        @SerializedName("enable_vpc")
        private Boolean enableVpc;
        @SerializedName("ram_role_name")
        private String ramRoleName;
        @SerializedName("oidc_token_file")
        private String oidcTokenFile;
        @SerializedName("oidc_provider_arn")
        private String oidcProviderArn;
        @SerializedName("source_profile")
        private String sourceProfile;
        @SerializedName("policy")
        private String policy;
        @SerializedName("external_id")
        private String externalId;

        public String getName() {
            return name;
        }

        public String getMode() {
            return mode;
        }

        public String getAccessKeyId() {
            return accessKeyId;
        }

        public String getAccessKeySecret() {
            return accessKeySecret;
        }

        public String getSecurityToken() {
            return securityToken;
        }

        public String getRoleArn() {
            return roleArn;
        }

        public String getRoleSessionName() {
            return roleSessionName;
        }

        public Integer getDurationSeconds() {
            return durationSeconds;
        }

        public String getStsRegionId() {
            return stsRegionId;
        }

        public Boolean getEnableVpc() {
            return enableVpc;
        }

        public String getRamRoleName() {
            return ramRoleName;
        }

        public String getOidcTokenFile() {
            return oidcTokenFile;
        }

        public String getOidcProviderArn() {
            return oidcProviderArn;
        }

        public String getSourceProfile() {
            return sourceProfile;
        }

        public String getPolicy() {
            return policy;
        }

        public String getExternalId() {
            return externalId;
        }
    }
}
