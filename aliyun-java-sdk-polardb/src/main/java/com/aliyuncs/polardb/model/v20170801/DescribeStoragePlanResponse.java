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
import com.aliyuncs.polardb.transform.v20170801.DescribeStoragePlanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStoragePlanResponse extends AcsResponse {

	private String requestId;

	private Long totalRecordCount;

	private Long pageSize;

	private Long pageNumber;

	private List<DescribeStoragePlanResponses> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<DescribeStoragePlanResponses> getItems() {
		return this.items;
	}

	public void setItems(List<DescribeStoragePlanResponses> items) {
		this.items = items;
	}

	public static class DescribeStoragePlanResponses {

		private String prodCode;

		private String aliUid;

		private String commodityCode;

		private String templateName;

		private String storageType;

		private String status;

		private String startTimes;

		private String endTimes;

		private String purchaseTimes;

		private String instanceId;

		private String initCapacityViewValue;

		private String initCapaCityViewUnit;

		private String periodCapacityViewValue;

		private String periodCapaCityViewUnit;

		private String periodTime;

		public String getProdCode() {
			return this.prodCode;
		}

		public void setProdCode(String prodCode) {
			this.prodCode = prodCode;
		}

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStartTimes() {
			return this.startTimes;
		}

		public void setStartTimes(String startTimes) {
			this.startTimes = startTimes;
		}

		public String getEndTimes() {
			return this.endTimes;
		}

		public void setEndTimes(String endTimes) {
			this.endTimes = endTimes;
		}

		public String getPurchaseTimes() {
			return this.purchaseTimes;
		}

		public void setPurchaseTimes(String purchaseTimes) {
			this.purchaseTimes = purchaseTimes;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInitCapacityViewValue() {
			return this.initCapacityViewValue;
		}

		public void setInitCapacityViewValue(String initCapacityViewValue) {
			this.initCapacityViewValue = initCapacityViewValue;
		}

		public String getInitCapaCityViewUnit() {
			return this.initCapaCityViewUnit;
		}

		public void setInitCapaCityViewUnit(String initCapaCityViewUnit) {
			this.initCapaCityViewUnit = initCapaCityViewUnit;
		}

		public String getPeriodCapacityViewValue() {
			return this.periodCapacityViewValue;
		}

		public void setPeriodCapacityViewValue(String periodCapacityViewValue) {
			this.periodCapacityViewValue = periodCapacityViewValue;
		}

		public String getPeriodCapaCityViewUnit() {
			return this.periodCapaCityViewUnit;
		}

		public void setPeriodCapaCityViewUnit(String periodCapaCityViewUnit) {
			this.periodCapaCityViewUnit = periodCapaCityViewUnit;
		}

		public String getPeriodTime() {
			return this.periodTime;
		}

		public void setPeriodTime(String periodTime) {
			this.periodTime = periodTime;
		}
	}

	@Override
	public DescribeStoragePlanResponse getInstance(UnmarshallerContext context) {
		return	DescribeStoragePlanResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
