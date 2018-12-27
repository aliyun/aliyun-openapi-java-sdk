package com.aliyuncs.http;

import org.junit.Assert;
import org.junit.Test;

public class MethodTypeTest {

    @Test
    public void testMethodType() {
        // new MethodType();
        Assert.assertFalse("GET has content", MethodType.GET.hasContent());
    }
}