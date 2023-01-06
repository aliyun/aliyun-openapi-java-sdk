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
import com.aliyuncs.ims.transform.v20190815.UpdateApplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateApplicationResponse extends AcsResponse {

	private String requestId;

	private Application application;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Application getApplication() {
		return this.application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public static class Application {

		private String displayName;

		private Integer accessTokenValidity;

		private Boolean secretRequired;

		private String accountId;

		private String createDate;

		private String appName;

		private String updateDate;

		private String appId;

		private Integer refreshTokenValidity;

		private String appPrincipalName;

		private Boolean isMultiTenant;

		private String appType;

		private String tenantId;

		private List<String> redirectUris;

		private DelegatedScope delegatedScope;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Integer getAccessTokenValidity() {
			return this.accessTokenValidity;
		}

		public void setAccessTokenValidity(Integer accessTokenValidity) {
			this.accessTokenValidity = accessTokenValidity;
		}

		public Boolean getSecretRequired() {
			return this.secretRequired;
		}

		public void setSecretRequired(Boolean secretRequired) {
			this.secretRequired = secretRequired;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public Integer getRefreshTokenValidity() {
			return this.refreshTokenValidity;
		}

		public void setRefreshTokenValidity(Integer refreshTokenValidity) {
			this.refreshTokenValidity = refreshTokenValidity;
		}

		public String getAppPrincipalName() {
			return this.appPrincipalName;
		}

		public void setAppPrincipalName(String appPrincipalName) {
			this.appPrincipalName = appPrincipalName;
		}

		public Boolean getIsMultiTenant() {
			return this.isMultiTenant;
		}

		public void setIsMultiTenant(Boolean isMultiTenant) {
			this.isMultiTenant = isMultiTenant;
		}

		public String getAppType() {
			return this.appType;
		}

		public void setAppType(String appType) {
			this.appType = appType;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public List<String> getRedirectUris() {
			return this.redirectUris;
		}

		public void setRedirectUris(List<String> redirectUris) {
			this.redirectUris = redirectUris;
		}

		public DelegatedScope getDelegatedScope() {
			return this.delegatedScope;
		}

		public void setDelegatedScope(DelegatedScope delegatedScope) {
			this.delegatedScope = delegatedScope;
		}

		public static class DelegatedScope {

			private List<PredefinedScope> predefinedScopes;

			public List<PredefinedScope> getPredefinedScopes() {
				return this.predefinedScopes;
			}

			public void setPredefinedScopes(List<PredefinedScope> predefinedScopes) {
				this.predefinedScopes = predefinedScopes;
			}

			public static class PredefinedScope {

				private String description;

				private String name;

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public UpdateApplicationResponse getInstance(UnmarshallerContext context) {
		return	UpdateApplicationResponseUnmarshaller.unmarshall(this, context);
	}
}
