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

package com.aliyuncs.mpaas.model.v20200710;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMcubeMiniAppRequest extends RpcAcsRequest<CreateMcubeMiniAppResponse> {
	   

	private String h5Name;

	private String h5Id;

	private String tenantId;

	private String appId;

	private String workspaceId;
	public CreateMcubeMiniAppRequest() {
		super("mPaaS", "2020-07-10", "CreateMcubeMiniApp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getH5Name() {
		return this.h5Name;
	}

	public void setH5Name(String h5Name) {
		this.h5Name = h5Name;
		if(h5Name != null){
			putBodyParameter("H5Name", h5Name);
		}
	}

	public String getH5Id() {
		return this.h5Id;
	}

	public void setH5Id(String h5Id) {
		this.h5Id = h5Id;
		if(h5Id != null){
			putBodyParameter("H5Id", h5Id);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<CreateMcubeMiniAppResponse> getResponseClass() {
		return CreateMcubeMiniAppResponse.class;
	}

}
