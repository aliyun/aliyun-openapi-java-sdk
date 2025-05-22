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
public class CreateReadOnlyDBInstanceRequest extends RpcAcsRequest<CreateReadOnlyDBInstanceResponse> {
	   

	private Long resourceOwnerId;

	private Integer dBInstanceStorage;

	private Boolean autoCreateProxy;

	private String engineVersion;

	private Boolean deletionProtection;

	private String resourceGroupId;

	private String targetDedicatedHostIdForMaster;

	private String dBInstanceDescription;

	private String gdnInstanceName;

	private String tddlBizType;

	private String period;

	private Long ownerId;

	private String dBInstanceClass;

	private String vSwitchId;

	private String privateIpAddress;

	private String autoRenew;

	private String port;

	private String promotionCode;

	private String zoneId;

	private String instanceNetworkType;

	private String clientToken;

	private String instructionSetArch;

	private Boolean autoUseCoupon;

	private String ioAccelerationEnabled;

	private String tddlRegionConfig;

	private String dBInstanceId;

	private String dBInstanceStorageType;

	private String dedicatedHostGroupId;

	private Boolean autoPay;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String usedTime;

	private Boolean burstingEnabled;

	private String vPCId;

	private String category;

	private String payType;

	private String bpeEnabled;
	public CreateReadOnlyDBInstanceRequest() {
		super("Rds", "2014-08-15", "CreateReadOnlyDBInstance", "rds");
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

	public Integer getDBInstanceStorage() {
		return this.dBInstanceStorage;
	}

	public void setDBInstanceStorage(Integer dBInstanceStorage) {
		this.dBInstanceStorage = dBInstanceStorage;
		if(dBInstanceStorage != null){
			putQueryParameter("DBInstanceStorage", dBInstanceStorage.toString());
		}
	}

	public Boolean getAutoCreateProxy() {
		return this.autoCreateProxy;
	}

	public void setAutoCreateProxy(Boolean autoCreateProxy) {
		this.autoCreateProxy = autoCreateProxy;
		if(autoCreateProxy != null){
			putQueryParameter("AutoCreateProxy", autoCreateProxy.toString());
		}
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
		if(engineVersion != null){
			putQueryParameter("EngineVersion", engineVersion);
		}
	}

	public Boolean getDeletionProtection() {
		return this.deletionProtection;
	}

	public void setDeletionProtection(Boolean deletionProtection) {
		this.deletionProtection = deletionProtection;
		if(deletionProtection != null){
			putQueryParameter("DeletionProtection", deletionProtection.toString());
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

	public String getTargetDedicatedHostIdForMaster() {
		return this.targetDedicatedHostIdForMaster;
	}

	public void setTargetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
		this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
		if(targetDedicatedHostIdForMaster != null){
			putQueryParameter("TargetDedicatedHostIdForMaster", targetDedicatedHostIdForMaster);
		}
	}

	public String getDBInstanceDescription() {
		return this.dBInstanceDescription;
	}

	public void setDBInstanceDescription(String dBInstanceDescription) {
		this.dBInstanceDescription = dBInstanceDescription;
		if(dBInstanceDescription != null){
			putQueryParameter("DBInstanceDescription", dBInstanceDescription);
		}
	}

	public String getGdnInstanceName() {
		return this.gdnInstanceName;
	}

	public void setGdnInstanceName(String gdnInstanceName) {
		this.gdnInstanceName = gdnInstanceName;
		if(gdnInstanceName != null){
			putQueryParameter("GdnInstanceName", gdnInstanceName);
		}
	}

	public String getTddlBizType() {
		return this.tddlBizType;
	}

	public void setTddlBizType(String tddlBizType) {
		this.tddlBizType = tddlBizType;
		if(tddlBizType != null){
			putQueryParameter("TddlBizType", tddlBizType);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getDBInstanceClass() {
		return this.dBInstanceClass;
	}

	public void setDBInstanceClass(String dBInstanceClass) {
		this.dBInstanceClass = dBInstanceClass;
		if(dBInstanceClass != null){
			putQueryParameter("DBInstanceClass", dBInstanceClass);
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

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
		}
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew);
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

	public String getPromotionCode() {
		return this.promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
		if(promotionCode != null){
			putQueryParameter("PromotionCode", promotionCode);
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

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
		if(instanceNetworkType != null){
			putQueryParameter("InstanceNetworkType", instanceNetworkType);
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

	public String getInstructionSetArch() {
		return this.instructionSetArch;
	}

	public void setInstructionSetArch(String instructionSetArch) {
		this.instructionSetArch = instructionSetArch;
		if(instructionSetArch != null){
			putQueryParameter("InstructionSetArch", instructionSetArch);
		}
	}

	public Boolean getAutoUseCoupon() {
		return this.autoUseCoupon;
	}

	public void setAutoUseCoupon(Boolean autoUseCoupon) {
		this.autoUseCoupon = autoUseCoupon;
		if(autoUseCoupon != null){
			putQueryParameter("AutoUseCoupon", autoUseCoupon.toString());
		}
	}

	public String getIoAccelerationEnabled() {
		return this.ioAccelerationEnabled;
	}

	public void setIoAccelerationEnabled(String ioAccelerationEnabled) {
		this.ioAccelerationEnabled = ioAccelerationEnabled;
		if(ioAccelerationEnabled != null){
			putQueryParameter("IoAccelerationEnabled", ioAccelerationEnabled);
		}
	}

	public String getTddlRegionConfig() {
		return this.tddlRegionConfig;
	}

	public void setTddlRegionConfig(String tddlRegionConfig) {
		this.tddlRegionConfig = tddlRegionConfig;
		if(tddlRegionConfig != null){
			putQueryParameter("TddlRegionConfig", tddlRegionConfig);
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

	public String getDBInstanceStorageType() {
		return this.dBInstanceStorageType;
	}

	public void setDBInstanceStorageType(String dBInstanceStorageType) {
		this.dBInstanceStorageType = dBInstanceStorageType;
		if(dBInstanceStorageType != null){
			putQueryParameter("DBInstanceStorageType", dBInstanceStorageType);
		}
	}

	public String getDedicatedHostGroupId() {
		return this.dedicatedHostGroupId;
	}

	public void setDedicatedHostGroupId(String dedicatedHostGroupId) {
		this.dedicatedHostGroupId = dedicatedHostGroupId;
		if(dedicatedHostGroupId != null){
			putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
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

	public String getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(String usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime);
		}
	}

	public Boolean getBurstingEnabled() {
		return this.burstingEnabled;
	}

	public void setBurstingEnabled(Boolean burstingEnabled) {
		this.burstingEnabled = burstingEnabled;
		if(burstingEnabled != null){
			putQueryParameter("BurstingEnabled", burstingEnabled.toString());
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

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
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

	public String getBpeEnabled() {
		return this.bpeEnabled;
	}

	public void setBpeEnabled(String bpeEnabled) {
		this.bpeEnabled = bpeEnabled;
		if(bpeEnabled != null){
			putQueryParameter("BpeEnabled", bpeEnabled);
		}
	}

	@Override
	public Class<CreateReadOnlyDBInstanceResponse> getResponseClass() {
		return CreateReadOnlyDBInstanceResponse.class;
	}

}
