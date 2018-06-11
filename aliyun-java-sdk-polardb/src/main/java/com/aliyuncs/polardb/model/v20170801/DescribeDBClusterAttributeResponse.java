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
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterAttributeResponse extends AcsResponse {

	private String requestId;

	private List<DBClusterAttribute> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBClusterAttribute> getItems() {
		return this.items;
	}

	public void setItems(List<DBClusterAttribute> items) {
		this.items = items;
	}

	public static class DBClusterAttribute {

		private String regionId;

		private String dBClusterNetworkType;

		private String vPCId;

		private String vSwitchId;

		private String payType;

		private String dBClusterId;

		private String dBClusterStatus;

		private String dBClusterDescription;

		private String engine;

		private String dBType;

		private String dBVersion;

		private Long dBClusterStorage;

		private Long connectionString;

		private Long port;

		private String dBClusterNetType;

		private String lockMode;

		private String lockReason;

		private String creationTime;

		private String expireTime;

		private List<DbInstance> dbInstances;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDBClusterNetworkType() {
			return this.dBClusterNetworkType;
		}

		public void setDBClusterNetworkType(String dBClusterNetworkType) {
			this.dBClusterNetworkType = dBClusterNetworkType;
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

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getDBClusterStatus() {
			return this.dBClusterStatus;
		}

		public void setDBClusterStatus(String dBClusterStatus) {
			this.dBClusterStatus = dBClusterStatus;
		}

		public String getDBClusterDescription() {
			return this.dBClusterDescription;
		}

		public void setDBClusterDescription(String dBClusterDescription) {
			this.dBClusterDescription = dBClusterDescription;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public String getDBVersion() {
			return this.dBVersion;
		}

		public void setDBVersion(String dBVersion) {
			this.dBVersion = dBVersion;
		}

		public Long getDBClusterStorage() {
			return this.dBClusterStorage;
		}

		public void setDBClusterStorage(Long dBClusterStorage) {
			this.dBClusterStorage = dBClusterStorage;
		}

		public Long getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(Long connectionString) {
			this.connectionString = connectionString;
		}

		public Long getPort() {
			return this.port;
		}

		public void setPort(Long port) {
			this.port = port;
		}

		public String getDBClusterNetType() {
			return this.dBClusterNetType;
		}

		public void setDBClusterNetType(String dBClusterNetType) {
			this.dBClusterNetType = dBClusterNetType;
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

		public List<DbInstance> getDbInstances() {
			return this.dbInstances;
		}

		public void setDbInstances(List<DbInstance> dbInstances) {
			this.dbInstances = dbInstances;
		}

		public static class DbInstance {

			private String dBInstanceId;

			private String dBInstanceStatus;

			private String dBInstanceDescription;

			private String engine;

			private String dBType;

			private String dBVersion;

			private String dBInstanceStorage;

			private String lockMode;

			private String lockReason;

			private String maintainStartTime;

			private String maintainEndTime;

			private String creationTime;

			private String dBInstanceClass;

			private String securityIPList;

			private String dBInstanceType;

			public String getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(String dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
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

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public String getDBType() {
				return this.dBType;
			}

			public void setDBType(String dBType) {
				this.dBType = dBType;
			}

			public String getDBVersion() {
				return this.dBVersion;
			}

			public void setDBVersion(String dBVersion) {
				this.dBVersion = dBVersion;
			}

			public String getDBInstanceStorage() {
				return this.dBInstanceStorage;
			}

			public void setDBInstanceStorage(String dBInstanceStorage) {
				this.dBInstanceStorage = dBInstanceStorage;
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

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getDBInstanceClass() {
				return this.dBInstanceClass;
			}

			public void setDBInstanceClass(String dBInstanceClass) {
				this.dBInstanceClass = dBInstanceClass;
			}

			public String getSecurityIPList() {
				return this.securityIPList;
			}

			public void setSecurityIPList(String securityIPList) {
				this.securityIPList = securityIPList;
			}

			public String getDBInstanceType() {
				return this.dBInstanceType;
			}

			public void setDBInstanceType(String dBInstanceType) {
				this.dBInstanceType = dBInstanceType;
			}
		}
	}

	@Override
	public DescribeDBClusterAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
