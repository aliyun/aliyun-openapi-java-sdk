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

import com.aliyuncs.ga.model.v20191120.DescribeCustomRoutingEndpointResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomRoutingEndpointResponseUnmarshaller {

	public static DescribeCustomRoutingEndpointResponse unmarshall(DescribeCustomRoutingEndpointResponse describeCustomRoutingEndpointResponse, UnmarshallerContext _ctx) {
		
		describeCustomRoutingEndpointResponse.setRequestId(_ctx.stringValue("DescribeCustomRoutingEndpointResponse.RequestId"));
		describeCustomRoutingEndpointResponse.setAcceleratorId(_ctx.stringValue("DescribeCustomRoutingEndpointResponse.AcceleratorId"));
		describeCustomRoutingEndpointResponse.setListenerId(_ctx.stringValue("DescribeCustomRoutingEndpointResponse.ListenerId"));
		describeCustomRoutingEndpointResponse.setEndpointGroupId(_ctx.stringValue("DescribeCustomRoutingEndpointResponse.EndpointGroupId"));
		describeCustomRoutingEndpointResponse.setEndpointId(_ctx.stringValue("DescribeCustomRoutingEndpointResponse.EndpointId"));
		describeCustomRoutingEndpointResponse.setType(_ctx.stringValue("DescribeCustomRoutingEndpointResponse.Type"));
		describeCustomRoutingEndpointResponse.setEndpoint(_ctx.stringValue("DescribeCustomRoutingEndpointResponse.Endpoint"));
		describeCustomRoutingEndpointResponse.setTrafficToEndpointPolicy(_ctx.stringValue("DescribeCustomRoutingEndpointResponse.TrafficToEndpointPolicy"));
		describeCustomRoutingEndpointResponse.setState(_ctx.stringValue("DescribeCustomRoutingEndpointResponse.State"));
	 
	 	return describeCustomRoutingEndpointResponse;
	}
}