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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetTableTopologyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTableTopologyResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private TableTopology tableTopology;

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

	public TableTopology getTableTopology() {
		return this.tableTopology;
	}

	public void setTableTopology(TableTopology tableTopology) {
		this.tableTopology = tableTopology;
	}

	public static class TableTopology {

		private String tableName;

		private String tableGuid;

		private Boolean logic;

		private List<TableTopologyInfo> tableTopologyInfoList;

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

		public Boolean getLogic() {
			return this.logic;
		}

		public void setLogic(Boolean logic) {
			this.logic = logic;
		}

		public List<TableTopologyInfo> getTableTopologyInfoList() {
			return this.tableTopologyInfoList;
		}

		public void setTableTopologyInfoList(List<TableTopologyInfo> tableTopologyInfoList) {
			this.tableTopologyInfoList = tableTopologyInfoList;
		}

		public static class TableTopologyInfo {

			private String tableNameExpr;

			private String dbSearchName;

			private String instanceSource;

			private String instanceResourceId;

			private Long instanceId;

			private String tableNameList;

			private Long tableCount;

			private Long dbId;

			private String dbName;

			private String regionId;

			private String dbType;

			public String getTableNameExpr() {
				return this.tableNameExpr;
			}

			public void setTableNameExpr(String tableNameExpr) {
				this.tableNameExpr = tableNameExpr;
			}

			public String getDbSearchName() {
				return this.dbSearchName;
			}

			public void setDbSearchName(String dbSearchName) {
				this.dbSearchName = dbSearchName;
			}

			public String getInstanceSource() {
				return this.instanceSource;
			}

			public void setInstanceSource(String instanceSource) {
				this.instanceSource = instanceSource;
			}

			public String getInstanceResourceId() {
				return this.instanceResourceId;
			}

			public void setInstanceResourceId(String instanceResourceId) {
				this.instanceResourceId = instanceResourceId;
			}

			public Long getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(Long instanceId) {
				this.instanceId = instanceId;
			}

			public String getTableNameList() {
				return this.tableNameList;
			}

			public void setTableNameList(String tableNameList) {
				this.tableNameList = tableNameList;
			}

			public Long getTableCount() {
				return this.tableCount;
			}

			public void setTableCount(Long tableCount) {
				this.tableCount = tableCount;
			}

			public Long getDbId() {
				return this.dbId;
			}

			public void setDbId(Long dbId) {
				this.dbId = dbId;
			}

			public String getDbName() {
				return this.dbName;
			}

			public void setDbName(String dbName) {
				this.dbName = dbName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getDbType() {
				return this.dbType;
			}

			public void setDbType(String dbType) {
				this.dbType = dbType;
			}
		}
	}

	@Override
	public GetTableTopologyResponse getInstance(UnmarshallerContext context) {
		return	GetTableTopologyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
