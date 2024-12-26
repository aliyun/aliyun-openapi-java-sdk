/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.schedulerx3.model.v20240624;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteJobsRequest extends RpcAcsRequest<DeleteJobsResponse> {
	   

	private String clusterId;

	private String appName;

	@SerializedName("jobIds")
	private List<Long> jobIds;
	public DeleteJobsRequest() {
		super("SchedulerX3", "2024-06-24", "DeleteJobs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public List<Long> getJobIds() {
		return this.jobIds;
	}

	public void setJobIds(List<Long> jobIds) {
		this.jobIds = jobIds;	
		if (jobIds != null) {
			putBodyParameter("JobIds" , new Gson().toJson(jobIds));
		}	
	}

	@Override
	public Class<DeleteJobsResponse> getResponseClass() {
		return DeleteJobsResponse.class;
	}

}
