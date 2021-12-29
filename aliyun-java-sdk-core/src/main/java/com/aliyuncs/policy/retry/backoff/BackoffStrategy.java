package com.aliyuncs.policy.retry.backoff;

import com.aliyuncs.policy.retry.RetryPolicyContext;

public abstract class BackoffStrategy {

    /**
     * Max permitted retry times. To prevent exponentialDelay from overflow, there must be 2 ^ retriesAttempted
     * <= 2 ^ 31 - 1, which means retriesAttempted <= 30, so that is the ceil for retriesAttempted.
     */
    int RETRIES_ATTEMPTED_CEILING = (int) Math.floor(Math.log(Integer.MAX_VALUE) / Math.log(2));

    public abstract int computeDelayBeforeNextRetry(RetryPolicyContext context);

    int calculateExponentialDelay(int retriesAttempted, int baseDelay, int maxBackoffTime) {
        int cappedRetries = Math.min(retriesAttempted, RETRIES_ATTEMPTED_CEILING);
        return (int) Math.min(baseDelay * (1L << cappedRetries), maxBackoffTime);
    }
}
