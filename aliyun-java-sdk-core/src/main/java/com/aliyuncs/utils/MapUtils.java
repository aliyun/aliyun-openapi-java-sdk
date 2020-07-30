package com.aliyuncs.utils;

import java.util.*;

public class MapUtils {
    public static String getMapString(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("\"").append(entry.getKey()).append("\":\"").append(entry.getValue()).append("\"");
        }
        sb.append("}");
        return sb.toString();
    }

    public Map<Object, Object> convertMapToMap(Map<String, String> flattenMap, String prefix) {
        Object obj = new HashMap<Object, Object>();
        obj = parse(obj, flattenMap, prefix);
        return (Map<Object, Object>) obj;
    }

    public List<Map<Object, Object>> convertMapToListMap(Map<String, String> flattenMap, String prefix) {
        Object obj = new ArrayList<Object>();
        obj = parse(obj, flattenMap, prefix);
        return (List<Map<Object, Object>>) obj;
    }

    private Object parse(Object objSource, Map<String, String> flattenMap, String prefix) {
        Object obj = objSource;
        for (Map.Entry<String, String> entry : flattenMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.contains(prefix)) {
                String remainKey = key.replace(prefix, "");
                if (!remainKey.equalsIgnoreCase(".length")) {
                    obj = resolve(obj, remainKey, value);
                }
            }
        }
        return obj;
    }

    private Object resolve(Object objSource, String currKey, String value) {
        Object obj = objSource;
        if (currKey.equalsIgnoreCase("length") || currKey.equalsIgnoreCase(".length")) {
            return obj;
        }
        String key = popKey(currKey);
        String remainKey = popRemainKey(currKey);
        if (remainKey.equalsIgnoreCase("length") || remainKey.equalsIgnoreCase(".length")) {
            Map currMap = initMap(obj, key);
            int len = Integer.parseInt(value);
            List currList = initList(currMap.get(key), len);
            currMap.put(key, currList);
            obj = currMap;
            return obj;
        }
        if (remainKey.length() == 0) {
            if (key.contains("[")) {
                int index = getIndexFromKey(key);
                List currList = initList(obj, index);
                currList.set(index, value);
                obj = currList;
            } else {
                Map currMap = initMap(obj, key);
                currMap.put(key, value);
                obj = currMap;
            }
            return obj;
        }
        if (key.contains("[")) {
            int index = getIndexFromKey(key);
            List currList = initList(obj, index);
            Object newObj = currList.get(index);
            currList.set(index, resolve(newObj, remainKey, value));
            obj = currList;
        } else {
            Map currMap = initMap(obj, key);
            currMap.put(key, resolve(currMap.get(key), remainKey, value));
            obj = currMap;
        }
        return obj;
    }

    private Map initMap(Object obj, String key) {
        Map currMap = (Map) obj;
        if (null == currMap) {
            currMap = new HashMap<Object, Object>();
        }
        if (!currMap.containsKey(key)) {
            currMap.put(key, null);
        }
        return currMap;
    }

    private List initList(Object obj, int index) {
        List currList = (List) obj;
        if (null == currList) {
            currList = new ArrayList<Object>();
        }
        while (currList.size() <= index) {
            currList.add(null);
        }
        return currList;
    }

    private int getIndexFromKey(String key) {
        return Integer.parseInt(key.replace("[", "").replace("]", ""));
    }

    private String getMapKeyFromListIndex(String key) {
        return key.substring(0, key.indexOf("["));
    }

    private String popKey(String keyString) {
        String key = keyString;
        if (key.startsWith(".")) {
            key = key.substring(1);
        }
        String[] keys = key.split("\\.");
        key = keys[0];
        if (key.contains("[") && key.indexOf("[") != 0) {
            return getMapKeyFromListIndex(key);
        }
        return key;
    }

    private String popRemainKey(String keyString) {
        String key = keyString;
        if (key.startsWith(".")) {
            key = key.substring(1);
        }
        String popKey = popKey(key);
        if (popKey.endsWith("Length")) {
            return "";
        }
        String remainKey = key.substring(popKey.length());
        if (remainKey.startsWith(".")) {
            remainKey = remainKey.substring(1);
        }
        return remainKey;
    }
}
