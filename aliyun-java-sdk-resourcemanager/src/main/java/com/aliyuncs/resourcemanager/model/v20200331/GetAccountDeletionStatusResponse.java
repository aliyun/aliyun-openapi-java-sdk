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
import com.aliyuncs.resourcemanager.transform.v20200331.GetAccountDeletionStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccountDeletionStatusResponse extends AcsResponse {

	private String requestId;

	private RdAccountDeletionStatus rdAccountDeletionStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RdAccountDeletionStatus getRdAccountDeletionStatus() {
		return this.rdAccountDeletionStatus;
	}

	public void setRdAccountDeletionStatus(RdAccountDeletionStatus rdAccountDeletionStatus) {
		this.rdAccountDeletionStatus = rdAccountDeletionStatus;
	}

	public static class RdAccountDeletionStatus {

		private String status;

		private String accountId;

		private String createTime;

		private String deletionTime;

		private String deletionType;

		private List<FailReasonListItem> failReasonList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDeletionTime() {
			return this.deletionTime;
		}

		public void setDeletionTime(String deletionTime) {
			this.deletionTime = deletionTime;
		}

		public String getDeletionType() {
			return this.deletionType;
		}

		public void setDeletionType(String deletionType) {
			this.deletionType = deletionType;
		}

		public List<FailReasonListItem> getFailReasonList() {
			return this.failReasonList;
		}

		public void setFailReasonList(List<FailReasonListItem> failReasonList) {
			this.failReasonList = failReasonList;
		}

		public static class FailReasonListItem {

			private String name;

			private String description;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public GetAccountDeletionStatusResponse getInstance(UnmarshallerContext context) {
		return	GetAccountDeletionStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
