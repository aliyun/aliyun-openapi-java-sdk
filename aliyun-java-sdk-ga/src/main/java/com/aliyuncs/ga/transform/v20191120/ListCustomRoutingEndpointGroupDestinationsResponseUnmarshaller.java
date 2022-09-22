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

import com.aliyuncs.ga.model.v20191120.ListCustomRoutingEndpointGroupDestinationsResponse;
import com.aliyuncs.ga.model.v20191120.ListCustomRoutingEndpointGroupDestinationsResponse.Endpoints;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomRoutingEndpointGroupDestinationsResponseUnmarshaller {

	public static ListCustomRoutingEndpointGroupDestinationsResponse unmarshall(ListCustomRoutingEndpointGroupDestinationsResponse listCustomRoutingEndpointGroupDestinationsResponse, UnmarshallerContext _ctx) {
		
		listCustomRoutingEndpointGroupDestinationsResponse.setRequestId(_ctx.stringValue("ListCustomRoutingEndpointGroupDestinationsResponse.RequestId"));
		listCustomRoutingEndpointGroupDestinationsResponse.setTotalCount(_ctx.integerValue("ListCustomRoutingEndpointGroupDestinationsResponse.TotalCount"));
		listCustomRoutingEndpointGroupDestinationsResponse.setPageSize(_ctx.integerValue("ListCustomRoutingEndpointGroupDestinationsResponse.PageSize"));
		listCustomRoutingEndpointGroupDestinationsResponse.setPageNumber(_ctx.integerValue("ListCustomRoutingEndpointGroupDestinationsResponse.PageNumber"));

		List<Endpoints> destinations = new ArrayList<Endpoints>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomRoutingEndpointGroupDestinationsResponse.Destinations.Length"); i++) {
			Endpoints endpoints = new Endpoints();
			endpoints.setAcceleratorId(_ctx.stringValue("ListCustomRoutingEndpointGroupDestinationsResponse.Destinations["+ i +"].AcceleratorId"));
			endpoints.setListenerId(_ctx.stringValue("ListCustomRoutingEndpointGroupDestinationsResponse.Destinations["+ i +"].ListenerId"));
			endpoints.setEndpointGroupId(_ctx.stringValue("ListCustomRoutingEndpointGroupDestinationsResponse.Destinations["+ i +"].EndpointGroupId"));
			endpoints.setDestinationId(_ctx.stringValue("ListCustomRoutingEndpointGroupDestinationsResponse.Destinations["+ i +"].DestinationId"));
			endpoints.setFromPort(_ctx.integerValue("ListCustomRoutingEndpointGroupDestinationsResponse.Destinations["+ i +"].FromPort"));
			endpoints.setToPort(_ctx.integerValue("ListCustomRoutingEndpointGroupDestinationsResponse.Destinations["+ i +"].ToPort"));

			List<String> protocols = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListCustomRoutingEndpointGroupDestinationsResponse.Destinations["+ i +"].Protocols.Length"); j++) {
				protocols.add(_ctx.stringValue("ListCustomRoutingEndpointGroupDestinationsResponse.Destinations["+ i +"].Protocols["+ j +"]"));
			}
			endpoints.setProtocols(protocols);

			destinations.add(endpoints);
		}
		listCustomRoutingEndpointGroupDestinationsResponse.setDestinations(destinations);
	 
	 	return listCustomRoutingEndpointGroupDestinationsResponse;
	}
}