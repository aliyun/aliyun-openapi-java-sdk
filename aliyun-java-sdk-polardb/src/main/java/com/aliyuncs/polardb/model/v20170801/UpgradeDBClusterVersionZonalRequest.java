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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpgradeDBClusterVersionZonalRequest extends RpcAcsRequest<UpgradeDBClusterVersionZonalResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String upgradeType;

	private String plannedEndTime;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String upgradeLabel;

	private String ownerAccount;

	private Long ownerId;

	private String plannedStartTime;

	private String targetDBRevisionVersionCode;

	private String targetProxyRevisionVersionCode;

	private String upgradePolicy;

	private Boolean fromTimeService;
	public UpgradeDBClusterVersionZonalRequest() {
		super("polardb", "2017-08-01", "UpgradeDBClusterVersionZonal", "polardb");
		setProtocol(ProtocolType.HTTPS);
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

	public String getUpgradeType() {
		return this.upgradeType;
	}

	public void setUpgradeType(String upgradeType) {
		this.upgradeType = upgradeType;
		if(upgradeType != null){
			putQueryParameter("UpgradeType", upgradeType);
		}
	}

	public String getPlannedEndTime() {
		return this.plannedEndTime;
	}

	public void setPlannedEndTime(String plannedEndTime) {
		this.plannedEndTime = plannedEndTime;
		if(plannedEndTime != null){
			putQueryParameter("PlannedEndTime", plannedEndTime);
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

	public String getUpgradeLabel() {
		return this.upgradeLabel;
	}

	public void setUpgradeLabel(String upgradeLabel) {
		this.upgradeLabel = upgradeLabel;
		if(upgradeLabel != null){
			putQueryParameter("UpgradeLabel", upgradeLabel);
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

	public String getPlannedStartTime() {
		return this.plannedStartTime;
	}

	public void setPlannedStartTime(String plannedStartTime) {
		this.plannedStartTime = plannedStartTime;
		if(plannedStartTime != null){
			putQueryParameter("PlannedStartTime", plannedStartTime);
		}
	}

	public String getTargetDBRevisionVersionCode() {
		return this.targetDBRevisionVersionCode;
	}

	public void setTargetDBRevisionVersionCode(String targetDBRevisionVersionCode) {
		this.targetDBRevisionVersionCode = targetDBRevisionVersionCode;
		if(targetDBRevisionVersionCode != null){
			putQueryParameter("TargetDBRevisionVersionCode", targetDBRevisionVersionCode);
		}
	}

	public String getTargetProxyRevisionVersionCode() {
		return this.targetProxyRevisionVersionCode;
	}

	public void setTargetProxyRevisionVersionCode(String targetProxyRevisionVersionCode) {
		this.targetProxyRevisionVersionCode = targetProxyRevisionVersionCode;
		if(targetProxyRevisionVersionCode != null){
			putQueryParameter("TargetProxyRevisionVersionCode", targetProxyRevisionVersionCode);
		}
	}

	public String getUpgradePolicy() {
		return this.upgradePolicy;
	}

	public void setUpgradePolicy(String upgradePolicy) {
		this.upgradePolicy = upgradePolicy;
		if(upgradePolicy != null){
			putQueryParameter("UpgradePolicy", upgradePolicy);
		}
	}

	public Boolean getFromTimeService() {
		return this.fromTimeService;
	}

	public void setFromTimeService(Boolean fromTimeService) {
		this.fromTimeService = fromTimeService;
		if(fromTimeService != null){
			putQueryParameter("FromTimeService", fromTimeService.toString());
		}
	}

	@Override
	public Class<UpgradeDBClusterVersionZonalResponse> getResponseClass() {
		return UpgradeDBClusterVersionZonalResponse.class;
	}

}
