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

package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ram.transform.v20150501.GetLoginProfileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLoginProfileResponse extends AcsResponse {

	private String requestId;

	private LoginProfile loginProfile;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public LoginProfile getLoginProfile() {
		return this.loginProfile;
	}

	public void setLoginProfile(LoginProfile loginProfile) {
		this.loginProfile = loginProfile;
	}

	public static class LoginProfile {

		private Boolean passwordResetRequired;

		private String createDate;

		private String userName;

		private Boolean mFABindRequired;

		public Boolean getPasswordResetRequired() {
			return this.passwordResetRequired;
		}

		public void setPasswordResetRequired(Boolean passwordResetRequired) {
			this.passwordResetRequired = passwordResetRequired;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Boolean getMFABindRequired() {
			return this.mFABindRequired;
		}

		public void setMFABindRequired(Boolean mFABindRequired) {
			this.mFABindRequired = mFABindRequired;
		}
	}

	@Override
	public GetLoginProfileResponse getInstance(UnmarshallerContext context) {
		return	GetLoginProfileResponseUnmarshaller.unmarshall(this, context);
	}
}
