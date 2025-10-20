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

import com.aliyuncs.eiam.model.v20211201.ListIdentityProvidersForNetworkAccessEndpointResponse;
import com.aliyuncs.eiam.model.v20211201.ListIdentityProvidersForNetworkAccessEndpointResponse.IdentityProviderForNetworkAccessEndpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIdentityProvidersForNetworkAccessEndpointResponseUnmarshaller {

	public static ListIdentityProvidersForNetworkAccessEndpointResponse unmarshall(ListIdentityProvidersForNetworkAccessEndpointResponse listIdentityProvidersForNetworkAccessEndpointResponse, UnmarshallerContext _ctx) {
		
		listIdentityProvidersForNetworkAccessEndpointResponse.setRequestId(_ctx.stringValue("ListIdentityProvidersForNetworkAccessEndpointResponse.RequestId"));
		listIdentityProvidersForNetworkAccessEndpointResponse.setTotalCount(_ctx.longValue("ListIdentityProvidersForNetworkAccessEndpointResponse.TotalCount"));
		listIdentityProvidersForNetworkAccessEndpointResponse.setNextToken(_ctx.stringValue("ListIdentityProvidersForNetworkAccessEndpointResponse.NextToken"));

		List<IdentityProviderForNetworkAccessEndpoint> identityProvidersForNetworkAccessEndpoint = new ArrayList<IdentityProviderForNetworkAccessEndpoint>();
		for (int i = 0; i < _ctx.lengthValue("ListIdentityProvidersForNetworkAccessEndpointResponse.IdentityProvidersForNetworkAccessEndpoint.Length"); i++) {
			IdentityProviderForNetworkAccessEndpoint identityProviderForNetworkAccessEndpoint = new IdentityProviderForNetworkAccessEndpoint();
			identityProviderForNetworkAccessEndpoint.setInstanceId(_ctx.stringValue("ListIdentityProvidersForNetworkAccessEndpointResponse.IdentityProvidersForNetworkAccessEndpoint["+ i +"].InstanceId"));
			identityProviderForNetworkAccessEndpoint.setIdentityProviderId(_ctx.stringValue("ListIdentityProvidersForNetworkAccessEndpointResponse.IdentityProvidersForNetworkAccessEndpoint["+ i +"].IdentityProviderId"));
			identityProviderForNetworkAccessEndpoint.setIdentityProviderName(_ctx.stringValue("ListIdentityProvidersForNetworkAccessEndpointResponse.IdentityProvidersForNetworkAccessEndpoint["+ i +"].IdentityProviderName"));

			identityProvidersForNetworkAccessEndpoint.add(identityProviderForNetworkAccessEndpoint);
		}
		listIdentityProvidersForNetworkAccessEndpointResponse.setIdentityProvidersForNetworkAccessEndpoint(identityProvidersForNetworkAccessEndpoint);
	 
	 	return listIdentityProvidersForNetworkAccessEndpointResponse;
	}
}