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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListTrunkProvidersResponse;
import com.aliyuncs.ccc.model.v20170705.ListTrunkProvidersResponse.TrunkProvider;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrunkProvidersResponseUnmarshaller {

	public static ListTrunkProvidersResponse unmarshall(ListTrunkProvidersResponse listTrunkProvidersResponse, UnmarshallerContext _ctx) {
		
		listTrunkProvidersResponse.setRequestId(_ctx.stringValue("ListTrunkProvidersResponse.RequestId"));
		listTrunkProvidersResponse.setSuccess(_ctx.booleanValue("ListTrunkProvidersResponse.Success"));
		listTrunkProvidersResponse.setCode(_ctx.stringValue("ListTrunkProvidersResponse.Code"));
		listTrunkProvidersResponse.setMessage(_ctx.stringValue("ListTrunkProvidersResponse.Message"));
		listTrunkProvidersResponse.setHttpStatusCode(_ctx.integerValue("ListTrunkProvidersResponse.HttpStatusCode"));

		List<TrunkProvider> trunkProviders = new ArrayList<TrunkProvider>();
		for (int i = 0; i < _ctx.lengthValue("ListTrunkProvidersResponse.TrunkProviders.Length"); i++) {
			TrunkProvider trunkProvider = new TrunkProvider();
			trunkProvider.setProviderName(_ctx.stringValue("ListTrunkProvidersResponse.TrunkProviders["+ i +"].ProviderName"));
			trunkProvider.setStatus(_ctx.stringValue("ListTrunkProvidersResponse.TrunkProviders["+ i +"].Status"));

			trunkProviders.add(trunkProvider);
		}
		listTrunkProvidersResponse.setTrunkProviders(trunkProviders);
	 
	 	return listTrunkProvidersResponse;
	}
}