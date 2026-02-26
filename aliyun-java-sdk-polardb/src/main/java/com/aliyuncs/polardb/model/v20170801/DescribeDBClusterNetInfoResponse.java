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
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterNetInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterNetInfoResponse extends AcsResponse {

	private String clusterNetworkType;

	private String requestId;

	private List<DBClusterNetInfo> dBClusterNetInfos;

	private List<DBNodeNetInfo> dBNodeNetInfos;

	public String getClusterNetworkType() {
		return this.clusterNetworkType;
	}

	public void setClusterNetworkType(String clusterNetworkType) {
		this.clusterNetworkType = clusterNetworkType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBClusterNetInfo> getDBClusterNetInfos() {
		return this.dBClusterNetInfos;
	}

	public void setDBClusterNetInfos(List<DBClusterNetInfo> dBClusterNetInfos) {
		this.dBClusterNetInfos = dBClusterNetInfos;
	}

	public List<DBNodeNetInfo> getDBNodeNetInfos() {
		return this.dBNodeNetInfos;
	}

	public void setDBNodeNetInfos(List<DBNodeNetInfo> dBNodeNetInfos) {
		this.dBNodeNetInfos = dBNodeNetInfos;
	}

	public static class DBClusterNetInfo {

		private String vSwitchId;

		private String connectionStringType;

		private String connectionString;

		private String iPType;

		private String port;

		private String vPCId;

		private String iPAddress;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getConnectionStringType() {
			return this.connectionStringType;
		}

		public void setConnectionStringType(String connectionStringType) {
			this.connectionStringType = connectionStringType;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getIPType() {
			return this.iPType;
		}

		public void setIPType(String iPType) {
			this.iPType = iPType;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
		}

		public String getIPAddress() {
			return this.iPAddress;
		}

		public void setIPAddress(String iPAddress) {
			this.iPAddress = iPAddress;
		}
	}

	public static class DBNodeNetInfo {

		private String dBNodeRole;

		private String dBInstanceId;

		private List<NetInfo> netInfos;

		public String getDBNodeRole() {
			return this.dBNodeRole;
		}

		public void setDBNodeRole(String dBNodeRole) {
			this.dBNodeRole = dBNodeRole;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public List<NetInfo> getNetInfos() {
			return this.netInfos;
		}

		public void setNetInfos(List<NetInfo> netInfos) {
			this.netInfos = netInfos;
		}

		public static class NetInfo {

			private String vSwitchId;

			private String connectionString;

			private String iPType;

			private String port;

			private String vPCId;

			private String iPAddress;

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getConnectionString() {
				return this.connectionString;
			}

			public void setConnectionString(String connectionString) {
				this.connectionString = connectionString;
			}

			public String getIPType() {
				return this.iPType;
			}

			public void setIPType(String iPType) {
				this.iPType = iPType;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getVPCId() {
				return this.vPCId;
			}

			public void setVPCId(String vPCId) {
				this.vPCId = vPCId;
			}

			public String getIPAddress() {
				return this.iPAddress;
			}

			public void setIPAddress(String iPAddress) {
				this.iPAddress = iPAddress;
			}
		}
	}

	@Override
	public DescribeDBClusterNetInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterNetInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
