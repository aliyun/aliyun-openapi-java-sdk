package com.aliyuncs.retry;

import com.aliyuncs.retry.retrycondition.DefaultRetryCondition;
import com.aliyuncs.retry.retrycondition.RetryCondition;
import com.aliyuncs.retry.retrystrategy.BackOffStrategy;
import com.aliyuncs.retry.retrystrategy.DefaultMixedBackoffStrategy;

public class DefaultRetryPolicy implements RetryPolicy {
    private final RetryCondition retryCondition;
    private final BackOffStrategy backOffStrategy;

    public DefaultRetryPolicy(int times) {
        this.retryCondition = new DefaultRetryCondition(times);
        this.backOffStrategy = new DefaultMixedBackoffStrategy();
    }

    @Override
    public boolean shouldRetry(RetryContext context) {
        return this.retryCondition.shouldRetry(context);
    }

    @Override
    public int computeDelayBeforeNextRetry(RetryContext retryContext) {
        return this.backOffStrategy.computeDelayBeforeNextRetry(retryContext);
    }
}
