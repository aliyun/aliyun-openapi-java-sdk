package com.aliyuncs.retry;

import org.junit.Assert;
import org.junit.Test;

public class DefaultRetryPolicyTest {
    @Test
    public void shouldRetryTest() {
        DefaultRetryPolicy retryPolicy = new DefaultRetryPolicy(666);

        RetryContext context = new RetryContext(666);
        context.setHttpStatusCode("500");
        context.setActionName("DescribeAccessPoints");
        context.setVersion("2014-05-26");
        context.setProductCode("ecs");
        Assert.assertTrue(retryPolicy.shouldRetry(context));
        Assert.assertEquals(100, retryPolicy.computeDelayBeforeNextRetry(context));
    }
}
