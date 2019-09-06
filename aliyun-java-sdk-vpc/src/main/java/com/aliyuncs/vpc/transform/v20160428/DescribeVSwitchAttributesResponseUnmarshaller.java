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

import com.aliyuncs.vpc.model.v20160428.DescribeVSwitchAttributesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVSwitchAttributesResponse.CloudResourceSetType;
import com.aliyuncs.vpc.model.v20160428.DescribeVSwitchAttributesResponse.RouteTable;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVSwitchAttributesResponseUnmarshaller {

	public static DescribeVSwitchAttributesResponse unmarshall(DescribeVSwitchAttributesResponse describeVSwitchAttributesResponse, UnmarshallerContext _ctx) {
		
		describeVSwitchAttributesResponse.setRequestId(_ctx.stringValue("DescribeVSwitchAttributesResponse.RequestId"));
		describeVSwitchAttributesResponse.setVSwitchId(_ctx.stringValue("DescribeVSwitchAttributesResponse.VSwitchId"));
		describeVSwitchAttributesResponse.setVpcId(_ctx.stringValue("DescribeVSwitchAttributesResponse.VpcId"));
		describeVSwitchAttributesResponse.setStatus(_ctx.stringValue("DescribeVSwitchAttributesResponse.Status"));
		describeVSwitchAttributesResponse.setCidrBlock(_ctx.stringValue("DescribeVSwitchAttributesResponse.CidrBlock"));
		describeVSwitchAttributesResponse.setIpv6CidrBlock(_ctx.stringValue("DescribeVSwitchAttributesResponse.Ipv6CidrBlock"));
		describeVSwitchAttributesResponse.setZoneId(_ctx.stringValue("DescribeVSwitchAttributesResponse.ZoneId"));
		describeVSwitchAttributesResponse.setAvailableIpAddressCount(_ctx.longValue("DescribeVSwitchAttributesResponse.AvailableIpAddressCount"));
		describeVSwitchAttributesResponse.setDescription(_ctx.stringValue("DescribeVSwitchAttributesResponse.Description"));
		describeVSwitchAttributesResponse.setVSwitchName(_ctx.stringValue("DescribeVSwitchAttributesResponse.VSwitchName"));
		describeVSwitchAttributesResponse.setCreationTime(_ctx.stringValue("DescribeVSwitchAttributesResponse.CreationTime"));
		describeVSwitchAttributesResponse.setIsDefault(_ctx.booleanValue("DescribeVSwitchAttributesResponse.IsDefault"));
		describeVSwitchAttributesResponse.setResourceGroupId(_ctx.stringValue("DescribeVSwitchAttributesResponse.ResourceGroupId"));
		describeVSwitchAttributesResponse.setNetworkAclId(_ctx.stringValue("DescribeVSwitchAttributesResponse.NetworkAclId"));

		RouteTable routeTable = new RouteTable();
		routeTable.setRouteTableId(_ctx.stringValue("DescribeVSwitchAttributesResponse.RouteTable.RouteTableId"));
		routeTable.setRouteTableType(_ctx.stringValue("DescribeVSwitchAttributesResponse.RouteTable.RouteTableType"));
		describeVSwitchAttributesResponse.setRouteTable(routeTable);

		List<CloudResourceSetType> cloudResources = new ArrayList<CloudResourceSetType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchAttributesResponse.CloudResources.Length"); i++) {
			CloudResourceSetType cloudResourceSetType = new CloudResourceSetType();
			cloudResourceSetType.setResourceType(_ctx.stringValue("DescribeVSwitchAttributesResponse.CloudResources["+ i +"].ResourceType"));
			cloudResourceSetType.setResourceCount(_ctx.integerValue("DescribeVSwitchAttributesResponse.CloudResources["+ i +"].ResourceCount"));

			cloudResources.add(cloudResourceSetType);
		}
		describeVSwitchAttributesResponse.setCloudResources(cloudResources);
	 
	 	return describeVSwitchAttributesResponse;
	}
}