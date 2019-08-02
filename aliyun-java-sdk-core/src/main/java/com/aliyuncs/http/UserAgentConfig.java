package com.aliyuncs.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.aliyuncs.utils.StringUtils;

public class UserAgentConfig {

    static {
        Properties props = System.getProperties();
        try {
            props.load(UserAgentConfig.class.getClassLoader().getResourceAsStream("project.properties"));
        } catch (IOException e) {
            props.setProperty("sdk.project.version", "(got version failed)");
        }
        DEFAULT_MESSAGE = String.format("AlibabaCloud (%s; %s) Java/%s %s/%s", props.getProperty("os.name"), props
                .getProperty("os.arch"), props.getProperty("java.runtime.version"), "Core", props.getProperty(
                        "sdk.project.version"));
    }

    private static String DEFAULT_MESSAGE;
    private List<String> excludeList = new ArrayList<String>();
    private final Map<String, String> userAgents = new LinkedHashMap<String, String>();

    public UserAgentConfig() {
        excludeList.add("java");
        excludeList.add("Core");
    }

    public static String getDefaultMessage() {
        return DEFAULT_MESSAGE;
    }

    public void append(String key, String value) {
        if (StringUtils.isEmpty(key) || StringUtils.isEmpty(value)) {
            return;
        }
        if (excludeList.contains(key.toLowerCase())) {
            return;
        }
        this.userAgents.put(key, value);
    }

    public Map<String, String> getSysUserAgentsMap() {
        return Collections.unmodifiableMap(this.userAgents);
    }

    public static String resolve(UserAgentConfig requestConfig, UserAgentConfig clientConfig) {
        Map<String, String> finalMap = new LinkedHashMap<String, String>();
        if (clientConfig != null && clientConfig.getSysUserAgentsMap().size() > 0) {
            finalMap.putAll(clientConfig.getSysUserAgentsMap());
        }
        if (requestConfig != null && requestConfig.getSysUserAgentsMap().size() > 0) {
            finalMap.putAll(requestConfig.getSysUserAgentsMap());
        }
        StringBuilder agents = new StringBuilder(DEFAULT_MESSAGE);
        for (Map.Entry<String, String> entry : finalMap.entrySet()) {
            agents.append(" ");
            agents.append(entry.getKey());
            agents.append("/");
            agents.append(entry.getValue());
        }
        return agents.toString();
    }
}
