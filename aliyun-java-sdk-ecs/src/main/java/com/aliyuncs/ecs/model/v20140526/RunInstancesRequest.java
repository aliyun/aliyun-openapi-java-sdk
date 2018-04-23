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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class RunInstancesRequest extends RpcAcsRequest<RunInstancesResponse> {
	
	public RunInstancesRequest() {
		super("Ecs", "2014-05-26", "RunInstances", "ecs");
	}

	private Long resourceOwnerId;

	private String hpcClusterId;

	private String securityEnhancementStrategy;

	private String keyPairName;

	private Float spotPriceLimit;

	private String hostName;

	private String password;

	private List<Tag> tags;

	private Boolean dryRun;

	private Long ownerId;

	private String vSwitchId;

	private String spotStrategy;

	private String instanceName;

	private String internetChargeType;

	private String zoneId;

	private Integer internetMaxBandwidthIn;

	private String imageId;

	private String spotInterruptionBehavior;

	private String clientToken;

	private String ioOptimized;

	private String securityGroupId;

	private Integer internetMaxBandwidthOut;

	private String description;

	private String systemDiskCategory;

	private String userData;

	private String instanceType;

	private List<NetworkInterface> networkInterfaces;

	private Integer amount;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String systemDiskDiskName;

	private String ramRoleName;

	private String autoReleaseTime;

	private String dedicatedHostId;

	private List<DataDisk> dataDisks;

	private String systemDiskSize;

	private String systemDiskDescription;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getHpcClusterId() {
		return this.hpcClusterId;
	}

	public void setHpcClusterId(String hpcClusterId) {
		this.hpcClusterId = hpcClusterId;
		if(hpcClusterId != null){
			putQueryParameter("HpcClusterId", hpcClusterId);
		}
	}

	public String getSecurityEnhancementStrategy() {
		return this.securityEnhancementStrategy;
	}

	public void setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
		this.securityEnhancementStrategy = securityEnhancementStrategy;
		if(securityEnhancementStrategy != null){
			putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
		}
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
		if(keyPairName != null){
			putQueryParameter("KeyPairName", keyPairName);
		}
	}

	public Float getSpotPriceLimit() {
		return this.spotPriceLimit;
	}

	public void setSpotPriceLimit(Float spotPriceLimit) {
		this.spotPriceLimit = spotPriceLimit;
		if(spotPriceLimit != null){
			putQueryParameter("SpotPriceLimit", spotPriceLimit.toString());
		}
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
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

	public Integer getInternetMaxBandwidthIn() {
		return this.internetMaxBandwidthIn;
	}

	public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
		this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		if(internetMaxBandwidthIn != null){
			putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn.toString());
		}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getSpotInterruptionBehavior() {
		return this.spotInterruptionBehavior;
	}

	public void setSpotInterruptionBehavior(String spotInterruptionBehavior) {
		this.spotInterruptionBehavior = spotInterruptionBehavior;
		if(spotInterruptionBehavior != null){
			putQueryParameter("SpotInterruptionBehavior", spotInterruptionBehavior);
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

	public String getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(String ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized);
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public Integer getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		if(internetMaxBandwidthOut != null){
			putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSystemDiskCategory() {
		return this.systemDiskCategory;
	}

	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
		if(systemDiskCategory != null){
			putQueryParameter("SystemDisk.Category", systemDiskCategory);
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public List<NetworkInterface> getNetworkInterfaces() {
		return this.networkInterfaces;
	}

	public void setNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
		this.networkInterfaces = networkInterfaces;	
		if (networkInterfaces != null) {
			for (int depth1 = 0; depth1 < networkInterfaces.size(); depth1++) {
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".PrimaryIpAddress" , networkInterfaces.get(depth1).getPrimaryIpAddress());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".VSwitchId" , networkInterfaces.get(depth1).getVSwitchId());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".SecurityGroupId" , networkInterfaces.get(depth1).getSecurityGroupId());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".NetworkInterfaceName" , networkInterfaces.get(depth1).getNetworkInterfaceName());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".Description" , networkInterfaces.get(depth1).getDescription());
			}
		}	
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
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

	public String getSystemDiskDiskName() {
		return this.systemDiskDiskName;
	}

	public void setSystemDiskDiskName(String systemDiskDiskName) {
		this.systemDiskDiskName = systemDiskDiskName;
		if(systemDiskDiskName != null){
			putQueryParameter("SystemDisk.DiskName", systemDiskDiskName);
		}
	}

	public String getRamRoleName() {
		return this.ramRoleName;
	}

	public void setRamRoleName(String ramRoleName) {
		this.ramRoleName = ramRoleName;
		if(ramRoleName != null){
			putQueryParameter("RamRoleName", ramRoleName);
		}
	}

	public String getAutoReleaseTime() {
		return this.autoReleaseTime;
	}

	public void setAutoReleaseTime(String autoReleaseTime) {
		this.autoReleaseTime = autoReleaseTime;
		if(autoReleaseTime != null){
			putQueryParameter("AutoReleaseTime", autoReleaseTime);
		}
	}

	public String getDedicatedHostId() {
		return this.dedicatedHostId;
	}

	public void setDedicatedHostId(String dedicatedHostId) {
		this.dedicatedHostId = dedicatedHostId;
		if(dedicatedHostId != null){
			putQueryParameter("DedicatedHostId", dedicatedHostId);
		}
	}

	public List<DataDisk> getDataDisks() {
		return this.dataDisks;
	}

	public void setDataDisks(List<DataDisk> dataDisks) {
		this.dataDisks = dataDisks;	
		if (dataDisks != null) {
			for (int depth1 = 0; depth1 < dataDisks.size(); depth1++) {
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Size" , dataDisks.get(depth1).getSize());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".SnapshotId" , dataDisks.get(depth1).getSnapshotId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Category" , dataDisks.get(depth1).getCategory());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Encrypted" , dataDisks.get(depth1).getEncrypted());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".DiskName" , dataDisks.get(depth1).getDiskName());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Description" , dataDisks.get(depth1).getDescription());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".DeleteWithInstance" , dataDisks.get(depth1).getDeleteWithInstance());
			}
		}	
	}

	public String getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(String systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDisk.Size", systemDiskSize);
		}
	}

	public String getSystemDiskDescription() {
		return this.systemDiskDescription;
	}

	public void setSystemDiskDescription(String systemDiskDescription) {
		this.systemDiskDescription = systemDiskDescription;
		if(systemDiskDescription != null){
			putQueryParameter("SystemDisk.Description", systemDiskDescription);
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class NetworkInterface {

		private String primaryIpAddress;

		private String vSwitchId;

		private String securityGroupId;

		private String networkInterfaceName;

		private String description;

		public String getPrimaryIpAddress() {
			return this.primaryIpAddress;
		}

		public void setPrimaryIpAddress(String primaryIpAddress) {
			this.primaryIpAddress = primaryIpAddress;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getNetworkInterfaceName() {
			return this.networkInterfaceName;
		}

		public void setNetworkInterfaceName(String networkInterfaceName) {
			this.networkInterfaceName = networkInterfaceName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	public static class DataDisk {

		private Integer size;

		private String snapshotId;

		private String category;

		private String encrypted;

		private String diskName;

		private String description;

		private Boolean deleteWithInstance;

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(String encrypted) {
			this.encrypted = encrypted;
		}

		public String getDiskName() {
			return this.diskName;
		}

		public void setDiskName(String diskName) {
			this.diskName = diskName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getDeleteWithInstance() {
			return this.deleteWithInstance;
		}

		public void setDeleteWithInstance(Boolean deleteWithInstance) {
			this.deleteWithInstance = deleteWithInstance;
		}
	}

	@Override
	public Class<RunInstancesResponse> getResponseClass() {
		return RunInstancesResponse.class;
	}

}
