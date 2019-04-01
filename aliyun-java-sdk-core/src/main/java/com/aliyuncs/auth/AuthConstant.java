package com.aliyuncs.auth;

public class AuthConstant {
    public static final String SYSTEM_ACCESSKEYID = "alibabacloud.accessKeyId";
    public static final String SYSTEM_ACCESSKEYSECRET = "alibabacloud.accessKeyIdSecret";

    public static final String DEFAULT_CREDENTIALS_FILE_PATH = System.getProperty("user.home") +
            "/.alibabacloud/credentials.ini";
    public static final String INI_ACCESS_KEY_ID = "access_key_id";
    public static final String INI_ACCESS_KEY_IDSECRET = "access_key_secret";
    public static final String INI_TYPE = "type";
    public static final String INI_TYPE_RAM = "ecs_ram_role";
    public static final String INI_TYPE_ARN = "ram_role_arn";
    public static final String INI_TYPE_KEY_PAIR = "rsa_key_pair";
    public static final String INI_PUBLIC_KEY_ID = "public_key_id";
    public static final String INI_PRIVATE_KEY_FILE = "private_key_file";
    public static final String INI_PRIVATE_KEY = "private_key";
    public static final String INI_ROLE_NAME = "role_name";
    public static final String INI_ROLE_SESSION_NAME = "role_session_name";
    public static final String INI_ROLE_ARN = "role_arn";
    public static final String INI_POLICY = "policy";
    public static final long TSC_VALID_TIME_SECONDS = 3600L;
    public static final String DEFAULT_REGION = "region_id";
    public static final String INI_ENABLE = "enable";

}
