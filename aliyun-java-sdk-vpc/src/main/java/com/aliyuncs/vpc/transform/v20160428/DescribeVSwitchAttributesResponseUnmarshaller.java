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

	public static DescribeVSwitchAttributesResponse unmarshall(DescribeVSwitchAttributesResponse describeVSwitchAttributesResponse, UnmarshallerContext context) {
		
		describeVSwitchAttributesResponse.setRequestId(context.stringValue("DescribeVSwitchAttributesResponse.RequestId"));
		describeVSwitchAttributesResponse.setVSwitchId(context.stringValue("DescribeVSwitchAttributesResponse.VSwitchId"));
		describeVSwitchAttributesResponse.setVpcId(context.stringValue("DescribeVSwitchAttributesResponse.VpcId"));
		describeVSwitchAttributesResponse.setStatus(context.stringValue("DescribeVSwitchAttributesResponse.Status"));
		describeVSwitchAttributesResponse.setCidrBlock(context.stringValue("DescribeVSwitchAttributesResponse.CidrBlock"));
		describeVSwitchAttributesResponse.setIpv6CidrBlock(context.stringValue("DescribeVSwitchAttributesResponse.Ipv6CidrBlock"));
		describeVSwitchAttributesResponse.setZoneId(context.stringValue("DescribeVSwitchAttributesResponse.ZoneId"));
		describeVSwitchAttributesResponse.setAvailableIpAddressCount(context.longValue("DescribeVSwitchAttributesResponse.AvailableIpAddressCount"));
		describeVSwitchAttributesResponse.setDescription(context.stringValue("DescribeVSwitchAttributesResponse.Description"));
		describeVSwitchAttributesResponse.setVSwitchName(context.stringValue("DescribeVSwitchAttributesResponse.VSwitchName"));
		describeVSwitchAttributesResponse.setCreationTime(context.stringValue("DescribeVSwitchAttributesResponse.CreationTime"));
		describeVSwitchAttributesResponse.setIsDefault(context.booleanValue("DescribeVSwitchAttributesResponse.IsDefault"));
		describeVSwitchAttributesResponse.setResourceGroupId(context.stringValue("DescribeVSwitchAttributesResponse.ResourceGroupId"));
		describeVSwitchAttributesResponse.setNetworkAclId(context.stringValue("DescribeVSwitchAttributesResponse.NetworkAclId"));

		RouteTable routeTable = new RouteTable();
		routeTable.setRouteTableId(context.stringValue("DescribeVSwitchAttributesResponse.RouteTable.RouteTableId"));
		routeTable.setRouteTableType(context.stringValue("DescribeVSwitchAttributesResponse.RouteTable.RouteTableType"));
		describeVSwitchAttributesResponse.setRouteTable(routeTable);

		List<CloudResourceSetType> cloudResources = new ArrayList<CloudResourceSetType>();
		for (int i = 0; i < context.lengthValue("DescribeVSwitchAttributesResponse.CloudResources.Length"); i++) {
			CloudResourceSetType cloudResourceSetType = new CloudResourceSetType();
			cloudResourceSetType.setResourceType(context.stringValue("DescribeVSwitchAttributesResponse.CloudResources["+ i +"].ResourceType"));
			cloudResourceSetType.setResourceCount(context.integerValue("DescribeVSwitchAttributesResponse.CloudResources["+ i +"].ResourceCount"));

			cloudResources.add(cloudResourceSetType);
		}
		describeVSwitchAttributesResponse.setCloudResources(cloudResources);
	 
	 	return describeVSwitchAttributesResponse;
	}
}