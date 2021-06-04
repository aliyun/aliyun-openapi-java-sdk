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
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse.NetworkInterfaceSet.Attachment;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse.NetworkInterfaceSet.Ipv6Set;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse.NetworkInterfaceSet.PrivateIpSet;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse.NetworkInterfaceSet.PrivateIpSet.AssociatedPublicIp1;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfacesResponse.NetworkInterfaceSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkInterfacesResponseUnmarshaller {

	public static DescribeNetworkInterfacesResponse unmarshall(DescribeNetworkInterfacesResponse describeNetworkInterfacesResponse, UnmarshallerContext _ctx) {
		
		describeNetworkInterfacesResponse.setRequestId(_ctx.stringValue("DescribeNetworkInterfacesResponse.RequestId"));
		describeNetworkInterfacesResponse.setNextToken(_ctx.stringValue("DescribeNetworkInterfacesResponse.NextToken"));
		describeNetworkInterfacesResponse.setPageSize(_ctx.integerValue("DescribeNetworkInterfacesResponse.PageSize"));
		describeNetworkInterfacesResponse.setPageNumber(_ctx.integerValue("DescribeNetworkInterfacesResponse.PageNumber"));
		describeNetworkInterfacesResponse.setTotalCount(_ctx.integerValue("DescribeNetworkInterfacesResponse.TotalCount"));

		List<NetworkInterfaceSet> networkInterfaceSets = new ArrayList<NetworkInterfaceSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets.Length"); i++) {
			NetworkInterfaceSet networkInterfaceSet = new NetworkInterfaceSet();
			networkInterfaceSet.setCreationTime(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].CreationTime"));
			networkInterfaceSet.setVpcId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].VpcId"));
			networkInterfaceSet.setType(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Type"));
			networkInterfaceSet.setStatus(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Status"));
			networkInterfaceSet.setNetworkInterfaceTrafficMode(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceTrafficMode"));
			networkInterfaceSet.setNetworkInterfaceName(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceName"));
			networkInterfaceSet.setMacAddress(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].MacAddress"));
			networkInterfaceSet.setQueuePairNumber(_ctx.integerValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].QueuePairNumber"));
			networkInterfaceSet.setNetworkInterfaceId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceId"));
			networkInterfaceSet.setServiceID(_ctx.longValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ServiceID"));
			networkInterfaceSet.setInstanceId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].InstanceId"));
			networkInterfaceSet.setOwnerId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].OwnerId"));
			networkInterfaceSet.setServiceManaged(_ctx.booleanValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ServiceManaged"));
			networkInterfaceSet.setVSwitchId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].VSwitchId"));
			networkInterfaceSet.setDescription(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Description"));
			networkInterfaceSet.setResourceGroupId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ResourceGroupId"));
			networkInterfaceSet.setZoneId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ZoneId"));
			networkInterfaceSet.setPrivateIpAddress(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpAddress"));
			networkInterfaceSet.setQueueNumber(_ctx.integerValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].QueueNumber"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			networkInterfaceSet.setSecurityGroupIds(securityGroupIds);

			AssociatedPublicIp associatedPublicIp = new AssociatedPublicIp();
			associatedPublicIp.setPublicIpAddress(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].AssociatedPublicIp.PublicIpAddress"));
			associatedPublicIp.setAllocationId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].AssociatedPublicIp.AllocationId"));
			networkInterfaceSet.setAssociatedPublicIp(associatedPublicIp);

			Attachment attachment = new Attachment();
			attachment.setDeviceIndex(_ctx.integerValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Attachment.DeviceIndex"));
			attachment.setInstanceId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Attachment.InstanceId"));
			attachment.setTrunkNetworkInterfaceId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Attachment.TrunkNetworkInterfaceId"));
			networkInterfaceSet.setAttachment(attachment);

			List<PrivateIpSet> privateIpSets = new ArrayList<PrivateIpSet>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets.Length"); j++) {
				PrivateIpSet privateIpSet = new PrivateIpSet();
				privateIpSet.setPrivateIpAddress(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].PrivateIpAddress"));
				privateIpSet.setPrimary(_ctx.booleanValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].Primary"));

				AssociatedPublicIp1 associatedPublicIp1 = new AssociatedPublicIp1();
				associatedPublicIp1.setPublicIpAddress(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].AssociatedPublicIp.PublicIpAddress"));
				associatedPublicIp1.setAllocationId(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].AssociatedPublicIp.AllocationId"));
				privateIpSet.setAssociatedPublicIp1(associatedPublicIp1);

				privateIpSets.add(privateIpSet);
			}
			networkInterfaceSet.setPrivateIpSets(privateIpSets);

			List<Ipv6Set> ipv6Sets = new ArrayList<Ipv6Set>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Ipv6Sets.Length"); j++) {
				Ipv6Set ipv6Set = new Ipv6Set();
				ipv6Set.setIpv6Address(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Ipv6Sets["+ j +"].Ipv6Address"));

				ipv6Sets.add(ipv6Set);
			}
			networkInterfaceSet.setIpv6Sets(ipv6Sets);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			networkInterfaceSet.setTags(tags);

			networkInterfaceSets.add(networkInterfaceSet);
		}
		describeNetworkInterfacesResponse.setNetworkInterfaceSets(networkInterfaceSets);
	 
	 	return describeNetworkInterfacesResponse;
	}
}