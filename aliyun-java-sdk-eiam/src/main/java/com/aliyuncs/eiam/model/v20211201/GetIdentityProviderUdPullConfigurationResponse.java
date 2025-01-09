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
import com.aliyuncs.eiam.transform.v20211201.GetIdentityProviderUdPullConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIdentityProviderUdPullConfigurationResponse extends AcsResponse {

	private String requestId;

	private UdPullConfiguration udPullConfiguration;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UdPullConfiguration getUdPullConfiguration() {
		return this.udPullConfiguration;
	}

	public void setUdPullConfiguration(UdPullConfiguration udPullConfiguration) {
		this.udPullConfiguration = udPullConfiguration;
	}

	public static class UdPullConfiguration {

		private String instanceId;

		private String identityProviderId;

		private String incrementalCallbackStatus;

		private String periodicSyncStatus;

		private String groupSyncStatus;

		private UdSyncScopeConfig udSyncScopeConfig;

		private PullProtectedRule pullProtectedRule;

		private LdapUdPullConfig ldapUdPullConfig;

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

		public String getIncrementalCallbackStatus() {
			return this.incrementalCallbackStatus;
		}

		public void setIncrementalCallbackStatus(String incrementalCallbackStatus) {
			this.incrementalCallbackStatus = incrementalCallbackStatus;
		}

		public String getPeriodicSyncStatus() {
			return this.periodicSyncStatus;
		}

		public void setPeriodicSyncStatus(String periodicSyncStatus) {
			this.periodicSyncStatus = periodicSyncStatus;
		}

		public String getGroupSyncStatus() {
			return this.groupSyncStatus;
		}

		public void setGroupSyncStatus(String groupSyncStatus) {
			this.groupSyncStatus = groupSyncStatus;
		}

		public UdSyncScopeConfig getUdSyncScopeConfig() {
			return this.udSyncScopeConfig;
		}

		public void setUdSyncScopeConfig(UdSyncScopeConfig udSyncScopeConfig) {
			this.udSyncScopeConfig = udSyncScopeConfig;
		}

		public PullProtectedRule getPullProtectedRule() {
			return this.pullProtectedRule;
		}

		public void setPullProtectedRule(PullProtectedRule pullProtectedRule) {
			this.pullProtectedRule = pullProtectedRule;
		}

		public LdapUdPullConfig getLdapUdPullConfig() {
			return this.ldapUdPullConfig;
		}

		public void setLdapUdPullConfig(LdapUdPullConfig ldapUdPullConfig) {
			this.ldapUdPullConfig = ldapUdPullConfig;
		}

		public static class UdSyncScopeConfig {

			private String targetScope;

			private List<String> sourceScopes;

			public String getTargetScope() {
				return this.targetScope;
			}

			public void setTargetScope(String targetScope) {
				this.targetScope = targetScope;
			}

			public List<String> getSourceScopes() {
				return this.sourceScopes;
			}

			public void setSourceScopes(List<String> sourceScopes) {
				this.sourceScopes = sourceScopes;
			}
		}

		public static class PullProtectedRule {

			private Integer userDeletedThreshold;

			private Integer organizationalUnitDeletedThreshold;

			private Integer groupDeletedThreshold;

			public Integer getUserDeletedThreshold() {
				return this.userDeletedThreshold;
			}

			public void setUserDeletedThreshold(Integer userDeletedThreshold) {
				this.userDeletedThreshold = userDeletedThreshold;
			}

			public Integer getOrganizationalUnitDeletedThreshold() {
				return this.organizationalUnitDeletedThreshold;
			}

			public void setOrganizationalUnitDeletedThreshold(Integer organizationalUnitDeletedThreshold) {
				this.organizationalUnitDeletedThreshold = organizationalUnitDeletedThreshold;
			}

			public Integer getGroupDeletedThreshold() {
				return this.groupDeletedThreshold;
			}

			public void setGroupDeletedThreshold(Integer groupDeletedThreshold) {
				this.groupDeletedThreshold = groupDeletedThreshold;
			}
		}

		public static class LdapUdPullConfig {

			private String userObjectClass;

			private String organizationUnitObjectClass;

			private String userObjectClassCustomFilter;

			private String groupObjectClass;

			private String groupMemberAttributeName;

			private String groupObjectClassCustomFilter;

			public String getUserObjectClass() {
				return this.userObjectClass;
			}

			public void setUserObjectClass(String userObjectClass) {
				this.userObjectClass = userObjectClass;
			}

			public String getOrganizationUnitObjectClass() {
				return this.organizationUnitObjectClass;
			}

			public void setOrganizationUnitObjectClass(String organizationUnitObjectClass) {
				this.organizationUnitObjectClass = organizationUnitObjectClass;
			}

			public String getUserObjectClassCustomFilter() {
				return this.userObjectClassCustomFilter;
			}

			public void setUserObjectClassCustomFilter(String userObjectClassCustomFilter) {
				this.userObjectClassCustomFilter = userObjectClassCustomFilter;
			}

			public String getGroupObjectClass() {
				return this.groupObjectClass;
			}

			public void setGroupObjectClass(String groupObjectClass) {
				this.groupObjectClass = groupObjectClass;
			}

			public String getGroupMemberAttributeName() {
				return this.groupMemberAttributeName;
			}

			public void setGroupMemberAttributeName(String groupMemberAttributeName) {
				this.groupMemberAttributeName = groupMemberAttributeName;
			}

			public String getGroupObjectClassCustomFilter() {
				return this.groupObjectClassCustomFilter;
			}

			public void setGroupObjectClassCustomFilter(String groupObjectClassCustomFilter) {
				this.groupObjectClassCustomFilter = groupObjectClassCustomFilter;
			}
		}
	}

	@Override
	public GetIdentityProviderUdPullConfigurationResponse getInstance(UnmarshallerContext context) {
		return	GetIdentityProviderUdPullConfigurationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
