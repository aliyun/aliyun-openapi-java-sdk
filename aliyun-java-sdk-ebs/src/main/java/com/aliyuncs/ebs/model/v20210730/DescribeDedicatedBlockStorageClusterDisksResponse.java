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

package com.aliyuncs.ebs.model.v20210730;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ebs.transform.v20210730.DescribeDedicatedBlockStorageClusterDisksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedBlockStorageClusterDisksResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Disks disks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Disks getDisks() {
		return this.disks;
	}

	public void setDisks(Disks disks) {
		this.disks = disks;
	}

	public static class Disks {

		private List<DiskItem> disk;

		public List<DiskItem> getDisk() {
			return this.disk;
		}

		public void setDisk(List<DiskItem> disk) {
			this.disk = disk;
		}

		public static class DiskItem {

			private String diskId;

			private String diskName;

			private String status;

			private String type;

			private String performanceLevel;

			private String bdfId;

			private Boolean enableAutoSnapshot;

			private String storageSetId;

			private Integer storageSetPartitionNumber;

			private Boolean deleteAutoSnapshot;

			private String storageClusterId;

			private Boolean encrypted;

			private Integer mountInstanceNum;

			private String description;

			private String device;

			private Boolean portable;

			private String imageId;

			private String kMSKeyId;

			private Boolean deleteWithInstance;

			private String detachedTime;

			private String sourceSnapshotId;

			private String instanceId;

			private Integer size;

			private String regionId;

			private String zoneId;

			private String attachedTime;

			private String category;

			private String multiAttach;

			private String diskChargeType;

			private Long iOPS;

			private List<TagsItem> tags;

			public String getDiskId() {
				return this.diskId;
			}

			public void setDiskId(String diskId) {
				this.diskId = diskId;
			}

			public String getDiskName() {
				return this.diskName;
			}

			public void setDiskName(String diskName) {
				this.diskName = diskName;
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

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
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

			public String getMultiAttach() {
				return this.multiAttach;
			}

			public void setMultiAttach(String multiAttach) {
				this.multiAttach = multiAttach;
			}

			public String getDiskChargeType() {
				return this.diskChargeType;
			}

			public void setDiskChargeType(String diskChargeType) {
				this.diskChargeType = diskChargeType;
			}

			public Long getIOPS() {
				return this.iOPS;
			}

			public void setIOPS(Long iOPS) {
				this.iOPS = iOPS;
			}

			public List<TagsItem> getTags() {
				return this.tags;
			}

			public void setTags(List<TagsItem> tags) {
				this.tags = tags;
			}

			public static class TagsItem {

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
		}
	}

	@Override
	public DescribeDedicatedBlockStorageClusterDisksResponse getInstance(UnmarshallerContext context) {
		return	DescribeDedicatedBlockStorageClusterDisksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
