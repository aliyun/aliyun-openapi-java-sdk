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
public class ListTableGranteesRequest extends RpcAcsRequest<ListTableGranteesResponse> {
	   

	private String maxComputeProjectName;

	private String tableName;

	private Integer workspaceId;

	private String engineType;
	public ListTableGranteesRequest() {
		super("dataworks-public", "2020-05-18", "ListTableGrantees");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMaxComputeProjectName() {
		return this.maxComputeProjectName;
	}

	public void setMaxComputeProjectName(String maxComputeProjectName) {
		this.maxComputeProjectName = maxComputeProjectName;
		if(maxComputeProjectName != null){
			putQueryParameter("MaxComputeProjectName", maxComputeProjectName);
		}
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putQueryParameter("TableName", tableName);
		}
	}

	public Integer getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(Integer workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId.toString());
		}
	}

	public String getEngineType() {
		return this.engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
		if(engineType != null){
			putQueryParameter("EngineType", engineType);
		}
	}

	@Override
	public Class<ListTableGranteesResponse> getResponseClass() {
		return ListTableGranteesResponse.class;
	}

}
