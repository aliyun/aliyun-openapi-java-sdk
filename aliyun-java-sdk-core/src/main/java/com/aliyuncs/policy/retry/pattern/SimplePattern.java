package com.aliyuncs.policy.retry.pattern;

import com.aliyuncs.policy.retry.RetryUtil;

public class SimplePattern implements Pattern {
    private static String context;
    private SimplePattern anotherPattern;

    public SimplePattern(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    @Override
    public Boolean meetState() {
        return anotherPattern != null && context.equals(anotherPattern.getContext());
    }

    @Override
    public int escapeTime() {
        return RetryUtil.DEFAULT_ESCAPE_TIME;
    }

    public void readFormHeadersContent(String content) {
        this.anotherPattern = new SimplePattern(content);
    }
}
