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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeSnapshotsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Snapshot> snapshots;

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

	public List<Snapshot> getSnapshots() {
		return this.snapshots;
	}

	public void setSnapshots(List<Snapshot> snapshots) {
		this.snapshots = snapshots;
	}

	public static class Snapshot {

		private String snapshotId;

		private String snapshotName;

		private String bid;

		private Long resourceOwnerId;

		private String description;

		private String progress;

		private String sourceDiskId;

		private Integer sourceDiskSize;

		private String sourceDiskType;

		private String snapshotType;

		private String houyiSnapshotId;

		private String createdTime;

		private String modifiedTime;

		private String imageId;

		private String regionId;

		private String ecsSnapshotStatus;

		private String encrypted;

		private Integer retentionDays;

		private Boolean instantAccess;

		private Integer iaRetentionDays;

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getSnapshotName() {
			return this.snapshotName;
		}

		public void setSnapshotName(String snapshotName) {
			this.snapshotName = snapshotName;
		}

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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getSourceDiskId() {
			return this.sourceDiskId;
		}

		public void setSourceDiskId(String sourceDiskId) {
			this.sourceDiskId = sourceDiskId;
		}

		public Integer getSourceDiskSize() {
			return this.sourceDiskSize;
		}

		public void setSourceDiskSize(Integer sourceDiskSize) {
			this.sourceDiskSize = sourceDiskSize;
		}

		public String getSourceDiskType() {
			return this.sourceDiskType;
		}

		public void setSourceDiskType(String sourceDiskType) {
			this.sourceDiskType = sourceDiskType;
		}

		public String getSnapshotType() {
			return this.snapshotType;
		}

		public void setSnapshotType(String snapshotType) {
			this.snapshotType = snapshotType;
		}

		public String getHouyiSnapshotId() {
			return this.houyiSnapshotId;
		}

		public void setHouyiSnapshotId(String houyiSnapshotId) {
			this.houyiSnapshotId = houyiSnapshotId;
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

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getEcsSnapshotStatus() {
			return this.ecsSnapshotStatus;
		}

		public void setEcsSnapshotStatus(String ecsSnapshotStatus) {
			this.ecsSnapshotStatus = ecsSnapshotStatus;
		}

		public String getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(String encrypted) {
			this.encrypted = encrypted;
		}

		public Integer getRetentionDays() {
			return this.retentionDays;
		}

		public void setRetentionDays(Integer retentionDays) {
			this.retentionDays = retentionDays;
		}

		public Boolean getInstantAccess() {
			return this.instantAccess;
		}

		public void setInstantAccess(Boolean instantAccess) {
			this.instantAccess = instantAccess;
		}

		public Integer getIaRetentionDays() {
			return this.iaRetentionDays;
		}

		public void setIaRetentionDays(Integer iaRetentionDays) {
			this.iaRetentionDays = iaRetentionDays;
		}
	}

	@Override
	public OpsDescribeSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}
}
