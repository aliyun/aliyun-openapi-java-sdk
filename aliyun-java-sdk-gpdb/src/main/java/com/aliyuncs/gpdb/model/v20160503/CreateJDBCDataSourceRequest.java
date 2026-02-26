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
public class CreateJDBCDataSourceRequest extends RpcAcsRequest<CreateJDBCDataSourceResponse> {
	   

	private String dataSourceType;

	private String dataSourceDescription;

	private String jDBCPassword;

	private String dBInstanceId;

	private String dataSourceName;

	private String jDBCConnectionString;

	private String jDBCUserName;
	public CreateJDBCDataSourceRequest() {
		super("gpdb", "2016-05-03", "CreateJDBCDataSource", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getDataSourceDescription() {
		return this.dataSourceDescription;
	}

	public void setDataSourceDescription(String dataSourceDescription) {
		this.dataSourceDescription = dataSourceDescription;
		if(dataSourceDescription != null){
			putQueryParameter("DataSourceDescription", dataSourceDescription);
		}
	}

	public String getJDBCPassword() {
		return this.jDBCPassword;
	}

	public void setJDBCPassword(String jDBCPassword) {
		this.jDBCPassword = jDBCPassword;
		if(jDBCPassword != null){
			putQueryParameter("JDBCPassword", jDBCPassword);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
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

	public String getJDBCConnectionString() {
		return this.jDBCConnectionString;
	}

	public void setJDBCConnectionString(String jDBCConnectionString) {
		this.jDBCConnectionString = jDBCConnectionString;
		if(jDBCConnectionString != null){
			putQueryParameter("JDBCConnectionString", jDBCConnectionString);
		}
	}

	public String getJDBCUserName() {
		return this.jDBCUserName;
	}

	public void setJDBCUserName(String jDBCUserName) {
		this.jDBCUserName = jDBCUserName;
		if(jDBCUserName != null){
			putQueryParameter("JDBCUserName", jDBCUserName);
		}
	}

	@Override
	public Class<CreateJDBCDataSourceResponse> getResponseClass() {
		return CreateJDBCDataSourceResponse.class;
	}

}
