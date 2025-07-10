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
public class ModifyRemoteADBDataSourceRequest extends RpcAcsRequest<ModifyRemoteADBDataSourceResponse> {
	   

	private String userPassword;

	private String localDBInstanceId;

	private String dataSourceName;

	private Long ownerId;

	private String dataSourceId;

	private String userName;
	public ModifyRemoteADBDataSourceRequest() {
		super("gpdb", "2016-05-03", "ModifyRemoteADBDataSource", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putQueryParameter("DataSourceId", dataSourceId);
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
	public Class<ModifyRemoteADBDataSourceResponse> getResponseClass() {
		return ModifyRemoteADBDataSourceResponse.class;
	}

}
