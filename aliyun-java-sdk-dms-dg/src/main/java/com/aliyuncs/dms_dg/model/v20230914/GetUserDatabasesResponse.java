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

package com.aliyuncs.dms_dg.model.v20230914;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_dg.transform.v20230914.GetUserDatabasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserDatabasesResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String code;

	private String errorMsg;

	private Integer count;

	private List<DbInstance> dbInstanceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<DbInstance> getDbInstanceList() {
		return this.dbInstanceList;
	}

	public void setDbInstanceList(List<DbInstance> dbInstanceList) {
		this.dbInstanceList = dbInstanceList;
	}

	public static class DbInstance {

		private Integer port;

		private String host;

		private String gatewayId;

		private String dbType;

		private String regionId;

		private String connectHost;

		private Integer connectPort;

		private String serviceType;

		private String networkType;

		private String nodeId;

		private String instanceStatus;

		private String dbDescription;

		private String instanceId;

		private String gatewayName;

		private Long gmtCreate;

		private String userId;

		private String parentId;

		private String vpcId;

		private String vpcInstanceId;

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getConnectHost() {
			return this.connectHost;
		}

		public void setConnectHost(String connectHost) {
			this.connectHost = connectHost;
		}

		public Integer getConnectPort() {
			return this.connectPort;
		}

		public void setConnectPort(Integer connectPort) {
			this.connectPort = connectPort;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getDbDescription() {
			return this.dbDescription;
		}

		public void setDbDescription(String dbDescription) {
			this.dbDescription = dbDescription;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getGatewayName() {
			return this.gatewayName;
		}

		public void setGatewayName(String gatewayName) {
			this.gatewayName = gatewayName;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVpcInstanceId() {
			return this.vpcInstanceId;
		}

		public void setVpcInstanceId(String vpcInstanceId) {
			this.vpcInstanceId = vpcInstanceId;
		}
	}

	@Override
	public GetUserDatabasesResponse getInstance(UnmarshallerContext context) {
		return	GetUserDatabasesResponseUnmarshaller.unmarshall(this, context);
	}
}
