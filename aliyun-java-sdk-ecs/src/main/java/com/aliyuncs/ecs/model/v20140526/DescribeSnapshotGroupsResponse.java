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

	private String requestId;

	private String nextToken;

	private List<SnapshotGroup> snapshotGroups;

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

	public List<SnapshotGroup> getSnapshotGroups() {
		return this.snapshotGroups;
	}

	public void setSnapshotGroups(List<SnapshotGroup> snapshotGroups) {
		this.snapshotGroups = snapshotGroups;
	}

	public static class SnapshotGroup {

		private String instanceId;

		private String snapshotGroupId;

		private String status;

		private String name;

		private String description;

		private String creationTime;

		private List<Snapshot> snapshots;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getSnapshotGroupId() {
			return this.snapshotGroupId;
		}

		public void setSnapshotGroupId(String snapshotGroupId) {
			this.snapshotGroupId = snapshotGroupId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public List<Snapshot> getSnapshots() {
			return this.snapshots;
		}

		public void setSnapshots(List<Snapshot> snapshots) {
			this.snapshots = snapshots;
		}

		public static class Snapshot {

			private String snapshotId;

			private String progress;

			private String sourceDiskId;

			private String sourceDiskType;

			private Boolean instantAccess;

			private Integer instantAccessRetentionDays;

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
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

			public String getSourceDiskType() {
				return this.sourceDiskType;
			}

			public void setSourceDiskType(String sourceDiskType) {
				this.sourceDiskType = sourceDiskType;
			}

			public Boolean getInstantAccess() {
				return this.instantAccess;
			}

			public void setInstantAccess(Boolean instantAccess) {
				this.instantAccess = instantAccess;
			}

			public Integer getInstantAccessRetentionDays() {
				return this.instantAccessRetentionDays;
			}

			public void setInstantAccessRetentionDays(Integer instantAccessRetentionDays) {
				this.instantAccessRetentionDays = instantAccessRetentionDays;
			}
		}
	}

	@Override
	public DescribeSnapshotGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSnapshotGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
