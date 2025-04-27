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
import com.aliyuncs.eds_user.transform.v20210308.CreateUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateUsersResponse extends AcsResponse {

	private String requestId;

	private Boolean allSucceed;

	private CreateResult createResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getAllSucceed() {
		return this.allSucceed;
	}

	public void setAllSucceed(Boolean allSucceed) {
		this.allSucceed = allSucceed;
	}

	public CreateResult getCreateResult() {
		return this.createResult;
	}

	public void setCreateResult(CreateResult createResult) {
		this.createResult = createResult;
	}

	public static class CreateResult {

		private List<CreatedUsersItem> createdUsers;

		private List<FailedUsersItem> failedUsers;

		public List<CreatedUsersItem> getCreatedUsers() {
			return this.createdUsers;
		}

		public void setCreatedUsers(List<CreatedUsersItem> createdUsers) {
			this.createdUsers = createdUsers;
		}

		public List<FailedUsersItem> getFailedUsers() {
			return this.failedUsers;
		}

		public void setFailedUsers(List<FailedUsersItem> failedUsers) {
			this.failedUsers = failedUsers;
		}

		public static class CreatedUsersItem {

			private String endUserId;

			private String email;

			private String phone;

			private String remark;

			private String realNickName;

			public String getEndUserId() {
				return this.endUserId;
			}

			public void setEndUserId(String endUserId) {
				this.endUserId = endUserId;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPhone() {
				return this.phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getRealNickName() {
				return this.realNickName;
			}

			public void setRealNickName(String realNickName) {
				this.realNickName = realNickName;
			}
		}

		public static class FailedUsersItem {

			private String endUserId;

			private String email;

			private String phone;

			private String errorCode;

			private String errorMessage;

			public String getEndUserId() {
				return this.endUserId;
			}

			public void setEndUserId(String endUserId) {
				this.endUserId = endUserId;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPhone() {
				return this.phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
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
	public CreateUsersResponse getInstance(UnmarshallerContext context) {
		return	CreateUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
