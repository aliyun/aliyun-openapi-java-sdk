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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribePolarxDbInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolarxDbInstancesResponse extends AcsResponse {

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

		private String description;

		private String payType;

		private String createTime;

		private String expireTime;

		private String regionId;

		private String zoneId;

		private String network;

		private String vPCId;

		private String engine;

		private String dBType;

		private String dBVersion;

		private String status;

		private String statusDesc;

		private String lockMode;

		private String lockReason;

		private Integer nodeCount;

		private String nodeClass;

		private Integer storageUsed;

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getNetwork() {
			return this.network;
		}

		public void setNetwork(String network) {
			this.network = network;
		}

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusDesc() {
			return this.statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
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

		public Integer getNodeCount() {
			return this.nodeCount;
		}

		public void setNodeCount(Integer nodeCount) {
			this.nodeCount = nodeCount;
		}

		public String getNodeClass() {
			return this.nodeClass;
		}

		public void setNodeClass(String nodeClass) {
			this.nodeClass = nodeClass;
		}

		public Integer getStorageUsed() {
			return this.storageUsed;
		}

		public void setStorageUsed(Integer storageUsed) {
			this.storageUsed = storageUsed;
		}
	}

	@Override
	public DescribePolarxDbInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribePolarxDbInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
