package com.aliyuncs.retry.retrycondition;

import com.aliyuncs.retry.RetryContext;

import java.util.ArrayList;
import java.util.List;

public class DefaultRetryCondition implements RetryCondition {
    private List<RetryCondition> retryConditions = new ArrayList<RetryCondition>();

    public DefaultRetryCondition(int maxRetryTimes) {
        this.retryConditions.add(new MaxTimesCondition(maxRetryTimes));
        this.retryConditions.add(new ApiCondition());
        this.retryConditions.add(new ResponseRetryCondition());
    }

    @Override
    public boolean shouldRetry(RetryContext context) {
        for (RetryCondition retryCondition:retryConditions) {
            if (!retryCondition.shouldRetry(context)){
                return false;
            }
        }
        return true;
    }
}
