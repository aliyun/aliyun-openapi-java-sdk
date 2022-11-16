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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyBackendModelRequest extends RpcAcsRequest<ModifyBackendModelResponse> {
	   

	private String stageName;

	private String backendModelData;

	private String backendId;

	private String description;

	private String securityToken;

	private String backendType;

	private String backendModelId;
	public ModifyBackendModelRequest() {
		super("CloudAPI", "2016-07-14", "ModifyBackendModel", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
		if(stageName != null){
			putQueryParameter("StageName", stageName);
		}
	}

	public String getBackendModelData() {
		return this.backendModelData;
	}

	public void setBackendModelData(String backendModelData) {
		this.backendModelData = backendModelData;
		if(backendModelData != null){
			putQueryParameter("BackendModelData", backendModelData);
		}
	}

	public String getBackendId() {
		return this.backendId;
	}

	public void setBackendId(String backendId) {
		this.backendId = backendId;
		if(backendId != null){
			putQueryParameter("BackendId", backendId);
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

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getBackendType() {
		return this.backendType;
	}

	public void setBackendType(String backendType) {
		this.backendType = backendType;
		if(backendType != null){
			putQueryParameter("BackendType", backendType);
		}
	}

	public String getBackendModelId() {
		return this.backendModelId;
	}

	public void setBackendModelId(String backendModelId) {
		this.backendModelId = backendModelId;
		if(backendModelId != null){
			putQueryParameter("BackendModelId", backendModelId);
		}
	}

	@Override
	public Class<ModifyBackendModelResponse> getResponseClass() {
		return ModifyBackendModelResponse.class;
	}

}
