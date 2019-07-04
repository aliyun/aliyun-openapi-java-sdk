package com.aliyuncs.retry.retrycondition;

import com.aliyuncs.retry.RetryContext;

public class MaxTimesCondition implements RetryCondition {
    private int maxRetryTimes;

    public MaxTimesCondition(int maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }

    @Override
    public boolean shouldRetry(RetryContext context) {
        return context.getRetriesAttempted() <= maxRetryTimes;
    }


}
