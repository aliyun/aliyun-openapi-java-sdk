package com.aliyuncs.batchcompute.functiontest.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.CustomJsonDateDeserializer;
import com.aliyuncs.exceptions.ClientException;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Date;

/**
 * Created by zu on 16/3/9.
 */
public class DateParserTest extends TestCase {



    @Test
    public void testCluster() throws ClientException {

        String createTime =  "2016-03-08T15:01:17.427088Z";

        CustomJsonDateDeserializer c  = new CustomJsonDateDeserializer();
        Date d = c.parseDate(createTime);

        System.out.println(d.toString());
        System.out.println(d.getTime());


    }
}
