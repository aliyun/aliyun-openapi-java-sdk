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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.BatchqueryODPSchemasLogicTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchqueryODPSchemasLogicTablesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Boolean broadcastTable;

		private Boolean createTableNow;

		private String envMode;

		private String envTenant;

		private String gmtCreate;

		private String gmtModified;

		private Long groupCount;

		private Long id;

		private String instanceId;

		private Long schemaGroupType;

		private String schemaName;

		private Boolean singleTable;

		private String sqlText;

		private Long tableCount;

		private String tableName;

		private String tbSuffix;

		private String tbSuffixPadding;

		private List<DbRulesItem> dbRules;

		private List<RulesItem> rules;

		public Boolean getBroadcastTable() {
			return this.broadcastTable;
		}

		public void setBroadcastTable(Boolean broadcastTable) {
			this.broadcastTable = broadcastTable;
		}

		public Boolean getCreateTableNow() {
			return this.createTableNow;
		}

		public void setCreateTableNow(Boolean createTableNow) {
			this.createTableNow = createTableNow;
		}

		public String getEnvMode() {
			return this.envMode;
		}

		public void setEnvMode(String envMode) {
			this.envMode = envMode;
		}

		public String getEnvTenant() {
			return this.envTenant;
		}

		public void setEnvTenant(String envTenant) {
			this.envTenant = envTenant;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getGroupCount() {
			return this.groupCount;
		}

		public void setGroupCount(Long groupCount) {
			this.groupCount = groupCount;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getSchemaGroupType() {
			return this.schemaGroupType;
		}

		public void setSchemaGroupType(Long schemaGroupType) {
			this.schemaGroupType = schemaGroupType;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public Boolean getSingleTable() {
			return this.singleTable;
		}

		public void setSingleTable(Boolean singleTable) {
			this.singleTable = singleTable;
		}

		public String getSqlText() {
			return this.sqlText;
		}

		public void setSqlText(String sqlText) {
			this.sqlText = sqlText;
		}

		public Long getTableCount() {
			return this.tableCount;
		}

		public void setTableCount(Long tableCount) {
			this.tableCount = tableCount;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getTbSuffix() {
			return this.tbSuffix;
		}

		public void setTbSuffix(String tbSuffix) {
			this.tbSuffix = tbSuffix;
		}

		public String getTbSuffixPadding() {
			return this.tbSuffixPadding;
		}

		public void setTbSuffixPadding(String tbSuffixPadding) {
			this.tbSuffixPadding = tbSuffixPadding;
		}

		public List<DbRulesItem> getDbRules() {
			return this.dbRules;
		}

		public void setDbRules(List<DbRulesItem> dbRules) {
			this.dbRules = dbRules;
		}

		public List<RulesItem> getRules() {
			return this.rules;
		}

		public void setRules(List<RulesItem> rules) {
			this.rules = rules;
		}

		public static class DbRulesItem {

			private Boolean customized;

			private String field;

			private String text;

			private String value;

			public Boolean getCustomized() {
				return this.customized;
			}

			public void setCustomized(Boolean customized) {
				this.customized = customized;
			}

			public String getField() {
				return this.field;
			}

			public void setField(String field) {
				this.field = field;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class RulesItem {

			private Boolean customized;

			private String field;

			private String text;

			private String value;

			public Boolean getCustomized() {
				return this.customized;
			}

			public void setCustomized(Boolean customized) {
				this.customized = customized;
			}

			public String getField() {
				return this.field;
			}

			public void setField(String field) {
				this.field = field;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public BatchqueryODPSchemasLogicTablesResponse getInstance(UnmarshallerContext context) {
		return	BatchqueryODPSchemasLogicTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
