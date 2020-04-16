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

package com.aliyuncs.clickhouse.model.v20191111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.DescribeDBClusterNetInfoItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterNetInfoItemsResponse extends AcsResponse {

	private String requestId;

	private String clusterNetworkType;

	private List<NetInfoItem> netInfoItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getClusterNetworkType() {
		return this.clusterNetworkType;
	}

	public void setClusterNetworkType(String clusterNetworkType) {
		this.clusterNetworkType = clusterNetworkType;
	}

	public List<NetInfoItem> getNetInfoItems() {
		return this.netInfoItems;
	}

	public void setNetInfoItems(List<NetInfoItem> netInfoItems) {
		this.netInfoItems = netInfoItems;
	}

	public static class NetInfoItem {

		private String connectionString;

		private String iPAddress;

		private String netType;

		private String httpPort;

		private String vpcId;

		private String vSwitchId;

		private String jdbcPort;

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getIPAddress() {
			return this.iPAddress;
		}

		public void setIPAddress(String iPAddress) {
			this.iPAddress = iPAddress;
		}

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}

		public String getHttpPort() {
			return this.httpPort;
		}

		public void setHttpPort(String httpPort) {
			this.httpPort = httpPort;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getJdbcPort() {
			return this.jdbcPort;
		}

		public void setJdbcPort(String jdbcPort) {
			this.jdbcPort = jdbcPort;
		}
	}

	@Override
	public DescribeDBClusterNetInfoItemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterNetInfoItemsResponseUnmarshaller.unmarshall(this, context);
	}
}
