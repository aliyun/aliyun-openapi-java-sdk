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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetPermApplyOrderDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPermApplyOrderDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private PermApplyOrderDetail permApplyOrderDetail;

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

	public PermApplyOrderDetail getPermApplyOrderDetail() {
		return this.permApplyOrderDetail;
	}

	public void setPermApplyOrderDetail(PermApplyOrderDetail permApplyOrderDetail) {
		this.permApplyOrderDetail = permApplyOrderDetail;
	}

	public static class PermApplyOrderDetail {

		private Long permType;

		private Long seconds;

		private String applyType;

		private List<Resource> resources;

		public Long getPermType() {
			return this.permType;
		}

		public void setPermType(Long permType) {
			this.permType = permType;
		}

		public Long getSeconds() {
			return this.seconds;
		}

		public void setSeconds(Long seconds) {
			this.seconds = seconds;
		}

		public String getApplyType() {
			return this.applyType;
		}

		public void setApplyType(String applyType) {
			this.applyType = applyType;
		}

		public List<Resource> getResources() {
			return this.resources;
		}

		public void setResources(List<Resource> resources) {
			this.resources = resources;
		}

		public static class Resource {

			private DatabaseInfo databaseInfo;

			private TableInfo tableInfo;

			private ColumnInfo columnInfo;

			private InstanceInfo instanceInfo;

			public DatabaseInfo getDatabaseInfo() {
				return this.databaseInfo;
			}

			public void setDatabaseInfo(DatabaseInfo databaseInfo) {
				this.databaseInfo = databaseInfo;
			}

			public TableInfo getTableInfo() {
				return this.tableInfo;
			}

			public void setTableInfo(TableInfo tableInfo) {
				this.tableInfo = tableInfo;
			}

			public ColumnInfo getColumnInfo() {
				return this.columnInfo;
			}

			public void setColumnInfo(ColumnInfo columnInfo) {
				this.columnInfo = columnInfo;
			}

			public InstanceInfo getInstanceInfo() {
				return this.instanceInfo;
			}

			public void setInstanceInfo(InstanceInfo instanceInfo) {
				this.instanceInfo = instanceInfo;
			}

			public static class DatabaseInfo {

				private Long dbId;

				private Boolean logic;

				private String dbType;

				private String searchName;

				private String envType;

				private List<Long> ownerIds;

				private List<String> ownerNickNames;

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

				public String getDbType() {
					return this.dbType;
				}

				public void setDbType(String dbType) {
					this.dbType = dbType;
				}

				public String getSearchName() {
					return this.searchName;
				}

				public void setSearchName(String searchName) {
					this.searchName = searchName;
				}

				public String getEnvType() {
					return this.envType;
				}

				public void setEnvType(String envType) {
					this.envType = envType;
				}

				public List<Long> getOwnerIds() {
					return this.ownerIds;
				}

				public void setOwnerIds(List<Long> ownerIds) {
					this.ownerIds = ownerIds;
				}

				public List<String> getOwnerNickNames() {
					return this.ownerNickNames;
				}

				public void setOwnerNickNames(List<String> ownerNickNames) {
					this.ownerNickNames = ownerNickNames;
				}
			}

			public static class TableInfo {

				private String tableName;

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}
			}

			public static class ColumnInfo {

				private String tableName;

				private String columnName;

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
			}

			public static class InstanceInfo {

				private String instanceId;

				private String searchName;

				private String dbType;

				private String envType;

				private String host;

				private Long port;

				private Long dbaId;

				private String dbaNickName;

				private List<Long> ownerIds1;

				private List<String> ownerNickName;

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getSearchName() {
					return this.searchName;
				}

				public void setSearchName(String searchName) {
					this.searchName = searchName;
				}

				public String getDbType() {
					return this.dbType;
				}

				public void setDbType(String dbType) {
					this.dbType = dbType;
				}

				public String getEnvType() {
					return this.envType;
				}

				public void setEnvType(String envType) {
					this.envType = envType;
				}

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}

				public Long getPort() {
					return this.port;
				}

				public void setPort(Long port) {
					this.port = port;
				}

				public Long getDbaId() {
					return this.dbaId;
				}

				public void setDbaId(Long dbaId) {
					this.dbaId = dbaId;
				}

				public String getDbaNickName() {
					return this.dbaNickName;
				}

				public void setDbaNickName(String dbaNickName) {
					this.dbaNickName = dbaNickName;
				}

				public List<Long> getOwnerIds1() {
					return this.ownerIds1;
				}

				public void setOwnerIds1(List<Long> ownerIds1) {
					this.ownerIds1 = ownerIds1;
				}

				public List<String> getOwnerNickName() {
					return this.ownerNickName;
				}

				public void setOwnerNickName(List<String> ownerNickName) {
					this.ownerNickName = ownerNickName;
				}
			}
		}
	}

	@Override
	public GetPermApplyOrderDetailResponse getInstance(UnmarshallerContext context) {
		return	GetPermApplyOrderDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
