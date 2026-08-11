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
import com.aliyuncs.ecs.transform.v20140526.DescribeSnapshotGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSnapshotGroupsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<SnapshotGroup> snapshotGroups;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SnapshotGroup> getSnapshotGroups() {
		return this.snapshotGroups;
	}

	public void setSnapshotGroups(List<SnapshotGroup> snapshotGroups) {
		this.snapshotGroups = snapshotGroups;
	}

	public static class SnapshotGroup {

		private String status;

		private String progressStatus;

		private String description;

		private String resourceGroupId;

		private String instanceId;

		private String creationTime;

		private Integer retentionDays;

		private String snapshotGroupId;

		private String name;

		private List<Snapshot> snapshots;

		private List<Tag2> tags;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProgressStatus() {
			return this.progressStatus;
		}

		public void setProgressStatus(String progressStatus) {
			this.progressStatus = progressStatus;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getRetentionDays() {
			return this.retentionDays;
		}

		public void setRetentionDays(Integer retentionDays) {
			this.retentionDays = retentionDays;
		}

		public String getSnapshotGroupId() {
			return this.snapshotGroupId;
		}

		public void setSnapshotGroupId(String snapshotGroupId) {
			this.snapshotGroupId = snapshotGroupId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Snapshot> getSnapshots() {
			return this.snapshots;
		}

		public void setSnapshots(List<Snapshot> snapshots) {
			this.snapshots = snapshots;
		}

		public List<Tag2> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag2> tags) {
			this.tags = tags;
		}

		public static class Snapshot {

			private String snapshotId;

			private Boolean instantAccess;

			private String progress;

			private Boolean available;

			private String sourceDiskType;

			private Integer instantAccessRetentionDays;

			private String sourceDiskId;

			private List<Tag> tags1;

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
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

			public Boolean getAvailable() {
				return this.available;
			}

			public void setAvailable(Boolean available) {
				this.available = available;
			}

			public String getSourceDiskType() {
				return this.sourceDiskType;
			}

			public void setSourceDiskType(String sourceDiskType) {
				this.sourceDiskType = sourceDiskType;
			}

			public Integer getInstantAccessRetentionDays() {
				return this.instantAccessRetentionDays;
			}

			public void setInstantAccessRetentionDays(Integer instantAccessRetentionDays) {
				this.instantAccessRetentionDays = instantAccessRetentionDays;
			}

			public String getSourceDiskId() {
				return this.sourceDiskId;
			}

			public void setSourceDiskId(String sourceDiskId) {
				this.sourceDiskId = sourceDiskId;
			}

			public List<Tag> getTags1() {
				return this.tags1;
			}

			public void setTags1(List<Tag> tags1) {
				this.tags1 = tags1;
			}

			public static class Tag {

				private String value;

				private String key;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}
		}

		public static class Tag2 {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	@Override
	public DescribeSnapshotGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSnapshotGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
