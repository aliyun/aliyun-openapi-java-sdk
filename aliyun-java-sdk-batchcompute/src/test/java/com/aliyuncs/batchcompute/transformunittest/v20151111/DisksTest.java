package com.aliyuncs.batchcompute.transformunittest.v20151111;

import com.aliyuncs.batchcompute.pojo.v20151111.DataDisk;
import com.aliyuncs.batchcompute.pojo.v20151111.Disks;
import com.aliyuncs.batchcompute.pojo.v20151111.SystemDisk;
import com.aliyuncs.batchcompute.util.FileLoader;
import junit.framework.TestCase;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by guangchun.luo on 16/3/4.
 */
public class DisksTest extends TestCase {

    @Test
    public void testDisks() throws IOException {

        String body = FileLoader.loadFile("resources/v20151111/disks.json");

        ObjectMapper mapper = new ObjectMapper();
        Disks disks = mapper.readValue(body, Disks.class);

        assertEquals(400, disks.getDataDisk().getSize());
        assertEquals("ephemeral", disks.getDataDisk().getType());
        assertEquals("/home/admin/xxx", disks.getDataDisk().getMountPoint());

        assertEquals(80, disks.getSystemDisk().getSize());
        assertEquals("ephemeral", disks.getSystemDisk().getType());

    }


    @Test
    public void testDisks2() throws IOException {

        Disks disks = new Disks();
        SystemDisk d = new SystemDisk();
        disks.setSystemDisk(d);
        //d.setSize(20);

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
        String str = mapper.writeValueAsString(disks);
        System.out.println(str);

        assertEquals("{\"SystemDisk\":{}}", str);


        ObjectMapper mapper2 = new ObjectMapper();

        Disks disks2  = mapper2.readValue(str, Disks.class);

        System.out.println(disks2.getSystemDisk().getSize());

        assertEquals(0,disks2.getSystemDisk().getSize());


    }



    @Test
    public void testDisks3() throws IOException {

        DataDisk dataDisk = new DataDisk();
        dataDisk.setType("ephemeral");
        dataDisk.setSize(500);
        dataDisk.setMountPoint("/home/admin/xxx");

        SystemDisk systemDisk = new SystemDisk();
        systemDisk.setType("ephemeral");
        systemDisk.setSize(50);


        Disks disks = new Disks();
        disks.setDataDisk(dataDisk);
        disks.setSystemDisk(systemDisk);


        ObjectMapper mapper = new ObjectMapper();

        //默认值不序列化
        mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);

        String body = mapper.writeValueAsString(disks);


        ObjectMapper mapper2 = new ObjectMapper();
        Disks disks2 = mapper2.readValue(body, Disks.class);

        assertEquals(500, disks2.getDataDisk().getSize());
        assertEquals("ephemeral", disks2.getDataDisk().getType());
        assertEquals("/home/admin/xxx", disks2.getDataDisk().getMountPoint());

        assertEquals(50, disks2.getSystemDisk().getSize());
        assertEquals("ephemeral", disks2.getSystemDisk().getType());

    }

}
