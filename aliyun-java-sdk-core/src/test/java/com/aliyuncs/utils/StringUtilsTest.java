package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void init() {
        new StringUtils();
    }

    @Test
    public void isEmpty() {
        Assert.assertTrue("null should be true", StringUtils.isEmpty(null));
        Assert.assertTrue("empty string should be true", StringUtils.isEmpty(""));
        Assert.assertFalse("other string should be false", StringUtils.isEmpty("ok"));
    }
}
