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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateDatasetRequest extends RpcAcsRequest<CreateDatasetResponse> {
	   

	private String dsId;

	private String userId;

	private String tableName;

	private String targetDirectoryId;

	private String userDefineCubeName;

	private String workspaceId;
	public CreateDatasetRequest() {
		super("quickbi-public", "2022-01-01", "CreateDataset", "2.2.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getDsId() {
		return this.dsId;
	}

	public void setDsId(String dsId) {
		this.dsId = dsId;
		if(dsId != null){
			putQueryParameter("DsId", dsId);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
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

	public String getTargetDirectoryId() {
		return this.targetDirectoryId;
	}

	public void setTargetDirectoryId(String targetDirectoryId) {
		this.targetDirectoryId = targetDirectoryId;
		if(targetDirectoryId != null){
			putQueryParameter("TargetDirectoryId", targetDirectoryId);
		}
	}

	public String getUserDefineCubeName() {
		return this.userDefineCubeName;
	}

	public void setUserDefineCubeName(String userDefineCubeName) {
		this.userDefineCubeName = userDefineCubeName;
		if(userDefineCubeName != null){
			putQueryParameter("UserDefineCubeName", userDefineCubeName);
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
	public Class<CreateDatasetResponse> getResponseClass() {
		return CreateDatasetResponse.class;
	}

}
