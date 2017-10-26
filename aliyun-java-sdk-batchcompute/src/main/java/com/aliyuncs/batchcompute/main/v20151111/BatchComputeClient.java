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


import com.aliyuncs.AcsRequest;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.batchcompute.model.v20151111.*;
import com.aliyuncs.batchcompute.pojo.v20151111.AppDescription;
import com.aliyuncs.batchcompute.pojo.v20151111.ClusterDescription;
import com.aliyuncs.batchcompute.pojo.v20151111.ImageDescription;
import com.aliyuncs.batchcompute.pojo.v20151111.JobDescription;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.regions.Endpoint;
import com.aliyuncs.regions.ProductDomain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by guangchun.luo on 15/6/5.
 */
public class BatchComputeClient implements BatchCompute {

    private IAcsClient client;

    private final static String PRODUCT_CODE = "BatchCompute";


    static Map<String,String> regionMap = new HashMap<String,String>();

    static{
        BatchComputeClient.addEndpoint("cn-qingdao", "batchcompute.cn-qingdao.aliyuncs.com");
        BatchComputeClient.addEndpoint("cn-shenzhen", "batchcompute.cn-shenzhen.aliyuncs.com");
        BatchComputeClient.addEndpoint("cn-hangzhou", "batchcompute.cn-hangzhou.aliyuncs.com");
        BatchComputeClient.addEndpoint("cn-beijing", "batchcompute.cn-beijing.aliyuncs.com");
        BatchComputeClient.addEndpoint("cn-shanghai", "batchcompute.cn-shanghai.aliyuncs.com");
    }

    public BatchComputeClient(String regionId, String accessKeyId, String accessKeySecret) {
        if(regionMap.get(regionId)==null){
            BatchComputeClient.addEndpoint(regionId, "batchcompute."+regionId+".aliyuncs.com");
        }
        this.client = new DefaultAcsClient(DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret));
    }


    /**
     * add region domain mapping
     *
     * @param region "cn-shenzhen"
     * @param domain "batchcompute.cn-shenzhen.aliyuncs.com"
     */
    public static void addEndpoint(String region, String domain) {
        regionMap.put(region, domain);
        try {
            DefaultProfile.addEndpoint(region, region, "BatchCompute", domain);
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, String> listEndpoints() throws ClientException {

        Map<String, String> m = new HashMap<String,String>();

        for(Map.Entry<String, String>  ent : regionMap.entrySet()){
            String region = ent.getKey();

            List<Endpoint>  list = DefaultProfile.getProfile().getEndpoints(region, PRODUCT_CODE);

            for(Endpoint ep : list){
                //System.out.println(ep.getName()+":  "+ ep.getProductDomains().size());
                for( ProductDomain pd: ep.getProductDomains()) {
                    if(pd.getProductName().equals(PRODUCT_CODE)) {
                        m.put(ep.getName(), pd.getDomianName());
                        //System.out.println("   "+ep.getName() + ", " + pd.getDomianName() + ", " + pd.getProductName());
                    }
                }
            }
        }
        return m;

    }


    /**
     * add header k-v pairs for every request
     * @param key
     * @param value
     */
    public static void addRequestHeader(String key, String value) {
        BatchComputeRequest.setCommonHeader(key,value);
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
            System.out.println("--->Request.Action:"+request.getActionName());
            System.out.println("--->Request.Body:->" +  new String(bs)+"<-");
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
        return getAcsResponse(request);
    }


    public CreateJobResponse createJob(JobDescription jobDescription) throws ClientException {
        CreateJobRequest request = new CreateJobRequest();
        request.setJobDescription(jobDescription);
        return createJob(request);
    }

    @Override
    public CreateJobResponse createJob(JobDescription jobDescription, String idempotentToken) throws ClientException {
        CreateJobRequest request = new CreateJobRequest();
        request.setJobDescription(jobDescription);
        request.setIdempotentToken(idempotentToken);
        return createJob(request);
    }

    @Override
    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) throws ClientException {
        return getAcsResponse(request);
    }

    @Override
    public UpdateClusterResponse updateCluster(ClusterDescription desc) throws ClientException {
        return null;
    }

    @Override
    public ChangeJobPriorityResponse changeJobPriority(ChangeJobPriorityRequest req) throws ClientException {
        req._useInteger = true;
        try{
            return getAcsResponse(req);
        }catch(ClientException e){
            //{"Code":"InvalidJsonFormat","Message":"The request body has an invalid json format"}

            if(e.getErrCode().equals("InvalidJsonFormat")){
                req._useInteger = false;
                req.setPriority(req.getPriority());
                return getAcsResponse(req);
            }
            else{
                throw e;
            }
        }
    }

    @Override
    public ChangeJobPriorityResponse changeJobPriority(String jobId, int priority) throws ClientException {
        ChangeJobPriorityRequest req = new ChangeJobPriorityRequest();
        req.setJobId(jobId);
        req.setPriority(priority);
        return changeJobPriority(req);
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
        return getAcsResponse(request);
    }

    public GetJobResponse getJob(String jobId) throws ClientException {
        GetJobRequest request = new GetJobRequest();
        request.setJobId(jobId);
        return getJob(request);
    }

    @Override
    public ListJobsResponse listJobs(ListJobsRequest request) throws ClientException {
        return getAcsResponse(request);
    }

    @Override
    public ListJobsResponse listJobs() throws ClientException {
        ListJobsRequest req = new ListJobsRequest();
        return listJobs(req);
    }

    @Override
    public ListJobsResponse listJobs(String marker, int maxItemCount) throws ClientException {
        ListJobsRequest req = new ListJobsRequest();
        req.setMarker(marker);
        req.setMaxItemCount(maxItemCount);
        return listJobs(req);
    }
    @Override
    public ListJobsResponse listJobs(String state) throws ClientException {
        ListJobsRequest req = new ListJobsRequest();
        req.setState(state);
        return listJobs(req);
    }

    @Override
    public ListJobsResponse listJobs(String state, String marker, int maxItemCount) throws ClientException {
        ListJobsRequest req = new ListJobsRequest();
        req.setMarker(marker);
        req.setMaxItemCount(maxItemCount);
        req.setState(state);
        return listJobs(req);
    }


    public StartJobResponse startJob(StartJobRequest request) throws ClientException {
        return getAcsResponse(request);
    }

    public StartJobResponse startJob(String jobId) throws ClientException {
        StartJobRequest request = new StartJobRequest();
        request.setJobId(jobId);
        return startJob(request);
    }

    public StopJobResponse stopJob(StopJobRequest request) throws ClientException {
        return getAcsResponse(request);
    }

    public StopJobResponse stopJob(String jobId) throws ClientException {
        StopJobRequest request = new StopJobRequest();
        request.setJobId(jobId);
        return stopJob(request);
    }


    public GetJobDescriptionResponse getJobDescription(GetJobDescriptionRequest request) throws ClientException {
        return getAcsResponse(request);
    }

    public GetJobDescriptionResponse getJobDescription(String jobId) throws ClientException {
        GetJobDescriptionRequest request = new GetJobDescriptionRequest();
        request.setJobId(jobId);
        return getJobDescription(request);
    }


    public ListTasksResponse listTasks(ListTasksRequest request) throws ClientException {
        return getAcsResponse(request);
    }

    @Override
    public ListTasksResponse listTasks(String jobId) throws ClientException {
        ListTasksRequest req = new ListTasksRequest();
        req.setJobId(jobId);
        return listTasks(req);
    }
    @Override
    public ListTasksResponse listTasks(String jobId, String marker, int maxItemCount) throws ClientException {
        ListTasksRequest req = new ListTasksRequest();
        req.setJobId(jobId);
        req.setMarker(marker);
        req.setMaxItemCount(maxItemCount);
        return listTasks(req);
    }

    @Override
    public GetTaskResponse getTask(GetTaskRequest request) throws ClientException {
        return getAcsResponse(request);
    }

    @Override
    public GetTaskResponse getTask(String jobId, String taskName) throws ClientException {
        GetTaskRequest req = new GetTaskRequest();
        req.setJobId(jobId);
        req.setTaskName(taskName);
        return getTask(req);
    }

    @Override
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws ClientException {
        return getAcsResponse(request);
    }
    @Override
    public ListInstancesResponse listInstances(String jobId, String taskName) throws ClientException {
        ListInstancesRequest req = new ListInstancesRequest();
        req.setJobId(jobId);
        req.setTaskName(taskName);
        return listInstances(req);
    }

    @Override
    public ListInstancesResponse listInstances(String jobId, String taskName, String marker, int maxItemCount) throws ClientException {
        ListInstancesRequest req = new ListInstancesRequest();
        req.setJobId(jobId);
        req.setTaskName(taskName);
        req.setMaxItemCount(maxItemCount);
        req.setMarker(marker);
        return listInstances(req);
    }

    @Override
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws ClientException {
        return getAcsResponse(request);
    }


    @Override
    public GetInstanceResponse getInstance(String jobId, String taskName, int instanceId) throws ClientException {
        GetInstanceRequest req = new GetInstanceRequest();
        req.setJobId(jobId);
        req.setTaskName(taskName);
        req.setInstanceId(instanceId);
        return getInstance(req);
    }

    @Override
    public CreateClusterResponse createCluster(CreateClusterRequest request) throws ClientException {
        return getAcsResponse(request);
    }

    @Override
    public CreateClusterResponse createCluster(ClusterDescription clusterDescription) throws ClientException {
        CreateClusterRequest req = new CreateClusterRequest();
        req.setClusterDescription(clusterDescription);
        return createCluster(req);
    }


    @Override
    public CreateClusterResponse createCluster(ClusterDescription clusterDescription, String idempotentToken) throws ClientException {
        CreateClusterRequest req = new CreateClusterRequest();
        req.setClusterDescription(clusterDescription);
        req.setIdempotentToken(idempotentToken);
        return createCluster(req);
    }

    @Override
    public ListClustersResponse listClusters(ListClustersRequest request) throws ClientException {
        return getAcsResponse(request);
    }

    @Override
    public ListClustersResponse listClusters() throws ClientException {
        ListClustersRequest req = new ListClustersRequest();
        return getAcsResponse(req);
    }

    @Override
    public ListClustersResponse listClusters(String marker, int maxItemCount) throws ClientException {
        ListClustersRequest req = new ListClustersRequest();
        req.setMarker(marker);
        req.setMaxItemCount(maxItemCount);
        return listClusters(req);
    }

    @Override
    public GetClusterResponse getCluster(GetClusterRequest request) throws ClientException {
        return getAcsResponse(request);
    }

    @Override
    public GetClusterResponse getCluster(String clusterId) throws ClientException {
        GetClusterRequest req = new GetClusterRequest();
        req.setClusterId(clusterId);
        return getCluster(req);
    }

    @Override
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws ClientException {
        return getAcsResponse(request);
    }

    @Override
    public DeleteClusterResponse deleteCluster(String clusterId) throws ClientException {
        DeleteClusterRequest req = new DeleteClusterRequest();
        req.setClusterId(clusterId);
        return deleteCluster(req);
    }

    @Override
    public ChangeClusterDesiredVMCountResponse changeClusterDesiredVMCount(ChangeClusterDesiredVMCountRequest req) throws ClientException {
        return getAcsResponse(req);
    }

    @Override
    public ChangeClusterDesiredVMCountResponse changeClusterDesiredVMCount(String clusterId, ClusterDescription clusterDesc) throws ClientException {
        ChangeClusterDesiredVMCountRequest req = new ChangeClusterDesiredVMCountRequest();
        req.setClusterId(clusterId);
        req.setClusterDescription(clusterDesc);
        return changeClusterDesiredVMCount(req);
    }


    @Override
    public ChangeClusterDesiredVMCountResponse changeClusterDesiredVMCount(String clusterId, String groupName, int count) throws ClientException {
        ChangeClusterDesiredVMCountRequest req = new ChangeClusterDesiredVMCountRequest();
        req.setClusterId(clusterId);
        req.setDesiredVmCount(groupName, count);
        return changeClusterDesiredVMCount(req);
    }


    @Override
    public GetClusterInstanceResponse getClusterInstance(String clusterId, String groupName, String instanceId) throws ClientException{
        GetClusterInstanceRequest req = new GetClusterInstanceRequest(clusterId, groupName, instanceId);
        return getClusterInstance(req);
    }

    @Override
    public GetClusterInstanceResponse getClusterInstance(GetClusterInstanceRequest req) throws ClientException {
        return getAcsResponse(req);
    }

    @Override
    public ListClusterInstancesResponse listClusterInstances(String clusterId, String groupName) throws ClientException {
        ListClusterInstancesRequest req = new ListClusterInstancesRequest(clusterId, groupName);
        return listClusterInstances(req);
    }

    @Override
    public ListClusterInstancesResponse listClusterInstances(String clusterId, String groupName, String marker, int maxItemCount) throws ClientException {
        ListClusterInstancesRequest req = new ListClusterInstancesRequest(clusterId, groupName);
        req.setMarker(marker);
        req.setMaxItemCount(maxItemCount);
        return listClusterInstances(req);
    }

    @Override
    public ListClusterInstancesResponse listClusterInstances(ListClusterInstancesRequest req) throws ClientException {
        return getAcsResponse(req);
    }

    @Override
    public RecreateClusterInstanceResponse recreateClusterInstance(String clusterId, String groupName, String instanceId) throws ClientException {
        RecreateClusterInstanceRequest req = new RecreateClusterInstanceRequest(clusterId, groupName, instanceId);
        return recreateClusterInstance(req);
    }

    @Override
    public RecreateClusterInstanceResponse recreateClusterInstance(RecreateClusterInstanceRequest req) throws ClientException {
        return getAcsResponse(req);
    }

    @Override
    public DeleteClusterInstanceResponse deleteClusterInstance(String clusterId, String groupName, String instanceId) throws ClientException {
        DeleteClusterInstanceRequest req = new DeleteClusterInstanceRequest(clusterId, groupName, instanceId);
        return deleteClusterInstance(req);
    }

    @Override
    public DeleteClusterInstanceResponse deleteClusterInstance(DeleteClusterInstanceRequest req) throws ClientException {
        return getAcsResponse(req);
    }



    @Override
    public GetImageResponse getImage(String imageId) throws ClientException {
        GetImageRequest req = new GetImageRequest();
        req.setImageId(imageId);
        return getImage(req);
    }

    @Override
    public GetImageResponse getImage(GetImageRequest req) throws ClientException {
        return getAcsResponse(req);
    }

    @Override
    public CreateImageResponse createImage(ImageDescription imageDescription) throws ClientException {
        CreateImageRequest req = new CreateImageRequest();
        req.setImageDescription(imageDescription);
        return createImage(req);
    }

    @Override
    public CreateImageResponse createImage(CreateImageRequest req) throws ClientException {
        return getAcsResponse(req);
    }
    @Override
    public CreateImageResponse createImage(ImageDescription imageDescription,String idempotentToken) throws ClientException {
        CreateImageRequest req = new CreateImageRequest();
        req.setImageDescription(imageDescription);
        req.setIdempotentToken(idempotentToken);
        return createImage(req);
    }


    @Override
    public DeleteImageResponse deleteImage(String imageId) throws ClientException {
        DeleteImageRequest req = new DeleteImageRequest();
        req.setImageId(imageId);
        return deleteImage(req);
    }

    @Override
    public DeleteImageResponse deleteImage(DeleteImageRequest req) throws ClientException {
        return getAcsResponse(req);
    }

    @Override
    public ListImagesResponse listImages() throws ClientException {
        ListImagesRequest req = new ListImagesRequest();
        return listImages(req);
    }
    @Override
    public ListImagesResponse listImages(String type) throws ClientException {
        ListImagesRequest req = new ListImagesRequest();
        req.setType(type);
        return listImages(req);
    }
    @Override
    public ListImagesResponse listImages(String type, String marker, int maxItemCount) throws ClientException {
        ListImagesRequest req = new ListImagesRequest();
        req.setType(type);
        req.setMarker(marker);
        req.setMaxItemCount(maxItemCount);
        return listImages(req);
    }
    @Override
    public ListImagesResponse listImages(String marker, int maxItemCount) throws ClientException {
        ListImagesRequest req = new ListImagesRequest();
        req.setMarker(marker);
        req.setMaxItemCount(maxItemCount);
        return listImages(req);
    }

    @Override
    public ListImagesResponse listImages(ListImagesRequest req) throws ClientException {
        return getAcsResponse(req);
    }

    @Override
    public GetAppResponse getApp(String appName) throws ClientException {
        GetAppRequest req = new GetAppRequest();
        req.setAppName(appName);
        req.setScope("Private");
        return getApp(req);
    }

    @Override
    public GetAppResponse getApp(String appName, String scope) throws ClientException {
        GetAppRequest req = new GetAppRequest();
        req.setAppName(appName);
        req.setScope(scope);
        return getApp(req);
    }

    @Override
    public GetAppResponse getApp(GetAppRequest req) throws ClientException {
        return getAcsResponse(req);
    }

    @Override
    public GetAppRevisionsResponse getAppRevisions(String appName) throws ClientException {
        GetAppRevisionsRequest req = new GetAppRevisionsRequest();
        req.setAppName(appName);
        return getAppRevisions(req);
    }

    @Override
    public GetAppRevisionsResponse getAppRevisions(GetAppRevisionsRequest req) throws ClientException {
        return getAcsResponse(req);
    }

    @Override
    public GetAppDetailResponse getAppDetail(String appName, String qualifier) throws ClientException {
        GetAppDetailRequest req = new GetAppDetailRequest();
        req.setAppName(appName);
        req.setQualifier(qualifier);
        return getAppDetail(req);
    }

    @Override
    public GetAppDetailResponse getAppDetail(GetAppDetailRequest req) throws ClientException {
        return getAcsResponse(req);
    }

    @Override
    public CreateAppResponse createApp(AppDescription appDescription) throws ClientException {
        CreateAppRequest req = new CreateAppRequest();
        req.setAppDescription(appDescription);
        return createApp(req);
    }

    @Override
    public CreateAppResponse createApp(CreateAppRequest req) throws ClientException {
        return getAcsResponse(req);
    }

    @Override
    public CreateAppResponse createApp(AppDescription appDescription, String idempotentToken) throws ClientException {
        CreateAppRequest req = new CreateAppRequest();
        req.setAppDescription(appDescription);
        req.setIdempotentToken(idempotentToken);
        return createApp(req);
    }

    @Override
    public UpdateAppResponse updateApp(AppDescription appDescription) throws ClientException {
        UpdateAppRequest req = new UpdateAppRequest();
        req.setAppDescription(appDescription);
        return updateApp(req);
    }

    @Override
    public UpdateAppResponse updateApp(UpdateAppRequest req) throws ClientException {
        return getAcsResponse(req);
    }

    @Override
    public DeleteAppResponse deleteApp(String appName) throws ClientException {
        DeleteAppRequest req = new DeleteAppRequest();
        req.setAppName(appName);
        return deleteApp(req);
    }

    @Override
    public DeleteAppResponse deleteApp(String appName, String qualifier) throws ClientException {
        DeleteAppRequest req = new DeleteAppRequest();
        req.setAppName(appName);
        req.setQualifier(qualifier);
        return deleteApp(req);
    }

    @Override
    public DeleteAppResponse deleteApp(DeleteAppRequest req) throws ClientException {
        return getAcsResponse(req);
    }


    @Override
    public ListAppsResponse listApps(String scope) throws ClientException {
        ListAppsRequest req = new ListAppsRequest();
        req.setScope(scope);
        return listApps(req);
    }

    @Override
    public ListAppsResponse listApps(String scope, String marker, int maxItemCount) throws ClientException {
        ListAppsRequest req = new ListAppsRequest();
        req.setMaxItemCount(maxItemCount);
        req.setMarker(marker);
        req.setScope(scope);
        return listApps(req);
    }

    @Override
    public ListAppsResponse listApps(ListAppsRequest req) throws ClientException {
        return getAcsResponse(req);
    }

    @Override
    public GetQuotasResponse getQuotas() throws ClientException {
        GetQuotasRequest req = new GetQuotasRequest();
        return getQuotas(req);
    }

    @Override
    public GetQuotasResponse getQuotas(GetQuotasRequest req) throws ClientException {
        return getAcsResponse(req);
    }

}
