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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.GetLaunchTemplateDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLaunchTemplateDataResponse extends AcsResponse {

	private String requestId;

	private LaunchTemplateData launchTemplateData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public LaunchTemplateData getLaunchTemplateData() {
		return this.launchTemplateData;
	}

	public void setLaunchTemplateData(LaunchTemplateData launchTemplateData) {
		this.launchTemplateData = launchTemplateData;
	}

	public static class LaunchTemplateData {

		private String vpcId;

		private String keyPairName;

		private String securityGroupId;

		private String networkType;

		private String spotStrategy;

		private Boolean enableVmOsConfig;

		private String description;

		private Integer spotDuration;

		private String instanceName;

		private Boolean securityEnhancementStrategy;

		private String userData;

		private String systemDiskDiskName;

		private Integer systemDiskSize;

		private Float spotPriceLimit;

		private Boolean passwordInherit;

		private String imageId;

		private String systemDiskCategory;

		private String autoReleaseTime;

		private String systemDiskDescription;

		private String imageOwnerAlias;

		private String hostName;

		private Integer systemDiskIops;

		private Integer internetMaxBandwidthOut;

		private Integer internetMaxBandwidthIn;

		private String instanceType;

		private Integer period;

		private String instanceChargeType;

		private String ioOptimized;

		private String ramRoleName;

		private String vSwitchId;

		private String resourceGroupId;

		private String internetChargeType;

		private String zoneId;

		private List<DataDisk> dataDisks;

		private List<NetworkInterface> networkInterfaces;

		private List<InstanceTag> tags;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getKeyPairName() {
			return this.keyPairName;
		}

		public void setKeyPairName(String keyPairName) {
			this.keyPairName = keyPairName;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public Boolean getEnableVmOsConfig() {
			return this.enableVmOsConfig;
		}

		public void setEnableVmOsConfig(Boolean enableVmOsConfig) {
			this.enableVmOsConfig = enableVmOsConfig;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getSpotDuration() {
			return this.spotDuration;
		}

		public void setSpotDuration(Integer spotDuration) {
			this.spotDuration = spotDuration;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Boolean getSecurityEnhancementStrategy() {
			return this.securityEnhancementStrategy;
		}

		public void setSecurityEnhancementStrategy(Boolean securityEnhancementStrategy) {
			this.securityEnhancementStrategy = securityEnhancementStrategy;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getSystemDiskDiskName() {
			return this.systemDiskDiskName;
		}

		public void setSystemDiskDiskName(String systemDiskDiskName) {
			this.systemDiskDiskName = systemDiskDiskName;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public Float getSpotPriceLimit() {
			return this.spotPriceLimit;
		}

		public void setSpotPriceLimit(Float spotPriceLimit) {
			this.spotPriceLimit = spotPriceLimit;
		}

		public Boolean getPasswordInherit() {
			return this.passwordInherit;
		}

		public void setPasswordInherit(Boolean passwordInherit) {
			this.passwordInherit = passwordInherit;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public String getAutoReleaseTime() {
			return this.autoReleaseTime;
		}

		public void setAutoReleaseTime(String autoReleaseTime) {
			this.autoReleaseTime = autoReleaseTime;
		}

		public String getSystemDiskDescription() {
			return this.systemDiskDescription;
		}

		public void setSystemDiskDescription(String systemDiskDescription) {
			this.systemDiskDescription = systemDiskDescription;
		}

		public String getImageOwnerAlias() {
			return this.imageOwnerAlias;
		}

		public void setImageOwnerAlias(String imageOwnerAlias) {
			this.imageOwnerAlias = imageOwnerAlias;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public Integer getSystemDiskIops() {
			return this.systemDiskIops;
		}

		public void setSystemDiskIops(Integer systemDiskIops) {
			this.systemDiskIops = systemDiskIops;
		}

		public Integer getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public Integer getInternetMaxBandwidthIn() {
			return this.internetMaxBandwidthIn;
		}

		public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
			this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(String ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public String getRamRoleName() {
			return this.ramRoleName;
		}

		public void setRamRoleName(String ramRoleName) {
			this.ramRoleName = ramRoleName;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public List<DataDisk> getDataDisks() {
			return this.dataDisks;
		}

		public void setDataDisks(List<DataDisk> dataDisks) {
			this.dataDisks = dataDisks;
		}

		public List<NetworkInterface> getNetworkInterfaces() {
			return this.networkInterfaces;
		}

		public void setNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
			this.networkInterfaces = networkInterfaces;
		}

		public List<InstanceTag> getTags() {
			return this.tags;
		}

		public void setTags(List<InstanceTag> tags) {
			this.tags = tags;
		}

		public static class DataDisk {

			private String description;

			private String snapshotId;

			private String device;

			private Integer size;

			private String diskName;

			private String category;

			private Boolean deleteWithInstance;

			private String encrypted;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public String getDiskName() {
				return this.diskName;
			}

			public void setDiskName(String diskName) {
				this.diskName = diskName;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public Boolean getDeleteWithInstance() {
				return this.deleteWithInstance;
			}

			public void setDeleteWithInstance(Boolean deleteWithInstance) {
				this.deleteWithInstance = deleteWithInstance;
			}

			public String getEncrypted() {
				return this.encrypted;
			}

			public void setEncrypted(String encrypted) {
				this.encrypted = encrypted;
			}
		}

		public static class NetworkInterface {

			private String networkInterfaceName;

			private String vSwitchId;

			private String description;

			private String primaryIpAddress;

			private String securityGroupId;

			public String getNetworkInterfaceName() {
				return this.networkInterfaceName;
			}

			public void setNetworkInterfaceName(String networkInterfaceName) {
				this.networkInterfaceName = networkInterfaceName;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getPrimaryIpAddress() {
				return this.primaryIpAddress;
			}

			public void setPrimaryIpAddress(String primaryIpAddress) {
				this.primaryIpAddress = primaryIpAddress;
			}

			public String getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(String securityGroupId) {
				this.securityGroupId = securityGroupId;
			}
		}

		public static class InstanceTag {

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
	}

	@Override
	public GetLaunchTemplateDataResponse getInstance(UnmarshallerContext context) {
		return	GetLaunchTemplateDataResponseUnmarshaller.unmarshall(this, context);
	}
}
