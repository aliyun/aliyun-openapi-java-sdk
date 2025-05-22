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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBInstanceSpecRequest extends RpcAcsRequest<ModifyDBInstanceSpecResponse> {
	   

	private Long resourceOwnerId;

	private Integer dBInstanceStorage;

	private String optimizedWrites;

	private String engineVersion;

	private String resourceGroupId;

	@SerializedName("serverlessConfiguration")
	private ServerlessConfiguration serverlessConfiguration;

	private Long ownerId;

	private String dBInstanceClass;

	private String vSwitchId;

	private String promotionCode;

	private String zoneId;

	private String zoneIdSlave1;

	private Boolean autoUseCoupon;

	private String ioAccelerationEnabled;

	private Boolean coldDataEnabled;

	private String effectiveTime;

	private String readOnlyDBInstanceClass;

	private String dBInstanceId;

	private String switchTime;

	private String dBInstanceStorageType;

	private String sourceBiz;

	private String dedicatedHostGroupId;

	private String direction;

	private String compressionMode;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long usedTime;

	private Boolean burstingEnabled;

	private String targetMinorVersion;

	private Boolean allowMajorVersionUpgrade;

	private String category;

	private String payType;
	public ModifyDBInstanceSpecRequest() {
		super("Rds", "2014-08-15", "ModifyDBInstanceSpec", "rds");
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

	public String getOptimizedWrites() {
		return this.optimizedWrites;
	}

	public void setOptimizedWrites(String optimizedWrites) {
		this.optimizedWrites = optimizedWrites;
		if(optimizedWrites != null){
			putQueryParameter("OptimizedWrites", optimizedWrites);
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public ServerlessConfiguration getServerlessConfiguration() {
		return this.serverlessConfiguration;
	}

	public void setServerlessConfiguration(ServerlessConfiguration serverlessConfiguration) {
		this.serverlessConfiguration = serverlessConfiguration;	
		if (serverlessConfiguration != null) {
			putQueryParameter("ServerlessConfiguration" , new Gson().toJson(serverlessConfiguration));
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

	public String getZoneIdSlave1() {
		return this.zoneIdSlave1;
	}

	public void setZoneIdSlave1(String zoneIdSlave1) {
		this.zoneIdSlave1 = zoneIdSlave1;
		if(zoneIdSlave1 != null){
			putQueryParameter("ZoneIdSlave1", zoneIdSlave1);
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

	public Boolean getColdDataEnabled() {
		return this.coldDataEnabled;
	}

	public void setColdDataEnabled(Boolean coldDataEnabled) {
		this.coldDataEnabled = coldDataEnabled;
		if(coldDataEnabled != null){
			putQueryParameter("ColdDataEnabled", coldDataEnabled.toString());
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

	public String getReadOnlyDBInstanceClass() {
		return this.readOnlyDBInstanceClass;
	}

	public void setReadOnlyDBInstanceClass(String readOnlyDBInstanceClass) {
		this.readOnlyDBInstanceClass = readOnlyDBInstanceClass;
		if(readOnlyDBInstanceClass != null){
			putQueryParameter("ReadOnlyDBInstanceClass", readOnlyDBInstanceClass);
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

	public String getSwitchTime() {
		return this.switchTime;
	}

	public void setSwitchTime(String switchTime) {
		this.switchTime = switchTime;
		if(switchTime != null){
			putQueryParameter("SwitchTime", switchTime);
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

	public String getSourceBiz() {
		return this.sourceBiz;
	}

	public void setSourceBiz(String sourceBiz) {
		this.sourceBiz = sourceBiz;
		if(sourceBiz != null){
			putQueryParameter("SourceBiz", sourceBiz);
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

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	public String getCompressionMode() {
		return this.compressionMode;
	}

	public void setCompressionMode(String compressionMode) {
		this.compressionMode = compressionMode;
		if(compressionMode != null){
			putQueryParameter("CompressionMode", compressionMode);
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

	public Long getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(Long usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime.toString());
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

	public String getTargetMinorVersion() {
		return this.targetMinorVersion;
	}

	public void setTargetMinorVersion(String targetMinorVersion) {
		this.targetMinorVersion = targetMinorVersion;
		if(targetMinorVersion != null){
			putQueryParameter("TargetMinorVersion", targetMinorVersion);
		}
	}

	public Boolean getAllowMajorVersionUpgrade() {
		return this.allowMajorVersionUpgrade;
	}

	public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
		this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
		if(allowMajorVersionUpgrade != null){
			putQueryParameter("AllowMajorVersionUpgrade", allowMajorVersionUpgrade.toString());
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

	public static class ServerlessConfiguration {

		@SerializedName("MinCapacity")
		private Double minCapacity;

		@SerializedName("MaxCapacity")
		private Double maxCapacity;

		@SerializedName("AutoPause")
		private Boolean autoPause;

		@SerializedName("SwitchForce")
		private Boolean switchForce;

		public Double getMinCapacity() {
			return this.minCapacity;
		}

		public void setMinCapacity(Double minCapacity) {
			this.minCapacity = minCapacity;
		}

		public Double getMaxCapacity() {
			return this.maxCapacity;
		}

		public void setMaxCapacity(Double maxCapacity) {
			this.maxCapacity = maxCapacity;
		}

		public Boolean getAutoPause() {
			return this.autoPause;
		}

		public void setAutoPause(Boolean autoPause) {
			this.autoPause = autoPause;
		}

		public Boolean getSwitchForce() {
			return this.switchForce;
		}

		public void setSwitchForce(Boolean switchForce) {
			this.switchForce = switchForce;
		}
	}

	@Override
	public Class<ModifyDBInstanceSpecResponse> getResponseClass() {
		return ModifyDBInstanceSpecResponse.class;
	}

}
