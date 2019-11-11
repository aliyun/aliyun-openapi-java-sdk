package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class ProfilingHelperTest {
    @Test
    public void getSetTest() throws ParseException {
        ProfilingHelper profilingHelper = new ProfilingHelper();
        profilingHelper.setStartRequest(1573470671111L);
        Assert.assertEquals("2019-11-11 11:11:11 111", profilingHelper.getStartRequest());

        profilingHelper.setEndRequest(1573470671111L);
        Assert.assertEquals("2019-11-11 11:11:11 111", profilingHelper.getEndRequest());
        Assert.assertEquals("0ms", profilingHelper.getTotalRequest());

        profilingHelper.setStartEndpoint(1573470671111L);
        Assert.assertEquals("2019-11-11 11:11:11 111", profilingHelper.getStartEndpoint());

        profilingHelper.setEndEndpoint(1573470671111L);
        Assert.assertEquals("2019-11-11 11:11:11 111", profilingHelper.getEndEndpoint());
        Assert.assertEquals("0ms", profilingHelper.getTotalEndpoint());

        profilingHelper.setStartNetwork(1573470671111L);
        Assert.assertEquals("2019-11-11 11:11:11 111", profilingHelper.getStartNetwork());

        profilingHelper.setEndNetwork(1573470671111L);
        Assert.assertEquals("2019-11-11 11:11:11 111", profilingHelper.getEndNetwork());
        Assert.assertEquals("0ms", profilingHelper.getTotalNetwork());
        Assert.assertEquals("0ms", profilingHelper.getTotalAll());
    }

    @Test
    public void getlongDate() throws ParseException {
        Assert.assertEquals(-1L, ProfilingHelper.getlongDate(null));
        Assert.assertEquals(1573470671111L, ProfilingHelper.getlongDate("2019-11-11 11:11:11 111"));
    }

    @Test
    public void getDatasTest() throws IOException, ParseException {
        List list = ProfilingHelper.getDatas(null, null, null);
        Assert.assertTrue(list.size() == 0);

        list = ProfilingHelper.getDatas("", null, null);
        Assert.assertTrue(list.size() == 0);

        list = ProfilingHelper.getDatas(ProfilingHelperTest.class.getClassLoader().getResource("logTest.log").getPath(),
                "2019-11-11 15:55:12 500", null);
        Assert.assertTrue(list.size() == 1);

        list = ProfilingHelper.getDatas(ProfilingHelperTest.class.getClassLoader().getResource("logTest.log").getPath(),
                "2019-11-11 15:55:12 500", "2019-11-10 15:55:12 500");
        Assert.assertTrue(list.size() == 0);
    }
}
