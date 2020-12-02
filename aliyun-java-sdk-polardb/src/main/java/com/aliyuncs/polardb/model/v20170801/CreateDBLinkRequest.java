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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDBLinkRequest extends RpcAcsRequest<CreateDBLinkResponse> {
	   

	private Long resourceOwnerId;

	private String sourceDBName;

	private String targetDBName;

	private String dBLinkName;

	private String resourceOwnerAccount;

	private String targetDBInstanceName;

	private String dBClusterId;

	private String ownerAccount;

	private String targetDBPasswd;

	private Long ownerId;

	private String targetDBAccount;
	public CreateDBLinkRequest() {
		super("polardb", "2017-08-01", "CreateDBLink", "polardb");
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

	public String getSourceDBName() {
		return this.sourceDBName;
	}

	public void setSourceDBName(String sourceDBName) {
		this.sourceDBName = sourceDBName;
		if(sourceDBName != null){
			putQueryParameter("SourceDBName", sourceDBName);
		}
	}

	public String getTargetDBName() {
		return this.targetDBName;
	}

	public void setTargetDBName(String targetDBName) {
		this.targetDBName = targetDBName;
		if(targetDBName != null){
			putQueryParameter("TargetDBName", targetDBName);
		}
	}

	public String getDBLinkName() {
		return this.dBLinkName;
	}

	public void setDBLinkName(String dBLinkName) {
		this.dBLinkName = dBLinkName;
		if(dBLinkName != null){
			putQueryParameter("DBLinkName", dBLinkName);
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

	public String getTargetDBInstanceName() {
		return this.targetDBInstanceName;
	}

	public void setTargetDBInstanceName(String targetDBInstanceName) {
		this.targetDBInstanceName = targetDBInstanceName;
		if(targetDBInstanceName != null){
			putQueryParameter("TargetDBInstanceName", targetDBInstanceName);
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
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

	public String getTargetDBPasswd() {
		return this.targetDBPasswd;
	}

	public void setTargetDBPasswd(String targetDBPasswd) {
		this.targetDBPasswd = targetDBPasswd;
		if(targetDBPasswd != null){
			putQueryParameter("TargetDBPasswd", targetDBPasswd);
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

	public String getTargetDBAccount() {
		return this.targetDBAccount;
	}

	public void setTargetDBAccount(String targetDBAccount) {
		this.targetDBAccount = targetDBAccount;
		if(targetDBAccount != null){
			putQueryParameter("TargetDBAccount", targetDBAccount);
		}
	}

	@Override
	public Class<CreateDBLinkResponse> getResponseClass() {
		return CreateDBLinkResponse.class;
	}

}
