package com.aliyuncs.policy.retry.conditions;

import com.aliyuncs.policy.retry.RetryPolicyContext;
import com.aliyuncs.policy.retry.RetryUtil;
import com.aliyuncs.policy.retry.pattern.Pattern;

import java.util.*;

public final class HeadersCondition implements RetryCondition {

    private final Map<String, Pattern> headersConditionToRetryOn;

    private HeadersCondition(Map<String, Pattern> headersToRetryOn) {
        this.headersConditionToRetryOn = new HashMap<String, Pattern>(headersToRetryOn);
    }

    @Override
    public boolean meetState(RetryPolicyContext context) {
        Map<String, String> realHeaders = context.httpHeaders();
        if (realHeaders == null) {
            return false;
        }
        for (String key : headersConditionToRetryOn.keySet()) {
            Pattern pattern = headersConditionToRetryOn.get(key);
            if (pattern != null && realHeaders.containsKey(key)) {
                pattern.readFormHeadersContent(realHeaders.get(key));
                if (pattern.meetState()) {
                    return true;
                }
            }
        }
        return false;
    }

    // 逃脱时间，即这段时间内既不进行重试又不直接限制（主要用在限流时）
    @Override
    public int escapeTime(RetryPolicyContext context) {
        int escapeTimeMillis = RetryUtil.DEFAULT_ESCAPE_TIME;
        Map<String, String> realHeaders = context.httpHeaders();
        if (realHeaders == null) {
            return RetryUtil.DEFAULT_ESCAPE_TIME;
        }
        for (String key : headersConditionToRetryOn.keySet()) {
            Pattern pattern = headersConditionToRetryOn.get(key);
            if (pattern != null && realHeaders.containsKey(key)) {
                pattern.readFormHeadersContent(realHeaders.get(key));
                if (pattern.meetState()) {
                    escapeTimeMillis = Math.max(escapeTimeMillis, pattern.escapeTime());
                }
            }
        }
        return escapeTimeMillis;
    }

    public static HeadersCondition create(Map<String, Pattern> headersToRetryOn) {
        return new HeadersCondition(headersToRetryOn);
    }
}
