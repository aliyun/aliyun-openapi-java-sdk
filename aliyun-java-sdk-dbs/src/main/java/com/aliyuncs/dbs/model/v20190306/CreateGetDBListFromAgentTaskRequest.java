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

package com.aliyuncs.dbs.model.v20190306;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dbs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateGetDBListFromAgentTaskRequest extends RpcAcsRequest<CreateGetDBListFromAgentTaskResponse> {
	   

	private String sourceEndpointRegion;

	private Long backupGatewayId;

	private String databaseType;

	private String clientToken;

	private String ownerId;

	private Integer sourceEndpointPort;

	private String sourceEndpointIP;
	public CreateGetDBListFromAgentTaskRequest() {
		super("Dbs", "2019-03-06", "CreateGetDBListFromAgentTask", "cbs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceEndpointRegion() {
		return this.sourceEndpointRegion;
	}

	public void setSourceEndpointRegion(String sourceEndpointRegion) {
		this.sourceEndpointRegion = sourceEndpointRegion;
		if(sourceEndpointRegion != null){
			putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
		}
	}

	public Long getBackupGatewayId() {
		return this.backupGatewayId;
	}

	public void setBackupGatewayId(Long backupGatewayId) {
		this.backupGatewayId = backupGatewayId;
		if(backupGatewayId != null){
			putQueryParameter("BackupGatewayId", backupGatewayId.toString());
		}
	}

	public String getDatabaseType() {
		return this.databaseType;
	}

	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
		if(databaseType != null){
			putQueryParameter("DatabaseType", databaseType);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public Integer getSourceEndpointPort() {
		return this.sourceEndpointPort;
	}

	public void setSourceEndpointPort(Integer sourceEndpointPort) {
		this.sourceEndpointPort = sourceEndpointPort;
		if(sourceEndpointPort != null){
			putQueryParameter("SourceEndpointPort", sourceEndpointPort.toString());
		}
	}

	public String getSourceEndpointIP() {
		return this.sourceEndpointIP;
	}

	public void setSourceEndpointIP(String sourceEndpointIP) {
		this.sourceEndpointIP = sourceEndpointIP;
		if(sourceEndpointIP != null){
			putQueryParameter("SourceEndpointIP", sourceEndpointIP);
		}
	}

	@Override
	public Class<CreateGetDBListFromAgentTaskResponse> getResponseClass() {
		return CreateGetDBListFromAgentTaskResponse.class;
	}

}
