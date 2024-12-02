package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CLIProfileCredentialsProviderTest {

    @Test
    public void getProfileNameTest() {
        CLIProfileCredentialsProvider provider = CLIProfileCredentialsProvider.builder().build();
        Assert.assertNull(provider.getProfileName());
        provider = CLIProfileCredentialsProvider.builder()
                .profileName("AK")
                .build();
        Assert.assertEquals("AK", provider.getProfileName());
    }

    @Test
    public void shouldReloadCredentialsProviderTest() {
        CLIProfileCredentialsProvider provider = CLIProfileCredentialsProvider.builder().build();
        Assert.assertTrue(provider.shouldReloadCredentialsProvider(""));
    }

    @Test
    public void disableCLIProfileTest() {
        boolean isDisableCLIProfile = AuthUtils.isDisableCLIProfile();
        AuthUtils.disableCLIProfile(true);
        CLIProfileCredentialsProvider provider = CLIProfileCredentialsProvider.builder().build();
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("CLI credentials file is disabled.", e.getMessage());
        }
        AuthUtils.disableCLIProfile(isDisableCLIProfile);
    }

    @Test
    public void parseProfileTest() throws ClientException, IOException {
        CLIProfileCredentialsProvider provider = CLIProfileCredentialsProvider.builder().build();
        try {
            provider.parseProfile("./not_exist_config.json");
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertTrue(e.getMessage().contains("Unable to open credentials file"));
        }
        try {
            String configPath = CLIProfileCredentialsProviderTest.class.getClassLoader().
                    getResource("invalid_cli_config.json").getPath();
            provider.parseProfile(configPath);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertTrue(e.getMessage().contains("Failed to parse credential form CLI credentials file"));
        }

        String configPath = CLIProfileCredentialsProviderTest.class.getClassLoader().
                getResource("empty_file.json").getPath();
        CLIProfileCredentialsProvider.Config config = provider.parseProfile(configPath);
        Assert.assertNull(config);

        configPath = CLIProfileCredentialsProviderTest.class.getClassLoader().
                getResource("mock_empty_cli_config.json").getPath();
        config = provider.parseProfile(configPath);
        Assert.assertNull(config.getCurrent());
        Assert.assertNull(config.getProfiles());

        configPath = CLIProfileCredentialsProviderTest.class.getClassLoader().
                getResource("full_cli_config.json").getPath();
        config = provider.parseProfile(configPath);
        Assert.assertEquals("AK", config.getCurrent());
        Assert.assertEquals(5, config.getProfiles().size());
        Assert.assertEquals("[{\"name\":\"AK\",\"mode\":\"AK\",\"access_key_id\":\"access_key_id\",\"access_key_secret\":\"access_key_secret\"},{\"name\":\"RamRoleArn\",\"mode\":\"RamRoleArn\",\"access_key_id\":\"access_key_id\",\"access_key_secret\":\"access_key_secret\",\"ram_role_arn\":\"ram_role_arn\",\"ram_session_name\":\"ram_session_name\",\"expired_seconds\":3600,\"sts_region\":\"cn-hangzhou\"},{\"name\":\"EcsRamRole\",\"mode\":\"EcsRamRole\",\"ram_role_name\":\"ram_role_name\"},{\"name\":\"OIDC\",\"mode\":\"OIDC\",\"ram_role_arn\":\"ram_role_arn\",\"ram_session_name\":\"ram_session_name\",\"expired_seconds\":3600,\"sts_region\":\"cn-hangzhou\",\"oidc_token_file\":\"path/to/oidc/file\",\"oidc_provider_arn\":\"oidc_provider_arn\"},{\"name\":\"ChainableRamRoleArn\",\"mode\":\"ChainableRamRoleArn\",\"ram_role_arn\":\"ram_role_arn\",\"ram_session_name\":\"ram_session_name\",\"expired_seconds\":3600,\"sts_region\":\"cn-hangzhou\",\"source_profile\":\"AK\"}]", new Gson().toJson(config.getProfiles()));
    }

    @Test
    public void reloadCredentialsProviderTest() throws ClientException, IOException {
        CLIProfileCredentialsProvider provider = CLIProfileCredentialsProvider.builder().build();
        String configPath = CLIProfileCredentialsProviderTest.class.getClassLoader().
                getResource(".aliyun/config.json").getPath();
        CLIProfileCredentialsProvider.Config config = provider.parseProfile(configPath);
        try {
            provider.reloadCredentialsProvider(config, "inexist");
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("Unable to get profile with 'inexist' form CLI credentials file.", e.getMessage());
        }

        AlibabaCloudCredentialsProvider credentialsProvider = provider.reloadCredentialsProvider(config, "AK");
        Assert.assertTrue(credentialsProvider instanceof StaticCredentialsProvider);
        BasicCredentials credential = (BasicCredentials) credentialsProvider.getCredentials();
        Assert.assertEquals("akid", credential.getAccessKeyId());
        Assert.assertEquals("secret", credential.getAccessKeySecret());

        credentialsProvider = provider.reloadCredentialsProvider(config, "RamRoleArn");
        Assert.assertTrue(credentialsProvider instanceof STSAssumeRoleSessionCredentialsProvider);
        try {
            credentialsProvider.getCredentials();
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().contains("InvalidAccessKeyId.NotFound"));
        }

        try {
            provider.reloadCredentialsProvider(config, "Invalid_RamRoleArn");
            Assert.fail();
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Access key ID cannot be null.", e.getMessage());
        }

        credentialsProvider = provider.reloadCredentialsProvider(config, "EcsRamRole");
        Assert.assertTrue(credentialsProvider instanceof InstanceProfileCredentialsProvider);

        credentialsProvider = provider.reloadCredentialsProvider(config, "OIDC");
        Assert.assertTrue(credentialsProvider instanceof OIDCCredentialsProvider);

        credentialsProvider = provider.reloadCredentialsProvider(config, "ChainableRamRoleArn");
        Assert.assertTrue(credentialsProvider instanceof STSAssumeRoleSessionCredentialsProvider);

        try {
            provider.reloadCredentialsProvider(config, "ChainableRamRoleArn2");
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("Unable to get profile with 'InvalidSource' form CLI credentials file.", e.getMessage());
        }

        try {
            provider.reloadCredentialsProvider(config, "Unsupported");
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("Unsupported profile mode 'Unsupported' form CLI credentials file.", e.getMessage());
        }
    }

    @Test
    public void getCredentialsTest() throws ClientException {
        String homePath = System.getProperty("user.home");
        String configPath = CLIProfileCredentialsProviderTest.class.getClassLoader().
                getResource(".aliyun/config.json").getPath();
        System.setProperty("user.home", configPath.replace("/.aliyun/config.json", ""));
        CLIProfileCredentialsProvider provider = CLIProfileCredentialsProvider.builder().build();
        BasicCredentials credential = (BasicCredentials) provider.getCredentials();
        Assert.assertEquals("akid", credential.getAccessKeyId());
        Assert.assertEquals("secret", credential.getAccessKeySecret());

        provider = CLIProfileCredentialsProvider.builder().profileName("inexist").build();
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("Unable to get profile with 'inexist' form CLI credentials file.", e.getMessage());
        }

        provider = CLIProfileCredentialsProvider.builder().profileName("RamRoleArn").build();
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().contains("InvalidAccessKeyId.NotFound"));
        }

        System.setProperty("user.home", homePath);
    }

}
