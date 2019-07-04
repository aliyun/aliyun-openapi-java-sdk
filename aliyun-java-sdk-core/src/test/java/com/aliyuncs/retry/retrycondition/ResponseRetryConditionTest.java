package com.aliyuncs.retry.retrycondition;

import com.aliyuncs.retry.RetryContext;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ResponseRetryConditionTest {
    @Test
    public void shouldRetryTest(){
        RetryContext context = new RetryContext(66);
        ResponseRetryCondition condition = new ResponseRetryCondition();
        context.setHttpStatusCode("200");
        Assert.assertFalse(condition.shouldRetry(context));

        context.setHttpStatusCode("500");
        Assert.assertTrue(condition.shouldRetry(context));

        context.setHttpStatusCode("666");
        Assert.assertFalse(condition.shouldRetry(context));

        IOException exception = new IOException("timed out");
        context.setException(exception);
        Assert.assertTrue(condition.shouldRetry(context));

        exception = new IOException("nothing");
        context.setException(exception);
        Assert.assertFalse(condition.shouldRetry(context));

    }
}
