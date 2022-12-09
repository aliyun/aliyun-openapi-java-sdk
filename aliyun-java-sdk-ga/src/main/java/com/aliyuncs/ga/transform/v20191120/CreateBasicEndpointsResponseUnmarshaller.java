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

import com.aliyuncs.ga.model.v20191120.CreateBasicEndpointsResponse;
import com.aliyuncs.ga.model.v20191120.CreateBasicEndpointsResponse.EndpointsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBasicEndpointsResponseUnmarshaller {

	public static CreateBasicEndpointsResponse unmarshall(CreateBasicEndpointsResponse createBasicEndpointsResponse, UnmarshallerContext _ctx) {
		
		createBasicEndpointsResponse.setRequestId(_ctx.stringValue("CreateBasicEndpointsResponse.RequestId"));
		createBasicEndpointsResponse.setEndpointGroupId(_ctx.stringValue("CreateBasicEndpointsResponse.EndpointGroupId"));

		List<EndpointsItem> endpoints = new ArrayList<EndpointsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateBasicEndpointsResponse.Endpoints.Length"); i++) {
			EndpointsItem endpointsItem = new EndpointsItem();
			endpointsItem.setEndpointId(_ctx.stringValue("CreateBasicEndpointsResponse.Endpoints["+ i +"].EndpointId"));
			endpointsItem.setEndpointType(_ctx.stringValue("CreateBasicEndpointsResponse.Endpoints["+ i +"].EndpointType"));
			endpointsItem.setEndpointAddress(_ctx.stringValue("CreateBasicEndpointsResponse.Endpoints["+ i +"].EndpointAddress"));
			endpointsItem.setEndpointSubAddress(_ctx.stringValue("CreateBasicEndpointsResponse.Endpoints["+ i +"].EndpointSubAddress"));

			endpoints.add(endpointsItem);
		}
		createBasicEndpointsResponse.setEndpoints(endpoints);
	 
	 	return createBasicEndpointsResponse;
	}
}