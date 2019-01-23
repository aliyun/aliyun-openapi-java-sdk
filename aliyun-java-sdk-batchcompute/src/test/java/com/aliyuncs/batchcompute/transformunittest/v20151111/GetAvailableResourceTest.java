package com.aliyuncs.batchcompute.transformunittest.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchComputeClient;
import com.aliyuncs.batchcompute.pojo.v20151111.AvailableResource;
import com.aliyuncs.batchcompute.util.FileLoader;
import com.fasterxml.jackson.databind.ObjectMapper;
import junit.framework.TestCase;
import java.util.List;
import java.io.IOException;
import org.junit.Test;

public class GetAvailableResourceTest extends TestCase {

    @Override
    public void setUp() throws Exception {
        BatchComputeClient.verbose = true;
    }

    @Test
    public void testGetAvailableResource () throws IOException {

        String body = FileLoader.loadFile("resources/v20151111/availableResource.json");

        ObjectMapper mapper = new ObjectMapper();

        AvailableResource resource = mapper.readValue(body, AvailableResource.class);

        List<AvailableResource.InstanceDesc> clusterInstanceList = resource.getAvailableClusterInstanceType();
        assertEquals(1, clusterInstanceList.size());
        for (int i = 0; i < clusterInstanceList.size(); i++){
            AvailableResource.InstanceDesc clusterInstance = clusterInstanceList.get(i);
            assertEquals(4, clusterInstance.getCpuCore());
            assertEquals("ecs.sn2ne.xlarge", clusterInstance.getInstanceType());
            assertEquals(16, clusterInstance.getMemorySize());

            AvailableResource.NetWorkDesc netWorkDesc = clusterInstance.getNetWork();
            assertEquals(false, netWorkDesc.getClassic());
            assertEquals(true, netWorkDesc.getVpc());
        }

        List<AvailableResource.InstanceDesc> clusterSpotInstanceList = resource.getAvailableSpotInstanceType();
        assertEquals(1, clusterSpotInstanceList.size());
        for (int i = 0; i < clusterSpotInstanceList.size(); i++){
            AvailableResource.InstanceDesc clusterInstance = clusterSpotInstanceList.get(i);
            assertEquals(4, clusterInstance.getCpuCore());
            assertEquals("ecs.sn2ne.xlarge", clusterInstance.getInstanceType());
            assertEquals(16, clusterInstance.getMemorySize());

            AvailableResource.NetWorkDesc netWorkDesc = clusterInstance.getNetWork();
            assertEquals(false, netWorkDesc.getClassic());
            assertEquals(true, netWorkDesc.getVpc());
        }

        List<AvailableResource.InstanceDesc> clusterPrepaidInstanceList = resource.getAvailablePrepaidInstanceType();
        assertEquals(1, clusterPrepaidInstanceList.size());
        for (int i = 0; i < clusterPrepaidInstanceList.size(); i++){
            AvailableResource.InstanceDesc clusterInstance = clusterPrepaidInstanceList.get(i);
            assertEquals(4, clusterInstance.getCpuCore());
            assertEquals("ecs.sn2ne.xlarge", clusterInstance.getInstanceType());
            assertEquals(16, clusterInstance.getMemorySize());

            AvailableResource.NetWorkDesc netWorkDesc = clusterInstance.getNetWork();
            assertEquals(false, netWorkDesc.getClassic());
            assertEquals(true, netWorkDesc.getVpc());
        }

        List<String> availableResList = resource.getAvailableResourceType();
        assertEquals(2, availableResList.size());
        for (int i = 0; i < availableResList.size(); i++){
            if (i == 0){
                assertEquals("OnDemand", availableResList.get(i));
            }
            else{
                assertEquals("Spot", availableResList.get(i));
            }
        }

        List<String> availableSystemDiskTypeList = resource.getAvailableSystemDiskType();
        assertEquals(2, availableSystemDiskTypeList.size());
        for (int i = 0; i < availableSystemDiskTypeList.size(); i++){
            if (i == 0){
                assertEquals("cloud_efficiency", availableSystemDiskTypeList.get(i));
            }
            else{
                assertEquals("cloud_ssd", availableSystemDiskTypeList.get(i));
            }
        }

        List<String> availableDataDiskTypeList = resource.getAvailableDataDiskType();
        assertEquals(2, availableDataDiskTypeList.size());
        for (int i = 0; i < availableDataDiskTypeList.size(); i++){
            if (i == 0){
                assertEquals("cloud_efficiency", availableDataDiskTypeList.get(i));
            }
            else{
                assertEquals("cloud_ssd", availableDataDiskTypeList.get(i));
            }
        }

    }
}
