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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDBInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceAttributeResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceAttribute> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceAttribute> getItems() {
		return this.items;
	}

	public void setItems(List<DBInstanceAttribute> items) {
		this.items = items;
	}

	public static class DBInstanceAttribute {

		private String dBInstanceId;

		private String payType;

		private String dBInstanceClassType;

		private String regionId;

		private String connectionString;

		private String port;

		private String engine;

		private String engineVersion;

		private String dBInstanceClass;

		private Integer dBInstanceCpuCores;

		private Long dBInstanceMemory;

		private Long dBInstanceStorage;

		private Long dBInstanceDiskMBPS;

		private String hostType;

		private String dBInstanceGroupCount;

		private String dBInstanceNetType;

		private String dBInstanceStatus;

		private String dBInstanceDescription;

		private String lockMode;

		private String lockReason;

		private String readDelayTime;

		private String creationTime;

		private String expireTime;

		private String maintainStartTime;

		private String maintainEndTime;

		private String availabilityValue;

		private Integer maxConnections;

		private String securityIPList;

		private String zoneId;

		private String instanceNetworkType;

		private String vpcId;

		private String connectionMode;

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getDBInstanceClassType() {
			return this.dBInstanceClassType;
		}

		public void setDBInstanceClassType(String dBInstanceClassType) {
			this.dBInstanceClassType = dBInstanceClassType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getDBInstanceClass() {
			return this.dBInstanceClass;
		}

		public void setDBInstanceClass(String dBInstanceClass) {
			this.dBInstanceClass = dBInstanceClass;
		}

		public Integer getDBInstanceCpuCores() {
			return this.dBInstanceCpuCores;
		}

		public void setDBInstanceCpuCores(Integer dBInstanceCpuCores) {
			this.dBInstanceCpuCores = dBInstanceCpuCores;
		}

		public Long getDBInstanceMemory() {
			return this.dBInstanceMemory;
		}

		public void setDBInstanceMemory(Long dBInstanceMemory) {
			this.dBInstanceMemory = dBInstanceMemory;
		}

		public Long getDBInstanceStorage() {
			return this.dBInstanceStorage;
		}

		public void setDBInstanceStorage(Long dBInstanceStorage) {
			this.dBInstanceStorage = dBInstanceStorage;
		}

		public Long getDBInstanceDiskMBPS() {
			return this.dBInstanceDiskMBPS;
		}

		public void setDBInstanceDiskMBPS(Long dBInstanceDiskMBPS) {
			this.dBInstanceDiskMBPS = dBInstanceDiskMBPS;
		}

		public String getHostType() {
			return this.hostType;
		}

		public void setHostType(String hostType) {
			this.hostType = hostType;
		}

		public String getDBInstanceGroupCount() {
			return this.dBInstanceGroupCount;
		}

		public void setDBInstanceGroupCount(String dBInstanceGroupCount) {
			this.dBInstanceGroupCount = dBInstanceGroupCount;
		}

		public String getDBInstanceNetType() {
			return this.dBInstanceNetType;
		}

		public void setDBInstanceNetType(String dBInstanceNetType) {
			this.dBInstanceNetType = dBInstanceNetType;
		}

		public String getDBInstanceStatus() {
			return this.dBInstanceStatus;
		}

		public void setDBInstanceStatus(String dBInstanceStatus) {
			this.dBInstanceStatus = dBInstanceStatus;
		}

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getReadDelayTime() {
			return this.readDelayTime;
		}

		public void setReadDelayTime(String readDelayTime) {
			this.readDelayTime = readDelayTime;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getMaintainStartTime() {
			return this.maintainStartTime;
		}

		public void setMaintainStartTime(String maintainStartTime) {
			this.maintainStartTime = maintainStartTime;
		}

		public String getMaintainEndTime() {
			return this.maintainEndTime;
		}

		public void setMaintainEndTime(String maintainEndTime) {
			this.maintainEndTime = maintainEndTime;
		}

		public String getAvailabilityValue() {
			return this.availabilityValue;
		}

		public void setAvailabilityValue(String availabilityValue) {
			this.availabilityValue = availabilityValue;
		}

		public Integer getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Integer maxConnections) {
			this.maxConnections = maxConnections;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getConnectionMode() {
			return this.connectionMode;
		}

		public void setConnectionMode(String connectionMode) {
			this.connectionMode = connectionMode;
		}
	}

	@Override
	public DescribeDBInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
