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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeDisksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeDisksResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Disk> disks;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Disk> getDisks() {
		return this.disks;
	}

	public void setDisks(List<Disk> disks) {
		this.disks = disks;
	}

	public static class Disk {

		private String bid;

		private Long resourceOwnerId;

		private String aliyunInstanceType;

		private String diskId;

		private String status;

		private String createdTime;

		private String modifiedTime;

		private String seq;

		private String type;

		private String category;

		private Boolean isLocal;

		private String regionId;

		private String zoneId;

		private String clusterId;

		private String diskName;

		private String description;

		private Integer size;

		private Boolean active;

		private Boolean bootable;

		private Boolean portable;

		private String imageId;

		private String snapshotId;

		private String autoSnapshotPolicyId;

		private String snapshotLinkId;

		private String instanceId;

		private String device;

		private Boolean deleteWithInstance;

		private Boolean deleteAutoSnapshot;

		private Boolean enableAutoSnapshot;

		private String attachedTime;

		private String detachedTime;

		private String productCode;

		private String houyiDiskId;

		private Long numericId;

		private String businessStatus;

		private Integer iopsSize;

		private String performanceLevel;

		private List<Tag> tags;

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public Long getResourceOwnerId() {
			return this.resourceOwnerId;
		}

		public void setResourceOwnerId(Long resourceOwnerId) {
			this.resourceOwnerId = resourceOwnerId;
		}

		public String getAliyunInstanceType() {
			return this.aliyunInstanceType;
		}

		public void setAliyunInstanceType(String aliyunInstanceType) {
			this.aliyunInstanceType = aliyunInstanceType;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getSeq() {
			return this.seq;
		}

		public void setSeq(String seq) {
			this.seq = seq;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Boolean getIsLocal() {
			return this.isLocal;
		}

		public void setIsLocal(Boolean isLocal) {
			this.isLocal = isLocal;
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

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
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

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public Boolean getActive() {
			return this.active;
		}

		public void setActive(Boolean active) {
			this.active = active;
		}

		public Boolean getBootable() {
			return this.bootable;
		}

		public void setBootable(Boolean bootable) {
			this.bootable = bootable;
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

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}

		public String getSnapshotLinkId() {
			return this.snapshotLinkId;
		}

		public void setSnapshotLinkId(String snapshotLinkId) {
			this.snapshotLinkId = snapshotLinkId;
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

		public Boolean getDeleteWithInstance() {
			return this.deleteWithInstance;
		}

		public void setDeleteWithInstance(Boolean deleteWithInstance) {
			this.deleteWithInstance = deleteWithInstance;
		}

		public Boolean getDeleteAutoSnapshot() {
			return this.deleteAutoSnapshot;
		}

		public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
			this.deleteAutoSnapshot = deleteAutoSnapshot;
		}

		public Boolean getEnableAutoSnapshot() {
			return this.enableAutoSnapshot;
		}

		public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
			this.enableAutoSnapshot = enableAutoSnapshot;
		}

		public String getAttachedTime() {
			return this.attachedTime;
		}

		public void setAttachedTime(String attachedTime) {
			this.attachedTime = attachedTime;
		}

		public String getDetachedTime() {
			return this.detachedTime;
		}

		public void setDetachedTime(String detachedTime) {
			this.detachedTime = detachedTime;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getHouyiDiskId() {
			return this.houyiDiskId;
		}

		public void setHouyiDiskId(String houyiDiskId) {
			this.houyiDiskId = houyiDiskId;
		}

		public Long getNumericId() {
			return this.numericId;
		}

		public void setNumericId(Long numericId) {
			this.numericId = numericId;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public Integer getIopsSize() {
			return this.iopsSize;
		}

		public void setIopsSize(Integer iopsSize) {
			this.iopsSize = iopsSize;
		}

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	@Override
	public OpsDescribeDisksResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeDisksResponseUnmarshaller.unmarshall(this, context);
	}
}
