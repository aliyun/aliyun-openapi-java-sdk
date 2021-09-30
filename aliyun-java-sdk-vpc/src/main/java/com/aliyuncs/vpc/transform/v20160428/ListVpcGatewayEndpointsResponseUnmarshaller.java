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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.ListVpcGatewayEndpointsResponse;
import com.aliyuncs.vpc.model.v20160428.ListVpcGatewayEndpointsResponse.Endpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcGatewayEndpointsResponseUnmarshaller {

	public static ListVpcGatewayEndpointsResponse unmarshall(ListVpcGatewayEndpointsResponse listVpcGatewayEndpointsResponse, UnmarshallerContext _ctx) {
		
		listVpcGatewayEndpointsResponse.setRequestId(_ctx.stringValue("ListVpcGatewayEndpointsResponse.RequestId"));
		listVpcGatewayEndpointsResponse.setNextToken(_ctx.stringValue("ListVpcGatewayEndpointsResponse.NextToken"));
		listVpcGatewayEndpointsResponse.setTotalCount(_ctx.longValue("ListVpcGatewayEndpointsResponse.TotalCount"));
		listVpcGatewayEndpointsResponse.setMaxResults(_ctx.longValue("ListVpcGatewayEndpointsResponse.MaxResults"));

		List<Endpoint> endpoints = new ArrayList<Endpoint>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcGatewayEndpointsResponse.Endpoints.Length"); i++) {
			Endpoint endpoint = new Endpoint();
			endpoint.setEndpointId(_ctx.stringValue("ListVpcGatewayEndpointsResponse.Endpoints["+ i +"].EndpointId"));
			endpoint.setEndpointName(_ctx.stringValue("ListVpcGatewayEndpointsResponse.Endpoints["+ i +"].EndpointName"));
			endpoint.setEndpointDescription(_ctx.stringValue("ListVpcGatewayEndpointsResponse.Endpoints["+ i +"].EndpointDescription"));
			endpoint.setServiceName(_ctx.stringValue("ListVpcGatewayEndpointsResponse.Endpoints["+ i +"].ServiceName"));
			endpoint.setVpcId(_ctx.stringValue("ListVpcGatewayEndpointsResponse.Endpoints["+ i +"].VpcId"));
			endpoint.setPolicyDocument(_ctx.stringValue("ListVpcGatewayEndpointsResponse.Endpoints["+ i +"].PolicyDocument"));
			endpoint.setCreationTime(_ctx.stringValue("ListVpcGatewayEndpointsResponse.Endpoints["+ i +"].CreationTime"));
			endpoint.setEndpointStatus(_ctx.stringValue("ListVpcGatewayEndpointsResponse.Endpoints["+ i +"].EndpointStatus"));

			List<String> associatedRouteTables = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListVpcGatewayEndpointsResponse.Endpoints["+ i +"].AssociatedRouteTables.Length"); j++) {
				associatedRouteTables.add(_ctx.stringValue("ListVpcGatewayEndpointsResponse.Endpoints["+ i +"].AssociatedRouteTables["+ j +"]"));
			}
			endpoint.setAssociatedRouteTables(associatedRouteTables);

			endpoints.add(endpoint);
		}
		listVpcGatewayEndpointsResponse.setEndpoints(endpoints);
	 
	 	return listVpcGatewayEndpointsResponse;
	}
}