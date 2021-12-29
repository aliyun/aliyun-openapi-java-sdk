package com.aliyuncs.policy.retry;

import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.policy.cache.ThrottlingPool;
import com.aliyuncs.policy.retry.backoff.EqualJitterBackoffStrategy;
import com.aliyuncs.policy.retry.conditions.ExceptionsCondition;
import com.aliyuncs.policy.retry.conditions.HeadersCondition;
import com.aliyuncs.policy.retry.conditions.RetryCondition;
import com.aliyuncs.policy.retry.conditions.StatusCodeCondition;
import com.aliyuncs.policy.retry.pattern.Pattern;
import com.aliyuncs.policy.retry.pattern.SimplePattern;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.mockito.Mockito.mock;

public class RetryPolicyTest {

    @Test
    public void defaultRetryPolicyTest() {
        RetryPolicy retryPolicy = RetryPolicy.defaultRetryPolicy(true);
        Assert.assertTrue(retryPolicy.enableAliyunThrottlingControl());
        Assert.assertTrue(retryPolicy.backoffStrategy() instanceof EqualJitterBackoffStrategy);
        Assert.assertEquals(RetryUtil.DEFAULT_MAX_RETRIES, retryPolicy.maxNumberOfRetries());
        Assert.assertEquals(RetryUtil.MAX_BACKOFF, retryPolicy.maxDelayTimeMillis());
        Assert.assertEquals(2, retryPolicy.retryConditions().size());
        Assert.assertEquals(1, retryPolicy.throttlingConditions().size());
        retryPolicy = RetryPolicy.defaultRetryPolicy(false);
        Assert.assertFalse(retryPolicy.enableAliyunThrottlingControl());
        Assert.assertTrue(retryPolicy.backoffStrategy() instanceof EqualJitterBackoffStrategy);
        Assert.assertEquals(RetryUtil.DEFAULT_MAX_RETRIES, retryPolicy.maxNumberOfRetries());
        Assert.assertEquals(RetryUtil.MAX_BACKOFF, retryPolicy.maxDelayTimeMillis());
        Assert.assertEquals(2, retryPolicy.retryConditions().size());
        Assert.assertEquals(0, retryPolicy.throttlingConditions().size());
    }

    @Test
    public void noneTest() {
        RetryPolicy retryPolicy = RetryPolicy.none();
        Assert.assertEquals(0, retryPolicy.maxNumberOfRetries());
    }

    @Test
    public void toBuilderTest() {
        RetryPolicy retryPolicy = RetryPolicy.defaultRetryPolicy(true);
        RetryPolicy copy = retryPolicy.toBuilder().build();
        Assert.assertTrue(copy.enableAliyunThrottlingControl());
        Assert.assertTrue(copy.backoffStrategy() instanceof EqualJitterBackoffStrategy);
        Assert.assertEquals(RetryUtil.DEFAULT_MAX_RETRIES, copy.maxNumberOfRetries());
        Assert.assertEquals(RetryUtil.MAX_BACKOFF, copy.maxDelayTimeMillis());
        Assert.assertEquals(2, copy.retryConditions().size());
        Assert.assertEquals(1, copy.throttlingConditions().size());
    }

    @Test
    public void retryTest() throws InterruptedException {
        Set<RetryCondition> retryConditions = new HashSet<RetryCondition>();
        Set<Integer> statusCodes = new HashSet<Integer>();
        statusCodes.add(500);
        statusCodes.add(501);
        RetryCondition statusCodeCondition = StatusCodeCondition.create(statusCodes);
        retryConditions.add(statusCodeCondition);
        Set<Class<? extends Exception>> exceptions = new HashSet<Class<? extends Exception>>();
        exceptions.add(SocketTimeoutException.class);
        exceptions.add(IOException.class);
        RetryCondition exceptionsCondition = ExceptionsCondition.create(exceptions);
        retryConditions.add(exceptionsCondition);
        RetryPolicy retryPolicy = RetryPolicy.builder()
                .maxNumberOfRetries(1)
                .maxDelayTimeMillis(500)
                .retryConditions(retryConditions)
                .enableAliyunThrottlingControl(true)
                .build();

        String coordinate = "nanhe:test";
        HttpRequest request = mock(HttpRequest.class);
        RetryPolicyContext context = RetryPolicyContext.builder()
                .coordinate(coordinate)
                .httpRequest(request)
                .retriesAttempted(0)
                .build();
        Assert.assertTrue(retryPolicy.shouldRetry(context));
        Assert.assertEquals(-1, statusCodeCondition.escapeTime(context));
        Assert.assertEquals(-1, exceptionsCondition.escapeTime(context));
        Assert.assertEquals(-1, retryPolicy.getBackoffDelay(context));
        context = RetryPolicyContext.builder()
                .coordinate(coordinate)
                .retriesAttempted(1)
                .exception(new SocketTimeoutException("test"))
                .build();
        Assert.assertTrue(retryPolicy.shouldRetry(context));

        HttpResponse response = mock(HttpResponse.class);
        Map<String, String> httpHeaders = new HashMap<String, String>();
        httpHeaders.put(RetryUtil.DEFAULT_USER_API_THROTTLING_KEY, "Remain:0,TimeLeft:2000");
        Mockito.doReturn(httpHeaders).when(response).getSysHeaders();
        context = RetryPolicyContext.builder()
                .coordinate(coordinate)
                .retriesAttempted(0)
                .httpResponse(response)
                .build();
        Assert.assertFalse(retryPolicy.shouldRetry(context));
        Assert.assertEquals(2100, retryPolicy.getBackoffDelay(context));

        Mockito.doReturn(501).when(response).getStatus();
        context = RetryPolicyContext.builder()
                .coordinate(coordinate)
                .retriesAttempted(1)
                .httpResponse(response)
                .build();
        retryPolicy = RetryPolicy.builder()
                .maxNumberOfRetries(1)
                .maxDelayTimeMillis(3000)
                .retryConditions(retryConditions)
                .enableAliyunThrottlingControl(true)
                .build();
        Assert.assertTrue(retryPolicy.shouldRetry(context));
        Assert.assertEquals(2100, retryPolicy.getBackoffDelay(context));

        Mockito.doReturn(502).when(response).getStatus();
        context = RetryPolicyContext.builder()
                .coordinate(coordinate)
                .retriesAttempted(1)
                .httpResponse(response)
                .build();
        retryPolicy = RetryPolicy.builder()
                .maxNumberOfRetries(1)
                .maxDelayTimeMillis(3000)
                .retryConditions(retryConditions)
                .enableAliyunThrottlingControl(true)
                .build();
        Assert.assertFalse(retryPolicy.shouldRetry(context));
        Assert.assertEquals(2100, retryPolicy.getBackoffDelay(context));

        Mockito.doReturn(502).when(response).getStatus();
        context = RetryPolicyContext.builder()
                .coordinate(coordinate)
                .retriesAttempted(1)
                .httpResponse(response)
                .exception(new SocketTimeoutException("test"))
                .build();
        retryPolicy = RetryPolicy.builder()
                .maxNumberOfRetries(1)
                .maxDelayTimeMillis(3000)
                .retryConditions(retryConditions)
                .enableAliyunThrottlingControl(true)
                .build();
        Assert.assertTrue(retryPolicy.shouldRetry(context));
        Assert.assertEquals(2100, retryPolicy.getBackoffDelay(context));
        Assert.assertEquals(1, ThrottlingPool.size());
        ThrottlingPool.clear();

        SimplePattern pattern = new SimplePattern("testStr");
        Assert.assertEquals(-1, pattern.escapeTime());
        Assert.assertEquals("testStr", pattern.getContext());
        Map<String, Pattern> headersPattern = new HashMap<String, Pattern>();
        headersPattern.put("test", pattern);
        RetryCondition headersCondition = HeadersCondition.create(headersPattern);
        retryConditions.add(headersCondition);
        httpHeaders.put("test", "testStr");
        Mockito.doReturn(httpHeaders).when(response).getSysHeaders();
        retryPolicy = RetryPolicy.builder()
                .maxNumberOfRetries(1)
                .maxDelayTimeMillis(3000)
                .retryConditions(retryConditions)
                .build();
        Assert.assertTrue(retryPolicy.shouldRetry(context));
        Assert.assertEquals(-1, headersCondition.escapeTime(context));
    }

}
