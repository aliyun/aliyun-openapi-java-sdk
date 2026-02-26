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

	private String comment;

	private String requestId;

	private String expiredTime;

	private String dBClusterId;

	private String topologies;

	private String rdsReadWriteMode;

	private String sourceRDSDBInstanceId;

	private String dBClusterReadWriteMode;

	private Integer delayedSeconds;

	private String migrationStatus;

	private String dtsInstanceId;

	private String srcDbType;

	private String migrationSwitch;

	private String migrationDtsJobEndpoint;

	private String dstBinlogPosition;

	private String srcBinlogPosition;

	private String migrationProgress;

	private List<DBClusterEndpoint> dBClusterEndpointList;

	private List<RdsEndpoint> rdsEndpointList;

	private List<SrcDtsJob> srcDtsJobList;

	private List<SrcBidirectionalDtsJob> srcBidirectionalDtsJobList;

	private List<DstDtsJob> dstDtsJobList;

	private List<DstBidirectionalDtsJob> dstBidirectionalDtsJobList;

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getTopologies() {
		return this.topologies;
	}

	public void setTopologies(String topologies) {
		this.topologies = topologies;
	}

	public String getRdsReadWriteMode() {
		return this.rdsReadWriteMode;
	}

	public void setRdsReadWriteMode(String rdsReadWriteMode) {
		this.rdsReadWriteMode = rdsReadWriteMode;
	}

	public String getSourceRDSDBInstanceId() {
		return this.sourceRDSDBInstanceId;
	}

	public void setSourceRDSDBInstanceId(String sourceRDSDBInstanceId) {
		this.sourceRDSDBInstanceId = sourceRDSDBInstanceId;
	}

	public String getDBClusterReadWriteMode() {
		return this.dBClusterReadWriteMode;
	}

	public void setDBClusterReadWriteMode(String dBClusterReadWriteMode) {
		this.dBClusterReadWriteMode = dBClusterReadWriteMode;
	}

	public Integer getDelayedSeconds() {
		return this.delayedSeconds;
	}

	public void setDelayedSeconds(Integer delayedSeconds) {
		this.delayedSeconds = delayedSeconds;
	}

	public String getMigrationStatus() {
		return this.migrationStatus;
	}

	public void setMigrationStatus(String migrationStatus) {
		this.migrationStatus = migrationStatus;
	}

	public String getDtsInstanceId() {
		return this.dtsInstanceId;
	}

	public void setDtsInstanceId(String dtsInstanceId) {
		this.dtsInstanceId = dtsInstanceId;
	}

	public String getSrcDbType() {
		return this.srcDbType;
	}

	public void setSrcDbType(String srcDbType) {
		this.srcDbType = srcDbType;
	}

	public String getMigrationSwitch() {
		return this.migrationSwitch;
	}

	public void setMigrationSwitch(String migrationSwitch) {
		this.migrationSwitch = migrationSwitch;
	}

	public String getMigrationDtsJobEndpoint() {
		return this.migrationDtsJobEndpoint;
	}

	public void setMigrationDtsJobEndpoint(String migrationDtsJobEndpoint) {
		this.migrationDtsJobEndpoint = migrationDtsJobEndpoint;
	}

	public String getDstBinlogPosition() {
		return this.dstBinlogPosition;
	}

	public void setDstBinlogPosition(String dstBinlogPosition) {
		this.dstBinlogPosition = dstBinlogPosition;
	}

	public String getSrcBinlogPosition() {
		return this.srcBinlogPosition;
	}

	public void setSrcBinlogPosition(String srcBinlogPosition) {
		this.srcBinlogPosition = srcBinlogPosition;
	}

	public String getMigrationProgress() {
		return this.migrationProgress;
	}

	public void setMigrationProgress(String migrationProgress) {
		this.migrationProgress = migrationProgress;
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

	public List<SrcDtsJob> getSrcDtsJobList() {
		return this.srcDtsJobList;
	}

	public void setSrcDtsJobList(List<SrcDtsJob> srcDtsJobList) {
		this.srcDtsJobList = srcDtsJobList;
	}

	public List<SrcBidirectionalDtsJob> getSrcBidirectionalDtsJobList() {
		return this.srcBidirectionalDtsJobList;
	}

	public void setSrcBidirectionalDtsJobList(List<SrcBidirectionalDtsJob> srcBidirectionalDtsJobList) {
		this.srcBidirectionalDtsJobList = srcBidirectionalDtsJobList;
	}

	public List<DstDtsJob> getDstDtsJobList() {
		return this.dstDtsJobList;
	}

	public void setDstDtsJobList(List<DstDtsJob> dstDtsJobList) {
		this.dstDtsJobList = dstDtsJobList;
	}

	public List<DstBidirectionalDtsJob> getDstBidirectionalDtsJobList() {
		return this.dstBidirectionalDtsJobList;
	}

	public void setDstBidirectionalDtsJobList(List<DstBidirectionalDtsJob> dstBidirectionalDtsJobList) {
		this.dstBidirectionalDtsJobList = dstBidirectionalDtsJobList;
	}

	public static class DBClusterEndpoint {

		private String dBEndpointId;

		private String endpointType;

		private String readWriteMode;

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

		public String getReadWriteMode() {
			return this.readWriteMode;
		}

		public void setReadWriteMode(String readWriteMode) {
			this.readWriteMode = readWriteMode;
		}

		public List<Address> getAddressItems() {
			return this.addressItems;
		}

		public void setAddressItems(List<Address> addressItems) {
			this.addressItems = addressItems;
		}

		public static class Address {

			private String vSwitchId;

			private String connectionString;

			private String netType;

			private String port;

			private String vPCId;

			private String iPAddress;

			private String sSLEnabled;

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

			public String getIPAddress() {
				return this.iPAddress;
			}

			public void setIPAddress(String iPAddress) {
				this.iPAddress = iPAddress;
			}

			public String getSSLEnabled() {
				return this.sSLEnabled;
			}

			public void setSSLEnabled(String sSLEnabled) {
				this.sSLEnabled = sSLEnabled;
			}
		}
	}

	public static class RdsEndpoint {

		private String dBEndpointId;

		private String endpointType;

		private String custinsType;

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

		public String getCustinsType() {
			return this.custinsType;
		}

		public void setCustinsType(String custinsType) {
			this.custinsType = custinsType;
		}

		public List<Address2> getAddressItems1() {
			return this.addressItems1;
		}

		public void setAddressItems1(List<Address2> addressItems1) {
			this.addressItems1 = addressItems1;
		}

		public static class Address2 {

			private String vSwitchId;

			private String connectionString;

			private String netType;

			private String port;

			private String vPCId;

			private String iPAddress;

			private String sSLEnabled;

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

			public String getIPAddress() {
				return this.iPAddress;
			}

			public void setIPAddress(String iPAddress) {
				this.iPAddress = iPAddress;
			}

			public String getSSLEnabled() {
				return this.sSLEnabled;
			}

			public void setSSLEnabled(String sSLEnabled) {
				this.sSLEnabled = sSLEnabled;
			}
		}
	}

	public static class SrcDtsJob {

		private String dtsJobId;

		private String dtsJobName;

		private String dtsInstanceID;

		private String dtsJobDirection;

		private String status;

		private String sourceEndpoint;

		private String destinationEndpoint;

		public String getDtsJobId() {
			return this.dtsJobId;
		}

		public void setDtsJobId(String dtsJobId) {
			this.dtsJobId = dtsJobId;
		}

		public String getDtsJobName() {
			return this.dtsJobName;
		}

		public void setDtsJobName(String dtsJobName) {
			this.dtsJobName = dtsJobName;
		}

		public String getDtsInstanceID() {
			return this.dtsInstanceID;
		}

		public void setDtsInstanceID(String dtsInstanceID) {
			this.dtsInstanceID = dtsInstanceID;
		}

		public String getDtsJobDirection() {
			return this.dtsJobDirection;
		}

		public void setDtsJobDirection(String dtsJobDirection) {
			this.dtsJobDirection = dtsJobDirection;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSourceEndpoint() {
			return this.sourceEndpoint;
		}

		public void setSourceEndpoint(String sourceEndpoint) {
			this.sourceEndpoint = sourceEndpoint;
		}

		public String getDestinationEndpoint() {
			return this.destinationEndpoint;
		}

		public void setDestinationEndpoint(String destinationEndpoint) {
			this.destinationEndpoint = destinationEndpoint;
		}
	}

	public static class SrcBidirectionalDtsJob {

		private String reverseDtsJobId;

		private String dtsJobName;

		private String dtsInstanceId;

		private String dtsJobDirection;

		private String status;

		private String sourceEndpoint;

		private String destinationEndpoint;

		private String dtsJobId;

		public String getReverseDtsJobId() {
			return this.reverseDtsJobId;
		}

		public void setReverseDtsJobId(String reverseDtsJobId) {
			this.reverseDtsJobId = reverseDtsJobId;
		}

		public String getDtsJobName() {
			return this.dtsJobName;
		}

		public void setDtsJobName(String dtsJobName) {
			this.dtsJobName = dtsJobName;
		}

		public String getDtsInstanceId() {
			return this.dtsInstanceId;
		}

		public void setDtsInstanceId(String dtsInstanceId) {
			this.dtsInstanceId = dtsInstanceId;
		}

		public String getDtsJobDirection() {
			return this.dtsJobDirection;
		}

		public void setDtsJobDirection(String dtsJobDirection) {
			this.dtsJobDirection = dtsJobDirection;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSourceEndpoint() {
			return this.sourceEndpoint;
		}

		public void setSourceEndpoint(String sourceEndpoint) {
			this.sourceEndpoint = sourceEndpoint;
		}

		public String getDestinationEndpoint() {
			return this.destinationEndpoint;
		}

		public void setDestinationEndpoint(String destinationEndpoint) {
			this.destinationEndpoint = destinationEndpoint;
		}

		public String getDtsJobId() {
			return this.dtsJobId;
		}

		public void setDtsJobId(String dtsJobId) {
			this.dtsJobId = dtsJobId;
		}
	}

	public static class DstDtsJob {

		private String reverseDtsJobId;

		private String dtsJobName;

		private String dtsInstanceId;

		private String dtsJobDirection;

		private String status;

		private String sourceEndpoint;

		private String destinationEndpoint;

		private String dtsJobId;

		public String getReverseDtsJobId() {
			return this.reverseDtsJobId;
		}

		public void setReverseDtsJobId(String reverseDtsJobId) {
			this.reverseDtsJobId = reverseDtsJobId;
		}

		public String getDtsJobName() {
			return this.dtsJobName;
		}

		public void setDtsJobName(String dtsJobName) {
			this.dtsJobName = dtsJobName;
		}

		public String getDtsInstanceId() {
			return this.dtsInstanceId;
		}

		public void setDtsInstanceId(String dtsInstanceId) {
			this.dtsInstanceId = dtsInstanceId;
		}

		public String getDtsJobDirection() {
			return this.dtsJobDirection;
		}

		public void setDtsJobDirection(String dtsJobDirection) {
			this.dtsJobDirection = dtsJobDirection;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSourceEndpoint() {
			return this.sourceEndpoint;
		}

		public void setSourceEndpoint(String sourceEndpoint) {
			this.sourceEndpoint = sourceEndpoint;
		}

		public String getDestinationEndpoint() {
			return this.destinationEndpoint;
		}

		public void setDestinationEndpoint(String destinationEndpoint) {
			this.destinationEndpoint = destinationEndpoint;
		}

		public String getDtsJobId() {
			return this.dtsJobId;
		}

		public void setDtsJobId(String dtsJobId) {
			this.dtsJobId = dtsJobId;
		}
	}

	public static class DstBidirectionalDtsJob {

		private String reverseDtsJobId;

		private String dtsJobName;

		private String dtsInstanceId;

		private String dtsJobDirection;

		private String status;

		private String sourceEndpoint;

		private String destinationEndpoint;

		private String dtsJobId;

		public String getReverseDtsJobId() {
			return this.reverseDtsJobId;
		}

		public void setReverseDtsJobId(String reverseDtsJobId) {
			this.reverseDtsJobId = reverseDtsJobId;
		}

		public String getDtsJobName() {
			return this.dtsJobName;
		}

		public void setDtsJobName(String dtsJobName) {
			this.dtsJobName = dtsJobName;
		}

		public String getDtsInstanceId() {
			return this.dtsInstanceId;
		}

		public void setDtsInstanceId(String dtsInstanceId) {
			this.dtsInstanceId = dtsInstanceId;
		}

		public String getDtsJobDirection() {
			return this.dtsJobDirection;
		}

		public void setDtsJobDirection(String dtsJobDirection) {
			this.dtsJobDirection = dtsJobDirection;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSourceEndpoint() {
			return this.sourceEndpoint;
		}

		public void setSourceEndpoint(String sourceEndpoint) {
			this.sourceEndpoint = sourceEndpoint;
		}

		public String getDestinationEndpoint() {
			return this.destinationEndpoint;
		}

		public void setDestinationEndpoint(String destinationEndpoint) {
			this.destinationEndpoint = destinationEndpoint;
		}

		public String getDtsJobId() {
			return this.dtsJobId;
		}

		public void setDtsJobId(String dtsJobId) {
			this.dtsJobId = dtsJobId;
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
