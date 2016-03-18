package com.aliyuncs.batchcompute.transformunittest.v20151111;

import com.aliyuncs.batchcompute.pojo.v20151111.DataDisk;
import com.aliyuncs.batchcompute.pojo.v20151111.Disks;
import com.aliyuncs.batchcompute.pojo.v20151111.SystemDisk;
import com.aliyuncs.batchcompute.util.FileLoader;
import com.aliyuncs.exceptions.ClientException;
import junit.framework.TestCase;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
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

        //null或“”不序列化
        mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_EMPTY);

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
