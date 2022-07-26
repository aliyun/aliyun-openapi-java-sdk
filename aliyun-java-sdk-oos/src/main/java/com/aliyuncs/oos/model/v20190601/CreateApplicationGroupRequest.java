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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oos.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateApplicationGroupRequest extends RpcAcsRequest<CreateApplicationGroupResponse> {
	   

	private String clientToken;

	private String description;

	private String cmsGroupId;

	private String deployRegionId;

	private String applicationName;

	private String importTagValue;

	private String importTagKey;

	private String name;
	public CreateApplicationGroupRequest() {
		super("oos", "2019-06-01", "CreateApplicationGroup", "oos");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getCmsGroupId() {
		return this.cmsGroupId;
	}

	public void setCmsGroupId(String cmsGroupId) {
		this.cmsGroupId = cmsGroupId;
		if(cmsGroupId != null){
			putQueryParameter("CmsGroupId", cmsGroupId);
		}
	}

	public String getDeployRegionId() {
		return this.deployRegionId;
	}

	public void setDeployRegionId(String deployRegionId) {
		this.deployRegionId = deployRegionId;
		if(deployRegionId != null){
			putQueryParameter("DeployRegionId", deployRegionId);
		}
	}

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
		if(applicationName != null){
			putQueryParameter("ApplicationName", applicationName);
		}
	}

	public String getImportTagValue() {
		return this.importTagValue;
	}

	public void setImportTagValue(String importTagValue) {
		this.importTagValue = importTagValue;
		if(importTagValue != null){
			putQueryParameter("ImportTagValue", importTagValue);
		}
	}

	public String getImportTagKey() {
		return this.importTagKey;
	}

	public void setImportTagKey(String importTagKey) {
		this.importTagKey = importTagKey;
		if(importTagKey != null){
			putQueryParameter("ImportTagKey", importTagKey);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<CreateApplicationGroupResponse> getResponseClass() {
		return CreateApplicationGroupResponse.class;
	}

}
