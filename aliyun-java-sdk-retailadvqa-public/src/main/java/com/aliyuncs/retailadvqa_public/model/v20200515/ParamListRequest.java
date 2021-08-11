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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ParamListRequest extends RpcAcsRequest<ParamListResponse> {
	   

	private String accessId;

	private Long paramType;

	private String tenantId;

	private Long platformType;

	private String workspaceId;
	public ParamListRequest() {
		super("retailadvqa-public", "2020-05-15", "ParamList");
		setMethod(MethodType.GET);
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public Long getParamType() {
		return this.paramType;
	}

	public void setParamType(Long paramType) {
		this.paramType = paramType;
		if(paramType != null){
			putQueryParameter("ParamType", paramType.toString());
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public Long getPlatformType() {
		return this.platformType;
	}

	public void setPlatformType(Long platformType) {
		this.platformType = platformType;
		if(platformType != null){
			putQueryParameter("PlatformType", platformType.toString());
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<ParamListResponse> getResponseClass() {
		return ParamListResponse.class;
	}

}
