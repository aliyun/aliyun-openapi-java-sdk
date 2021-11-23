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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QuerySavingsPlansInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySavingsPlansInstanceResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalCount;

		private List<SavingsPlansDetailResponse> items;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<SavingsPlansDetailResponse> getItems() {
			return this.items;
		}

		public void setItems(List<SavingsPlansDetailResponse> items) {
			this.items = items;
		}

		public static class SavingsPlansDetailResponse {

			private String status;

			private String cycle;

			private Long startTimestamp;

			private String savingsType;

			private String utilization;

			private String prepayFee;

			private String instanceId;

			private String currency;

			private Long endTimestamp;

			private String endTime;

			private String startTime;

			private String allocationStatus;

			private String instanceFamily;

			private String region;

			private String lastBillTotalUsage;

			private String lastBillUtilization;

			private String totalSave;

			private String poolValue;

			private String payMode;

			private List<Tag> tags;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCycle() {
				return this.cycle;
			}

			public void setCycle(String cycle) {
				this.cycle = cycle;
			}

			public Long getStartTimestamp() {
				return this.startTimestamp;
			}

			public void setStartTimestamp(Long startTimestamp) {
				this.startTimestamp = startTimestamp;
			}

			public String getSavingsType() {
				return this.savingsType;
			}

			public void setSavingsType(String savingsType) {
				this.savingsType = savingsType;
			}

			public String getUtilization() {
				return this.utilization;
			}

			public void setUtilization(String utilization) {
				this.utilization = utilization;
			}

			public String getPrepayFee() {
				return this.prepayFee;
			}

			public void setPrepayFee(String prepayFee) {
				this.prepayFee = prepayFee;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public Long getEndTimestamp() {
				return this.endTimestamp;
			}

			public void setEndTimestamp(Long endTimestamp) {
				this.endTimestamp = endTimestamp;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getAllocationStatus() {
				return this.allocationStatus;
			}

			public void setAllocationStatus(String allocationStatus) {
				this.allocationStatus = allocationStatus;
			}

			public String getInstanceFamily() {
				return this.instanceFamily;
			}

			public void setInstanceFamily(String instanceFamily) {
				this.instanceFamily = instanceFamily;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getLastBillTotalUsage() {
				return this.lastBillTotalUsage;
			}

			public void setLastBillTotalUsage(String lastBillTotalUsage) {
				this.lastBillTotalUsage = lastBillTotalUsage;
			}

			public String getLastBillUtilization() {
				return this.lastBillUtilization;
			}

			public void setLastBillUtilization(String lastBillUtilization) {
				this.lastBillUtilization = lastBillUtilization;
			}

			public String getTotalSave() {
				return this.totalSave;
			}

			public void setTotalSave(String totalSave) {
				this.totalSave = totalSave;
			}

			public String getPoolValue() {
				return this.poolValue;
			}

			public void setPoolValue(String poolValue) {
				this.poolValue = poolValue;
			}

			public String getPayMode() {
				return this.payMode;
			}

			public void setPayMode(String payMode) {
				this.payMode = payMode;
			}

			public List<Tag> getTags() {
				return this.tags;
			}

			public void setTags(List<Tag> tags) {
				this.tags = tags;
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
		}
	}

	@Override
	public QuerySavingsPlansInstanceResponse getInstance(UnmarshallerContext context) {
		return	QuerySavingsPlansInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
