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
import com.aliyuncs.drds.transform.v20190123.DescribeDrdsRdsInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsRdsInstancesResponse extends AcsResponse {

	private String pageSize;

	private String pageNumber;

	private String requestId;

	private String total;

	private Boolean success;

	private List<DbInstance> dbInstances;

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DbInstance> getDbInstances() {
		return this.dbInstances;
	}

	public void setDbInstances(List<DbInstance> dbInstances) {
		this.dbInstances = dbInstances;
	}

	public static class DbInstance {

		private String dBInstanceCPU;

		private String expireTime;

		private Long dBInstanceMemory;

		private String payType;

		private String dBInstanceStatus;

		private String networkType;

		private Integer port;

		private String engineVersion;

		private String dmInstanceId;

		private Long dBInstanceStorage;

		private String connectUrl;

		private Integer readWeight;

		private String rdsInstType;

		private Integer remainDays;

		private String dBInstanceClassType;

		private String dBInstanceId;

		private String engine;

		private String dbInstType;

		private Integer lockMode;

		private String lockReason;

		public String getDBInstanceCPU() {
			return this.dBInstanceCPU;
		}

		public void setDBInstanceCPU(String dBInstanceCPU) {
			this.dBInstanceCPU = dBInstanceCPU;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Long getDBInstanceMemory() {
			return this.dBInstanceMemory;
		}

		public void setDBInstanceMemory(Long dBInstanceMemory) {
			this.dBInstanceMemory = dBInstanceMemory;
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

		public Long getDBInstanceStorage() {
			return this.dBInstanceStorage;
		}

		public void setDBInstanceStorage(Long dBInstanceStorage) {
			this.dBInstanceStorage = dBInstanceStorage;
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

		public Integer getRemainDays() {
			return this.remainDays;
		}

		public void setRemainDays(Integer remainDays) {
			this.remainDays = remainDays;
		}

		public String getDBInstanceClassType() {
			return this.dBInstanceClassType;
		}

		public void setDBInstanceClassType(String dBInstanceClassType) {
			this.dBInstanceClassType = dBInstanceClassType;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getDbInstType() {
			return this.dbInstType;
		}

		public void setDbInstType(String dbInstType) {
			this.dbInstType = dbInstType;
		}

		public Integer getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(Integer lockMode) {
			this.lockMode = lockMode;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}
	}

	@Override
	public DescribeDrdsRdsInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsRdsInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
