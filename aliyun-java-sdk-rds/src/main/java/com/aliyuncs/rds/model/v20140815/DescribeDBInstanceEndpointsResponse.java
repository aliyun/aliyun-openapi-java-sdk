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
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceEndpointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceEndpointsResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String dBInstanceName;

		private String ipVersion;

		private List<DBInstanceEndpoint> dBInstanceEndpoints;

		public String getDBInstanceName() {
			return this.dBInstanceName;
		}

		public void setDBInstanceName(String dBInstanceName) {
			this.dBInstanceName = dBInstanceName;
		}

		public String getIpVersion() {
			return this.ipVersion;
		}

		public void setIpVersion(String ipVersion) {
			this.ipVersion = ipVersion;
		}

		public List<DBInstanceEndpoint> getDBInstanceEndpoints() {
			return this.dBInstanceEndpoints;
		}

		public void setDBInstanceEndpoints(List<DBInstanceEndpoint> dBInstanceEndpoints) {
			this.dBInstanceEndpoints = dBInstanceEndpoints;
		}

		public static class DBInstanceEndpoint {

			private String endpointDescription;

			private String endpointId;

			private String endpointType;

			private List<AddressItem> addressItems;

			private List<NodeItem> nodeItems;

			public String getEndpointDescription() {
				return this.endpointDescription;
			}

			public void setEndpointDescription(String endpointDescription) {
				this.endpointDescription = endpointDescription;
			}

			public String getEndpointId() {
				return this.endpointId;
			}

			public void setEndpointId(String endpointId) {
				this.endpointId = endpointId;
			}

			public String getEndpointType() {
				return this.endpointType;
			}

			public void setEndpointType(String endpointType) {
				this.endpointType = endpointType;
			}

			public List<AddressItem> getAddressItems() {
				return this.addressItems;
			}

			public void setAddressItems(List<AddressItem> addressItems) {
				this.addressItems = addressItems;
			}

			public List<NodeItem> getNodeItems() {
				return this.nodeItems;
			}

			public void setNodeItems(List<NodeItem> nodeItems) {
				this.nodeItems = nodeItems;
			}

			public static class AddressItem {

				private String connectionString;

				private String ipAddress;

				private String ipType;

				private String port;

				private String vSwitchId;

				private String vpcId;

				public String getConnectionString() {
					return this.connectionString;
				}

				public void setConnectionString(String connectionString) {
					this.connectionString = connectionString;
				}

				public String getIpAddress() {
					return this.ipAddress;
				}

				public void setIpAddress(String ipAddress) {
					this.ipAddress = ipAddress;
				}

				public String getIpType() {
					return this.ipType;
				}

				public void setIpType(String ipType) {
					this.ipType = ipType;
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

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
				}
			}

			public static class NodeItem {

				private String dBInstanceId;

				private String nodeId;

				private Integer weight;

				public String getDBInstanceId() {
					return this.dBInstanceId;
				}

				public void setDBInstanceId(String dBInstanceId) {
					this.dBInstanceId = dBInstanceId;
				}

				public String getNodeId() {
					return this.nodeId;
				}

				public void setNodeId(String nodeId) {
					this.nodeId = nodeId;
				}

				public Integer getWeight() {
					return this.weight;
				}

				public void setWeight(Integer weight) {
					this.weight = weight;
				}
			}
		}
	}

	@Override
	public DescribeDBInstanceEndpointsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceEndpointsResponseUnmarshaller.unmarshall(this, context);
	}
}
