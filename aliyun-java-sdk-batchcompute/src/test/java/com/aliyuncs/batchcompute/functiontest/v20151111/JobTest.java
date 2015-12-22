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

import com.aliyuncs.batchcompute.main.v20151111.*;
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
public class JobTest extends TestCase {

    private static BatchCompute client;

    private String gImageId;

    private String gClusterId;

    private String gJobId;


    @Override
    public void setUp() throws Exception {
        Config cfg = Config.getInstance();

        BatchComputeClient.verbose = true;
        BatchComputeClient.addRequestHeader("x-acs-source-ip", "127.0.0.1");
        BatchComputeClient.addRequestHeader("x-acs-secure-transport", "true");

        gImageId = cfg.getEcsImageId();
        System.out.println("==========" + gImageId);

        client = new BatchComputeClient(cfg.getRegionId(), cfg.getAccessId(), cfg.getAccessKey());
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

        CreateJobResponse createJobResponse = client.createJob(jobDesc);
        gJobId = createJobResponse.getJobId();
        assertTrue(201 == createJobResponse.getStatusCode());


        //gJobId = "job-00000000564ECC3F0000A25D00000074";

        // 3. list job
        ListJobsResponse listJobsResponse = client.listJobs();

        List<Job> jobList = listJobsResponse.getItems();
        assertTrue(jobList.size() > 0);



        ListJobsRequest listJobsRequest2 = new ListJobsRequest();
        listJobsRequest2.setMaxItemCount(60);
        listJobsRequest2.setMarker("");
        ListJobsResponse listJobsResponse2 = client.listJobs(listJobsRequest2);
        List<Job> jobList2 = listJobsResponse2.getItems();
        assertTrue(jobList2.size() > 0);



        // 4. get job
        GetJobResponse getJobResponse = client.getJob(gJobId);
        Job job = getJobResponse.getJob();

        assertEquals("jobName1", job.getName());
        assertTrue(job.getCreationTime() != null);


        // 5. get job desc
        GetJobDescriptionResponse getJobDescriptionResponse = client.getJobDescription(gJobId);
        JobDescription jobDesc2 = getJobDescriptionResponse.getJobDescription();

        assertEquals("jobName1", jobDesc2.getName());
        assertTrue(jobDesc2.getPriority() == 1);


        TaskDescription taskDesc2 = jobDesc2.getDag().getTasks().get("task_1");
        assertEquals(gClusterId, taskDesc2.getClusterId());


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
        groupDesc.setInstanceType("ecs.t1.small");
        groupDesc.setResourceType("OnDemand");
        desc.addGroup("group1", groupDesc);

        return desc;
    }

    private JobDescription getJobDesc() {
        JobDescription desc = new JobDescription();

        desc.setName("jobName1");
        desc.setPriority(1);
        desc.setType("DAG");
        desc.setJobFailOnInstanceFail(true);

        DAG dag = new DAG();

        dag.addTask(getTaskDesc());

        desc.setDag(dag);
        return desc;
    }

    private TaskDescription getTaskDesc() {
        TaskDescription task = new TaskDescription();

        task.setClusterId(gClusterId);
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
        task.addOutputtMapping("/home/admin/disk2/", "oss://my-bucket/disk2/");
        //task.addLogMapping( "/home/admin/a.log","oss://my-bucket/a.log");

        return task;
    }

}
