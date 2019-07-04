package com.aliyuncs.retry.retrystrategy;

import com.aliyuncs.retry.RetryContext;
import org.junit.Assert;
import org.junit.Test;

public class FixedDelayBackOffStrategyTest {
    @Test
    public void computeDelayBeforeNextRetryTest(){
        RetryContext retryContext = new RetryContext(0);
        FixedDelayBackOffStrategy fixedDelay = new FixedDelayBackOffStrategy(retryContext);
        Assert.assertEquals(0, fixedDelay.computeDelayBeforeNextRetry(retryContext));
    }
}
