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
public class ModifyInstanceSpecRequest extends RpcAcsRequest<ModifyInstanceSpecResponse> {
	   

	private Long resourceOwnerId;

	private String nodeType;

	private String clientToken;

	private Integer slaveReadOnlyCount;

	private String couponNo;

	private Integer storage;

	private String instanceClass;

	private String storageType;

	private String securityToken;

	private String effectiveTime;

	private String sourceBiz;

	private String businessInfo;

	private Integer shardCount;

	private Boolean autoPay;

	private String majorVersion;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Boolean forceTrans;

	private String instanceId;

	private Integer readOnlyCount;

	private Boolean forceUpgrade;

	private Integer slaveReplicaCount;

	private String orderType;

	private Integer replicaCount;
	public ModifyInstanceSpecRequest() {
		super("R-kvstore", "2015-01-01", "ModifyInstanceSpec", "redisa");
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

	public String getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
		if(nodeType != null){
			putQueryParameter("NodeType", nodeType);
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

	public Integer getSlaveReadOnlyCount() {
		return this.slaveReadOnlyCount;
	}

	public void setSlaveReadOnlyCount(Integer slaveReadOnlyCount) {
		this.slaveReadOnlyCount = slaveReadOnlyCount;
		if(slaveReadOnlyCount != null){
			putQueryParameter("SlaveReadOnlyCount", slaveReadOnlyCount.toString());
		}
	}

	public String getCouponNo() {
		return this.couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
		if(couponNo != null){
			putQueryParameter("CouponNo", couponNo);
		}
	}

	public Integer getStorage() {
		return this.storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
		if(storage != null){
			putQueryParameter("Storage", storage.toString());
		}
	}

	public String getInstanceClass() {
		return this.instanceClass;
	}

	public void setInstanceClass(String instanceClass) {
		this.instanceClass = instanceClass;
		if(instanceClass != null){
			putQueryParameter("InstanceClass", instanceClass);
		}
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
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

	public String getEffectiveTime() {
		return this.effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
		if(effectiveTime != null){
			putQueryParameter("EffectiveTime", effectiveTime);
		}
	}

	public String getSourceBiz() {
		return this.sourceBiz;
	}

	public void setSourceBiz(String sourceBiz) {
		this.sourceBiz = sourceBiz;
		if(sourceBiz != null){
			putQueryParameter("SourceBiz", sourceBiz);
		}
	}

	public String getBusinessInfo() {
		return this.businessInfo;
	}

	public void setBusinessInfo(String businessInfo) {
		this.businessInfo = businessInfo;
		if(businessInfo != null){
			putQueryParameter("BusinessInfo", businessInfo);
		}
	}

	public Integer getShardCount() {
		return this.shardCount;
	}

	public void setShardCount(Integer shardCount) {
		this.shardCount = shardCount;
		if(shardCount != null){
			putQueryParameter("ShardCount", shardCount.toString());
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public String getMajorVersion() {
		return this.majorVersion;
	}

	public void setMajorVersion(String majorVersion) {
		this.majorVersion = majorVersion;
		if(majorVersion != null){
			putQueryParameter("MajorVersion", majorVersion);
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

	public Boolean getForceTrans() {
		return this.forceTrans;
	}

	public void setForceTrans(Boolean forceTrans) {
		this.forceTrans = forceTrans;
		if(forceTrans != null){
			putQueryParameter("ForceTrans", forceTrans.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getReadOnlyCount() {
		return this.readOnlyCount;
	}

	public void setReadOnlyCount(Integer readOnlyCount) {
		this.readOnlyCount = readOnlyCount;
		if(readOnlyCount != null){
			putQueryParameter("ReadOnlyCount", readOnlyCount.toString());
		}
	}

	public Boolean getForceUpgrade() {
		return this.forceUpgrade;
	}

	public void setForceUpgrade(Boolean forceUpgrade) {
		this.forceUpgrade = forceUpgrade;
		if(forceUpgrade != null){
			putQueryParameter("ForceUpgrade", forceUpgrade.toString());
		}
	}

	public Integer getSlaveReplicaCount() {
		return this.slaveReplicaCount;
	}

	public void setSlaveReplicaCount(Integer slaveReplicaCount) {
		this.slaveReplicaCount = slaveReplicaCount;
		if(slaveReplicaCount != null){
			putQueryParameter("SlaveReplicaCount", slaveReplicaCount.toString());
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	public Integer getReplicaCount() {
		return this.replicaCount;
	}

	public void setReplicaCount(Integer replicaCount) {
		this.replicaCount = replicaCount;
		if(replicaCount != null){
			putQueryParameter("ReplicaCount", replicaCount.toString());
		}
	}

	@Override
	public Class<ModifyInstanceSpecResponse> getResponseClass() {
		return ModifyInstanceSpecResponse.class;
	}

}
