package com.aliyuncs.policy.retry.conditions;

import com.aliyuncs.policy.retry.RetryPolicyContext;

public interface RetryCondition {

    boolean meetState(RetryPolicyContext context);

    int escapeTime(RetryPolicyContext context);

}
