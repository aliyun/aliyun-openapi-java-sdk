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


import com.aliyuncs.batchcompute.model.v20150630.*;
import com.aliyuncs.batchcompute.pojo.v20150630.Job;
import com.aliyuncs.exceptions.ClientException;


/**
 * Created by guangchun.luo on 15/6/5.
 */

public interface BatchCompute {

    /** job 相关 */
    CreateJobResponse createJob(CreateJobRequest request) throws ClientException;

    CreateJobResponse createJob(Job job) throws ClientException;

    UpdateJobResponse updateJob(UpdateJobRequest request) throws ClientException;

    UpdateJobResponse updateJobPriority(String jobId, int priority) throws ClientException;

    DeleteJobResponse deleteJob(DeleteJobRequest request) throws ClientException;

    DeleteJobResponse deleteJob(String jobId) throws ClientException;

    GetJobStatusResponse getJobStatus(GetJobStatusRequest request) throws ClientException;

    GetJobStatusResponse getJobStatus(String jobId) throws ClientException;

    ListJobStatusResponse listJobStatus(ListJobStatusRequest request) throws ClientException;

    ListJobStatusResponse listJobStatus() throws ClientException;

    StartJobResponse startJob(StartJobRequest request) throws ClientException;

    StartJobResponse startJob(String jobId) throws ClientException;

    StopJobResponse stopJob(StopJobRequest request) throws ClientException;

    StopJobResponse stopJob(String jobId) throws ClientException;

    GetJobResponse getJob(GetJobRequest request) throws ClientException;

    GetJobResponse getJob(String jobId) throws ClientException;


    /** Task 相关 */
    ListTaskStatusResponse listTaskStatus(ListTaskStatusRequest request) throws ClientException;

    ListTaskStatusResponse listTaskStatus(String jobId) throws ClientException;

    /** Image 相关*/
    ListImagesResponse listImages(ListImagesRequest request) throws ClientException;

    ListImagesResponse listImages() throws ClientException;
}
