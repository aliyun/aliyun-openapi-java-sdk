/*
 *
 *  * Licensed to the Apache Software Foundation (ASF) under one
 *  * or more contributor license agreements.  See the NOTICE file
 *  * distributed with this work for additional information
 *  * regarding copyright ownership.  The ASF licenses this file
 *  * to you under the Apache License, Version 2.0 (the
 *  * "License"); you may not use this file except in compliance
 *  * with the License.  You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing,
 *  * software distributed under the License is distributed on an
 *  * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  * KIND, either express or implied.  See the License for the
 *  * specific language governing permissions and limitations
 *  * under the License.
 *
 */

package com.aliyuncs.batchcompute.functiontest;

import com.aliyuncs.batchcompute.main.v20150630.BatchCompute;
import com.aliyuncs.batchcompute.main.v20150630.BatchComputeClient;
import com.aliyuncs.batchcompute.model.v20150630.*;
import com.aliyuncs.batchcompute.pojo.v20150630.Job;
import com.aliyuncs.batchcompute.pojo.v20150630.ResourceDescription;
import com.aliyuncs.batchcompute.pojo.v20150630.Task;
import com.aliyuncs.batchcompute.pojo.v20150630.TaskDag;
import com.aliyuncs.batchcompute.util.Config;
import com.aliyuncs.exceptions.ClientException;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guangchun.luo on 15/4/14.
 */
public class BatchComputeClientErrorTest extends TestCase {

    private static BatchCompute client;

    private String imageId;

    private String PROGRAM_NAME = "count_all_num.py";

    private String OSS_BUCKET = "laok";
    private String OSS_PROGRAM_PACKAGE_PATH = "diku_simple_test/program_package.tar.gz";


    private String OSS_LOG_PATH = "diku_simple_test/log";
    private String OSS_DATA_PACKAGE = "diku_simple_test/diku_test_file.tar.gz";


    private void initClient() {
        Config cfg = Config.getInstance();
        imageId = cfg.getImageId();
        client = new BatchComputeClient(cfg.getRegionId(), cfg.getAccessId(), cfg.getAccessKey());
    }

    @Test
    public void testCreateClientWithBadAccessKey() throws ClientException {

        BatchCompute client = new BatchComputeClient("cn-hangzhou","fake_access_id","fake_access_key");

        try {
            ListImagesResponse res = client.listImages();

        }catch(ClientException e){
            //e.printStackTrace();
            assertEquals("InvalidAccessKeyId.NotFound",e.getErrCode());
        }
    }


    @Test
    public void testCreateJobWithoutTimeoutField() throws ClientException {

        initClient();

        Job job = genJobObjectWithTimeoutField();
        try {
            CreateJobResponse res = client.createJob(job);

        }catch(ClientException e){
            //e.printStackTrace();
            assertEquals("InvalidParameter", e.getErrCode());
        }
    }


    private Job genJobObjectWithTimeoutField() {
        TaskDag taskDag = new TaskDag();

        Task task = new Task();

        ResourceDescription resourceDesc = new ResourceDescription();
        resourceDesc.setCpu(1200);      //12 threads
        resourceDesc.setMemory(16000);  //16 G

        task.setResourceDescription(resourceDesc);
        task.setInstanceCount(1);
        task.setImageId(imageId);
        task.setProgramName(PROGRAM_NAME);
        task.setProgramType("python");
        //task.setTimeout(21600); //seconds
        task.setPackageUri("oss://" + OSS_BUCKET + "/" + OSS_PROGRAM_PACKAGE_PATH);

        task.setStderrRedirectPath("oss://" + OSS_BUCKET + "/" + OSS_LOG_PATH);
        task.setStdoutRedirectPath("oss://" + OSS_BUCKET + "/" + OSS_LOG_PATH);

        Map<String, Task> taskDescMap = new HashMap();

        taskDescMap.put("CountTask", task);

        taskDag.setTaskDescMap(taskDescMap);
        List<String> list = new ArrayList();

        //taskDag.addDependencies("CountTask", list);

        Job job = new Job();
        job.setJobName("jobName1");
        job.setJobTag("JobTag");
        job.setTaskDag(taskDag);
        job.setPriority(0);

        return job;
    }
}
