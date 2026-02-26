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
import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointsResponse.Endpoint.TagModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcEndpointsResponseUnmarshaller {

	public static ListVpcEndpointsResponse unmarshall(ListVpcEndpointsResponse listVpcEndpointsResponse, UnmarshallerContext _ctx) {
		
		listVpcEndpointsResponse.setRequestId(_ctx.stringValue("ListVpcEndpointsResponse.RequestId"));
		listVpcEndpointsResponse.setNextToken(_ctx.stringValue("ListVpcEndpointsResponse.NextToken"));
		listVpcEndpointsResponse.setMaxResults(_ctx.integerValue("ListVpcEndpointsResponse.MaxResults"));
		listVpcEndpointsResponse.setTotalCount(_ctx.integerValue("ListVpcEndpointsResponse.TotalCount"));

		List<Endpoint> endpoints = new ArrayList<Endpoint>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcEndpointsResponse.Endpoints.Length"); i++) {
			Endpoint endpoint = new Endpoint();
			endpoint.setVpcId(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].VpcId"));
			endpoint.setEndpointName(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].EndpointName"));
			endpoint.setEndpointType(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].EndpointType"));
			endpoint.setCreateTime(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].CreateTime"));
			endpoint.setServiceId(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].ServiceId"));
			endpoint.setZoneAffinityEnabled(_ctx.booleanValue("ListVpcEndpointsResponse.Endpoints["+ i +"].ZoneAffinityEnabled"));
			endpoint.setEndpointDomain(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].EndpointDomain"));
			endpoint.setEndpointStatus(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].EndpointStatus"));
			endpoint.setRegionId(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].RegionId"));
			endpoint.setResourceOwner(_ctx.booleanValue("ListVpcEndpointsResponse.Endpoints["+ i +"].ResourceOwner"));
			endpoint.setBandwidth(_ctx.longValue("ListVpcEndpointsResponse.Endpoints["+ i +"].Bandwidth"));
			endpoint.setConnectionStatus(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].ConnectionStatus"));
			endpoint.setEndpointDescription(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].EndpointDescription"));
			endpoint.setEndpointId(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].EndpointId"));
			endpoint.setEndpointBusinessStatus(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].EndpointBusinessStatus"));
			endpoint.setServiceName(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].ServiceName"));
			endpoint.setResourceGroupId(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].ResourceGroupId"));

			List<TagModel> tags = new ArrayList<TagModel>();
			for (int j = 0; j < _ctx.lengthValue("ListVpcEndpointsResponse.Endpoints["+ i +"].Tags.Length"); j++) {
				TagModel tagModel = new TagModel();
				tagModel.setKey(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].Tags["+ j +"].Key"));
				tagModel.setValue(_ctx.stringValue("ListVpcEndpointsResponse.Endpoints["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagModel);
			}
			endpoint.setTags(tags);

			endpoints.add(endpoint);
		}
		listVpcEndpointsResponse.setEndpoints(endpoints);
	 
	 	return listVpcEndpointsResponse;
	}
}