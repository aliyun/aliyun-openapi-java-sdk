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

package com.aliyuncs.eds_user.model.v20210308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_user.transform.v20210308.RemoveUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RemoveUsersResponse extends AcsResponse {

	private String requestId;

	private RemoveUsersResult removeUsersResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RemoveUsersResult getRemoveUsersResult() {
		return this.removeUsersResult;
	}

	public void setRemoveUsersResult(RemoveUsersResult removeUsersResult) {
		this.removeUsersResult = removeUsersResult;
	}

	public static class RemoveUsersResult {

		private List<FailedUsersItem> failedUsers;

		private List<String> removedUsers;

		public List<FailedUsersItem> getFailedUsers() {
			return this.failedUsers;
		}

		public void setFailedUsers(List<FailedUsersItem> failedUsers) {
			this.failedUsers = failedUsers;
		}

		public List<String> getRemovedUsers() {
			return this.removedUsers;
		}

		public void setRemovedUsers(List<String> removedUsers) {
			this.removedUsers = removedUsers;
		}

		public static class FailedUsersItem {

			private String endUserId;

			private String errorCode;

			private String errorMessage;

			public String getEndUserId() {
				return this.endUserId;
			}

			public void setEndUserId(String endUserId) {
				this.endUserId = endUserId;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}
		}
	}

	@Override
	public RemoveUsersResponse getInstance(UnmarshallerContext context) {
		return	RemoveUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
