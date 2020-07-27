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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSnapshotsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

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

	public List<Snapshot> getSnapshots() {
		return this.snapshots;
	}

	public void setSnapshots(List<Snapshot> snapshots) {
		this.snapshots = snapshots;
	}

	public static class Snapshot {

		private String createTime;

		private String description;

		private String progress;

		private Integer remainTime;

		private Integer retentionDays;

		private String snapshotId;

		private String snapshotName;

		private String sourceFileSystemId;

		private Long sourceFileSystemSize;

		private String status;

		private Integer encryptType;

		private String sourceFileSystemVersion;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
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

		public String getSourceFileSystemId() {
			return this.sourceFileSystemId;
		}

		public void setSourceFileSystemId(String sourceFileSystemId) {
			this.sourceFileSystemId = sourceFileSystemId;
		}

		public Long getSourceFileSystemSize() {
			return this.sourceFileSystemSize;
		}

		public void setSourceFileSystemSize(Long sourceFileSystemSize) {
			this.sourceFileSystemSize = sourceFileSystemSize;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getEncryptType() {
			return this.encryptType;
		}

		public void setEncryptType(Integer encryptType) {
			this.encryptType = encryptType;
		}

		public String getSourceFileSystemVersion() {
			return this.sourceFileSystemVersion;
		}

		public void setSourceFileSystemVersion(String sourceFileSystemVersion) {
			this.sourceFileSystemVersion = sourceFileSystemVersion;
		}
	}

	@Override
	public DescribeSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}
}
