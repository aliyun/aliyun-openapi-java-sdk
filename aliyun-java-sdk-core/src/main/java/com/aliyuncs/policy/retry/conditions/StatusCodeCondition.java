package com.aliyuncs.policy.retry.conditions;

import com.aliyuncs.policy.retry.RetryPolicyContext;
import com.aliyuncs.policy.retry.RetryUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class StatusCodeCondition implements RetryCondition {

    private final Set<Integer> statusCodesToRetryOn;

    private StatusCodeCondition(Set<Integer> statusCodesToRetryOn) {
        this.statusCodesToRetryOn = new HashSet<Integer>(statusCodesToRetryOn);
    }

    @Override
    public boolean meetState(RetryPolicyContext context) {
        Integer code = context.httpStatusCode();
        if (code == null) {
            return false;
        }
        for (Integer s : statusCodesToRetryOn) {
            if (code.equals(s)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int escapeTime(RetryPolicyContext context) {
        return RetryUtil.DEFAULT_ESCAPE_TIME;
    }

    public static StatusCodeCondition create(Set<Integer> statusCodesToRetryOn) {
        return new StatusCodeCondition(statusCodesToRetryOn);
    }

    public static StatusCodeCondition create(Integer... statusCodesToRetryOn) {
        return new StatusCodeCondition(new HashSet<Integer>(Arrays.asList(statusCodesToRetryOn)));
    }
}
