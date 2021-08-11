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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetConnectionShareRequest extends RpcAcsRequest<SetConnectionShareResponse> {
	   

	private String projectPermissions;

	private String datasourceName;

	private String userPermissions;

	private String envType;

	private Long projectId;
	public SetConnectionShareRequest() {
		super("dataworks-public", "2020-05-18", "SetConnectionShare");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectPermissions() {
		return this.projectPermissions;
	}

	public void setProjectPermissions(String projectPermissions) {
		this.projectPermissions = projectPermissions;
		if(projectPermissions != null){
			putQueryParameter("ProjectPermissions", projectPermissions);
		}
	}

	public String getDatasourceName() {
		return this.datasourceName;
	}

	public void setDatasourceName(String datasourceName) {
		this.datasourceName = datasourceName;
		if(datasourceName != null){
			putQueryParameter("DatasourceName", datasourceName);
		}
	}

	public String getUserPermissions() {
		return this.userPermissions;
	}

	public void setUserPermissions(String userPermissions) {
		this.userPermissions = userPermissions;
		if(userPermissions != null){
			putQueryParameter("UserPermissions", userPermissions);
		}
	}

	public String getEnvType() {
		return this.envType;
	}

	public void setEnvType(String envType) {
		this.envType = envType;
		if(envType != null){
			putQueryParameter("EnvType", envType);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	@Override
	public Class<SetConnectionShareResponse> getResponseClass() {
		return SetConnectionShareResponse.class;
	}

}
