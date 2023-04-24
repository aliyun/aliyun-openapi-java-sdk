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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetDatabaseExportOrderDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDatabaseExportOrderDetailResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private DatabaseExportOrderDetail databaseExportOrderDetail;

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

	public DatabaseExportOrderDetail getDatabaseExportOrderDetail() {
		return this.databaseExportOrderDetail;
	}

	public void setDatabaseExportOrderDetail(DatabaseExportOrderDetail databaseExportOrderDetail) {
		this.databaseExportOrderDetail = databaseExportOrderDetail;
	}

	public static class DatabaseExportOrderDetail {

		private Long id;

		private String committer;

		private String committerId;

		private String comment;

		private String searchName;

		private String statusDesc;

		private String workflowStatusDesc;

		private String log;

		private KeyInfo keyInfo;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCommitter() {
			return this.committer;
		}

		public void setCommitter(String committer) {
			this.committer = committer;
		}

		public String getCommitterId() {
			return this.committerId;
		}

		public void setCommitterId(String committerId) {
			this.committerId = committerId;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getSearchName() {
			return this.searchName;
		}

		public void setSearchName(String searchName) {
			this.searchName = searchName;
		}

		public String getStatusDesc() {
			return this.statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}

		public String getWorkflowStatusDesc() {
			return this.workflowStatusDesc;
		}

		public void setWorkflowStatusDesc(String workflowStatusDesc) {
			this.workflowStatusDesc = workflowStatusDesc;
		}

		public String getLog() {
			return this.log;
		}

		public void setLog(String log) {
			this.log = log;
		}

		public KeyInfo getKeyInfo() {
			return this.keyInfo;
		}

		public void setKeyInfo(KeyInfo keyInfo) {
			this.keyInfo = keyInfo;
		}

		public static class KeyInfo {

			private Long dbId;

			private String downloadURL;

			private String auditDate;

			private Config config;

			public Long getDbId() {
				return this.dbId;
			}

			public void setDbId(Long dbId) {
				this.dbId = dbId;
			}

			public String getDownloadURL() {
				return this.downloadURL;
			}

			public void setDownloadURL(String downloadURL) {
				this.downloadURL = downloadURL;
			}

			public String getAuditDate() {
				return this.auditDate;
			}

			public void setAuditDate(String auditDate) {
				this.auditDate = auditDate;
			}

			public Config getConfig() {
				return this.config;
			}

			public void setConfig(Config config) {
				this.config = config;
			}

			public static class Config {

				private String dbName;

				private String exportContent;

				private String targetOption;

				private List<String> exportTypes;

				private List<String> selectedTables;

				private List<String> sQLExtOption;

				public String getDbName() {
					return this.dbName;
				}

				public void setDbName(String dbName) {
					this.dbName = dbName;
				}

				public String getExportContent() {
					return this.exportContent;
				}

				public void setExportContent(String exportContent) {
					this.exportContent = exportContent;
				}

				public String getTargetOption() {
					return this.targetOption;
				}

				public void setTargetOption(String targetOption) {
					this.targetOption = targetOption;
				}

				public List<String> getExportTypes() {
					return this.exportTypes;
				}

				public void setExportTypes(List<String> exportTypes) {
					this.exportTypes = exportTypes;
				}

				public List<String> getSelectedTables() {
					return this.selectedTables;
				}

				public void setSelectedTables(List<String> selectedTables) {
					this.selectedTables = selectedTables;
				}

				public List<String> getSQLExtOption() {
					return this.sQLExtOption;
				}

				public void setSQLExtOption(List<String> sQLExtOption) {
					this.sQLExtOption = sQLExtOption;
				}
			}
		}
	}

	@Override
	public GetDatabaseExportOrderDetailResponse getInstance(UnmarshallerContext context) {
		return	GetDatabaseExportOrderDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
