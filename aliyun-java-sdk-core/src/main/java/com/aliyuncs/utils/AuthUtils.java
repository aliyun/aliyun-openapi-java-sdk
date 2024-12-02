package com.aliyuncs.utils;

import java.io.FileInputStream;
import java.io.IOException;

public class AuthUtils {
    private static volatile String clientType = System.getenv("ALIBABA_CLOUD_PROFILE");
    private static volatile String environmentAccessKeyId;
    private static volatile String environmentAccesskeySecret;
    private static volatile String environmentSecurityToken;
    private static volatile String environmentECSMetaData;
    private static volatile Boolean disableECSIMDSv1;
    private static volatile String environmentCredentialsFile;
    private static volatile String environmentRoleArn;
    private static volatile String environmentRoleSessionName;
    private static volatile String environmentOIDCProviderArn;
    private static volatile String environmentOIDCTokenFilePath;
    private static volatile String privateKey;
    private static volatile String OIDCToken;
    private static volatile Boolean disableCLIProfile;
    private static volatile Boolean disableECSMetaData;
    private static volatile String environmentCredentialsURI;
    private static volatile Boolean enableVpcEndpoint;
    private static volatile String environmentSTSRegion;


    public static String readFile(String filePath) {
        FileInputStream in = null;
        byte[] buffer;
        try {
            in = new FileInputStream(filePath);
            buffer = new byte[in.available()];
            in.read(buffer);
            return new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Deprecated
    public static String getPrivateKey(String filePath) {
        return readFile(filePath);
    }

    @Deprecated
    public static void setPrivateKey(String key) {
    }

    public static String getClientType() {
        if (null == clientType) {
            AuthUtils.clientType = "default";
        }
        return AuthUtils.clientType;
    }

    public static void setClientType(String clientType) {
        AuthUtils.clientType = clientType;
    }

    public static String getEnvironmentAccessKeyId() {
        if (null == AuthUtils.environmentAccessKeyId) {
            return System.getenv("ALIBABA_CLOUD_ACCESS_KEY_ID");
        } else {
            return AuthUtils.environmentAccessKeyId;
        }
    }

    public static void setEnvironmentAccessKeyId(String environmentAccessKeyId) {
        AuthUtils.environmentAccessKeyId = environmentAccessKeyId;
    }

    public static String getEnvironmentAccessKeySecret() {
        if (null == AuthUtils.environmentAccesskeySecret) {
            return System.getenv("ALIBABA_CLOUD_ACCESS_KEY_SECRET");
        } else {
            return AuthUtils.environmentAccesskeySecret;
        }
    }

    public static void setEnvironmentAccessKeySecret(String environmentAccesskeySecret) {
        AuthUtils.environmentAccesskeySecret = environmentAccesskeySecret;
    }

    public static String getEnvironmentSecurityToken() {
        return null == AuthUtils.environmentSecurityToken ?
                System.getenv("ALIBABA_CLOUD_SECURITY_TOKEN")
                : AuthUtils.environmentSecurityToken;
    }

    public static void setEnvironmentSecurityToken(String environmentSecurityToken) {
        AuthUtils.environmentSecurityToken = environmentSecurityToken;
    }

    public static String getEnvironmentECSMetaData() {
        if (null == AuthUtils.environmentECSMetaData) {
            return System.getenv("ALIBABA_CLOUD_ECS_METADATA");
        } else {
            return AuthUtils.environmentECSMetaData;
        }
    }

    public static void setEnvironmentECSMetaData(String environmentECSMetaData) {
        AuthUtils.environmentECSMetaData = environmentECSMetaData;
    }

    public static String getEnvironmentCredentialsFile() {
        if (null == AuthUtils.environmentCredentialsFile) {
            return System.getenv("ALIBABA_CLOUD_CREDENTIALS_FILE");
        } else {
            return AuthUtils.environmentCredentialsFile;
        }
    }

    public static void setEnvironmentCredentialsFile(String environmentCredentialsFile) {
        AuthUtils.environmentCredentialsFile = environmentCredentialsFile;
    }

    public static void disableECSIMDSv1(boolean disableECSIMDSv1) {
        AuthUtils.disableECSIMDSv1 = disableECSIMDSv1;
    }

    public static boolean getDisableECSIMDSv1() {
        if (null != AuthUtils.disableECSIMDSv1) {
            return AuthUtils.disableECSIMDSv1;
        } else if (null != System.getenv("ALIBABA_CLOUD_IMDSV1_DISABLED")) {
            return Boolean.parseBoolean(System.getenv("ALIBABA_CLOUD_IMDSV1_DISABLED"));
        }
        return false;
    }

    public static void setEnvironmentRoleArn(String environmentRoleArn) {
        AuthUtils.environmentRoleArn = environmentRoleArn;
    }

    public static String getEnvironmentRoleArn() {
        return null == AuthUtils.environmentRoleArn ?
                System.getenv("ALIBABA_CLOUD_ROLE_ARN")
                : AuthUtils.environmentRoleArn;
    }

    public static void setEnvironmentRoleSessionName(String environmentRoleSessionName) {
        AuthUtils.environmentRoleSessionName = environmentRoleSessionName;
    }

    public static String getEnvironmentRoleSessionName() {
        return null == AuthUtils.environmentRoleSessionName ?
                System.getenv("ALIBABA_CLOUD_ROLE_SESSION_NAME")
                : AuthUtils.environmentRoleSessionName;
    }

    public static void setEnvironmentOIDCProviderArn(String environmentOIDCProviderArn) {
        AuthUtils.environmentOIDCProviderArn = environmentOIDCProviderArn;
    }

    public static String getEnvironmentOIDCProviderArn() {
        return null == AuthUtils.environmentOIDCProviderArn ?
                System.getenv("ALIBABA_CLOUD_OIDC_PROVIDER_ARN")
                : AuthUtils.environmentOIDCProviderArn;
    }

    public static void setEnvironmentOIDCTokenFilePath(String environmentOIDCTokenFilePath) {
        AuthUtils.environmentOIDCTokenFilePath = environmentOIDCTokenFilePath;
    }

    public static String getEnvironmentOIDCTokenFilePath() {
        return null == AuthUtils.environmentOIDCTokenFilePath ?
                System.getenv("ALIBABA_CLOUD_OIDC_TOKEN_FILE")
                : AuthUtils.environmentOIDCTokenFilePath;
    }

    public static boolean environmentEnableOIDC() {
        return !StringUtils.isEmpty(getEnvironmentRoleArn())
                && !StringUtils.isEmpty(getEnvironmentOIDCProviderArn())
                && !StringUtils.isEmpty(getEnvironmentOIDCTokenFilePath());
    }

    public static void disableCLIProfile(boolean disableCLIProfile) {
        AuthUtils.disableCLIProfile = disableCLIProfile;
    }

    public static boolean isDisableCLIProfile() {
        if (null != AuthUtils.disableCLIProfile) {
            return AuthUtils.disableCLIProfile;
        } else if (null != System.getenv("ALIBABA_CLOUD_CLI_PROFILE_DISABLED")) {
            return Boolean.parseBoolean(System.getenv("ALIBABA_CLOUD_CLI_PROFILE_DISABLED"));
        }
        return false;
    }

    public static void disableECSMetaData(boolean disableECSMetaData) {
        AuthUtils.disableECSMetaData = disableECSMetaData;
    }

    public static boolean isDisableECSMetaData() {
        if (null != AuthUtils.disableECSMetaData) {
            return AuthUtils.disableECSMetaData;
        } else if (null != System.getenv("ALIBABA_CLOUD_ECS_METADATA_DISABLED")) {
            return Boolean.parseBoolean(System.getenv("ALIBABA_CLOUD_ECS_METADATA_DISABLED"));
        }
        return false;
    }

    public static void setEnvironmentCredentialsURI(String environmentCredentialsURI) {
        AuthUtils.environmentCredentialsURI = environmentCredentialsURI;
    }

    public static String getEnvironmentCredentialsURI() {
        return null == AuthUtils.environmentCredentialsURI ?
                System.getenv("ALIBABA_CLOUD_CREDENTIALS_URI")
                : AuthUtils.environmentCredentialsURI;
    }

    public static void enableVpcEndpoint(boolean enableVpcEndpoint) {
        AuthUtils.enableVpcEndpoint = enableVpcEndpoint;
    }

    public static boolean isEnableVpcEndpoint() {
        if (null != AuthUtils.enableVpcEndpoint) {
            return AuthUtils.enableVpcEndpoint;
        } else if (null != System.getenv("ALIBABA_CLOUD_VPC_ENDPOINT_ENABLED")) {
            return Boolean.parseBoolean(System.getenv("ALIBABA_CLOUD_VPC_ENDPOINT_ENABLED"));
        }
        return false;
    }

    public static void setEnvironmentSTSRegion(String environmentSTSRegion) {
        AuthUtils.environmentSTSRegion = environmentSTSRegion;
    }

    public static String getEnvironmentSTSRegion() {
        return null == AuthUtils.environmentSTSRegion ?
                System.getenv("ALIBABA_CLOUD_STS_REGION")
                : AuthUtils.environmentSTSRegion;
    }
}
