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
import com.aliyuncs.sas.transform.v20181203.DescribeBackupMachineStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupMachineStatusResponse extends AcsResponse {

	private String requestId;

	private BackupMachineStatus backupMachineStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public BackupMachineStatus getBackupMachineStatus() {
		return this.backupMachineStatus;
	}

	public void setBackupMachineStatus(BackupMachineStatus backupMachineStatus) {
		this.backupMachineStatus = backupMachineStatus;
	}

	public static class BackupMachineStatus {

		private String status;

		private String uuid;

		private String vaultId;

		private String errorCode;

		private Integer savedBackupCount;

		private String instanceId;

		private String clientStatus;

		private String regionId;

		private String clientVersion;

		private String clientId;

		private List<BackupErrorMsg> errorList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public Integer getSavedBackupCount() {
			return this.savedBackupCount;
		}

		public void setSavedBackupCount(Integer savedBackupCount) {
			this.savedBackupCount = savedBackupCount;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getClientStatus() {
			return this.clientStatus;
		}

		public void setClientStatus(String clientStatus) {
			this.clientStatus = clientStatus;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getClientVersion() {
			return this.clientVersion;
		}

		public void setClientVersion(String clientVersion) {
			this.clientVersion = clientVersion;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public List<BackupErrorMsg> getErrorList() {
			return this.errorList;
		}

		public void setErrorList(List<BackupErrorMsg> errorList) {
			this.errorList = errorList;
		}

		public static class BackupErrorMsg {

			private String key;

			private String errorFile;

			private String requestId;

			private String errorFileUrl;

			private String errorCode;

			private String errorStatus;

			private String path;

			private String errorMsg;

			private String errorType;

			private Long errorTime;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getErrorFile() {
				return this.errorFile;
			}

			public void setErrorFile(String errorFile) {
				this.errorFile = errorFile;
			}

			public String getRequestId() {
				return this.requestId;
			}

			public void setRequestId(String requestId) {
				this.requestId = requestId;
			}

			public String getErrorFileUrl() {
				return this.errorFileUrl;
			}

			public void setErrorFileUrl(String errorFileUrl) {
				this.errorFileUrl = errorFileUrl;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getErrorStatus() {
				return this.errorStatus;
			}

			public void setErrorStatus(String errorStatus) {
				this.errorStatus = errorStatus;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getErrorMsg() {
				return this.errorMsg;
			}

			public void setErrorMsg(String errorMsg) {
				this.errorMsg = errorMsg;
			}

			public String getErrorType() {
				return this.errorType;
			}

			public void setErrorType(String errorType) {
				this.errorType = errorType;
			}

			public Long getErrorTime() {
				return this.errorTime;
			}

			public void setErrorTime(Long errorTime) {
				this.errorTime = errorTime;
			}
		}
	}

	@Override
	public DescribeBackupMachineStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupMachineStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
