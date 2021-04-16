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

package com.aliyuncs.privatelink.transform.v20200415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointsResponse;
import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointsResponse.Endpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcEndpointsResponseUnmarshaller {

	public static ListVpcEndpointsResponse unmarshall(ListVpcEndpointsResponse listVpcEndpointsResponse, UnmarshallerContext _ctx) {
		
		listVpcEndpointsResponse.setRequestId(_ctx.stringValue("ListVpcEndpointsResponse.RequestId"));
		listVpcEndpointsResponse.setNextToken(_ctx.stringValue("ListVpcEndpointsResponse.NextToken"));
		listVpcEndpointsResponse.setMaxResults(_ctx.stringValue("ListVpcEndpointsResponse.MaxResults"));

		List<Endpoint> endpoints = new ArrayList<Endpoint>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcEndpointsResponse.Endpoints.Length"); i++) {
			Endpoint endpoint = new Endpoint();
			endpoint.setEndpointDomain(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].EndpointDomain"));
			endpoint.setResourceOwner(_ctx.booleanValue("ListVpcEndpointsResponse.Endpoints["+ i +"].ResourceOwner"));
			endpoint.setCreateTime(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].CreateTime"));
			endpoint.setEndpointBusinessStatus(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].EndpointBusinessStatus"));
			endpoint.setEndpointDescription(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].EndpointDescription"));
			endpoint.setServiceId(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].ServiceId"));
			endpoint.setEndpointStatus(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].EndpointStatus"));
			endpoint.setEndpointName(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].EndpointName"));
			endpoint.setVpcId(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].VpcId"));
			endpoint.setServiceName(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].ServiceName"));
			endpoint.setEndpointId(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].EndpointId"));
			endpoint.setBandwidth(_ctx.longValue("ListVpcEndpointsResponse.Endpoints["+ i +"].Bandwidth"));
			endpoint.setRegionId(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].RegionId"));
			endpoint.setConnectionStatus(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].ConnectionStatus"));
			endpoint.setZoneAffinityEnabled(_ctx.booleanValue("ListVpcEndpointsResponse.Endpoints["+ i +"].ZoneAffinityEnabled"));

			endpoints.add(endpoint);
		}
		listVpcEndpointsResponse.setEndpoints(endpoints);
	 
	 	return listVpcEndpointsResponse;
	}
}