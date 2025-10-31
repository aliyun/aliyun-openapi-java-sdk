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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DiscoverEventSourceRequest extends RpcAcsRequest<DiscoverEventSourceResponse> {
	   

	@SerializedName("sourceMySQLParameters")
	private SourceMySQLParameters sourceMySQLParameters;
	public DiscoverEventSourceRequest() {
		super("eventbridge", "2020-04-01", "DiscoverEventSource");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public SourceMySQLParameters getSourceMySQLParameters() {
		return this.sourceMySQLParameters;
	}

	public void setSourceMySQLParameters(SourceMySQLParameters sourceMySQLParameters) {
		this.sourceMySQLParameters = sourceMySQLParameters;	
		if (sourceMySQLParameters != null) {
			putBodyParameter("SourceMySQLParameters" , new Gson().toJson(sourceMySQLParameters));
		}	
	}

	public static class SourceMySQLParameters {

		@SerializedName("Offset")
		private String offset;

		@SerializedName("VSwitchIds")
		private String vSwitchIds;

		@SerializedName("SecurityGroupId")
		private String securityGroupId;

		@SerializedName("NetworkType")
		private String networkType;

		@SerializedName("HostName")
		private String hostName;

		@SerializedName("Password")
		private String password;

		@SerializedName("RegionId")
		private String regionId;

		@SerializedName("Port")
		private Integer port;

		@SerializedName("DatabaseName")
		private String databaseName;

		@SerializedName("VpcId")
		private String vpcId;

		@SerializedName("Limit")
		private String limit;

		@SerializedName("TableName")
		private String tableName;

		@SerializedName("User")
		private String user;

		public String getOffset() {
			return this.offset;
		}

		public void setOffset(String offset) {
			this.offset = offset;
		}

		public String getVSwitchIds() {
			return this.vSwitchIds;
		}

		public void setVSwitchIds(String vSwitchIds) {
			this.vSwitchIds = vSwitchIds;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getLimit() {
			return this.limit;
		}

		public void setLimit(String limit) {
			this.limit = limit;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}
	}

	@Override
	public Class<DiscoverEventSourceResponse> getResponseClass() {
		return DiscoverEventSourceResponse.class;
	}

}
