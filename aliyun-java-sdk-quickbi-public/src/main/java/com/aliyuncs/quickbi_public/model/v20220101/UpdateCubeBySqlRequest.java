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
public class UpdateCubeBySqlRequest extends RpcAcsRequest<UpdateCubeBySqlResponse> {
	   

	private String dsId;

	private String userId;

	private String cubeId;

	private String customSql;

	private String workspaceId;
	public UpdateCubeBySqlRequest() {
		super("quickbi-public", "2022-01-01", "UpdateCubeBySql", "2.2.0");
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

	public String getCubeId() {
		return this.cubeId;
	}

	public void setCubeId(String cubeId) {
		this.cubeId = cubeId;
		if(cubeId != null){
			putQueryParameter("CubeId", cubeId);
		}
	}

	public String getCustomSql() {
		return this.customSql;
	}

	public void setCustomSql(String customSql) {
		this.customSql = customSql;
		if(customSql != null){
			putQueryParameter("CustomSql", customSql);
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
	public Class<UpdateCubeBySqlResponse> getResponseClass() {
		return UpdateCubeBySqlResponse.class;
	}

}
