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
public class FailoverDBClusterRequest extends RpcAcsRequest<FailoverDBClusterResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private Boolean rollBackForDisaster;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private String targetZoneType;

	private Long ownerId;

	private String targetDBNodeId;
	public FailoverDBClusterRequest() {
		super("polardb", "2017-08-01", "FailoverDBCluster", "polardb");
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Boolean getRollBackForDisaster() {
		return this.rollBackForDisaster;
	}

	public void setRollBackForDisaster(Boolean rollBackForDisaster) {
		this.rollBackForDisaster = rollBackForDisaster;
		if(rollBackForDisaster != null){
			putQueryParameter("RollBackForDisaster", rollBackForDisaster.toString());
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

	public String getTargetZoneType() {
		return this.targetZoneType;
	}

	public void setTargetZoneType(String targetZoneType) {
		this.targetZoneType = targetZoneType;
		if(targetZoneType != null){
			putQueryParameter("TargetZoneType", targetZoneType);
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

	public String getTargetDBNodeId() {
		return this.targetDBNodeId;
	}

	public void setTargetDBNodeId(String targetDBNodeId) {
		this.targetDBNodeId = targetDBNodeId;
		if(targetDBNodeId != null){
			putQueryParameter("TargetDBNodeId", targetDBNodeId);
		}
	}

	@Override
	public Class<FailoverDBClusterResponse> getResponseClass() {
		return FailoverDBClusterResponse.class;
	}

}
