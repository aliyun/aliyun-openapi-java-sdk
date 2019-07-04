package com.aliyuncs.retry;

public class NoRetryPolicy implements RetryPolicy {

    @Override
    public boolean shouldRetry(RetryContext context) {
        return false;
    }

    @Override
    public int computeDelayBeforeNextRetry(RetryContext retryContext) {
        return 0;
    }
}
