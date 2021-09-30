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

import com.aliyuncs.vpc.model.v20160428.GetVpcGatewayEndpointAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVpcGatewayEndpointAttributeResponseUnmarshaller {

	public static GetVpcGatewayEndpointAttributeResponse unmarshall(GetVpcGatewayEndpointAttributeResponse getVpcGatewayEndpointAttributeResponse, UnmarshallerContext _ctx) {
		
		getVpcGatewayEndpointAttributeResponse.setRequestId(_ctx.stringValue("GetVpcGatewayEndpointAttributeResponse.RequestId"));
		getVpcGatewayEndpointAttributeResponse.setEndpointId(_ctx.stringValue("GetVpcGatewayEndpointAttributeResponse.EndpointId"));
		getVpcGatewayEndpointAttributeResponse.setEndpointName(_ctx.stringValue("GetVpcGatewayEndpointAttributeResponse.EndpointName"));
		getVpcGatewayEndpointAttributeResponse.setEndpointDescription(_ctx.stringValue("GetVpcGatewayEndpointAttributeResponse.EndpointDescription"));
		getVpcGatewayEndpointAttributeResponse.setServiceName(_ctx.stringValue("GetVpcGatewayEndpointAttributeResponse.ServiceName"));
		getVpcGatewayEndpointAttributeResponse.setVpcId(_ctx.stringValue("GetVpcGatewayEndpointAttributeResponse.VpcId"));
		getVpcGatewayEndpointAttributeResponse.setPolicyDocument(_ctx.stringValue("GetVpcGatewayEndpointAttributeResponse.PolicyDocument"));
		getVpcGatewayEndpointAttributeResponse.setCreationTime(_ctx.stringValue("GetVpcGatewayEndpointAttributeResponse.CreationTime"));
		getVpcGatewayEndpointAttributeResponse.setEndpointStatus(_ctx.stringValue("GetVpcGatewayEndpointAttributeResponse.EndpointStatus"));

		List<String> routeTables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetVpcGatewayEndpointAttributeResponse.RouteTables.Length"); i++) {
			routeTables.add(_ctx.stringValue("GetVpcGatewayEndpointAttributeResponse.RouteTables["+ i +"]"));
		}
		getVpcGatewayEndpointAttributeResponse.setRouteTables(routeTables);
	 
	 	return getVpcGatewayEndpointAttributeResponse;
	}
}