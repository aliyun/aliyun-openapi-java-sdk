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

package com.aliyuncs.swas.model.v20170810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas.transform.v20170810.GetDiskSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDiskSnapshotsResponse extends AcsResponse {

	private Boolean isSuccess;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private String code;

	private List<DiskSnapshot> diskSnapshots;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<DiskSnapshot> getDiskSnapshots() {
		return this.diskSnapshots;
	}

	public void setDiskSnapshots(List<DiskSnapshot> diskSnapshots) {
		this.diskSnapshots = diskSnapshots;
	}

	public static class DiskSnapshot {

		private String status;

		private Long creationTime;

		private String progress;

		private String remark;

		private String sourceDiskName;

		private Integer sourceDiskSize;

		private String regionId;

		private String sourceDiskId;

		private Long rollBackTime;

		private String snapshotName;

		private String resourceType;

		private String snapshotId;

		private String zoneId;

		private String sourceDiskRemark;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getSourceDiskName() {
			return this.sourceDiskName;
		}

		public void setSourceDiskName(String sourceDiskName) {
			this.sourceDiskName = sourceDiskName;
		}

		public Integer getSourceDiskSize() {
			return this.sourceDiskSize;
		}

		public void setSourceDiskSize(Integer sourceDiskSize) {
			this.sourceDiskSize = sourceDiskSize;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getSourceDiskId() {
			return this.sourceDiskId;
		}

		public void setSourceDiskId(String sourceDiskId) {
			this.sourceDiskId = sourceDiskId;
		}

		public Long getRollBackTime() {
			return this.rollBackTime;
		}

		public void setRollBackTime(Long rollBackTime) {
			this.rollBackTime = rollBackTime;
		}

		public String getSnapshotName() {
			return this.snapshotName;
		}

		public void setSnapshotName(String snapshotName) {
			this.snapshotName = snapshotName;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getSourceDiskRemark() {
			return this.sourceDiskRemark;
		}

		public void setSourceDiskRemark(String sourceDiskRemark) {
			this.sourceDiskRemark = sourceDiskRemark;
		}
	}

	@Override
	public GetDiskSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	GetDiskSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
