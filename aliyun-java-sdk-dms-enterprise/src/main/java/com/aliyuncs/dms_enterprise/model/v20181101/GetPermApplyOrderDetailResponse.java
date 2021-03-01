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

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private PermApplyOrderDetail permApplyOrderDetail;

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

	public PermApplyOrderDetail getPermApplyOrderDetail() {
		return this.permApplyOrderDetail;
	}

	public void setPermApplyOrderDetail(PermApplyOrderDetail permApplyOrderDetail) {
		this.permApplyOrderDetail = permApplyOrderDetail;
	}

	public static class PermApplyOrderDetail {

		private String applyType;

		private Long permType;

		private Long seconds;

		private List<Resource> resources;

		public String getApplyType() {
			return this.applyType;
		}

		public void setApplyType(String applyType) {
			this.applyType = applyType;
		}

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

		public List<Resource> getResources() {
			return this.resources;
		}

		public void setResources(List<Resource> resources) {
			this.resources = resources;
		}

		public static class Resource {

			private DatabaseInfo databaseInfo;

			private ColumnInfo columnInfo;

			private TableInfo tableInfo;

			private InstanceInfo instanceInfo;

			public DatabaseInfo getDatabaseInfo() {
				return this.databaseInfo;
			}

			public void setDatabaseInfo(DatabaseInfo databaseInfo) {
				this.databaseInfo = databaseInfo;
			}

			public ColumnInfo getColumnInfo() {
				return this.columnInfo;
			}

			public void setColumnInfo(ColumnInfo columnInfo) {
				this.columnInfo = columnInfo;
			}

			public TableInfo getTableInfo() {
				return this.tableInfo;
			}

			public void setTableInfo(TableInfo tableInfo) {
				this.tableInfo = tableInfo;
			}

			public InstanceInfo getInstanceInfo() {
				return this.instanceInfo;
			}

			public void setInstanceInfo(InstanceInfo instanceInfo) {
				this.instanceInfo = instanceInfo;
			}

			public static class DatabaseInfo {

				private String searchName;

				private Long dbId;

				private Boolean logic;

				private String envType;

				private String dbType;

				private List<String> ownerNickNames;

				private List<Long> ownerIds;

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

				public List<String> getOwnerNickNames() {
					return this.ownerNickNames;
				}

				public void setOwnerNickNames(List<String> ownerNickNames) {
					this.ownerNickNames = ownerNickNames;
				}

				public List<Long> getOwnerIds() {
					return this.ownerIds;
				}

				public void setOwnerIds(List<Long> ownerIds) {
					this.ownerIds = ownerIds;
				}
			}

			public static class ColumnInfo {

				private String columnName;

				private String tableName;

				public String getColumnName() {
					return this.columnName;
				}

				public void setColumnName(String columnName) {
					this.columnName = columnName;
				}

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
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

			public static class InstanceInfo {

				private Long dbaId;

				private String searchName;

				private String instanceId;

				private Long port;

				private String host;

				private String dbaNickName;

				private String envType;

				private String dbType;

				private List<String> ownerNickName;

				private List<Long> ownerIds1;

				public Long getDbaId() {
					return this.dbaId;
				}

				public void setDbaId(Long dbaId) {
					this.dbaId = dbaId;
				}

				public String getSearchName() {
					return this.searchName;
				}

				public void setSearchName(String searchName) {
					this.searchName = searchName;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public Long getPort() {
					return this.port;
				}

				public void setPort(Long port) {
					this.port = port;
				}

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}

				public String getDbaNickName() {
					return this.dbaNickName;
				}

				public void setDbaNickName(String dbaNickName) {
					this.dbaNickName = dbaNickName;
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

				public List<String> getOwnerNickName() {
					return this.ownerNickName;
				}

				public void setOwnerNickName(List<String> ownerNickName) {
					this.ownerNickName = ownerNickName;
				}

				public List<Long> getOwnerIds1() {
					return this.ownerIds1;
				}

				public void setOwnerIds1(List<Long> ownerIds1) {
					this.ownerIds1 = ownerIds1;
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
