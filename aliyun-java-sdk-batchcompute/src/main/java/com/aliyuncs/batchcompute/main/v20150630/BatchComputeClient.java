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
import com.aliyuncs.batchcompute.pojo.v20150630.JobDescription;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.DefaultProfile;

import java.util.Map;
import java.util.Set;

/**
 * Created by guangchun.luo on 15/6/5.
 */
public class BatchComputeClient implements BatchCompute {

    private IAcsClient client;

    public BatchComputeClient(String regionId, String accessKeyId, String accessKeySecret) {
        this.client = new DefaultAcsClient(DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret));
    }


    /**
     * add region domain mapping
     *
     * @param region "cn-shenzhen"
     * @param domain "batchcompute.cn-shenzhen.aliyuncs.com"
     */
    public static void addEndpoint(String region, String domain) {
        try {
            DefaultProfile.addEndpoint(region, region, "BatchCompute", domain);
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

    public static boolean verbose = false;

    //hack一下，处理 ErrorCode 的兼容
    private <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request) throws ClientException {

        if (verbose) {

            Map<String, String> reqHeaders = request.getHeaders();

            Set<String> keys = reqHeaders.keySet();
            System.out.println("--->Request.Headers:");
            for (String key : keys) {
                System.out.println("\t" + key + ":" + reqHeaders.get(key));
            }

            byte[] bs = request.getContent();
            if (bs == null) bs = new byte[]{};
            System.out.println("--->request.Action:"+request.getActionName());
            System.out.println("--->Request.Body:" +  new String(bs));
        }


        HttpResponse baseResponse = this.client.doAction(request);

        if (verbose) {
            System.out.println("--->Request.method:" + request.getMethod());
            System.out.println("--->Request.URL:" + request.getUrl());
            System.out.println("--->Response.Status:" + baseResponse.getStatus());

            Map<String, String> headers = baseResponse.getHeaders();
            Set<String> keys = headers.keySet();
            System.out.println("--->Response.Headers:");
            for (String key : keys) {
                System.out.println("\t" + key + ":" + headers.get(key));
            }

            System.out.println("--->Response.body:" + new String(baseResponse.getContent()));
        }

        return HackAcsClient.parseAcsResponse(request.getResponseClass(), baseResponse);

    }



    public CreateJobResponse createJob(CreateJobRequest request) throws ClientException {
        CreateJobResponse response = getAcsResponse(request);
        return response;
    }


    public CreateJobResponse createJob(JobDescription jobDescription) throws ClientException {
        CreateJobRequest request = new CreateJobRequest();

        request.setJobDescription(jobDescription);
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


    public GetJobResponse getJob(GetJobRequest request) throws ClientException {
        GetJobResponse response = getAcsResponse(request);
        return response;
    }

    public GetJobResponse getJob(String jobId) throws ClientException {
        GetJobRequest request = new GetJobRequest();
        request.setJobId(jobId);
        return getJob(request);
    }


    public ListJobsResponse listJobs(ListJobsRequest request) throws ClientException {
        ListJobsResponse response = getAcsResponse(request);
        return response;
    }


    public ListJobsResponse listJobs() throws ClientException {
        return listJobs(new ListJobsRequest());
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


    public GetJobDescriptionResponse getJobDescription(GetJobDescriptionRequest request) throws ClientException {
        GetJobDescriptionResponse response = getAcsResponse(request);
        return response;
    }

    public GetJobDescriptionResponse getJobDescription(String jobId) throws ClientException {
        GetJobDescriptionRequest request = new GetJobDescriptionRequest();
        request.setJobId(jobId);
        return getJobDescription(request);
    }


    public ListTasksResponse listTasks(ListTasksRequest request) throws ClientException {
        ListTasksResponse response = getAcsResponse(request);
        return response;
    }

    public ListTasksResponse listTasks(String jobId) throws ClientException {
        ListTasksRequest request = new ListTasksRequest();
        request.setJobId(jobId);
        return listTasks(request);
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
