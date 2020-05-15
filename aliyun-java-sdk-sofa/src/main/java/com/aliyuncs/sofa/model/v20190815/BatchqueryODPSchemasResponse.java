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
import com.aliyuncs.sofa.transform.v20190815.BatchqueryODPSchemasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchqueryODPSchemasResponse extends AcsResponse {

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

	@Override
	public BatchqueryODPSchemasResponse getInstance(UnmarshallerContext context) {
		return	BatchqueryODPSchemasResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
