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

package com.aliyuncs.ledgerdb.transform.v20191122;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ledgerdb.model.v20191122.ListVpcEndpointsResponse;
import com.aliyuncs.ledgerdb.model.v20191122.ListVpcEndpointsResponse.VpcEndpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcEndpointsResponseUnmarshaller {

	public static ListVpcEndpointsResponse unmarshall(ListVpcEndpointsResponse listVpcEndpointsResponse, UnmarshallerContext _ctx) {
		
		listVpcEndpointsResponse.setRequestId(_ctx.stringValue("ListVpcEndpointsResponse.RequestId"));
		listVpcEndpointsResponse.setNextToken(_ctx.stringValue("ListVpcEndpointsResponse.NextToken"));
		listVpcEndpointsResponse.setMaxResults(_ctx.integerValue("ListVpcEndpointsResponse.MaxResults"));

		List<VpcEndpoint> vpcEndpoints = new ArrayList<VpcEndpoint>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcEndpointsResponse.VpcEndpoints.Length"); i++) {
			VpcEndpoint vpcEndpoint = new VpcEndpoint();
			vpcEndpoint.setVpcEndpointId(_ctx.stringValue("ListVpcEndpointsResponse.VpcEndpoints["+ i +"].VpcEndpointId"));
			vpcEndpoint.setLedgerId(_ctx.stringValue("ListVpcEndpointsResponse.VpcEndpoints["+ i +"].LedgerId"));
			vpcEndpoint.setMemberId(_ctx.stringValue("ListVpcEndpointsResponse.VpcEndpoints["+ i +"].MemberId"));
			vpcEndpoint.setRegionId(_ctx.stringValue("ListVpcEndpointsResponse.VpcEndpoints["+ i +"].RegionId"));
			vpcEndpoint.setVpcId(_ctx.stringValue("ListVpcEndpointsResponse.VpcEndpoints["+ i +"].VpcId"));
			vpcEndpoint.setVSwitchId(_ctx.stringValue("ListVpcEndpointsResponse.VpcEndpoints["+ i +"].VSwitchId"));
			vpcEndpoint.setAddress(_ctx.stringValue("ListVpcEndpointsResponse.VpcEndpoints["+ i +"].Address"));
			vpcEndpoint.setCreateTime(_ctx.longValue("ListVpcEndpointsResponse.VpcEndpoints["+ i +"].CreateTime"));
			vpcEndpoint.setStatus(_ctx.stringValue("ListVpcEndpointsResponse.VpcEndpoints["+ i +"].Status"));

			vpcEndpoints.add(vpcEndpoint);
		}
		listVpcEndpointsResponse.setVpcEndpoints(vpcEndpoints);
	 
	 	return listVpcEndpointsResponse;
	}
}