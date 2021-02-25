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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeUdmSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUdmSnapshotsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Long totalCount;

	private List<Snapshot> snapshots;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

		private Long createdTime;

		private Long updatedTime;

		private String snapshotId;

		private String sourceType;

		private String jobId;

		private String backupType;

		private String status;

		private String snapshotHash;

		private String parentSnapshotHash;

		private Long startTime;

		private Long completeTime;

		private Long retention;

		private Long bytesTotal;

		private String fileSystemId;

		private Long createTime;

		private String bucket;

		private String prefix;

		private String bucket1;

		private String prefix2;

		private String instanceId;

		private String diskId;

		private String nativeSnapshotId;

		private String actualBytes;

		private Long realSnapshotTime;

		private String nativeSnapshotInfo;

		private String detail;

		private List<String> paths;

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSnapshotHash() {
			return this.snapshotHash;
		}

		public void setSnapshotHash(String snapshotHash) {
			this.snapshotHash = snapshotHash;
		}

		public String getParentSnapshotHash() {
			return this.parentSnapshotHash;
		}

		public void setParentSnapshotHash(String parentSnapshotHash) {
			this.parentSnapshotHash = parentSnapshotHash;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(Long completeTime) {
			this.completeTime = completeTime;
		}

		public Long getRetention() {
			return this.retention;
		}

		public void setRetention(Long retention) {
			this.retention = retention;
		}

		public Long getBytesTotal() {
			return this.bytesTotal;
		}

		public void setBytesTotal(Long bytesTotal) {
			this.bytesTotal = bytesTotal;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public String getPrefix() {
			return this.prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public String getBucket1() {
			return this.bucket1;
		}

		public void setBucket1(String bucket1) {
			this.bucket1 = bucket1;
		}

		public String getPrefix2() {
			return this.prefix2;
		}

		public void setPrefix2(String prefix2) {
			this.prefix2 = prefix2;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getNativeSnapshotId() {
			return this.nativeSnapshotId;
		}

		public void setNativeSnapshotId(String nativeSnapshotId) {
			this.nativeSnapshotId = nativeSnapshotId;
		}

		public String getActualBytes() {
			return this.actualBytes;
		}

		public void setActualBytes(String actualBytes) {
			this.actualBytes = actualBytes;
		}

		public Long getRealSnapshotTime() {
			return this.realSnapshotTime;
		}

		public void setRealSnapshotTime(Long realSnapshotTime) {
			this.realSnapshotTime = realSnapshotTime;
		}

		public String getNativeSnapshotInfo() {
			return this.nativeSnapshotInfo;
		}

		public void setNativeSnapshotInfo(String nativeSnapshotInfo) {
			this.nativeSnapshotInfo = nativeSnapshotInfo;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public List<String> getPaths() {
			return this.paths;
		}

		public void setPaths(List<String> paths) {
			this.paths = paths;
		}
	}

	@Override
	public DescribeUdmSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	DescribeUdmSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
