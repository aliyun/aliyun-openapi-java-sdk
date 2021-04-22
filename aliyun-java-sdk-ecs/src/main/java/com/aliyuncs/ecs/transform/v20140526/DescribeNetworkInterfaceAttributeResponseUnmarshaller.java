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

import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.AssociatedPublicIp;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.Attachment;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.Ipv6Set;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.PrivateIpSet;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.PrivateIpSet.AssociatedPublicIp1;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkInterfaceAttributeResponseUnmarshaller {

	public static DescribeNetworkInterfaceAttributeResponse unmarshall(DescribeNetworkInterfaceAttributeResponse describeNetworkInterfaceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeNetworkInterfaceAttributeResponse.setRequestId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.RequestId"));
		describeNetworkInterfaceAttributeResponse.setNetworkInterfaceId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.NetworkInterfaceId"));
		describeNetworkInterfaceAttributeResponse.setStatus(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Status"));
		describeNetworkInterfaceAttributeResponse.setType(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Type"));
		describeNetworkInterfaceAttributeResponse.setVpcId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.VpcId"));
		describeNetworkInterfaceAttributeResponse.setVSwitchId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.VSwitchId"));
		describeNetworkInterfaceAttributeResponse.setZoneId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.ZoneId"));
		describeNetworkInterfaceAttributeResponse.setPrivateIpAddress(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.PrivateIpAddress"));
		describeNetworkInterfaceAttributeResponse.setMacAddress(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.MacAddress"));
		describeNetworkInterfaceAttributeResponse.setNetworkInterfaceName(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.NetworkInterfaceName"));
		describeNetworkInterfaceAttributeResponse.setDescription(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Description"));
		describeNetworkInterfaceAttributeResponse.setInstanceId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.InstanceId"));
		describeNetworkInterfaceAttributeResponse.setCreationTime(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.CreationTime"));
		describeNetworkInterfaceAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.ResourceGroupId"));
		describeNetworkInterfaceAttributeResponse.setServiceID(_ctx.longValue("DescribeNetworkInterfaceAttributeResponse.ServiceID"));
		describeNetworkInterfaceAttributeResponse.setServiceManaged(_ctx.booleanValue("DescribeNetworkInterfaceAttributeResponse.ServiceManaged"));
		describeNetworkInterfaceAttributeResponse.setQueueNumber(_ctx.integerValue("DescribeNetworkInterfaceAttributeResponse.QueueNumber"));
		describeNetworkInterfaceAttributeResponse.setOwnerId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.OwnerId"));
		describeNetworkInterfaceAttributeResponse.setNetworkInterfaceTrafficMode(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.NetworkInterfaceTrafficMode"));
		describeNetworkInterfaceAttributeResponse.setQueuePairNumber(_ctx.integerValue("DescribeNetworkInterfaceAttributeResponse.QueuePairNumber"));

		List<String> securityGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInterfaceAttributeResponse.SecurityGroupIds.Length"); i++) {
			securityGroupIds.add(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.SecurityGroupIds["+ i +"]"));
		}
		describeNetworkInterfaceAttributeResponse.setSecurityGroupIds(securityGroupIds);

		AssociatedPublicIp associatedPublicIp = new AssociatedPublicIp();
		associatedPublicIp.setPublicIpAddress(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.AssociatedPublicIp.PublicIpAddress"));
		associatedPublicIp.setAllocationId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.AssociatedPublicIp.AllocationId"));
		describeNetworkInterfaceAttributeResponse.setAssociatedPublicIp(associatedPublicIp);

		Attachment attachment = new Attachment();
		attachment.setInstanceId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Attachment.InstanceId"));
		attachment.setTrunkNetworkInterfaceId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Attachment.TrunkNetworkInterfaceId"));
		attachment.setDeviceIndex(_ctx.integerValue("DescribeNetworkInterfaceAttributeResponse.Attachment.DeviceIndex"));

		List<String> memberNetworkInterfaceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInterfaceAttributeResponse.Attachment.MemberNetworkInterfaceIds.Length"); i++) {
			memberNetworkInterfaceIds.add(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Attachment.MemberNetworkInterfaceIds["+ i +"]"));
		}
		attachment.setMemberNetworkInterfaceIds(memberNetworkInterfaceIds);
		describeNetworkInterfaceAttributeResponse.setAttachment(attachment);

		List<PrivateIpSet> privateIpSets = new ArrayList<PrivateIpSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInterfaceAttributeResponse.PrivateIpSets.Length"); i++) {
			PrivateIpSet privateIpSet = new PrivateIpSet();
			privateIpSet.setPrivateIpAddress(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.PrivateIpSets["+ i +"].PrivateIpAddress"));
			privateIpSet.setPrimary(_ctx.booleanValue("DescribeNetworkInterfaceAttributeResponse.PrivateIpSets["+ i +"].Primary"));

			AssociatedPublicIp1 associatedPublicIp1 = new AssociatedPublicIp1();
			associatedPublicIp1.setPublicIpAddress(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.PrivateIpSets["+ i +"].AssociatedPublicIp.PublicIpAddress"));
			associatedPublicIp1.setAllocationId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.PrivateIpSets["+ i +"].AssociatedPublicIp.AllocationId"));
			privateIpSet.setAssociatedPublicIp1(associatedPublicIp1);

			privateIpSets.add(privateIpSet);
		}
		describeNetworkInterfaceAttributeResponse.setPrivateIpSets(privateIpSets);

		List<Ipv6Set> ipv6Sets = new ArrayList<Ipv6Set>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInterfaceAttributeResponse.Ipv6Sets.Length"); i++) {
			Ipv6Set ipv6Set = new Ipv6Set();
			ipv6Set.setIpv6Address(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Ipv6Sets["+ i +"].Ipv6Address"));

			ipv6Sets.add(ipv6Set);
		}
		describeNetworkInterfaceAttributeResponse.setIpv6Sets(ipv6Sets);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInterfaceAttributeResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		describeNetworkInterfaceAttributeResponse.setTags(tags);
	 
	 	return describeNetworkInterfaceAttributeResponse;
	}
}