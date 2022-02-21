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

package com.aliyuncs.resourcemanager.model.v20200331;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.ListDelegatedAdministratorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDelegatedAdministratorsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageSize;

	private Long pageNumber;

	private List<Account> accounts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
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

	public List<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public static class Account {

		private String accountId;

		private String displayName;

		private String joinMethod;

		private String servicePrincipal;

		private String delegationEnabledTime;

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getJoinMethod() {
			return this.joinMethod;
		}

		public void setJoinMethod(String joinMethod) {
			this.joinMethod = joinMethod;
		}

		public String getServicePrincipal() {
			return this.servicePrincipal;
		}

		public void setServicePrincipal(String servicePrincipal) {
			this.servicePrincipal = servicePrincipal;
		}

		public String getDelegationEnabledTime() {
			return this.delegationEnabledTime;
		}

		public void setDelegationEnabledTime(String delegationEnabledTime) {
			this.delegationEnabledTime = delegationEnabledTime;
		}
	}

	@Override
	public ListDelegatedAdministratorsResponse getInstance(UnmarshallerContext context) {
		return	ListDelegatedAdministratorsResponseUnmarshaller.unmarshall(this, context);
	}
}
