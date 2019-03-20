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

package com.aliyuncs.httpdns.model.v20160201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.httpdns.transform.v20160201.GetAccountInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccountInfoResponse extends AcsResponse {

	private String requestId;

	private AccountInfo accountInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AccountInfo getAccountInfo() {
		return this.accountInfo;
	}

	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}

	public static class AccountInfo {

		private String accountId;

		private Integer monthFreeCount;

		private Integer monthHttpsResolveCount;

		private Integer monthResolveCount;

		private Integer packageCount;

		private Integer userStatus;

		private String signSecret;

		private Boolean unsignedEnabled;

		private Long signedCount;

		private Long unsignedCount;

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public Integer getMonthFreeCount() {
			return this.monthFreeCount;
		}

		public void setMonthFreeCount(Integer monthFreeCount) {
			this.monthFreeCount = monthFreeCount;
		}

		public Integer getMonthHttpsResolveCount() {
			return this.monthHttpsResolveCount;
		}

		public void setMonthHttpsResolveCount(Integer monthHttpsResolveCount) {
			this.monthHttpsResolveCount = monthHttpsResolveCount;
		}

		public Integer getMonthResolveCount() {
			return this.monthResolveCount;
		}

		public void setMonthResolveCount(Integer monthResolveCount) {
			this.monthResolveCount = monthResolveCount;
		}

		public Integer getPackageCount() {
			return this.packageCount;
		}

		public void setPackageCount(Integer packageCount) {
			this.packageCount = packageCount;
		}

		public Integer getUserStatus() {
			return this.userStatus;
		}

		public void setUserStatus(Integer userStatus) {
			this.userStatus = userStatus;
		}

		public String getSignSecret() {
			return this.signSecret;
		}

		public void setSignSecret(String signSecret) {
			this.signSecret = signSecret;
		}

		public Boolean getUnsignedEnabled() {
			return this.unsignedEnabled;
		}

		public void setUnsignedEnabled(Boolean unsignedEnabled) {
			this.unsignedEnabled = unsignedEnabled;
		}

		public Long getSignedCount() {
			return this.signedCount;
		}

		public void setSignedCount(Long signedCount) {
			this.signedCount = signedCount;
		}

		public Long getUnsignedCount() {
			return this.unsignedCount;
		}

		public void setUnsignedCount(Long unsignedCount) {
			this.unsignedCount = unsignedCount;
		}
	}

	@Override
	public GetAccountInfoResponse getInstance(UnmarshallerContext context) {
		return	GetAccountInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
