package com.aliyuncs.retry.retrycondition;

import com.aliyuncs.retry.RetryContext;
import org.junit.Assert;
import org.junit.Test;

public class ApiConditionTest {
    @Test
    public void shouldRetryTest(){
        ApiCondition condition = new ApiCondition();
        Assert.assertFalse(condition.shouldRetry(null));

        RetryContext context = new RetryContext(666);
        context.setActionName("DescribeAccessPoints");
        context.setVersion("2014-05-26");
        context.setProductCode("ecs");
        Assert.assertTrue(condition.shouldRetry(context));

        context.setActionName("test");
        Assert.assertFalse(condition.shouldRetry(context));
    }
}
