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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SetIdentityProviderUdPullConfigurationRequest extends RpcAcsRequest<SetIdentityProviderUdPullConfigurationResponse> {
	   

	private String groupSyncStatus;

	private UdSyncScopeConfig udSyncScopeConfig;

	private String periodicSyncStatus;

	private LdapUdPullConfig ldapUdPullConfig;

	private String identityProviderId;

	private String instanceId;

	private PullProtectedRule pullProtectedRule;

	private String incrementalCallbackStatus;
	public SetIdentityProviderUdPullConfigurationRequest() {
		super("Eiam", "2021-12-01", "SetIdentityProviderUdPullConfiguration", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getGroupSyncStatus() {
		return this.groupSyncStatus;
	}

	public void setGroupSyncStatus(String groupSyncStatus) {
		this.groupSyncStatus = groupSyncStatus;
		if(groupSyncStatus != null){
			putQueryParameter("GroupSyncStatus", groupSyncStatus);
		}
	}

	public UdSyncScopeConfig getUdSyncScopeConfig() {
		return this.udSyncScopeConfig;
	}

	public void setUdSyncScopeConfig(UdSyncScopeConfig udSyncScopeConfig) {
		this.udSyncScopeConfig = udSyncScopeConfig;	
		if (udSyncScopeConfig != null) {
			
				putQueryParameter("UdSyncScopeConfig.TargetScope" , udSyncScopeConfig.getTargetScope());
				if (udSyncScopeConfig.getSourceScopes() != null) {
					for (int depth1 = 0; depth1 < udSyncScopeConfig.getSourceScopes().size(); depth1++) {
						putQueryParameter("UdSyncScopeConfig.SourceScopes." + (depth1 + 1) , udSyncScopeConfig.getSourceScopes().get(depth1));
					}
				}
		}	
	}

	public String getPeriodicSyncStatus() {
		return this.periodicSyncStatus;
	}

	public void setPeriodicSyncStatus(String periodicSyncStatus) {
		this.periodicSyncStatus = periodicSyncStatus;
		if(periodicSyncStatus != null){
			putQueryParameter("PeriodicSyncStatus", periodicSyncStatus);
		}
	}

	public LdapUdPullConfig getLdapUdPullConfig() {
		return this.ldapUdPullConfig;
	}

	public void setLdapUdPullConfig(LdapUdPullConfig ldapUdPullConfig) {
		this.ldapUdPullConfig = ldapUdPullConfig;	
		if (ldapUdPullConfig != null) {
			
				putQueryParameter("LdapUdPullConfig.GroupMemberAttributeName" , ldapUdPullConfig.getGroupMemberAttributeName());
				putQueryParameter("LdapUdPullConfig.UserObjectClass" , ldapUdPullConfig.getUserObjectClass());
				putQueryParameter("LdapUdPullConfig.UserObjectClassCustomFilter" , ldapUdPullConfig.getUserObjectClassCustomFilter());
				putQueryParameter("LdapUdPullConfig.GroupObjectClass" , ldapUdPullConfig.getGroupObjectClass());
				putQueryParameter("LdapUdPullConfig.GroupObjectClassCustomFilter" , ldapUdPullConfig.getGroupObjectClassCustomFilter());
				putQueryParameter("LdapUdPullConfig.OrganizationUnitObjectClass" , ldapUdPullConfig.getOrganizationUnitObjectClass());
		}	
	}

	public String getIdentityProviderId() {
		return this.identityProviderId;
	}

	public void setIdentityProviderId(String identityProviderId) {
		this.identityProviderId = identityProviderId;
		if(identityProviderId != null){
			putQueryParameter("IdentityProviderId", identityProviderId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public PullProtectedRule getPullProtectedRule() {
		return this.pullProtectedRule;
	}

	public void setPullProtectedRule(PullProtectedRule pullProtectedRule) {
		this.pullProtectedRule = pullProtectedRule;	
		if (pullProtectedRule != null) {
			
				putQueryParameter("PullProtectedRule.UserDeletedThreshold" , pullProtectedRule.getUserDeletedThreshold());
				putQueryParameter("PullProtectedRule.GroupDeletedThreshold" , pullProtectedRule.getGroupDeletedThreshold());
				putQueryParameter("PullProtectedRule.OrganizationalUnitDeletedThreshold" , pullProtectedRule.getOrganizationalUnitDeletedThreshold());
		}	
	}

	public String getIncrementalCallbackStatus() {
		return this.incrementalCallbackStatus;
	}

	public void setIncrementalCallbackStatus(String incrementalCallbackStatus) {
		this.incrementalCallbackStatus = incrementalCallbackStatus;
		if(incrementalCallbackStatus != null){
			putQueryParameter("IncrementalCallbackStatus", incrementalCallbackStatus);
		}
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

	public static class LdapUdPullConfig {

		private String groupMemberAttributeName;

		private String userObjectClass;

		private String userObjectClassCustomFilter;

		private String groupObjectClass;

		private String groupObjectClassCustomFilter;

		private String organizationUnitObjectClass;

		public String getGroupMemberAttributeName() {
			return this.groupMemberAttributeName;
		}

		public void setGroupMemberAttributeName(String groupMemberAttributeName) {
			this.groupMemberAttributeName = groupMemberAttributeName;
		}

		public String getUserObjectClass() {
			return this.userObjectClass;
		}

		public void setUserObjectClass(String userObjectClass) {
			this.userObjectClass = userObjectClass;
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

		public String getGroupObjectClassCustomFilter() {
			return this.groupObjectClassCustomFilter;
		}

		public void setGroupObjectClassCustomFilter(String groupObjectClassCustomFilter) {
			this.groupObjectClassCustomFilter = groupObjectClassCustomFilter;
		}

		public String getOrganizationUnitObjectClass() {
			return this.organizationUnitObjectClass;
		}

		public void setOrganizationUnitObjectClass(String organizationUnitObjectClass) {
			this.organizationUnitObjectClass = organizationUnitObjectClass;
		}
	}

	public static class PullProtectedRule {

		private Integer userDeletedThreshold;

		private Integer groupDeletedThreshold;

		private Integer organizationalUnitDeletedThreshold;

		public Integer getUserDeletedThreshold() {
			return this.userDeletedThreshold;
		}

		public void setUserDeletedThreshold(Integer userDeletedThreshold) {
			this.userDeletedThreshold = userDeletedThreshold;
		}

		public Integer getGroupDeletedThreshold() {
			return this.groupDeletedThreshold;
		}

		public void setGroupDeletedThreshold(Integer groupDeletedThreshold) {
			this.groupDeletedThreshold = groupDeletedThreshold;
		}

		public Integer getOrganizationalUnitDeletedThreshold() {
			return this.organizationalUnitDeletedThreshold;
		}

		public void setOrganizationalUnitDeletedThreshold(Integer organizationalUnitDeletedThreshold) {
			this.organizationalUnitDeletedThreshold = organizationalUnitDeletedThreshold;
		}
	}

	@Override
	public Class<SetIdentityProviderUdPullConfigurationResponse> getResponseClass() {
		return SetIdentityProviderUdPullConfigurationResponse.class;
	}

}
