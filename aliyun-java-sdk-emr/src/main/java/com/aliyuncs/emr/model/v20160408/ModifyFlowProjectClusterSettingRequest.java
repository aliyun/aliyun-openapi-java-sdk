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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyFlowProjectClusterSettingRequest extends RpcAcsRequest<ModifyFlowProjectClusterSettingResponse> {
	   

	private List<String> userLists;

	private List<String> hostLists;

	private String clusterId;

	private String defaultQueue;

	private String defaultUser;

	private List<String> queueLists;

	private String projectId;
	public ModifyFlowProjectClusterSettingRequest() {
		super("Emr", "2016-04-08", "ModifyFlowProjectClusterSetting");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getUserLists() {
		return this.userLists;
	}

	public void setUserLists(List<String> userLists) {
		this.userLists = userLists;	
		if (userLists != null) {
			for (int i = 0; i < userLists.size(); i++) {
				putQueryParameter("UserList." + (i + 1) , userLists.get(i));
			}
		}	
	}

	public List<String> getHostLists() {
		return this.hostLists;
	}

	public void setHostLists(List<String> hostLists) {
		this.hostLists = hostLists;	
		if (hostLists != null) {
			for (int i = 0; i < hostLists.size(); i++) {
				putQueryParameter("HostList." + (i + 1) , hostLists.get(i));
			}
		}	
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getDefaultQueue() {
		return this.defaultQueue;
	}

	public void setDefaultQueue(String defaultQueue) {
		this.defaultQueue = defaultQueue;
		if(defaultQueue != null){
			putQueryParameter("DefaultQueue", defaultQueue);
		}
	}

	public String getDefaultUser() {
		return this.defaultUser;
	}

	public void setDefaultUser(String defaultUser) {
		this.defaultUser = defaultUser;
		if(defaultUser != null){
			putQueryParameter("DefaultUser", defaultUser);
		}
	}

	public List<String> getQueueLists() {
		return this.queueLists;
	}

	public void setQueueLists(List<String> queueLists) {
		this.queueLists = queueLists;	
		if (queueLists != null) {
			for (int i = 0; i < queueLists.size(); i++) {
				putQueryParameter("QueueList." + (i + 1) , queueLists.get(i));
			}
		}	
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<ModifyFlowProjectClusterSettingResponse> getResponseClass() {
		return ModifyFlowProjectClusterSettingResponse.class;
	}

}
