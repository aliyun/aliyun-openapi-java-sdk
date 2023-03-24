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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.SetSecurityPreferenceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetSecurityPreferenceResponse extends AcsResponse {

	private String requestId;

	private SecurityPreference securityPreference;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SecurityPreference getSecurityPreference() {
		return this.securityPreference;
	}

	public void setSecurityPreference(SecurityPreference securityPreference) {
		this.securityPreference = securityPreference;
	}

	public static class SecurityPreference {

		private AccessKeyPreference accessKeyPreference;

		private LoginProfilePreference loginProfilePreference;

		private MFAPreference mFAPreference;

		private VerificationPreference verificationPreference;

		private PersonalInfoPreference personalInfoPreference;

		private ApplicationLoginPreference applicationLoginPreference;

		public AccessKeyPreference getAccessKeyPreference() {
			return this.accessKeyPreference;
		}

		public void setAccessKeyPreference(AccessKeyPreference accessKeyPreference) {
			this.accessKeyPreference = accessKeyPreference;
		}

		public LoginProfilePreference getLoginProfilePreference() {
			return this.loginProfilePreference;
		}

		public void setLoginProfilePreference(LoginProfilePreference loginProfilePreference) {
			this.loginProfilePreference = loginProfilePreference;
		}

		public MFAPreference getMFAPreference() {
			return this.mFAPreference;
		}

		public void setMFAPreference(MFAPreference mFAPreference) {
			this.mFAPreference = mFAPreference;
		}

		public VerificationPreference getVerificationPreference() {
			return this.verificationPreference;
		}

		public void setVerificationPreference(VerificationPreference verificationPreference) {
			this.verificationPreference = verificationPreference;
		}

		public PersonalInfoPreference getPersonalInfoPreference() {
			return this.personalInfoPreference;
		}

		public void setPersonalInfoPreference(PersonalInfoPreference personalInfoPreference) {
			this.personalInfoPreference = personalInfoPreference;
		}

		public ApplicationLoginPreference getApplicationLoginPreference() {
			return this.applicationLoginPreference;
		}

		public void setApplicationLoginPreference(ApplicationLoginPreference applicationLoginPreference) {
			this.applicationLoginPreference = applicationLoginPreference;
		}

		public static class AccessKeyPreference {

			private Boolean allowUserToManageAccessKeys;

			public Boolean getAllowUserToManageAccessKeys() {
				return this.allowUserToManageAccessKeys;
			}

			public void setAllowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
				this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
			}
		}

		public static class LoginProfilePreference {

			private Boolean enableSaveMFATicket;

			private Integer loginSessionDuration;

			private String loginNetworkMasks;

			private Boolean allowUserToChangePassword;

			private Boolean enforceMFAForLogin;

			private String operationForRiskLogin;

			private String mFAOperationForLogin;

			public Boolean getEnableSaveMFATicket() {
				return this.enableSaveMFATicket;
			}

			public void setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
				this.enableSaveMFATicket = enableSaveMFATicket;
			}

			public Integer getLoginSessionDuration() {
				return this.loginSessionDuration;
			}

			public void setLoginSessionDuration(Integer loginSessionDuration) {
				this.loginSessionDuration = loginSessionDuration;
			}

			public String getLoginNetworkMasks() {
				return this.loginNetworkMasks;
			}

			public void setLoginNetworkMasks(String loginNetworkMasks) {
				this.loginNetworkMasks = loginNetworkMasks;
			}

			public Boolean getAllowUserToChangePassword() {
				return this.allowUserToChangePassword;
			}

			public void setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
				this.allowUserToChangePassword = allowUserToChangePassword;
			}

			public Boolean getEnforceMFAForLogin() {
				return this.enforceMFAForLogin;
			}

			public void setEnforceMFAForLogin(Boolean enforceMFAForLogin) {
				this.enforceMFAForLogin = enforceMFAForLogin;
			}

			public String getOperationForRiskLogin() {
				return this.operationForRiskLogin;
			}

			public void setOperationForRiskLogin(String operationForRiskLogin) {
				this.operationForRiskLogin = operationForRiskLogin;
			}

			public String getMFAOperationForLogin() {
				return this.mFAOperationForLogin;
			}

			public void setMFAOperationForLogin(String mFAOperationForLogin) {
				this.mFAOperationForLogin = mFAOperationForLogin;
			}
		}

		public static class MFAPreference {

			private Boolean allowUserToManageMFADevices;

			public Boolean getAllowUserToManageMFADevices() {
				return this.allowUserToManageMFADevices;
			}

			public void setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
				this.allowUserToManageMFADevices = allowUserToManageMFADevices;
			}
		}

		public static class VerificationPreference {

			private List<String> verificationTypes;

			public List<String> getVerificationTypes() {
				return this.verificationTypes;
			}

			public void setVerificationTypes(List<String> verificationTypes) {
				this.verificationTypes = verificationTypes;
			}
		}

		public static class PersonalInfoPreference {

			private Boolean allowUserToManagePersonalDingTalk;

			public Boolean getAllowUserToManagePersonalDingTalk() {
				return this.allowUserToManagePersonalDingTalk;
			}

			public void setAllowUserToManagePersonalDingTalk(Boolean allowUserToManagePersonalDingTalk) {
				this.allowUserToManagePersonalDingTalk = allowUserToManagePersonalDingTalk;
			}
		}

		public static class ApplicationLoginPreference {

			private Boolean allowUserLongTermLogin;

			public Boolean getAllowUserLongTermLogin() {
				return this.allowUserLongTermLogin;
			}

			public void setAllowUserLongTermLogin(Boolean allowUserLongTermLogin) {
				this.allowUserLongTermLogin = allowUserLongTermLogin;
			}
		}
	}

	@Override
	public SetSecurityPreferenceResponse getInstance(UnmarshallerContext context) {
		return	SetSecurityPreferenceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
