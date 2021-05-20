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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterEndpointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterEndpointsResponse extends AcsResponse {

	private String requestId;

	private List<DBEndpoint> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBEndpoint> getItems() {
		return this.items;
	}

	public void setItems(List<DBEndpoint> items) {
		this.items = items;
	}

	public static class DBEndpoint {

		private String dBEndpointId;

		private String nodeWithRoles;

		private String autoAddNewNodes;

		private String endpointType;

		private String dBEndpointDescription;

		private String endpointConfig;

		private String readWriteMode;

		private String nodes;

		private List<Address> addressItems;

		public String getDBEndpointId() {
			return this.dBEndpointId;
		}

		public void setDBEndpointId(String dBEndpointId) {
			this.dBEndpointId = dBEndpointId;
		}

		public String getNodeWithRoles() {
			return this.nodeWithRoles;
		}

		public void setNodeWithRoles(String nodeWithRoles) {
			this.nodeWithRoles = nodeWithRoles;
		}

		public String getAutoAddNewNodes() {
			return this.autoAddNewNodes;
		}

		public void setAutoAddNewNodes(String autoAddNewNodes) {
			this.autoAddNewNodes = autoAddNewNodes;
		}

		public String getEndpointType() {
			return this.endpointType;
		}

		public void setEndpointType(String endpointType) {
			this.endpointType = endpointType;
		}

		public String getDBEndpointDescription() {
			return this.dBEndpointDescription;
		}

		public void setDBEndpointDescription(String dBEndpointDescription) {
			this.dBEndpointDescription = dBEndpointDescription;
		}

		public String getEndpointConfig() {
			return this.endpointConfig;
		}

		public void setEndpointConfig(String endpointConfig) {
			this.endpointConfig = endpointConfig;
		}

		public String getReadWriteMode() {
			return this.readWriteMode;
		}

		public void setReadWriteMode(String readWriteMode) {
			this.readWriteMode = readWriteMode;
		}

		public String getNodes() {
			return this.nodes;
		}

		public void setNodes(String nodes) {
			this.nodes = nodes;
		}

		public List<Address> getAddressItems() {
			return this.addressItems;
		}

		public void setAddressItems(List<Address> addressItems) {
			this.addressItems = addressItems;
		}

		public static class Address {

			private String privateZoneConnectionString;

			private String vPCId;

			private String port;

			private String vSwitchId;

			private String vpcInstanceId;

			private String iPAddress;

			private String connectionString;

			private String netType;

			public String getPrivateZoneConnectionString() {
				return this.privateZoneConnectionString;
			}

			public void setPrivateZoneConnectionString(String privateZoneConnectionString) {
				this.privateZoneConnectionString = privateZoneConnectionString;
			}

			public String getVPCId() {
				return this.vPCId;
			}

			public void setVPCId(String vPCId) {
				this.vPCId = vPCId;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getVpcInstanceId() {
				return this.vpcInstanceId;
			}

			public void setVpcInstanceId(String vpcInstanceId) {
				this.vpcInstanceId = vpcInstanceId;
			}

			public String getIPAddress() {
				return this.iPAddress;
			}

			public void setIPAddress(String iPAddress) {
				this.iPAddress = iPAddress;
			}

			public String getConnectionString() {
				return this.connectionString;
			}

			public void setConnectionString(String connectionString) {
				this.connectionString = connectionString;
			}

			public String getNetType() {
				return this.netType;
			}

			public void setNetType(String netType) {
				this.netType = netType;
			}
		}
	}

	@Override
	public DescribeDBClusterEndpointsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterEndpointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
