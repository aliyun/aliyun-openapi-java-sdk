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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeDataBackupSetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataBackupSetResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<DataItem> data;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String endTime;

		private String status;

		private String type;

		private String startTime;

		private Integer dataSize;

		private String policy;

		private String setId;

		private String method;

		private String checkpoint;

		private Integer dataVersion;

		private String backupObjectType;

		private String downloadTaskStatus;

		private Long downloadTaskId;

		private String validity;

		private String progress;

		private String storageClass;

		private List<BackupObjectsItem> backupObjects;

		private List<BackupResultsItem> backupResults;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Integer getDataSize() {
			return this.dataSize;
		}

		public void setDataSize(Integer dataSize) {
			this.dataSize = dataSize;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getSetId() {
			return this.setId;
		}

		public void setSetId(String setId) {
			this.setId = setId;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		public String getCheckpoint() {
			return this.checkpoint;
		}

		public void setCheckpoint(String checkpoint) {
			this.checkpoint = checkpoint;
		}

		public Integer getDataVersion() {
			return this.dataVersion;
		}

		public void setDataVersion(Integer dataVersion) {
			this.dataVersion = dataVersion;
		}

		public String getBackupObjectType() {
			return this.backupObjectType;
		}

		public void setBackupObjectType(String backupObjectType) {
			this.backupObjectType = backupObjectType;
		}

		public String getDownloadTaskStatus() {
			return this.downloadTaskStatus;
		}

		public void setDownloadTaskStatus(String downloadTaskStatus) {
			this.downloadTaskStatus = downloadTaskStatus;
		}

		public Long getDownloadTaskId() {
			return this.downloadTaskId;
		}

		public void setDownloadTaskId(Long downloadTaskId) {
			this.downloadTaskId = downloadTaskId;
		}

		public String getValidity() {
			return this.validity;
		}

		public void setValidity(String validity) {
			this.validity = validity;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getStorageClass() {
			return this.storageClass;
		}

		public void setStorageClass(String storageClass) {
			this.storageClass = storageClass;
		}

		public List<BackupObjectsItem> getBackupObjects() {
			return this.backupObjects;
		}

		public void setBackupObjects(List<BackupObjectsItem> backupObjects) {
			this.backupObjects = backupObjects;
		}

		public List<BackupResultsItem> getBackupResults() {
			return this.backupResults;
		}

		public void setBackupResults(List<BackupResultsItem> backupResults) {
			this.backupResults = backupResults;
		}

		public static class BackupObjectsItem {

			private String clusterName;

			private String tenantName;

			private List<DatabaseTablesListItem> databaseTablesList;

			public String getClusterName() {
				return this.clusterName;
			}

			public void setClusterName(String clusterName) {
				this.clusterName = clusterName;
			}

			public String getTenantName() {
				return this.tenantName;
			}

			public void setTenantName(String tenantName) {
				this.tenantName = tenantName;
			}

			public List<DatabaseTablesListItem> getDatabaseTablesList() {
				return this.databaseTablesList;
			}

			public void setDatabaseTablesList(List<DatabaseTablesListItem> databaseTablesList) {
				this.databaseTablesList = databaseTablesList;
			}

			public static class DatabaseTablesListItem {

				private String database;

				private List<String> tables;

				public String getDatabase() {
					return this.database;
				}

				public void setDatabase(String database) {
					this.database = database;
				}

				public List<String> getTables() {
					return this.tables;
				}

				public void setTables(List<String> tables) {
					this.tables = tables;
				}
			}
		}

		public static class BackupResultsItem {

			private String clusterName;

			private String tenantName;

			private List<TableBackupResultsItem> tableBackupResults;

			public String getClusterName() {
				return this.clusterName;
			}

			public void setClusterName(String clusterName) {
				this.clusterName = clusterName;
			}

			public String getTenantName() {
				return this.tenantName;
			}

			public void setTenantName(String tenantName) {
				this.tenantName = tenantName;
			}

			public List<TableBackupResultsItem> getTableBackupResults() {
				return this.tableBackupResults;
			}

			public void setTableBackupResults(List<TableBackupResultsItem> tableBackupResults) {
				this.tableBackupResults = tableBackupResults;
			}

			public static class TableBackupResultsItem {

				private String database;

				private String table;

				private String status;

				private String message;

				public String getDatabase() {
					return this.database;
				}

				public void setDatabase(String database) {
					this.database = database;
				}

				public String getTable() {
					return this.table;
				}

				public void setTable(String table) {
					this.table = table;
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
			}
		}
	}

	@Override
	public DescribeDataBackupSetResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataBackupSetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
