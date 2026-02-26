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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListIdentityProvidersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIdentityProvidersResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<IdentityProvider> identityProviders;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<IdentityProvider> getIdentityProviders() {
		return this.identityProviders;
	}

	public void setIdentityProviders(List<IdentityProvider> identityProviders) {
		this.identityProviders = identityProviders;
	}

	public static class IdentityProvider {

		private String instanceId;

		private String identityProviderId;

		private String identityProviderExternalId;

		private String description;

		private String identityProviderName;

		private String udPullStatus;

		private String authnSourceType;

		private String authnSourceSupplier;

		private String authnStatus;

		private String incrementalCallbackStatus;

		private String udPullTargetScope;

		private String identityProviderType;

		private String advancedStatus;

		private String udPushStatus;

		private String lockReason;

		private String lastStatusCheckJobResult;

		private Long createTime;

		private Long updateTime;

		private String logoUrl;

		private String periodicSyncStatus;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIdentityProviderId() {
			return this.identityProviderId;
		}

		public void setIdentityProviderId(String identityProviderId) {
			this.identityProviderId = identityProviderId;
		}

		public String getIdentityProviderExternalId() {
			return this.identityProviderExternalId;
		}

		public void setIdentityProviderExternalId(String identityProviderExternalId) {
			this.identityProviderExternalId = identityProviderExternalId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIdentityProviderName() {
			return this.identityProviderName;
		}

		public void setIdentityProviderName(String identityProviderName) {
			this.identityProviderName = identityProviderName;
		}

		public String getUdPullStatus() {
			return this.udPullStatus;
		}

		public void setUdPullStatus(String udPullStatus) {
			this.udPullStatus = udPullStatus;
		}

		public String getAuthnSourceType() {
			return this.authnSourceType;
		}

		public void setAuthnSourceType(String authnSourceType) {
			this.authnSourceType = authnSourceType;
		}

		public String getAuthnSourceSupplier() {
			return this.authnSourceSupplier;
		}

		public void setAuthnSourceSupplier(String authnSourceSupplier) {
			this.authnSourceSupplier = authnSourceSupplier;
		}

		public String getAuthnStatus() {
			return this.authnStatus;
		}

		public void setAuthnStatus(String authnStatus) {
			this.authnStatus = authnStatus;
		}

		public String getIncrementalCallbackStatus() {
			return this.incrementalCallbackStatus;
		}

		public void setIncrementalCallbackStatus(String incrementalCallbackStatus) {
			this.incrementalCallbackStatus = incrementalCallbackStatus;
		}

		public String getUdPullTargetScope() {
			return this.udPullTargetScope;
		}

		public void setUdPullTargetScope(String udPullTargetScope) {
			this.udPullTargetScope = udPullTargetScope;
		}

		public String getIdentityProviderType() {
			return this.identityProviderType;
		}

		public void setIdentityProviderType(String identityProviderType) {
			this.identityProviderType = identityProviderType;
		}

		public String getAdvancedStatus() {
			return this.advancedStatus;
		}

		public void setAdvancedStatus(String advancedStatus) {
			this.advancedStatus = advancedStatus;
		}

		public String getUdPushStatus() {
			return this.udPushStatus;
		}

		public void setUdPushStatus(String udPushStatus) {
			this.udPushStatus = udPushStatus;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getLastStatusCheckJobResult() {
			return this.lastStatusCheckJobResult;
		}

		public void setLastStatusCheckJobResult(String lastStatusCheckJobResult) {
			this.lastStatusCheckJobResult = lastStatusCheckJobResult;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getLogoUrl() {
			return this.logoUrl;
		}

		public void setLogoUrl(String logoUrl) {
			this.logoUrl = logoUrl;
		}

		public String getPeriodicSyncStatus() {
			return this.periodicSyncStatus;
		}

		public void setPeriodicSyncStatus(String periodicSyncStatus) {
			this.periodicSyncStatus = periodicSyncStatus;
		}
	}

	@Override
	public ListIdentityProvidersResponse getInstance(UnmarshallerContext context) {
		return	ListIdentityProvidersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
