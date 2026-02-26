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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.DescribeCostBudgetsSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCostBudgetsSummaryResponse extends AcsResponse {

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

		private String nextToken;

		private Integer maxResults;

		private Integer totalCount;

		private String hostId;

		private List<Item> items;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String budgetName;

			private String budgetStatus;

			private String budgetType;

			private Map<Object,Object> budget;

			private Map<Object,Object> calculatedValues;

			private Map<Object,Object> consumePeriod;

			public String getBudgetName() {
				return this.budgetName;
			}

			public void setBudgetName(String budgetName) {
				this.budgetName = budgetName;
			}

			public String getBudgetStatus() {
				return this.budgetStatus;
			}

			public void setBudgetStatus(String budgetStatus) {
				this.budgetStatus = budgetStatus;
			}

			public String getBudgetType() {
				return this.budgetType;
			}

			public void setBudgetType(String budgetType) {
				this.budgetType = budgetType;
			}

			public Map<Object,Object> getBudget() {
				return this.budget;
			}

			public void setBudget(Map<Object,Object> budget) {
				this.budget = budget;
			}

			public Map<Object,Object> getCalculatedValues() {
				return this.calculatedValues;
			}

			public void setCalculatedValues(Map<Object,Object> calculatedValues) {
				this.calculatedValues = calculatedValues;
			}

			public Map<Object,Object> getConsumePeriod() {
				return this.consumePeriod;
			}

			public void setConsumePeriod(Map<Object,Object> consumePeriod) {
				this.consumePeriod = consumePeriod;
			}
		}
	}

	@Override
	public DescribeCostBudgetsSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeCostBudgetsSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
