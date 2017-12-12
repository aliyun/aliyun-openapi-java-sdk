/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyuncs.batchcompute.functiontest.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchCompute;
import com.aliyuncs.batchcompute.main.v20151111.BatchComputeClient;
import com.aliyuncs.batchcompute.model.v20151111.*;
import com.aliyuncs.batchcompute.pojo.v20151111.*;
import com.aliyuncs.batchcompute.util.Config;
import com.aliyuncs.exceptions.ClientException;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;


/**
 * Created by guangchun.luo on 15/4/14.
 */
public class ClusterMountTest extends TestCase {

    private static BatchCompute client;

    private String gImageId =  "img-ubuntu";

    private String gClusterId;

    private String gInstanceType;

    @Override
    public void setUp() throws Exception {
        Config cfg = Config.getInstance();

        BatchComputeClient.verbose = true;
        BatchComputeClient.addRequestHeader("x-acs-source-ip", "127.0.0.1");
        BatchComputeClient.addRequestHeader("x-acs-secure-transport", "true");


        client = new BatchComputeClient(cfg.getRegionId(), cfg.getAccessId(), cfg.getAccessKey());

        List<String> arr = client.getQuotas().getQuotas().getAvailableClusterInstanceType();
        gInstanceType = arr.get(0);
    }

    @Test
    public void testCluster() throws ClientException {


        //1. create cluster

        ClusterDescription desc = getClusterDesc();

        CreateClusterResponse res = client.createCluster(desc);

        assertEquals(201, res.getStatusCode());

        gClusterId = res.getClusterId();
        System.out.println("-------->ClusterId: "+gClusterId);
        assertTrue(gClusterId.startsWith("cls-"));



         //2. get cluster

        GetClusterResponse getClusterResponse = client.getCluster(gClusterId);
        Cluster cluster  = getClusterResponse.getCluster();

        assertEquals("cluster_test", cluster.getName());
        assertEquals(gImageId, cluster.getImageId());
        assertEquals("java sdk test", cluster.getDescription());

        Group group = cluster.getGroups().get("group1");

        assertEquals("OnDemand", group.getResourceType());
        assertEquals(gInstanceType, group.getInstanceType());
        assertTrue(3 >= group.getActualVMCount());
        assertTrue(3 == group.getDesiredVMCount());


        assertEquals("echo 123", cluster.getBootstrap());
        assertEquals("d", cluster.getEnvVars().get("c"));


        //  mounts
        Mounts mounts = cluster.getConfigs().getMounts();
        assertEquals(mounts.getEntries().get(0).getDestination(), "/home/admin/nas1");
        assertEquals(mounts.getEntries().get(0).getSource(), "nas://0266ef-xx1.cn-hangzhou.nas.aliyuncs.com");
        assertEquals(mounts.getEntries().get(0).isWriteSupport(), false);

        assertEquals(mounts.getLocale(), "UTF-8");
        assertEquals(mounts.isLock(), true);
        assertEquals(mounts.isCacheSupport(), true);

        assertEquals(mounts.getNas().getAccessGroup().get(0), "group1");
        assertEquals(mounts.getNas().getFileSystem().get(0), "filesystem1");

        assertEquals(mounts.getOss().getAccessKeyId(), "id");
        assertEquals(mounts.getOss().getAccessKeySecret(), "key");

        //  networks
        Networks networks = cluster.getConfigs().getNetworks();
        assertEquals(networks.getClassic().getAllowIpAddress().get(0), "10.1.1.1");
        assertEquals(networks.getClassic().getAllowSecurityGroup().get(0), "group1");



        // 6. delete cluster
        DeleteClusterResponse deleteClusterResponse = client.deleteCluster(gClusterId);

        int delStatusCode = deleteClusterResponse.getStatusCode();
        System.out.println("--------delete status code:"+ delStatusCode);

        assertTrue( 200 == delStatusCode);
    }



    private ClusterDescription getClusterDesc(){
        ClusterDescription desc = new ClusterDescription();

        desc.setName("cluster_test");
        desc.setImageId(gImageId);
        desc.setDescription("java sdk test");

        GroupDescription groupDesc = new GroupDescription();
        groupDesc.setDesiredVMCount(3);
        groupDesc.setInstanceType(gInstanceType);
        groupDesc.setResourceType("OnDemand");
        desc.addGroup("group1", groupDesc);


        desc.setBootstrap("echo 123");
        desc.addEnvVar("c","d");


        Configs cc  =  new Configs();

        cc.setMounts(getMounts());
        cc.setNetworks(getNetworks());

        desc.setConfigs(cc);

        return desc;
    }


    private Mounts getMounts(){
        Mounts mounts = new Mounts();
        MountEntry entry = new MountEntry();
        entry.setDestination("/home/admin/nas1");
        entry.setSource("nas://0266ef-xx1.cn-hangzhou.nas.aliyuncs.com");
        entry.setWriteSupport(false);

        mounts.setLock(true);
        mounts.setLocale("UTF-8");

        NASConfig nas = new NASConfig();
        nas.addAccessGroup("group1");
        nas.addFileSystem("filesystem1");
        mounts.setNas(nas);

        OSSConfig ossConfig = new OSSConfig();
        ossConfig.setAccessKeyId("id");
        ossConfig.setAccessKeySecret("key");
        mounts.setOss(ossConfig);

        mounts.addEntries(entry);
        return mounts;
    }

    private Networks getNetworks(){
        Networks nw = new Networks();
        ClassicNetWork c = new ClassicNetWork();
        c.addAllowIpAddress("10.1.1.1");
        c.addAllowSecurityGroup("group1");
        nw.setClassic(c);
        return nw;
    }

}
