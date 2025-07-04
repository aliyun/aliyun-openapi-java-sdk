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

package com.aliyuncs.clickhouse.model.v20191111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.clickhouse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBClusterRequest extends RpcAcsRequest<ModifyDBClusterResponse> {
	   

	private Long resourceOwnerId;

	private String dbNodeStorageType;

	private String disableWriteWindows;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private String dBClusterClass;

	private Long ownerId;

	private String dBNodeGroupCount;

	private String dBNodeStorage;
	public ModifyDBClusterRequest() {
		super("clickhouse", "2019-11-11", "ModifyDBCluster", "service");
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

	public String getDbNodeStorageType() {
		return this.dbNodeStorageType;
	}

	public void setDbNodeStorageType(String dbNodeStorageType) {
		this.dbNodeStorageType = dbNodeStorageType;
		if(dbNodeStorageType != null){
			putQueryParameter("DbNodeStorageType", dbNodeStorageType);
		}
	}

	public String getDisableWriteWindows() {
		return this.disableWriteWindows;
	}

	public void setDisableWriteWindows(String disableWriteWindows) {
		this.disableWriteWindows = disableWriteWindows;
		if(disableWriteWindows != null){
			putQueryParameter("DisableWriteWindows", disableWriteWindows);
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

	public String getDBClusterClass() {
		return this.dBClusterClass;
	}

	public void setDBClusterClass(String dBClusterClass) {
		this.dBClusterClass = dBClusterClass;
		if(dBClusterClass != null){
			putQueryParameter("DBClusterClass", dBClusterClass);
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

	public String getDBNodeGroupCount() {
		return this.dBNodeGroupCount;
	}

	public void setDBNodeGroupCount(String dBNodeGroupCount) {
		this.dBNodeGroupCount = dBNodeGroupCount;
		if(dBNodeGroupCount != null){
			putQueryParameter("DBNodeGroupCount", dBNodeGroupCount);
		}
	}

	public String getDBNodeStorage() {
		return this.dBNodeStorage;
	}

	public void setDBNodeStorage(String dBNodeStorage) {
		this.dBNodeStorage = dBNodeStorage;
		if(dBNodeStorage != null){
			putQueryParameter("DBNodeStorage", dBNodeStorage);
		}
	}

	@Override
	public Class<ModifyDBClusterResponse> getResponseClass() {
		return ModifyDBClusterResponse.class;
	}

}
