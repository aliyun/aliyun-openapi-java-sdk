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

package com.aliyuncs.dbfs.model.v20200418;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbfs.transform.v20200418.ListSnapshotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSnapshotResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<SnapshotsItem> snapshots;

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

	public List<SnapshotsItem> getSnapshots() {
		return this.snapshots;
	}

	public void setSnapshots(List<SnapshotsItem> snapshots) {
		this.snapshots = snapshots;
	}

	public static class SnapshotsItem {

		private String category;

		private String creationTime;

		private String description;

		private String lastModifiedTime;

		private String progress;

		private Integer remainTime;

		private Integer retentionDays;

		private String snapshotId;

		private String snapshotName;

		private String snapshotType;

		private String status;

		private String sourceFsId;

		private Integer sourceFsSize;

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

		public String getLastModifiedTime() {
			return this.lastModifiedTime;
		}

		public void setLastModifiedTime(String lastModifiedTime) {
			this.lastModifiedTime = lastModifiedTime;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public Integer getRemainTime() {
			return this.remainTime;
		}

		public void setRemainTime(Integer remainTime) {
			this.remainTime = remainTime;
		}

		public Integer getRetentionDays() {
			return this.retentionDays;
		}

		public void setRetentionDays(Integer retentionDays) {
			this.retentionDays = retentionDays;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSourceFsId() {
			return this.sourceFsId;
		}

		public void setSourceFsId(String sourceFsId) {
			this.sourceFsId = sourceFsId;
		}

		public Integer getSourceFsSize() {
			return this.sourceFsSize;
		}

		public void setSourceFsSize(Integer sourceFsSize) {
			this.sourceFsSize = sourceFsSize;
		}
	}

	@Override
	public ListSnapshotResponse getInstance(UnmarshallerContext context) {
		return	ListSnapshotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
