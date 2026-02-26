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
import com.aliyuncs.rds.transform.v20140815.DescribeDBProxyEndpointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBProxyEndpointResponse extends AcsResponse {

	private String dBProxyConnectString;

	private String dBProxyConnectStringNetType;

	private String dBProxyConnectStringPort;

	private String dBProxyEndpointId;

	private String dBProxyEngineType;

	private String dBProxyFeatures;

	private String dbProxyEndpointAliases;

	private String dbProxyEndpointReadWriteMode;

	private String dbProxyEndpointVswitchId;

	private String dbProxyEndpointVpcId;

	private String dbProxyEndpointZoneId;

	private String readOnlyInstanceDistributionType;

	private String readOnlyInstanceMaxDelayTime;

	private String causalConsistReadTimeout;

	private String readOnlyInstanceWeight;

	private String requestId;

	private String dBProxyEndpointMinSlaveCount;

	private List<DBProxyNodesItem> dBProxyNodes;

	private List<EndpointConnectItemsItem> endpointConnectItems;

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

	public String getDBProxyEngineType() {
		return this.dBProxyEngineType;
	}

	public void setDBProxyEngineType(String dBProxyEngineType) {
		this.dBProxyEngineType = dBProxyEngineType;
	}

	public String getDBProxyFeatures() {
		return this.dBProxyFeatures;
	}

	public void setDBProxyFeatures(String dBProxyFeatures) {
		this.dBProxyFeatures = dBProxyFeatures;
	}

	public String getDbProxyEndpointAliases() {
		return this.dbProxyEndpointAliases;
	}

	public void setDbProxyEndpointAliases(String dbProxyEndpointAliases) {
		this.dbProxyEndpointAliases = dbProxyEndpointAliases;
	}

	public String getDbProxyEndpointReadWriteMode() {
		return this.dbProxyEndpointReadWriteMode;
	}

	public void setDbProxyEndpointReadWriteMode(String dbProxyEndpointReadWriteMode) {
		this.dbProxyEndpointReadWriteMode = dbProxyEndpointReadWriteMode;
	}

	public String getDbProxyEndpointVswitchId() {
		return this.dbProxyEndpointVswitchId;
	}

	public void setDbProxyEndpointVswitchId(String dbProxyEndpointVswitchId) {
		this.dbProxyEndpointVswitchId = dbProxyEndpointVswitchId;
	}

	public String getDbProxyEndpointVpcId() {
		return this.dbProxyEndpointVpcId;
	}

	public void setDbProxyEndpointVpcId(String dbProxyEndpointVpcId) {
		this.dbProxyEndpointVpcId = dbProxyEndpointVpcId;
	}

	public String getDbProxyEndpointZoneId() {
		return this.dbProxyEndpointZoneId;
	}

	public void setDbProxyEndpointZoneId(String dbProxyEndpointZoneId) {
		this.dbProxyEndpointZoneId = dbProxyEndpointZoneId;
	}

	public String getReadOnlyInstanceDistributionType() {
		return this.readOnlyInstanceDistributionType;
	}

	public void setReadOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
		this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
	}

	public String getReadOnlyInstanceMaxDelayTime() {
		return this.readOnlyInstanceMaxDelayTime;
	}

	public void setReadOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
		this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
	}

	public String getCausalConsistReadTimeout() {
		return this.causalConsistReadTimeout;
	}

	public void setCausalConsistReadTimeout(String causalConsistReadTimeout) {
		this.causalConsistReadTimeout = causalConsistReadTimeout;
	}

	public String getReadOnlyInstanceWeight() {
		return this.readOnlyInstanceWeight;
	}

	public void setReadOnlyInstanceWeight(String readOnlyInstanceWeight) {
		this.readOnlyInstanceWeight = readOnlyInstanceWeight;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBProxyEndpointMinSlaveCount() {
		return this.dBProxyEndpointMinSlaveCount;
	}

	public void setDBProxyEndpointMinSlaveCount(String dBProxyEndpointMinSlaveCount) {
		this.dBProxyEndpointMinSlaveCount = dBProxyEndpointMinSlaveCount;
	}

	public List<DBProxyNodesItem> getDBProxyNodes() {
		return this.dBProxyNodes;
	}

	public void setDBProxyNodes(List<DBProxyNodesItem> dBProxyNodes) {
		this.dBProxyNodes = dBProxyNodes;
	}

	public List<EndpointConnectItemsItem> getEndpointConnectItems() {
		return this.endpointConnectItems;
	}

	public void setEndpointConnectItems(List<EndpointConnectItemsItem> endpointConnectItems) {
		this.endpointConnectItems = endpointConnectItems;
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

	public static class EndpointConnectItemsItem {

		private String dbProxyEndpointConnectString;

		private String dbProxyEndpointNetType;

		private String dbProxyEndpointPort;

		public String getDbProxyEndpointConnectString() {
			return this.dbProxyEndpointConnectString;
		}

		public void setDbProxyEndpointConnectString(String dbProxyEndpointConnectString) {
			this.dbProxyEndpointConnectString = dbProxyEndpointConnectString;
		}

		public String getDbProxyEndpointNetType() {
			return this.dbProxyEndpointNetType;
		}

		public void setDbProxyEndpointNetType(String dbProxyEndpointNetType) {
			this.dbProxyEndpointNetType = dbProxyEndpointNetType;
		}

		public String getDbProxyEndpointPort() {
			return this.dbProxyEndpointPort;
		}

		public void setDbProxyEndpointPort(String dbProxyEndpointPort) {
			this.dbProxyEndpointPort = dbProxyEndpointPort;
		}
	}

	@Override
	public DescribeDBProxyEndpointResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBProxyEndpointResponseUnmarshaller.unmarshall(this, context);
	}
}
