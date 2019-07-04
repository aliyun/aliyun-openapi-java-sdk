package com.aliyuncs.retry.retrycondition;

import com.aliyuncs.retry.RetryContext;
import org.junit.Assert;
import org.junit.Test;

public class MaxTimesConditionTest {
    @Test
    public void shouldRetryTest(){
        RetryContext context = new RetryContext(0);
        MaxTimesCondition condition = new MaxTimesCondition(0);
        Assert.assertTrue(condition.shouldRetry(context));

        context.autoIncrement();
        Assert.assertFalse(condition.shouldRetry(context));
    }
}
