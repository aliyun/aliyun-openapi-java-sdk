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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetTableDBTopologyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTableDBTopologyResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private DBTopology dBTopology;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public DBTopology getDBTopology() {
		return this.dBTopology;
	}

	public void setDBTopology(DBTopology dBTopology) {
		this.dBTopology = dBTopology;
	}

	public static class DBTopology {

		private String tableName;

		private String tableGuid;

		private List<DataSource> dataSourceList;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getTableGuid() {
			return this.tableGuid;
		}

		public void setTableGuid(String tableGuid) {
			this.tableGuid = tableGuid;
		}

		public List<DataSource> getDataSourceList() {
			return this.dataSourceList;
		}

		public void setDataSourceList(List<DataSource> dataSourceList) {
			this.dataSourceList = dataSourceList;
		}

		public static class DataSource {

			private String host;

			private Integer port;

			private String dbType;

			private String sid;

			private List<Database> databaseList;

			public String getHost() {
				return this.host;
			}

			public void setHost(String host) {
				this.host = host;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getDbType() {
				return this.dbType;
			}

			public void setDbType(String dbType) {
				this.dbType = dbType;
			}

			public String getSid() {
				return this.sid;
			}

			public void setSid(String sid) {
				this.sid = sid;
			}

			public List<Database> getDatabaseList() {
				return this.databaseList;
			}

			public void setDatabaseList(List<Database> databaseList) {
				this.databaseList = databaseList;
			}

			public static class Database {

				private String dbName;

				private String dbId;

				private String envType;

				private String dbType;

				private List<Table> tableList;

				public String getDbName() {
					return this.dbName;
				}

				public void setDbName(String dbName) {
					this.dbName = dbName;
				}

				public String getDbId() {
					return this.dbId;
				}

				public void setDbId(String dbId) {
					this.dbId = dbId;
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

				public List<Table> getTableList() {
					return this.tableList;
				}

				public void setTableList(List<Table> tableList) {
					this.tableList = tableList;
				}

				public static class Table {

					private String tableName;

					private String tableId;

					private String tableType;

					public String getTableName() {
						return this.tableName;
					}

					public void setTableName(String tableName) {
						this.tableName = tableName;
					}

					public String getTableId() {
						return this.tableId;
					}

					public void setTableId(String tableId) {
						this.tableId = tableId;
					}

					public String getTableType() {
						return this.tableType;
					}

					public void setTableType(String tableType) {
						this.tableType = tableType;
					}
				}
			}
		}
	}

	@Override
	public GetTableDBTopologyResponse getInstance(UnmarshallerContext context) {
		return	GetTableDBTopologyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
