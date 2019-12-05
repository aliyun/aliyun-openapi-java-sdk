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

package com.aliyuncs.openanalytics_open.model.v20180619;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openanalytics_open.transform.v20180619.QueryDiscountListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDiscountListResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String planID;

		private String gmtCreate;

		private Long gmtCreateValue;

		private String discountType;

		private String discountConfig;

		private Integer payType;

		private String payAmount;

		private Integer weight;

		private Integer stacked;

		private Long usageBytes;

		private String effectiveStartTime;

		private Long effectiveStartTimeValue;

		private String effectiveEndTime;

		private Long effectiveEndTimeValue;

		private Integer status;

		public String getPlanID() {
			return this.planID;
		}

		public void setPlanID(String planID) {
			this.planID = planID;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtCreateValue() {
			return this.gmtCreateValue;
		}

		public void setGmtCreateValue(Long gmtCreateValue) {
			this.gmtCreateValue = gmtCreateValue;
		}

		public String getDiscountType() {
			return this.discountType;
		}

		public void setDiscountType(String discountType) {
			this.discountType = discountType;
		}

		public String getDiscountConfig() {
			return this.discountConfig;
		}

		public void setDiscountConfig(String discountConfig) {
			this.discountConfig = discountConfig;
		}

		public Integer getPayType() {
			return this.payType;
		}

		public void setPayType(Integer payType) {
			this.payType = payType;
		}

		public String getPayAmount() {
			return this.payAmount;
		}

		public void setPayAmount(String payAmount) {
			this.payAmount = payAmount;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public Integer getStacked() {
			return this.stacked;
		}

		public void setStacked(Integer stacked) {
			this.stacked = stacked;
		}

		public Long getUsageBytes() {
			return this.usageBytes;
		}

		public void setUsageBytes(Long usageBytes) {
			this.usageBytes = usageBytes;
		}

		public String getEffectiveStartTime() {
			return this.effectiveStartTime;
		}

		public void setEffectiveStartTime(String effectiveStartTime) {
			this.effectiveStartTime = effectiveStartTime;
		}

		public Long getEffectiveStartTimeValue() {
			return this.effectiveStartTimeValue;
		}

		public void setEffectiveStartTimeValue(Long effectiveStartTimeValue) {
			this.effectiveStartTimeValue = effectiveStartTimeValue;
		}

		public String getEffectiveEndTime() {
			return this.effectiveEndTime;
		}

		public void setEffectiveEndTime(String effectiveEndTime) {
			this.effectiveEndTime = effectiveEndTime;
		}

		public Long getEffectiveEndTimeValue() {
			return this.effectiveEndTimeValue;
		}

		public void setEffectiveEndTimeValue(Long effectiveEndTimeValue) {
			this.effectiveEndTimeValue = effectiveEndTimeValue;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public QueryDiscountListResponse getInstance(UnmarshallerContext context) {
		return	QueryDiscountListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
