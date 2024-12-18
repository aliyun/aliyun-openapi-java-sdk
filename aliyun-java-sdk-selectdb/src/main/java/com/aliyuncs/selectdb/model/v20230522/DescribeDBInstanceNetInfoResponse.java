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

package com.aliyuncs.selectdb.model.v20230522;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.selectdb.transform.v20230522.DescribeDBInstanceNetInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceNetInfoResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceNetInfosItem> dBInstanceNetInfos;

	private List<DBClustersNetInfosItem> dBClustersNetInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceNetInfosItem> getDBInstanceNetInfos() {
		return this.dBInstanceNetInfos;
	}

	public void setDBInstanceNetInfos(List<DBInstanceNetInfosItem> dBInstanceNetInfos) {
		this.dBInstanceNetInfos = dBInstanceNetInfos;
	}

	public List<DBClustersNetInfosItem> getDBClustersNetInfos() {
		return this.dBClustersNetInfos;
	}

	public void setDBClustersNetInfos(List<DBClustersNetInfosItem> dBClustersNetInfos) {
		this.dBClustersNetInfos = dBClustersNetInfos;
	}

	public static class DBInstanceNetInfosItem {

		private String netType;

		private String vpcInstanceId;

		private String vpcId;

		private String vswitchId;

		private Boolean userVisible;

		private String connectionString;

		private String ip;

		private String clusterId;

		private List<PortListItem> portList;

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}

		public String getVpcInstanceId() {
			return this.vpcInstanceId;
		}

		public void setVpcInstanceId(String vpcInstanceId) {
			this.vpcInstanceId = vpcInstanceId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public Boolean getUserVisible() {
			return this.userVisible;
		}

		public void setUserVisible(Boolean userVisible) {
			this.userVisible = userVisible;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public List<PortListItem> getPortList() {
			return this.portList;
		}

		public void setPortList(List<PortListItem> portList) {
			this.portList = portList;
		}

		public static class PortListItem {

			private String protocol;

			private Integer port;

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}
		}
	}

	public static class DBClustersNetInfosItem {

		private String netType;

		private String vpcInstanceId;

		private String vpcId;

		private String vswitchId;

		private Boolean userVisible;

		private String connectionString;

		private String ip;

		private String clusterId;

		private List<PortListItem2> portList1;

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}

		public String getVpcInstanceId() {
			return this.vpcInstanceId;
		}

		public void setVpcInstanceId(String vpcInstanceId) {
			this.vpcInstanceId = vpcInstanceId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public Boolean getUserVisible() {
			return this.userVisible;
		}

		public void setUserVisible(Boolean userVisible) {
			this.userVisible = userVisible;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public List<PortListItem2> getPortList1() {
			return this.portList1;
		}

		public void setPortList1(List<PortListItem2> portList1) {
			this.portList1 = portList1;
		}

		public static class PortListItem2 {

			private String protocol;

			private Integer port;

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}
		}
	}

	@Override
	public DescribeDBInstanceNetInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceNetInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
