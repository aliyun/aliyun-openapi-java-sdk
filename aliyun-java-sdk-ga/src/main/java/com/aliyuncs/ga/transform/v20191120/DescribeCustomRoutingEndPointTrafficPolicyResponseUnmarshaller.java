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

import com.aliyuncs.ga.model.v20191120.DescribeCustomRoutingEndPointTrafficPolicyResponse;
import com.aliyuncs.ga.model.v20191120.DescribeCustomRoutingEndPointTrafficPolicyResponse.PortRangesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomRoutingEndPointTrafficPolicyResponseUnmarshaller {

	public static DescribeCustomRoutingEndPointTrafficPolicyResponse unmarshall(DescribeCustomRoutingEndPointTrafficPolicyResponse describeCustomRoutingEndPointTrafficPolicyResponse, UnmarshallerContext _ctx) {
		
		describeCustomRoutingEndPointTrafficPolicyResponse.setRequestId(_ctx.stringValue("DescribeCustomRoutingEndPointTrafficPolicyResponse.RequestId"));
		describeCustomRoutingEndPointTrafficPolicyResponse.setAcceleratorId(_ctx.stringValue("DescribeCustomRoutingEndPointTrafficPolicyResponse.AcceleratorId"));
		describeCustomRoutingEndPointTrafficPolicyResponse.setListenerId(_ctx.stringValue("DescribeCustomRoutingEndPointTrafficPolicyResponse.ListenerId"));
		describeCustomRoutingEndPointTrafficPolicyResponse.setEndpointGroupId(_ctx.stringValue("DescribeCustomRoutingEndPointTrafficPolicyResponse.EndpointGroupId"));
		describeCustomRoutingEndPointTrafficPolicyResponse.setEndpointId(_ctx.stringValue("DescribeCustomRoutingEndPointTrafficPolicyResponse.EndpointId"));
		describeCustomRoutingEndPointTrafficPolicyResponse.setEndpoint(_ctx.stringValue("DescribeCustomRoutingEndPointTrafficPolicyResponse.Endpoint"));
		describeCustomRoutingEndPointTrafficPolicyResponse.setPolicyId(_ctx.stringValue("DescribeCustomRoutingEndPointTrafficPolicyResponse.PolicyId"));
		describeCustomRoutingEndPointTrafficPolicyResponse.setAddress(_ctx.stringValue("DescribeCustomRoutingEndPointTrafficPolicyResponse.Address"));
		describeCustomRoutingEndPointTrafficPolicyResponse.setState(_ctx.stringValue("DescribeCustomRoutingEndPointTrafficPolicyResponse.State"));

		List<PortRangesItem> portRanges = new ArrayList<PortRangesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomRoutingEndPointTrafficPolicyResponse.PortRanges.Length"); i++) {
			PortRangesItem portRangesItem = new PortRangesItem();
			portRangesItem.setFromPort(_ctx.integerValue("DescribeCustomRoutingEndPointTrafficPolicyResponse.PortRanges["+ i +"].FromPort"));
			portRangesItem.setToPort(_ctx.integerValue("DescribeCustomRoutingEndPointTrafficPolicyResponse.PortRanges["+ i +"].ToPort"));

			portRanges.add(portRangesItem);
		}
		describeCustomRoutingEndPointTrafficPolicyResponse.setPortRanges(portRanges);
	 
	 	return describeCustomRoutingEndPointTrafficPolicyResponse;
	}
}