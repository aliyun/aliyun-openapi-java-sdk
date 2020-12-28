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
import com.aliyuncs.bssopenapi.transform.v20171214.QueryAccountTransactionDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAccountTransactionDetailsResponse extends AcsResponse {

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

		private String accountName;

		private Integer totalCount;

		private String nextToken;

		private Integer maxResults;

		private List<AccountTransactionsListItem> accountTransactionsList;

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

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

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public List<AccountTransactionsListItem> getAccountTransactionsList() {
			return this.accountTransactionsList;
		}

		public void setAccountTransactionsList(List<AccountTransactionsListItem> accountTransactionsList) {
			this.accountTransactionsList = accountTransactionsList;
		}

		public static class AccountTransactionsListItem {

			private String transactionNumber;

			private String transactionTime;

			private String transactionFlow;

			private String transactionType;

			private String transactionChannel;

			private String transactionChannelSN;

			private String fundType;

			private String recordID;

			private String remarks;

			private String billingCycle;

			private String amount;

			private String balance;

			private String transactionAccount;

			public String getTransactionNumber() {
				return this.transactionNumber;
			}

			public void setTransactionNumber(String transactionNumber) {
				this.transactionNumber = transactionNumber;
			}

			public String getTransactionTime() {
				return this.transactionTime;
			}

			public void setTransactionTime(String transactionTime) {
				this.transactionTime = transactionTime;
			}

			public String getTransactionFlow() {
				return this.transactionFlow;
			}

			public void setTransactionFlow(String transactionFlow) {
				this.transactionFlow = transactionFlow;
			}

			public String getTransactionType() {
				return this.transactionType;
			}

			public void setTransactionType(String transactionType) {
				this.transactionType = transactionType;
			}

			public String getTransactionChannel() {
				return this.transactionChannel;
			}

			public void setTransactionChannel(String transactionChannel) {
				this.transactionChannel = transactionChannel;
			}

			public String getTransactionChannelSN() {
				return this.transactionChannelSN;
			}

			public void setTransactionChannelSN(String transactionChannelSN) {
				this.transactionChannelSN = transactionChannelSN;
			}

			public String getFundType() {
				return this.fundType;
			}

			public void setFundType(String fundType) {
				this.fundType = fundType;
			}

			public String getRecordID() {
				return this.recordID;
			}

			public void setRecordID(String recordID) {
				this.recordID = recordID;
			}

			public String getRemarks() {
				return this.remarks;
			}

			public void setRemarks(String remarks) {
				this.remarks = remarks;
			}

			public String getBillingCycle() {
				return this.billingCycle;
			}

			public void setBillingCycle(String billingCycle) {
				this.billingCycle = billingCycle;
			}

			public String getAmount() {
				return this.amount;
			}

			public void setAmount(String amount) {
				this.amount = amount;
			}

			public String getBalance() {
				return this.balance;
			}

			public void setBalance(String balance) {
				this.balance = balance;
			}

			public String getTransactionAccount() {
				return this.transactionAccount;
			}

			public void setTransactionAccount(String transactionAccount) {
				this.transactionAccount = transactionAccount;
			}
		}
	}

	@Override
	public QueryAccountTransactionDetailsResponse getInstance(UnmarshallerContext context) {
		return	QueryAccountTransactionDetailsResponseUnmarshaller.unmarshall(this, context);
	}
}
