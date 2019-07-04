package com.aliyuncs.retry.retrystrategy;

import com.aliyuncs.retry.RetryContext;
import org.junit.Assert;
import org.junit.Test;

public class ExponentialBackoffStrategyTest {
    @Test
    public void computeDelayBeforeNextRetryTest(){
        ExponentialBackoffStrategy strategy = new ExponentialBackoffStrategy(1,2);
        Assert.assertEquals(1, strategy.computeDelayBeforeNextRetry(new RetryContext(666)));
    }
}
