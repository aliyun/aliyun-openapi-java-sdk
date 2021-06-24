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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryDiskExtModelListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryDiskExtModelListResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<DiskExtModel> diskExtModels;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<DiskExtModel> getDiskExtModels() {
		return this.diskExtModels;
	}

	public void setDiskExtModels(List<DiskExtModel> diskExtModels) {
		this.diskExtModels = diskExtModels;
	}

	public static class DiskExtModel {

		private String type;

		private String status;

		private Boolean active;

		private String houyiDiskId;

		private Boolean enableAutoSnapshot;

		private Boolean bootable;

		private String diskId;

		private String snapshotLinkId;

		private String bid;

		private Boolean deleteAutoSnapshot;

		private String seq;

		private String iopsR;

		private String cacheStatus;

		private String description;

		private String device;

		private String diskName;

		private Boolean portable;

		private String createdTime;

		private String imageId;

		private String aliyunInstanceType;

		private Boolean deleteWithInstance;

		private String clusterId;

		private String bpsR;

		private String bpsW;

		private String detachedTime;

		private String autoSnapshotPolicyId;

		private Integer iopsSize;

		private String instanceId;

		private String regionId;

		private String cacheSize;

		private Long resourceOwnerId;

		private String iopsW;

		private String modifiedTime;

		private String snapshotId;

		private Integer size;

		private String zoneId;

		private String businessStatus;

		private String attachedTime;

		private String category;

		private String tdcQos;

		private Long numericId;

		private String productCode;

		private List<Tag> tags;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getActive() {
			return this.active;
		}

		public void setActive(Boolean active) {
			this.active = active;
		}

		public String getHouyiDiskId() {
			return this.houyiDiskId;
		}

		public void setHouyiDiskId(String houyiDiskId) {
			this.houyiDiskId = houyiDiskId;
		}

		public Boolean getEnableAutoSnapshot() {
			return this.enableAutoSnapshot;
		}

		public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
			this.enableAutoSnapshot = enableAutoSnapshot;
		}

		public Boolean getBootable() {
			return this.bootable;
		}

		public void setBootable(Boolean bootable) {
			this.bootable = bootable;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getSnapshotLinkId() {
			return this.snapshotLinkId;
		}

		public void setSnapshotLinkId(String snapshotLinkId) {
			this.snapshotLinkId = snapshotLinkId;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public Boolean getDeleteAutoSnapshot() {
			return this.deleteAutoSnapshot;
		}

		public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
			this.deleteAutoSnapshot = deleteAutoSnapshot;
		}

		public String getSeq() {
			return this.seq;
		}

		public void setSeq(String seq) {
			this.seq = seq;
		}

		public String getIopsR() {
			return this.iopsR;
		}

		public void setIopsR(String iopsR) {
			this.iopsR = iopsR;
		}

		public String getCacheStatus() {
			return this.cacheStatus;
		}

		public void setCacheStatus(String cacheStatus) {
			this.cacheStatus = cacheStatus;
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

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getAliyunInstanceType() {
			return this.aliyunInstanceType;
		}

		public void setAliyunInstanceType(String aliyunInstanceType) {
			this.aliyunInstanceType = aliyunInstanceType;
		}

		public Boolean getDeleteWithInstance() {
			return this.deleteWithInstance;
		}

		public void setDeleteWithInstance(Boolean deleteWithInstance) {
			this.deleteWithInstance = deleteWithInstance;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getBpsR() {
			return this.bpsR;
		}

		public void setBpsR(String bpsR) {
			this.bpsR = bpsR;
		}

		public String getBpsW() {
			return this.bpsW;
		}

		public void setBpsW(String bpsW) {
			this.bpsW = bpsW;
		}

		public String getDetachedTime() {
			return this.detachedTime;
		}

		public void setDetachedTime(String detachedTime) {
			this.detachedTime = detachedTime;
		}

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}

		public Integer getIopsSize() {
			return this.iopsSize;
		}

		public void setIopsSize(Integer iopsSize) {
			this.iopsSize = iopsSize;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getCacheSize() {
			return this.cacheSize;
		}

		public void setCacheSize(String cacheSize) {
			this.cacheSize = cacheSize;
		}

		public Long getResourceOwnerId() {
			return this.resourceOwnerId;
		}

		public void setResourceOwnerId(Long resourceOwnerId) {
			this.resourceOwnerId = resourceOwnerId;
		}

		public String getIopsW() {
			return this.iopsW;
		}

		public void setIopsW(String iopsW) {
			this.iopsW = iopsW;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
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

		public String getTdcQos() {
			return this.tdcQos;
		}

		public void setTdcQos(String tdcQos) {
			this.tdcQos = tdcQos;
		}

		public Long getNumericId() {
			return this.numericId;
		}

		public void setNumericId(Long numericId) {
			this.numericId = numericId;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
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
	}

	@Override
	public OpsQueryDiskExtModelListResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryDiskExtModelListResponseUnmarshaller.unmarshall(this, context);
	}
}
