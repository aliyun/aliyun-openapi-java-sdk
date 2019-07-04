package com.aliyuncs.retry.retrystrategy;

import com.aliyuncs.retry.RetryContext;
import org.junit.Assert;
import org.junit.Test;

public class DefaultMixedBackoffStrategyTest {
    @Test
    public void computeDelayBeforeNextRetryTest(){
        DefaultMixedBackoffStrategy strategy = new DefaultMixedBackoffStrategy();
        Assert.assertEquals(100, strategy.computeDelayBeforeNextRetry(new RetryContext(666)));
    }
}
