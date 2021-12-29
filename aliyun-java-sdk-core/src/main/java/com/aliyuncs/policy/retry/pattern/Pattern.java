package com.aliyuncs.policy.retry.pattern;

public interface Pattern {

    Boolean meetState();

    void readFormHeadersContent(String content);

    int escapeTime();

}
