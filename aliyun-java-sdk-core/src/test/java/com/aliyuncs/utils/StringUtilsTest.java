package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
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
    public void join() {
        List<String> list = new ArrayList<String>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        Assert.assertEquals("test1,test2,test3", StringUtils.join(",", list));
    }
}
