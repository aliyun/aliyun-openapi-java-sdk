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

package com.aliyuncs.hitsdb.model.v20170601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20170601.DescribeHiTSDBInstanceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHiTSDBInstanceListResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<Instance> instanceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Instance> getInstanceList() {
		return this.instanceList;
	}

	public void setInstanceList(List<Instance> instanceList) {
		this.instanceList = instanceList;
	}

	public static class Instance {

		private String instanceId;

		private String instanceAlias;

		private String instanceDescription;

		private String userId;

		private String regionId;

		private String zoneId;

		private String instanceStatus;

		private String chargeType;

		private String networkType;

		private String gmtCreated;

		private String gmtExpire;

		private String instanceClass;

		private String instanceStorage;

		private String instanceTps;

		private String lockMode;

		private String engineType;

		private String maxSeriesPerDatabase;

		private String vpcId;

		private String vswitchId;

		private String status;

		private String paymentType;

		private Long createTime;

		private Long expiredTime;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceAlias() {
			return this.instanceAlias;
		}

		public void setInstanceAlias(String instanceAlias) {
			this.instanceAlias = instanceAlias;
		}

		public String getInstanceDescription() {
			return this.instanceDescription;
		}

		public void setInstanceDescription(String instanceDescription) {
			this.instanceDescription = instanceDescription;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
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

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtExpire() {
			return this.gmtExpire;
		}

		public void setGmtExpire(String gmtExpire) {
			this.gmtExpire = gmtExpire;
		}

		public String getInstanceClass() {
			return this.instanceClass;
		}

		public void setInstanceClass(String instanceClass) {
			this.instanceClass = instanceClass;
		}

		public String getInstanceStorage() {
			return this.instanceStorage;
		}

		public void setInstanceStorage(String instanceStorage) {
			this.instanceStorage = instanceStorage;
		}

		public String getInstanceTps() {
			return this.instanceTps;
		}

		public void setInstanceTps(String instanceTps) {
			this.instanceTps = instanceTps;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getEngineType() {
			return this.engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		public String getMaxSeriesPerDatabase() {
			return this.maxSeriesPerDatabase;
		}

		public void setMaxSeriesPerDatabase(String maxSeriesPerDatabase) {
			this.maxSeriesPerDatabase = maxSeriesPerDatabase;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPaymentType() {
			return this.paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(Long expiredTime) {
			this.expiredTime = expiredTime;
		}
	}

	@Override
	public DescribeHiTSDBInstanceListResponse getInstance(UnmarshallerContext context) {
		return	DescribeHiTSDBInstanceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
