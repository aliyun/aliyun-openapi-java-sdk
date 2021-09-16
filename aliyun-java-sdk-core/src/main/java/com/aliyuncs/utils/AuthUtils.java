package com.aliyuncs.utils;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.*;


public class AuthUtils {
    private static volatile String clientType = System.getenv("ALIBABA_CLOUD_PROFILE");
    private static volatile String environmentAccessKeyId;
    private static volatile String environmentAccesskeySecret;
    private static volatile String environmentECSMetaData;
    private static volatile String environmentCredentialsFile;
    private static volatile String privateKey;

    public static String getPrivateKey(String filePath) {
        if (null == privateKey) {
            synchronized (AuthUtils.class) {
                if (null == privateKey) {
                    FileInputStream in = null;
                    byte[] buffer;
                    try {
                        in = new FileInputStream(new File(filePath));
                        buffer = new byte[in.available()];
                        in.read(buffer);
                        privateKey = new String(buffer, "UTF-8");
                    } catch (IOException e) {
                        e.printStackTrace();
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
            }
        }
        return privateKey;
    }

    public static String hexEncode(byte[] raw) {
        if (raw == null) {
            return null;
        } else {
            StringBuffer sb = new StringBuffer();

            for(int i = 0; i < raw.length; ++i) {
                String hex = Integer.toHexString(raw[i] & 255);
                if (hex.length() < 2) {
                    sb.append(0);
                }

                sb.append(hex);
            }

            return sb.toString();
        }
    }

    public static Map<String, String> getCanonicalizedHeadersMap(Map<String, String> headers) {
        Map<String, String> result = new HashMap();
        if (headers == null) {
            return result;
        } else {
            String prefix = "x-acs-";
            Set<String> keys = headers.keySet();
            List<String> canonicalizedKeys = new ArrayList();
            Map<String, String> valueMap = new HashMap();
            Iterator var6 = keys.iterator();

            while(true) {
                String key;
                String lowerKey;
                do {
                    if (!var6.hasNext()) {
                        String[] canonicalizedKeysArray = (String[])canonicalizedKeys.toArray(new String[canonicalizedKeys.size()]);
                        key = StringUtils.join(";", Arrays.asList(canonicalizedKeysArray));
                        Arrays.sort(canonicalizedKeysArray);
                        StringBuilder sb = new StringBuilder();

                        for(int i = 0; i < canonicalizedKeysArray.length; ++i) {
                            String key2 = canonicalizedKeysArray[i];
                            sb.append(key2);
                            sb.append(":");
                            sb.append((String)valueMap.get(key2));
                            sb.append("\n");
                        }

                        result.put("canonicalHeaders", sb.toString());
                        result.put("signedHeaders", key);
                        return result;
                    }

                    key = (String)var6.next();
                    lowerKey = key.toLowerCase();
                } while(!lowerKey.startsWith(prefix) && !lowerKey.equals("host") && !lowerKey.equals("content-type"));

                if (!canonicalizedKeys.contains(lowerKey)) {
                    canonicalizedKeys.add(lowerKey);
                }

                valueMap.put(lowerKey, ((String)headers.get(key)).trim());
            }
        }
    }

    public static String checkRSASecret(String secret) {
        if (secret != null) {
            if (secret.startsWith("-----BEGIN RSA PRIVATE KEY-----\n")) {
                secret = secret.replace("-----BEGIN RSA PRIVATE KEY-----\n", "");
            }

            while(secret.endsWith("\n") || secret.endsWith("\r")) {
                secret = secret.substring(0, secret.length() - 1);
            }

            if (secret.endsWith("\n-----END RSA PRIVATE KEY-----")) {
                secret = secret.replace("\n-----END RSA PRIVATE KEY-----", "");
            }
        }

        return secret;
    }

    public static byte[] hash(byte[] raw, String signAlgorithm) throws Exception {
        if (signAlgorithm == null) {
            return null;
        } else if (!signAlgorithm.equals("ACS3-HMAC-SHA256") && !signAlgorithm.equals("ACS3-RSA-SHA256")) {
            if (signAlgorithm.equals("ACS3-HMAC-SM3")) {
                BouncyCastleProvider provider = new BouncyCastleProvider();
                MessageDigest digest = MessageDigest.getInstance("SM3", provider);
                return digest.digest(raw);
            } else {
                return null;
            }
        } else {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return digest.digest(raw);
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
}
