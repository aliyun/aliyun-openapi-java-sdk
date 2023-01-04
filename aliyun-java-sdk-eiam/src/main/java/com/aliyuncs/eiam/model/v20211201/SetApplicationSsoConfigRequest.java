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
public class SetApplicationSsoConfigRequest extends RpcAcsRequest<SetApplicationSsoConfigResponse> {
	   

	private String applicationId;

	private String initLoginUrl;

	private String initLoginType;

	private String instanceId;

	private OidcSsoConfig oidcSsoConfig;

	private SamlSsoConfig samlSsoConfig;
	public SetApplicationSsoConfigRequest() {
		super("Eiam", "2021-12-01", "SetApplicationSsoConfig", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public String getInitLoginUrl() {
		return this.initLoginUrl;
	}

	public void setInitLoginUrl(String initLoginUrl) {
		this.initLoginUrl = initLoginUrl;
		if(initLoginUrl != null){
			putQueryParameter("InitLoginUrl", initLoginUrl);
		}
	}

	public String getInitLoginType() {
		return this.initLoginType;
	}

	public void setInitLoginType(String initLoginType) {
		this.initLoginType = initLoginType;
		if(initLoginType != null){
			putQueryParameter("InitLoginType", initLoginType);
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

	public OidcSsoConfig getOidcSsoConfig() {
		return this.oidcSsoConfig;
	}

	public void setOidcSsoConfig(OidcSsoConfig oidcSsoConfig) {
		this.oidcSsoConfig = oidcSsoConfig;	
		if (oidcSsoConfig != null) {
			
				putQueryParameter("OidcSsoConfig.CodeEffectiveTime" , oidcSsoConfig.getCodeEffectiveTime());
				if (oidcSsoConfig.getResponseTypes() != null) {
					for (int depth1 = 0; depth1 < oidcSsoConfig.getResponseTypes().size(); depth1++) {
						putQueryParameter("OidcSsoConfig.ResponseTypes." + (depth1 + 1) , oidcSsoConfig.getResponseTypes().get(depth1));
					}
				}
				if (oidcSsoConfig.getGrantScopes() != null) {
					for (int depth1 = 0; depth1 < oidcSsoConfig.getGrantScopes().size(); depth1++) {
						putQueryParameter("OidcSsoConfig.GrantScopes." + (depth1 + 1) , oidcSsoConfig.getGrantScopes().get(depth1));
					}
				}
				putQueryParameter("OidcSsoConfig.RefreshTokenEffective" , oidcSsoConfig.getRefreshTokenEffective());
				if (oidcSsoConfig.getGrantTypes() != null) {
					for (int depth1 = 0; depth1 < oidcSsoConfig.getGrantTypes().size(); depth1++) {
						putQueryParameter("OidcSsoConfig.GrantTypes." + (depth1 + 1) , oidcSsoConfig.getGrantTypes().get(depth1));
					}
				}
				putQueryParameter("OidcSsoConfig.IdTokenEffectiveTime" , oidcSsoConfig.getIdTokenEffectiveTime());
				if (oidcSsoConfig.getPkceChallengeMethods() != null) {
					for (int depth1 = 0; depth1 < oidcSsoConfig.getPkceChallengeMethods().size(); depth1++) {
						putQueryParameter("OidcSsoConfig.PkceChallengeMethods." + (depth1 + 1) , oidcSsoConfig.getPkceChallengeMethods().get(depth1));
					}
				}
				putQueryParameter("OidcSsoConfig.PasswordAuthenticationSourceId" , oidcSsoConfig.getPasswordAuthenticationSourceId());
				putQueryParameter("OidcSsoConfig.AccessTokenEffectiveTime" , oidcSsoConfig.getAccessTokenEffectiveTime());
				if (oidcSsoConfig.getPostLogoutRedirectUris() != null) {
					for (int depth1 = 0; depth1 < oidcSsoConfig.getPostLogoutRedirectUris().size(); depth1++) {
						putQueryParameter("OidcSsoConfig.PostLogoutRedirectUris." + (depth1 + 1) , oidcSsoConfig.getPostLogoutRedirectUris().get(depth1));
					}
				}
				putQueryParameter("OidcSsoConfig.PasswordTotpMfaRequired" , oidcSsoConfig.getPasswordTotpMfaRequired());
				if (oidcSsoConfig.getCustomClaims() != null) {
					for (int depth1 = 0; depth1 < oidcSsoConfig.getCustomClaims().size(); depth1++) {
						if (oidcSsoConfig.getCustomClaims().get(depth1) != null) {
							
								putQueryParameter("OidcSsoConfig.CustomClaims." + (depth1 + 1) + ".ClaimValueExpression" , oidcSsoConfig.getCustomClaims().get(depth1).getClaimValueExpression());
								putQueryParameter("OidcSsoConfig.CustomClaims." + (depth1 + 1) + ".ClaimName" , oidcSsoConfig.getCustomClaims().get(depth1).getClaimName());
						}
					}
				}
				putQueryParameter("OidcSsoConfig.SubjectIdExpression" , oidcSsoConfig.getSubjectIdExpression());
				putQueryParameter("OidcSsoConfig.PkceRequired" , oidcSsoConfig.getPkceRequired());
				if (oidcSsoConfig.getRedirectUris() != null) {
					for (int depth1 = 0; depth1 < oidcSsoConfig.getRedirectUris().size(); depth1++) {
						putQueryParameter("OidcSsoConfig.RedirectUris." + (depth1 + 1) , oidcSsoConfig.getRedirectUris().get(depth1));
					}
				}
		}	
	}

	public SamlSsoConfig getSamlSsoConfig() {
		return this.samlSsoConfig;
	}

	public void setSamlSsoConfig(SamlSsoConfig samlSsoConfig) {
		this.samlSsoConfig = samlSsoConfig;	
		if (samlSsoConfig != null) {
			
				putQueryParameter("SamlSsoConfig.SignatureAlgorithm" , samlSsoConfig.getSignatureAlgorithm());
				putQueryParameter("SamlSsoConfig.NameIdFormat" , samlSsoConfig.getNameIdFormat());
				putQueryParameter("SamlSsoConfig.SpSsoAcsUrl" , samlSsoConfig.getSpSsoAcsUrl());
				putQueryParameter("SamlSsoConfig.NameIdValueExpression" , samlSsoConfig.getNameIdValueExpression());
				if (samlSsoConfig.getAttributeStatements() != null) {
					for (int depth1 = 0; depth1 < samlSsoConfig.getAttributeStatements().size(); depth1++) {
						if (samlSsoConfig.getAttributeStatements().get(depth1) != null) {
							
								putQueryParameter("SamlSsoConfig.AttributeStatements." + (depth1 + 1) + ".AttributeValueExpression" , samlSsoConfig.getAttributeStatements().get(depth1).getAttributeValueExpression());
								putQueryParameter("SamlSsoConfig.AttributeStatements." + (depth1 + 1) + ".AttributeName" , samlSsoConfig.getAttributeStatements().get(depth1).getAttributeName());
						}
					}
				}
				putQueryParameter("SamlSsoConfig.DefaultRelayState" , samlSsoConfig.getDefaultRelayState());
				putQueryParameter("SamlSsoConfig.SpEntityId" , samlSsoConfig.getSpEntityId());
		}	
	}

	public static class OidcSsoConfig {

		private Long codeEffectiveTime;

		private List<String> responseTypes;

		private List<String> grantScopes;

		private Long refreshTokenEffective;

		private List<String> grantTypes;

		private Long idTokenEffectiveTime;

		private List<String> pkceChallengeMethods;

		private String passwordAuthenticationSourceId;

		private Long accessTokenEffectiveTime;

		private List<String> postLogoutRedirectUris;

		private Boolean passwordTotpMfaRequired;

		private List<CustomClaimsItem> customClaims;

		private String subjectIdExpression;

		private Boolean pkceRequired;

		private List<String> redirectUris;

		public Long getCodeEffectiveTime() {
			return this.codeEffectiveTime;
		}

		public void setCodeEffectiveTime(Long codeEffectiveTime) {
			this.codeEffectiveTime = codeEffectiveTime;
		}

		public List<String> getResponseTypes() {
			return this.responseTypes;
		}

		public void setResponseTypes(List<String> responseTypes) {
			this.responseTypes = responseTypes;
		}

		public List<String> getGrantScopes() {
			return this.grantScopes;
		}

		public void setGrantScopes(List<String> grantScopes) {
			this.grantScopes = grantScopes;
		}

		public Long getRefreshTokenEffective() {
			return this.refreshTokenEffective;
		}

		public void setRefreshTokenEffective(Long refreshTokenEffective) {
			this.refreshTokenEffective = refreshTokenEffective;
		}

		public List<String> getGrantTypes() {
			return this.grantTypes;
		}

		public void setGrantTypes(List<String> grantTypes) {
			this.grantTypes = grantTypes;
		}

		public Long getIdTokenEffectiveTime() {
			return this.idTokenEffectiveTime;
		}

		public void setIdTokenEffectiveTime(Long idTokenEffectiveTime) {
			this.idTokenEffectiveTime = idTokenEffectiveTime;
		}

		public List<String> getPkceChallengeMethods() {
			return this.pkceChallengeMethods;
		}

		public void setPkceChallengeMethods(List<String> pkceChallengeMethods) {
			this.pkceChallengeMethods = pkceChallengeMethods;
		}

		public String getPasswordAuthenticationSourceId() {
			return this.passwordAuthenticationSourceId;
		}

		public void setPasswordAuthenticationSourceId(String passwordAuthenticationSourceId) {
			this.passwordAuthenticationSourceId = passwordAuthenticationSourceId;
		}

		public Long getAccessTokenEffectiveTime() {
			return this.accessTokenEffectiveTime;
		}

		public void setAccessTokenEffectiveTime(Long accessTokenEffectiveTime) {
			this.accessTokenEffectiveTime = accessTokenEffectiveTime;
		}

		public List<String> getPostLogoutRedirectUris() {
			return this.postLogoutRedirectUris;
		}

		public void setPostLogoutRedirectUris(List<String> postLogoutRedirectUris) {
			this.postLogoutRedirectUris = postLogoutRedirectUris;
		}

		public Boolean getPasswordTotpMfaRequired() {
			return this.passwordTotpMfaRequired;
		}

		public void setPasswordTotpMfaRequired(Boolean passwordTotpMfaRequired) {
			this.passwordTotpMfaRequired = passwordTotpMfaRequired;
		}

		public List<CustomClaimsItem> getCustomClaims() {
			return this.customClaims;
		}

		public void setCustomClaims(List<CustomClaimsItem> customClaims) {
			this.customClaims = customClaims;
		}

		public String getSubjectIdExpression() {
			return this.subjectIdExpression;
		}

		public void setSubjectIdExpression(String subjectIdExpression) {
			this.subjectIdExpression = subjectIdExpression;
		}

		public Boolean getPkceRequired() {
			return this.pkceRequired;
		}

		public void setPkceRequired(Boolean pkceRequired) {
			this.pkceRequired = pkceRequired;
		}

		public List<String> getRedirectUris() {
			return this.redirectUris;
		}

		public void setRedirectUris(List<String> redirectUris) {
			this.redirectUris = redirectUris;
		}

		public static class CustomClaimsItem {

			private String claimValueExpression;

			private String claimName;

			public String getClaimValueExpression() {
				return this.claimValueExpression;
			}

			public void setClaimValueExpression(String claimValueExpression) {
				this.claimValueExpression = claimValueExpression;
			}

			public String getClaimName() {
				return this.claimName;
			}

			public void setClaimName(String claimName) {
				this.claimName = claimName;
			}
		}
	}

	public static class SamlSsoConfig {

		private String signatureAlgorithm;

		private String nameIdFormat;

		private String spSsoAcsUrl;

		private String nameIdValueExpression;

		private List<AttributeStatementsItem> attributeStatements;

		private String defaultRelayState;

		private String spEntityId;

		public String getSignatureAlgorithm() {
			return this.signatureAlgorithm;
		}

		public void setSignatureAlgorithm(String signatureAlgorithm) {
			this.signatureAlgorithm = signatureAlgorithm;
		}

		public String getNameIdFormat() {
			return this.nameIdFormat;
		}

		public void setNameIdFormat(String nameIdFormat) {
			this.nameIdFormat = nameIdFormat;
		}

		public String getSpSsoAcsUrl() {
			return this.spSsoAcsUrl;
		}

		public void setSpSsoAcsUrl(String spSsoAcsUrl) {
			this.spSsoAcsUrl = spSsoAcsUrl;
		}

		public String getNameIdValueExpression() {
			return this.nameIdValueExpression;
		}

		public void setNameIdValueExpression(String nameIdValueExpression) {
			this.nameIdValueExpression = nameIdValueExpression;
		}

		public List<AttributeStatementsItem> getAttributeStatements() {
			return this.attributeStatements;
		}

		public void setAttributeStatements(List<AttributeStatementsItem> attributeStatements) {
			this.attributeStatements = attributeStatements;
		}

		public String getDefaultRelayState() {
			return this.defaultRelayState;
		}

		public void setDefaultRelayState(String defaultRelayState) {
			this.defaultRelayState = defaultRelayState;
		}

		public String getSpEntityId() {
			return this.spEntityId;
		}

		public void setSpEntityId(String spEntityId) {
			this.spEntityId = spEntityId;
		}

		public static class AttributeStatementsItem {

			private String attributeValueExpression;

			private String attributeName;

			public String getAttributeValueExpression() {
				return this.attributeValueExpression;
			}

			public void setAttributeValueExpression(String attributeValueExpression) {
				this.attributeValueExpression = attributeValueExpression;
			}

			public String getAttributeName() {
				return this.attributeName;
			}

			public void setAttributeName(String attributeName) {
				this.attributeName = attributeName;
			}
		}
	}

	@Override
	public Class<SetApplicationSsoConfigResponse> getResponseClass() {
		return SetApplicationSsoConfigResponse.class;
	}

}
