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
import com.aliyuncs.sofa.transform.v20190815.RecognizeODPSchemasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeODPSchemasResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<LogicTablesItem> logicTables;

		private ConnProperties connProperties;

		private Schema schema;

		public List<LogicTablesItem> getLogicTables() {
			return this.logicTables;
		}

		public void setLogicTables(List<LogicTablesItem> logicTables) {
			this.logicTables = logicTables;
		}

		public ConnProperties getConnProperties() {
			return this.connProperties;
		}

		public void setConnProperties(ConnProperties connProperties) {
			this.connProperties = connProperties;
		}

		public Schema getSchema() {
			return this.schema;
		}

		public void setSchema(Schema schema) {
			this.schema = schema;
		}

		public static class LogicTablesItem {

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

		public static class ConnProperties {

			private Boolean allowMinPoolTimeout;

			private Boolean backgroundValidation;

			private Long backgroundValidationMinutes;

			private Long blockingTimeoutMillis;

			private Long idleTimeoutMinutes;

			private Long maxConn;

			private Long minConn;

			private String newConnectionSql;

			private String others;

			private Boolean prefill;

			private Long queryTimeout;

			private Boolean testOnBorrow;

			private String validationQuery;

			private Long validationQueryTimeout;

			public Boolean getAllowMinPoolTimeout() {
				return this.allowMinPoolTimeout;
			}

			public void setAllowMinPoolTimeout(Boolean allowMinPoolTimeout) {
				this.allowMinPoolTimeout = allowMinPoolTimeout;
			}

			public Boolean getBackgroundValidation() {
				return this.backgroundValidation;
			}

			public void setBackgroundValidation(Boolean backgroundValidation) {
				this.backgroundValidation = backgroundValidation;
			}

			public Long getBackgroundValidationMinutes() {
				return this.backgroundValidationMinutes;
			}

			public void setBackgroundValidationMinutes(Long backgroundValidationMinutes) {
				this.backgroundValidationMinutes = backgroundValidationMinutes;
			}

			public Long getBlockingTimeoutMillis() {
				return this.blockingTimeoutMillis;
			}

			public void setBlockingTimeoutMillis(Long blockingTimeoutMillis) {
				this.blockingTimeoutMillis = blockingTimeoutMillis;
			}

			public Long getIdleTimeoutMinutes() {
				return this.idleTimeoutMinutes;
			}

			public void setIdleTimeoutMinutes(Long idleTimeoutMinutes) {
				this.idleTimeoutMinutes = idleTimeoutMinutes;
			}

			public Long getMaxConn() {
				return this.maxConn;
			}

			public void setMaxConn(Long maxConn) {
				this.maxConn = maxConn;
			}

			public Long getMinConn() {
				return this.minConn;
			}

			public void setMinConn(Long minConn) {
				this.minConn = minConn;
			}

			public String getNewConnectionSql() {
				return this.newConnectionSql;
			}

			public void setNewConnectionSql(String newConnectionSql) {
				this.newConnectionSql = newConnectionSql;
			}

			public String getOthers() {
				return this.others;
			}

			public void setOthers(String others) {
				this.others = others;
			}

			public Boolean getPrefill() {
				return this.prefill;
			}

			public void setPrefill(Boolean prefill) {
				this.prefill = prefill;
			}

			public Long getQueryTimeout() {
				return this.queryTimeout;
			}

			public void setQueryTimeout(Long queryTimeout) {
				this.queryTimeout = queryTimeout;
			}

			public Boolean getTestOnBorrow() {
				return this.testOnBorrow;
			}

			public void setTestOnBorrow(Boolean testOnBorrow) {
				this.testOnBorrow = testOnBorrow;
			}

			public String getValidationQuery() {
				return this.validationQuery;
			}

			public void setValidationQuery(String validationQuery) {
				this.validationQuery = validationQuery;
			}

			public Long getValidationQueryTimeout() {
				return this.validationQueryTimeout;
			}

			public void setValidationQueryTimeout(Long validationQueryTimeout) {
				this.validationQueryTimeout = validationQueryTimeout;
			}
		}

		public static class Schema {

			private String appDsName;

			private String appName;

			private Boolean autoCreateSchema;

			private Boolean autoUpdateVersion;

			private String charset;

			private String collation;

			private Long dbNum;

			private String description;

			private Boolean enableDtx;

			private String envMode;

			private String envTenant;

			private String expansionJobId;

			private String expansionStatus;

			private String gmtCreate;

			private String gmtModified;

			private String gmtValid;

			private Long groupCount;

			private Long id;

			private String instanceId;

			private String instanceName;

			private String latestVersion;

			private String logicTableCount;

			private Boolean openReadAndWriteSeparation;

			private String operator;

			private String owner;

			private String parserDbType;

			private String password;

			private Long physicalSchemaCount;

			private Long schemaGroupType;

			private String schemaName;

			private String status;

			private String updateStatus;

			private String version;

			private List<NodeSchemaMappingsItem> nodeSchemaMappings;

			private ServerProps serverProps;

			public String getAppDsName() {
				return this.appDsName;
			}

			public void setAppDsName(String appDsName) {
				this.appDsName = appDsName;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public Boolean getAutoCreateSchema() {
				return this.autoCreateSchema;
			}

			public void setAutoCreateSchema(Boolean autoCreateSchema) {
				this.autoCreateSchema = autoCreateSchema;
			}

			public Boolean getAutoUpdateVersion() {
				return this.autoUpdateVersion;
			}

			public void setAutoUpdateVersion(Boolean autoUpdateVersion) {
				this.autoUpdateVersion = autoUpdateVersion;
			}

			public String getCharset() {
				return this.charset;
			}

			public void setCharset(String charset) {
				this.charset = charset;
			}

			public String getCollation() {
				return this.collation;
			}

			public void setCollation(String collation) {
				this.collation = collation;
			}

			public Long getDbNum() {
				return this.dbNum;
			}

			public void setDbNum(Long dbNum) {
				this.dbNum = dbNum;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Boolean getEnableDtx() {
				return this.enableDtx;
			}

			public void setEnableDtx(Boolean enableDtx) {
				this.enableDtx = enableDtx;
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

			public String getExpansionJobId() {
				return this.expansionJobId;
			}

			public void setExpansionJobId(String expansionJobId) {
				this.expansionJobId = expansionJobId;
			}

			public String getExpansionStatus() {
				return this.expansionStatus;
			}

			public void setExpansionStatus(String expansionStatus) {
				this.expansionStatus = expansionStatus;
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

			public String getGmtValid() {
				return this.gmtValid;
			}

			public void setGmtValid(String gmtValid) {
				this.gmtValid = gmtValid;
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

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getLatestVersion() {
				return this.latestVersion;
			}

			public void setLatestVersion(String latestVersion) {
				this.latestVersion = latestVersion;
			}

			public String getLogicTableCount() {
				return this.logicTableCount;
			}

			public void setLogicTableCount(String logicTableCount) {
				this.logicTableCount = logicTableCount;
			}

			public Boolean getOpenReadAndWriteSeparation() {
				return this.openReadAndWriteSeparation;
			}

			public void setOpenReadAndWriteSeparation(Boolean openReadAndWriteSeparation) {
				this.openReadAndWriteSeparation = openReadAndWriteSeparation;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getParserDbType() {
				return this.parserDbType;
			}

			public void setParserDbType(String parserDbType) {
				this.parserDbType = parserDbType;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public Long getPhysicalSchemaCount() {
				return this.physicalSchemaCount;
			}

			public void setPhysicalSchemaCount(Long physicalSchemaCount) {
				this.physicalSchemaCount = physicalSchemaCount;
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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getUpdateStatus() {
				return this.updateStatus;
			}

			public void setUpdateStatus(String updateStatus) {
				this.updateStatus = updateStatus;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public List<NodeSchemaMappingsItem> getNodeSchemaMappings() {
				return this.nodeSchemaMappings;
			}

			public void setNodeSchemaMappings(List<NodeSchemaMappingsItem> nodeSchemaMappings) {
				this.nodeSchemaMappings = nodeSchemaMappings;
			}

			public ServerProps getServerProps() {
				return this.serverProps;
			}

			public void setServerProps(ServerProps serverProps) {
				this.serverProps = serverProps;
			}

			public static class NodeSchemaMappingsItem {

				private String nodeId;

				private String physicalPassword;

				private String physicalUsername;

				private String powerfulPassword;

				private String powerfulUsername;

				private Long schemaCount;

				private String schemaPattern;

				public String getNodeId() {
					return this.nodeId;
				}

				public void setNodeId(String nodeId) {
					this.nodeId = nodeId;
				}

				public String getPhysicalPassword() {
					return this.physicalPassword;
				}

				public void setPhysicalPassword(String physicalPassword) {
					this.physicalPassword = physicalPassword;
				}

				public String getPhysicalUsername() {
					return this.physicalUsername;
				}

				public void setPhysicalUsername(String physicalUsername) {
					this.physicalUsername = physicalUsername;
				}

				public String getPowerfulPassword() {
					return this.powerfulPassword;
				}

				public void setPowerfulPassword(String powerfulPassword) {
					this.powerfulPassword = powerfulPassword;
				}

				public String getPowerfulUsername() {
					return this.powerfulUsername;
				}

				public void setPowerfulUsername(String powerfulUsername) {
					this.powerfulUsername = powerfulUsername;
				}

				public Long getSchemaCount() {
					return this.schemaCount;
				}

				public void setSchemaCount(Long schemaCount) {
					this.schemaCount = schemaCount;
				}

				public String getSchemaPattern() {
					return this.schemaPattern;
				}

				public void setSchemaPattern(String schemaPattern) {
					this.schemaPattern = schemaPattern;
				}
			}

			public static class ServerProps {

				private Long backendMaxConn;

				private String envMode;

				private String envTenant;

				private Long frontendIdleTimeout;

				private Long frontendSlaLatency;

				private Long frontendSlaTps;

				private String gmtCreate;

				private String gmtModified;

				private String schemaName;

				public Long getBackendMaxConn() {
					return this.backendMaxConn;
				}

				public void setBackendMaxConn(Long backendMaxConn) {
					this.backendMaxConn = backendMaxConn;
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

				public Long getFrontendIdleTimeout() {
					return this.frontendIdleTimeout;
				}

				public void setFrontendIdleTimeout(Long frontendIdleTimeout) {
					this.frontendIdleTimeout = frontendIdleTimeout;
				}

				public Long getFrontendSlaLatency() {
					return this.frontendSlaLatency;
				}

				public void setFrontendSlaLatency(Long frontendSlaLatency) {
					this.frontendSlaLatency = frontendSlaLatency;
				}

				public Long getFrontendSlaTps() {
					return this.frontendSlaTps;
				}

				public void setFrontendSlaTps(Long frontendSlaTps) {
					this.frontendSlaTps = frontendSlaTps;
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

				public String getSchemaName() {
					return this.schemaName;
				}

				public void setSchemaName(String schemaName) {
					this.schemaName = schemaName;
				}
			}
		}
	}

	@Override
	public RecognizeODPSchemasResponse getInstance(UnmarshallerContext context) {
		return	RecognizeODPSchemasResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
