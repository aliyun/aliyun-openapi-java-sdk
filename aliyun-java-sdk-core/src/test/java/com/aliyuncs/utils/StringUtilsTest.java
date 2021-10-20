package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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

    @Test
    public void joinTest() {
        String[] test ={"1","2"};
        List<String> list = Arrays.asList(test);
        String test1 = StringUtils.join("test", list);
        Assert.assertEquals("1test2tes",test1);
    }
}
