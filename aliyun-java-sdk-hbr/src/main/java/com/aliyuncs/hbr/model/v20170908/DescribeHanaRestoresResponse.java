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
import com.aliyuncs.hbr.transform.v20170908.DescribeHanaRestoresResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHanaRestoresResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<HanaRestores> hanaRestore;

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

	public List<HanaRestores> getHanaRestore() {
		return this.hanaRestore;
	}

	public void setHanaRestore(List<HanaRestores> hanaRestore) {
		this.hanaRestore = hanaRestore;
	}

	public static class HanaRestores {

		private String restoreId;

		private String clusterId;

		private String vaultId;

		private String databaseName;

		private Long backupID;

		private Long recoveryPointInTime;

		private Long databaseRestoreId;

		private String service;

		private Long startTime;

		private Long endTime;

		private Long reachedTime;

		private String state;

		private String phase;

		private String message;

		private String status;

		private Integer maxPhase;

		private Integer currentPhase;

		private Long maxProgress;

		private Long currentProgress;

		public String getRestoreId() {
			return this.restoreId;
		}

		public void setRestoreId(String restoreId) {
			this.restoreId = restoreId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public Long getBackupID() {
			return this.backupID;
		}

		public void setBackupID(Long backupID) {
			this.backupID = backupID;
		}

		public Long getRecoveryPointInTime() {
			return this.recoveryPointInTime;
		}

		public void setRecoveryPointInTime(Long recoveryPointInTime) {
			this.recoveryPointInTime = recoveryPointInTime;
		}

		public Long getDatabaseRestoreId() {
			return this.databaseRestoreId;
		}

		public void setDatabaseRestoreId(Long databaseRestoreId) {
			this.databaseRestoreId = databaseRestoreId;
		}

		public String getService() {
			return this.service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getReachedTime() {
			return this.reachedTime;
		}

		public void setReachedTime(Long reachedTime) {
			this.reachedTime = reachedTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPhase() {
			return this.phase;
		}

		public void setPhase(String phase) {
			this.phase = phase;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getMaxPhase() {
			return this.maxPhase;
		}

		public void setMaxPhase(Integer maxPhase) {
			this.maxPhase = maxPhase;
		}

		public Integer getCurrentPhase() {
			return this.currentPhase;
		}

		public void setCurrentPhase(Integer currentPhase) {
			this.currentPhase = currentPhase;
		}

		public Long getMaxProgress() {
			return this.maxProgress;
		}

		public void setMaxProgress(Long maxProgress) {
			this.maxProgress = maxProgress;
		}

		public Long getCurrentProgress() {
			return this.currentProgress;
		}

		public void setCurrentProgress(Long currentProgress) {
			this.currentProgress = currentProgress;
		}
	}

	@Override
	public DescribeHanaRestoresResponse getInstance(UnmarshallerContext context) {
		return	DescribeHanaRestoresResponseUnmarshaller.unmarshall(this, context);
	}
}
