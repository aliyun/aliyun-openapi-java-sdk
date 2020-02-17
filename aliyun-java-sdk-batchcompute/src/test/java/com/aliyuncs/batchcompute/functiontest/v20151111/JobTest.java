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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by guangchun.luo on 15/4/14.
 */
public class JobTest extends TestCase {

    private static BatchCompute client;

    private String gImageId;
    private String gMnsEndpoint;

    private String gClusterId;

    private String gJobId;
    private String gInstanceType;


    @Override
    public void setUp() throws Exception {
        Config cfg = Config.getInstance();

        BatchComputeClient.verbose = true;
        BatchComputeClient.addRequestHeader("x-acs-source-ip", "127.0.0.1");
        BatchComputeClient.addRequestHeader("x-acs-secure-transport", "true");
        gMnsEndpoint = "mns."+cfg.getRegionId()+".aliyuncs.com";
        gImageId = "img-ubuntu";

        client = new BatchComputeClient(cfg.getRegionId(), cfg.getAccessId(), cfg.getAccessKey());

        List<String> arr = client.getQuotas().getQuotas().getAvailableClusterInstanceType();
        gInstanceType = arr.get(0);
    }
    @Test
    public void testListInstance() throws ClientException {

        List<Job> list = client.listJobs().getItems();
        if(list!=null && list.size()>0){
            String jobId = list.get(0).getId();
            listAllInstances(jobId);
        }
    }

    public List<Instance> listAllInstances(String jobId) throws ClientException{

        List<Instance> allInstances = new ArrayList<Instance>();
        List<Task> allTasks = new ArrayList<Task>();

        String nextMarker = "";
        do {
            ListTasksResponse listTasksResponse = client.listTasks(jobId, nextMarker, 100);
            List<Task> taskList = listTasksResponse.getItems();
            allTasks.addAll(taskList);

            nextMarker = listTasksResponse.getNextMarker();
        }while(nextMarker!=null && !nextMarker.equals(""));


        nextMarker = "";

        for(Task task: allTasks){
            ListInstancesResponse listInstancesResponse = client.listInstances(jobId, task.getTaskName(), nextMarker, 100);
            do {

                List<Instance> instanceList = listInstancesResponse.getItems();
                allInstances.addAll(instanceList);

                nextMarker = listInstancesResponse.getNextMarker();
            }while(nextMarker!=null && !nextMarker.equals(""));
        }

        return allInstances;
    }




    @Test
    public void testJob() throws ClientException {


        // 1. create cluster

        ClusterDescription desc = getClusterDesc();

        CreateClusterResponse res = client.createCluster(desc);

        assertEquals(201, res.getStatusCode());

        gClusterId = res.getClusterId();
        System.out.println("-------->ClusterId: " + gClusterId);
        assertTrue(gClusterId.startsWith("cls-"));

        //gClusterId = "cls-6kilcg94rdtk004q";


        // 2. create job
        JobDescription jobDesc = getJobDesc();

        CreateJobResponse createJobResponse = client.createJob(jobDesc, "sss-"+new Date().getTime());
        gJobId = createJobResponse.getJobId();
        assertTrue(201 == createJobResponse.getStatusCode());


        // auto cluster job

        JobDescription jobDescAutoCluster = getJobDescWithAutoCluster();

        CreateJobResponse createJobAutoClusterRes = client.createJob(jobDescAutoCluster);
        String gJobId2 = createJobAutoClusterRes.getJobId();
        assertTrue(201 == createJobAutoClusterRes.getStatusCode());




        //gJobId = "job-00000000564ECC3F0000A25D00000074";

        // 3. list job
        ListJobsResponse listJobsResponse = client.listJobs();

        List<Job> jobList = listJobsResponse.getItems();
        assertTrue(jobList.size() > 0);


        ListJobsRequest listJobsRequest2 = new ListJobsRequest();
        listJobsRequest2.setMaxItemCount(60);
        //listJobsRequest2.setMarker("");
        ListJobsResponse listJobsResponse2 = client.listJobs(listJobsRequest2);
        List<Job> jobList2 = listJobsResponse2.getItems();
        assertTrue(jobList2.size() > 0);

        ListJobsResponse listJobsResponse3 = client.listJobs("Waiting");

        List<Job> jobList3 = listJobsResponse3.getItems();
        assertTrue(jobList3.size() > 0);




        // 4. get job
        GetJobResponse getJobResponse = client.getJob(gJobId);
        Job job = getJobResponse.getJob();

        assertEquals("testJob", job.getName());
        assertTrue(job.getCreationTime() != null);


        // 5. get job desc
        GetJobDescriptionResponse getJobDescriptionResponse = client.getJobDescription(gJobId);
        JobDescription jobDesc2 = getJobDescriptionResponse.getJobDescription();

        assertEquals("testJob", jobDesc2.getName());
        assertTrue(jobDesc2.getPriority() == 1);
        assertTrue(jobDesc2.isJobFailOnInstanceFail() == false);
        assertTrue(jobDesc2.isAutoRelease() == true);

        TaskDescription taskDesc2 = jobDesc2.getDag().getTasks().get("task_1");
        assertEquals(gClusterId, taskDesc2.getClusterId());

        TaskDescription.CredentialConfig credentialConfig = taskDesc2.getCredentialConfig();
        assertEquals("testRole", credentialConfig.getServiceRole());
        assertEquals(1, credentialConfig.getChains().size());
        assertEquals("testRoleChain", credentialConfig.getChains().get(0).getRole());
        assertEquals(123456, credentialConfig.getChains().get(0).getUserId());

        Topic tp = jobDesc2.getNotification().getTopic();

        assertEquals(tp.getName(),"tp_n1");
        assertEquals(tp.getEndpoint(),gMnsEndpoint);
        assertEquals(tp.getEvents().size(), 2);


        //get job desc 2
        GetJobDescriptionResponse getJobDescriptionResponse_auto = client.getJobDescription(gJobId2);
        JobDescription jobDesc_auto = getJobDescriptionResponse_auto.getJobDescription();

        assertEquals("testJobAutoCluster", jobDesc_auto.getName());
        assertTrue(jobDesc_auto.getPriority() == 1);
        TaskDescription taskDesc_auto = jobDesc_auto.getDag().getTasks().get("task_1");
        Disks disks = taskDesc_auto.getAutoCluster().getConfigs().getDisks();
        assertEquals("/disk1",disks.getDataDisk().getMountPoint());
        assertEquals("ephemeral",disks.getDataDisk().getType());
        assertTrue(5==disks.getDataDisk().getSize());

        assertEquals("ephemeral",disks.getSystemDisk().getType());
        assertTrue(40==disks.getSystemDisk().getSize());

        assertTrue(taskDesc_auto.getAutoCluster().isReserveOnFail());




        // 6. list tasks
        ListTasksResponse listTasksResponse = client.listTasks(gJobId);
        assertEquals("task_1", listTasksResponse.getItems().get(0).getTaskName());

        // 7. getTask
        GetTaskResponse getTaskResponse = client.getTask(gJobId, "task_1");
        assertEquals(200, getTaskResponse.getStatusCode());
        assertTrue(getTaskResponse.getTask().getState() != null);

        // 8. list instance

        ListInstancesResponse listInstancesResponse = client.listInstances(gJobId, "task_1");

        assertTrue(listInstancesResponse.getItems().size() > 0);
        assertTrue(listInstancesResponse.getItems().get(0).getInstanceId() == 0);


        // 9.  get instance
        GetInstanceResponse getInstanceResponse = client.getInstance(gJobId, "task_1", 0);
        assertTrue(getInstanceResponse.getInstance().getInstanceId() == 0);


        // 10.  stop job
        StopJobResponse stopJobResponse = client.stopJob(gJobId);
        assertTrue(201 == stopJobResponse.getStatusCode());

        StopJobResponse stopJobResponseAutoClusterJob = client.stopJob(gJobId2);
        assertTrue(201 == stopJobResponseAutoClusterJob.getStatusCode());


        // 11  change job priority
        ChangeJobPriorityResponse changeJobPriorityResponse = client.changeJobPriority(gJobId, 10);
        assertTrue(200 == changeJobPriorityResponse.getStatusCode());

        GetJobDescriptionResponse getJobDescriptionResponse3 = client.getJobDescription(gJobId);
        JobDescription jobDesc3 = getJobDescriptionResponse3.getJobDescription();
        assertTrue(jobDesc3.getPriority() == 10);

        // 12. start
        StartJobResponse startJobResponse = client.startJob(gJobId);
        assertTrue(201 == startJobResponse.getStatusCode());

        // 13.  stop again
        StopJobResponse stopJobResponse2 = client.stopJob(gJobId);
        assertTrue(201 == stopJobResponse2.getStatusCode());


        // 14. delete job
        DeleteJobResponse deleteJobResponse = client.deleteJob(gJobId);
        int delJobStatus = deleteJobResponse.getStatusCode();
        System.out.println("--------delete job status code:" + delJobStatus);
        assertTrue(200 == delJobStatus || 204 == delJobStatus || 202 == delJobStatus);


        //delete auto cluster job
        DeleteJobResponse deleteJobResponse2 = client.deleteJob(gJobId2);
        int delJobStatus2 = deleteJobResponse2.getStatusCode();
        System.out.println("--------delete auto cluster job status code:" + delJobStatus2);
        assertTrue(200 == delJobStatus2 || 204 == delJobStatus2 || 202 == delJobStatus2);


        // 15. delete cluster
        DeleteClusterResponse deleteClusterResponse = client.deleteCluster(gClusterId);

        int delClusterStatus = deleteClusterResponse.getStatusCode();
        System.out.println("--------delete cluster status code:" + delClusterStatus);

        assertTrue(200 == delClusterStatus || 204 == delClusterStatus || 202 == delClusterStatus);
    }


    private ClusterDescription getClusterDesc() {
        ClusterDescription desc = new ClusterDescription();

        desc.setName("cluster_test");
        desc.setImageId(gImageId);
        desc.setDescription("java sdk test");


        GroupDescription groupDesc = new GroupDescription();
        groupDesc.setDesiredVMCount(3);
        groupDesc.setInstanceType(gInstanceType);
        groupDesc.setResourceType("OnDemand");
        desc.addGroup("group1", groupDesc);

        return desc;
    }

    private JobDescription getJobDesc() {
        JobDescription desc = new JobDescription();

        desc.setName("testJob");
        desc.setPriority(1);
        desc.setDescription("JAVA SDK TEST");
        desc.setType("DAG");
        desc.setJobFailOnInstanceFail(false);
        desc.setAutoRelease(true);


        DAG dag = new DAG();

        dag.addTask(getTaskDesc());

        desc.setDag(dag);

        Notification noti = new Notification();
        Topic topic = new Topic();
        topic.addEvent(Topic.ON_JOB_FAILED);
        topic.addEvent(Topic.ON_JOB_FINISHED);
        noti.setTopic(topic);
        topic.setName("tp_n1");

        topic.setEndpoint(gMnsEndpoint);
        desc.setNotification(noti);

        return desc;
    }

    private TaskDescription getTaskDesc() {
        TaskDescription task = new TaskDescription();

        task.setClusterId(gClusterId);
        task.setInstanceCount(1);
        task.setMaxRetryCount(2);
        task.setTaskName("task_1");
        task.setTimeout(10000);

        TaskDescription.CredentialConfig credentialConfig = new TaskDescription.CredentialConfig();
        credentialConfig.setServiceRole("testRole");
        TaskDescription.ChainInfo chainInfo = new TaskDescription.ChainInfo();
        chainInfo.setRole("testRoleChain");
        chainInfo.setUserId(123456);
        credentialConfig.addChainInfo(chainInfo);
        task.setCredentialConfig(credentialConfig);

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

        task.addInputMapping("oss://my-bucket/disk1/", "/home/admin/disk1/");
        task.addOutputMapping("/home/admin/disk2/", "oss://my-bucket/disk2/");
        //task.addLogMapping( "/home/admin/a.log","oss://my-bucket/a.log");

        return task;
    }

    private JobDescription getJobDescWithAutoCluster() {
        JobDescription desc = new JobDescription();

        desc.setName("testJobAutoCluster");
        desc.setPriority(1);
        desc.setDescription("JAVA SDK TEST");
        desc.setType("DAG");
        desc.setJobFailOnInstanceFail(true);

        DAG dag = new DAG();

        dag.addTask(getTaskDescWithAutoCluster());

        desc.setDag(dag);
        return desc;
    }

    private TaskDescription getTaskDescWithAutoCluster() {
        TaskDescription task = new TaskDescription();

        AutoCluster autoCluster = new AutoCluster();
        autoCluster.setImageId(gImageId);
        autoCluster.setInstanceType(gInstanceType);
        autoCluster.setResourceType("OnDemand");
        autoCluster.setReserveOnFail(true);

        DataDisk dataDisk = new DataDisk();
        dataDisk.setMountPoint("/disk1");
        dataDisk.setSize(5);  // 5~1024
        dataDisk.setType("ephemeral");

        SystemDisk systemDisk = new SystemDisk();
        systemDisk.setSize(40); // 40~500
        systemDisk.setType("ephemeral");

        Configs configs = new Configs();
        Disks disks = new Disks();
        disks.setDataDisk(dataDisk);
        disks.setSystemDisk(systemDisk);
        configs.setDisks(disks);

        autoCluster.setConfigs(configs);

        task.setAutoCluster(autoCluster);

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

        task.addInputMapping("oss://my-bucket/disk1/", "/home/admin/disk1/");
        task.addOutputMapping("/home/admin/disk2/", "oss://my-bucket/disk2/");
        //task.addLogMapping( "/home/admin/a.log","oss://my-bucket/a.log");

        TaskDescription.CredentialConfig credentialConfig = new TaskDescription.CredentialConfig();
        credentialConfig.setServiceRole("testRole");
        TaskDescription.ChainInfo chainInfo = new TaskDescription.ChainInfo();
        chainInfo.setRole("testRoleChain");
        chainInfo.setUserId(123456);
        credentialConfig.addChainInfo(chainInfo);
        task.setCredentialConfig(credentialConfig);


        return task;
    }

}
