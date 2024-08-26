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

package com.aliyuncs.gdb.model.v20190903;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gdb.transform.v20190903.DescribeDBInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceAttributeResponse extends AcsResponse {

	private String requestId;

	private List<DBInstance> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstance> getItems() {
		return this.items;
	}

	public void setItems(List<DBInstance> items) {
		this.items = items;
	}

	public static class DBInstance {

		private String vpcId;

		private String creationTime;

		private Long dBNodeCount;

		private String dBInstanceStorageType;

		private Long dBInstanceMemory;

		private String expired;

		private String maintainTime;

		private String payType;

		private String publicConnectionString;

		private String port;

		private String lockMode;

		private String connectionString;

		private String masterInstanceId;

		private String dBInstanceDescription;

		private String dBInstanceNetworkType;

		private String dBInstanceCPU;

		private String currentMinorVersion;

		private String expireTime;

		private Long dBNodeStorage;

		private String dBInstanceType;

		private String dBNodeClass;

		private String latestMinorVersion;

		private String lockReason;

		private String dBInstanceStatus;

		private String regionId;

		private Integer publicPort;

		private String dBVersion;

		private String vSwitchId;

		private String zoneId;

		private String dBInstanceId;

		private String category;

		private String resourceGroupId;

		private List<Tag> tags;

		private List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Long getDBNodeCount() {
			return this.dBNodeCount;
		}

		public void setDBNodeCount(Long dBNodeCount) {
			this.dBNodeCount = dBNodeCount;
		}

		public String getDBInstanceStorageType() {
			return this.dBInstanceStorageType;
		}

		public void setDBInstanceStorageType(String dBInstanceStorageType) {
			this.dBInstanceStorageType = dBInstanceStorageType;
		}

		public Long getDBInstanceMemory() {
			return this.dBInstanceMemory;
		}

		public void setDBInstanceMemory(Long dBInstanceMemory) {
			this.dBInstanceMemory = dBInstanceMemory;
		}

		public String getExpired() {
			return this.expired;
		}

		public void setExpired(String expired) {
			this.expired = expired;
		}

		public String getMaintainTime() {
			return this.maintainTime;
		}

		public void setMaintainTime(String maintainTime) {
			this.maintainTime = maintainTime;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getPublicConnectionString() {
			return this.publicConnectionString;
		}

		public void setPublicConnectionString(String publicConnectionString) {
			this.publicConnectionString = publicConnectionString;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getMasterInstanceId() {
			return this.masterInstanceId;
		}

		public void setMasterInstanceId(String masterInstanceId) {
			this.masterInstanceId = masterInstanceId;
		}

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}

		public String getDBInstanceNetworkType() {
			return this.dBInstanceNetworkType;
		}

		public void setDBInstanceNetworkType(String dBInstanceNetworkType) {
			this.dBInstanceNetworkType = dBInstanceNetworkType;
		}

		public String getDBInstanceCPU() {
			return this.dBInstanceCPU;
		}

		public void setDBInstanceCPU(String dBInstanceCPU) {
			this.dBInstanceCPU = dBInstanceCPU;
		}

		public String getCurrentMinorVersion() {
			return this.currentMinorVersion;
		}

		public void setCurrentMinorVersion(String currentMinorVersion) {
			this.currentMinorVersion = currentMinorVersion;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Long getDBNodeStorage() {
			return this.dBNodeStorage;
		}

		public void setDBNodeStorage(Long dBNodeStorage) {
			this.dBNodeStorage = dBNodeStorage;
		}

		public String getDBInstanceType() {
			return this.dBInstanceType;
		}

		public void setDBInstanceType(String dBInstanceType) {
			this.dBInstanceType = dBInstanceType;
		}

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
		}

		public String getLatestMinorVersion() {
			return this.latestMinorVersion;
		}

		public void setLatestMinorVersion(String latestMinorVersion) {
			this.latestMinorVersion = latestMinorVersion;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getDBInstanceStatus() {
			return this.dBInstanceStatus;
		}

		public void setDBInstanceStatus(String dBInstanceStatus) {
			this.dBInstanceStatus = dBInstanceStatus;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getPublicPort() {
			return this.publicPort;
		}

		public void setPublicPort(Integer publicPort) {
			this.publicPort = publicPort;
		}

		public String getDBVersion() {
			return this.dBVersion;
		}

		public void setDBVersion(String dBVersion) {
			this.dBVersion = dBVersion;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<ReadOnlyDBInstanceId> getReadOnlyDBInstanceIds() {
			return this.readOnlyDBInstanceIds;
		}

		public void setReadOnlyDBInstanceIds(List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds) {
			this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class ReadOnlyDBInstanceId {

			private String dBInstanceId;

			public String getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(String dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
			}
		}
	}

	@Override
	public DescribeDBInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
