package com.aliyuncs.policy.cache;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.*;

public class ThrottlingPoolTest {
    @Test
    public void putAndGetTest() throws InterruptedException, ExecutionException {
        String key = "id";
        // without expire
        ThrottlingPool.put(key, 123);
        Assert.assertEquals(123, ThrottlingPool.get(key));
        Assert.assertEquals(-1, ThrottlingPool.getExpire(key));
        Assert.assertEquals(123, ThrottlingPool.remove(key));
        Assert.assertEquals(0, ThrottlingPool.getExpire(key));
        Assert.assertNull(ThrottlingPool.get(key));

        ThrottlingPool.put(key, 123);
        Assert.assertEquals(1, ThrottlingPool.size());
        ThrottlingPool.put(key, null);
        Assert.assertNull(ThrottlingPool.get(key));
        Assert.assertEquals(0, ThrottlingPool.size());
        ThrottlingPool.put(key, 123);
        Assert.assertEquals(1, ThrottlingPool.size());
        ThrottlingPool.clear();
        Assert.assertEquals(0, ThrottlingPool.size());

        // with expire
        ThrottlingPool.put(key, "123456", 100);
        Assert.assertEquals("123456", ThrottlingPool.get(key));
        Assert.assertEquals(100, ThrottlingPool.getExpire(key));
        Assert.assertEquals(1, ThrottlingPool.getPool().size());
        Thread.sleep(500);
        Assert.assertNull(ThrottlingPool.get(key));
        Assert.assertEquals(0, ThrottlingPool.getExpire(key));
        Assert.assertEquals(0, ThrottlingPool.size());
    }
}
