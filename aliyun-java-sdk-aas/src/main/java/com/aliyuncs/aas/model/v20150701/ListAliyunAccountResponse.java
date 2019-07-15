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

package com.aliyuncs.aas.model.v20150701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aas.transform.v20150701.ListAliyunAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAliyunAccountResponse extends AcsResponse {

	private String requestId;

	private Boolean isTruncated;

	private String marker;

	private Integer totalAccount;

	private Boolean hasNext;

	private List<Account> accounts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIsTruncated() {
		return this.isTruncated;
	}

	public void setIsTruncated(Boolean isTruncated) {
		this.isTruncated = isTruncated;
	}

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
	}

	public Integer getTotalAccount() {
		return this.totalAccount;
	}

	public void setTotalAccount(Integer totalAccount) {
		this.totalAccount = totalAccount;
	}

	public Boolean getHasNext() {
		return this.hasNext;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}

	public List<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public static class Account {

		private String pK;

		private String lastLoginDate;

		private String accountStatus;

		private String aliyunId;

		public String getPK() {
			return this.pK;
		}

		public void setPK(String pK) {
			this.pK = pK;
		}

		public String getLastLoginDate() {
			return this.lastLoginDate;
		}

		public void setLastLoginDate(String lastLoginDate) {
			this.lastLoginDate = lastLoginDate;
		}

		public String getAccountStatus() {
			return this.accountStatus;
		}

		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}

		public String getAliyunId() {
			return this.aliyunId;
		}

		public void setAliyunId(String aliyunId) {
			this.aliyunId = aliyunId;
		}
	}

	@Override
	public ListAliyunAccountResponse getInstance(UnmarshallerContext context) {
		return	ListAliyunAccountResponseUnmarshaller.unmarshall(this, context);
	}
}
