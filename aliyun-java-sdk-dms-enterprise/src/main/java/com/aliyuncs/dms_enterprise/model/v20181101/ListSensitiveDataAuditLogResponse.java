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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListSensitiveDataAuditLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSensitiveDataAuditLogResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<SensitiveDataAuditLogListItem> sensitiveDataAuditLogList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<SensitiveDataAuditLogListItem> getSensitiveDataAuditLogList() {
		return this.sensitiveDataAuditLogList;
	}

	public void setSensitiveDataAuditLogList(List<SensitiveDataAuditLogListItem> sensitiveDataAuditLogList) {
		this.sensitiveDataAuditLogList = sensitiveDataAuditLogList;
	}

	public static class SensitiveDataAuditLogListItem {

		private String userName;

		private Long userId;

		private String moduleName;

		private String dbDisplayName;

		private String opTime;

		private Long instanceId;

		private String targetName;

		private List<SensitiveDataLogItem> sensitiveDataLog;

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getModuleName() {
			return this.moduleName;
		}

		public void setModuleName(String moduleName) {
			this.moduleName = moduleName;
		}

		public String getDbDisplayName() {
			return this.dbDisplayName;
		}

		public void setDbDisplayName(String dbDisplayName) {
			this.dbDisplayName = dbDisplayName;
		}

		public String getOpTime() {
			return this.opTime;
		}

		public void setOpTime(String opTime) {
			this.opTime = opTime;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public String getTargetName() {
			return this.targetName;
		}

		public void setTargetName(String targetName) {
			this.targetName = targetName;
		}

		public List<SensitiveDataLogItem> getSensitiveDataLog() {
			return this.sensitiveDataLog;
		}

		public void setSensitiveDataLog(List<SensitiveDataLogItem> sensitiveDataLog) {
			this.sensitiveDataLog = sensitiveDataLog;
		}

		public static class SensitiveDataLogItem {

			private String tableName;

			private String columnName;

			private String securityLevel;

			private String columnPermissionType;

			private String desensitizationRule;

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getColumnName() {
				return this.columnName;
			}

			public void setColumnName(String columnName) {
				this.columnName = columnName;
			}

			public String getSecurityLevel() {
				return this.securityLevel;
			}

			public void setSecurityLevel(String securityLevel) {
				this.securityLevel = securityLevel;
			}

			public String getColumnPermissionType() {
				return this.columnPermissionType;
			}

			public void setColumnPermissionType(String columnPermissionType) {
				this.columnPermissionType = columnPermissionType;
			}

			public String getDesensitizationRule() {
				return this.desensitizationRule;
			}

			public void setDesensitizationRule(String desensitizationRule) {
				this.desensitizationRule = desensitizationRule;
			}
		}
	}

	@Override
	public ListSensitiveDataAuditLogResponse getInstance(UnmarshallerContext context) {
		return	ListSensitiveDataAuditLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
