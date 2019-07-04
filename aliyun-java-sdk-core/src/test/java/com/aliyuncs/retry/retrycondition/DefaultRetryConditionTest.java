package com.aliyuncs.retry.retrycondition;

import com.aliyuncs.retry.RetryContext;
import org.junit.Assert;
import org.junit.Test;

public class DefaultRetryConditionTest {
    @Test
    public void shouldRetryTest(){
        DefaultRetryCondition condition = new DefaultRetryCondition(666);
        Assert.assertFalse(condition.shouldRetry(new RetryContext(666)));

        RetryContext context = new RetryContext(666);
        context.setHttpStatusCode("500");
        context.setActionName("DescribeAccessPoints");
        context.setVersion("2014-05-26");
        context.setProductCode("ecs");
        Assert.assertTrue(condition.shouldRetry(context));
    }
}
