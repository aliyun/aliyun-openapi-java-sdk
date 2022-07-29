package com.aliyuncs.http;

import org.junit.Assert;
import org.junit.Test;

public class MethodTypeTest {

    @Test
    public void testMethodType() {
        // new MethodType();
        Assert.assertFalse(MethodType.GET.hasContent());
        Assert.assertTrue(MethodType.PUT.hasContent());
        Assert.assertTrue(MethodType.POST.hasContent());
        Assert.assertTrue(MethodType.PATCH.hasContent());
        Assert.assertTrue(MethodType.DELETE.hasContent());
        Assert.assertFalse(MethodType.HEAD.hasContent());
        Assert.assertFalse(MethodType.OPTIONS.hasContent());
    }
}