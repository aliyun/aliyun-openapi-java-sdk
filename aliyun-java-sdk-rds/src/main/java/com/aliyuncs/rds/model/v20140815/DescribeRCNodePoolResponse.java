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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRCNodePoolResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCNodePoolResponse extends AcsResponse {

	private String requestId;

	private List<NodePoolLists> nodePoolList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NodePoolLists> getNodePoolList() {
		return this.nodePoolList;
	}

	public void setNodePoolList(List<NodePoolLists> nodePoolList) {
		this.nodePoolList = nodePoolList;
	}

	public static class NodePoolLists {

		private String clusterId;

		private String nodePoolId;

		private String securityEnhancementStrategy;

		private String deploymentSetId;

		private String description;

		private String instanceName;

		private String password;

		private String vSwitchId;

		private String hostName;

		private String internetChargeType;

		private String imageId;

		private String instanceType;

		private Integer internetMaxBandwidthOut;

		private String ioOptimized;

		private String keyPairName;

		private String regionId;

		private String securityGroupId;

		private Boolean autoPay;

		private String zoneId;

		private String resourceGroupId;

		private String instanceChargeType;

		private String spotStrategy;

		private String createMode;

		private Integer period;

		private String periodUnit;

		private Boolean autoRenew;

		private String nodePoolName;

		private List<DataDiskItem> dataDisk;

		private List<TagItem> tag;

		private SystemDisk systemDisk;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getNodePoolId() {
			return this.nodePoolId;
		}

		public void setNodePoolId(String nodePoolId) {
			this.nodePoolId = nodePoolId;
		}

		public String getSecurityEnhancementStrategy() {
			return this.securityEnhancementStrategy;
		}

		public void setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
			this.securityEnhancementStrategy = securityEnhancementStrategy;
		}

		public String getDeploymentSetId() {
			return this.deploymentSetId;
		}

		public void setDeploymentSetId(String deploymentSetId) {
			this.deploymentSetId = deploymentSetId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Integer getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public String getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(String ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public String getKeyPairName() {
			return this.keyPairName;
		}

		public void setKeyPairName(String keyPairName) {
			this.keyPairName = keyPairName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public Boolean getAutoPay() {
			return this.autoPay;
		}

		public void setAutoPay(Boolean autoPay) {
			this.autoPay = autoPay;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public String getCreateMode() {
			return this.createMode;
		}

		public void setCreateMode(String createMode) {
			this.createMode = createMode;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}

		public Boolean getAutoRenew() {
			return this.autoRenew;
		}

		public void setAutoRenew(Boolean autoRenew) {
			this.autoRenew = autoRenew;
		}

		public String getNodePoolName() {
			return this.nodePoolName;
		}

		public void setNodePoolName(String nodePoolName) {
			this.nodePoolName = nodePoolName;
		}

		public List<DataDiskItem> getDataDisk() {
			return this.dataDisk;
		}

		public void setDataDisk(List<DataDiskItem> dataDisk) {
			this.dataDisk = dataDisk;
		}

		public List<TagItem> getTag() {
			return this.tag;
		}

		public void setTag(List<TagItem> tag) {
			this.tag = tag;
		}

		public SystemDisk getSystemDisk() {
			return this.systemDisk;
		}

		public void setSystemDisk(SystemDisk systemDisk) {
			this.systemDisk = systemDisk;
		}

		public static class DataDiskItem {

			private String category;

			private Boolean deleteWithInstance;

			private String encrypted;

			private String performanceLevel;

			private Integer size;

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

			public String getPerformanceLevel() {
				return this.performanceLevel;
			}

			public void setPerformanceLevel(String performanceLevel) {
				this.performanceLevel = performanceLevel;
			}

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}
		}

		public static class TagItem {

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

		public static class SystemDisk {

			private String category;

			private Integer size;

			private String performanceLevel;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public String getPerformanceLevel() {
				return this.performanceLevel;
			}

			public void setPerformanceLevel(String performanceLevel) {
				this.performanceLevel = performanceLevel;
			}
		}
	}

	@Override
	public DescribeRCNodePoolResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCNodePoolResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
