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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetDasProServiceUsageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDasProServiceUsageResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Long code;

	private Boolean success;

	private List<Unit> data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Unit> getData() {
		return this.data;
	}

	public void setData(List<Unit> data) {
		this.data = data;
	}

	public static class Unit {

		private Double storageFreeQuotaInMB;

		private String ip;

		private Long custinsId;

		private String userId;

		private String uuid;

		private Long expireTime;

		private String instanceId;

		private Long storageUsed;

		private String engine;

		private String instanceAlias;

		private Integer port;

		private String vpcId;

		private String commodityInstanceId;

		private Long startTime;

		private Boolean isSpare;

		private String region;

		private String serviceUnitId;

		private String sqlRetention;

		public Double getStorageFreeQuotaInMB() {
			return this.storageFreeQuotaInMB;
		}

		public void setStorageFreeQuotaInMB(Double storageFreeQuotaInMB) {
			this.storageFreeQuotaInMB = storageFreeQuotaInMB;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Long getCustinsId() {
			return this.custinsId;
		}

		public void setCustinsId(Long custinsId) {
			this.custinsId = custinsId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Long getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(Long expireTime) {
			this.expireTime = expireTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getStorageUsed() {
			return this.storageUsed;
		}

		public void setStorageUsed(Long storageUsed) {
			this.storageUsed = storageUsed;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getInstanceAlias() {
			return this.instanceAlias;
		}

		public void setInstanceAlias(String instanceAlias) {
			this.instanceAlias = instanceAlias;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCommodityInstanceId() {
			return this.commodityInstanceId;
		}

		public void setCommodityInstanceId(String commodityInstanceId) {
			this.commodityInstanceId = commodityInstanceId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Boolean getIsSpare() {
			return this.isSpare;
		}

		public void setIsSpare(Boolean isSpare) {
			this.isSpare = isSpare;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getServiceUnitId() {
			return this.serviceUnitId;
		}

		public void setServiceUnitId(String serviceUnitId) {
			this.serviceUnitId = serviceUnitId;
		}

		public String getSqlRetention() {
			return this.sqlRetention;
		}

		public void setSqlRetention(String sqlRetention) {
			this.sqlRetention = sqlRetention;
		}
	}

	@Override
	public GetDasProServiceUsageResponse getInstance(UnmarshallerContext context) {
		return	GetDasProServiceUsageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
