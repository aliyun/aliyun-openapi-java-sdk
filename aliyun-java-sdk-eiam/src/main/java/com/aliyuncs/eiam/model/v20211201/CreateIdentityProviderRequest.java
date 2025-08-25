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
public class CreateIdentityProviderRequest extends RpcAcsRequest<CreateIdentityProviderResponse> {
	   

	private DingtalkAppConfig dingtalkAppConfig;

	private String clientToken;

	private String networkAccessEndpointId;

	private AutoUpdateUserConfig autoUpdateUserConfig;

	private String logoUrl;

	private UdPullConfig udPullConfig;

	private LarkConfig larkConfig;

	private WeComConfig weComConfig;

	private AutoCreateUserConfig autoCreateUserConfig;

	private AuthnConfig authnConfig;

	private BindingConfig bindingConfig;

	private String identityProviderName;

	private LdapConfig ldapConfig;

	private String instanceId;

	private UdPushConfig udPushConfig;

	private String identityProviderType;

	private OidcConfig oidcConfig;
	public CreateIdentityProviderRequest() {
		super("Eiam", "2021-12-01", "CreateIdentityProvider", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public DingtalkAppConfig getDingtalkAppConfig() {
		return this.dingtalkAppConfig;
	}

	public void setDingtalkAppConfig(DingtalkAppConfig dingtalkAppConfig) {
		this.dingtalkAppConfig = dingtalkAppConfig;	
		if (dingtalkAppConfig != null) {
			
				putQueryParameter("DingtalkAppConfig.CorpId" , dingtalkAppConfig.getCorpId());
				putQueryParameter("DingtalkAppConfig.DingtalkVersion" , dingtalkAppConfig.getDingtalkVersion());
				putQueryParameter("DingtalkAppConfig.AppSecret" , dingtalkAppConfig.getAppSecret());
				putQueryParameter("DingtalkAppConfig.VerificationToken" , dingtalkAppConfig.getVerificationToken());
				putQueryParameter("DingtalkAppConfig.AppKey" , dingtalkAppConfig.getAppKey());
				putQueryParameter("DingtalkAppConfig.EncryptKey" , dingtalkAppConfig.getEncryptKey());
		}	
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getNetworkAccessEndpointId() {
		return this.networkAccessEndpointId;
	}

	public void setNetworkAccessEndpointId(String networkAccessEndpointId) {
		this.networkAccessEndpointId = networkAccessEndpointId;
		if(networkAccessEndpointId != null){
			putQueryParameter("NetworkAccessEndpointId", networkAccessEndpointId);
		}
	}

	public AutoUpdateUserConfig getAutoUpdateUserConfig() {
		return this.autoUpdateUserConfig;
	}

	public void setAutoUpdateUserConfig(AutoUpdateUserConfig autoUpdateUserConfig) {
		this.autoUpdateUserConfig = autoUpdateUserConfig;	
		if (autoUpdateUserConfig != null) {
			
				putQueryParameter("AutoUpdateUserConfig.AutoUpdateUserStatus" , autoUpdateUserConfig.getAutoUpdateUserStatus());
		}	
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
		if(logoUrl != null){
			putQueryParameter("LogoUrl", logoUrl);
		}
	}

	public UdPullConfig getUdPullConfig() {
		return this.udPullConfig;
	}

	public void setUdPullConfig(UdPullConfig udPullConfig) {
		this.udPullConfig = udPullConfig;	
		if (udPullConfig != null) {
			
				putQueryParameter("UdPullConfig.GroupSyncStatus" , udPullConfig.getGroupSyncStatus());
				if (udPullConfig.getUdSyncScopeConfig() != null) {
					
						putQueryParameter("UdPullConfig.UdSyncScopeConfig.TargetScope" , udPullConfig.getUdSyncScopeConfig().getTargetScope());
						if (udPullConfig.getUdSyncScopeConfig().getSourceScopes() != null) {
							for (int depth1 = 0; depth1 < udPullConfig.getUdSyncScopeConfig().getSourceScopes().size(); depth1++) {
								putQueryParameter("UdPullConfig.UdSyncScopeConfig.SourceScopes." + (depth1 + 1) , udPullConfig.getUdSyncScopeConfig().getSourceScopes().get(depth1));
							}
						}
				}
				putQueryParameter("UdPullConfig.PeriodicSyncStatus" , udPullConfig.getPeriodicSyncStatus());
				if (udPullConfig.getPeriodicSyncConfig() != null) {
					
						if (udPullConfig.getPeriodicSyncConfig().getPeriodicSyncTimes() != null) {
							for (int depth1 = 0; depth1 < udPullConfig.getPeriodicSyncConfig().getPeriodicSyncTimes().size(); depth1++) {
								putQueryParameter("UdPullConfig.PeriodicSyncConfig.PeriodicSyncTimes." + (depth1 + 1) , udPullConfig.getPeriodicSyncConfig().getPeriodicSyncTimes().get(depth1));
							}
						}
						putQueryParameter("UdPullConfig.PeriodicSyncConfig.PeriodicSyncCron" , udPullConfig.getPeriodicSyncConfig().getPeriodicSyncCron());
						putQueryParameter("UdPullConfig.PeriodicSyncConfig.PeriodicSyncType" , udPullConfig.getPeriodicSyncConfig().getPeriodicSyncType());
				}
				putQueryParameter("UdPullConfig.IncrementalCallbackStatus" , udPullConfig.getIncrementalCallbackStatus());
		}	
	}

	public LarkConfig getLarkConfig() {
		return this.larkConfig;
	}

	public void setLarkConfig(LarkConfig larkConfig) {
		this.larkConfig = larkConfig;	
		if (larkConfig != null) {
			
				putQueryParameter("LarkConfig.EnterpriseNumber" , larkConfig.getEnterpriseNumber());
				putQueryParameter("LarkConfig.AppId" , larkConfig.getAppId());
				putQueryParameter("LarkConfig.AppSecret" , larkConfig.getAppSecret());
				putQueryParameter("LarkConfig.VerificationToken" , larkConfig.getVerificationToken());
				putQueryParameter("LarkConfig.EncryptKey" , larkConfig.getEncryptKey());
		}	
	}

	public WeComConfig getWeComConfig() {
		return this.weComConfig;
	}

	public void setWeComConfig(WeComConfig weComConfig) {
		this.weComConfig = weComConfig;	
		if (weComConfig != null) {
			
				putQueryParameter("WeComConfig.AgentId" , weComConfig.getAgentId());
				putQueryParameter("WeComConfig.CorpId" , weComConfig.getCorpId());
				putQueryParameter("WeComConfig.CorpSecret" , weComConfig.getCorpSecret());
				putQueryParameter("WeComConfig.AuthorizeCallbackDomain" , weComConfig.getAuthorizeCallbackDomain());
				putQueryParameter("WeComConfig.TrustableDomain" , weComConfig.getTrustableDomain());
		}	
	}

	public AutoCreateUserConfig getAutoCreateUserConfig() {
		return this.autoCreateUserConfig;
	}

	public void setAutoCreateUserConfig(AutoCreateUserConfig autoCreateUserConfig) {
		this.autoCreateUserConfig = autoCreateUserConfig;	
		if (autoCreateUserConfig != null) {
			
				putQueryParameter("AutoCreateUserConfig.AutoCreateUserStatus" , autoCreateUserConfig.getAutoCreateUserStatus());
				if (autoCreateUserConfig.getTargetOrganizationalUnitIds() != null) {
					for (int depth1 = 0; depth1 < autoCreateUserConfig.getTargetOrganizationalUnitIds().size(); depth1++) {
						putQueryParameter("AutoCreateUserConfig.TargetOrganizationalUnitIds." + (depth1 + 1) , autoCreateUserConfig.getTargetOrganizationalUnitIds().get(depth1));
					}
				}
		}	
	}

	public AuthnConfig getAuthnConfig() {
		return this.authnConfig;
	}

	public void setAuthnConfig(AuthnConfig authnConfig) {
		this.authnConfig = authnConfig;	
		if (authnConfig != null) {
			
				putQueryParameter("AuthnConfig.AuthnStatus" , authnConfig.getAuthnStatus());
				putQueryParameter("AuthnConfig.AutoUpdatePasswordStatus" , authnConfig.getAutoUpdatePasswordStatus());
		}	
	}

	public BindingConfig getBindingConfig() {
		return this.bindingConfig;
	}

	public void setBindingConfig(BindingConfig bindingConfig) {
		this.bindingConfig = bindingConfig;	
		if (bindingConfig != null) {
			
				if (bindingConfig.getAutoMatchUserProfileExpressions() != null) {
					for (int depth1 = 0; depth1 < bindingConfig.getAutoMatchUserProfileExpressions().size(); depth1++) {
						if (bindingConfig.getAutoMatchUserProfileExpressions().get(depth1) != null) {
							
								putQueryParameter("BindingConfig.AutoMatchUserProfileExpressions." + (depth1 + 1) + ".SourceValueExpression" , bindingConfig.getAutoMatchUserProfileExpressions().get(depth1).getSourceValueExpression());
								putQueryParameter("BindingConfig.AutoMatchUserProfileExpressions." + (depth1 + 1) + ".TargetFieldDescription" , bindingConfig.getAutoMatchUserProfileExpressions().get(depth1).getTargetFieldDescription());
								putQueryParameter("BindingConfig.AutoMatchUserProfileExpressions." + (depth1 + 1) + ".TargetField" , bindingConfig.getAutoMatchUserProfileExpressions().get(depth1).getTargetField());
								putQueryParameter("BindingConfig.AutoMatchUserProfileExpressions." + (depth1 + 1) + ".ExpressionMappingType" , bindingConfig.getAutoMatchUserProfileExpressions().get(depth1).getExpressionMappingType());
						}
					}
				}
				putQueryParameter("BindingConfig.MappingBindingStatus" , bindingConfig.getMappingBindingStatus());
				putQueryParameter("BindingConfig.AutoMatchUserStatus" , bindingConfig.getAutoMatchUserStatus());
		}	
	}

	public String getIdentityProviderName() {
		return this.identityProviderName;
	}

	public void setIdentityProviderName(String identityProviderName) {
		this.identityProviderName = identityProviderName;
		if(identityProviderName != null){
			putQueryParameter("IdentityProviderName", identityProviderName);
		}
	}

	public LdapConfig getLdapConfig() {
		return this.ldapConfig;
	}

	public void setLdapConfig(LdapConfig ldapConfig) {
		this.ldapConfig = ldapConfig;	
		if (ldapConfig != null) {
			
				putQueryParameter("LdapConfig.GroupMemberAttributeName" , ldapConfig.getGroupMemberAttributeName());
				putQueryParameter("LdapConfig.StartTlsStatus" , ldapConfig.getStartTlsStatus());
				putQueryParameter("LdapConfig.LdapServerHost" , ldapConfig.getLdapServerHost());
				putQueryParameter("LdapConfig.GroupObjectClass" , ldapConfig.getGroupObjectClass());
				putQueryParameter("LdapConfig.UserObjectClass" , ldapConfig.getUserObjectClass());
				putQueryParameter("LdapConfig.UserObjectClassCustomFilter" , ldapConfig.getUserObjectClassCustomFilter());
				if (ldapConfig.getCertificateFingerprints() != null) {
					for (int depth1 = 0; depth1 < ldapConfig.getCertificateFingerprints().size(); depth1++) {
						putQueryParameter("LdapConfig.CertificateFingerprints." + (depth1 + 1) , ldapConfig.getCertificateFingerprints().get(depth1));
					}
				}
				putQueryParameter("LdapConfig.LdapProtocol" , ldapConfig.getLdapProtocol());
				putQueryParameter("LdapConfig.GroupObjectClassCustomFilter" , ldapConfig.getGroupObjectClassCustomFilter());
				putQueryParameter("LdapConfig.OrganizationUnitObjectClass" , ldapConfig.getOrganizationUnitObjectClass());
				putQueryParameter("LdapConfig.AdministratorUsername" , ldapConfig.getAdministratorUsername());
				putQueryParameter("LdapConfig.UserLoginIdentifier" , ldapConfig.getUserLoginIdentifier());
				putQueryParameter("LdapConfig.AdministratorPassword" , ldapConfig.getAdministratorPassword());
				putQueryParameter("LdapConfig.CertificateFingerprintStatus" , ldapConfig.getCertificateFingerprintStatus());
				putQueryParameter("LdapConfig.LdapServerPort" , ldapConfig.getLdapServerPort());
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

	public UdPushConfig getUdPushConfig() {
		return this.udPushConfig;
	}

	public void setUdPushConfig(UdPushConfig udPushConfig) {
		this.udPushConfig = udPushConfig;	
		if (udPushConfig != null) {
			
				putQueryParameter("UdPushConfig.PeriodicSyncStatus" , udPushConfig.getPeriodicSyncStatus());
				putQueryParameter("UdPushConfig.IncrementalCallbackStatus" , udPushConfig.getIncrementalCallbackStatus());
				if (udPushConfig.getUdSyncScopeConfigs() != null) {
					for (int depth1 = 0; depth1 < udPushConfig.getUdSyncScopeConfigs().size(); depth1++) {
						if (udPushConfig.getUdSyncScopeConfigs().get(depth1) != null) {
							
								putQueryParameter("UdPushConfig.UdSyncScopeConfigs." + (depth1 + 1) + ".TargetScope" , udPushConfig.getUdSyncScopeConfigs().get(depth1).getTargetScope());
								if (udPushConfig.getUdSyncScopeConfigs().get(depth1).getSourceScopes() != null) {
									for (int depth2 = 0; depth2 < udPushConfig.getUdSyncScopeConfigs().get(depth1).getSourceScopes().size(); depth2++) {
										putQueryParameter("UdPushConfig.UdSyncScopeConfigs." + (depth1 + 1) + ".SourceScopes." + (depth2 + 1) , udPushConfig.getUdSyncScopeConfigs().get(depth1).getSourceScopes().get(depth2));
									}
								}
						}
					}
				}
		}	
	}

	public String getIdentityProviderType() {
		return this.identityProviderType;
	}

	public void setIdentityProviderType(String identityProviderType) {
		this.identityProviderType = identityProviderType;
		if(identityProviderType != null){
			putQueryParameter("IdentityProviderType", identityProviderType);
		}
	}

	public OidcConfig getOidcConfig() {
		return this.oidcConfig;
	}

	public void setOidcConfig(OidcConfig oidcConfig) {
		this.oidcConfig = oidcConfig;	
		if (oidcConfig != null) {
			
				if (oidcConfig.getGrantScopes() != null) {
					for (int depth1 = 0; depth1 < oidcConfig.getGrantScopes().size(); depth1++) {
						putQueryParameter("OidcConfig.GrantScopes." + (depth1 + 1) , oidcConfig.getGrantScopes().get(depth1));
					}
				}
				if (oidcConfig.getEndpointConfig() != null) {
					
						putQueryParameter("OidcConfig.EndpointConfig.UserinfoEndpoint" , oidcConfig.getEndpointConfig().getUserinfoEndpoint());
						putQueryParameter("OidcConfig.EndpointConfig.AuthorizationEndpoint" , oidcConfig.getEndpointConfig().getAuthorizationEndpoint());
						putQueryParameter("OidcConfig.EndpointConfig.JwksUri" , oidcConfig.getEndpointConfig().getJwksUri());
						putQueryParameter("OidcConfig.EndpointConfig.TokenEndpoint" , oidcConfig.getEndpointConfig().getTokenEndpoint());
						putQueryParameter("OidcConfig.EndpointConfig.Issuer" , oidcConfig.getEndpointConfig().getIssuer());
				}
				putQueryParameter("OidcConfig.PkceChallengeMethod" , oidcConfig.getPkceChallengeMethod());
				putQueryParameter("OidcConfig.PkceRequired" , oidcConfig.getPkceRequired());
				if (oidcConfig.getAuthnParam() != null) {
					
						putQueryParameter("OidcConfig.AuthnParam.ClientId" , oidcConfig.getAuthnParam().getClientId());
						putQueryParameter("OidcConfig.AuthnParam.ClientSecret" , oidcConfig.getAuthnParam().getClientSecret());
						putQueryParameter("OidcConfig.AuthnParam.AuthnMethod" , oidcConfig.getAuthnParam().getAuthnMethod());
				}
				putQueryParameter("OidcConfig.GrantType" , oidcConfig.getGrantType());
		}	
	}

	public static class DingtalkAppConfig {

		private String corpId;

		private String dingtalkVersion;

		private String appSecret;

		private String verificationToken;

		private String appKey;

		private String encryptKey;

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

		public String getAppSecret() {
			return this.appSecret;
		}

		public void setAppSecret(String appSecret) {
			this.appSecret = appSecret;
		}

		public String getVerificationToken() {
			return this.verificationToken;
		}

		public void setVerificationToken(String verificationToken) {
			this.verificationToken = verificationToken;
		}

		public String getAppKey() {
			return this.appKey;
		}

		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}

		public String getEncryptKey() {
			return this.encryptKey;
		}

		public void setEncryptKey(String encryptKey) {
			this.encryptKey = encryptKey;
		}
	}

	public static class AutoUpdateUserConfig {

		private String autoUpdateUserStatus;

		public String getAutoUpdateUserStatus() {
			return this.autoUpdateUserStatus;
		}

		public void setAutoUpdateUserStatus(String autoUpdateUserStatus) {
			this.autoUpdateUserStatus = autoUpdateUserStatus;
		}
	}

	public static class UdPullConfig {

		private String groupSyncStatus;

		private UdSyncScopeConfig udSyncScopeConfig;

		private String periodicSyncStatus;

		private PeriodicSyncConfig periodicSyncConfig;

		private String incrementalCallbackStatus;

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

		public String getPeriodicSyncStatus() {
			return this.periodicSyncStatus;
		}

		public void setPeriodicSyncStatus(String periodicSyncStatus) {
			this.periodicSyncStatus = periodicSyncStatus;
		}

		public PeriodicSyncConfig getPeriodicSyncConfig() {
			return this.periodicSyncConfig;
		}

		public void setPeriodicSyncConfig(PeriodicSyncConfig periodicSyncConfig) {
			this.periodicSyncConfig = periodicSyncConfig;
		}

		public String getIncrementalCallbackStatus() {
			return this.incrementalCallbackStatus;
		}

		public void setIncrementalCallbackStatus(String incrementalCallbackStatus) {
			this.incrementalCallbackStatus = incrementalCallbackStatus;
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

		public static class PeriodicSyncConfig {

			private List<Integer> periodicSyncTimes;

			private String periodicSyncCron;

			private String periodicSyncType;

			public List<Integer> getPeriodicSyncTimes() {
				return this.periodicSyncTimes;
			}

			public void setPeriodicSyncTimes(List<Integer> periodicSyncTimes) {
				this.periodicSyncTimes = periodicSyncTimes;
			}

			public String getPeriodicSyncCron() {
				return this.periodicSyncCron;
			}

			public void setPeriodicSyncCron(String periodicSyncCron) {
				this.periodicSyncCron = periodicSyncCron;
			}

			public String getPeriodicSyncType() {
				return this.periodicSyncType;
			}

			public void setPeriodicSyncType(String periodicSyncType) {
				this.periodicSyncType = periodicSyncType;
			}
		}
	}

	public static class LarkConfig {

		private String enterpriseNumber;

		private String appId;

		private String appSecret;

		private String verificationToken;

		private String encryptKey;

		public String getEnterpriseNumber() {
			return this.enterpriseNumber;
		}

		public void setEnterpriseNumber(String enterpriseNumber) {
			this.enterpriseNumber = enterpriseNumber;
		}

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

		public String getVerificationToken() {
			return this.verificationToken;
		}

		public void setVerificationToken(String verificationToken) {
			this.verificationToken = verificationToken;
		}

		public String getEncryptKey() {
			return this.encryptKey;
		}

		public void setEncryptKey(String encryptKey) {
			this.encryptKey = encryptKey;
		}
	}

	public static class WeComConfig {

		private String agentId;

		private String corpId;

		private String corpSecret;

		private String authorizeCallbackDomain;

		private String trustableDomain;

		public String getAgentId() {
			return this.agentId;
		}

		public void setAgentId(String agentId) {
			this.agentId = agentId;
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

		public String getAuthorizeCallbackDomain() {
			return this.authorizeCallbackDomain;
		}

		public void setAuthorizeCallbackDomain(String authorizeCallbackDomain) {
			this.authorizeCallbackDomain = authorizeCallbackDomain;
		}

		public String getTrustableDomain() {
			return this.trustableDomain;
		}

		public void setTrustableDomain(String trustableDomain) {
			this.trustableDomain = trustableDomain;
		}
	}

	public static class AutoCreateUserConfig {

		private String autoCreateUserStatus;

		private List<String> targetOrganizationalUnitIds;

		public String getAutoCreateUserStatus() {
			return this.autoCreateUserStatus;
		}

		public void setAutoCreateUserStatus(String autoCreateUserStatus) {
			this.autoCreateUserStatus = autoCreateUserStatus;
		}

		public List<String> getTargetOrganizationalUnitIds() {
			return this.targetOrganizationalUnitIds;
		}

		public void setTargetOrganizationalUnitIds(List<String> targetOrganizationalUnitIds) {
			this.targetOrganizationalUnitIds = targetOrganizationalUnitIds;
		}
	}

	public static class AuthnConfig {

		private String authnStatus;

		private String autoUpdatePasswordStatus;

		public String getAuthnStatus() {
			return this.authnStatus;
		}

		public void setAuthnStatus(String authnStatus) {
			this.authnStatus = authnStatus;
		}

		public String getAutoUpdatePasswordStatus() {
			return this.autoUpdatePasswordStatus;
		}

		public void setAutoUpdatePasswordStatus(String autoUpdatePasswordStatus) {
			this.autoUpdatePasswordStatus = autoUpdatePasswordStatus;
		}
	}

	public static class BindingConfig {

		private List<AutoMatchUserProfileExpressionsItem> autoMatchUserProfileExpressions;

		private String mappingBindingStatus;

		private String autoMatchUserStatus;

		public List<AutoMatchUserProfileExpressionsItem> getAutoMatchUserProfileExpressions() {
			return this.autoMatchUserProfileExpressions;
		}

		public void setAutoMatchUserProfileExpressions(List<AutoMatchUserProfileExpressionsItem> autoMatchUserProfileExpressions) {
			this.autoMatchUserProfileExpressions = autoMatchUserProfileExpressions;
		}

		public String getMappingBindingStatus() {
			return this.mappingBindingStatus;
		}

		public void setMappingBindingStatus(String mappingBindingStatus) {
			this.mappingBindingStatus = mappingBindingStatus;
		}

		public String getAutoMatchUserStatus() {
			return this.autoMatchUserStatus;
		}

		public void setAutoMatchUserStatus(String autoMatchUserStatus) {
			this.autoMatchUserStatus = autoMatchUserStatus;
		}

		public static class AutoMatchUserProfileExpressionsItem {

			private String sourceValueExpression;

			private String targetFieldDescription;

			private String targetField;

			private String expressionMappingType;

			public String getSourceValueExpression() {
				return this.sourceValueExpression;
			}

			public void setSourceValueExpression(String sourceValueExpression) {
				this.sourceValueExpression = sourceValueExpression;
			}

			public String getTargetFieldDescription() {
				return this.targetFieldDescription;
			}

			public void setTargetFieldDescription(String targetFieldDescription) {
				this.targetFieldDescription = targetFieldDescription;
			}

			public String getTargetField() {
				return this.targetField;
			}

			public void setTargetField(String targetField) {
				this.targetField = targetField;
			}

			public String getExpressionMappingType() {
				return this.expressionMappingType;
			}

			public void setExpressionMappingType(String expressionMappingType) {
				this.expressionMappingType = expressionMappingType;
			}
		}
	}

	public static class LdapConfig {

		private String groupMemberAttributeName;

		private String startTlsStatus;

		private String ldapServerHost;

		private String groupObjectClass;

		private String userObjectClass;

		private String userObjectClassCustomFilter;

		private List<String> certificateFingerprints;

		private String ldapProtocol;

		private String groupObjectClassCustomFilter;

		private String organizationUnitObjectClass;

		private String administratorUsername;

		private String userLoginIdentifier;

		private String administratorPassword;

		private String certificateFingerprintStatus;

		private Integer ldapServerPort;

		public String getGroupMemberAttributeName() {
			return this.groupMemberAttributeName;
		}

		public void setGroupMemberAttributeName(String groupMemberAttributeName) {
			this.groupMemberAttributeName = groupMemberAttributeName;
		}

		public String getStartTlsStatus() {
			return this.startTlsStatus;
		}

		public void setStartTlsStatus(String startTlsStatus) {
			this.startTlsStatus = startTlsStatus;
		}

		public String getLdapServerHost() {
			return this.ldapServerHost;
		}

		public void setLdapServerHost(String ldapServerHost) {
			this.ldapServerHost = ldapServerHost;
		}

		public String getGroupObjectClass() {
			return this.groupObjectClass;
		}

		public void setGroupObjectClass(String groupObjectClass) {
			this.groupObjectClass = groupObjectClass;
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

		public List<String> getCertificateFingerprints() {
			return this.certificateFingerprints;
		}

		public void setCertificateFingerprints(List<String> certificateFingerprints) {
			this.certificateFingerprints = certificateFingerprints;
		}

		public String getLdapProtocol() {
			return this.ldapProtocol;
		}

		public void setLdapProtocol(String ldapProtocol) {
			this.ldapProtocol = ldapProtocol;
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

		public String getAdministratorUsername() {
			return this.administratorUsername;
		}

		public void setAdministratorUsername(String administratorUsername) {
			this.administratorUsername = administratorUsername;
		}

		public String getUserLoginIdentifier() {
			return this.userLoginIdentifier;
		}

		public void setUserLoginIdentifier(String userLoginIdentifier) {
			this.userLoginIdentifier = userLoginIdentifier;
		}

		public String getAdministratorPassword() {
			return this.administratorPassword;
		}

		public void setAdministratorPassword(String administratorPassword) {
			this.administratorPassword = administratorPassword;
		}

		public String getCertificateFingerprintStatus() {
			return this.certificateFingerprintStatus;
		}

		public void setCertificateFingerprintStatus(String certificateFingerprintStatus) {
			this.certificateFingerprintStatus = certificateFingerprintStatus;
		}

		public Integer getLdapServerPort() {
			return this.ldapServerPort;
		}

		public void setLdapServerPort(Integer ldapServerPort) {
			this.ldapServerPort = ldapServerPort;
		}
	}

	public static class UdPushConfig {

		private String periodicSyncStatus;

		private String incrementalCallbackStatus;

		private List<UdSyncScopeConfigsItem> udSyncScopeConfigs;

		public String getPeriodicSyncStatus() {
			return this.periodicSyncStatus;
		}

		public void setPeriodicSyncStatus(String periodicSyncStatus) {
			this.periodicSyncStatus = periodicSyncStatus;
		}

		public String getIncrementalCallbackStatus() {
			return this.incrementalCallbackStatus;
		}

		public void setIncrementalCallbackStatus(String incrementalCallbackStatus) {
			this.incrementalCallbackStatus = incrementalCallbackStatus;
		}

		public List<UdSyncScopeConfigsItem> getUdSyncScopeConfigs() {
			return this.udSyncScopeConfigs;
		}

		public void setUdSyncScopeConfigs(List<UdSyncScopeConfigsItem> udSyncScopeConfigs) {
			this.udSyncScopeConfigs = udSyncScopeConfigs;
		}

		public static class UdSyncScopeConfigsItem {

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

	public static class OidcConfig {

		private List<String> grantScopes;

		private EndpointConfig endpointConfig;

		private String pkceChallengeMethod;

		private Boolean pkceRequired;

		private AuthnParam authnParam;

		private String grantType;

		public List<String> getGrantScopes() {
			return this.grantScopes;
		}

		public void setGrantScopes(List<String> grantScopes) {
			this.grantScopes = grantScopes;
		}

		public EndpointConfig getEndpointConfig() {
			return this.endpointConfig;
		}

		public void setEndpointConfig(EndpointConfig endpointConfig) {
			this.endpointConfig = endpointConfig;
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

		public AuthnParam getAuthnParam() {
			return this.authnParam;
		}

		public void setAuthnParam(AuthnParam authnParam) {
			this.authnParam = authnParam;
		}

		public String getGrantType() {
			return this.grantType;
		}

		public void setGrantType(String grantType) {
			this.grantType = grantType;
		}

		public static class EndpointConfig {

			private String userinfoEndpoint;

			private String authorizationEndpoint;

			private String jwksUri;

			private String tokenEndpoint;

			private String issuer;

			public String getUserinfoEndpoint() {
				return this.userinfoEndpoint;
			}

			public void setUserinfoEndpoint(String userinfoEndpoint) {
				this.userinfoEndpoint = userinfoEndpoint;
			}

			public String getAuthorizationEndpoint() {
				return this.authorizationEndpoint;
			}

			public void setAuthorizationEndpoint(String authorizationEndpoint) {
				this.authorizationEndpoint = authorizationEndpoint;
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

			public String getIssuer() {
				return this.issuer;
			}

			public void setIssuer(String issuer) {
				this.issuer = issuer;
			}
		}

		public static class AuthnParam {

			private String clientId;

			private String clientSecret;

			private String authnMethod;

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

			public String getAuthnMethod() {
				return this.authnMethod;
			}

			public void setAuthnMethod(String authnMethod) {
				this.authnMethod = authnMethod;
			}
		}
	}

	@Override
	public Class<CreateIdentityProviderResponse> getResponseClass() {
		return CreateIdentityProviderResponse.class;
	}

}
