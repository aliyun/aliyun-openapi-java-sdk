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

package com.aliyuncs.zhuque.model.v20160701;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListProjectsRequest extends RpcAcsRequest<ListProjectsResponse> {
	
	public ListProjectsRequest() {
		super("Zhuque", "2016-07-01", "ListProjects");
	}

	private String projectName;

	private String cloudInstance;

	private String businessProjectId;

	private String manager;

	private String projectType;

	private String region;

	private String azone;

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getCloudInstance() {
		return this.cloudInstance;
	}

	public void setCloudInstance(String cloudInstance) {
		this.cloudInstance = cloudInstance;
		if(cloudInstance != null){
			putQueryParameter("CloudInstance", cloudInstance);
		}
	}

	public String getBusinessProjectId() {
		return this.businessProjectId;
	}

	public void setBusinessProjectId(String businessProjectId) {
		this.businessProjectId = businessProjectId;
		if(businessProjectId != null){
			putQueryParameter("BusinessProjectId", businessProjectId);
		}
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
		if(manager != null){
			putQueryParameter("Manager", manager);
		}
	}

	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
		if(projectType != null){
			putQueryParameter("ProjectType", projectType);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getAzone() {
		return this.azone;
	}

	public void setAzone(String azone) {
		this.azone = azone;
		if(azone != null){
			putQueryParameter("Azone", azone);
		}
	}

	@Override
	public Class<ListProjectsResponse> getResponseClass() {
		return ListProjectsResponse.class;
	}

}
