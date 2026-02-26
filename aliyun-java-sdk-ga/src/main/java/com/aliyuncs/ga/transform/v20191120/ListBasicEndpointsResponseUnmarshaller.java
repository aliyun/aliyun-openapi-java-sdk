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

import com.aliyuncs.ga.model.v20191120.ListBasicEndpointsResponse;
import com.aliyuncs.ga.model.v20191120.ListBasicEndpointsResponse.EndpointsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBasicEndpointsResponseUnmarshaller {

	public static ListBasicEndpointsResponse unmarshall(ListBasicEndpointsResponse listBasicEndpointsResponse, UnmarshallerContext _ctx) {
		
		listBasicEndpointsResponse.setRequestId(_ctx.stringValue("ListBasicEndpointsResponse.RequestId"));
		listBasicEndpointsResponse.setTotalCount(_ctx.stringValue("ListBasicEndpointsResponse.TotalCount"));
		listBasicEndpointsResponse.setNextToken(_ctx.stringValue("ListBasicEndpointsResponse.NextToken"));
		listBasicEndpointsResponse.setMaxResults(_ctx.stringValue("ListBasicEndpointsResponse.MaxResults"));

		List<EndpointsItem> endpoints = new ArrayList<EndpointsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBasicEndpointsResponse.Endpoints.Length"); i++) {
			EndpointsItem endpointsItem = new EndpointsItem();
			endpointsItem.setAcceleratorId(_ctx.stringValue("ListBasicEndpointsResponse.Endpoints["+ i +"].AcceleratorId"));
			endpointsItem.setEndpointGroupId(_ctx.stringValue("ListBasicEndpointsResponse.Endpoints["+ i +"].EndpointGroupId"));
			endpointsItem.setEndpointId(_ctx.stringValue("ListBasicEndpointsResponse.Endpoints["+ i +"].EndpointId"));
			endpointsItem.setName(_ctx.stringValue("ListBasicEndpointsResponse.Endpoints["+ i +"].Name"));
			endpointsItem.setEndpointType(_ctx.stringValue("ListBasicEndpointsResponse.Endpoints["+ i +"].EndpointType"));
			endpointsItem.setEndpointAddress(_ctx.stringValue("ListBasicEndpointsResponse.Endpoints["+ i +"].EndpointAddress"));
			endpointsItem.setEndpointSubAddress(_ctx.stringValue("ListBasicEndpointsResponse.Endpoints["+ i +"].EndpointSubAddress"));
			endpointsItem.setEndpointSubAddressType(_ctx.stringValue("ListBasicEndpointsResponse.Endpoints["+ i +"].EndpointSubAddressType"));
			endpointsItem.setEndpointZoneId(_ctx.stringValue("ListBasicEndpointsResponse.Endpoints["+ i +"].EndpointZoneId"));
			endpointsItem.setState(_ctx.stringValue("ListBasicEndpointsResponse.Endpoints["+ i +"].State"));

			endpoints.add(endpointsItem);
		}
		listBasicEndpointsResponse.setEndpoints(endpoints);
	 
	 	return listBasicEndpointsResponse;
	}
}