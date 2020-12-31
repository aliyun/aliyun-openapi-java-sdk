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
import com.aliyuncs.bssopenapi.transform.v20171214.QuerySavingsPlansDeductLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySavingsPlansDeductLogResponse extends AcsResponse {

	private String code;

	private String requestId;

	private Boolean success;

	private String message;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

		private List<SavingsPlansDeductDetailResponse> items;

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

		public List<SavingsPlansDeductDetailResponse> getItems() {
			return this.items;
		}

		public void setItems(List<SavingsPlansDeductDetailResponse> items) {
			this.items = items;
		}

		public static class SavingsPlansDeductDetailResponse {

			private String instanceId;

			private String startTime;

			private String endTime;

			private String savingsType;

			private String billModule;

			private String deductFee;

			private String deductRate;

			private Long userId;

			private String deductCommodity;

			private String deductInstanceId;

			private String discountRate;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getSavingsType() {
				return this.savingsType;
			}

			public void setSavingsType(String savingsType) {
				this.savingsType = savingsType;
			}

			public String getBillModule() {
				return this.billModule;
			}

			public void setBillModule(String billModule) {
				this.billModule = billModule;
			}

			public String getDeductFee() {
				return this.deductFee;
			}

			public void setDeductFee(String deductFee) {
				this.deductFee = deductFee;
			}

			public String getDeductRate() {
				return this.deductRate;
			}

			public void setDeductRate(String deductRate) {
				this.deductRate = deductRate;
			}

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getDeductCommodity() {
				return this.deductCommodity;
			}

			public void setDeductCommodity(String deductCommodity) {
				this.deductCommodity = deductCommodity;
			}

			public String getDeductInstanceId() {
				return this.deductInstanceId;
			}

			public void setDeductInstanceId(String deductInstanceId) {
				this.deductInstanceId = deductInstanceId;
			}

			public String getDiscountRate() {
				return this.discountRate;
			}

			public void setDiscountRate(String discountRate) {
				this.discountRate = discountRate;
			}
		}
	}

	@Override
	public QuerySavingsPlansDeductLogResponse getInstance(UnmarshallerContext context) {
		return	QuerySavingsPlansDeductLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
