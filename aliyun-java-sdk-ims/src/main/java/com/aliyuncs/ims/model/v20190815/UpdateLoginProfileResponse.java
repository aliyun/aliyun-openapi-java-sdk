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

package com.aliyuncs.ims.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.UpdateLoginProfileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateLoginProfileResponse extends AcsResponse {

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

		private String userPrincipalName;

		private String status;

		private String password;

		private String updateDate;

		private Boolean passwordResetRequired;

		private Boolean mFABindRequired;

		private String createDate;

		private String autoDisableLoginStatus;

		public String getUserPrincipalName() {
			return this.userPrincipalName;
		}

		public void setUserPrincipalName(String userPrincipalName) {
			this.userPrincipalName = userPrincipalName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public Boolean getPasswordResetRequired() {
			return this.passwordResetRequired;
		}

		public void setPasswordResetRequired(Boolean passwordResetRequired) {
			this.passwordResetRequired = passwordResetRequired;
		}

		public Boolean getMFABindRequired() {
			return this.mFABindRequired;
		}

		public void setMFABindRequired(Boolean mFABindRequired) {
			this.mFABindRequired = mFABindRequired;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getAutoDisableLoginStatus() {
			return this.autoDisableLoginStatus;
		}

		public void setAutoDisableLoginStatus(String autoDisableLoginStatus) {
			this.autoDisableLoginStatus = autoDisableLoginStatus;
		}
	}

	@Override
	public UpdateLoginProfileResponse getInstance(UnmarshallerContext context) {
		return	UpdateLoginProfileResponseUnmarshaller.unmarshall(this, context);
	}
}
