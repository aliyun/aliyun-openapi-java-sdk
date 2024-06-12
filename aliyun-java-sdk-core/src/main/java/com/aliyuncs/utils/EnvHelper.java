package com.aliyuncs.utils;

import java.util.HashMap;
import java.util.Map;

public class EnvHelper {
    // 中间存储
    private static Map<String, String> shadowMap = new HashMap<String, String>();

    public static String getenv(String key) {
        if (shadowMap.containsKey(key)) {
            return shadowMap.get(key);
        }

        return System.getenv(key);
    }

    public static void setenv(String key, String value) {
        shadowMap.put(key, value);
    }
}
