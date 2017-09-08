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
public class JobMountsTest extends TestCase {

    private static BatchCompute client;

    private String gImageId;


    private String gJobId;

    private String gInstanceType;


    @Override
    public void setUp() throws Exception {
        Config cfg = Config.getInstance();

        BatchComputeClient.verbose = true;
        BatchComputeClient.addRequestHeader("x-acs-source-ip", "127.0.0.1");
        BatchComputeClient.addRequestHeader("x-acs-secure-transport", "true");

        gImageId = "img-ubuntu";


        client = new BatchComputeClient(cfg.getRegionId(), cfg.getAccessId(), cfg.getAccessKey());

        List<String> arr = client.getQuotas().getQuotas().getAvailableClusterInstanceType();
        gInstanceType = arr.get(0);
    }

    @Test
    public void testJob() throws ClientException {

        // 2. create job
        JobDescription jobDesc = getJobDesc();

        CreateJobResponse createJobResponse = client.createJob(jobDesc);
        gJobId = createJobResponse.getJobId();
        assertTrue(201 == createJobResponse.getStatusCode());


        // 5. get job desc
        GetJobDescriptionResponse getJobDescriptionResponse = client.getJobDescription(gJobId);
        JobDescription jobDesc2 = getJobDescriptionResponse.getJobDescription();

        assertEquals("testJob", jobDesc2.getName());
        assertTrue(jobDesc2.getPriority() == 1);

        TaskDescription taskDesc2 = jobDesc2.getDag().getTasks().get("task_1");


        //  check task mounts
        Mounts taskMounts  = taskDesc2.getMounts();
        assertEquals(taskMounts.getEntries().get(0).getDestination(), "/home/admin/nas1");
        assertEquals(taskMounts.getEntries().get(0).getSource(), "nas://0266ef-xx1.cn-hangzhou.nas.aliyuncs.com");
        assertEquals(taskMounts.getEntries().get(0).isWriteSupport(), false);

        assertEquals(taskMounts.getLocale(), "UTF-8");
        assertEquals(taskMounts.isLock(), true);

        assertEquals(taskMounts.getNas().getAccessGroup().get(0), "group1");
        assertEquals(taskMounts.getNas().getFileSystem().get(0), "filesystem1");

        assertEquals(taskMounts.getOss().getAccessKeyId(), "id");
        assertEquals(taskMounts.getOss().getAccessKeySecret(), "key");
        assertEquals(taskMounts.getOss().getSecurityToken(), "token");


        // auto  mounts
        Mounts autoMounts = taskDesc2.getAutoCluster().getConfigs().getMounts();
        assertEquals(autoMounts.getEntries().get(0).getDestination(), "/home/admin/nas1");
        assertEquals(autoMounts.getEntries().get(0).getSource(), "nas://0266ef-xx1.cn-hangzhou.nas.aliyuncs.com");
        assertEquals(autoMounts.getEntries().get(0).isWriteSupport(), false);

        assertEquals(autoMounts.getLocale(), "UTF-8");
        assertEquals(autoMounts.isLock(), true);

        assertEquals(autoMounts.getNas().getAccessGroup().get(0), "group1");
        assertEquals(autoMounts.getNas().getFileSystem().get(0), "filesystem1");

        assertEquals(autoMounts.getOss().getAccessKeyId(), "id");
        assertEquals(autoMounts.getOss().getAccessKeySecret(), "key");
        assertEquals(autoMounts.getOss().getSecurityToken(), "token");

        // auto networks
        Networks autoNetworks = taskDesc2.getAutoCluster().getConfigs().getNetworks();
        assertEquals(autoNetworks.getClassic().getAllowIpAddress().get(0), "10.1.1.1");
        assertEquals(autoNetworks.getClassic().getAllowSecurityGroup().get(0), "group1");


        // 10.  stop job
        StopJobResponse stopJobResponse = client.stopJob(gJobId);
        assertTrue(201 == stopJobResponse.getStatusCode());


        // 14. delete job
        DeleteJobResponse deleteJobResponse = client.deleteJob(gJobId);
        int delJobStatus = deleteJobResponse.getStatusCode();
        System.out.println("--------delete job status code:" + delJobStatus);
        assertTrue(200 == delJobStatus || 204 == delJobStatus || 202 == delJobStatus);

    }



    private JobDescription getJobDesc() {
        JobDescription desc = new JobDescription();

        desc.setName("testJob");
        desc.setPriority(1);
        desc.setDescription("JAVA SDK TEST");
        desc.setType("DAG");
        desc.setJobFailOnInstanceFail(true);
        desc.setAutoRelease(false);

        DAG dag = new DAG();

        dag.addTask(getTaskDesc());

        desc.setDag(dag);

        return desc;
    }

    private TaskDescription getTaskDesc() {
        TaskDescription task = new TaskDescription();


        task.setInstanceCount(1);
        task.setMaxRetryCount(2);
        task.setTaskName("task_1");
        task.setTimeout(10000);

        Parameters parameters = new Parameters();
        Command cmd = new Command();
        cmd.setCommandLine("python main.py");
        cmd.addEnvVars("a", "b");
        cmd.setPackagePath("oss://my-bucket/test/worker.tar.gz");
        parameters.setCommand(cmd);
        parameters.setStderrRedirectPath("oss://my-bucket/test/logs/");
        parameters.setStdoutRedirectPath("oss://my-bucket/test/logs/");
        InputMappingConfig input = new InputMappingConfig();
        input.setLocale("GBK");
        input.setLock(true);
        parameters.setInputMappingConfig(input);

        task.setParameters(parameters);

        //mounts
        task.setMounts(getMounts());

        AutoCluster auto = new AutoCluster();

        auto.setImageId(gImageId);
        auto.setInstanceType(gInstanceType);
        auto.setResourceType("OnDemand");

        Configs cc = new Configs();

        // cfg mounts
        cc.setMounts(getMounts());

        // cfg networks
        cc.setNetworks(getNetworks());

        auto.setConfigs(cc);
        task.setAutoCluster(auto);



        return task;
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
        ossConfig.setSecurityToken("token");
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
