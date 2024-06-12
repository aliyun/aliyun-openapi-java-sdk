 
package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;


public class EnvHelperTest {
    @Test
    public void construct(){
        new EnvHelper();
    }

    @Test
    public void getAndSet(){
        Assert.assertNull(EnvHelper.getenv("test"));
        EnvHelper.setenv("test", "value");
        Assert.assertEquals("value", EnvHelper.getenv("test"));
    }
}
