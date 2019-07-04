package com.aliyuncs.retry.retrystrategy;

import com.aliyuncs.retry.RetryContext;

public class DefaultMixedBackoffStrategy implements BackOffStrategy{
    private final int defaultBaseDelay = 100;
    private final int defaultMaxBackoff = 20 * 1000;
    private final ExponentialBackoffStrategy exponentialBackoffStrategy;

    public DefaultMixedBackoffStrategy() {
        this.exponentialBackoffStrategy = new ExponentialBackoffStrategy(this.defaultBaseDelay, this.defaultMaxBackoff);
    }

    @Override
    public int computeDelayBeforeNextRetry(RetryContext retryContext) {
        return this.exponentialBackoffStrategy.computeDelayBeforeNextRetry(retryContext);
    }
}
