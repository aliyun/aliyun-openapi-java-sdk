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
import com.aliyuncs.ecs.transform.v20140526.DescribeSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSnapshotsResponse extends AcsResponse {

	private String nextToken;

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Integer totalCount;

	private List<Snapshot> snapshots;

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

	public List<Snapshot> getSnapshots() {
		return this.snapshots;
	}

	public void setSnapshots(List<Snapshot> snapshots) {
		this.snapshots = snapshots;
	}

	public static class Snapshot {

		private String status;

		private String creationTime;

		private String progress;

		private Boolean instantAccess;

		private Integer remainTime;

		private String sourceDiskSize;

		private Integer retentionDays;

		private String sourceDiskType;

		private String sourceStorageType;

		private String usage;

		private String lastModifiedTime;

		private Boolean encrypted;

		private String snapshotType;

		private String sourceDiskId;

		private String snapshotName;

		private Integer instantAccessRetentionDays;

		private String description;

		private String snapshotId;

		private String resourceGroupId;

		private String category;

		private String kMSKeyId;

		private String snapshotSN;

		private String productCode;

		private String sourceSnapshotId;

		private String sourceRegionId;

		private List<Tag> tags;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public Boolean getInstantAccess() {
			return this.instantAccess;
		}

		public void setInstantAccess(Boolean instantAccess) {
			this.instantAccess = instantAccess;
		}

		public Integer getRemainTime() {
			return this.remainTime;
		}

		public void setRemainTime(Integer remainTime) {
			this.remainTime = remainTime;
		}

		public String getSourceDiskSize() {
			return this.sourceDiskSize;
		}

		public void setSourceDiskSize(String sourceDiskSize) {
			this.sourceDiskSize = sourceDiskSize;
		}

		public Integer getRetentionDays() {
			return this.retentionDays;
		}

		public void setRetentionDays(Integer retentionDays) {
			this.retentionDays = retentionDays;
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

		public String getUsage() {
			return this.usage;
		}

		public void setUsage(String usage) {
			this.usage = usage;
		}

		public String getLastModifiedTime() {
			return this.lastModifiedTime;
		}

		public void setLastModifiedTime(String lastModifiedTime) {
			this.lastModifiedTime = lastModifiedTime;
		}

		public Boolean getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(Boolean encrypted) {
			this.encrypted = encrypted;
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

		public String getSnapshotName() {
			return this.snapshotName;
		}

		public void setSnapshotName(String snapshotName) {
			this.snapshotName = snapshotName;
		}

		public Integer getInstantAccessRetentionDays() {
			return this.instantAccessRetentionDays;
		}

		public void setInstantAccessRetentionDays(Integer instantAccessRetentionDays) {
			this.instantAccessRetentionDays = instantAccessRetentionDays;
		}

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

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getKMSKeyId() {
			return this.kMSKeyId;
		}

		public void setKMSKeyId(String kMSKeyId) {
			this.kMSKeyId = kMSKeyId;
		}

		public String getSnapshotSN() {
			return this.snapshotSN;
		}

		public void setSnapshotSN(String snapshotSN) {
			this.snapshotSN = snapshotSN;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getSourceSnapshotId() {
			return this.sourceSnapshotId;
		}

		public void setSourceSnapshotId(String sourceSnapshotId) {
			this.sourceSnapshotId = sourceSnapshotId;
		}

		public String getSourceRegionId() {
			return this.sourceRegionId;
		}

		public void setSourceRegionId(String sourceRegionId) {
			this.sourceRegionId = sourceRegionId;
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
	public DescribeSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}
}
