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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeBackupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private Long fullStorageSize;

	private Long logStorageSize;

	private Long freeSize;

	private List<Backup> backups;

	private AccessDeniedDetail accessDeniedDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Long getFullStorageSize() {
		return this.fullStorageSize;
	}

	public void setFullStorageSize(Long fullStorageSize) {
		this.fullStorageSize = fullStorageSize;
	}

	public Long getLogStorageSize() {
		return this.logStorageSize;
	}

	public void setLogStorageSize(Long logStorageSize) {
		this.logStorageSize = logStorageSize;
	}

	public Long getFreeSize() {
		return this.freeSize;
	}

	public void setFreeSize(Long freeSize) {
		this.freeSize = freeSize;
	}

	public List<Backup> getBackups() {
		return this.backups;
	}

	public void setBackups(List<Backup> backups) {
		this.backups = backups;
	}

	public AccessDeniedDetail getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public static class Backup {

		private String backupStatus;

		private String backupStartTime;

		private String backupType;

		private String backupDownloadURL;

		private String nodeInstanceId;

		private String backupEndTime;

		private Long backupId;

		private String backupDBNames;

		private String engineVersion;

		private String backupIntranetDownloadURL;

		private Long backupSize;

		private String backupMode;

		private String backupMethod;

		private Long backupJobID;

		private String recoverConfigMode;

		public String getBackupStatus() {
			return this.backupStatus;
		}

		public void setBackupStatus(String backupStatus) {
			this.backupStatus = backupStatus;
		}

		public String getBackupStartTime() {
			return this.backupStartTime;
		}

		public void setBackupStartTime(String backupStartTime) {
			this.backupStartTime = backupStartTime;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getBackupDownloadURL() {
			return this.backupDownloadURL;
		}

		public void setBackupDownloadURL(String backupDownloadURL) {
			this.backupDownloadURL = backupDownloadURL;
		}

		public String getNodeInstanceId() {
			return this.nodeInstanceId;
		}

		public void setNodeInstanceId(String nodeInstanceId) {
			this.nodeInstanceId = nodeInstanceId;
		}

		public String getBackupEndTime() {
			return this.backupEndTime;
		}

		public void setBackupEndTime(String backupEndTime) {
			this.backupEndTime = backupEndTime;
		}

		public Long getBackupId() {
			return this.backupId;
		}

		public void setBackupId(Long backupId) {
			this.backupId = backupId;
		}

		public String getBackupDBNames() {
			return this.backupDBNames;
		}

		public void setBackupDBNames(String backupDBNames) {
			this.backupDBNames = backupDBNames;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getBackupIntranetDownloadURL() {
			return this.backupIntranetDownloadURL;
		}

		public void setBackupIntranetDownloadURL(String backupIntranetDownloadURL) {
			this.backupIntranetDownloadURL = backupIntranetDownloadURL;
		}

		public Long getBackupSize() {
			return this.backupSize;
		}

		public void setBackupSize(Long backupSize) {
			this.backupSize = backupSize;
		}

		public String getBackupMode() {
			return this.backupMode;
		}

		public void setBackupMode(String backupMode) {
			this.backupMode = backupMode;
		}

		public String getBackupMethod() {
			return this.backupMethod;
		}

		public void setBackupMethod(String backupMethod) {
			this.backupMethod = backupMethod;
		}

		public Long getBackupJobID() {
			return this.backupJobID;
		}

		public void setBackupJobID(Long backupJobID) {
			this.backupJobID = backupJobID;
		}

		public String getRecoverConfigMode() {
			return this.recoverConfigMode;
		}

		public void setRecoverConfigMode(String recoverConfigMode) {
			this.recoverConfigMode = recoverConfigMode;
		}
	}

	public static class AccessDeniedDetail {

		private String authAction;

		private String authPrincipalDisplayName;

		private String authPrincipalOwnerId;

		private String authPrincipalType;

		private String encodedDiagnosticMessage;

		private String noPermissionType;

		private String policyType;

		public String getAuthAction() {
			return this.authAction;
		}

		public void setAuthAction(String authAction) {
			this.authAction = authAction;
		}

		public String getAuthPrincipalDisplayName() {
			return this.authPrincipalDisplayName;
		}

		public void setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
			this.authPrincipalDisplayName = authPrincipalDisplayName;
		}

		public String getAuthPrincipalOwnerId() {
			return this.authPrincipalOwnerId;
		}

		public void setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
			this.authPrincipalOwnerId = authPrincipalOwnerId;
		}

		public String getAuthPrincipalType() {
			return this.authPrincipalType;
		}

		public void setAuthPrincipalType(String authPrincipalType) {
			this.authPrincipalType = authPrincipalType;
		}

		public String getEncodedDiagnosticMessage() {
			return this.encodedDiagnosticMessage;
		}

		public void setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
			this.encodedDiagnosticMessage = encodedDiagnosticMessage;
		}

		public String getNoPermissionType() {
			return this.noPermissionType;
		}

		public void setNoPermissionType(String noPermissionType) {
			this.noPermissionType = noPermissionType;
		}

		public String getPolicyType() {
			return this.policyType;
		}

		public void setPolicyType(String policyType) {
			this.policyType = policyType;
		}
	}

	@Override
	public DescribeBackupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupsResponseUnmarshaller.unmarshall(this, context);
	}
}
