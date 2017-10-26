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
package com.aliyuncs.batchcompute.main.v20151111;


import com.aliyuncs.batchcompute.model.v20151111.*;
import com.aliyuncs.batchcompute.pojo.v20151111.AppDescription;
import com.aliyuncs.batchcompute.pojo.v20151111.ClusterDescription;
import com.aliyuncs.batchcompute.pojo.v20151111.ImageDescription;
import com.aliyuncs.batchcompute.pojo.v20151111.JobDescription;
import com.aliyuncs.exceptions.ClientException;


/**
 * Created by guangchun.luo on 15/12/5
 */

public interface BatchCompute {

    /** job 相关 */
    CreateJobResponse createJob(CreateJobRequest request) throws ClientException;

    CreateJobResponse createJob(JobDescription jobDescription) throws ClientException;

    CreateJobResponse createJob(JobDescription jobDescription, String idempotentToken) throws ClientException;


    ChangeJobPriorityResponse changeJobPriority(ChangeJobPriorityRequest req) throws ClientException;

    ChangeJobPriorityResponse changeJobPriority(String jobId, int priority) throws ClientException;

    DeleteJobResponse deleteJob(DeleteJobRequest request) throws ClientException;

    DeleteJobResponse deleteJob(String jobId) throws ClientException;

    GetJobResponse getJob(GetJobRequest request) throws ClientException;

    GetJobResponse getJob(String jobId) throws ClientException;

    ListJobsResponse listJobs(ListJobsRequest request) throws ClientException;

    ListJobsResponse listJobs() throws ClientException;

    ListJobsResponse listJobs( String marker, int maxItemCount) throws ClientException;

    ListJobsResponse listJobs(String state) throws ClientException;

    ListJobsResponse listJobs(String state, String marker, int maxItemCount) throws ClientException;

    StartJobResponse startJob(StartJobRequest request) throws ClientException;

    StartJobResponse startJob(String jobId) throws ClientException;

    StopJobResponse stopJob(StopJobRequest request) throws ClientException;

    StopJobResponse stopJob(String jobId) throws ClientException;

    GetJobDescriptionResponse getJobDescription(GetJobDescriptionRequest request) throws ClientException;

    GetJobDescriptionResponse getJobDescription(String jobId) throws ClientException;


    /** Task 相关 */
    ListTasksResponse listTasks(ListTasksRequest request) throws ClientException;

    ListTasksResponse listTasks(String jobId) throws ClientException;

    ListTasksResponse listTasks(String jobId, String marker, int maxItemCount) throws ClientException;


    GetTaskResponse getTask(GetTaskRequest request) throws ClientException;

    GetTaskResponse getTask(String jobId, String taskName) throws ClientException;



    /** Instance 相关 */
    ListInstancesResponse listInstances(ListInstancesRequest request) throws ClientException;

    ListInstancesResponse listInstances(String jobId, String taskName) throws ClientException;

    ListInstancesResponse listInstances(String jobId, String taskName, String marker, int maxItemCount) throws ClientException;


    GetInstanceResponse getInstance(GetInstanceRequest request) throws ClientException;

    GetInstanceResponse getInstance(String jobId, String taskName, int instanceId) throws ClientException;

    /** Cluster 相关*/
    CreateClusterResponse createCluster(CreateClusterRequest request) throws ClientException;

    CreateClusterResponse createCluster(ClusterDescription clusterDescription) throws ClientException;
    CreateClusterResponse createCluster(ClusterDescription clusterDescription, String idempotentToken) throws ClientException;


    ListClustersResponse listClusters(ListClustersRequest request) throws ClientException;

    ListClustersResponse listClusters() throws ClientException;

    ListClustersResponse listClusters(String marker, int maxItemCount) throws ClientException;

    GetClusterResponse getCluster(GetClusterRequest request) throws ClientException;

    GetClusterResponse getCluster(String clusterId) throws ClientException;


    DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws ClientException;

    DeleteClusterResponse deleteCluster(String clusterId) throws ClientException;

    ChangeClusterDesiredVMCountResponse changeClusterDesiredVMCount(ChangeClusterDesiredVMCountRequest req) throws ClientException;
    ChangeClusterDesiredVMCountResponse changeClusterDesiredVMCount(String clusterId, ClusterDescription clusterDesc) throws ClientException;
    ChangeClusterDesiredVMCountResponse changeClusterDesiredVMCount(String clusterId, String groupName, int count) throws ClientException;

    UpdateClusterResponse updateCluster(UpdateClusterRequest req) throws ClientException;
    UpdateClusterResponse updateCluster(ClusterDescription desc) throws ClientException;


    /** cluster instance **/

    GetClusterInstanceResponse getClusterInstance(String clusterId, String groupName, String instanceId) throws ClientException;
    GetClusterInstanceResponse getClusterInstance(GetClusterInstanceRequest req) throws ClientException;

    ListClusterInstancesResponse listClusterInstances(String clusterId, String groupName) throws ClientException;
    ListClusterInstancesResponse listClusterInstances(String clusterId, String groupName, String marker, int maxItemCount) throws ClientException;
    ListClusterInstancesResponse listClusterInstances(ListClusterInstancesRequest req) throws ClientException;

    RecreateClusterInstanceResponse recreateClusterInstance(String clusterId, String groupName, String instanceId) throws ClientException;
    RecreateClusterInstanceResponse recreateClusterInstance(RecreateClusterInstanceRequest req) throws ClientException;

    DeleteClusterInstanceResponse deleteClusterInstance(String clusterId, String groupName, String instanceId) throws ClientException;
    DeleteClusterInstanceResponse deleteClusterInstance(DeleteClusterInstanceRequest req) throws ClientException;

    /** image **/
    GetImageResponse getImage(String imageId) throws ClientException;
    GetImageResponse getImage(GetImageRequest req) throws ClientException;

    CreateImageResponse createImage(ImageDescription imageDescription) throws ClientException;
    CreateImageResponse createImage(CreateImageRequest req) throws ClientException;
    CreateImageResponse createImage(ImageDescription imageDescription, String idempotentToken) throws ClientException;

    DeleteImageResponse deleteImage(String imageId) throws ClientException;
    DeleteImageResponse deleteImage(DeleteImageRequest req) throws ClientException;

    ListImagesResponse listImages() throws ClientException;
    ListImagesResponse listImages(String type) throws ClientException;
    ListImagesResponse listImages(String type, String marker, int maxItemCount) throws ClientException;
    ListImagesResponse listImages(String marker, int maxItemCount) throws ClientException;
    ListImagesResponse listImages(ListImagesRequest req) throws ClientException;


    //app
    GetAppResponse getApp(String appName) throws ClientException;
    GetAppResponse getApp(String appName, String scope) throws ClientException;
    GetAppResponse getApp(GetAppRequest req) throws ClientException;

    GetAppRevisionsResponse getAppRevisions(String appName) throws ClientException;
    GetAppRevisionsResponse getAppRevisions(GetAppRevisionsRequest req) throws ClientException;

    GetAppDetailResponse getAppDetail(String appName, String qualifier) throws ClientException;
    GetAppDetailResponse getAppDetail(GetAppDetailRequest req) throws ClientException;

    CreateAppResponse createApp(AppDescription appDescription) throws ClientException;
    CreateAppResponse createApp(CreateAppRequest req) throws ClientException;
    CreateAppResponse createApp(AppDescription appDescription, String idempotentToken) throws ClientException;

    UpdateAppResponse updateApp(AppDescription appDescription) throws ClientException;
    UpdateAppResponse updateApp(UpdateAppRequest req) throws ClientException;

    DeleteAppResponse deleteApp(String appName) throws ClientException;
    DeleteAppResponse deleteApp(String appName, String qualifier) throws ClientException;
    DeleteAppResponse deleteApp(DeleteAppRequest req) throws ClientException;

    ListAppsResponse listApps(String scope) throws ClientException;
    ListAppsResponse listApps(String scope, String marker, int maxItemCount) throws ClientException;
    ListAppsResponse listApps(ListAppsRequest req) throws ClientException;



    /** Quotas **/
    GetQuotasResponse getQuotas() throws ClientException;
    GetQuotasResponse getQuotas(GetQuotasRequest req) throws ClientException;
}
