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
import com.aliyuncs.eiam.transform.v20211201.GetApplicationSsoConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApplicationSsoConfigResponse extends AcsResponse {

	private String requestId;

	private ApplicationSsoConfig applicationSsoConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplicationSsoConfig getApplicationSsoConfig() {
		return this.applicationSsoConfig;
	}

	public void setApplicationSsoConfig(ApplicationSsoConfig applicationSsoConfig) {
		this.applicationSsoConfig = applicationSsoConfig;
	}

	public static class ApplicationSsoConfig {

		private String ssoStatus;

		private String initLoginType;

		private String initLoginUrl;

		private SamlSsoConfig samlSsoConfig;

		private OidcSsoConfig oidcSsoConfig;

		private ProtocolEndpointDomain protocolEndpointDomain;

		public String getSsoStatus() {
			return this.ssoStatus;
		}

		public void setSsoStatus(String ssoStatus) {
			this.ssoStatus = ssoStatus;
		}

		public String getInitLoginType() {
			return this.initLoginType;
		}

		public void setInitLoginType(String initLoginType) {
			this.initLoginType = initLoginType;
		}

		public String getInitLoginUrl() {
			return this.initLoginUrl;
		}

		public void setInitLoginUrl(String initLoginUrl) {
			this.initLoginUrl = initLoginUrl;
		}

		public SamlSsoConfig getSamlSsoConfig() {
			return this.samlSsoConfig;
		}

		public void setSamlSsoConfig(SamlSsoConfig samlSsoConfig) {
			this.samlSsoConfig = samlSsoConfig;
		}

		public OidcSsoConfig getOidcSsoConfig() {
			return this.oidcSsoConfig;
		}

		public void setOidcSsoConfig(OidcSsoConfig oidcSsoConfig) {
			this.oidcSsoConfig = oidcSsoConfig;
		}

		public ProtocolEndpointDomain getProtocolEndpointDomain() {
			return this.protocolEndpointDomain;
		}

		public void setProtocolEndpointDomain(ProtocolEndpointDomain protocolEndpointDomain) {
			this.protocolEndpointDomain = protocolEndpointDomain;
		}

		public static class SamlSsoConfig {

			private String spSsoAcsUrl;

			private String spEntityId;

			private String nameIdFormat;

			private String nameIdValueExpression;

			private String defaultRelayState;

			private String signatureAlgorithm;

			private List<AttributeStatement> attributeStatements;

			public String getSpSsoAcsUrl() {
				return this.spSsoAcsUrl;
			}

			public void setSpSsoAcsUrl(String spSsoAcsUrl) {
				this.spSsoAcsUrl = spSsoAcsUrl;
			}

			public String getSpEntityId() {
				return this.spEntityId;
			}

			public void setSpEntityId(String spEntityId) {
				this.spEntityId = spEntityId;
			}

			public String getNameIdFormat() {
				return this.nameIdFormat;
			}

			public void setNameIdFormat(String nameIdFormat) {
				this.nameIdFormat = nameIdFormat;
			}

			public String getNameIdValueExpression() {
				return this.nameIdValueExpression;
			}

			public void setNameIdValueExpression(String nameIdValueExpression) {
				this.nameIdValueExpression = nameIdValueExpression;
			}

			public String getDefaultRelayState() {
				return this.defaultRelayState;
			}

			public void setDefaultRelayState(String defaultRelayState) {
				this.defaultRelayState = defaultRelayState;
			}

			public String getSignatureAlgorithm() {
				return this.signatureAlgorithm;
			}

			public void setSignatureAlgorithm(String signatureAlgorithm) {
				this.signatureAlgorithm = signatureAlgorithm;
			}

			public List<AttributeStatement> getAttributeStatements() {
				return this.attributeStatements;
			}

			public void setAttributeStatements(List<AttributeStatement> attributeStatements) {
				this.attributeStatements = attributeStatements;
			}

			public static class AttributeStatement {

				private String attributeName;

				private String attributeValueExpression;

				public String getAttributeName() {
					return this.attributeName;
				}

				public void setAttributeName(String attributeName) {
					this.attributeName = attributeName;
				}

				public String getAttributeValueExpression() {
					return this.attributeValueExpression;
				}

				public void setAttributeValueExpression(String attributeValueExpression) {
					this.attributeValueExpression = attributeValueExpression;
				}
			}
		}

		public static class OidcSsoConfig {

			private Boolean passwordTotpMfaRequired;

			private String passwordAuthenticationSourceId;

			private Boolean pkceRequired;

			private Long accessTokenEffectiveTime;

			private Long codeEffectiveTime;

			private Long idTokenEffectiveTime;

			private Long refreshTokenEffective;

			private String subjectIdExpression;

			private List<CustomClaim> customClaims;

			private List<String> redirectUris;

			private List<String> postLogoutRedirectUris;

			private List<String> grantTypes;

			private List<String> responseTypes;

			private List<String> grantScopes;

			private List<String> pkceChallengeMethods;

			public Boolean getPasswordTotpMfaRequired() {
				return this.passwordTotpMfaRequired;
			}

			public void setPasswordTotpMfaRequired(Boolean passwordTotpMfaRequired) {
				this.passwordTotpMfaRequired = passwordTotpMfaRequired;
			}

			public String getPasswordAuthenticationSourceId() {
				return this.passwordAuthenticationSourceId;
			}

			public void setPasswordAuthenticationSourceId(String passwordAuthenticationSourceId) {
				this.passwordAuthenticationSourceId = passwordAuthenticationSourceId;
			}

			public Boolean getPkceRequired() {
				return this.pkceRequired;
			}

			public void setPkceRequired(Boolean pkceRequired) {
				this.pkceRequired = pkceRequired;
			}

			public Long getAccessTokenEffectiveTime() {
				return this.accessTokenEffectiveTime;
			}

			public void setAccessTokenEffectiveTime(Long accessTokenEffectiveTime) {
				this.accessTokenEffectiveTime = accessTokenEffectiveTime;
			}

			public Long getCodeEffectiveTime() {
				return this.codeEffectiveTime;
			}

			public void setCodeEffectiveTime(Long codeEffectiveTime) {
				this.codeEffectiveTime = codeEffectiveTime;
			}

			public Long getIdTokenEffectiveTime() {
				return this.idTokenEffectiveTime;
			}

			public void setIdTokenEffectiveTime(Long idTokenEffectiveTime) {
				this.idTokenEffectiveTime = idTokenEffectiveTime;
			}

			public Long getRefreshTokenEffective() {
				return this.refreshTokenEffective;
			}

			public void setRefreshTokenEffective(Long refreshTokenEffective) {
				this.refreshTokenEffective = refreshTokenEffective;
			}

			public String getSubjectIdExpression() {
				return this.subjectIdExpression;
			}

			public void setSubjectIdExpression(String subjectIdExpression) {
				this.subjectIdExpression = subjectIdExpression;
			}

			public List<CustomClaim> getCustomClaims() {
				return this.customClaims;
			}

			public void setCustomClaims(List<CustomClaim> customClaims) {
				this.customClaims = customClaims;
			}

			public List<String> getRedirectUris() {
				return this.redirectUris;
			}

			public void setRedirectUris(List<String> redirectUris) {
				this.redirectUris = redirectUris;
			}

			public List<String> getPostLogoutRedirectUris() {
				return this.postLogoutRedirectUris;
			}

			public void setPostLogoutRedirectUris(List<String> postLogoutRedirectUris) {
				this.postLogoutRedirectUris = postLogoutRedirectUris;
			}

			public List<String> getGrantTypes() {
				return this.grantTypes;
			}

			public void setGrantTypes(List<String> grantTypes) {
				this.grantTypes = grantTypes;
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

			public List<String> getPkceChallengeMethods() {
				return this.pkceChallengeMethods;
			}

			public void setPkceChallengeMethods(List<String> pkceChallengeMethods) {
				this.pkceChallengeMethods = pkceChallengeMethods;
			}

			public static class CustomClaim {

				private String claimName;

				private String claimValueExpression;

				public String getClaimName() {
					return this.claimName;
				}

				public void setClaimName(String claimName) {
					this.claimName = claimName;
				}

				public String getClaimValueExpression() {
					return this.claimValueExpression;
				}

				public void setClaimValueExpression(String claimValueExpression) {
					this.claimValueExpression = claimValueExpression;
				}
			}
		}

		public static class ProtocolEndpointDomain {

			private String samlSsoEndpoint;

			private String samlMetaEndpoint;

			private String oidcIssuer;

			private String oidcJwksEndpoint;

			private String oauth2AuthorizationEndpoint;

			private String oauth2RevokeEndpoint;

			private String oauth2TokenEndpoint;

			private String oauth2DeviceAuthorizationEndpoint;

			private String oauth2UserinfoEndpoint;

			private String oidcLogoutEndpoint;

			public String getSamlSsoEndpoint() {
				return this.samlSsoEndpoint;
			}

			public void setSamlSsoEndpoint(String samlSsoEndpoint) {
				this.samlSsoEndpoint = samlSsoEndpoint;
			}

			public String getSamlMetaEndpoint() {
				return this.samlMetaEndpoint;
			}

			public void setSamlMetaEndpoint(String samlMetaEndpoint) {
				this.samlMetaEndpoint = samlMetaEndpoint;
			}

			public String getOidcIssuer() {
				return this.oidcIssuer;
			}

			public void setOidcIssuer(String oidcIssuer) {
				this.oidcIssuer = oidcIssuer;
			}

			public String getOidcJwksEndpoint() {
				return this.oidcJwksEndpoint;
			}

			public void setOidcJwksEndpoint(String oidcJwksEndpoint) {
				this.oidcJwksEndpoint = oidcJwksEndpoint;
			}

			public String getOauth2AuthorizationEndpoint() {
				return this.oauth2AuthorizationEndpoint;
			}

			public void setOauth2AuthorizationEndpoint(String oauth2AuthorizationEndpoint) {
				this.oauth2AuthorizationEndpoint = oauth2AuthorizationEndpoint;
			}

			public String getOauth2RevokeEndpoint() {
				return this.oauth2RevokeEndpoint;
			}

			public void setOauth2RevokeEndpoint(String oauth2RevokeEndpoint) {
				this.oauth2RevokeEndpoint = oauth2RevokeEndpoint;
			}

			public String getOauth2TokenEndpoint() {
				return this.oauth2TokenEndpoint;
			}

			public void setOauth2TokenEndpoint(String oauth2TokenEndpoint) {
				this.oauth2TokenEndpoint = oauth2TokenEndpoint;
			}

			public String getOauth2DeviceAuthorizationEndpoint() {
				return this.oauth2DeviceAuthorizationEndpoint;
			}

			public void setOauth2DeviceAuthorizationEndpoint(String oauth2DeviceAuthorizationEndpoint) {
				this.oauth2DeviceAuthorizationEndpoint = oauth2DeviceAuthorizationEndpoint;
			}

			public String getOauth2UserinfoEndpoint() {
				return this.oauth2UserinfoEndpoint;
			}

			public void setOauth2UserinfoEndpoint(String oauth2UserinfoEndpoint) {
				this.oauth2UserinfoEndpoint = oauth2UserinfoEndpoint;
			}

			public String getOidcLogoutEndpoint() {
				return this.oidcLogoutEndpoint;
			}

			public void setOidcLogoutEndpoint(String oidcLogoutEndpoint) {
				this.oidcLogoutEndpoint = oidcLogoutEndpoint;
			}
		}
	}

	@Override
	public GetApplicationSsoConfigResponse getInstance(UnmarshallerContext context) {
		return	GetApplicationSsoConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
