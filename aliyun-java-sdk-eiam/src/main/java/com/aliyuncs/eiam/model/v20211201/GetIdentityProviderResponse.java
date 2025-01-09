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
import com.aliyuncs.eiam.transform.v20211201.GetIdentityProviderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIdentityProviderResponse extends AcsResponse {

	private String requestId;

	private IdentityProviderDetail identityProviderDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public IdentityProviderDetail getIdentityProviderDetail() {
		return this.identityProviderDetail;
	}

	public void setIdentityProviderDetail(IdentityProviderDetail identityProviderDetail) {
		this.identityProviderDetail = identityProviderDetail;
	}

	public static class IdentityProviderDetail {

		private String advancedStatus;

		private String authnSourceSupplier;

		private String authnSourceType;

		private String authnStatus;

		private Long createTime;

		private String description;

		private String identityProviderExternalId;

		private String identityProviderId;

		private String identityProviderName;

		private String identityProviderType;

		private String instanceId;

		private String lastStatusCheckJobResult;

		private String lockReason;

		private String networkAccessEndpointId;

		private String udPullStatus;

		private String udPushStatus;

		private Long updateTime;

		private String logoUrl;

		private DingtalkAppConfig dingtalkAppConfig;

		private DingtalkProvisioningConfig dingtalkProvisioningConfig;

		private LarkConfig larkConfig;

		private LdapConfig ldapConfig;

		private OidcConfig oidcConfig;

		private UdPullConfig udPullConfig;

		private UdPushConfig udPushConfig;

		private WeComConfig weComConfig;

		public String getAdvancedStatus() {
			return this.advancedStatus;
		}

		public void setAdvancedStatus(String advancedStatus) {
			this.advancedStatus = advancedStatus;
		}

		public String getAuthnSourceSupplier() {
			return this.authnSourceSupplier;
		}

		public void setAuthnSourceSupplier(String authnSourceSupplier) {
			this.authnSourceSupplier = authnSourceSupplier;
		}

		public String getAuthnSourceType() {
			return this.authnSourceType;
		}

		public void setAuthnSourceType(String authnSourceType) {
			this.authnSourceType = authnSourceType;
		}

		public String getAuthnStatus() {
			return this.authnStatus;
		}

		public void setAuthnStatus(String authnStatus) {
			this.authnStatus = authnStatus;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIdentityProviderExternalId() {
			return this.identityProviderExternalId;
		}

		public void setIdentityProviderExternalId(String identityProviderExternalId) {
			this.identityProviderExternalId = identityProviderExternalId;
		}

		public String getIdentityProviderId() {
			return this.identityProviderId;
		}

		public void setIdentityProviderId(String identityProviderId) {
			this.identityProviderId = identityProviderId;
		}

		public String getIdentityProviderName() {
			return this.identityProviderName;
		}

		public void setIdentityProviderName(String identityProviderName) {
			this.identityProviderName = identityProviderName;
		}

		public String getIdentityProviderType() {
			return this.identityProviderType;
		}

		public void setIdentityProviderType(String identityProviderType) {
			this.identityProviderType = identityProviderType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getLastStatusCheckJobResult() {
			return this.lastStatusCheckJobResult;
		}

		public void setLastStatusCheckJobResult(String lastStatusCheckJobResult) {
			this.lastStatusCheckJobResult = lastStatusCheckJobResult;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getNetworkAccessEndpointId() {
			return this.networkAccessEndpointId;
		}

		public void setNetworkAccessEndpointId(String networkAccessEndpointId) {
			this.networkAccessEndpointId = networkAccessEndpointId;
		}

		public String getUdPullStatus() {
			return this.udPullStatus;
		}

		public void setUdPullStatus(String udPullStatus) {
			this.udPullStatus = udPullStatus;
		}

		public String getUdPushStatus() {
			return this.udPushStatus;
		}

		public void setUdPushStatus(String udPushStatus) {
			this.udPushStatus = udPushStatus;
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

		public DingtalkAppConfig getDingtalkAppConfig() {
			return this.dingtalkAppConfig;
		}

		public void setDingtalkAppConfig(DingtalkAppConfig dingtalkAppConfig) {
			this.dingtalkAppConfig = dingtalkAppConfig;
		}

		public DingtalkProvisioningConfig getDingtalkProvisioningConfig() {
			return this.dingtalkProvisioningConfig;
		}

		public void setDingtalkProvisioningConfig(DingtalkProvisioningConfig dingtalkProvisioningConfig) {
			this.dingtalkProvisioningConfig = dingtalkProvisioningConfig;
		}

		public LarkConfig getLarkConfig() {
			return this.larkConfig;
		}

		public void setLarkConfig(LarkConfig larkConfig) {
			this.larkConfig = larkConfig;
		}

		public LdapConfig getLdapConfig() {
			return this.ldapConfig;
		}

		public void setLdapConfig(LdapConfig ldapConfig) {
			this.ldapConfig = ldapConfig;
		}

		public OidcConfig getOidcConfig() {
			return this.oidcConfig;
		}

		public void setOidcConfig(OidcConfig oidcConfig) {
			this.oidcConfig = oidcConfig;
		}

		public UdPullConfig getUdPullConfig() {
			return this.udPullConfig;
		}

		public void setUdPullConfig(UdPullConfig udPullConfig) {
			this.udPullConfig = udPullConfig;
		}

		public UdPushConfig getUdPushConfig() {
			return this.udPushConfig;
		}

		public void setUdPushConfig(UdPushConfig udPushConfig) {
			this.udPushConfig = udPushConfig;
		}

		public WeComConfig getWeComConfig() {
			return this.weComConfig;
		}

		public void setWeComConfig(WeComConfig weComConfig) {
			this.weComConfig = weComConfig;
		}

		public static class DingtalkAppConfig {

			private String appKey;

			private String appSecret;

			private String corpId;

			private String dingtalkVersion;

			public String getAppKey() {
				return this.appKey;
			}

			public void setAppKey(String appKey) {
				this.appKey = appKey;
			}

			public String getAppSecret() {
				return this.appSecret;
			}

			public void setAppSecret(String appSecret) {
				this.appSecret = appSecret;
			}

			public String getCorpId() {
				return this.corpId;
			}

			public void setCorpId(String corpId) {
				this.corpId = corpId;
			}

			public String getDingtalkVersion() {
				return this.dingtalkVersion;
			}

			public void setDingtalkVersion(String dingtalkVersion) {
				this.dingtalkVersion = dingtalkVersion;
			}
		}

		public static class DingtalkProvisioningConfig {

			private String corpId;

			private String corpName;

			private List<AuthedDepartmentId> authedDepartmentIds;

			private List<AuthedUser> authedUsers;

			public String getCorpId() {
				return this.corpId;
			}

			public void setCorpId(String corpId) {
				this.corpId = corpId;
			}

			public String getCorpName() {
				return this.corpName;
			}

			public void setCorpName(String corpName) {
				this.corpName = corpName;
			}

			public List<AuthedDepartmentId> getAuthedDepartmentIds() {
				return this.authedDepartmentIds;
			}

			public void setAuthedDepartmentIds(List<AuthedDepartmentId> authedDepartmentIds) {
				this.authedDepartmentIds = authedDepartmentIds;
			}

			public List<AuthedUser> getAuthedUsers() {
				return this.authedUsers;
			}

			public void setAuthedUsers(List<AuthedUser> authedUsers) {
				this.authedUsers = authedUsers;
			}

			public static class AuthedDepartmentId {

				private String deptId;

				private String deptName;

				public String getDeptId() {
					return this.deptId;
				}

				public void setDeptId(String deptId) {
					this.deptId = deptId;
				}

				public String getDeptName() {
					return this.deptName;
				}

				public void setDeptName(String deptName) {
					this.deptName = deptName;
				}
			}

			public static class AuthedUser {

				private String name;

				private String userId;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}
			}
		}

		public static class LarkConfig {

			private String appId;

			private String appSecret;

			private String enterpriseNumber;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getAppSecret() {
				return this.appSecret;
			}

			public void setAppSecret(String appSecret) {
				this.appSecret = appSecret;
			}

			public String getEnterpriseNumber() {
				return this.enterpriseNumber;
			}

			public void setEnterpriseNumber(String enterpriseNumber) {
				this.enterpriseNumber = enterpriseNumber;
			}
		}

		public static class LdapConfig {

			private String administratorPassword;

			private String administratorUsername;

			private String certificateFingerprintStatus;

			private String ldapProtocol;

			private String ldapServerHost;

			private Integer ldapServerPort;

			private String startTlsStatus;

			private List<String> certificateFingerprints;

			public String getAdministratorPassword() {
				return this.administratorPassword;
			}

			public void setAdministratorPassword(String administratorPassword) {
				this.administratorPassword = administratorPassword;
			}

			public String getAdministratorUsername() {
				return this.administratorUsername;
			}

			public void setAdministratorUsername(String administratorUsername) {
				this.administratorUsername = administratorUsername;
			}

			public String getCertificateFingerprintStatus() {
				return this.certificateFingerprintStatus;
			}

			public void setCertificateFingerprintStatus(String certificateFingerprintStatus) {
				this.certificateFingerprintStatus = certificateFingerprintStatus;
			}

			public String getLdapProtocol() {
				return this.ldapProtocol;
			}

			public void setLdapProtocol(String ldapProtocol) {
				this.ldapProtocol = ldapProtocol;
			}

			public String getLdapServerHost() {
				return this.ldapServerHost;
			}

			public void setLdapServerHost(String ldapServerHost) {
				this.ldapServerHost = ldapServerHost;
			}

			public Integer getLdapServerPort() {
				return this.ldapServerPort;
			}

			public void setLdapServerPort(Integer ldapServerPort) {
				this.ldapServerPort = ldapServerPort;
			}

			public String getStartTlsStatus() {
				return this.startTlsStatus;
			}

			public void setStartTlsStatus(String startTlsStatus) {
				this.startTlsStatus = startTlsStatus;
			}

			public List<String> getCertificateFingerprints() {
				return this.certificateFingerprints;
			}

			public void setCertificateFingerprints(List<String> certificateFingerprints) {
				this.certificateFingerprints = certificateFingerprints;
			}
		}

		public static class OidcConfig {

			private String grantType;

			private String pkceChallengeMethod;

			private Boolean pkceRequired;

			private List<String> grantScopes;

			private AuthnParam authnParam;

			private EndpointConfig endpointConfig;

			public String getGrantType() {
				return this.grantType;
			}

			public void setGrantType(String grantType) {
				this.grantType = grantType;
			}

			public String getPkceChallengeMethod() {
				return this.pkceChallengeMethod;
			}

			public void setPkceChallengeMethod(String pkceChallengeMethod) {
				this.pkceChallengeMethod = pkceChallengeMethod;
			}

			public Boolean getPkceRequired() {
				return this.pkceRequired;
			}

			public void setPkceRequired(Boolean pkceRequired) {
				this.pkceRequired = pkceRequired;
			}

			public List<String> getGrantScopes() {
				return this.grantScopes;
			}

			public void setGrantScopes(List<String> grantScopes) {
				this.grantScopes = grantScopes;
			}

			public AuthnParam getAuthnParam() {
				return this.authnParam;
			}

			public void setAuthnParam(AuthnParam authnParam) {
				this.authnParam = authnParam;
			}

			public EndpointConfig getEndpointConfig() {
				return this.endpointConfig;
			}

			public void setEndpointConfig(EndpointConfig endpointConfig) {
				this.endpointConfig = endpointConfig;
			}

			public static class AuthnParam {

				private String authnMethod;

				private String clientId;

				private String clientSecret;

				public String getAuthnMethod() {
					return this.authnMethod;
				}

				public void setAuthnMethod(String authnMethod) {
					this.authnMethod = authnMethod;
				}

				public String getClientId() {
					return this.clientId;
				}

				public void setClientId(String clientId) {
					this.clientId = clientId;
				}

				public String getClientSecret() {
					return this.clientSecret;
				}

				public void setClientSecret(String clientSecret) {
					this.clientSecret = clientSecret;
				}
			}

			public static class EndpointConfig {

				private String authorizationEndpoint;

				private String issuer;

				private String jwksUri;

				private String tokenEndpoint;

				private String userinfoEndpoint;

				public String getAuthorizationEndpoint() {
					return this.authorizationEndpoint;
				}

				public void setAuthorizationEndpoint(String authorizationEndpoint) {
					this.authorizationEndpoint = authorizationEndpoint;
				}

				public String getIssuer() {
					return this.issuer;
				}

				public void setIssuer(String issuer) {
					this.issuer = issuer;
				}

				public String getJwksUri() {
					return this.jwksUri;
				}

				public void setJwksUri(String jwksUri) {
					this.jwksUri = jwksUri;
				}

				public String getTokenEndpoint() {
					return this.tokenEndpoint;
				}

				public void setTokenEndpoint(String tokenEndpoint) {
					this.tokenEndpoint = tokenEndpoint;
				}

				public String getUserinfoEndpoint() {
					return this.userinfoEndpoint;
				}

				public void setUserinfoEndpoint(String userinfoEndpoint) {
					this.userinfoEndpoint = userinfoEndpoint;
				}
			}
		}

		public static class UdPullConfig {

			private String groupSyncStatus;

			private String incrementalCallbackStatus;

			private UdSyncScopeConfig udSyncScopeConfig;

			public String getGroupSyncStatus() {
				return this.groupSyncStatus;
			}

			public void setGroupSyncStatus(String groupSyncStatus) {
				this.groupSyncStatus = groupSyncStatus;
			}

			public String getIncrementalCallbackStatus() {
				return this.incrementalCallbackStatus;
			}

			public void setIncrementalCallbackStatus(String incrementalCallbackStatus) {
				this.incrementalCallbackStatus = incrementalCallbackStatus;
			}

			public UdSyncScopeConfig getUdSyncScopeConfig() {
				return this.udSyncScopeConfig;
			}

			public void setUdSyncScopeConfig(UdSyncScopeConfig udSyncScopeConfig) {
				this.udSyncScopeConfig = udSyncScopeConfig;
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
		}

		public static class UdPushConfig {

			private String incrementalCallbackStatus;

			private List<UdSyncScopeConfig1> udSyncScopeConfigs;

			public String getIncrementalCallbackStatus() {
				return this.incrementalCallbackStatus;
			}

			public void setIncrementalCallbackStatus(String incrementalCallbackStatus) {
				this.incrementalCallbackStatus = incrementalCallbackStatus;
			}

			public List<UdSyncScopeConfig1> getUdSyncScopeConfigs() {
				return this.udSyncScopeConfigs;
			}

			public void setUdSyncScopeConfigs(List<UdSyncScopeConfig1> udSyncScopeConfigs) {
				this.udSyncScopeConfigs = udSyncScopeConfigs;
			}

			public static class UdSyncScopeConfig1 {

				private String targetScope;

				private List<String> sourceScopes2;

				public String getTargetScope() {
					return this.targetScope;
				}

				public void setTargetScope(String targetScope) {
					this.targetScope = targetScope;
				}

				public List<String> getSourceScopes2() {
					return this.sourceScopes2;
				}

				public void setSourceScopes2(List<String> sourceScopes2) {
					this.sourceScopes2 = sourceScopes2;
				}
			}
		}

		public static class WeComConfig {

			private String agentId;

			private String authorizeCallbackDomain;

			private String corpId;

			private String corpSecret;

			private String trustableDomain;

			public String getAgentId() {
				return this.agentId;
			}

			public void setAgentId(String agentId) {
				this.agentId = agentId;
			}

			public String getAuthorizeCallbackDomain() {
				return this.authorizeCallbackDomain;
			}

			public void setAuthorizeCallbackDomain(String authorizeCallbackDomain) {
				this.authorizeCallbackDomain = authorizeCallbackDomain;
			}

			public String getCorpId() {
				return this.corpId;
			}

			public void setCorpId(String corpId) {
				this.corpId = corpId;
			}

			public String getCorpSecret() {
				return this.corpSecret;
			}

			public void setCorpSecret(String corpSecret) {
				this.corpSecret = corpSecret;
			}

			public String getTrustableDomain() {
				return this.trustableDomain;
			}

			public void setTrustableDomain(String trustableDomain) {
				this.trustableDomain = trustableDomain;
			}
		}
	}

	@Override
	public GetIdentityProviderResponse getInstance(UnmarshallerContext context) {
		return	GetIdentityProviderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
