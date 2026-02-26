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

package com.aliyuncs.dms_dg.model.v20230914;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ConnectDatabaseRequest extends RpcAcsRequest<ConnectDatabaseResponse> {
	   

	private String dbName;

	private Integer port;

	private String dbPassword;

	private String host;

	private String dbType;

	private String dbUserName;

	private String gatewayId;
	public ConnectDatabaseRequest() {
		super("dms-dg", "2023-09-14", "ConnectDatabase");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putBodyParameter("DbName", dbName);
		}
	}

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
		if(port != null){
			putBodyParameter("Port", port.toString());
		}
	}

	public String getDbPassword() {
		return this.dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
		if(dbPassword != null){
			putBodyParameter("DbPassword", dbPassword);
		}
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
		if(host != null){
			putBodyParameter("Host", host);
		}
	}

	public String getDbType() {
		return this.dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
		if(dbType != null){
			putBodyParameter("DbType", dbType);
		}
	}

	public String getDbUserName() {
		return this.dbUserName;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
		if(dbUserName != null){
			putBodyParameter("DbUserName", dbUserName);
		}
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putBodyParameter("GatewayId", gatewayId);
		}
	}

	@Override
	public Class<ConnectDatabaseResponse> getResponseClass() {
		return ConnectDatabaseResponse.class;
	}

}
