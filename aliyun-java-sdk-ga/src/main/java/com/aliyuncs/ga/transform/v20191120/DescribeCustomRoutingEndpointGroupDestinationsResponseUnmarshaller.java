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

import com.aliyuncs.ga.model.v20191120.DescribeCustomRoutingEndpointGroupDestinationsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomRoutingEndpointGroupDestinationsResponseUnmarshaller {

	public static DescribeCustomRoutingEndpointGroupDestinationsResponse unmarshall(DescribeCustomRoutingEndpointGroupDestinationsResponse describeCustomRoutingEndpointGroupDestinationsResponse, UnmarshallerContext _ctx) {
		
		describeCustomRoutingEndpointGroupDestinationsResponse.setRequestId(_ctx.stringValue("DescribeCustomRoutingEndpointGroupDestinationsResponse.RequestId"));
		describeCustomRoutingEndpointGroupDestinationsResponse.setAcceleratorId(_ctx.stringValue("DescribeCustomRoutingEndpointGroupDestinationsResponse.AcceleratorId"));
		describeCustomRoutingEndpointGroupDestinationsResponse.setListenerId(_ctx.stringValue("DescribeCustomRoutingEndpointGroupDestinationsResponse.ListenerId"));
		describeCustomRoutingEndpointGroupDestinationsResponse.setEndpointGroupId(_ctx.stringValue("DescribeCustomRoutingEndpointGroupDestinationsResponse.EndpointGroupId"));
		describeCustomRoutingEndpointGroupDestinationsResponse.setDestinationId(_ctx.stringValue("DescribeCustomRoutingEndpointGroupDestinationsResponse.DestinationId"));
		describeCustomRoutingEndpointGroupDestinationsResponse.setFromPort(_ctx.integerValue("DescribeCustomRoutingEndpointGroupDestinationsResponse.FromPort"));
		describeCustomRoutingEndpointGroupDestinationsResponse.setToPort(_ctx.integerValue("DescribeCustomRoutingEndpointGroupDestinationsResponse.ToPort"));

		List<String> protocols = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomRoutingEndpointGroupDestinationsResponse.Protocols.Length"); i++) {
			protocols.add(_ctx.stringValue("DescribeCustomRoutingEndpointGroupDestinationsResponse.Protocols["+ i +"]"));
		}
		describeCustomRoutingEndpointGroupDestinationsResponse.setProtocols(protocols);
	 
	 	return describeCustomRoutingEndpointGroupDestinationsResponse;
	}
}