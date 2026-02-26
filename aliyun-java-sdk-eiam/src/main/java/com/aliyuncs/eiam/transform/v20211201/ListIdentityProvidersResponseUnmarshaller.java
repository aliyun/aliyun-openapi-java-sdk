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

import com.aliyuncs.eiam.model.v20211201.ListIdentityProvidersResponse;
import com.aliyuncs.eiam.model.v20211201.ListIdentityProvidersResponse.IdentityProvider;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIdentityProvidersResponseUnmarshaller {

	public static ListIdentityProvidersResponse unmarshall(ListIdentityProvidersResponse listIdentityProvidersResponse, UnmarshallerContext _ctx) {
		
		listIdentityProvidersResponse.setRequestId(_ctx.stringValue("ListIdentityProvidersResponse.RequestId"));
		listIdentityProvidersResponse.setTotalCount(_ctx.longValue("ListIdentityProvidersResponse.TotalCount"));

		List<IdentityProvider> identityProviders = new ArrayList<IdentityProvider>();
		for (int i = 0; i < _ctx.lengthValue("ListIdentityProvidersResponse.IdentityProviders.Length"); i++) {
			IdentityProvider identityProvider = new IdentityProvider();
			identityProvider.setInstanceId(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].InstanceId"));
			identityProvider.setIdentityProviderId(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].IdentityProviderId"));
			identityProvider.setIdentityProviderExternalId(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].IdentityProviderExternalId"));
			identityProvider.setDescription(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].Description"));
			identityProvider.setIdentityProviderName(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].IdentityProviderName"));
			identityProvider.setUdPullStatus(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].UdPullStatus"));
			identityProvider.setAuthnSourceType(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].AuthnSourceType"));
			identityProvider.setAuthnSourceSupplier(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].AuthnSourceSupplier"));
			identityProvider.setAuthnStatus(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].AuthnStatus"));
			identityProvider.setIncrementalCallbackStatus(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].IncrementalCallbackStatus"));
			identityProvider.setUdPullTargetScope(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].UdPullTargetScope"));
			identityProvider.setIdentityProviderType(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].IdentityProviderType"));
			identityProvider.setAdvancedStatus(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].AdvancedStatus"));
			identityProvider.setUdPushStatus(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].UdPushStatus"));
			identityProvider.setLockReason(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].LockReason"));
			identityProvider.setLastStatusCheckJobResult(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].LastStatusCheckJobResult"));
			identityProvider.setCreateTime(_ctx.longValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].CreateTime"));
			identityProvider.setUpdateTime(_ctx.longValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].UpdateTime"));
			identityProvider.setLogoUrl(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].LogoUrl"));
			identityProvider.setPeriodicSyncStatus(_ctx.stringValue("ListIdentityProvidersResponse.IdentityProviders["+ i +"].PeriodicSyncStatus"));

			identityProviders.add(identityProvider);
		}
		listIdentityProvidersResponse.setIdentityProviders(identityProviders);
	 
	 	return listIdentityProvidersResponse;
	}
}