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
public class RevokeTablePermissionRequest extends RpcAcsRequest<RevokeTablePermissionResponse> {
	   

	private String revokeUserName;

	private String maxComputeProjectName;

	private String revokeUserId;

	private String tableName;

	private String actions;

	private Long workspaceId;
	public RevokeTablePermissionRequest() {
		super("dataworks-public", "2020-05-18", "RevokeTablePermission");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRevokeUserName() {
		return this.revokeUserName;
	}

	public void setRevokeUserName(String revokeUserName) {
		this.revokeUserName = revokeUserName;
		if(revokeUserName != null){
			putQueryParameter("RevokeUserName", revokeUserName);
		}
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

	public String getRevokeUserId() {
		return this.revokeUserId;
	}

	public void setRevokeUserId(String revokeUserId) {
		this.revokeUserId = revokeUserId;
		if(revokeUserId != null){
			putQueryParameter("RevokeUserId", revokeUserId);
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

	public String getActions() {
		return this.actions;
	}

	public void setActions(String actions) {
		this.actions = actions;
		if(actions != null){
			putQueryParameter("Actions", actions);
		}
	}

	public Long getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(Long workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId.toString());
		}
	}

	@Override
	public Class<RevokeTablePermissionResponse> getResponseClass() {
		return RevokeTablePermissionResponse.class;
	}

}
