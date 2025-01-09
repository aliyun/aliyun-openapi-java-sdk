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
public class UpdateIdentityProviderRequest extends RpcAcsRequest<UpdateIdentityProviderResponse> {
	   

	private DingtalkAppConfig dingtalkAppConfig;

	private String networkAccessEndpointId;

	private String logoUrl;

	private String identityProviderId;

	private LarkConfig larkConfig;

	private WeComConfig weComConfig;

	private String identityProviderName;

	private LdapConfig ldapConfig;

	private String instanceId;

	private OidcConfig oidcConfig;
	public UpdateIdentityProviderRequest() {
		super("Eiam", "2021-12-01", "UpdateIdentityProvider", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public DingtalkAppConfig getDingtalkAppConfig() {
		return this.dingtalkAppConfig;
	}

	public void setDingtalkAppConfig(DingtalkAppConfig dingtalkAppConfig) {
		this.dingtalkAppConfig = dingtalkAppConfig;	
		if (dingtalkAppConfig != null) {
			
				putQueryParameter("DingtalkAppConfig.AppSecret" , dingtalkAppConfig.getAppSecret());
				putQueryParameter("DingtalkAppConfig.AppKey" , dingtalkAppConfig.getAppKey());
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

	public String getLogoUrl() {
		return this.logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
		if(logoUrl != null){
			putQueryParameter("LogoUrl", logoUrl);
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

	public LarkConfig getLarkConfig() {
		return this.larkConfig;
	}

	public void setLarkConfig(LarkConfig larkConfig) {
		this.larkConfig = larkConfig;	
		if (larkConfig != null) {
			
				putQueryParameter("LarkConfig.AppId" , larkConfig.getAppId());
				putQueryParameter("LarkConfig.AppSecret" , larkConfig.getAppSecret());
		}	
	}

	public WeComConfig getWeComConfig() {
		return this.weComConfig;
	}

	public void setWeComConfig(WeComConfig weComConfig) {
		this.weComConfig = weComConfig;	
		if (weComConfig != null) {
			
				putQueryParameter("WeComConfig.AgentId" , weComConfig.getAgentId());
				putQueryParameter("WeComConfig.CorpSecret" , weComConfig.getCorpSecret());
				putQueryParameter("WeComConfig.AuthorizeCallbackDomain" , weComConfig.getAuthorizeCallbackDomain());
				putQueryParameter("WeComConfig.TrustableDomain" , weComConfig.getTrustableDomain());
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
			
				putQueryParameter("LdapConfig.StartTlsStatus" , ldapConfig.getStartTlsStatus());
				putQueryParameter("LdapConfig.LdapServerHost" , ldapConfig.getLdapServerHost());
				putQueryParameter("LdapConfig.AdministratorUsername" , ldapConfig.getAdministratorUsername());
				if (ldapConfig.getCertificateFingerprints() != null) {
					for (int depth1 = 0; depth1 < ldapConfig.getCertificateFingerprints().size(); depth1++) {
						putQueryParameter("LdapConfig.CertificateFingerprints." + (depth1 + 1) , ldapConfig.getCertificateFingerprints().get(depth1));
					}
				}
				putQueryParameter("LdapConfig.LdapProtocol" , ldapConfig.getLdapProtocol());
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
					
						putQueryParameter("OidcConfig.AuthnParam.ClientSecret" , oidcConfig.getAuthnParam().getClientSecret());
						putQueryParameter("OidcConfig.AuthnParam.AuthnMethod" , oidcConfig.getAuthnParam().getAuthnMethod());
				}
				putQueryParameter("OidcConfig.GrantType" , oidcConfig.getGrantType());
		}	
	}

	public static class DingtalkAppConfig {

		private String appSecret;

		private String appKey;

		public String getAppSecret() {
			return this.appSecret;
		}

		public void setAppSecret(String appSecret) {
			this.appSecret = appSecret;
		}

		public String getAppKey() {
			return this.appKey;
		}

		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}
	}

	public static class LarkConfig {

		private String appId;

		private String appSecret;

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
	}

	public static class WeComConfig {

		private String agentId;

		private String corpSecret;

		private String authorizeCallbackDomain;

		private String trustableDomain;

		public String getAgentId() {
			return this.agentId;
		}

		public void setAgentId(String agentId) {
			this.agentId = agentId;
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

	public static class LdapConfig {

		private String startTlsStatus;

		private String ldapServerHost;

		private String administratorUsername;

		private List<String> certificateFingerprints;

		private String ldapProtocol;

		private String administratorPassword;

		private String certificateFingerprintStatus;

		private Integer ldapServerPort;

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

		public String getAdministratorUsername() {
			return this.administratorUsername;
		}

		public void setAdministratorUsername(String administratorUsername) {
			this.administratorUsername = administratorUsername;
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

			private String clientSecret;

			private String authnMethod;

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
	public Class<UpdateIdentityProviderResponse> getResponseClass() {
		return UpdateIdentityProviderResponse.class;
	}

}
