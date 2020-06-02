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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListInstanceEndpointResponse;
import com.aliyuncs.cr.model.v20181201.ListInstanceEndpointResponse.EndpointsItem;
import com.aliyuncs.cr.model.v20181201.ListInstanceEndpointResponse.EndpointsItem.AclEntriesItem;
import com.aliyuncs.cr.model.v20181201.ListInstanceEndpointResponse.EndpointsItem.DomainsItem;
import com.aliyuncs.cr.model.v20181201.ListInstanceEndpointResponse.EndpointsItem.LinkedVpcsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceEndpointResponseUnmarshaller {

	public static ListInstanceEndpointResponse unmarshall(ListInstanceEndpointResponse listInstanceEndpointResponse, UnmarshallerContext _ctx) {
		
		listInstanceEndpointResponse.setRequestId(_ctx.stringValue("ListInstanceEndpointResponse.RequestId"));
		listInstanceEndpointResponse.setIsSuccess(_ctx.booleanValue("ListInstanceEndpointResponse.IsSuccess"));
		listInstanceEndpointResponse.setCode(_ctx.stringValue("ListInstanceEndpointResponse.Code"));

		List<EndpointsItem> endpoints = new ArrayList<EndpointsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceEndpointResponse.Endpoints.Length"); i++) {
			EndpointsItem endpointsItem = new EndpointsItem();
			endpointsItem.setEndpointType(_ctx.stringValue("ListInstanceEndpointResponse.Endpoints["+ i +"].EndpointType"));
			endpointsItem.setEnable(_ctx.booleanValue("ListInstanceEndpointResponse.Endpoints["+ i +"].Enable"));
			endpointsItem.setAclEnable(_ctx.booleanValue("ListInstanceEndpointResponse.Endpoints["+ i +"].AclEnable"));
			endpointsItem.setStatus(_ctx.stringValue("ListInstanceEndpointResponse.Endpoints["+ i +"].Status"));

			List<DomainsItem> domains = new ArrayList<DomainsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListInstanceEndpointResponse.Endpoints["+ i +"].Domains.Length"); j++) {
				DomainsItem domainsItem = new DomainsItem();
				domainsItem.setDomain(_ctx.stringValue("ListInstanceEndpointResponse.Endpoints["+ i +"].Domains["+ j +"].Domain"));
				domainsItem.setType(_ctx.stringValue("ListInstanceEndpointResponse.Endpoints["+ i +"].Domains["+ j +"].Type"));

				domains.add(domainsItem);
			}
			endpointsItem.setDomains(domains);

			List<LinkedVpcsItem> linkedVpcs = new ArrayList<LinkedVpcsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListInstanceEndpointResponse.Endpoints["+ i +"].LinkedVpcs.Length"); j++) {
				LinkedVpcsItem linkedVpcsItem = new LinkedVpcsItem();
				linkedVpcsItem.setVpcId(_ctx.stringValue("ListInstanceEndpointResponse.Endpoints["+ i +"].LinkedVpcs["+ j +"].VpcId"));

				linkedVpcs.add(linkedVpcsItem);
			}
			endpointsItem.setLinkedVpcs(linkedVpcs);

			List<AclEntriesItem> aclEntries = new ArrayList<AclEntriesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListInstanceEndpointResponse.Endpoints["+ i +"].AclEntries.Length"); j++) {
				AclEntriesItem aclEntriesItem = new AclEntriesItem();
				aclEntriesItem.setEntry(_ctx.stringValue("ListInstanceEndpointResponse.Endpoints["+ i +"].AclEntries["+ j +"].Entry"));

				aclEntries.add(aclEntriesItem);
			}
			endpointsItem.setAclEntries(aclEntries);

			endpoints.add(endpointsItem);
		}
		listInstanceEndpointResponse.setEndpoints(endpoints);
	 
	 	return listInstanceEndpointResponse;
	}
}