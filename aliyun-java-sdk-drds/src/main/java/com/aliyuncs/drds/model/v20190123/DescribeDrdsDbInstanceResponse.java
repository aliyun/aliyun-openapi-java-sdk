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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeDrdsDbInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsDbInstanceResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private DbInstance dbInstance;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DbInstance getDbInstance() {
		return this.dbInstance;
	}

	public void setDbInstance(DbInstance dbInstance) {
		this.dbInstance = dbInstance;
	}

	public static class DbInstance {

		private String expireTime;

		private String payType;

		private String dBInstanceStatus;

		private String networkType;

		private Integer port;

		private String engineVersion;

		private String dmInstanceId;

		private String connectUrl;

		private Integer readWeight;

		private String rdsInstType;

		private String remainDays;

		private String dBInstanceId;

		private String dbInstType;

		private String engine;

		private List<ReadOnlyInstance> readOnlyInstances;

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getDBInstanceStatus() {
			return this.dBInstanceStatus;
		}

		public void setDBInstanceStatus(String dBInstanceStatus) {
			this.dBInstanceStatus = dBInstanceStatus;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getDmInstanceId() {
			return this.dmInstanceId;
		}

		public void setDmInstanceId(String dmInstanceId) {
			this.dmInstanceId = dmInstanceId;
		}

		public String getConnectUrl() {
			return this.connectUrl;
		}

		public void setConnectUrl(String connectUrl) {
			this.connectUrl = connectUrl;
		}

		public Integer getReadWeight() {
			return this.readWeight;
		}

		public void setReadWeight(Integer readWeight) {
			this.readWeight = readWeight;
		}

		public String getRdsInstType() {
			return this.rdsInstType;
		}

		public void setRdsInstType(String rdsInstType) {
			this.rdsInstType = rdsInstType;
		}

		public String getRemainDays() {
			return this.remainDays;
		}

		public void setRemainDays(String remainDays) {
			this.remainDays = remainDays;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getDbInstType() {
			return this.dbInstType;
		}

		public void setDbInstType(String dbInstType) {
			this.dbInstType = dbInstType;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public List<ReadOnlyInstance> getReadOnlyInstances() {
			return this.readOnlyInstances;
		}

		public void setReadOnlyInstances(List<ReadOnlyInstance> readOnlyInstances) {
			this.readOnlyInstances = readOnlyInstances;
		}

		public static class ReadOnlyInstance {

			private String expireTime;

			private String payType;

			private Integer versionAction;

			private String dBInstanceStatus;

			private String networkType;

			private Integer port;

			private String engineVersion;

			private String dmInstanceId;

			private String connectUrl;

			private Integer readWeight;

			private String rdsInstType;

			private String remainDays;

			private String dBInstanceId;

			private String dbInstType;

			private String engine;

			public String getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(String expireTime) {
				this.expireTime = expireTime;
			}

			public String getPayType() {
				return this.payType;
			}

			public void setPayType(String payType) {
				this.payType = payType;
			}

			public Integer getVersionAction() {
				return this.versionAction;
			}

			public void setVersionAction(Integer versionAction) {
				this.versionAction = versionAction;
			}

			public String getDBInstanceStatus() {
				return this.dBInstanceStatus;
			}

			public void setDBInstanceStatus(String dBInstanceStatus) {
				this.dBInstanceStatus = dBInstanceStatus;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getEngineVersion() {
				return this.engineVersion;
			}

			public void setEngineVersion(String engineVersion) {
				this.engineVersion = engineVersion;
			}

			public String getDmInstanceId() {
				return this.dmInstanceId;
			}

			public void setDmInstanceId(String dmInstanceId) {
				this.dmInstanceId = dmInstanceId;
			}

			public String getConnectUrl() {
				return this.connectUrl;
			}

			public void setConnectUrl(String connectUrl) {
				this.connectUrl = connectUrl;
			}

			public Integer getReadWeight() {
				return this.readWeight;
			}

			public void setReadWeight(Integer readWeight) {
				this.readWeight = readWeight;
			}

			public String getRdsInstType() {
				return this.rdsInstType;
			}

			public void setRdsInstType(String rdsInstType) {
				this.rdsInstType = rdsInstType;
			}

			public String getRemainDays() {
				return this.remainDays;
			}

			public void setRemainDays(String remainDays) {
				this.remainDays = remainDays;
			}

			public String getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(String dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
			}

			public String getDbInstType() {
				return this.dbInstType;
			}

			public void setDbInstType(String dbInstType) {
				this.dbInstType = dbInstType;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}
		}
	}

	@Override
	public DescribeDrdsDbInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsDbInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
