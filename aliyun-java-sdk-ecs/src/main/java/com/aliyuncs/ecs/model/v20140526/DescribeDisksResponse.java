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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeDisksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDisksResponse extends AcsResponse {

	private String nextToken;

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Integer totalCount;

	private List<Disk> disks;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Disk> getDisks() {
		return this.disks;
	}

	public void setDisks(List<Disk> disks) {
		this.disks = disks;
	}

	public static class Disk {

		private String serialNumber;

		private String creationTime;

		private String status;

		private String type;

		private String performanceLevel;

		private String bdfId;

		private Boolean enableAutoSnapshot;

		private String storageSetId;

		private Integer storageSetPartitionNumber;

		private String diskId;

		private Boolean deleteAutoSnapshot;

		private String storageClusterId;

		private Boolean encrypted;

		private Integer iOPSRead;

		private Integer mountInstanceNum;

		private String description;

		private String device;

		private String diskName;

		private Boolean portable;

		private String imageId;

		private String kMSKeyId;

		private Boolean deleteWithInstance;

		private String detachedTime;

		private String sourceSnapshotId;

		private String autoSnapshotPolicyId;

		private Boolean enableAutomatedSnapshotPolicy;

		private Integer iOPSWrite;

		private String instanceId;

		private Integer iOPS;

		private String regionId;

		private String expiredTime;

		private Integer size;

		private String resourceGroupId;

		private String diskChargeType;

		private String zoneId;

		private String attachedTime;

		private String category;

		private String productCode;

		private String multiAttach;

		private Long provisionedIops;

		private Boolean burstingEnabled;

		private Integer throughput;

		private Integer throughputRead;

		private Integer throughputWrite;

		private List<OperationLock> operationLocks;

		private List<MountInstance> mountInstances;

		private List<Tag> tags;

		private List<Attachment> attachments;

		private Placement placement;

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public String getBdfId() {
			return this.bdfId;
		}

		public void setBdfId(String bdfId) {
			this.bdfId = bdfId;
		}

		public Boolean getEnableAutoSnapshot() {
			return this.enableAutoSnapshot;
		}

		public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
			this.enableAutoSnapshot = enableAutoSnapshot;
		}

		public String getStorageSetId() {
			return this.storageSetId;
		}

		public void setStorageSetId(String storageSetId) {
			this.storageSetId = storageSetId;
		}

		public Integer getStorageSetPartitionNumber() {
			return this.storageSetPartitionNumber;
		}

		public void setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
			this.storageSetPartitionNumber = storageSetPartitionNumber;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public Boolean getDeleteAutoSnapshot() {
			return this.deleteAutoSnapshot;
		}

		public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
			this.deleteAutoSnapshot = deleteAutoSnapshot;
		}

		public String getStorageClusterId() {
			return this.storageClusterId;
		}

		public void setStorageClusterId(String storageClusterId) {
			this.storageClusterId = storageClusterId;
		}

		public Boolean getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(Boolean encrypted) {
			this.encrypted = encrypted;
		}

		public Integer getIOPSRead() {
			return this.iOPSRead;
		}

		public void setIOPSRead(Integer iOPSRead) {
			this.iOPSRead = iOPSRead;
		}

		public Integer getMountInstanceNum() {
			return this.mountInstanceNum;
		}

		public void setMountInstanceNum(Integer mountInstanceNum) {
			this.mountInstanceNum = mountInstanceNum;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDevice() {
			return this.device;
		}

		public void setDevice(String device) {
			this.device = device;
		}

		public String getDiskName() {
			return this.diskName;
		}

		public void setDiskName(String diskName) {
			this.diskName = diskName;
		}

		public Boolean getPortable() {
			return this.portable;
		}

		public void setPortable(Boolean portable) {
			this.portable = portable;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getKMSKeyId() {
			return this.kMSKeyId;
		}

		public void setKMSKeyId(String kMSKeyId) {
			this.kMSKeyId = kMSKeyId;
		}

		public Boolean getDeleteWithInstance() {
			return this.deleteWithInstance;
		}

		public void setDeleteWithInstance(Boolean deleteWithInstance) {
			this.deleteWithInstance = deleteWithInstance;
		}

		public String getDetachedTime() {
			return this.detachedTime;
		}

		public void setDetachedTime(String detachedTime) {
			this.detachedTime = detachedTime;
		}

		public String getSourceSnapshotId() {
			return this.sourceSnapshotId;
		}

		public void setSourceSnapshotId(String sourceSnapshotId) {
			this.sourceSnapshotId = sourceSnapshotId;
		}

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}

		public Boolean getEnableAutomatedSnapshotPolicy() {
			return this.enableAutomatedSnapshotPolicy;
		}

		public void setEnableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
			this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
		}

		public Integer getIOPSWrite() {
			return this.iOPSWrite;
		}

		public void setIOPSWrite(Integer iOPSWrite) {
			this.iOPSWrite = iOPSWrite;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getIOPS() {
			return this.iOPS;
		}

		public void setIOPS(Integer iOPS) {
			this.iOPS = iOPS;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getDiskChargeType() {
			return this.diskChargeType;
		}

		public void setDiskChargeType(String diskChargeType) {
			this.diskChargeType = diskChargeType;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getAttachedTime() {
			return this.attachedTime;
		}

		public void setAttachedTime(String attachedTime) {
			this.attachedTime = attachedTime;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getMultiAttach() {
			return this.multiAttach;
		}

		public void setMultiAttach(String multiAttach) {
			this.multiAttach = multiAttach;
		}

		public Long getProvisionedIops() {
			return this.provisionedIops;
		}

		public void setProvisionedIops(Long provisionedIops) {
			this.provisionedIops = provisionedIops;
		}

		public Boolean getBurstingEnabled() {
			return this.burstingEnabled;
		}

		public void setBurstingEnabled(Boolean burstingEnabled) {
			this.burstingEnabled = burstingEnabled;
		}

		public Integer getThroughput() {
			return this.throughput;
		}

		public void setThroughput(Integer throughput) {
			this.throughput = throughput;
		}

		public Integer getThroughputRead() {
			return this.throughputRead;
		}

		public void setThroughputRead(Integer throughputRead) {
			this.throughputRead = throughputRead;
		}

		public Integer getThroughputWrite() {
			return this.throughputWrite;
		}

		public void setThroughputWrite(Integer throughputWrite) {
			this.throughputWrite = throughputWrite;
		}

		public List<OperationLock> getOperationLocks() {
			return this.operationLocks;
		}

		public void setOperationLocks(List<OperationLock> operationLocks) {
			this.operationLocks = operationLocks;
		}

		public List<MountInstance> getMountInstances() {
			return this.mountInstances;
		}

		public void setMountInstances(List<MountInstance> mountInstances) {
			this.mountInstances = mountInstances;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<Attachment> getAttachments() {
			return this.attachments;
		}

		public void setAttachments(List<Attachment> attachments) {
			this.attachments = attachments;
		}

		public Placement getPlacement() {
			return this.placement;
		}

		public void setPlacement(Placement placement) {
			this.placement = placement;
		}

		public static class OperationLock {

			private String lockReason;

			public String getLockReason() {
				return this.lockReason;
			}

			public void setLockReason(String lockReason) {
				this.lockReason = lockReason;
			}
		}

		public static class MountInstance {

			private String attachedTime;

			private String instanceId;

			private String device;

			public String getAttachedTime() {
				return this.attachedTime;
			}

			public void setAttachedTime(String attachedTime) {
				this.attachedTime = attachedTime;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}
		}

		public static class Tag {

			private String tagValue;

			private String tagKey;

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}
		}

		public static class Attachment {

			private String instanceId;

			private String device;

			private String attachedTime;

			private Long nsId;

			private String nguid;

			private String identifier;

			private String targetDevice;

			private String accessToken;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public String getAttachedTime() {
				return this.attachedTime;
			}

			public void setAttachedTime(String attachedTime) {
				this.attachedTime = attachedTime;
			}

			public Long getNsId() {
				return this.nsId;
			}

			public void setNsId(Long nsId) {
				this.nsId = nsId;
			}

			public String getNguid() {
				return this.nguid;
			}

			public void setNguid(String nguid) {
				this.nguid = nguid;
			}

			public String getIdentifier() {
				return this.identifier;
			}

			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}

			public String getTargetDevice() {
				return this.targetDevice;
			}

			public void setTargetDevice(String targetDevice) {
				this.targetDevice = targetDevice;
			}

			public String getAccessToken() {
				return this.accessToken;
			}

			public void setAccessToken(String accessToken) {
				this.accessToken = accessToken;
			}
		}

		public static class Placement {

			private String zoneIds;

			public String getZoneIds() {
				return this.zoneIds;
			}

			public void setZoneIds(String zoneIds) {
				this.zoneIds = zoneIds;
			}
		}
	}

	@Override
	public DescribeDisksResponse getInstance(UnmarshallerContext context) {
		return	DescribeDisksResponseUnmarshaller.unmarshall(this, context);
	}
}
