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
import com.aliyuncs.bssopenapi.transform.v20171214.QueryAccountTransactionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAccountTransactionsResponse extends AcsResponse {

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

		private String accountName;

		private List<AccountTransactionsListItem> accountTransactionsList;

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

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public List<AccountTransactionsListItem> getAccountTransactionsList() {
			return this.accountTransactionsList;
		}

		public void setAccountTransactionsList(List<AccountTransactionsListItem> accountTransactionsList) {
			this.accountTransactionsList = accountTransactionsList;
		}

		public static class AccountTransactionsListItem {

			private String billingCycle;

			private String transactionChannel;

			private String recordID;

			private String remarks;

			private String amount;

			private String transactionAccount;

			private String transactionTime;

			private String transactionType;

			private String transactionFlow;

			private String fundType;

			private String transactionChannelSN;

			private String transactionNumber;

			private String balance;

			public String getBillingCycle() {
				return this.billingCycle;
			}

			public void setBillingCycle(String billingCycle) {
				this.billingCycle = billingCycle;
			}

			public String getTransactionChannel() {
				return this.transactionChannel;
			}

			public void setTransactionChannel(String transactionChannel) {
				this.transactionChannel = transactionChannel;
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

			public String getAmount() {
				return this.amount;
			}

			public void setAmount(String amount) {
				this.amount = amount;
			}

			public String getTransactionAccount() {
				return this.transactionAccount;
			}

			public void setTransactionAccount(String transactionAccount) {
				this.transactionAccount = transactionAccount;
			}

			public String getTransactionTime() {
				return this.transactionTime;
			}

			public void setTransactionTime(String transactionTime) {
				this.transactionTime = transactionTime;
			}

			public String getTransactionType() {
				return this.transactionType;
			}

			public void setTransactionType(String transactionType) {
				this.transactionType = transactionType;
			}

			public String getTransactionFlow() {
				return this.transactionFlow;
			}

			public void setTransactionFlow(String transactionFlow) {
				this.transactionFlow = transactionFlow;
			}

			public String getFundType() {
				return this.fundType;
			}

			public void setFundType(String fundType) {
				this.fundType = fundType;
			}

			public String getTransactionChannelSN() {
				return this.transactionChannelSN;
			}

			public void setTransactionChannelSN(String transactionChannelSN) {
				this.transactionChannelSN = transactionChannelSN;
			}

			public String getTransactionNumber() {
				return this.transactionNumber;
			}

			public void setTransactionNumber(String transactionNumber) {
				this.transactionNumber = transactionNumber;
			}

			public String getBalance() {
				return this.balance;
			}

			public void setBalance(String balance) {
				this.balance = balance;
			}
		}
	}

	@Override
	public QueryAccountTransactionsResponse getInstance(UnmarshallerContext context) {
		return	QueryAccountTransactionsResponseUnmarshaller.unmarshall(this, context);
	}
}
