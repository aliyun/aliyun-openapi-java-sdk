package com.aliyuncs.policy.retry.backoff;

import com.aliyuncs.policy.retry.RetryPolicyContext;

import java.util.Random;


public final class EqualJitterBackoffStrategy extends BackoffStrategy {

    private static final int BASE_DELAY_CEILING = 24 * 60 * 60 * 1000;
    private static final int MAX_BACKOFF_CEILING = 24 * 60 * 60 * 1000;

    private final int baseDelay;
    private final int maxBackoffTime;
    private final Random random;

    public EqualJitterBackoffStrategy(final Integer baseDelay, final int maxBackoffTime, final Random random) {
        this.baseDelay = Math.min(baseDelay, BASE_DELAY_CEILING);
        this.maxBackoffTime = Math.min(maxBackoffTime, MAX_BACKOFF_CEILING);
        this.random = random;
    }

    @Override
    public int computeDelayBeforeNextRetry(RetryPolicyContext context) {
        int ceil = calculateExponentialDelay(context.retriesAttempted(), baseDelay, maxBackoffTime);
        return (ceil / 2) + random.nextInt((ceil / 2) + 1);
    }

}
