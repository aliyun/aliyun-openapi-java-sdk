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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveMgsApirestRequest extends RpcAcsRequest<SaveMgsApirestResponse> {
	   

	private String mpaasMappcenterMgsApirestSaveJsonStr;

	private String tenantId;

	private String appId;

	private String workspaceId;
	public SaveMgsApirestRequest() {
		super("mPaaS", "2020-10-28", "SaveMgsApirest");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMpaasMappcenterMgsApirestSaveJsonStr() {
		return this.mpaasMappcenterMgsApirestSaveJsonStr;
	}

	public void setMpaasMappcenterMgsApirestSaveJsonStr(String mpaasMappcenterMgsApirestSaveJsonStr) {
		this.mpaasMappcenterMgsApirestSaveJsonStr = mpaasMappcenterMgsApirestSaveJsonStr;
		if(mpaasMappcenterMgsApirestSaveJsonStr != null){
			putBodyParameter("MpaasMappcenterMgsApirestSaveJsonStr", mpaasMappcenterMgsApirestSaveJsonStr);
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
	public Class<SaveMgsApirestResponse> getResponseClass() {
		return SaveMgsApirestResponse.class;
	}

}
