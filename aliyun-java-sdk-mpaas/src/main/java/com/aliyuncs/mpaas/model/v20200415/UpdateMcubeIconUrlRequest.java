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

package com.aliyuncs.mpaas.model.v20200415;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateMcubeIconUrlRequest extends RpcAcsRequest<UpdateMcubeIconUrlResponse> {
	   

	private String h5Version;

	private String h5Id;

	private String tenantId;

	private Long id;

	private String appId;

	private String iconUrl;

	private String workspaceId;
	public UpdateMcubeIconUrlRequest() {
		super("mPaaS", "2020-04-15", "UpdateMcubeIconUrl", "mpaas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getH5Version() {
		return this.h5Version;
	}

	public void setH5Version(String h5Version) {
		this.h5Version = h5Version;
		if(h5Version != null){
			putBodyParameter("H5Version", h5Version);
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
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

	public String getIconUrl() {
		return this.iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
		if(iconUrl != null){
			putBodyParameter("IconUrl", iconUrl);
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
	public Class<UpdateMcubeIconUrlResponse> getResponseClass() {
		return UpdateMcubeIconUrlResponse.class;
	}

}
