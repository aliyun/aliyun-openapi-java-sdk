package com.aliyuncs.retry;

import com.aliyuncs.CommonRpcRequest;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class RetryContextTest {
    @Test
    public void getSetMethodTest(){
        RetryContext context = new RetryContext(5);
        Assert.assertEquals(context.getMaxRetryTimes(),5);

        context.setProductCode("ecs");
        Assert.assertEquals("ecs",context.getProductCode());

        context.setVersion("test");
        Assert.assertEquals("test",context.getVersion());

        context.setActionName("test");
        Assert.assertEquals("test", context.getActionName());

        context.setException(new IOException());
        Assert.assertTrue(context.getException() instanceof Exception);

        context.setHttpStatusCode("200");
        Assert.assertEquals("200", context.getHttpStatusCode());

        context.setHttpStatusCode(null);
        Assert.assertEquals("200", context.getHttpStatusCode());

        context.setOriginalRequest(new CommonRpcRequest(""));
        Assert.assertTrue(context.getOriginalRequest() instanceof CommonRpcRequest);

        context.autoIncrement();
        Assert.assertEquals(1, context.getRetriesAttempted());

        context.setMaxRetryTimes(3);
        Assert.assertEquals(3, context.getMaxRetryTimes());

        context.setRetryDelay(666);
        Assert.assertEquals(666, context.getRetryDelay());
    }
}
