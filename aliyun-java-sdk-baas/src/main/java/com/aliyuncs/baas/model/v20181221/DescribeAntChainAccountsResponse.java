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

package com.aliyuncs.baas.model.v20181221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainAccountsResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<AccountsItem> accounts;

		private Pagination pagination;

		public List<AccountsItem> getAccounts() {
			return this.accounts;
		}

		public void setAccounts(List<AccountsItem> accounts) {
			this.accounts = accounts;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class AccountsItem {

			private String antChainId;

			private String account;

			private String accountPublicKey;

			private String accountRecoveryKey;

			private String accountStatus;

			public String getAntChainId() {
				return this.antChainId;
			}

			public void setAntChainId(String antChainId) {
				this.antChainId = antChainId;
			}

			public String getAccount() {
				return this.account;
			}

			public void setAccount(String account) {
				this.account = account;
			}

			public String getAccountPublicKey() {
				return this.accountPublicKey;
			}

			public void setAccountPublicKey(String accountPublicKey) {
				this.accountPublicKey = accountPublicKey;
			}

			public String getAccountRecoveryKey() {
				return this.accountRecoveryKey;
			}

			public void setAccountRecoveryKey(String accountRecoveryKey) {
				this.accountRecoveryKey = accountRecoveryKey;
			}

			public String getAccountStatus() {
				return this.accountStatus;
			}

			public void setAccountStatus(String accountStatus) {
				this.accountStatus = accountStatus;
			}
		}

		public static class Pagination {

			private Integer pageSize;

			private Integer pageNumber;

			private Integer totalCount;

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
		}
	}

	@Override
	public DescribeAntChainAccountsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntChainAccountsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
