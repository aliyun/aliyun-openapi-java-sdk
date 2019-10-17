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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private Instance instance;

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

	public Instance getInstance() {
		return this.instance;
	}

	public void setInstance(Instance instance) {
		this.instance = instance;
	}

	public static class Instance {

		private String instanceId;

		private String instanceType;

		private String envType;

		private String host;

		private Integer port;

		private String sid;

		private String instanceAlias;

		private String dataLinkName;

		private String dbaNickName;

		private String safeRuleId;

		private Integer queryTimeout;

		private Integer exportTimeout;

		private String state;

		private String dbaId;

		private Integer ddlOnline;

		private Integer useDsql;

		private String ecsInstanceId;

		private String vpcId;

		private String ecsRegion;

		private String databaseUser;

		private String databasePassword;

		private String instanceSource;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
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

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getSid() {
			return this.sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public String getInstanceAlias() {
			return this.instanceAlias;
		}

		public void setInstanceAlias(String instanceAlias) {
			this.instanceAlias = instanceAlias;
		}

		public String getDataLinkName() {
			return this.dataLinkName;
		}

		public void setDataLinkName(String dataLinkName) {
			this.dataLinkName = dataLinkName;
		}

		public String getDbaNickName() {
			return this.dbaNickName;
		}

		public void setDbaNickName(String dbaNickName) {
			this.dbaNickName = dbaNickName;
		}

		public String getSafeRuleId() {
			return this.safeRuleId;
		}

		public void setSafeRuleId(String safeRuleId) {
			this.safeRuleId = safeRuleId;
		}

		public Integer getQueryTimeout() {
			return this.queryTimeout;
		}

		public void setQueryTimeout(Integer queryTimeout) {
			this.queryTimeout = queryTimeout;
		}

		public Integer getExportTimeout() {
			return this.exportTimeout;
		}

		public void setExportTimeout(Integer exportTimeout) {
			this.exportTimeout = exportTimeout;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getDbaId() {
			return this.dbaId;
		}

		public void setDbaId(String dbaId) {
			this.dbaId = dbaId;
		}

		public Integer getDdlOnline() {
			return this.ddlOnline;
		}

		public void setDdlOnline(Integer ddlOnline) {
			this.ddlOnline = ddlOnline;
		}

		public Integer getUseDsql() {
			return this.useDsql;
		}

		public void setUseDsql(Integer useDsql) {
			this.useDsql = useDsql;
		}

		public String getEcsInstanceId() {
			return this.ecsInstanceId;
		}

		public void setEcsInstanceId(String ecsInstanceId) {
			this.ecsInstanceId = ecsInstanceId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getEcsRegion() {
			return this.ecsRegion;
		}

		public void setEcsRegion(String ecsRegion) {
			this.ecsRegion = ecsRegion;
		}

		public String getDatabaseUser() {
			return this.databaseUser;
		}

		public void setDatabaseUser(String databaseUser) {
			this.databaseUser = databaseUser;
		}

		public String getDatabasePassword() {
			return this.databasePassword;
		}

		public void setDatabasePassword(String databasePassword) {
			this.databasePassword = databasePassword;
		}

		public String getInstanceSource() {
			return this.instanceSource;
		}

		public void setInstanceSource(String instanceSource) {
			this.instanceSource = instanceSource;
		}
	}

	@Override
	public GetInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
