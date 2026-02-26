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
import com.aliyuncs.resourcemanager.transform.v20200331.GetAccountDeletionCheckResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccountDeletionCheckResultResponse extends AcsResponse {

	private String requestId;

	private AccountDeletionCheckResultInfo accountDeletionCheckResultInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AccountDeletionCheckResultInfo getAccountDeletionCheckResultInfo() {
		return this.accountDeletionCheckResultInfo;
	}

	public void setAccountDeletionCheckResultInfo(AccountDeletionCheckResultInfo accountDeletionCheckResultInfo) {
		this.accountDeletionCheckResultInfo = accountDeletionCheckResultInfo;
	}

	public static class AccountDeletionCheckResultInfo {

		private String status;

		private String allowDelete;

		private List<Reason> notAllowReason;

		private List<Check> abandonableChecks;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAllowDelete() {
			return this.allowDelete;
		}

		public void setAllowDelete(String allowDelete) {
			this.allowDelete = allowDelete;
		}

		public List<Reason> getNotAllowReason() {
			return this.notAllowReason;
		}

		public void setNotAllowReason(List<Reason> notAllowReason) {
			this.notAllowReason = notAllowReason;
		}

		public List<Check> getAbandonableChecks() {
			return this.abandonableChecks;
		}

		public void setAbandonableChecks(List<Check> abandonableChecks) {
			this.abandonableChecks = abandonableChecks;
		}

		public static class Reason {

			private String description;

			private String checkId;

			private String checkName;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getCheckId() {
				return this.checkId;
			}

			public void setCheckId(String checkId) {
				this.checkId = checkId;
			}

			public String getCheckName() {
				return this.checkName;
			}

			public void setCheckName(String checkName) {
				this.checkName = checkName;
			}
		}

		public static class Check {

			private String description;

			private String checkId;

			private String checkName;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getCheckId() {
				return this.checkId;
			}

			public void setCheckId(String checkId) {
				this.checkId = checkId;
			}

			public String getCheckName() {
				return this.checkName;
			}

			public void setCheckName(String checkName) {
				this.checkName = checkName;
			}
		}
	}

	@Override
	public GetAccountDeletionCheckResultResponse getInstance(UnmarshallerContext context) {
		return	GetAccountDeletionCheckResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
