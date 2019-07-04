package com.aliyuncs.retry.retrystrategy;

import com.aliyuncs.retry.RetryContext;

public interface BackOffStrategy {
    int computeDelayBeforeNextRetry(RetryContext retryContext);
}
