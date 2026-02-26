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

import com.aliyuncs.ens.model.v20171110.DescribeNetworkAttributeResponse;
import com.aliyuncs.ens.model.v20171110.DescribeNetworkAttributeResponse.CloudResourceSetType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkAttributeResponseUnmarshaller {

	public static DescribeNetworkAttributeResponse unmarshall(DescribeNetworkAttributeResponse describeNetworkAttributeResponse, UnmarshallerContext _ctx) {
		
		describeNetworkAttributeResponse.setRequestId(_ctx.stringValue("DescribeNetworkAttributeResponse.RequestId"));
		describeNetworkAttributeResponse.setEnsRegionId(_ctx.stringValue("DescribeNetworkAttributeResponse.EnsRegionId"));
		describeNetworkAttributeResponse.setNetworkId(_ctx.stringValue("DescribeNetworkAttributeResponse.NetworkId"));
		describeNetworkAttributeResponse.setNetworkName(_ctx.stringValue("DescribeNetworkAttributeResponse.NetworkName"));
		describeNetworkAttributeResponse.setCidrBlock(_ctx.stringValue("DescribeNetworkAttributeResponse.CidrBlock"));
		describeNetworkAttributeResponse.setStatus(_ctx.stringValue("DescribeNetworkAttributeResponse.Status"));
		describeNetworkAttributeResponse.setDescription(_ctx.stringValue("DescribeNetworkAttributeResponse.Description"));
		describeNetworkAttributeResponse.setCreatedTime(_ctx.stringValue("DescribeNetworkAttributeResponse.CreatedTime"));
		describeNetworkAttributeResponse.setRouterTableId(_ctx.stringValue("DescribeNetworkAttributeResponse.RouterTableId"));
		describeNetworkAttributeResponse.setNetworkAclId(_ctx.stringValue("DescribeNetworkAttributeResponse.NetworkAclId"));
		describeNetworkAttributeResponse.setRouteTableId(_ctx.stringValue("DescribeNetworkAttributeResponse.RouteTableId"));
		describeNetworkAttributeResponse.setGatewayRouteTableId(_ctx.stringValue("DescribeNetworkAttributeResponse.GatewayRouteTableId"));

		List<String> vSwitchIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAttributeResponse.VSwitchIds.Length"); i++) {
			vSwitchIds.add(_ctx.stringValue("DescribeNetworkAttributeResponse.VSwitchIds["+ i +"]"));
		}
		describeNetworkAttributeResponse.setVSwitchIds(vSwitchIds);

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAttributeResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("DescribeNetworkAttributeResponse.InstanceIds["+ i +"]"));
		}
		describeNetworkAttributeResponse.setInstanceIds(instanceIds);

		List<String> routeTableIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAttributeResponse.RouteTableIds.Length"); i++) {
			routeTableIds.add(_ctx.stringValue("DescribeNetworkAttributeResponse.RouteTableIds["+ i +"]"));
		}
		describeNetworkAttributeResponse.setRouteTableIds(routeTableIds);

		List<String> networkInterfaceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAttributeResponse.NetworkInterfaceIds.Length"); i++) {
			networkInterfaceIds.add(_ctx.stringValue("DescribeNetworkAttributeResponse.NetworkInterfaceIds["+ i +"]"));
		}
		describeNetworkAttributeResponse.setNetworkInterfaceIds(networkInterfaceIds);

		List<String> loadBalancerIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAttributeResponse.LoadBalancerIds.Length"); i++) {
			loadBalancerIds.add(_ctx.stringValue("DescribeNetworkAttributeResponse.LoadBalancerIds["+ i +"]"));
		}
		describeNetworkAttributeResponse.setLoadBalancerIds(loadBalancerIds);

		List<String> natGatewayIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAttributeResponse.NatGatewayIds.Length"); i++) {
			natGatewayIds.add(_ctx.stringValue("DescribeNetworkAttributeResponse.NatGatewayIds["+ i +"]"));
		}
		describeNetworkAttributeResponse.setNatGatewayIds(natGatewayIds);

		List<String> haVipIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAttributeResponse.HaVipIds.Length"); i++) {
			haVipIds.add(_ctx.stringValue("DescribeNetworkAttributeResponse.HaVipIds["+ i +"]"));
		}
		describeNetworkAttributeResponse.setHaVipIds(haVipIds);

		List<CloudResourceSetType> cloudResources = new ArrayList<CloudResourceSetType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAttributeResponse.CloudResources.Length"); i++) {
			CloudResourceSetType cloudResourceSetType = new CloudResourceSetType();
			cloudResourceSetType.setResourceCount(_ctx.integerValue("DescribeNetworkAttributeResponse.CloudResources["+ i +"].ResourceCount"));
			cloudResourceSetType.setResourceType(_ctx.stringValue("DescribeNetworkAttributeResponse.CloudResources["+ i +"].ResourceType"));

			cloudResources.add(cloudResourceSetType);
		}
		describeNetworkAttributeResponse.setCloudResources(cloudResources);
	 
	 	return describeNetworkAttributeResponse;
	}
}