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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse.NetworkInterfaceSet;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse.NetworkInterfaceSet.AssociatedPublicIp;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse.NetworkInterfaceSet.PrivateIpSet;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse.NetworkInterfaceSet.PrivateIpSet.AssociatedPublicIp1;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse.NetworkInterfaceSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkInterfacesResponseUnmarshaller {

	public static DescribeNetworkInterfacesResponse unmarshall(DescribeNetworkInterfacesResponse describeNetworkInterfacesResponse, UnmarshallerContext context) {
		
		describeNetworkInterfacesResponse.setRequestId(context.stringValue("DescribeNetworkInterfacesResponse.RequestId"));
		describeNetworkInterfacesResponse.setTotalCount(context.integerValue("DescribeNetworkInterfacesResponse.TotalCount"));
		describeNetworkInterfacesResponse.setPageNumber(context.integerValue("DescribeNetworkInterfacesResponse.PageNumber"));
		describeNetworkInterfacesResponse.setPageSize(context.integerValue("DescribeNetworkInterfacesResponse.PageSize"));

		List<NetworkInterfaceSet> networkInterfaceSets = new ArrayList<NetworkInterfaceSet>();
		for (int i = 0; i < context.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets.Length"); i++) {
			NetworkInterfaceSet networkInterfaceSet = new NetworkInterfaceSet();
			networkInterfaceSet.setNetworkInterfaceId(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceId"));
			networkInterfaceSet.setStatus(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Status"));
			networkInterfaceSet.setType(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Type"));
			networkInterfaceSet.setVpcId(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].VpcId"));
			networkInterfaceSet.setVSwitchId(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].VSwitchId"));
			networkInterfaceSet.setZoneId(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ZoneId"));
			networkInterfaceSet.setPrivateIpAddress(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpAddress"));
			networkInterfaceSet.setMacAddress(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].MacAddress"));
			networkInterfaceSet.setNetworkInterfaceName(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceName"));
			networkInterfaceSet.setDescription(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Description"));
			networkInterfaceSet.setInstanceId(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].InstanceId"));
			networkInterfaceSet.setCreationTime(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].CreationTime"));
			networkInterfaceSet.setResourceGroupId(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ResourceGroupId"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			networkInterfaceSet.setSecurityGroupIds(securityGroupIds);

			AssociatedPublicIp associatedPublicIp = new AssociatedPublicIp();
			associatedPublicIp.setPublicIpAddress(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].AssociatedPublicIp.PublicIpAddress"));
			associatedPublicIp.setAllocationId(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].AssociatedPublicIp.AllocationId"));
			networkInterfaceSet.setAssociatedPublicIp(associatedPublicIp);

			List<PrivateIpSet> privateIpSets = new ArrayList<PrivateIpSet>();
			for (int j = 0; j < context.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets.Length"); j++) {
				PrivateIpSet privateIpSet = new PrivateIpSet();
				privateIpSet.setPrivateIpAddress(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].PrivateIpAddress"));
				privateIpSet.setPrimary(context.booleanValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].Primary"));

				AssociatedPublicIp1 associatedPublicIp1 = new AssociatedPublicIp1();
				associatedPublicIp1.setPublicIpAddress(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].AssociatedPublicIp.PublicIpAddress"));
				associatedPublicIp1.setAllocationId(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].AssociatedPublicIp.AllocationId"));
				privateIpSet.setAssociatedPublicIp1(associatedPublicIp1);

				privateIpSets.add(privateIpSet);
			}
			networkInterfaceSet.setPrivateIpSets(privateIpSets);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			networkInterfaceSet.setTags(tags);

			networkInterfaceSets.add(networkInterfaceSet);
		}
		describeNetworkInterfacesResponse.setNetworkInterfaceSets(networkInterfaceSets);
	 
	 	return describeNetworkInterfacesResponse;
	}
}