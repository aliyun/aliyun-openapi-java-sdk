package com.aliyuncs.policy.retry.pattern;

import com.aliyuncs.policy.retry.RetryUtil;
import com.aliyuncs.utils.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class AliyunThrottlingPattern implements Pattern {

    private Map<String, String> throttlingMap = new HashMap<String, String>();
    private static String Remain = "remain";
    private static String Limit = "limit";
    private static String Time = "time";
    private static String TimeLeft = "timeleft";
    private static String Reset = "reset";
    private AliyunThrottlingPattern anotherPattern;

    public AliyunThrottlingPattern(String content) {
        throttlingMap.clear();
        if (!StringUtils.isEmpty(content)) {
            String[] strs = content.split(",");
            for (String s : strs) {
                String[] context = s.split(":");
                if (context.length == 2) {
                    throttlingMap.put(context[0].toLowerCase(), context[1].toLowerCase());
                }
            }
        }
    }

    private Map<String, String> getThrottlingMap() {
        return throttlingMap;
    }

    @Override
    public Boolean meetState() {
        Map<String, String> realThrottlingMap = anotherPattern.getThrottlingMap();
        if (realThrottlingMap.containsKey(Remain) && throttlingMap.containsKey(Remain)) {
            int realRemain = Integer.parseInt(realThrottlingMap.get(Remain));
            int needRemain = Integer.parseInt(throttlingMap.get(Remain));
            return realRemain < needRemain && realRemain != -1;
        }
        return false;
    }

    @Override
    public int escapeTime() {
        int escapeTimeMillis = RetryUtil.DEFAULT_ESCAPE_TIME;
        Map<String, String> realThrottlingMap = anotherPattern.getThrottlingMap();
        if (realThrottlingMap.containsKey(TimeLeft)) {
            escapeTimeMillis = Integer.parseInt(realThrottlingMap.get(TimeLeft)) + RetryUtil.BASE_DELAY;
        }
        return escapeTimeMillis;
    }

    public void readFormHeadersContent(String content) {
        this.anotherPattern = new AliyunThrottlingPattern(content);
    }
}
