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
import com.aliyuncs.rds.transform.v20140815.GetDBInstanceTopologyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDBInstanceTopologyResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

		private List<Connection> connections;

		private List<Node> nodes;

		public String getDBInstanceName() {
			return this.dBInstanceName;
		}

		public void setDBInstanceName(String dBInstanceName) {
			this.dBInstanceName = dBInstanceName;
		}

		public List<Connection> getConnections() {
			return this.connections;
		}

		public void setConnections(List<Connection> connections) {
			this.connections = connections;
		}

		public List<Node> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<Node> nodes) {
			this.nodes = nodes;
		}

		public static class Connection {

			private String connectionString;

			private String netType;

			private String zoneId;

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

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}
		}

		public static class Node {

			private String dedicatedHostGroupId;

			private String dedicatedHostId;

			private String role;

			private String zoneId;

			public String getDedicatedHostGroupId() {
				return this.dedicatedHostGroupId;
			}

			public void setDedicatedHostGroupId(String dedicatedHostGroupId) {
				this.dedicatedHostGroupId = dedicatedHostGroupId;
			}

			public String getDedicatedHostId() {
				return this.dedicatedHostId;
			}

			public void setDedicatedHostId(String dedicatedHostId) {
				this.dedicatedHostId = dedicatedHostId;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}
		}
	}

	@Override
	public GetDBInstanceTopologyResponse getInstance(UnmarshallerContext context) {
		return	GetDBInstanceTopologyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
