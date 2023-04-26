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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.InnerDescribeNetworkInterfaceInGroupResponse;
import com.aliyuncs.ecs.model.v20160314.InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSet;
import com.aliyuncs.ecs.model.v20160314.InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSet.AssociatedPublicIp;
import com.aliyuncs.ecs.model.v20160314.InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSet.Attachment;
import com.aliyuncs.ecs.model.v20160314.InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSet.Ipv6Set;
import com.aliyuncs.ecs.model.v20160314.InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSet.PrivateIpSet;
import com.aliyuncs.ecs.model.v20160314.InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSet.PrivateIpSet.AssociatedPublicIp1;
import com.aliyuncs.ecs.model.v20160314.InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDescribeNetworkInterfaceInGroupResponseUnmarshaller {

	public static InnerDescribeNetworkInterfaceInGroupResponse unmarshall(InnerDescribeNetworkInterfaceInGroupResponse innerDescribeNetworkInterfaceInGroupResponse, UnmarshallerContext _ctx) {
		
		innerDescribeNetworkInterfaceInGroupResponse.setRequestId(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.RequestId"));
		innerDescribeNetworkInterfaceInGroupResponse.setNextToken(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NextToken"));

		List<NetworkInterfaceSet> networkInterfaceSets = new ArrayList<NetworkInterfaceSet>();
		for (int i = 0; i < _ctx.lengthValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets.Length"); i++) {
			NetworkInterfaceSet networkInterfaceSet = new NetworkInterfaceSet();
			networkInterfaceSet.setCreationTime(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].CreationTime"));
			networkInterfaceSet.setVpcId(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].VpcId"));
			networkInterfaceSet.setType(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].Type"));
			networkInterfaceSet.setStatus(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].Status"));
			networkInterfaceSet.setNetworkInterfaceTrafficMode(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceTrafficMode"));
			networkInterfaceSet.setNetworkInterfaceName(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceName"));
			networkInterfaceSet.setMacAddress(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].MacAddress"));
			networkInterfaceSet.setQueuePairNumber(_ctx.integerValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].QueuePairNumber"));
			networkInterfaceSet.setNetworkInterfaceId(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceId"));
			networkInterfaceSet.setServiceID(_ctx.longValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].ServiceID"));
			networkInterfaceSet.setInstanceId(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].InstanceId"));
			networkInterfaceSet.setOwnerId(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].OwnerId"));
			networkInterfaceSet.setServiceManaged(_ctx.booleanValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].ServiceManaged"));
			networkInterfaceSet.setVSwitchId(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].VSwitchId"));
			networkInterfaceSet.setDescription(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].Description"));
			networkInterfaceSet.setResourceGroupId(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].ResourceGroupId"));
			networkInterfaceSet.setZoneId(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].ZoneId"));
			networkInterfaceSet.setPrivateIpAddress(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].PrivateIpAddress"));
			networkInterfaceSet.setQueueNumber(_ctx.integerValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].QueueNumber"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			networkInterfaceSet.setSecurityGroupIds(securityGroupIds);

			AssociatedPublicIp associatedPublicIp = new AssociatedPublicIp();
			associatedPublicIp.setPublicIpAddress(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].AssociatedPublicIp.PublicIpAddress"));
			associatedPublicIp.setAllocationId(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].AssociatedPublicIp.AllocationId"));
			networkInterfaceSet.setAssociatedPublicIp(associatedPublicIp);

			Attachment attachment = new Attachment();
			attachment.setDeviceIndex(_ctx.integerValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].Attachment.DeviceIndex"));
			attachment.setInstanceId(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].Attachment.InstanceId"));
			attachment.setTrunkNetworkInterfaceId(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].Attachment.TrunkNetworkInterfaceId"));
			networkInterfaceSet.setAttachment(attachment);

			List<PrivateIpSet> privateIpSets = new ArrayList<PrivateIpSet>();
			for (int j = 0; j < _ctx.lengthValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets.Length"); j++) {
				PrivateIpSet privateIpSet = new PrivateIpSet();
				privateIpSet.setPrivateIpAddress(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].PrivateIpAddress"));
				privateIpSet.setPrimary(_ctx.booleanValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].Primary"));

				AssociatedPublicIp1 associatedPublicIp1 = new AssociatedPublicIp1();
				associatedPublicIp1.setPublicIpAddress(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].AssociatedPublicIp.PublicIpAddress"));
				associatedPublicIp1.setAllocationId(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].AssociatedPublicIp.AllocationId"));
				privateIpSet.setAssociatedPublicIp1(associatedPublicIp1);

				privateIpSets.add(privateIpSet);
			}
			networkInterfaceSet.setPrivateIpSets(privateIpSets);

			List<Ipv6Set> ipv6Sets = new ArrayList<Ipv6Set>();
			for (int j = 0; j < _ctx.lengthValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].Ipv6Sets.Length"); j++) {
				Ipv6Set ipv6Set = new Ipv6Set();
				ipv6Set.setIpv6Address(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].Ipv6Sets["+ j +"].Ipv6Address"));

				ipv6Sets.add(ipv6Set);
			}
			networkInterfaceSet.setIpv6Sets(ipv6Sets);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("InnerDescribeNetworkInterfaceInGroupResponse.NetworkInterfaceSets["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			networkInterfaceSet.setTags(tags);

			networkInterfaceSets.add(networkInterfaceSet);
		}
		innerDescribeNetworkInterfaceInGroupResponse.setNetworkInterfaceSets(networkInterfaceSets);
	 
	 	return innerDescribeNetworkInterfaceInGroupResponse;
	}
}