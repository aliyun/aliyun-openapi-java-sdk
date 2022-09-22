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

import com.aliyuncs.ga.model.v20191120.ListCustomRoutingEndpointsResponse;
import com.aliyuncs.ga.model.v20191120.ListCustomRoutingEndpointsResponse.EndpointsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomRoutingEndpointsResponseUnmarshaller {

	public static ListCustomRoutingEndpointsResponse unmarshall(ListCustomRoutingEndpointsResponse listCustomRoutingEndpointsResponse, UnmarshallerContext _ctx) {
		
		listCustomRoutingEndpointsResponse.setRequestId(_ctx.stringValue("ListCustomRoutingEndpointsResponse.RequestId"));
		listCustomRoutingEndpointsResponse.setTotalCount(_ctx.integerValue("ListCustomRoutingEndpointsResponse.TotalCount"));
		listCustomRoutingEndpointsResponse.setPageSize(_ctx.integerValue("ListCustomRoutingEndpointsResponse.PageSize"));
		listCustomRoutingEndpointsResponse.setPageNumber(_ctx.integerValue("ListCustomRoutingEndpointsResponse.PageNumber"));

		List<EndpointsItem> endpoints = new ArrayList<EndpointsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomRoutingEndpointsResponse.Endpoints.Length"); i++) {
			EndpointsItem endpointsItem = new EndpointsItem();
			endpointsItem.setAcceleratorId(_ctx.stringValue("ListCustomRoutingEndpointsResponse.Endpoints["+ i +"].AcceleratorId"));
			endpointsItem.setListenerId(_ctx.stringValue("ListCustomRoutingEndpointsResponse.Endpoints["+ i +"].ListenerId"));
			endpointsItem.setEndpointGroupId(_ctx.stringValue("ListCustomRoutingEndpointsResponse.Endpoints["+ i +"].EndpointGroupId"));
			endpointsItem.setEndpointId(_ctx.stringValue("ListCustomRoutingEndpointsResponse.Endpoints["+ i +"].EndpointId"));
			endpointsItem.setType(_ctx.stringValue("ListCustomRoutingEndpointsResponse.Endpoints["+ i +"].Type"));
			endpointsItem.setEndpoint(_ctx.stringValue("ListCustomRoutingEndpointsResponse.Endpoints["+ i +"].Endpoint"));
			endpointsItem.setTrafficToEndpointPolicy(_ctx.stringValue("ListCustomRoutingEndpointsResponse.Endpoints["+ i +"].TrafficToEndpointPolicy"));

			endpoints.add(endpointsItem);
		}
		listCustomRoutingEndpointsResponse.setEndpoints(endpoints);
	 
	 	return listCustomRoutingEndpointsResponse;
	}
}