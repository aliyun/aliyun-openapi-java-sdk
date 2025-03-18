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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeVSwitchAttributesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVSwitchAttributesResponseUnmarshaller {

	public static DescribeVSwitchAttributesResponse unmarshall(DescribeVSwitchAttributesResponse describeVSwitchAttributesResponse, UnmarshallerContext _ctx) {
		
		describeVSwitchAttributesResponse.setRequestId(_ctx.stringValue("DescribeVSwitchAttributesResponse.RequestId"));
		describeVSwitchAttributesResponse.setEnsRegionId(_ctx.stringValue("DescribeVSwitchAttributesResponse.EnsRegionId"));
		describeVSwitchAttributesResponse.setNetworkId(_ctx.stringValue("DescribeVSwitchAttributesResponse.NetworkId"));
		describeVSwitchAttributesResponse.setVSwitchName(_ctx.stringValue("DescribeVSwitchAttributesResponse.VSwitchName"));
		describeVSwitchAttributesResponse.setCidrBlock(_ctx.stringValue("DescribeVSwitchAttributesResponse.CidrBlock"));
		describeVSwitchAttributesResponse.setStatus(_ctx.stringValue("DescribeVSwitchAttributesResponse.Status"));
		describeVSwitchAttributesResponse.setDescription(_ctx.stringValue("DescribeVSwitchAttributesResponse.Description"));
		describeVSwitchAttributesResponse.setCreatedTime(_ctx.stringValue("DescribeVSwitchAttributesResponse.CreatedTime"));
		describeVSwitchAttributesResponse.setVSwitchId(_ctx.stringValue("DescribeVSwitchAttributesResponse.VSwitchId"));
		describeVSwitchAttributesResponse.setAvailableIpAddressCount(_ctx.longValue("DescribeVSwitchAttributesResponse.AvailableIpAddressCount"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchAttributesResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("DescribeVSwitchAttributesResponse.InstanceIds["+ i +"]"));
		}
		describeVSwitchAttributesResponse.setInstanceIds(instanceIds);

		List<String> networkInterfaceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchAttributesResponse.NetworkInterfaceIds.Length"); i++) {
			networkInterfaceIds.add(_ctx.stringValue("DescribeVSwitchAttributesResponse.NetworkInterfaceIds["+ i +"]"));
		}
		describeVSwitchAttributesResponse.setNetworkInterfaceIds(networkInterfaceIds);

		List<String> loadBalancerIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchAttributesResponse.LoadBalancerIds.Length"); i++) {
			loadBalancerIds.add(_ctx.stringValue("DescribeVSwitchAttributesResponse.LoadBalancerIds["+ i +"]"));
		}
		describeVSwitchAttributesResponse.setLoadBalancerIds(loadBalancerIds);

		List<String> natGatewayIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchAttributesResponse.NatGatewayIds.Length"); i++) {
			natGatewayIds.add(_ctx.stringValue("DescribeVSwitchAttributesResponse.NatGatewayIds["+ i +"]"));
		}
		describeVSwitchAttributesResponse.setNatGatewayIds(natGatewayIds);

		List<String> haVipIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchAttributesResponse.HaVipIds.Length"); i++) {
			haVipIds.add(_ctx.stringValue("DescribeVSwitchAttributesResponse.HaVipIds["+ i +"]"));
		}
		describeVSwitchAttributesResponse.setHaVipIds(haVipIds);
	 
	 	return describeVSwitchAttributesResponse;
	}
}