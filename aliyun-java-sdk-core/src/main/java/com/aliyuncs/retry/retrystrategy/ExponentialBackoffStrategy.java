package com.aliyuncs.retry.retrystrategy;

import com.aliyuncs.retry.RetryContext;

public class ExponentialBackoffStrategy implements BackOffStrategy {
    private final int maxRetryLimit = 28;
    private int baseDelayInMilliseconds;
    private int maxDelayInMilliseconds;

    public ExponentialBackoffStrategy(int baseDelayInMilliseconds, int maxDelayInMilliseconds) {
        this.baseDelayInMilliseconds = baseDelayInMilliseconds;
        this.maxDelayInMilliseconds = maxDelayInMilliseconds;
    }

    @Override
    public int computeDelayBeforeNextRetry(RetryContext retryContext) {
        int retries = Math.min(this.maxRetryLimit, retryContext.getRetriesAttempted());
        int delay = Math.min(this.maxDelayInMilliseconds, this.baseDelayInMilliseconds << retries);
        return delay;
    }
}
