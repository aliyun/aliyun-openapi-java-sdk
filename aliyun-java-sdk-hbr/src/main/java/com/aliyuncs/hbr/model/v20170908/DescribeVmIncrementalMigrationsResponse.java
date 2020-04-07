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
import com.aliyuncs.hbr.transform.v20170908.DescribeVmIncrementalMigrationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVmIncrementalMigrationsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Long totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<IncrementalMigration> incrementalMigrations;

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

	public List<IncrementalMigration> getIncrementalMigrations() {
		return this.incrementalMigrations;
	}

	public void setIncrementalMigrations(List<IncrementalMigration> incrementalMigrations) {
		this.incrementalMigrations = incrementalMigrations;
	}

	public static class IncrementalMigration {

		private String vmId;

		private String syncId;

		private String clientId;

		private String snapshotId;

		private String backupPlanId;

		private Boolean finalSync;

		private String status;

		private String message;

		private Long startTime;

		private Long updatedTime;

		private String clientName;

		private Long snapshotDuration;

		private Long completeTime;

		private Long snapshotBytesTotal;

		public String getVmId() {
			return this.vmId;
		}

		public void setVmId(String vmId) {
			this.vmId = vmId;
		}

		public String getSyncId() {
			return this.syncId;
		}

		public void setSyncId(String syncId) {
			this.syncId = syncId;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getBackupPlanId() {
			return this.backupPlanId;
		}

		public void setBackupPlanId(String backupPlanId) {
			this.backupPlanId = backupPlanId;
		}

		public Boolean getFinalSync() {
			return this.finalSync;
		}

		public void setFinalSync(Boolean finalSync) {
			this.finalSync = finalSync;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
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

		public String getClientName() {
			return this.clientName;
		}

		public void setClientName(String clientName) {
			this.clientName = clientName;
		}

		public Long getSnapshotDuration() {
			return this.snapshotDuration;
		}

		public void setSnapshotDuration(Long snapshotDuration) {
			this.snapshotDuration = snapshotDuration;
		}

		public Long getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(Long completeTime) {
			this.completeTime = completeTime;
		}

		public Long getSnapshotBytesTotal() {
			return this.snapshotBytesTotal;
		}

		public void setSnapshotBytesTotal(Long snapshotBytesTotal) {
			this.snapshotBytesTotal = snapshotBytesTotal;
		}
	}

	@Override
	public DescribeVmIncrementalMigrationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVmIncrementalMigrationsResponseUnmarshaller.unmarshall(this, context);
	}
}
