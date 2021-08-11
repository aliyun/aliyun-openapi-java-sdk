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
public class CreateDataSourceRequest extends RpcAcsRequest<CreateDataSourceResponse> {
	   

	private String databaseAddress;

	private String dataSourceType;

	private String regionCode;

	private String databaseUserName;

	private String databasePassword;

	private String databasePort;

	private String accessId;

	private String displayName;

	private String databaseName;

	private String dataSourceId;

	private String createType;

	private String workspaceId;
	public CreateDataSourceRequest() {
		super("retailadvqa-public", "2020-05-15", "CreateDataSource");
		setMethod(MethodType.POST);
	}

	public String getDatabaseAddress() {
		return this.databaseAddress;
	}

	public void setDatabaseAddress(String databaseAddress) {
		this.databaseAddress = databaseAddress;
		if(databaseAddress != null){
			putQueryParameter("DatabaseAddress", databaseAddress);
		}
	}

	public String getDataSourceType() {
		return this.dataSourceType;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
		if(dataSourceType != null){
			putQueryParameter("DataSourceType", dataSourceType);
		}
	}

	public String getRegionCode() {
		return this.regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
		if(regionCode != null){
			putQueryParameter("RegionCode", regionCode);
		}
	}

	public String getDatabaseUserName() {
		return this.databaseUserName;
	}

	public void setDatabaseUserName(String databaseUserName) {
		this.databaseUserName = databaseUserName;
		if(databaseUserName != null){
			putQueryParameter("DatabaseUserName", databaseUserName);
		}
	}

	public String getDatabasePassword() {
		return this.databasePassword;
	}

	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
		if(databasePassword != null){
			putQueryParameter("DatabasePassword", databasePassword);
		}
	}

	public String getDatabasePort() {
		return this.databasePort;
	}

	public void setDatabasePort(String databasePort) {
		this.databasePort = databasePort;
		if(databasePort != null){
			putQueryParameter("DatabasePort", databasePort);
		}
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

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
		}
	}

	public String getDatabaseName() {
		return this.databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
		if(databaseName != null){
			putQueryParameter("DatabaseName", databaseName);
		}
	}

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putQueryParameter("DataSourceId", dataSourceId);
		}
	}

	public String getCreateType() {
		return this.createType;
	}

	public void setCreateType(String createType) {
		this.createType = createType;
		if(createType != null){
			putQueryParameter("CreateType", createType);
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
	public Class<CreateDataSourceResponse> getResponseClass() {
		return CreateDataSourceResponse.class;
	}

}
