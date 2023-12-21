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

import com.aliyuncs.eiam.model.v20211201.GetApplicationProvisioningConfigResponse;
import com.aliyuncs.eiam.model.v20211201.GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig;
import com.aliyuncs.eiam.model.v20211201.GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.CallbackProvisioningConfig;
import com.aliyuncs.eiam.model.v20211201.GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig;
import com.aliyuncs.eiam.model.v20211201.GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.AuthnConfiguration;
import com.aliyuncs.eiam.model.v20211201.GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.AuthnConfiguration.AuthnParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationProvisioningConfigResponseUnmarshaller {

	public static GetApplicationProvisioningConfigResponse unmarshall(GetApplicationProvisioningConfigResponse getApplicationProvisioningConfigResponse, UnmarshallerContext _ctx) {
		
		getApplicationProvisioningConfigResponse.setRequestId(_ctx.stringValue("GetApplicationProvisioningConfigResponse.RequestId"));

		ApplicationProvisioningConfig applicationProvisioningConfig = new ApplicationProvisioningConfig();
		applicationProvisioningConfig.setInstanceId(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.InstanceId"));
		applicationProvisioningConfig.setApplicationId(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ApplicationId"));
		applicationProvisioningConfig.setProvisionProtocolType(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ProvisionProtocolType"));
		applicationProvisioningConfig.setProvisionJwksEndpoint(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ProvisionJwksEndpoint"));
		applicationProvisioningConfig.setProvisionPassword(_ctx.booleanValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ProvisionPassword"));
		applicationProvisioningConfig.setStatus(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.Status"));
		applicationProvisioningConfig.setConfigOperateMode(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ConfigOperateMode"));

		CallbackProvisioningConfig callbackProvisioningConfig = new CallbackProvisioningConfig();
		callbackProvisioningConfig.setCallbackUrl(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.CallbackProvisioningConfig.CallbackUrl"));
		callbackProvisioningConfig.setEncryptKey(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.CallbackProvisioningConfig.EncryptKey"));
		callbackProvisioningConfig.setEncryptRequired(_ctx.booleanValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.CallbackProvisioningConfig.EncryptRequired"));

		List<String> listenEventScopes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.CallbackProvisioningConfig.ListenEventScopes.Length"); i++) {
			listenEventScopes.add(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.CallbackProvisioningConfig.ListenEventScopes["+ i +"]"));
		}
		callbackProvisioningConfig.setListenEventScopes(listenEventScopes);
		applicationProvisioningConfig.setCallbackProvisioningConfig(callbackProvisioningConfig);

		ScimProvisioningConfig scimProvisioningConfig = new ScimProvisioningConfig();
		scimProvisioningConfig.setScimBaseUrl(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.ScimBaseUrl"));

		List<String> provisioningActions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.ProvisioningActions.Length"); i++) {
			provisioningActions.add(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.ProvisioningActions["+ i +"]"));
		}
		scimProvisioningConfig.setProvisioningActions(provisioningActions);

		List<String> fullPushScopes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.FullPushScopes.Length"); i++) {
			fullPushScopes.add(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.FullPushScopes["+ i +"]"));
		}
		scimProvisioningConfig.setFullPushScopes(fullPushScopes);

		AuthnConfiguration authnConfiguration = new AuthnConfiguration();
		authnConfiguration.setAuthnMode(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.AuthnConfiguration.AuthnMode"));
		authnConfiguration.setGrantType(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.AuthnConfiguration.GrantType"));

		AuthnParam authnParam = new AuthnParam();
		authnParam.setAccessToken(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.AuthnConfiguration.AuthnParam.AccessToken"));
		authnParam.setTokenEndpoint(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.AuthnConfiguration.AuthnParam.TokenEndpoint"));
		authnParam.setClientId(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.AuthnConfiguration.AuthnParam.ClientId"));
		authnParam.setClientSecret(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.AuthnConfiguration.AuthnParam.ClientSecret"));
		authnParam.setAuthnMethod(_ctx.stringValue("GetApplicationProvisioningConfigResponse.ApplicationProvisioningConfig.ScimProvisioningConfig.AuthnConfiguration.AuthnParam.AuthnMethod"));
		authnConfiguration.setAuthnParam(authnParam);
		scimProvisioningConfig.setAuthnConfiguration(authnConfiguration);
		applicationProvisioningConfig.setScimProvisioningConfig(scimProvisioningConfig);
		getApplicationProvisioningConfigResponse.setApplicationProvisioningConfig(applicationProvisioningConfig);
	 
	 	return getApplicationProvisioningConfigResponse;
	}
}