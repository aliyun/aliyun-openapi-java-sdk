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

import com.aliyuncs.ga.model.v20191120.ListCustomRoutingPortMappingsResponse;
import com.aliyuncs.ga.model.v20191120.ListCustomRoutingPortMappingsResponse.PortMappingsItem;
import com.aliyuncs.ga.model.v20191120.ListCustomRoutingPortMappingsResponse.PortMappingsItem.DestinationSocketAddress;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomRoutingPortMappingsResponseUnmarshaller {

	public static ListCustomRoutingPortMappingsResponse unmarshall(ListCustomRoutingPortMappingsResponse listCustomRoutingPortMappingsResponse, UnmarshallerContext _ctx) {
		
		listCustomRoutingPortMappingsResponse.setRequestId(_ctx.stringValue("ListCustomRoutingPortMappingsResponse.RequestId"));
		listCustomRoutingPortMappingsResponse.setTotalCount(_ctx.integerValue("ListCustomRoutingPortMappingsResponse.TotalCount"));
		listCustomRoutingPortMappingsResponse.setPageSize(_ctx.integerValue("ListCustomRoutingPortMappingsResponse.PageSize"));
		listCustomRoutingPortMappingsResponse.setPageNumber(_ctx.integerValue("ListCustomRoutingPortMappingsResponse.PageNumber"));

		List<PortMappingsItem> portMappings = new ArrayList<PortMappingsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomRoutingPortMappingsResponse.PortMappings.Length"); i++) {
			PortMappingsItem portMappingsItem = new PortMappingsItem();
			portMappingsItem.setAcceleratorId(_ctx.stringValue("ListCustomRoutingPortMappingsResponse.PortMappings["+ i +"].AcceleratorId"));
			portMappingsItem.setListenerId(_ctx.stringValue("ListCustomRoutingPortMappingsResponse.PortMappings["+ i +"].ListenerId"));
			portMappingsItem.setEndpointGroupId(_ctx.stringValue("ListCustomRoutingPortMappingsResponse.PortMappings["+ i +"].EndpointGroupId"));
			portMappingsItem.setEndpointId(_ctx.stringValue("ListCustomRoutingPortMappingsResponse.PortMappings["+ i +"].EndpointId"));
			portMappingsItem.setEndpointGroupRegion(_ctx.stringValue("ListCustomRoutingPortMappingsResponse.PortMappings["+ i +"].EndpointGroupRegion"));
			portMappingsItem.setVswitch(_ctx.stringValue("ListCustomRoutingPortMappingsResponse.PortMappings["+ i +"].Vswitch"));
			portMappingsItem.setAcceleratorPort(_ctx.integerValue("ListCustomRoutingPortMappingsResponse.PortMappings["+ i +"].AcceleratorPort"));
			portMappingsItem.setDestinationTrafficState(_ctx.stringValue("ListCustomRoutingPortMappingsResponse.PortMappings["+ i +"].DestinationTrafficState"));

			List<String> protocols = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListCustomRoutingPortMappingsResponse.PortMappings["+ i +"].Protocols.Length"); j++) {
				protocols.add(_ctx.stringValue("ListCustomRoutingPortMappingsResponse.PortMappings["+ i +"].Protocols["+ j +"]"));
			}
			portMappingsItem.setProtocols(protocols);

			DestinationSocketAddress destinationSocketAddress = new DestinationSocketAddress();
			destinationSocketAddress.setIpAddress(_ctx.stringValue("ListCustomRoutingPortMappingsResponse.PortMappings["+ i +"].DestinationSocketAddress.IpAddress"));
			destinationSocketAddress.setPort(_ctx.integerValue("ListCustomRoutingPortMappingsResponse.PortMappings["+ i +"].DestinationSocketAddress.Port"));
			portMappingsItem.setDestinationSocketAddress(destinationSocketAddress);

			portMappings.add(portMappingsItem);
		}
		listCustomRoutingPortMappingsResponse.setPortMappings(portMappings);
	 
	 	return listCustomRoutingPortMappingsResponse;
	}
}