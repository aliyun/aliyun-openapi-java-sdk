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
import com.aliyuncs.config.transform.v20200907.GetAggregateAccountComplianceByPackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAggregateAccountComplianceByPackResponse extends AcsResponse {

	private String requestId;

	private AccountComplianceResult accountComplianceResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AccountComplianceResult getAccountComplianceResult() {
		return this.accountComplianceResult;
	}

	public void setAccountComplianceResult(AccountComplianceResult accountComplianceResult) {
		this.accountComplianceResult = accountComplianceResult;
	}

	public static class AccountComplianceResult {

		private String compliancePackId;

		private Integer nonCompliantCount;

		private Integer totalCount;

		private List<AccountCompliancesItem> accountCompliances;

		public String getCompliancePackId() {
			return this.compliancePackId;
		}

		public void setCompliancePackId(String compliancePackId) {
			this.compliancePackId = compliancePackId;
		}

		public Integer getNonCompliantCount() {
			return this.nonCompliantCount;
		}

		public void setNonCompliantCount(Integer nonCompliantCount) {
			this.nonCompliantCount = nonCompliantCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<AccountCompliancesItem> getAccountCompliances() {
			return this.accountCompliances;
		}

		public void setAccountCompliances(List<AccountCompliancesItem> accountCompliances) {
			this.accountCompliances = accountCompliances;
		}

		public static class AccountCompliancesItem {

			private String complianceType;

			private Long accountId;

			private String accountName;

			public String getComplianceType() {
				return this.complianceType;
			}

			public void setComplianceType(String complianceType) {
				this.complianceType = complianceType;
			}

			public Long getAccountId() {
				return this.accountId;
			}

			public void setAccountId(Long accountId) {
				this.accountId = accountId;
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
	public GetAggregateAccountComplianceByPackResponse getInstance(UnmarshallerContext context) {
		return	GetAggregateAccountComplianceByPackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
