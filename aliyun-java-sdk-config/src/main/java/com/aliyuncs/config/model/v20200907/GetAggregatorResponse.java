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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.GetAggregatorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAggregatorResponse extends AcsResponse {

	private String requestId;

	private Aggregator aggregator;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Aggregator getAggregator() {
		return this.aggregator;
	}

	public void setAggregator(Aggregator aggregator) {
		this.aggregator = aggregator;
	}

	public static class Aggregator {

		private String aggregatorCreateTimestamp;

		private Long aggregatorAccountCount;

		private String description;

		private String aggregatorName;

		private Integer aggregatorStatus;

		private String aggregatorType;

		private Long accountId;

		private String aggregatorId;

		private List<AggregatorAccountsItem> aggregatorAccounts;

		public String getAggregatorCreateTimestamp() {
			return this.aggregatorCreateTimestamp;
		}

		public void setAggregatorCreateTimestamp(String aggregatorCreateTimestamp) {
			this.aggregatorCreateTimestamp = aggregatorCreateTimestamp;
		}

		public Long getAggregatorAccountCount() {
			return this.aggregatorAccountCount;
		}

		public void setAggregatorAccountCount(Long aggregatorAccountCount) {
			this.aggregatorAccountCount = aggregatorAccountCount;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAggregatorName() {
			return this.aggregatorName;
		}

		public void setAggregatorName(String aggregatorName) {
			this.aggregatorName = aggregatorName;
		}

		public Integer getAggregatorStatus() {
			return this.aggregatorStatus;
		}

		public void setAggregatorStatus(Integer aggregatorStatus) {
			this.aggregatorStatus = aggregatorStatus;
		}

		public String getAggregatorType() {
			return this.aggregatorType;
		}

		public void setAggregatorType(String aggregatorType) {
			this.aggregatorType = aggregatorType;
		}

		public Long getAccountId() {
			return this.accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public String getAggregatorId() {
			return this.aggregatorId;
		}

		public void setAggregatorId(String aggregatorId) {
			this.aggregatorId = aggregatorId;
		}

		public List<AggregatorAccountsItem> getAggregatorAccounts() {
			return this.aggregatorAccounts;
		}

		public void setAggregatorAccounts(List<AggregatorAccountsItem> aggregatorAccounts) {
			this.aggregatorAccounts = aggregatorAccounts;
		}

		public static class AggregatorAccountsItem {

			private String recorderStatus;

			private Long accountId;

			private String accountType;

			private String accountName;

			public String getRecorderStatus() {
				return this.recorderStatus;
			}

			public void setRecorderStatus(String recorderStatus) {
				this.recorderStatus = recorderStatus;
			}

			public Long getAccountId() {
				return this.accountId;
			}

			public void setAccountId(Long accountId) {
				this.accountId = accountId;
			}

			public String getAccountType() {
				return this.accountType;
			}

			public void setAccountType(String accountType) {
				this.accountType = accountType;
			}

			public String getAccountName() {
				return this.accountName;
			}

			public void setAccountName(String accountName) {
				this.accountName = accountName;
			}
		}
	}

	@Override
	public GetAggregatorResponse getInstance(UnmarshallerContext context) {
		return	GetAggregatorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
