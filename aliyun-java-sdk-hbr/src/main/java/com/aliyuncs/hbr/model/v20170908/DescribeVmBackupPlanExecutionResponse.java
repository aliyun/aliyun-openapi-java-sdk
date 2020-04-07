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
import com.aliyuncs.hbr.transform.v20170908.DescribeVmBackupPlanExecutionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVmBackupPlanExecutionResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<VmBackupExecution> vmBackupExecutions;

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

	public List<VmBackupExecution> getVmBackupExecutions() {
		return this.vmBackupExecutions;
	}

	public void setVmBackupExecutions(List<VmBackupExecution> vmBackupExecutions) {
		this.vmBackupExecutions = vmBackupExecutions;
	}

	public static class VmBackupExecution {

		private String vmId;

		private String vCenterId;

		private String backupPlanId;

		private String clientId;

		private Boolean hasError;

		private String errorMessage;

		private String snapshotId;

		private String vmName;

		private Snapshot snapshot;

		public String getVmId() {
			return this.vmId;
		}

		public void setVmId(String vmId) {
			this.vmId = vmId;
		}

		public String getVCenterId() {
			return this.vCenterId;
		}

		public void setVCenterId(String vCenterId) {
			this.vCenterId = vCenterId;
		}

		public String getBackupPlanId() {
			return this.backupPlanId;
		}

		public void setBackupPlanId(String backupPlanId) {
			this.backupPlanId = backupPlanId;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public Boolean getHasError() {
			return this.hasError;
		}

		public void setHasError(Boolean hasError) {
			this.hasError = hasError;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getVmName() {
			return this.vmName;
		}

		public void setVmName(String vmName) {
			this.vmName = vmName;
		}

		public Snapshot getSnapshot() {
			return this.snapshot;
		}

		public void setSnapshot(Snapshot snapshot) {
			this.snapshot = snapshot;
		}

		public static class Snapshot {

			private String snapshotId;

			private String clientId;

			private String vaultId;

			private String jobId;

			private String snapshotHash;

			private String snapshotName;

			private String sourceType;

			private String source;

			private String parentHash;

			private String status;

			private Long retention;

			private String snapshotOption;

			private String containerSnapshotId;

			private String serverId;

			private String planId;

			private String snapshotType;

			private String extra;

			private String errorType;

			private Long size;

			private Long createdTime;

			private Long updatedTime;

			private Long duration;

			private Long completeTime;

			private Long errorCount;

			private Long bytesTotal;

			private Long bytesDone;

			private Long itemsTotal;

			private Long itemsDone;

			private Long actualBytes;

			private Integer percentage;

			private String exitCode;

			private String errorMessage;

			private String errorFile;

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
			}

			public String getClientId() {
				return this.clientId;
			}

			public void setClientId(String clientId) {
				this.clientId = clientId;
			}

			public String getVaultId() {
				return this.vaultId;
			}

			public void setVaultId(String vaultId) {
				this.vaultId = vaultId;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getSnapshotHash() {
				return this.snapshotHash;
			}

			public void setSnapshotHash(String snapshotHash) {
				this.snapshotHash = snapshotHash;
			}

			public String getSnapshotName() {
				return this.snapshotName;
			}

			public void setSnapshotName(String snapshotName) {
				this.snapshotName = snapshotName;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getParentHash() {
				return this.parentHash;
			}

			public void setParentHash(String parentHash) {
				this.parentHash = parentHash;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getRetention() {
				return this.retention;
			}

			public void setRetention(Long retention) {
				this.retention = retention;
			}

			public String getSnapshotOption() {
				return this.snapshotOption;
			}

			public void setSnapshotOption(String snapshotOption) {
				this.snapshotOption = snapshotOption;
			}

			public String getContainerSnapshotId() {
				return this.containerSnapshotId;
			}

			public void setContainerSnapshotId(String containerSnapshotId) {
				this.containerSnapshotId = containerSnapshotId;
			}

			public String getServerId() {
				return this.serverId;
			}

			public void setServerId(String serverId) {
				this.serverId = serverId;
			}

			public String getPlanId() {
				return this.planId;
			}

			public void setPlanId(String planId) {
				this.planId = planId;
			}

			public String getSnapshotType() {
				return this.snapshotType;
			}

			public void setSnapshotType(String snapshotType) {
				this.snapshotType = snapshotType;
			}

			public String getExtra() {
				return this.extra;
			}

			public void setExtra(String extra) {
				this.extra = extra;
			}

			public String getErrorType() {
				return this.errorType;
			}

			public void setErrorType(String errorType) {
				this.errorType = errorType;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
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

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public Long getCompleteTime() {
				return this.completeTime;
			}

			public void setCompleteTime(Long completeTime) {
				this.completeTime = completeTime;
			}

			public Long getErrorCount() {
				return this.errorCount;
			}

			public void setErrorCount(Long errorCount) {
				this.errorCount = errorCount;
			}

			public Long getBytesTotal() {
				return this.bytesTotal;
			}

			public void setBytesTotal(Long bytesTotal) {
				this.bytesTotal = bytesTotal;
			}

			public Long getBytesDone() {
				return this.bytesDone;
			}

			public void setBytesDone(Long bytesDone) {
				this.bytesDone = bytesDone;
			}

			public Long getItemsTotal() {
				return this.itemsTotal;
			}

			public void setItemsTotal(Long itemsTotal) {
				this.itemsTotal = itemsTotal;
			}

			public Long getItemsDone() {
				return this.itemsDone;
			}

			public void setItemsDone(Long itemsDone) {
				this.itemsDone = itemsDone;
			}

			public Long getActualBytes() {
				return this.actualBytes;
			}

			public void setActualBytes(Long actualBytes) {
				this.actualBytes = actualBytes;
			}

			public Integer getPercentage() {
				return this.percentage;
			}

			public void setPercentage(Integer percentage) {
				this.percentage = percentage;
			}

			public String getExitCode() {
				return this.exitCode;
			}

			public void setExitCode(String exitCode) {
				this.exitCode = exitCode;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getErrorFile() {
				return this.errorFile;
			}

			public void setErrorFile(String errorFile) {
				this.errorFile = errorFile;
			}
		}
	}

	@Override
	public DescribeVmBackupPlanExecutionResponse getInstance(UnmarshallerContext context) {
		return	DescribeVmBackupPlanExecutionResponseUnmarshaller.unmarshall(this, context);
	}
}
