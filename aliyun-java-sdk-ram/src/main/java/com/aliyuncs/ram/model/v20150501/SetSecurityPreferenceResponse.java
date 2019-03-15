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
import com.aliyuncs.ram.transform.v20150501.SetSecurityPreferenceResponseUnmarshaller;
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

		private LoginProfilePreference loginProfilePreference;

		private AccessKeyPreference accessKeyPreference;

		private PublicKeyPreference publicKeyPreference;

		private MFAPreference mFAPreference;

		public LoginProfilePreference getLoginProfilePreference() {
			return this.loginProfilePreference;
		}

		public void setLoginProfilePreference(LoginProfilePreference loginProfilePreference) {
			this.loginProfilePreference = loginProfilePreference;
		}

		public AccessKeyPreference getAccessKeyPreference() {
			return this.accessKeyPreference;
		}

		public void setAccessKeyPreference(AccessKeyPreference accessKeyPreference) {
			this.accessKeyPreference = accessKeyPreference;
		}

		public PublicKeyPreference getPublicKeyPreference() {
			return this.publicKeyPreference;
		}

		public void setPublicKeyPreference(PublicKeyPreference publicKeyPreference) {
			this.publicKeyPreference = publicKeyPreference;
		}

		public MFAPreference getMFAPreference() {
			return this.mFAPreference;
		}

		public void setMFAPreference(MFAPreference mFAPreference) {
			this.mFAPreference = mFAPreference;
		}

		public static class LoginProfilePreference {

			private Boolean enableSaveMFATicket;

			private Boolean allowUserToChangePassword;

			private Integer loginSessionDuration;

			private String loginNetworkMasks;

			public Boolean getEnableSaveMFATicket() {
				return this.enableSaveMFATicket;
			}

			public void setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
				this.enableSaveMFATicket = enableSaveMFATicket;
			}

			public Boolean getAllowUserToChangePassword() {
				return this.allowUserToChangePassword;
			}

			public void setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
				this.allowUserToChangePassword = allowUserToChangePassword;
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

		public static class PublicKeyPreference {

			private Boolean allowUserToManagePublicKeys;

			public Boolean getAllowUserToManagePublicKeys() {
				return this.allowUserToManagePublicKeys;
			}

			public void setAllowUserToManagePublicKeys(Boolean allowUserToManagePublicKeys) {
				this.allowUserToManagePublicKeys = allowUserToManagePublicKeys;
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
	}

	@Override
	public SetSecurityPreferenceResponse getInstance(UnmarshallerContext context) {
		return	SetSecurityPreferenceResponseUnmarshaller.unmarshall(this, context);
	}
}
