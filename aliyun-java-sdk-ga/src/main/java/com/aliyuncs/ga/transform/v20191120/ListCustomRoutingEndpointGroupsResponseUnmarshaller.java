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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListCustomRoutingEndpointGroupsResponse;
import com.aliyuncs.ga.model.v20191120.ListCustomRoutingEndpointGroupsResponse.EndpointGroupsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomRoutingEndpointGroupsResponseUnmarshaller {

	public static ListCustomRoutingEndpointGroupsResponse unmarshall(ListCustomRoutingEndpointGroupsResponse listCustomRoutingEndpointGroupsResponse, UnmarshallerContext _ctx) {
		
		listCustomRoutingEndpointGroupsResponse.setRequestId(_ctx.stringValue("ListCustomRoutingEndpointGroupsResponse.RequestId"));
		listCustomRoutingEndpointGroupsResponse.setTotalCount(_ctx.integerValue("ListCustomRoutingEndpointGroupsResponse.TotalCount"));
		listCustomRoutingEndpointGroupsResponse.setPageSize(_ctx.integerValue("ListCustomRoutingEndpointGroupsResponse.PageSize"));
		listCustomRoutingEndpointGroupsResponse.setPageNumber(_ctx.integerValue("ListCustomRoutingEndpointGroupsResponse.PageNumber"));

		List<EndpointGroupsItem> endpointGroups = new ArrayList<EndpointGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomRoutingEndpointGroupsResponse.EndpointGroups.Length"); i++) {
			EndpointGroupsItem endpointGroupsItem = new EndpointGroupsItem();
			endpointGroupsItem.setAcceleratorId(_ctx.stringValue("ListCustomRoutingEndpointGroupsResponse.EndpointGroups["+ i +"].AcceleratorId"));
			endpointGroupsItem.setListenerId(_ctx.stringValue("ListCustomRoutingEndpointGroupsResponse.EndpointGroups["+ i +"].ListenerId"));
			endpointGroupsItem.setEndpointGroupId(_ctx.stringValue("ListCustomRoutingEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupId"));
			endpointGroupsItem.setName(_ctx.stringValue("ListCustomRoutingEndpointGroupsResponse.EndpointGroups["+ i +"].Name"));
			endpointGroupsItem.setDescription(_ctx.stringValue("ListCustomRoutingEndpointGroupsResponse.EndpointGroups["+ i +"].Description"));
			endpointGroupsItem.setEndpointGroupRegion(_ctx.stringValue("ListCustomRoutingEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupRegion"));
			endpointGroupsItem.setState(_ctx.stringValue("ListCustomRoutingEndpointGroupsResponse.EndpointGroups["+ i +"].State"));

			List<String> endpointGroupIpList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListCustomRoutingEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupIpList.Length"); j++) {
				endpointGroupIpList.add(_ctx.stringValue("ListCustomRoutingEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupIpList["+ j +"]"));
			}
			endpointGroupsItem.setEndpointGroupIpList(endpointGroupIpList);

			List<String> endpointGroupUnconfirmedIpList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListCustomRoutingEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupUnconfirmedIpList.Length"); j++) {
				endpointGroupUnconfirmedIpList.add(_ctx.stringValue("ListCustomRoutingEndpointGroupsResponse.EndpointGroups["+ i +"].EndpointGroupUnconfirmedIpList["+ j +"]"));
			}
			endpointGroupsItem.setEndpointGroupUnconfirmedIpList(endpointGroupUnconfirmedIpList);

			endpointGroups.add(endpointGroupsItem);
		}
		listCustomRoutingEndpointGroupsResponse.setEndpointGroups(endpointGroups);
	 
	 	return listCustomRoutingEndpointGroupsResponse;
	}
}