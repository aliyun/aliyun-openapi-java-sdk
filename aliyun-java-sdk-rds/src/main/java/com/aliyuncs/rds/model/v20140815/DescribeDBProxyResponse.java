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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDBProxyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBProxyResponse extends AcsResponse {

	private String accountName;

	private String dBProxyEngineType;

	private String dBProxyInstanceCurrentMinorVersion;

	private String dBProxyInstanceLatestMinorVersion;

	private String dBProxyInstanceName;

	private Integer dBProxyInstanceNum;

	private String dBProxyInstanceSize;

	private String dBProxyInstanceStatus;

	private String dBProxyInstanceType;

	private String dBProxyKindCode;

	private String dBProxyPersistentConnectionStatus;

	private String dBProxyServiceStatus;

	private String requestId;

	private String resourceGroupId;

	private List<DBProxyConnectStringItemsItem> dBProxyConnectStringItems;

	private List<DBProxyNodesItem> dBProxyNodes;

	private List<DbProxyEndpointItemsItem> dbProxyEndpointItems;

	private List<String> dBProxyAVZones;

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getDBProxyEngineType() {
		return this.dBProxyEngineType;
	}

	public void setDBProxyEngineType(String dBProxyEngineType) {
		this.dBProxyEngineType = dBProxyEngineType;
	}

	public String getDBProxyInstanceCurrentMinorVersion() {
		return this.dBProxyInstanceCurrentMinorVersion;
	}

	public void setDBProxyInstanceCurrentMinorVersion(String dBProxyInstanceCurrentMinorVersion) {
		this.dBProxyInstanceCurrentMinorVersion = dBProxyInstanceCurrentMinorVersion;
	}

	public String getDBProxyInstanceLatestMinorVersion() {
		return this.dBProxyInstanceLatestMinorVersion;
	}

	public void setDBProxyInstanceLatestMinorVersion(String dBProxyInstanceLatestMinorVersion) {
		this.dBProxyInstanceLatestMinorVersion = dBProxyInstanceLatestMinorVersion;
	}

	public String getDBProxyInstanceName() {
		return this.dBProxyInstanceName;
	}

	public void setDBProxyInstanceName(String dBProxyInstanceName) {
		this.dBProxyInstanceName = dBProxyInstanceName;
	}

	public Integer getDBProxyInstanceNum() {
		return this.dBProxyInstanceNum;
	}

	public void setDBProxyInstanceNum(Integer dBProxyInstanceNum) {
		this.dBProxyInstanceNum = dBProxyInstanceNum;
	}

	public String getDBProxyInstanceSize() {
		return this.dBProxyInstanceSize;
	}

	public void setDBProxyInstanceSize(String dBProxyInstanceSize) {
		this.dBProxyInstanceSize = dBProxyInstanceSize;
	}

	public String getDBProxyInstanceStatus() {
		return this.dBProxyInstanceStatus;
	}

	public void setDBProxyInstanceStatus(String dBProxyInstanceStatus) {
		this.dBProxyInstanceStatus = dBProxyInstanceStatus;
	}

	public String getDBProxyInstanceType() {
		return this.dBProxyInstanceType;
	}

	public void setDBProxyInstanceType(String dBProxyInstanceType) {
		this.dBProxyInstanceType = dBProxyInstanceType;
	}

	public String getDBProxyKindCode() {
		return this.dBProxyKindCode;
	}

	public void setDBProxyKindCode(String dBProxyKindCode) {
		this.dBProxyKindCode = dBProxyKindCode;
	}

	public String getDBProxyPersistentConnectionStatus() {
		return this.dBProxyPersistentConnectionStatus;
	}

	public void setDBProxyPersistentConnectionStatus(String dBProxyPersistentConnectionStatus) {
		this.dBProxyPersistentConnectionStatus = dBProxyPersistentConnectionStatus;
	}

	public String getDBProxyServiceStatus() {
		return this.dBProxyServiceStatus;
	}

	public void setDBProxyServiceStatus(String dBProxyServiceStatus) {
		this.dBProxyServiceStatus = dBProxyServiceStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public List<DBProxyConnectStringItemsItem> getDBProxyConnectStringItems() {
		return this.dBProxyConnectStringItems;
	}

	public void setDBProxyConnectStringItems(List<DBProxyConnectStringItemsItem> dBProxyConnectStringItems) {
		this.dBProxyConnectStringItems = dBProxyConnectStringItems;
	}

	public List<DBProxyNodesItem> getDBProxyNodes() {
		return this.dBProxyNodes;
	}

	public void setDBProxyNodes(List<DBProxyNodesItem> dBProxyNodes) {
		this.dBProxyNodes = dBProxyNodes;
	}

	public List<DbProxyEndpointItemsItem> getDbProxyEndpointItems() {
		return this.dbProxyEndpointItems;
	}

	public void setDbProxyEndpointItems(List<DbProxyEndpointItemsItem> dbProxyEndpointItems) {
		this.dbProxyEndpointItems = dbProxyEndpointItems;
	}

	public List<String> getDBProxyAVZones() {
		return this.dBProxyAVZones;
	}

	public void setDBProxyAVZones(List<String> dBProxyAVZones) {
		this.dBProxyAVZones = dBProxyAVZones;
	}

	public static class DBProxyConnectStringItemsItem {

		private String dBProxyConnectString;

		private String dBProxyConnectStringNetType;

		private String dBProxyConnectStringNetWorkType;

		private String dBProxyConnectStringPort;

		private String dBProxyEndpointId;

		private String dBProxyEndpointName;

		private String dBProxyVpcId;

		private String dBProxyVpcInstanceId;

		private String dBProxyVswitchId;

		public String getDBProxyConnectString() {
			return this.dBProxyConnectString;
		}

		public void setDBProxyConnectString(String dBProxyConnectString) {
			this.dBProxyConnectString = dBProxyConnectString;
		}

		public String getDBProxyConnectStringNetType() {
			return this.dBProxyConnectStringNetType;
		}

		public void setDBProxyConnectStringNetType(String dBProxyConnectStringNetType) {
			this.dBProxyConnectStringNetType = dBProxyConnectStringNetType;
		}

		public String getDBProxyConnectStringNetWorkType() {
			return this.dBProxyConnectStringNetWorkType;
		}

		public void setDBProxyConnectStringNetWorkType(String dBProxyConnectStringNetWorkType) {
			this.dBProxyConnectStringNetWorkType = dBProxyConnectStringNetWorkType;
		}

		public String getDBProxyConnectStringPort() {
			return this.dBProxyConnectStringPort;
		}

		public void setDBProxyConnectStringPort(String dBProxyConnectStringPort) {
			this.dBProxyConnectStringPort = dBProxyConnectStringPort;
		}

		public String getDBProxyEndpointId() {
			return this.dBProxyEndpointId;
		}

		public void setDBProxyEndpointId(String dBProxyEndpointId) {
			this.dBProxyEndpointId = dBProxyEndpointId;
		}

		public String getDBProxyEndpointName() {
			return this.dBProxyEndpointName;
		}

		public void setDBProxyEndpointName(String dBProxyEndpointName) {
			this.dBProxyEndpointName = dBProxyEndpointName;
		}

		public String getDBProxyVpcId() {
			return this.dBProxyVpcId;
		}

		public void setDBProxyVpcId(String dBProxyVpcId) {
			this.dBProxyVpcId = dBProxyVpcId;
		}

		public String getDBProxyVpcInstanceId() {
			return this.dBProxyVpcInstanceId;
		}

		public void setDBProxyVpcInstanceId(String dBProxyVpcInstanceId) {
			this.dBProxyVpcInstanceId = dBProxyVpcInstanceId;
		}

		public String getDBProxyVswitchId() {
			return this.dBProxyVswitchId;
		}

		public void setDBProxyVswitchId(String dBProxyVswitchId) {
			this.dBProxyVswitchId = dBProxyVswitchId;
		}
	}

	public static class DBProxyNodesItem {

		private String cpuCores;

		private String nodeId;

		private String zoneId;

		public String getCpuCores() {
			return this.cpuCores;
		}

		public void setCpuCores(String cpuCores) {
			this.cpuCores = cpuCores;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	public static class DbProxyEndpointItemsItem {

		private String dbProxyEndpointAliases;

		private String dbProxyEndpointName;

		private String dbProxyEndpointType;

		private String dbProxyReadWriteMode;

		public String getDbProxyEndpointAliases() {
			return this.dbProxyEndpointAliases;
		}

		public void setDbProxyEndpointAliases(String dbProxyEndpointAliases) {
			this.dbProxyEndpointAliases = dbProxyEndpointAliases;
		}

		public String getDbProxyEndpointName() {
			return this.dbProxyEndpointName;
		}

		public void setDbProxyEndpointName(String dbProxyEndpointName) {
			this.dbProxyEndpointName = dbProxyEndpointName;
		}

		public String getDbProxyEndpointType() {
			return this.dbProxyEndpointType;
		}

		public void setDbProxyEndpointType(String dbProxyEndpointType) {
			this.dbProxyEndpointType = dbProxyEndpointType;
		}

		public String getDbProxyReadWriteMode() {
			return this.dbProxyReadWriteMode;
		}

		public void setDbProxyReadWriteMode(String dbProxyReadWriteMode) {
			this.dbProxyReadWriteMode = dbProxyReadWriteMode;
		}
	}

	@Override
	public DescribeDBProxyResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBProxyResponseUnmarshaller.unmarshall(this, context);
	}
}
