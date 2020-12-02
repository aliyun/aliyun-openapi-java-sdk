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

package com.aliyuncs.quickbi_public.model.v20200801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20200801.QueryUserInfoByUserIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryUserInfoByUserIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String accountId;

		private String accountName;

		private Boolean adminUser;

		private Boolean authAdminUser;

		private String email;

		private String nickName;

		private String phone;

		private String userId;

		private Integer userType;

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public Boolean getAdminUser() {
			return this.adminUser;
		}

		public void setAdminUser(Boolean adminUser) {
			this.adminUser = adminUser;
		}

		public Boolean getAuthAdminUser() {
			return this.authAdminUser;
		}

		public void setAuthAdminUser(Boolean authAdminUser) {
			this.authAdminUser = authAdminUser;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Integer getUserType() {
			return this.userType;
		}

		public void setUserType(Integer userType) {
			this.userType = userType;
		}
	}

	@Override
	public QueryUserInfoByUserIdResponse getInstance(UnmarshallerContext context) {
		return	QueryUserInfoByUserIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
