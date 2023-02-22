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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSnapshotsResponse extends AcsResponse {

	private String requestId;

	private List<BackupSnapshots> snapshots;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BackupSnapshots> getSnapshots() {
		return this.snapshots;
	}

	public void setSnapshots(List<BackupSnapshots> snapshots) {
		this.snapshots = snapshots;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class BackupSnapshots {

		private String containerSnapshotId;

		private String status;

		private String snapshotHash;

		private String errorMessage;

		private Long actualItems;

		private String vaultId;

		private Long actualBytes;

		private String sourceType;

		private String exitCode;

		private String clientId;

		private Long itemsDone;

		private Long bytesTotal;

		private Long retention;

		private String errorType;

		private Long createdTime;

		private String parentSnapshotHash;

		private String instanceId;

		private String planId;

		private String source;

		private String regionId;

		private String parentHash;

		private String uuid;

		private String errorFile;

		private String snapshotType;

		private String snapshotName;

		private String snapshotOption;

		private String snapshotId;

		private String jobId;

		private Long size;

		private String path;

		private Long errorCount;

		private Long duration;

		private Long itemsTotal;

		private Long bytesDone;

		private String clientVersion;

		private List<String> paths;

		public String getContainerSnapshotId() {
			return this.containerSnapshotId;
		}

		public void setContainerSnapshotId(String containerSnapshotId) {
			this.containerSnapshotId = containerSnapshotId;
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

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Long getActualItems() {
			return this.actualItems;
		}

		public void setActualItems(Long actualItems) {
			this.actualItems = actualItems;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public Long getActualBytes() {
			return this.actualBytes;
		}

		public void setActualBytes(Long actualBytes) {
			this.actualBytes = actualBytes;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getExitCode() {
			return this.exitCode;
		}

		public void setExitCode(String exitCode) {
			this.exitCode = exitCode;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public Long getItemsDone() {
			return this.itemsDone;
		}

		public void setItemsDone(Long itemsDone) {
			this.itemsDone = itemsDone;
		}

		public Long getBytesTotal() {
			return this.bytesTotal;
		}

		public void setBytesTotal(Long bytesTotal) {
			this.bytesTotal = bytesTotal;
		}

		public Long getRetention() {
			return this.retention;
		}

		public void setRetention(Long retention) {
			this.retention = retention;
		}

		public String getErrorType() {
			return this.errorType;
		}

		public void setErrorType(String errorType) {
			this.errorType = errorType;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public String getParentSnapshotHash() {
			return this.parentSnapshotHash;
		}

		public void setParentSnapshotHash(String parentSnapshotHash) {
			this.parentSnapshotHash = parentSnapshotHash;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getParentHash() {
			return this.parentHash;
		}

		public void setParentHash(String parentHash) {
			this.parentHash = parentHash;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getErrorFile() {
			return this.errorFile;
		}

		public void setErrorFile(String errorFile) {
			this.errorFile = errorFile;
		}

		public String getSnapshotType() {
			return this.snapshotType;
		}

		public void setSnapshotType(String snapshotType) {
			this.snapshotType = snapshotType;
		}

		public String getSnapshotName() {
			return this.snapshotName;
		}

		public void setSnapshotName(String snapshotName) {
			this.snapshotName = snapshotName;
		}

		public String getSnapshotOption() {
			return this.snapshotOption;
		}

		public void setSnapshotOption(String snapshotOption) {
			this.snapshotOption = snapshotOption;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public Long getErrorCount() {
			return this.errorCount;
		}

		public void setErrorCount(Long errorCount) {
			this.errorCount = errorCount;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public Long getItemsTotal() {
			return this.itemsTotal;
		}

		public void setItemsTotal(Long itemsTotal) {
			this.itemsTotal = itemsTotal;
		}

		public Long getBytesDone() {
			return this.bytesDone;
		}

		public void setBytesDone(Long bytesDone) {
			this.bytesDone = bytesDone;
		}

		public String getClientVersion() {
			return this.clientVersion;
		}

		public void setClientVersion(String clientVersion) {
			this.clientVersion = clientVersion;
		}

		public List<String> getPaths() {
			return this.paths;
		}

		public void setPaths(List<String> paths) {
			this.paths = paths;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private String nextToken;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
