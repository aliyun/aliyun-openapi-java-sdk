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

package com.aliyuncs.ims.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ims.model.v20190815.UpdateApplicationResponse;
import com.aliyuncs.ims.model.v20190815.UpdateApplicationResponse.Application;
import com.aliyuncs.ims.model.v20190815.UpdateApplicationResponse.Application.DelegatedScope;
import com.aliyuncs.ims.model.v20190815.UpdateApplicationResponse.Application.DelegatedScope.PredefinedScope;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateApplicationResponseUnmarshaller {

	public static UpdateApplicationResponse unmarshall(UpdateApplicationResponse updateApplicationResponse, UnmarshallerContext _ctx) {
		
		updateApplicationResponse.setRequestId(_ctx.stringValue("UpdateApplicationResponse.RequestId"));

		Application application = new Application();
		application.setDisplayName(_ctx.stringValue("UpdateApplicationResponse.Application.DisplayName"));
		application.setAccessTokenValidity(_ctx.integerValue("UpdateApplicationResponse.Application.AccessTokenValidity"));
		application.setSecretRequired(_ctx.booleanValue("UpdateApplicationResponse.Application.SecretRequired"));
		application.setAccountId(_ctx.stringValue("UpdateApplicationResponse.Application.AccountId"));
		application.setCreateDate(_ctx.stringValue("UpdateApplicationResponse.Application.CreateDate"));
		application.setAppName(_ctx.stringValue("UpdateApplicationResponse.Application.AppName"));
		application.setUpdateDate(_ctx.stringValue("UpdateApplicationResponse.Application.UpdateDate"));
		application.setAppId(_ctx.stringValue("UpdateApplicationResponse.Application.AppId"));
		application.setRefreshTokenValidity(_ctx.integerValue("UpdateApplicationResponse.Application.RefreshTokenValidity"));
		application.setAppPrincipalName(_ctx.stringValue("UpdateApplicationResponse.Application.AppPrincipalName"));
		application.setIsMultiTenant(_ctx.booleanValue("UpdateApplicationResponse.Application.IsMultiTenant"));
		application.setAppType(_ctx.stringValue("UpdateApplicationResponse.Application.AppType"));
		application.setTenantId(_ctx.stringValue("UpdateApplicationResponse.Application.TenantId"));

		List<String> redirectUris = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateApplicationResponse.Application.RedirectUris.Length"); i++) {
			redirectUris.add(_ctx.stringValue("UpdateApplicationResponse.Application.RedirectUris["+ i +"]"));
		}
		application.setRedirectUris(redirectUris);

		DelegatedScope delegatedScope = new DelegatedScope();

		List<PredefinedScope> predefinedScopes = new ArrayList<PredefinedScope>();
		for (int i = 0; i < _ctx.lengthValue("UpdateApplicationResponse.Application.DelegatedScope.PredefinedScopes.Length"); i++) {
			PredefinedScope predefinedScope = new PredefinedScope();
			predefinedScope.setDescription(_ctx.stringValue("UpdateApplicationResponse.Application.DelegatedScope.PredefinedScopes["+ i +"].Description"));
			predefinedScope.setName(_ctx.stringValue("UpdateApplicationResponse.Application.DelegatedScope.PredefinedScopes["+ i +"].Name"));
			predefinedScope.setRequired(_ctx.booleanValue("UpdateApplicationResponse.Application.DelegatedScope.PredefinedScopes["+ i +"].Required"));

			predefinedScopes.add(predefinedScope);
		}
		delegatedScope.setPredefinedScopes(predefinedScopes);
		application.setDelegatedScope(delegatedScope);
		updateApplicationResponse.setApplication(application);
	 
	 	return updateApplicationResponse;
	}
}