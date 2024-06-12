package com.aliyuncs.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AuthUtils {
    private static volatile String clientType = EnvHelper.getenv("ALIBABA_CLOUD_PROFILE");
    private static volatile String privateKey;

    public static String getPrivateKey(String filePath) {
        if (null == privateKey) {
            synchronized (AuthUtils.class) {
                if (null == privateKey) {
                    privateKey = readFileContent(filePath);
                }
            }
        }
        return privateKey;
    }

    public static String readFileContent(String filePath) {
        FileInputStream in = null;
        byte[] buffer;
        try {
            in = new FileInputStream(new File(filePath));
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

    public static void setPrivateKey(String key) {
        privateKey = key;
    }

    public static String getClientType() {
        if (null == clientType) {
            AuthUtils.clientType = "default";
            return AuthUtils.clientType;
        } else {
            return AuthUtils.clientType;
        }
    }

    public static void setClientType(String clientType) {
        AuthUtils.clientType = clientType;
    }
}
