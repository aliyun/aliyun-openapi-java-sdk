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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.GetApplicationSsoConfigResponse;
import com.aliyuncs.eiam.model.v20211201.GetApplicationSsoConfigResponse.ApplicationSsoConfig;
import com.aliyuncs.eiam.model.v20211201.GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig;
import com.aliyuncs.eiam.model.v20211201.GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.CustomClaim;
import com.aliyuncs.eiam.model.v20211201.GetApplicationSsoConfigResponse.ApplicationSsoConfig.ProtocolEndpointDomain;
import com.aliyuncs.eiam.model.v20211201.GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig;
import com.aliyuncs.eiam.model.v20211201.GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.AttributeStatement;
import com.aliyuncs.eiam.model.v20211201.GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.OptionalRelayStatesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationSsoConfigResponseUnmarshaller {

	public static GetApplicationSsoConfigResponse unmarshall(GetApplicationSsoConfigResponse getApplicationSsoConfigResponse, UnmarshallerContext _ctx) {
		
		getApplicationSsoConfigResponse.setRequestId(_ctx.stringValue("GetApplicationSsoConfigResponse.RequestId"));

		ApplicationSsoConfig applicationSsoConfig = new ApplicationSsoConfig();
		applicationSsoConfig.setSsoStatus(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SsoStatus"));
		applicationSsoConfig.setInitLoginType(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.InitLoginType"));
		applicationSsoConfig.setInitLoginUrl(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.InitLoginUrl"));

		SamlSsoConfig samlSsoConfig = new SamlSsoConfig();
		samlSsoConfig.setSpSsoAcsUrl(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.SpSsoAcsUrl"));
		samlSsoConfig.setSpEntityId(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.SpEntityId"));
		samlSsoConfig.setNameIdFormat(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.NameIdFormat"));
		samlSsoConfig.setNameIdValueExpression(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.NameIdValueExpression"));
		samlSsoConfig.setDefaultRelayState(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.DefaultRelayState"));
		samlSsoConfig.setSignatureAlgorithm(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.SignatureAlgorithm"));
		samlSsoConfig.setResponseSigned(_ctx.booleanValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.ResponseSigned"));
		samlSsoConfig.setAssertionSigned(_ctx.booleanValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.AssertionSigned"));
		samlSsoConfig.setIdPEntityId(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.IdPEntityId"));

		List<AttributeStatement> attributeStatements = new ArrayList<AttributeStatement>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.AttributeStatements.Length"); i++) {
			AttributeStatement attributeStatement = new AttributeStatement();
			attributeStatement.setAttributeName(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.AttributeStatements["+ i +"].AttributeName"));
			attributeStatement.setAttributeValueExpression(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.AttributeStatements["+ i +"].AttributeValueExpression"));

			attributeStatements.add(attributeStatement);
		}
		samlSsoConfig.setAttributeStatements(attributeStatements);

		List<OptionalRelayStatesItem> optionalRelayStates = new ArrayList<OptionalRelayStatesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.OptionalRelayStates.Length"); i++) {
			OptionalRelayStatesItem optionalRelayStatesItem = new OptionalRelayStatesItem();
			optionalRelayStatesItem.setRelayState(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.OptionalRelayStates["+ i +"].RelayState"));
			optionalRelayStatesItem.setDisplayName(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.SamlSsoConfig.OptionalRelayStates["+ i +"].DisplayName"));

			optionalRelayStates.add(optionalRelayStatesItem);
		}
		samlSsoConfig.setOptionalRelayStates(optionalRelayStates);
		applicationSsoConfig.setSamlSsoConfig(samlSsoConfig);

		OidcSsoConfig oidcSsoConfig = new OidcSsoConfig();
		oidcSsoConfig.setPasswordTotpMfaRequired(_ctx.booleanValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.PasswordTotpMfaRequired"));
		oidcSsoConfig.setPasswordAuthenticationSourceId(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.PasswordAuthenticationSourceId"));
		oidcSsoConfig.setPkceRequired(_ctx.booleanValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.PkceRequired"));
		oidcSsoConfig.setAccessTokenEffectiveTime(_ctx.longValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.AccessTokenEffectiveTime"));
		oidcSsoConfig.setCodeEffectiveTime(_ctx.longValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.CodeEffectiveTime"));
		oidcSsoConfig.setIdTokenEffectiveTime(_ctx.longValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.IdTokenEffectiveTime"));
		oidcSsoConfig.setRefreshTokenEffective(_ctx.longValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.RefreshTokenEffective"));
		oidcSsoConfig.setSubjectIdExpression(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.SubjectIdExpression"));
		oidcSsoConfig.setAllowedPublicClient(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.AllowedPublicClient"));

		List<String> redirectUris = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.RedirectUris.Length"); i++) {
			redirectUris.add(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.RedirectUris["+ i +"]"));
		}
		oidcSsoConfig.setRedirectUris(redirectUris);

		List<String> postLogoutRedirectUris = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.PostLogoutRedirectUris.Length"); i++) {
			postLogoutRedirectUris.add(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.PostLogoutRedirectUris["+ i +"]"));
		}
		oidcSsoConfig.setPostLogoutRedirectUris(postLogoutRedirectUris);

		List<String> grantTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.GrantTypes.Length"); i++) {
			grantTypes.add(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.GrantTypes["+ i +"]"));
		}
		oidcSsoConfig.setGrantTypes(grantTypes);

		List<String> responseTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.ResponseTypes.Length"); i++) {
			responseTypes.add(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.ResponseTypes["+ i +"]"));
		}
		oidcSsoConfig.setResponseTypes(responseTypes);

		List<String> grantScopes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.GrantScopes.Length"); i++) {
			grantScopes.add(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.GrantScopes["+ i +"]"));
		}
		oidcSsoConfig.setGrantScopes(grantScopes);

		List<String> pkceChallengeMethods = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.PkceChallengeMethods.Length"); i++) {
			pkceChallengeMethods.add(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.PkceChallengeMethods["+ i +"]"));
		}
		oidcSsoConfig.setPkceChallengeMethods(pkceChallengeMethods);

		List<CustomClaim> customClaims = new ArrayList<CustomClaim>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.CustomClaims.Length"); i++) {
			CustomClaim customClaim = new CustomClaim();
			customClaim.setClaimName(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.CustomClaims["+ i +"].ClaimName"));
			customClaim.setClaimValueExpression(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.OidcSsoConfig.CustomClaims["+ i +"].ClaimValueExpression"));

			customClaims.add(customClaim);
		}
		oidcSsoConfig.setCustomClaims(customClaims);
		applicationSsoConfig.setOidcSsoConfig(oidcSsoConfig);

		ProtocolEndpointDomain protocolEndpointDomain = new ProtocolEndpointDomain();
		protocolEndpointDomain.setSamlSsoEndpoint(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.ProtocolEndpointDomain.SamlSsoEndpoint"));
		protocolEndpointDomain.setSamlMetaEndpoint(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.ProtocolEndpointDomain.SamlMetaEndpoint"));
		protocolEndpointDomain.setOidcIssuer(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.ProtocolEndpointDomain.OidcIssuer"));
		protocolEndpointDomain.setOidcJwksEndpoint(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.ProtocolEndpointDomain.OidcJwksEndpoint"));
		protocolEndpointDomain.setOauth2AuthorizationEndpoint(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.ProtocolEndpointDomain.Oauth2AuthorizationEndpoint"));
		protocolEndpointDomain.setOauth2RevokeEndpoint(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.ProtocolEndpointDomain.Oauth2RevokeEndpoint"));
		protocolEndpointDomain.setOauth2TokenEndpoint(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.ProtocolEndpointDomain.Oauth2TokenEndpoint"));
		protocolEndpointDomain.setOauth2DeviceAuthorizationEndpoint(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.ProtocolEndpointDomain.Oauth2DeviceAuthorizationEndpoint"));
		protocolEndpointDomain.setOauth2UserinfoEndpoint(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.ProtocolEndpointDomain.Oauth2UserinfoEndpoint"));
		protocolEndpointDomain.setOidcLogoutEndpoint(_ctx.stringValue("GetApplicationSsoConfigResponse.ApplicationSsoConfig.ProtocolEndpointDomain.OidcLogoutEndpoint"));
		applicationSsoConfig.setProtocolEndpointDomain(protocolEndpointDomain);
		getApplicationSsoConfigResponse.setApplicationSsoConfig(applicationSsoConfig);
	 
	 	return getApplicationSsoConfigResponse;
	}
}