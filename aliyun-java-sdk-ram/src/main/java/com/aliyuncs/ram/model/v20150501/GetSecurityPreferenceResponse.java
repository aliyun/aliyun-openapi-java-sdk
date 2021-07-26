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
import com.aliyuncs.ram.transform.v20150501.GetSecurityPreferenceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSecurityPreferenceResponse extends AcsResponse {

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

		private MFAPreference mFAPreference;

		private LoginProfilePreference loginProfilePreference;

		private PublicKeyPreference publicKeyPreference;

		public AccessKeyPreference getAccessKeyPreference() {
			return this.accessKeyPreference;
		}

		public void setAccessKeyPreference(AccessKeyPreference accessKeyPreference) {
			this.accessKeyPreference = accessKeyPreference;
		}

		public MFAPreference getMFAPreference() {
			return this.mFAPreference;
		}

		public void setMFAPreference(MFAPreference mFAPreference) {
			this.mFAPreference = mFAPreference;
		}

		public LoginProfilePreference getLoginProfilePreference() {
			return this.loginProfilePreference;
		}

		public void setLoginProfilePreference(LoginProfilePreference loginProfilePreference) {
			this.loginProfilePreference = loginProfilePreference;
		}

		public PublicKeyPreference getPublicKeyPreference() {
			return this.publicKeyPreference;
		}

		public void setPublicKeyPreference(PublicKeyPreference publicKeyPreference) {
			this.publicKeyPreference = publicKeyPreference;
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

		public static class MFAPreference {

			private Boolean allowUserToManageMFADevices;

			public Boolean getAllowUserToManageMFADevices() {
				return this.allowUserToManageMFADevices;
			}

			public void setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
				this.allowUserToManageMFADevices = allowUserToManageMFADevices;
			}
		}

		public static class LoginProfilePreference {

			private Boolean enableSaveMFATicket;

			private Integer loginSessionDuration;

			private String loginNetworkMasks;

			private Boolean allowUserToChangePassword;

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
	}

	@Override
	public GetSecurityPreferenceResponse getInstance(UnmarshallerContext context) {
		return	GetSecurityPreferenceResponseUnmarshaller.unmarshall(this, context);
	}
}
