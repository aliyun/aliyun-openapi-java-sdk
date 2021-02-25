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

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

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

	public List<RestoreJob> getRestoreJobs() {
		return this.restoreJobs;
	}

	public void setRestoreJobs(List<RestoreJob> restoreJobs) {
		this.restoreJobs = restoreJobs;
	}

	public static class RestoreJob {

		private String restoreId;

		private String restoreType;

		private String parentId;

		private String status;

		private String errorMessage;

		private Long startTime;

		private Long completeTime;

		private Long expireTime;

		private Integer progress;

		private Long bytesDone;

		private Long bytesTotal;

		private String vaultId;

		private String snapshotId;

		private String snapshotHash;

		private String sourceType;

		private String options;

		private String targetFileSystemId;

		private Long targetCreateTime;

		private String targetPath;

		private Long createdTime;

		private Long updatedTime;

		private String targetBucket;

		private String targetPrefix;

		private String udmDetail;

		private String targetInstanceId;

		private String targetClientId;

		private String clusterId;

		private String targetDataSourceId;

		private Long actualBytes;

		private Long itemsDone;

		private Long itemsTotal;

		private Long actualItems;

		private String errorFile;

		public String getRestoreId() {
			return this.restoreId;
		}

		public void setRestoreId(String restoreId) {
			this.restoreId = restoreId;
		}

		public String getRestoreType() {
			return this.restoreType;
		}

		public void setRestoreType(String restoreType) {
			this.restoreType = restoreType;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
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

		public Long getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(Long expireTime) {
			this.expireTime = expireTime;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public Long getBytesDone() {
			return this.bytesDone;
		}

		public void setBytesDone(Long bytesDone) {
			this.bytesDone = bytesDone;
		}

		public Long getBytesTotal() {
			return this.bytesTotal;
		}

		public void setBytesTotal(Long bytesTotal) {
			this.bytesTotal = bytesTotal;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getSnapshotHash() {
			return this.snapshotHash;
		}

		public void setSnapshotHash(String snapshotHash) {
			this.snapshotHash = snapshotHash;
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

		public String getTargetFileSystemId() {
			return this.targetFileSystemId;
		}

		public void setTargetFileSystemId(String targetFileSystemId) {
			this.targetFileSystemId = targetFileSystemId;
		}

		public Long getTargetCreateTime() {
			return this.targetCreateTime;
		}

		public void setTargetCreateTime(Long targetCreateTime) {
			this.targetCreateTime = targetCreateTime;
		}

		public String getTargetPath() {
			return this.targetPath;
		}

		public void setTargetPath(String targetPath) {
			this.targetPath = targetPath;
		}

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

		public String getTargetBucket() {
			return this.targetBucket;
		}

		public void setTargetBucket(String targetBucket) {
			this.targetBucket = targetBucket;
		}

		public String getTargetPrefix() {
			return this.targetPrefix;
		}

		public void setTargetPrefix(String targetPrefix) {
			this.targetPrefix = targetPrefix;
		}

		public String getUdmDetail() {
			return this.udmDetail;
		}

		public void setUdmDetail(String udmDetail) {
			this.udmDetail = udmDetail;
		}

		public String getTargetInstanceId() {
			return this.targetInstanceId;
		}

		public void setTargetInstanceId(String targetInstanceId) {
			this.targetInstanceId = targetInstanceId;
		}

		public String getTargetClientId() {
			return this.targetClientId;
		}

		public void setTargetClientId(String targetClientId) {
			this.targetClientId = targetClientId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getTargetDataSourceId() {
			return this.targetDataSourceId;
		}

		public void setTargetDataSourceId(String targetDataSourceId) {
			this.targetDataSourceId = targetDataSourceId;
		}

		public Long getActualBytes() {
			return this.actualBytes;
		}

		public void setActualBytes(Long actualBytes) {
			this.actualBytes = actualBytes;
		}

		public Long getItemsDone() {
			return this.itemsDone;
		}

		public void setItemsDone(Long itemsDone) {
			this.itemsDone = itemsDone;
		}

		public Long getItemsTotal() {
			return this.itemsTotal;
		}

		public void setItemsTotal(Long itemsTotal) {
			this.itemsTotal = itemsTotal;
		}

		public Long getActualItems() {
			return this.actualItems;
		}

		public void setActualItems(Long actualItems) {
			this.actualItems = actualItems;
		}

		public String getErrorFile() {
			return this.errorFile;
		}

		public void setErrorFile(String errorFile) {
			this.errorFile = errorFile;
		}
	}

	@Override
	public DescribeRestoreJobs2Response getInstance(UnmarshallerContext context) {
		return	DescribeRestoreJobs2ResponseUnmarshaller.unmarshall(this, context);
	}
}
