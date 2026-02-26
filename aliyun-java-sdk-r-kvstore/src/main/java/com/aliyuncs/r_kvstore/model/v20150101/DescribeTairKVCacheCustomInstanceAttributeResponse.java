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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeTairKVCacheCustomInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTairKVCacheCustomInstanceAttributeResponse extends AcsResponse {

	private String requestId;

	private String vpcId;

	private String privateIp;

	private String createTime;

	private String chargeType;

	private String storageType;

	private String architectureType;

	private String networkType;

	private String instanceName;

	private String zoneType;

	private String instanceClass;

	private String instanceId;

	private String instanceType;

	private String regionId;

	private String endTime;

	private String vSwitchId;

	private String resourceGroupId;

	private String zoneId;

	private String instanceStatus;

	private Long storage;

	private Boolean isOrderCompleted;

	private String imageId;

	private Long cpu;

	private Long memory;

	private String securityGroupId;

	private Boolean useEni;

	private List<Tag> tags;

	private List<Disk> disks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getPrivateIp() {
		return this.privateIp;
	}

	public void setPrivateIp(String privateIp) {
		this.privateIp = privateIp;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public String getArchitectureType() {
		return this.architectureType;
	}

	public void setArchitectureType(String architectureType) {
		this.architectureType = architectureType;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getZoneType() {
		return this.zoneType;
	}

	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
	}

	public String getInstanceClass() {
		return this.instanceClass;
	}

	public void setInstanceClass(String instanceClass) {
		this.instanceClass = instanceClass;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getInstanceStatus() {
		return this.instanceStatus;
	}

	public void setInstanceStatus(String instanceStatus) {
		this.instanceStatus = instanceStatus;
	}

	public Long getStorage() {
		return this.storage;
	}

	public void setStorage(Long storage) {
		this.storage = storage;
	}

	public Boolean getIsOrderCompleted() {
		return this.isOrderCompleted;
	}

	public void setIsOrderCompleted(Boolean isOrderCompleted) {
		this.isOrderCompleted = isOrderCompleted;
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public Long getCpu() {
		return this.cpu;
	}

	public void setCpu(Long cpu) {
		this.cpu = cpu;
	}

	public Long getMemory() {
		return this.memory;
	}

	public void setMemory(Long memory) {
		this.memory = memory;
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
	}

	public Boolean getUseEni() {
		return this.useEni;
	}

	public void setUseEni(Boolean useEni) {
		this.useEni = useEni;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<Disk> getDisks() {
		return this.disks;
	}

	public void setDisks(List<Disk> disks) {
		this.disks = disks;
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

	public static class Disk {

		private String diskId;

		private String type;

		private String size;

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
		}
	}

	@Override
	public DescribeTairKVCacheCustomInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeTairKVCacheCustomInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
