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

		private String mode;

		private Long logPosition;

		private Integer volumeId;

		private Boolean useCatalog;

		private String backupPrefix;

		private Boolean systemCopy;

		private String source;

		private String sourceClusterId;

		private String logPaths;

		private Boolean checkAccess;

		private Boolean clearLog;

		private Boolean useDelta;

		private String extraOptions;

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

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public Long getLogPosition() {
			return this.logPosition;
		}

		public void setLogPosition(Long logPosition) {
			this.logPosition = logPosition;
		}

		public Integer getVolumeId() {
			return this.volumeId;
		}

		public void setVolumeId(Integer volumeId) {
			this.volumeId = volumeId;
		}

		public Boolean getUseCatalog() {
			return this.useCatalog;
		}

		public void setUseCatalog(Boolean useCatalog) {
			this.useCatalog = useCatalog;
		}

		public String getBackupPrefix() {
			return this.backupPrefix;
		}

		public void setBackupPrefix(String backupPrefix) {
			this.backupPrefix = backupPrefix;
		}

		public Boolean getSystemCopy() {
			return this.systemCopy;
		}

		public void setSystemCopy(Boolean systemCopy) {
			this.systemCopy = systemCopy;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getSourceClusterId() {
			return this.sourceClusterId;
		}

		public void setSourceClusterId(String sourceClusterId) {
			this.sourceClusterId = sourceClusterId;
		}

		public String getLogPaths() {
			return this.logPaths;
		}

		public void setLogPaths(String logPaths) {
			this.logPaths = logPaths;
		}

		public Boolean getCheckAccess() {
			return this.checkAccess;
		}

		public void setCheckAccess(Boolean checkAccess) {
			this.checkAccess = checkAccess;
		}

		public Boolean getClearLog() {
			return this.clearLog;
		}

		public void setClearLog(Boolean clearLog) {
			this.clearLog = clearLog;
		}

		public Boolean getUseDelta() {
			return this.useDelta;
		}

		public void setUseDelta(Boolean useDelta) {
			this.useDelta = useDelta;
		}

		public String getExtraOptions() {
			return this.extraOptions;
		}

		public void setExtraOptions(String extraOptions) {
			this.extraOptions = extraOptions;
		}
	}

	@Override
	public DescribeHanaRestoresResponse getInstance(UnmarshallerContext context) {
		return	DescribeHanaRestoresResponseUnmarshaller.unmarshall(this, context);
	}
}
