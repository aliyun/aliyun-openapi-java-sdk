package com.aliyuncs.batchcompute.transformunittest.v20151111;

import com.aliyuncs.batchcompute.pojo.v20151111.Quotas;
import com.aliyuncs.batchcompute.util.FileLoader;
import com.fasterxml.jackson.databind.ObjectMapper;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by guangchun.luo on 16/3/4.
 */
public class GetQuotasTest extends TestCase {

    @Test
    public void testGetQuotas() throws IOException {

        String body = FileLoader.loadFile("resources/v20151111/getQuotas.json");

        ObjectMapper mapper = new ObjectMapper();
        Quotas quotas = mapper.readValue(body, Quotas.class);

        assertEquals(4, quotas.getAvailableClusterInstanceDataDiskType().size());
        assertEquals(4, quotas.getAvailableClusterInstanceSystemDiskType().size());
        assertEquals(17, quotas.getAvailableClusterInstanceType().size());


        assertEquals("bcs.a2.3xlarge",quotas.getAvailableClusterInstanceType().get(0));
    }



}
