package com.aliyuncs.retry;

import org.junit.Assert;
import org.junit.Test;

public class NoRetryPolicyTest {
    @Test
    public void noRetryPolicyTest(){
        NoRetryPolicy noRetryPolicy = new NoRetryPolicy();
        Assert.assertFalse(noRetryPolicy.shouldRetry(null));
        Assert.assertEquals(0, noRetryPolicy.computeDelayBeforeNextRetry(null));
    }
}
