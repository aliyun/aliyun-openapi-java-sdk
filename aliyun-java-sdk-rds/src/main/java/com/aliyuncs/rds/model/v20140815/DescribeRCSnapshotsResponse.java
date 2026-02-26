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
import com.aliyuncs.rds.transform.v20140815.DescribeRCSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCSnapshotsResponse extends AcsResponse {

	private Long pageNumber;

	private Long pageSize;

	private String requestId;

	private Long totalCount;

	private List<Snapshot> snapshots;

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Snapshot> getSnapshots() {
		return this.snapshots;
	}

	public void setSnapshots(List<Snapshot> snapshots) {
		this.snapshots = snapshots;
	}

	public static class Snapshot {

		private Boolean available;

		private String category;

		private String creationTime;

		private String description;

		private Boolean encrypted;

		private Boolean instantAccess;

		private String progress;

		private String regionId;

		private String snapshotId;

		private String snapshotName;

		private String snapshotType;

		private String sourceDiskId;

		private Long sourceDiskSize;

		private String sourceDiskType;

		private String sourceStorageType;

		private String status;

		private String usage;

		private String resourceGroupId;

		private List<TagItem> tag;

		public Boolean getAvailable() {
			return this.available;
		}

		public void setAvailable(Boolean available) {
			this.available = available;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(Boolean encrypted) {
			this.encrypted = encrypted;
		}

		public Boolean getInstantAccess() {
			return this.instantAccess;
		}

		public void setInstantAccess(Boolean instantAccess) {
			this.instantAccess = instantAccess;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

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

		public String getSnapshotType() {
			return this.snapshotType;
		}

		public void setSnapshotType(String snapshotType) {
			this.snapshotType = snapshotType;
		}

		public String getSourceDiskId() {
			return this.sourceDiskId;
		}

		public void setSourceDiskId(String sourceDiskId) {
			this.sourceDiskId = sourceDiskId;
		}

		public Long getSourceDiskSize() {
			return this.sourceDiskSize;
		}

		public void setSourceDiskSize(Long sourceDiskSize) {
			this.sourceDiskSize = sourceDiskSize;
		}

		public String getSourceDiskType() {
			return this.sourceDiskType;
		}

		public void setSourceDiskType(String sourceDiskType) {
			this.sourceDiskType = sourceDiskType;
		}

		public String getSourceStorageType() {
			return this.sourceStorageType;
		}

		public void setSourceStorageType(String sourceStorageType) {
			this.sourceStorageType = sourceStorageType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUsage() {
			return this.usage;
		}

		public void setUsage(String usage) {
			this.usage = usage;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<TagItem> getTag() {
			return this.tag;
		}

		public void setTag(List<TagItem> tag) {
			this.tag = tag;
		}

		public static class TagItem {

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
	public DescribeRCSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
