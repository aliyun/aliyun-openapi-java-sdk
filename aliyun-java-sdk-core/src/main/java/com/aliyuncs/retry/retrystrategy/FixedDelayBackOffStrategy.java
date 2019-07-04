package com.aliyuncs.retry.retrystrategy;

import com.aliyuncs.retry.RetryContext;

public class FixedDelayBackOffStrategy implements BackOffStrategy{
    private final int delay;

    public FixedDelayBackOffStrategy(RetryContext retryContext) {
        this.delay = retryContext.getRetryDelay();
    }

    @Override
    public int computeDelayBeforeNextRetry(RetryContext retryContext) {
        return this.delay;
    }
}
