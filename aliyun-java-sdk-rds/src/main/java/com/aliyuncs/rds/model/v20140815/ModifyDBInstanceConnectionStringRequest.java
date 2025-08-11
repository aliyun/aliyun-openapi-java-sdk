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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBInstanceConnectionStringRequest extends RpcAcsRequest<ModifyDBInstanceConnectionStringResponse> {
	   

	private Long resourceOwnerId;

	private String connectionStringPrefix;

	private String pGBouncerPort;

	private String generalGroupName;

	private String dBInstanceId;

	private Boolean retainVip;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String babelfishPort;

	private String currentConnectionString;

	private String port;

	private String targetDBInstanceId;
	public ModifyDBInstanceConnectionStringRequest() {
		super("Rds", "2014-08-15", "ModifyDBInstanceConnectionString", "rds");
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

	public String getConnectionStringPrefix() {
		return this.connectionStringPrefix;
	}

	public void setConnectionStringPrefix(String connectionStringPrefix) {
		this.connectionStringPrefix = connectionStringPrefix;
		if(connectionStringPrefix != null){
			putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
		}
	}

	public String getPGBouncerPort() {
		return this.pGBouncerPort;
	}

	public void setPGBouncerPort(String pGBouncerPort) {
		this.pGBouncerPort = pGBouncerPort;
		if(pGBouncerPort != null){
			putQueryParameter("PGBouncerPort", pGBouncerPort);
		}
	}

	public String getGeneralGroupName() {
		return this.generalGroupName;
	}

	public void setGeneralGroupName(String generalGroupName) {
		this.generalGroupName = generalGroupName;
		if(generalGroupName != null){
			putQueryParameter("GeneralGroupName", generalGroupName);
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

	public Boolean getRetainVip() {
		return this.retainVip;
	}

	public void setRetainVip(Boolean retainVip) {
		this.retainVip = retainVip;
		if(retainVip != null){
			putQueryParameter("RetainVip", retainVip.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getBabelfishPort() {
		return this.babelfishPort;
	}

	public void setBabelfishPort(String babelfishPort) {
		this.babelfishPort = babelfishPort;
		if(babelfishPort != null){
			putQueryParameter("BabelfishPort", babelfishPort);
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

	public String getTargetDBInstanceId() {
		return this.targetDBInstanceId;
	}

	public void setTargetDBInstanceId(String targetDBInstanceId) {
		this.targetDBInstanceId = targetDBInstanceId;
		if(targetDBInstanceId != null){
			putQueryParameter("TargetDBInstanceId", targetDBInstanceId);
		}
	}

	@Override
	public Class<ModifyDBInstanceConnectionStringResponse> getResponseClass() {
		return ModifyDBInstanceConnectionStringResponse.class;
	}

}
