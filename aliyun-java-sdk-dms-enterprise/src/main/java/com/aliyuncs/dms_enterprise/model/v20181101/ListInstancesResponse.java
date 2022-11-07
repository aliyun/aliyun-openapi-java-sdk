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
import com.aliyuncs.dms_enterprise.transform.v20181101.ListInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstancesResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<Instance> instanceList;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

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

	public List<Instance> getInstanceList() {
		return this.instanceList;
	}

	public void setInstanceList(List<Instance> instanceList) {
		this.instanceList = instanceList;
	}

	public static class Instance {

		private String vpcId;

		private String databaseUser;

		private String dbaId;

		private Integer useDsql;

		private Integer port;

		private String ecsInstanceId;

		private String envType;

		private String sid;

		private String safeRuleId;

		private String dbaNickName;

		private Integer queryTimeout;

		private String instanceSource;

		private String host;

		private String state;

		private String dataLinkName;

		private Integer exportTimeout;

		private String instanceId;

		private String instanceType;

		private String databasePassword;

		private String instanceAlias;

		private Integer ddlOnline;

		private String ecsRegion;

		private Boolean sellSitd;

		private List<String> ownerIdList;

		private List<String> ownerNameList;

		private StandardGroup standardGroup;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getDatabaseUser() {
			return this.databaseUser;
		}

		public void setDatabaseUser(String databaseUser) {
			this.databaseUser = databaseUser;
		}

		public String getDbaId() {
			return this.dbaId;
		}

		public void setDbaId(String dbaId) {
			this.dbaId = dbaId;
		}

		public Integer getUseDsql() {
			return this.useDsql;
		}

		public void setUseDsql(Integer useDsql) {
			this.useDsql = useDsql;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getEcsInstanceId() {
			return this.ecsInstanceId;
		}

		public void setEcsInstanceId(String ecsInstanceId) {
			this.ecsInstanceId = ecsInstanceId;
		}

		public String getEnvType() {
			return this.envType;
		}

		public void setEnvType(String envType) {
			this.envType = envType;
		}

		public String getSid() {
			return this.sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public String getSafeRuleId() {
			return this.safeRuleId;
		}

		public void setSafeRuleId(String safeRuleId) {
			this.safeRuleId = safeRuleId;
		}

		public String getDbaNickName() {
			return this.dbaNickName;
		}

		public void setDbaNickName(String dbaNickName) {
			this.dbaNickName = dbaNickName;
		}

		public Integer getQueryTimeout() {
			return this.queryTimeout;
		}

		public void setQueryTimeout(Integer queryTimeout) {
			this.queryTimeout = queryTimeout;
		}

		public String getInstanceSource() {
			return this.instanceSource;
		}

		public void setInstanceSource(String instanceSource) {
			this.instanceSource = instanceSource;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getDataLinkName() {
			return this.dataLinkName;
		}

		public void setDataLinkName(String dataLinkName) {
			this.dataLinkName = dataLinkName;
		}

		public Integer getExportTimeout() {
			return this.exportTimeout;
		}

		public void setExportTimeout(Integer exportTimeout) {
			this.exportTimeout = exportTimeout;
		}

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

		public String getDatabasePassword() {
			return this.databasePassword;
		}

		public void setDatabasePassword(String databasePassword) {
			this.databasePassword = databasePassword;
		}

		public String getInstanceAlias() {
			return this.instanceAlias;
		}

		public void setInstanceAlias(String instanceAlias) {
			this.instanceAlias = instanceAlias;
		}

		public Integer getDdlOnline() {
			return this.ddlOnline;
		}

		public void setDdlOnline(Integer ddlOnline) {
			this.ddlOnline = ddlOnline;
		}

		public String getEcsRegion() {
			return this.ecsRegion;
		}

		public void setEcsRegion(String ecsRegion) {
			this.ecsRegion = ecsRegion;
		}

		public Boolean getSellSitd() {
			return this.sellSitd;
		}

		public void setSellSitd(Boolean sellSitd) {
			this.sellSitd = sellSitd;
		}

		public List<String> getOwnerIdList() {
			return this.ownerIdList;
		}

		public void setOwnerIdList(List<String> ownerIdList) {
			this.ownerIdList = ownerIdList;
		}

		public List<String> getOwnerNameList() {
			return this.ownerNameList;
		}

		public void setOwnerNameList(List<String> ownerNameList) {
			this.ownerNameList = ownerNameList;
		}

		public StandardGroup getStandardGroup() {
			return this.standardGroup;
		}

		public void setStandardGroup(StandardGroup standardGroup) {
			this.standardGroup = standardGroup;
		}

		public static class StandardGroup {

			private String groupName;

			private String groupMode;

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getGroupMode() {
				return this.groupMode;
			}

			public void setGroupMode(String groupMode) {
				this.groupMode = groupMode;
			}
		}
	}

	@Override
	public ListInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
