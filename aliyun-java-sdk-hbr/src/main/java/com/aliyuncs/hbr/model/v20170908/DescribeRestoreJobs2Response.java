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
import com.aliyuncs.hbr.transform.v20170908.DescribeRestoreJobs2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRestoreJobs2Response extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<RestoreJob> restoreJobs;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<RestoreJob> getRestoreJobs() {
		return this.restoreJobs;
	}

	public void setRestoreJobs(List<RestoreJob> restoreJobs) {
		this.restoreJobs = restoreJobs;
	}

	public static class RestoreJob {

		private String snapshotHash;

		private String status;

		private String errorMessage;

		private Long actualItems;

		private String vaultId;

		private Long actualBytes;

		private String udmDetail;

		private String sourceType;

		private String options;

		private String targetInstanceId;

		private String restoreType;

		private Long targetCreateTime;

		private Long itemsDone;

		private Long bytesTotal;

		private String exclude;

		private String parentId;

		private Long completeTime;

		private Long createdTime;

		private String targetBucket;

		private String clusterId;

		private String targetFileSystemId;

		private Integer progress;

		private Long expireTime;

		private String targetDataSourceId;

		private String targetPrefix;

		private String targetPath;

		private String errorFile;

		private Long startTime;

		private Long updatedTime;

		private String snapshotId;

		private String restoreId;

		private String targetClientId;

		private Long itemsTotal;

		private String include;

		private Long bytesDone;

		private String targetInstanceName;

		private String targetTableName;

		private Long speed;

		private Long targetTime;

		private String crossAccountType;

		private Long crossAccountUserId;

		private String crossAccountRoleName;

		private Long meteringBytesDone;

		private Long meteringBytesTotal;

		private String storageClass;

		private String failbackDetail;

		private OtsDetail otsDetail;

		private Report report;

		public String getSnapshotHash() {
			return this.snapshotHash;
		}

		public void setSnapshotHash(String snapshotHash) {
			this.snapshotHash = snapshotHash;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public String getUdmDetail() {
			return this.udmDetail;
		}

		public void setUdmDetail(String udmDetail) {
			this.udmDetail = udmDetail;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getOptions() {
			return this.options;
		}

		public void setOptions(String options) {
			this.options = options;
		}

		public String getTargetInstanceId() {
			return this.targetInstanceId;
		}

		public void setTargetInstanceId(String targetInstanceId) {
			this.targetInstanceId = targetInstanceId;
		}

		public String getRestoreType() {
			return this.restoreType;
		}

		public void setRestoreType(String restoreType) {
			this.restoreType = restoreType;
		}

		public Long getTargetCreateTime() {
			return this.targetCreateTime;
		}

		public void setTargetCreateTime(Long targetCreateTime) {
			this.targetCreateTime = targetCreateTime;
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

		public String getExclude() {
			return this.exclude;
		}

		public void setExclude(String exclude) {
			this.exclude = exclude;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public Long getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(Long completeTime) {
			this.completeTime = completeTime;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public String getTargetBucket() {
			return this.targetBucket;
		}

		public void setTargetBucket(String targetBucket) {
			this.targetBucket = targetBucket;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getTargetFileSystemId() {
			return this.targetFileSystemId;
		}

		public void setTargetFileSystemId(String targetFileSystemId) {
			this.targetFileSystemId = targetFileSystemId;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public Long getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(Long expireTime) {
			this.expireTime = expireTime;
		}

		public String getTargetDataSourceId() {
			return this.targetDataSourceId;
		}

		public void setTargetDataSourceId(String targetDataSourceId) {
			this.targetDataSourceId = targetDataSourceId;
		}

		public String getTargetPrefix() {
			return this.targetPrefix;
		}

		public void setTargetPrefix(String targetPrefix) {
			this.targetPrefix = targetPrefix;
		}

		public String getTargetPath() {
			return this.targetPath;
		}

		public void setTargetPath(String targetPath) {
			this.targetPath = targetPath;
		}

		public String getErrorFile() {
			return this.errorFile;
		}

		public void setErrorFile(String errorFile) {
			this.errorFile = errorFile;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
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

		public String getRestoreId() {
			return this.restoreId;
		}

		public void setRestoreId(String restoreId) {
			this.restoreId = restoreId;
		}

		public String getTargetClientId() {
			return this.targetClientId;
		}

		public void setTargetClientId(String targetClientId) {
			this.targetClientId = targetClientId;
		}

		public Long getItemsTotal() {
			return this.itemsTotal;
		}

		public void setItemsTotal(Long itemsTotal) {
			this.itemsTotal = itemsTotal;
		}

		public String getInclude() {
			return this.include;
		}

		public void setInclude(String include) {
			this.include = include;
		}

		public Long getBytesDone() {
			return this.bytesDone;
		}

		public void setBytesDone(Long bytesDone) {
			this.bytesDone = bytesDone;
		}

		public String getTargetInstanceName() {
			return this.targetInstanceName;
		}

		public void setTargetInstanceName(String targetInstanceName) {
			this.targetInstanceName = targetInstanceName;
		}

		public String getTargetTableName() {
			return this.targetTableName;
		}

		public void setTargetTableName(String targetTableName) {
			this.targetTableName = targetTableName;
		}

		public Long getSpeed() {
			return this.speed;
		}

		public void setSpeed(Long speed) {
			this.speed = speed;
		}

		public Long getTargetTime() {
			return this.targetTime;
		}

		public void setTargetTime(Long targetTime) {
			this.targetTime = targetTime;
		}

		public String getCrossAccountType() {
			return this.crossAccountType;
		}

		public void setCrossAccountType(String crossAccountType) {
			this.crossAccountType = crossAccountType;
		}

		public Long getCrossAccountUserId() {
			return this.crossAccountUserId;
		}

		public void setCrossAccountUserId(Long crossAccountUserId) {
			this.crossAccountUserId = crossAccountUserId;
		}

		public String getCrossAccountRoleName() {
			return this.crossAccountRoleName;
		}

		public void setCrossAccountRoleName(String crossAccountRoleName) {
			this.crossAccountRoleName = crossAccountRoleName;
		}

		public Long getMeteringBytesDone() {
			return this.meteringBytesDone;
		}

		public void setMeteringBytesDone(Long meteringBytesDone) {
			this.meteringBytesDone = meteringBytesDone;
		}

		public Long getMeteringBytesTotal() {
			return this.meteringBytesTotal;
		}

		public void setMeteringBytesTotal(Long meteringBytesTotal) {
			this.meteringBytesTotal = meteringBytesTotal;
		}

		public String getStorageClass() {
			return this.storageClass;
		}

		public void setStorageClass(String storageClass) {
			this.storageClass = storageClass;
		}

		public String getFailbackDetail() {
			return this.failbackDetail;
		}

		public void setFailbackDetail(String failbackDetail) {
			this.failbackDetail = failbackDetail;
		}

		public OtsDetail getOtsDetail() {
			return this.otsDetail;
		}

		public void setOtsDetail(OtsDetail otsDetail) {
			this.otsDetail = otsDetail;
		}

		public Report getReport() {
			return this.report;
		}

		public void setReport(Report report) {
			this.report = report;
		}

		public static class OtsDetail {

			private Integer batchChannelCount;

			private Boolean overwriteExisting;

			public Integer getBatchChannelCount() {
				return this.batchChannelCount;
			}

			public void setBatchChannelCount(Integer batchChannelCount) {
				this.batchChannelCount = batchChannelCount;
			}

			public Boolean getOverwriteExisting() {
				return this.overwriteExisting;
			}

			public void setOverwriteExisting(Boolean overwriteExisting) {
				this.overwriteExisting = overwriteExisting;
			}
		}

		public static class Report {

			private String totalFiles;

			private String successFiles;

			private String failedFiles;

			private String skippedFiles;

			private String reportTaskStatus;

			public String getTotalFiles() {
				return this.totalFiles;
			}

			public void setTotalFiles(String totalFiles) {
				this.totalFiles = totalFiles;
			}

			public String getSuccessFiles() {
				return this.successFiles;
			}

			public void setSuccessFiles(String successFiles) {
				this.successFiles = successFiles;
			}

			public String getFailedFiles() {
				return this.failedFiles;
			}

			public void setFailedFiles(String failedFiles) {
				this.failedFiles = failedFiles;
			}

			public String getSkippedFiles() {
				return this.skippedFiles;
			}

			public void setSkippedFiles(String skippedFiles) {
				this.skippedFiles = skippedFiles;
			}

			public String getReportTaskStatus() {
				return this.reportTaskStatus;
			}

			public void setReportTaskStatus(String reportTaskStatus) {
				this.reportTaskStatus = reportTaskStatus;
			}
		}
	}

	@Override
	public DescribeRestoreJobs2Response getInstance(UnmarshallerContext context) {
		return	DescribeRestoreJobs2ResponseUnmarshaller.unmarshall(this, context);
	}
}
