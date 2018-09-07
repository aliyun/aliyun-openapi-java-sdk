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

package com.aliyuncs.batchcompute.modelunittest.v20151111;


import com.aliyuncs.batchcompute.model.v20151111.CreateJobRequest;
import com.aliyuncs.batchcompute.pojo.v20151111.*;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import junit.framework.TestCase;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by guangchun.luo on 15/4/14.
 */
public class CreateJobRequestTest extends TestCase {

    @Test
    public void testDefaultConstructor() {
        CreateJobRequest req = new CreateJobRequest();
        assertEquals(req.getMethod(), MethodType.POST);
        assertEquals(req.getUriPattern(), "/jobs");
        assertEquals(req.getProduct(), "BatchCompute");
    }

    @Test
    public void testConstructor() throws ClientException, IOException {

        JobDescription jobDescription = createJob();

        CreateJobRequest req = new CreateJobRequest();
        req.setJobDescription(jobDescription);

        assertEquals(req.getMethod(), MethodType.POST);
        assertEquals(req.getUriPattern(), "/jobs");
        assertEquals(req.getProduct(), "BatchCompute");


        String contentString = null;
        try {
            contentString = new String(req.getHttpContent(), "utf-8");
            System.out.println(contentString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        ObjectMapper objectMapper = new ObjectMapper();

        JobDescription jobDesc = objectMapper.readValue(contentString, JobDescription.class);


        //check

        assertEquals("jobName1", jobDesc.getName());
        assertEquals("DAG", jobDesc.getType());
        assertEquals("testJob", jobDesc.getDescription());
        assertTrue(1==jobDesc.getPriority());
        assertTrue(false==jobDesc.isJobFailOnInstanceFail());
        assertTrue(true==jobDesc.isAutoRelease());



        Map<String, TaskDescription> taskDescMap2 = jobDesc.getDag().getTasks();

        assertTrue(taskDescMap2.containsKey("task_1"));


        TaskDescription a = taskDescMap2.get("task_1");
        assertEquals("clu-001",a.getClusterId());
        assertEquals("task_1", a.getTaskName());

        assertEquals("m-xxx", a.getAutoCluster().getECSImageId());
        assertEquals("img-sxxx", a.getAutoCluster().getImageId());
        assertEquals("OnDemand", a.getAutoCluster().getResourceType());
        assertEquals("ecs", a.getAutoCluster().getInstanceType());



        assertTrue(1 == a.getInstanceCount());
        assertTrue(2 == a.getMaxRetryCount());
        assertTrue(10000 == a.getTimeout());


        Parameters p = a.getParameters();

        assertEquals("oss://my-bucket/test/logs/", p.getStderrRedirectPath());
        assertEquals("oss://my-bucket/test/logs/", p.getStdoutRedirectPath());
        Command cmd = p.getCommand();
        assertEquals("python main.py", cmd.getCommandLine());
        assertEquals("oss://my-bucket/test/worker.tar.gz", cmd.getPackagePath());

        assertEquals("b", cmd.getEnvVars().get("a"));
        assertEquals("oss://my-bucket/mappingLogs/", a.getLogMapping().get("/home/admin/a.log"));
        assertEquals("oss://my-bucket/disk2/", a.getOutputMapping().get("/home/admin/disk2/"));
        assertEquals("/home/admin/disk1/", a.getInputMapping().get("oss://my-bucket/disk1/"));


    }



    private JobDescription createJob() {

        DAG dag = new DAG();

        ArrayList<String> taskTargets = new ArrayList();
        taskTargets.add("task_2");

        dag.addDependencies("task_1", taskTargets);

        Map<String, TaskDescription> tasks = new HashMap();

        TaskDescription task = getTaskDescription();

        tasks.put("task_1", task);
        dag.setTasks(tasks);

        JobDescription job = new JobDescription();
        job.setName("jobName1");
        job.setDag(dag);
        job.setPriority(1);
        job.setDescription("testJob");
        job.setType("DAG");
        job.setJobFailOnInstanceFail(false);
        job.setAutoRelease(true);
        return job;
    }

    private AutoCluster genAutoCluster(){
        AutoCluster info = new AutoCluster();
        info.setResourceType("OnDemand");
        info.setInstanceType("ecs");
        info.setECSImageId("m-xxx");
        info.setImageId("img-sxxx");
        return info;
    }
    private TaskDescription getTaskDescription(){
        TaskDescription task = new TaskDescription();

        task.setClusterId("clu-001");
        task.setAutoCluster(genAutoCluster());
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
        task.addLogMapping( "/home/admin/a.log","oss://my-bucket/mappingLogs/");

        return task;
    }

}
