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

import com.aliyuncs.ims.model.v20190815.ListApplicationsResponse;
import com.aliyuncs.ims.model.v20190815.ListApplicationsResponse.Application;
import com.aliyuncs.ims.model.v20190815.ListApplicationsResponse.Application.DelegatedScope;
import com.aliyuncs.ims.model.v20190815.ListApplicationsResponse.Application.DelegatedScope.PredefinedScope;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationsResponseUnmarshaller {

	public static ListApplicationsResponse unmarshall(ListApplicationsResponse listApplicationsResponse, UnmarshallerContext _ctx) {
		
		listApplicationsResponse.setRequestId(_ctx.stringValue("ListApplicationsResponse.RequestId"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationsResponse.Applications.Length"); i++) {
			Application application = new Application();
			application.setDisplayName(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].DisplayName"));
			application.setAccessTokenValidity(_ctx.integerValue("ListApplicationsResponse.Applications["+ i +"].AccessTokenValidity"));
			application.setSecretRequired(_ctx.booleanValue("ListApplicationsResponse.Applications["+ i +"].SecretRequired"));
			application.setAccountId(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].AccountId"));
			application.setCreateDate(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].CreateDate"));
			application.setAppName(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].AppName"));
			application.setUpdateDate(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].UpdateDate"));
			application.setAppId(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].AppId"));
			application.setRefreshTokenValidity(_ctx.integerValue("ListApplicationsResponse.Applications["+ i +"].RefreshTokenValidity"));
			application.setAppPrincipalName(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].AppPrincipalName"));
			application.setIsMultiTenant(_ctx.booleanValue("ListApplicationsResponse.Applications["+ i +"].IsMultiTenant"));
			application.setAppType(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].AppType"));
			application.setTenantId(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].TenantId"));

			List<String> redirectUris = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListApplicationsResponse.Applications["+ i +"].RedirectUris.Length"); j++) {
				redirectUris.add(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].RedirectUris["+ j +"]"));
			}
			application.setRedirectUris(redirectUris);

			DelegatedScope delegatedScope = new DelegatedScope();

			List<PredefinedScope> predefinedScopes = new ArrayList<PredefinedScope>();
			for (int j = 0; j < _ctx.lengthValue("ListApplicationsResponse.Applications["+ i +"].DelegatedScope.PredefinedScopes.Length"); j++) {
				PredefinedScope predefinedScope = new PredefinedScope();
				predefinedScope.setDescription(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].DelegatedScope.PredefinedScopes["+ j +"].Description"));
				predefinedScope.setName(_ctx.stringValue("ListApplicationsResponse.Applications["+ i +"].DelegatedScope.PredefinedScopes["+ j +"].Name"));

				predefinedScopes.add(predefinedScope);
			}
			delegatedScope.setPredefinedScopes(predefinedScopes);
			application.setDelegatedScope(delegatedScope);

			applications.add(application);
		}
		listApplicationsResponse.setApplications(applications);
	 
	 	return listApplicationsResponse;
	}
}