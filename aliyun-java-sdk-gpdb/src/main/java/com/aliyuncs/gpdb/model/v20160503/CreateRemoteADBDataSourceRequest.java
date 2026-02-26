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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRemoteADBDataSourceRequest extends RpcAcsRequest<CreateRemoteADBDataSourceResponse> {
	   

	private String managerUserPassword;

	private String userPassword;

	private String localDBInstanceId;

	private String remoteDBInstanceId;

	private String dataSourceName;

	private Long ownerId;

	private String managerUserName;

	private String remoteDatabase;

	private String localDatabase;

	private String userName;
	public CreateRemoteADBDataSourceRequest() {
		super("gpdb", "2016-05-03", "CreateRemoteADBDataSource", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getManagerUserPassword() {
		return this.managerUserPassword;
	}

	public void setManagerUserPassword(String managerUserPassword) {
		this.managerUserPassword = managerUserPassword;
		if(managerUserPassword != null){
			putQueryParameter("ManagerUserPassword", managerUserPassword);
		}
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
		if(userPassword != null){
			putQueryParameter("UserPassword", userPassword);
		}
	}

	public String getLocalDBInstanceId() {
		return this.localDBInstanceId;
	}

	public void setLocalDBInstanceId(String localDBInstanceId) {
		this.localDBInstanceId = localDBInstanceId;
		if(localDBInstanceId != null){
			putQueryParameter("LocalDBInstanceId", localDBInstanceId);
		}
	}

	public String getRemoteDBInstanceId() {
		return this.remoteDBInstanceId;
	}

	public void setRemoteDBInstanceId(String remoteDBInstanceId) {
		this.remoteDBInstanceId = remoteDBInstanceId;
		if(remoteDBInstanceId != null){
			putQueryParameter("RemoteDBInstanceId", remoteDBInstanceId);
		}
	}

	public String getDataSourceName() {
		return this.dataSourceName;
	}

	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
		if(dataSourceName != null){
			putQueryParameter("DataSourceName", dataSourceName);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getManagerUserName() {
		return this.managerUserName;
	}

	public void setManagerUserName(String managerUserName) {
		this.managerUserName = managerUserName;
		if(managerUserName != null){
			putQueryParameter("ManagerUserName", managerUserName);
		}
	}

	public String getRemoteDatabase() {
		return this.remoteDatabase;
	}

	public void setRemoteDatabase(String remoteDatabase) {
		this.remoteDatabase = remoteDatabase;
		if(remoteDatabase != null){
			putQueryParameter("RemoteDatabase", remoteDatabase);
		}
	}

	public String getLocalDatabase() {
		return this.localDatabase;
	}

	public void setLocalDatabase(String localDatabase) {
		this.localDatabase = localDatabase;
		if(localDatabase != null){
			putQueryParameter("LocalDatabase", localDatabase);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<CreateRemoteADBDataSourceResponse> getResponseClass() {
		return CreateRemoteADBDataSourceResponse.class;
	}

}
