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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.r_kvstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBInstanceConnectionStringRequest extends RpcAcsRequest<ModifyDBInstanceConnectionStringResponse> {
	   

	private Long resourceOwnerId;

	private String securityToken;

	private String dBInstanceId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String newConnectionString;

	private Long ownerId;

	private String iPType;

	private String currentConnectionString;

	private String port;
	public ModifyDBInstanceConnectionStringRequest() {
		super("R-kvstore", "2015-01-01", "ModifyDBInstanceConnectionString", "redisa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getNewConnectionString() {
		return this.newConnectionString;
	}

	public void setNewConnectionString(String newConnectionString) {
		this.newConnectionString = newConnectionString;
		if(newConnectionString != null){
			putQueryParameter("NewConnectionString", newConnectionString);
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

	public String getIPType() {
		return this.iPType;
	}

	public void setIPType(String iPType) {
		this.iPType = iPType;
		if(iPType != null){
			putQueryParameter("IPType", iPType);
		}
	}

	public String getCurrentConnectionString() {
		return this.currentConnectionString;
	}

	public void setCurrentConnectionString(String currentConnectionString) {
		this.currentConnectionString = currentConnectionString;
		if(currentConnectionString != null){
			putQueryParameter("CurrentConnectionString", currentConnectionString);
		}
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port);
		}
	}

	@Override
	public Class<ModifyDBInstanceConnectionStringResponse> getResponseClass() {
		return ModifyDBInstanceConnectionStringResponse.class;
	}

}
