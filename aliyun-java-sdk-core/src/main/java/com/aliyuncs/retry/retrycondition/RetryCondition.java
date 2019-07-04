package com.aliyuncs.retry.retrycondition;

import com.aliyuncs.retry.RetryContext;

public interface RetryCondition {
    boolean shouldRetry(RetryContext context);
}
