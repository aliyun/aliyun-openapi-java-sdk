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

package com.aliyuncs.governance.model.v20210120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.governance.transform.v20210120.ListEnrolledAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEnrolledAccountsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<EnrolledAccountsItem> enrolledAccounts;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EnrolledAccountsItem> getEnrolledAccounts() {
		return this.enrolledAccounts;
	}

	public void setEnrolledAccounts(List<EnrolledAccountsItem> enrolledAccounts) {
		this.enrolledAccounts = enrolledAccounts;
	}

	public static class EnrolledAccountsItem {

		private Long accountUid;

		private String baselineId;

		private String createTime;

		private String displayName;

		private String folderId;

		private Long payerAccountUid;

		private String status;

		private String updateTime;

		public Long getAccountUid() {
			return this.accountUid;
		}

		public void setAccountUid(Long accountUid) {
			this.accountUid = accountUid;
		}

		public String getBaselineId() {
			return this.baselineId;
		}

		public void setBaselineId(String baselineId) {
			this.baselineId = baselineId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getFolderId() {
			return this.folderId;
		}

		public void setFolderId(String folderId) {
			this.folderId = folderId;
		}

		public Long getPayerAccountUid() {
			return this.payerAccountUid;
		}

		public void setPayerAccountUid(Long payerAccountUid) {
			this.payerAccountUid = payerAccountUid;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public ListEnrolledAccountsResponse getInstance(UnmarshallerContext context) {
		return	ListEnrolledAccountsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
