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

package com.aliyuncs.batchcompute.main.v20150630;


import com.aliyuncs.AcsRequest;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.batchcompute.model.v20150630.*;
import com.aliyuncs.batchcompute.pojo.v20150630.Job;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.DefaultProfile;

/**
 * Created by guangchun.luo on 15/6/5.
 */
public class BatchComputeClient implements BatchCompute {

    private IAcsClient client;

    public BatchComputeClient(String regionId, String accessKeyId, String accessKeySecret) {
        this.client = new DefaultAcsClient(DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret));
    }


    //hack一下，处理 ErrorCode 的兼容
    private <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request) throws ClientException {
//        byte[] bs =request.getContent();
//        if(bs==null) bs=new byte[]{};
//        System.out.println("--->Request:"+ request.getActionName()+"\n"+new String(bs));
        HttpResponse baseResponse = this.client.doAction(request);
        //System.out.println("--->Response.body:" + new String(baseResponse.getContent()));
        return HackAcsClient.parseAcsResponse(request.getResponseClass(), baseResponse);
    }


    public CreateJobResponse createJob(CreateJobRequest request) throws ClientException {
        CreateJobResponse response = getAcsResponse(request);
        return response;
    }


    public CreateJobResponse createJob(Job job) throws ClientException {
        CreateJobRequest request = new CreateJobRequest();

        request.setJob(job);
        return createJob(request);
    }

    public UpdateJobResponse updateJob(UpdateJobRequest request) throws ClientException {
        UpdateJobResponse response = getAcsResponse(request);
        return response;
    }

    public UpdateJobResponse updateJobPriority(String jobId, int priority) throws ClientException {
        UpdateJobRequest request = new UpdateJobRequest();
        request.setJobId(jobId);
        request.setPriority(priority);
        return updateJob(request);
    }


    public DeleteJobResponse deleteJob(DeleteJobRequest request) throws ClientException {
        DeleteJobResponse response = getAcsResponse(request);
        return response;
    }


    public DeleteJobResponse deleteJob(String jobId) throws ClientException {
        DeleteJobRequest request = new DeleteJobRequest();
        request.setJobId(jobId);

        return deleteJob(request);
    }


    public GetJobStatusResponse getJobStatus(GetJobStatusRequest request) throws ClientException {
        GetJobStatusResponse response = getAcsResponse(request);
        return response;
    }

    public GetJobStatusResponse getJobStatus(String jobId) throws ClientException {
        GetJobStatusRequest request = new GetJobStatusRequest();
        request.setJobId(jobId);
        return getJobStatus(request);
    }


    public ListJobStatusResponse listJobStatus(ListJobStatusRequest request) throws ClientException {
        ListJobStatusResponse response = getAcsResponse(request);
        return response;
    }


    public ListJobStatusResponse listJobStatus() throws ClientException {
        return listJobStatus(new ListJobStatusRequest());
    }


    public StartJobResponse startJob(StartJobRequest request) throws ClientException {
        StartJobResponse response = getAcsResponse(request);
        return response;
    }

    public StartJobResponse startJob(String jobId) throws ClientException {
        StartJobRequest request = new StartJobRequest();
        request.setJobId(jobId);
        return startJob(request);
    }

    public StopJobResponse stopJob(StopJobRequest request) throws ClientException {
        StopJobResponse response = getAcsResponse(request);
        return response;
    }

    public StopJobResponse stopJob(String jobId) throws ClientException {
        StopJobRequest request = new StopJobRequest();
        request.setJobId(jobId);
        return stopJob(request);
    }


    public GetJobResponse getJob(GetJobRequest request) throws ClientException {
        GetJobResponse response = getAcsResponse(request);
        return response;
    }

    public GetJobResponse getJob(String jobId) throws ClientException {
        GetJobRequest request = new GetJobRequest();
        request.setJobId(jobId);
        return getJob(request);
    }


    public ListTaskStatusResponse listTaskStatus(ListTaskStatusRequest request) throws ClientException {
        ListTaskStatusResponse response = getAcsResponse(request);
        return response;
    }

    public ListTaskStatusResponse listTaskStatus(String jobId) throws ClientException {
        ListTaskStatusRequest request = new ListTaskStatusRequest();
        request.setJobId(jobId);
        return listTaskStatus(request);
    }


    public ListImagesResponse listImages(ListImagesRequest request) throws ClientException {
        ListImagesResponse response = getAcsResponse(request);
        return response;
    }

    public ListImagesResponse listImages() throws ClientException {
        ListImagesRequest request = new ListImagesRequest();
        return listImages(request);
    }
}
