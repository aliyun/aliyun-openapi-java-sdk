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
import com.aliyuncs.bssopenapi.transform.v20171214.DescribeSavingsPlansUsageDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSavingsPlansUsageDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private String nextToken;

		private List<Item> items;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private Long userId;

			private String userName;

			private String instanceId;

			private String startPeriod;

			private String endPeriod;

			private String status;

			private String type;

			private Float usagePercentage;

			private Float poolValue;

			private Float deductValue;

			private Float postpaidCost;

			private Float savedCost;

			private String currency;

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getStartPeriod() {
				return this.startPeriod;
			}

			public void setStartPeriod(String startPeriod) {
				this.startPeriod = startPeriod;
			}

			public String getEndPeriod() {
				return this.endPeriod;
			}

			public void setEndPeriod(String endPeriod) {
				this.endPeriod = endPeriod;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Float getUsagePercentage() {
				return this.usagePercentage;
			}

			public void setUsagePercentage(Float usagePercentage) {
				this.usagePercentage = usagePercentage;
			}

			public Float getPoolValue() {
				return this.poolValue;
			}

			public void setPoolValue(Float poolValue) {
				this.poolValue = poolValue;
			}

			public Float getDeductValue() {
				return this.deductValue;
			}

			public void setDeductValue(Float deductValue) {
				this.deductValue = deductValue;
			}

			public Float getPostpaidCost() {
				return this.postpaidCost;
			}

			public void setPostpaidCost(Float postpaidCost) {
				this.postpaidCost = postpaidCost;
			}

			public Float getSavedCost() {
				return this.savedCost;
			}

			public void setSavedCost(Float savedCost) {
				this.savedCost = savedCost;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}
		}
	}

	@Override
	public DescribeSavingsPlansUsageDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeSavingsPlansUsageDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
