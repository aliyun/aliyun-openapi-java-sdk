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
public class CreateDBClusterRequest extends RpcAcsRequest<CreateDBClusterResponse> {
	   

	private Long resourceOwnerId;

	private String dBClusterDescription;

	private String clientToken;

	private String clusterNetworkType;

	private String resourceGroupId;

	private String dBNodeClass;

	private String gDNId;

	private String creationOption;

	private String sourceResourceId;

	private String period;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String usedTime;

	private String vSwitchId;

	private String securityIPList;

	private Boolean autoRenew;

	private String vPCId;

	private String dBType;

	private String zoneId;

	private String dBVersion;

	private String cloneDataPoint;

	private Boolean tDEStatus;

	private String payType;
	public CreateDBClusterRequest() {
		super("polardb", "2017-08-01", "CreateDBCluster", "polardb");
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

	public String getDBClusterDescription() {
		return this.dBClusterDescription;
	}

	public void setDBClusterDescription(String dBClusterDescription) {
		this.dBClusterDescription = dBClusterDescription;
		if(dBClusterDescription != null){
			putQueryParameter("DBClusterDescription", dBClusterDescription);
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

	public String getClusterNetworkType() {
		return this.clusterNetworkType;
	}

	public void setClusterNetworkType(String clusterNetworkType) {
		this.clusterNetworkType = clusterNetworkType;
		if(clusterNetworkType != null){
			putQueryParameter("ClusterNetworkType", clusterNetworkType);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getDBNodeClass() {
		return this.dBNodeClass;
	}

	public void setDBNodeClass(String dBNodeClass) {
		this.dBNodeClass = dBNodeClass;
		if(dBNodeClass != null){
			putQueryParameter("DBNodeClass", dBNodeClass);
		}
	}

	public String getGDNId() {
		return this.gDNId;
	}

	public void setGDNId(String gDNId) {
		this.gDNId = gDNId;
		if(gDNId != null){
			putQueryParameter("GDNId", gDNId);
		}
	}

	public String getCreationOption() {
		return this.creationOption;
	}

	public void setCreationOption(String creationOption) {
		this.creationOption = creationOption;
		if(creationOption != null){
			putQueryParameter("CreationOption", creationOption);
		}
	}

	public String getSourceResourceId() {
		return this.sourceResourceId;
	}

	public void setSourceResourceId(String sourceResourceId) {
		this.sourceResourceId = sourceResourceId;
		if(sourceResourceId != null){
			putQueryParameter("SourceResourceId", sourceResourceId);
		}
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
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

	public String getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(String usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		this.securityIPList = securityIPList;
		if(securityIPList != null){
			putQueryParameter("SecurityIPList", securityIPList);
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
		}
	}

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
		if(vPCId != null){
			putQueryParameter("VPCId", vPCId);
		}
	}

	public String getDBType() {
		return this.dBType;
	}

	public void setDBType(String dBType) {
		this.dBType = dBType;
		if(dBType != null){
			putQueryParameter("DBType", dBType);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getDBVersion() {
		return this.dBVersion;
	}

	public void setDBVersion(String dBVersion) {
		this.dBVersion = dBVersion;
		if(dBVersion != null){
			putQueryParameter("DBVersion", dBVersion);
		}
	}

	public String getCloneDataPoint() {
		return this.cloneDataPoint;
	}

	public void setCloneDataPoint(String cloneDataPoint) {
		this.cloneDataPoint = cloneDataPoint;
		if(cloneDataPoint != null){
			putQueryParameter("CloneDataPoint", cloneDataPoint);
		}
	}

	public Boolean getTDEStatus() {
		return this.tDEStatus;
	}

	public void setTDEStatus(Boolean tDEStatus) {
		this.tDEStatus = tDEStatus;
		if(tDEStatus != null){
			putQueryParameter("TDEStatus", tDEStatus.toString());
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	@Override
	public Class<CreateDBClusterResponse> getResponseClass() {
		return CreateDBClusterResponse.class;
	}

}
