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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetDBTopologyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDBTopologyResponse extends AcsResponse {

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

		private Long logicDbId;

		private String logicDbName;

		private String searchName;

		private String alias;

		private String dbType;

		private String envType;

		private List<DBTopologyInfo> dBTopologyInfoList;

		public Long getLogicDbId() {
			return this.logicDbId;
		}

		public void setLogicDbId(Long logicDbId) {
			this.logicDbId = logicDbId;
		}

		public String getLogicDbName() {
			return this.logicDbName;
		}

		public void setLogicDbName(String logicDbName) {
			this.logicDbName = logicDbName;
		}

		public String getSearchName() {
			return this.searchName;
		}

		public void setSearchName(String searchName) {
			this.searchName = searchName;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
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

		public List<DBTopologyInfo> getDBTopologyInfoList() {
			return this.dBTopologyInfoList;
		}

		public void setDBTopologyInfoList(List<DBTopologyInfo> dBTopologyInfoList) {
			this.dBTopologyInfoList = dBTopologyInfoList;
		}

		public static class DBTopologyInfo {

			private Long dbId;

			private String schemaName;

			private String catalogName;

			private String searchName;

			private String dbType;

			private String envType;

			private Long instanceId;

			private String regionId;

			private String instanceResourceId;

			private String instanceSource;

			public Long getDbId() {
				return this.dbId;
			}

			public void setDbId(Long dbId) {
				this.dbId = dbId;
			}

			public String getSchemaName() {
				return this.schemaName;
			}

			public void setSchemaName(String schemaName) {
				this.schemaName = schemaName;
			}

			public String getCatalogName() {
				return this.catalogName;
			}

			public void setCatalogName(String catalogName) {
				this.catalogName = catalogName;
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

			public Long getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(Long instanceId) {
				this.instanceId = instanceId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getInstanceResourceId() {
				return this.instanceResourceId;
			}

			public void setInstanceResourceId(String instanceResourceId) {
				this.instanceResourceId = instanceResourceId;
			}

			public String getInstanceSource() {
				return this.instanceSource;
			}

			public void setInstanceSource(String instanceSource) {
				this.instanceSource = instanceSource;
			}
		}
	}

	@Override
	public GetDBTopologyResponse getInstance(UnmarshallerContext context) {
		return	GetDBTopologyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
