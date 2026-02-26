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
import com.aliyuncs.ims.transform.v20190815.GetUserSsoSettingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserSsoSettingsResponse extends AcsResponse {

	private String requestId;

	private UserSsoSettings userSsoSettings;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UserSsoSettings getUserSsoSettings() {
		return this.userSsoSettings;
	}

	public void setUserSsoSettings(UserSsoSettings userSsoSettings) {
		this.userSsoSettings = userSsoSettings;
	}

	public static class UserSsoSettings {

		private String auxiliaryDomain;

		private String metadataDocument;

		private Boolean ssoEnabled;

		private Boolean useTenantSpecificSp;

		private String name;

		private Boolean ssoLoginWithDomain;

		public String getAuxiliaryDomain() {
			return this.auxiliaryDomain;
		}

		public void setAuxiliaryDomain(String auxiliaryDomain) {
			this.auxiliaryDomain = auxiliaryDomain;
		}

		public String getMetadataDocument() {
			return this.metadataDocument;
		}

		public void setMetadataDocument(String metadataDocument) {
			this.metadataDocument = metadataDocument;
		}

		public Boolean getSsoEnabled() {
			return this.ssoEnabled;
		}

		public void setSsoEnabled(Boolean ssoEnabled) {
			this.ssoEnabled = ssoEnabled;
		}

		public Boolean getUseTenantSpecificSp() {
			return this.useTenantSpecificSp;
		}

		public void setUseTenantSpecificSp(Boolean useTenantSpecificSp) {
			this.useTenantSpecificSp = useTenantSpecificSp;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getSsoLoginWithDomain() {
			return this.ssoLoginWithDomain;
		}

		public void setSsoLoginWithDomain(Boolean ssoLoginWithDomain) {
			this.ssoLoginWithDomain = ssoLoginWithDomain;
		}
	}

	@Override
	public GetUserSsoSettingsResponse getInstance(UnmarshallerContext context) {
		return	GetUserSsoSettingsResponseUnmarshaller.unmarshall(this, context);
	}
}
