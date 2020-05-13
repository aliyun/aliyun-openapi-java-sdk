package com.aliyuncs.v5.http;

import org.junit.Assert;
import org.junit.Test;

public class FormatTypeTest {

    @Test
    public void testMapFormatToAccept() {
        Assert.assertEquals("application/x-www-form-urlencoded", FormatType.mapFormatToAccept(FormatType.FORM));
    }

    @Test
    public void testMapAcceptToFormat() {
        Assert.assertEquals(FormatType.FORM, FormatType.mapAcceptToFormat("application/x-www-form-urlencoded"));
        Assert.assertEquals(FormatType.RAW, FormatType.mapAcceptToFormat("others"));
    }
}