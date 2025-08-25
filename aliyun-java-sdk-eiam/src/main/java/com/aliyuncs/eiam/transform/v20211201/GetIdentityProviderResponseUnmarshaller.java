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

import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.DingtalkAppConfig;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.DingtalkProvisioningConfig;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.DingtalkProvisioningConfig.AuthedDepartmentId;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.DingtalkProvisioningConfig.AuthedUser;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.LarkConfig;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.LdapConfig;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.AuthnParam;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.EndpointConfig;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.UdPullConfig;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.UdPullConfig.UdSyncScopeConfig;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.UdPushConfig;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.UdPushConfig.UdSyncScopeConfig1;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderResponse.IdentityProviderDetail.WeComConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIdentityProviderResponseUnmarshaller {

	public static GetIdentityProviderResponse unmarshall(GetIdentityProviderResponse getIdentityProviderResponse, UnmarshallerContext _ctx) {
		
		getIdentityProviderResponse.setRequestId(_ctx.stringValue("GetIdentityProviderResponse.RequestId"));

		IdentityProviderDetail identityProviderDetail = new IdentityProviderDetail();
		identityProviderDetail.setAdvancedStatus(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.AdvancedStatus"));
		identityProviderDetail.setAuthnSourceSupplier(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.AuthnSourceSupplier"));
		identityProviderDetail.setAuthnSourceType(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.AuthnSourceType"));
		identityProviderDetail.setAuthnStatus(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.AuthnStatus"));
		identityProviderDetail.setCreateTime(_ctx.longValue("GetIdentityProviderResponse.IdentityProviderDetail.CreateTime"));
		identityProviderDetail.setDescription(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.Description"));
		identityProviderDetail.setIdentityProviderExternalId(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.IdentityProviderExternalId"));
		identityProviderDetail.setIdentityProviderId(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.IdentityProviderId"));
		identityProviderDetail.setIdentityProviderName(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.IdentityProviderName"));
		identityProviderDetail.setIdentityProviderType(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.IdentityProviderType"));
		identityProviderDetail.setInstanceId(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.InstanceId"));
		identityProviderDetail.setLastStatusCheckJobResult(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LastStatusCheckJobResult"));
		identityProviderDetail.setLockReason(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LockReason"));
		identityProviderDetail.setNetworkAccessEndpointId(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.NetworkAccessEndpointId"));
		identityProviderDetail.setUdPullStatus(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.UdPullStatus"));
		identityProviderDetail.setUdPushStatus(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.UdPushStatus"));
		identityProviderDetail.setUpdateTime(_ctx.longValue("GetIdentityProviderResponse.IdentityProviderDetail.UpdateTime"));
		identityProviderDetail.setLogoUrl(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LogoUrl"));

		DingtalkAppConfig dingtalkAppConfig = new DingtalkAppConfig();
		dingtalkAppConfig.setAppKey(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkAppConfig.AppKey"));
		dingtalkAppConfig.setAppSecret(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkAppConfig.AppSecret"));
		dingtalkAppConfig.setCorpId(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkAppConfig.CorpId"));
		dingtalkAppConfig.setDingtalkVersion(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkAppConfig.DingtalkVersion"));
		dingtalkAppConfig.setEncryptKey(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkAppConfig.EncryptKey"));
		dingtalkAppConfig.setVerificationToken(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkAppConfig.VerificationToken"));
		identityProviderDetail.setDingtalkAppConfig(dingtalkAppConfig);

		DingtalkProvisioningConfig dingtalkProvisioningConfig = new DingtalkProvisioningConfig();
		dingtalkProvisioningConfig.setCorpId(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkProvisioningConfig.CorpId"));
		dingtalkProvisioningConfig.setCorpName(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkProvisioningConfig.CorpName"));

		List<AuthedDepartmentId> authedDepartmentIds = new ArrayList<AuthedDepartmentId>();
		for (int i = 0; i < _ctx.lengthValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkProvisioningConfig.AuthedDepartmentIds.Length"); i++) {
			AuthedDepartmentId authedDepartmentId = new AuthedDepartmentId();
			authedDepartmentId.setDeptId(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkProvisioningConfig.AuthedDepartmentIds["+ i +"].DeptId"));
			authedDepartmentId.setDeptName(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkProvisioningConfig.AuthedDepartmentIds["+ i +"].DeptName"));

			authedDepartmentIds.add(authedDepartmentId);
		}
		dingtalkProvisioningConfig.setAuthedDepartmentIds(authedDepartmentIds);

		List<AuthedUser> authedUsers = new ArrayList<AuthedUser>();
		for (int i = 0; i < _ctx.lengthValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkProvisioningConfig.AuthedUsers.Length"); i++) {
			AuthedUser authedUser = new AuthedUser();
			authedUser.setName(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkProvisioningConfig.AuthedUsers["+ i +"].Name"));
			authedUser.setUserId(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.DingtalkProvisioningConfig.AuthedUsers["+ i +"].UserId"));

			authedUsers.add(authedUser);
		}
		dingtalkProvisioningConfig.setAuthedUsers(authedUsers);
		identityProviderDetail.setDingtalkProvisioningConfig(dingtalkProvisioningConfig);

		LarkConfig larkConfig = new LarkConfig();
		larkConfig.setAppId(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LarkConfig.AppId"));
		larkConfig.setAppSecret(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LarkConfig.AppSecret"));
		larkConfig.setEnterpriseNumber(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LarkConfig.EnterpriseNumber"));
		larkConfig.setEncryptKey(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LarkConfig.EncryptKey"));
		larkConfig.setVerificationToken(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LarkConfig.VerificationToken"));
		identityProviderDetail.setLarkConfig(larkConfig);

		LdapConfig ldapConfig = new LdapConfig();
		ldapConfig.setAdministratorPassword(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LdapConfig.AdministratorPassword"));
		ldapConfig.setAdministratorUsername(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LdapConfig.AdministratorUsername"));
		ldapConfig.setCertificateFingerprintStatus(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LdapConfig.CertificateFingerprintStatus"));
		ldapConfig.setLdapProtocol(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LdapConfig.LdapProtocol"));
		ldapConfig.setLdapServerHost(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LdapConfig.LdapServerHost"));
		ldapConfig.setLdapServerPort(_ctx.integerValue("GetIdentityProviderResponse.IdentityProviderDetail.LdapConfig.LdapServerPort"));
		ldapConfig.setStartTlsStatus(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LdapConfig.StartTlsStatus"));

		List<String> certificateFingerprints = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetIdentityProviderResponse.IdentityProviderDetail.LdapConfig.CertificateFingerprints.Length"); i++) {
			certificateFingerprints.add(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.LdapConfig.CertificateFingerprints["+ i +"]"));
		}
		ldapConfig.setCertificateFingerprints(certificateFingerprints);
		identityProviderDetail.setLdapConfig(ldapConfig);

		OidcConfig oidcConfig = new OidcConfig();
		oidcConfig.setGrantType(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.GrantType"));
		oidcConfig.setPkceChallengeMethod(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.PkceChallengeMethod"));
		oidcConfig.setPkceRequired(_ctx.booleanValue("GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.PkceRequired"));

		List<String> grantScopes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.GrantScopes.Length"); i++) {
			grantScopes.add(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.GrantScopes["+ i +"]"));
		}
		oidcConfig.setGrantScopes(grantScopes);

		AuthnParam authnParam = new AuthnParam();
		authnParam.setAuthnMethod(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.AuthnParam.AuthnMethod"));
		authnParam.setClientId(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.AuthnParam.ClientId"));
		authnParam.setClientSecret(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.AuthnParam.ClientSecret"));
		oidcConfig.setAuthnParam(authnParam);

		EndpointConfig endpointConfig = new EndpointConfig();
		endpointConfig.setAuthorizationEndpoint(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.EndpointConfig.AuthorizationEndpoint"));
		endpointConfig.setIssuer(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.EndpointConfig.Issuer"));
		endpointConfig.setJwksUri(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.EndpointConfig.JwksUri"));
		endpointConfig.setTokenEndpoint(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.EndpointConfig.TokenEndpoint"));
		endpointConfig.setUserinfoEndpoint(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.OidcConfig.EndpointConfig.UserinfoEndpoint"));
		oidcConfig.setEndpointConfig(endpointConfig);
		identityProviderDetail.setOidcConfig(oidcConfig);

		UdPullConfig udPullConfig = new UdPullConfig();
		udPullConfig.setGroupSyncStatus(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.UdPullConfig.GroupSyncStatus"));
		udPullConfig.setIncrementalCallbackStatus(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.UdPullConfig.IncrementalCallbackStatus"));

		UdSyncScopeConfig udSyncScopeConfig = new UdSyncScopeConfig();
		udSyncScopeConfig.setTargetScope(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.UdPullConfig.UdSyncScopeConfig.TargetScope"));

		List<String> sourceScopes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetIdentityProviderResponse.IdentityProviderDetail.UdPullConfig.UdSyncScopeConfig.SourceScopes.Length"); i++) {
			sourceScopes.add(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.UdPullConfig.UdSyncScopeConfig.SourceScopes["+ i +"]"));
		}
		udSyncScopeConfig.setSourceScopes(sourceScopes);
		udPullConfig.setUdSyncScopeConfig(udSyncScopeConfig);
		identityProviderDetail.setUdPullConfig(udPullConfig);

		UdPushConfig udPushConfig = new UdPushConfig();
		udPushConfig.setIncrementalCallbackStatus(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.UdPushConfig.IncrementalCallbackStatus"));

		List<UdSyncScopeConfig1> udSyncScopeConfigs = new ArrayList<UdSyncScopeConfig1>();
		for (int i = 0; i < _ctx.lengthValue("GetIdentityProviderResponse.IdentityProviderDetail.UdPushConfig.UdSyncScopeConfigs.Length"); i++) {
			UdSyncScopeConfig1 udSyncScopeConfig1 = new UdSyncScopeConfig1();
			udSyncScopeConfig1.setTargetScope(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.UdPushConfig.UdSyncScopeConfigs["+ i +"].TargetScope"));

			List<String> sourceScopes2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetIdentityProviderResponse.IdentityProviderDetail.UdPushConfig.UdSyncScopeConfigs["+ i +"].SourceScopes.Length"); j++) {
				sourceScopes2.add(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.UdPushConfig.UdSyncScopeConfigs["+ i +"].SourceScopes["+ j +"]"));
			}
			udSyncScopeConfig1.setSourceScopes2(sourceScopes2);

			udSyncScopeConfigs.add(udSyncScopeConfig1);
		}
		udPushConfig.setUdSyncScopeConfigs(udSyncScopeConfigs);
		identityProviderDetail.setUdPushConfig(udPushConfig);

		WeComConfig weComConfig = new WeComConfig();
		weComConfig.setAgentId(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.WeComConfig.AgentId"));
		weComConfig.setAuthorizeCallbackDomain(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.WeComConfig.AuthorizeCallbackDomain"));
		weComConfig.setCorpId(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.WeComConfig.CorpId"));
		weComConfig.setCorpSecret(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.WeComConfig.CorpSecret"));
		weComConfig.setTrustableDomain(_ctx.stringValue("GetIdentityProviderResponse.IdentityProviderDetail.WeComConfig.TrustableDomain"));
		identityProviderDetail.setWeComConfig(weComConfig);
		getIdentityProviderResponse.setIdentityProviderDetail(identityProviderDetail);
	 
	 	return getIdentityProviderResponse;
	}
}