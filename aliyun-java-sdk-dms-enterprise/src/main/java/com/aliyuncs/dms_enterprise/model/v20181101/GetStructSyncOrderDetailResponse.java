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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetStructSyncOrderDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStructSyncOrderDetailResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private StructSyncOrderDetail structSyncOrderDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public StructSyncOrderDetail getStructSyncOrderDetail() {
		return this.structSyncOrderDetail;
	}

	public void setStructSyncOrderDetail(StructSyncOrderDetail structSyncOrderDetail) {
		this.structSyncOrderDetail = structSyncOrderDetail;
	}

	public static class StructSyncOrderDetail {

		private String sourceType;

		private String targetType;

		private Boolean ignoreError;

		private List<TableInfo> tableInfoList;

		private SourceDatabaseInfo sourceDatabaseInfo;

		private TargetDatabaseInfo targetDatabaseInfo;

		private SourceVersionInfo sourceVersionInfo;

		private TargetVersionInfo targetVersionInfo;

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public Boolean getIgnoreError() {
			return this.ignoreError;
		}

		public void setIgnoreError(Boolean ignoreError) {
			this.ignoreError = ignoreError;
		}

		public List<TableInfo> getTableInfoList() {
			return this.tableInfoList;
		}

		public void setTableInfoList(List<TableInfo> tableInfoList) {
			this.tableInfoList = tableInfoList;
		}

		public SourceDatabaseInfo getSourceDatabaseInfo() {
			return this.sourceDatabaseInfo;
		}

		public void setSourceDatabaseInfo(SourceDatabaseInfo sourceDatabaseInfo) {
			this.sourceDatabaseInfo = sourceDatabaseInfo;
		}

		public TargetDatabaseInfo getTargetDatabaseInfo() {
			return this.targetDatabaseInfo;
		}

		public void setTargetDatabaseInfo(TargetDatabaseInfo targetDatabaseInfo) {
			this.targetDatabaseInfo = targetDatabaseInfo;
		}

		public SourceVersionInfo getSourceVersionInfo() {
			return this.sourceVersionInfo;
		}

		public void setSourceVersionInfo(SourceVersionInfo sourceVersionInfo) {
			this.sourceVersionInfo = sourceVersionInfo;
		}

		public TargetVersionInfo getTargetVersionInfo() {
			return this.targetVersionInfo;
		}

		public void setTargetVersionInfo(TargetVersionInfo targetVersionInfo) {
			this.targetVersionInfo = targetVersionInfo;
		}

		public static class TableInfo {

			private String sourceTableName;

			private String targetTableName;

			public String getSourceTableName() {
				return this.sourceTableName;
			}

			public void setSourceTableName(String sourceTableName) {
				this.sourceTableName = sourceTableName;
			}

			public String getTargetTableName() {
				return this.targetTableName;
			}

			public void setTargetTableName(String targetTableName) {
				this.targetTableName = targetTableName;
			}
		}

		public static class SourceDatabaseInfo {

			private String searchName;

			private Long dbId;

			private Boolean logic;

			private String envType;

			private String dbType;

			public String getSearchName() {
				return this.searchName;
			}

			public void setSearchName(String searchName) {
				this.searchName = searchName;
			}

			public Long getDbId() {
				return this.dbId;
			}

			public void setDbId(Long dbId) {
				this.dbId = dbId;
			}

			public Boolean getLogic() {
				return this.logic;
			}

			public void setLogic(Boolean logic) {
				this.logic = logic;
			}

			public String getEnvType() {
				return this.envType;
			}

			public void setEnvType(String envType) {
				this.envType = envType;
			}

			public String getDbType() {
				return this.dbType;
			}

			public void setDbType(String dbType) {
				this.dbType = dbType;
			}
		}

		public static class TargetDatabaseInfo {

			private String searchName;

			private Long dbId;

			private Boolean logic;

			private String envType;

			private String dbType;

			public String getSearchName() {
				return this.searchName;
			}

			public void setSearchName(String searchName) {
				this.searchName = searchName;
			}

			public Long getDbId() {
				return this.dbId;
			}

			public void setDbId(Long dbId) {
				this.dbId = dbId;
			}

			public Boolean getLogic() {
				return this.logic;
			}

			public void setLogic(Boolean logic) {
				this.logic = logic;
			}

			public String getEnvType() {
				return this.envType;
			}

			public void setEnvType(String envType) {
				this.envType = envType;
			}

			public String getDbType() {
				return this.dbType;
			}

			public void setDbType(String dbType) {
				this.dbType = dbType;
			}
		}

		public static class SourceVersionInfo {

			private String versionId;

			public String getVersionId() {
				return this.versionId;
			}

			public void setVersionId(String versionId) {
				this.versionId = versionId;
			}
		}

		public static class TargetVersionInfo {

			private String versionId;

			public String getVersionId() {
				return this.versionId;
			}

			public void setVersionId(String versionId) {
				this.versionId = versionId;
			}
		}
	}

	@Override
	public GetStructSyncOrderDetailResponse getInstance(UnmarshallerContext context) {
		return	GetStructSyncOrderDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
