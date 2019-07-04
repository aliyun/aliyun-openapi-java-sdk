package com.aliyuncs.retry;

import com.aliyuncs.retry.retrycondition.RetryCondition;
import com.aliyuncs.retry.retrystrategy.BackOffStrategy;

public interface RetryPolicy extends RetryCondition, BackOffStrategy {
}
