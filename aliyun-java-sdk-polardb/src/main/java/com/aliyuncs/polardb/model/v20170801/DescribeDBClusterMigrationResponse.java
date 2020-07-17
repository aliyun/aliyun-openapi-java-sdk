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
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterMigrationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterMigrationResponse extends AcsResponse {

	private String requestId;

	private String dBClusterId;

	private String sourceRDSDBInstanceId;

	private String migrationStatus;

	private String topologies;

	private Integer delayedSeconds;

	private String expiredTime;

	private String rdsReadWriteMode;

	private String dBClusterReadWriteMode;

	private String comment;

	private List<DBClusterEndpoint> dBClusterEndpointList;

	private List<RdsEndpoint> rdsEndpointList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getSourceRDSDBInstanceId() {
		return this.sourceRDSDBInstanceId;
	}

	public void setSourceRDSDBInstanceId(String sourceRDSDBInstanceId) {
		this.sourceRDSDBInstanceId = sourceRDSDBInstanceId;
	}

	public String getMigrationStatus() {
		return this.migrationStatus;
	}

	public void setMigrationStatus(String migrationStatus) {
		this.migrationStatus = migrationStatus;
	}

	public String getTopologies() {
		return this.topologies;
	}

	public void setTopologies(String topologies) {
		this.topologies = topologies;
	}

	public Integer getDelayedSeconds() {
		return this.delayedSeconds;
	}

	public void setDelayedSeconds(Integer delayedSeconds) {
		this.delayedSeconds = delayedSeconds;
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getRdsReadWriteMode() {
		return this.rdsReadWriteMode;
	}

	public void setRdsReadWriteMode(String rdsReadWriteMode) {
		this.rdsReadWriteMode = rdsReadWriteMode;
	}

	public String getDBClusterReadWriteMode() {
		return this.dBClusterReadWriteMode;
	}

	public void setDBClusterReadWriteMode(String dBClusterReadWriteMode) {
		this.dBClusterReadWriteMode = dBClusterReadWriteMode;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<DBClusterEndpoint> getDBClusterEndpointList() {
		return this.dBClusterEndpointList;
	}

	public void setDBClusterEndpointList(List<DBClusterEndpoint> dBClusterEndpointList) {
		this.dBClusterEndpointList = dBClusterEndpointList;
	}

	public List<RdsEndpoint> getRdsEndpointList() {
		return this.rdsEndpointList;
	}

	public void setRdsEndpointList(List<RdsEndpoint> rdsEndpointList) {
		this.rdsEndpointList = rdsEndpointList;
	}

	public static class DBClusterEndpoint {

		private String dBEndpointId;

		private String endpointType;

		private List<Address> addressItems;

		public String getDBEndpointId() {
			return this.dBEndpointId;
		}

		public void setDBEndpointId(String dBEndpointId) {
			this.dBEndpointId = dBEndpointId;
		}

		public String getEndpointType() {
			return this.endpointType;
		}

		public void setEndpointType(String endpointType) {
			this.endpointType = endpointType;
		}

		public List<Address> getAddressItems() {
			return this.addressItems;
		}

		public void setAddressItems(List<Address> addressItems) {
			this.addressItems = addressItems;
		}

		public static class Address {

			private String connectionString;

			private String iPAddress;

			private String netType;

			private String port;

			private String vPCId;

			private String vSwitchId;

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

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}
		}
	}

	public static class RdsEndpoint {

		private String dBEndpointId;

		private String endpointType;

		private List<Address2> addressItems1;

		public String getDBEndpointId() {
			return this.dBEndpointId;
		}

		public void setDBEndpointId(String dBEndpointId) {
			this.dBEndpointId = dBEndpointId;
		}

		public String getEndpointType() {
			return this.endpointType;
		}

		public void setEndpointType(String endpointType) {
			this.endpointType = endpointType;
		}

		public List<Address2> getAddressItems1() {
			return this.addressItems1;
		}

		public void setAddressItems1(List<Address2> addressItems1) {
			this.addressItems1 = addressItems1;
		}

		public static class Address2 {

			private String connectionString;

			private String iPAddress;

			private String netType;

			private String port;

			private String vPCId;

			private String vSwitchId;

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

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}
		}
	}

	@Override
	public DescribeDBClusterMigrationResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterMigrationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
