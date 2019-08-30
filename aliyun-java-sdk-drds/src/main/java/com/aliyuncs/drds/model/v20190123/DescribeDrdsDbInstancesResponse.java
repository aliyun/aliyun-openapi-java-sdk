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
import com.aliyuncs.drds.transform.v20190123.DescribeDrdsDbInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsDbInstancesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String pageNumber;

	private String pageSize;

	private String total;

	private List<DbInstance> dbInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public List<DbInstance> getDbInstances() {
		return this.dbInstances;
	}

	public void setDbInstances(List<DbInstance> dbInstances) {
		this.dbInstances = dbInstances;
	}

	public static class DbInstance {

		private String dBInstanceId;

		private String connectUrl;

		private Integer port;

		private String dBInstanceStatus;

		private String dbInstType;

		private Integer readWeight;

		private String networkType;

		private String engine;

		private String engineVersion;

		private String rdsInstType;

		private String payType;

		private String expireTime;

		private Integer remainDays;

		private List<ReadOnlyInstance> readOnlyInstances;

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getConnectUrl() {
			return this.connectUrl;
		}

		public void setConnectUrl(String connectUrl) {
			this.connectUrl = connectUrl;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getDBInstanceStatus() {
			return this.dBInstanceStatus;
		}

		public void setDBInstanceStatus(String dBInstanceStatus) {
			this.dBInstanceStatus = dBInstanceStatus;
		}

		public String getDbInstType() {
			return this.dbInstType;
		}

		public void setDbInstType(String dbInstType) {
			this.dbInstType = dbInstType;
		}

		public Integer getReadWeight() {
			return this.readWeight;
		}

		public void setReadWeight(Integer readWeight) {
			this.readWeight = readWeight;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
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

		public String getRdsInstType() {
			return this.rdsInstType;
		}

		public void setRdsInstType(String rdsInstType) {
			this.rdsInstType = rdsInstType;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Integer getRemainDays() {
			return this.remainDays;
		}

		public void setRemainDays(Integer remainDays) {
			this.remainDays = remainDays;
		}

		public List<ReadOnlyInstance> getReadOnlyInstances() {
			return this.readOnlyInstances;
		}

		public void setReadOnlyInstances(List<ReadOnlyInstance> readOnlyInstances) {
			this.readOnlyInstances = readOnlyInstances;
		}

		public static class ReadOnlyInstance {

			private String instanceName;

			private String connectUrl;

			private Integer port;

			private String dBInstanceStatus;

			private String dbInstType;

			private Integer readWeight;

			private String networkType;

			private String engine;

			private String engineVersion;

			private String rdsInstType;

			private String payType;

			private String expireTime;

			private Integer remainDays;

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getConnectUrl() {
				return this.connectUrl;
			}

			public void setConnectUrl(String connectUrl) {
				this.connectUrl = connectUrl;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getDBInstanceStatus() {
				return this.dBInstanceStatus;
			}

			public void setDBInstanceStatus(String dBInstanceStatus) {
				this.dBInstanceStatus = dBInstanceStatus;
			}

			public String getDbInstType() {
				return this.dbInstType;
			}

			public void setDbInstType(String dbInstType) {
				this.dbInstType = dbInstType;
			}

			public Integer getReadWeight() {
				return this.readWeight;
			}

			public void setReadWeight(Integer readWeight) {
				this.readWeight = readWeight;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
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

			public String getRdsInstType() {
				return this.rdsInstType;
			}

			public void setRdsInstType(String rdsInstType) {
				this.rdsInstType = rdsInstType;
			}

			public String getPayType() {
				return this.payType;
			}

			public void setPayType(String payType) {
				this.payType = payType;
			}

			public String getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(String expireTime) {
				this.expireTime = expireTime;
			}

			public Integer getRemainDays() {
				return this.remainDays;
			}

			public void setRemainDays(Integer remainDays) {
				this.remainDays = remainDays;
			}
		}
	}

	@Override
	public DescribeDrdsDbInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsDbInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
