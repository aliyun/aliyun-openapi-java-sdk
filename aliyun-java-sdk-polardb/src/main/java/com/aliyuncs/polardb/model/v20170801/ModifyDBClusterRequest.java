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
public class ModifyDBClusterRequest extends RpcAcsRequest<ModifyDBClusterResponse> {
	   

	private Long resourceOwnerId;

	private String standbyHAMode;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private String dBNodeCrashList;

	private String faultSimulateMode;

	private Long ownerId;

	private String compressStorage;

	private Long storageUpperBound;

	private String imciAutoIndex;

	private String storageAutoScale;

	private String faultInjectionType;

	private String dataSyncMode;
	public ModifyDBClusterRequest() {
		super("polardb", "2017-08-01", "ModifyDBCluster", "polardb");
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

	public String getStandbyHAMode() {
		return this.standbyHAMode;
	}

	public void setStandbyHAMode(String standbyHAMode) {
		this.standbyHAMode = standbyHAMode;
		if(standbyHAMode != null){
			putQueryParameter("StandbyHAMode", standbyHAMode);
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

	public String getDBNodeCrashList() {
		return this.dBNodeCrashList;
	}

	public void setDBNodeCrashList(String dBNodeCrashList) {
		this.dBNodeCrashList = dBNodeCrashList;
		if(dBNodeCrashList != null){
			putQueryParameter("DBNodeCrashList", dBNodeCrashList);
		}
	}

	public String getFaultSimulateMode() {
		return this.faultSimulateMode;
	}

	public void setFaultSimulateMode(String faultSimulateMode) {
		this.faultSimulateMode = faultSimulateMode;
		if(faultSimulateMode != null){
			putQueryParameter("FaultSimulateMode", faultSimulateMode);
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

	public String getCompressStorage() {
		return this.compressStorage;
	}

	public void setCompressStorage(String compressStorage) {
		this.compressStorage = compressStorage;
		if(compressStorage != null){
			putQueryParameter("CompressStorage", compressStorage);
		}
	}

	public Long getStorageUpperBound() {
		return this.storageUpperBound;
	}

	public void setStorageUpperBound(Long storageUpperBound) {
		this.storageUpperBound = storageUpperBound;
		if(storageUpperBound != null){
			putQueryParameter("StorageUpperBound", storageUpperBound.toString());
		}
	}

	public String getImciAutoIndex() {
		return this.imciAutoIndex;
	}

	public void setImciAutoIndex(String imciAutoIndex) {
		this.imciAutoIndex = imciAutoIndex;
		if(imciAutoIndex != null){
			putQueryParameter("ImciAutoIndex", imciAutoIndex);
		}
	}

	public String getStorageAutoScale() {
		return this.storageAutoScale;
	}

	public void setStorageAutoScale(String storageAutoScale) {
		this.storageAutoScale = storageAutoScale;
		if(storageAutoScale != null){
			putQueryParameter("StorageAutoScale", storageAutoScale);
		}
	}

	public String getFaultInjectionType() {
		return this.faultInjectionType;
	}

	public void setFaultInjectionType(String faultInjectionType) {
		this.faultInjectionType = faultInjectionType;
		if(faultInjectionType != null){
			putQueryParameter("FaultInjectionType", faultInjectionType);
		}
	}

	public String getDataSyncMode() {
		return this.dataSyncMode;
	}

	public void setDataSyncMode(String dataSyncMode) {
		this.dataSyncMode = dataSyncMode;
		if(dataSyncMode != null){
			putQueryParameter("DataSyncMode", dataSyncMode);
		}
	}

	@Override
	public Class<ModifyDBClusterResponse> getResponseClass() {
		return ModifyDBClusterResponse.class;
	}

}
