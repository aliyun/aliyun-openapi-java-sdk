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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateProjectRequest extends RpcAcsRequest<CreateProjectResponse> {
	   

	private String projectName;

	private Boolean disableDevelopment;

	private String clientToken;

	private String projectIdentifier;

	@SerializedName("tags")
	private List<Tags> tags;

	private String projectDescription;

	private Integer isAllowDownload;

	private String resourceManagerResourceGroupId;

	private Integer projectMode;
	public CreateProjectRequest() {
		super("dataworks-public", "2020-05-18", "CreateProject");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public Boolean getDisableDevelopment() {
		return this.disableDevelopment;
	}

	public void setDisableDevelopment(Boolean disableDevelopment) {
		this.disableDevelopment = disableDevelopment;
		if(disableDevelopment != null){
			putQueryParameter("DisableDevelopment", disableDevelopment.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getProjectIdentifier() {
		return this.projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
		if(projectIdentifier != null){
			putQueryParameter("ProjectIdentifier", projectIdentifier);
		}
	}

	public List<Tags> getTags() {
		return this.tags;
	}

	public void setTags(List<Tags> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
		}	
	}

	public String getProjectDescription() {
		return this.projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
		if(projectDescription != null){
			putQueryParameter("ProjectDescription", projectDescription);
		}
	}

	public Integer getIsAllowDownload() {
		return this.isAllowDownload;
	}

	public void setIsAllowDownload(Integer isAllowDownload) {
		this.isAllowDownload = isAllowDownload;
		if(isAllowDownload != null){
			putQueryParameter("IsAllowDownload", isAllowDownload.toString());
		}
	}

	public String getResourceManagerResourceGroupId() {
		return this.resourceManagerResourceGroupId;
	}

	public void setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
		this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
		if(resourceManagerResourceGroupId != null){
			putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
		}
	}

	public Integer getProjectMode() {
		return this.projectMode;
	}

	public void setProjectMode(Integer projectMode) {
		this.projectMode = projectMode;
		if(projectMode != null){
			putQueryParameter("ProjectMode", projectMode.toString());
		}
	}

	public static class Tags {

		@SerializedName("Value")
		private String value;

		@SerializedName("Key")
		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateProjectResponse> getResponseClass() {
		return CreateProjectResponse.class;
	}

}
