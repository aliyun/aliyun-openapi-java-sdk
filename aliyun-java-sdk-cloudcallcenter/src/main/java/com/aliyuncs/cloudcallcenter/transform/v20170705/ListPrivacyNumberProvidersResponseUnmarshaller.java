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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivacyNumberProvidersResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivacyNumberProvidersResponse.Provider;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivacyNumberProvidersResponseUnmarshaller {

	public static ListPrivacyNumberProvidersResponse unmarshall(ListPrivacyNumberProvidersResponse listPrivacyNumberProvidersResponse, UnmarshallerContext context) {
		
		listPrivacyNumberProvidersResponse.setRequestId(context.stringValue("ListPrivacyNumberProvidersResponse.RequestId"));
		listPrivacyNumberProvidersResponse.setSuccess(context.booleanValue("ListPrivacyNumberProvidersResponse.Success"));
		listPrivacyNumberProvidersResponse.setCode(context.stringValue("ListPrivacyNumberProvidersResponse.Code"));
		listPrivacyNumberProvidersResponse.setMessage(context.stringValue("ListPrivacyNumberProvidersResponse.Message"));
		listPrivacyNumberProvidersResponse.setHttpStatusCode(context.integerValue("ListPrivacyNumberProvidersResponse.HttpStatusCode"));

		List<Provider> providers = new ArrayList<Provider>();
		for (int i = 0; i < context.lengthValue("ListPrivacyNumberProvidersResponse.Providers.Length"); i++) {
			Provider provider = new Provider();
			provider.setId(context.longValue("ListPrivacyNumberProvidersResponse.Providers["+ i +"].Id"));
			provider.setProviderId(context.stringValue("ListPrivacyNumberProvidersResponse.Providers["+ i +"].ProviderId"));
			provider.setProviderName(context.stringValue("ListPrivacyNumberProvidersResponse.Providers["+ i +"].ProviderName"));
			provider.setPrefix(context.stringValue("ListPrivacyNumberProvidersResponse.Providers["+ i +"].Prefix"));

			providers.add(provider);
		}
		listPrivacyNumberProvidersResponse.setProviders(providers);
	 
	 	return listPrivacyNumberProvidersResponse;
	}
}