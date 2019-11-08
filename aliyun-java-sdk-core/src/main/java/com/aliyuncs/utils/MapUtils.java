package com.aliyuncs.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUtils {

    public List<Map<Object, Object>> convertMapToListMap(Map<String, String> flattenMap, String prefix) {
        List<Map<Object, Object>> list = new ArrayList<Map<Object, Object>>();
        for (Map.Entry<String, String> entry : flattenMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.contains(prefix)) {
                String[] keys = key.replace(prefix, "").split("\\.");
                String pre = prefix + keys[0];
                if (keys[0].contains("[")) {
                    String mapKey = key.replace(pre + ".", "");
                    int index = Integer.parseInt(keys[0].replace("[", "").replace("]", ""));
                    list = setList(list, index, mapKey, value);
                }
            }
        }
        return list;
    }

    private List<Map<Object, Object>> setList(List<Map<Object, Object>> targetList, int index, String key,
            String value) {
        List<Map<Object, Object>> list = targetList;
        if (null == list) {
            list = new ArrayList<Map<Object, Object>>();
        }
        while (list.size() <= index) {
            list.add(new HashMap<Object, Object>());
        }
        list.set(index, setMap(list.get(index), key, value));
        return list;
    }

    private Map<Object, Object> setMap(Map<Object, Object> targetMap, String key, String value) {
        Map<Object, Object> map = targetMap;
        if (null == map) {
            map = new HashMap<Object, Object>();
        }
        if (key.contains("[")) {
            String[] keys = key.split("\\.");
            String listKey = key.substring(0, key.indexOf("["));
            int index = Integer.parseInt(key.substring(key.indexOf("[") + 1, key.indexOf("]")));
            List<Map<Object, Object>> listObj = (List<Map<Object, Object>>) map.get(listKey);
            listObj = setList(listObj, index, key.replace(keys[0] + ".", ""), value);
            map.put(listKey, listObj);
        } else if (key.contains(".")) {
            String[] keys = key.split("\\.");
            String mapKey = keys[0];
            // exclude *.Length
            if (!(map.get(mapKey) instanceof List) && !"Length".equals(keys[1])) {
                map.put(mapKey, setMap((Map<Object, Object>) map.get(mapKey),
                        key.replace(keys[0] + ".", ""), value));
            }
        } else {
            map.put(key, value);
        }
        return map;
    }
}
