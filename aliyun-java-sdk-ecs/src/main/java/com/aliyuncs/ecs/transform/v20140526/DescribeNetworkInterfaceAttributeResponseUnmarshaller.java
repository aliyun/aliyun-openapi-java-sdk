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
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.BondInterfaceSpecification;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.BondInterfaceSpecification.SlaveInterfaceSpecificationSet;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.Ipv4PrefixSet;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.Ipv6PrefixSet;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.Ipv6Set;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.PrivateIpSet;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.PrivateIpSet.AssociatedPublicIp1;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.SlaveInterfaceSpecification;
import com.aliyuncs.ecs.model.v20140526.DescribeNetworkInterfaceAttributeResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkInterfaceAttributeResponseUnmarshaller {

	public static DescribeNetworkInterfaceAttributeResponse unmarshall(DescribeNetworkInterfaceAttributeResponse describeNetworkInterfaceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeNetworkInterfaceAttributeResponse.setRequestId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.RequestId"));
		describeNetworkInterfaceAttributeResponse.setCreationTime(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.CreationTime"));
		describeNetworkInterfaceAttributeResponse.setVpcId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.VpcId"));
		describeNetworkInterfaceAttributeResponse.setType(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Type"));
		describeNetworkInterfaceAttributeResponse.setStatus(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Status"));
		describeNetworkInterfaceAttributeResponse.setNetworkInterfaceTrafficMode(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.NetworkInterfaceTrafficMode"));
		describeNetworkInterfaceAttributeResponse.setNetworkInterfaceName(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.NetworkInterfaceName"));
		describeNetworkInterfaceAttributeResponse.setMacAddress(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.MacAddress"));
		describeNetworkInterfaceAttributeResponse.setQueuePairNumber(_ctx.integerValue("DescribeNetworkInterfaceAttributeResponse.QueuePairNumber"));
		describeNetworkInterfaceAttributeResponse.setNetworkInterfaceId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.NetworkInterfaceId"));
		describeNetworkInterfaceAttributeResponse.setServiceID(_ctx.longValue("DescribeNetworkInterfaceAttributeResponse.ServiceID"));
		describeNetworkInterfaceAttributeResponse.setInstanceId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.InstanceId"));
		describeNetworkInterfaceAttributeResponse.setOwnerId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.OwnerId"));
		describeNetworkInterfaceAttributeResponse.setServiceManaged(_ctx.booleanValue("DescribeNetworkInterfaceAttributeResponse.ServiceManaged"));
		describeNetworkInterfaceAttributeResponse.setVSwitchId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.VSwitchId"));
		describeNetworkInterfaceAttributeResponse.setDescription(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Description"));
		describeNetworkInterfaceAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.ResourceGroupId"));
		describeNetworkInterfaceAttributeResponse.setZoneId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.ZoneId"));
		describeNetworkInterfaceAttributeResponse.setPrivateIpAddress(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.PrivateIpAddress"));
		describeNetworkInterfaceAttributeResponse.setQueueNumber(_ctx.integerValue("DescribeNetworkInterfaceAttributeResponse.QueueNumber"));

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
		attachment.setDeviceIndex(_ctx.integerValue("DescribeNetworkInterfaceAttributeResponse.Attachment.DeviceIndex"));
		attachment.setInstanceId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Attachment.InstanceId"));
		attachment.setTrunkNetworkInterfaceId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Attachment.TrunkNetworkInterfaceId"));
		attachment.setNetworkCardIndex(_ctx.integerValue("DescribeNetworkInterfaceAttributeResponse.Attachment.NetworkCardIndex"));

		List<String> memberNetworkInterfaceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInterfaceAttributeResponse.Attachment.MemberNetworkInterfaceIds.Length"); i++) {
			memberNetworkInterfaceIds.add(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Attachment.MemberNetworkInterfaceIds["+ i +"]"));
		}
		attachment.setMemberNetworkInterfaceIds(memberNetworkInterfaceIds);
		describeNetworkInterfaceAttributeResponse.setAttachment(attachment);

		BondInterfaceSpecification bondInterfaceSpecification = new BondInterfaceSpecification();
		bondInterfaceSpecification.setBondMode(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.BondInterfaceSpecification.BondMode"));

		List<SlaveInterfaceSpecificationSet> slaveInterfaceSpecification2 = new ArrayList<SlaveInterfaceSpecificationSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInterfaceAttributeResponse.BondInterfaceSpecification.SlaveInterfaceSpecification.Length"); i++) {
			SlaveInterfaceSpecificationSet slaveInterfaceSpecificationSet = new SlaveInterfaceSpecificationSet();
			slaveInterfaceSpecificationSet.setSlaveNetworkInterfaceId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.BondInterfaceSpecification.SlaveInterfaceSpecification["+ i +"].SlaveNetworkInterfaceId"));
			slaveInterfaceSpecificationSet.setWorkState(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.BondInterfaceSpecification.SlaveInterfaceSpecification["+ i +"].WorkState"));
			slaveInterfaceSpecificationSet.setBondNetworkInterfaceId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.BondInterfaceSpecification.SlaveInterfaceSpecification["+ i +"].BondNetworkInterfaceId"));

			slaveInterfaceSpecification2.add(slaveInterfaceSpecificationSet);
		}
		bondInterfaceSpecification.setSlaveInterfaceSpecification2(slaveInterfaceSpecification2);
		describeNetworkInterfaceAttributeResponse.setBondInterfaceSpecification(bondInterfaceSpecification);

		SlaveInterfaceSpecification slaveInterfaceSpecification = new SlaveInterfaceSpecification();
		slaveInterfaceSpecification.setSlaveNetworkInterfaceId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.SlaveInterfaceSpecification.SlaveNetworkInterfaceId"));
		slaveInterfaceSpecification.setWorkState(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.SlaveInterfaceSpecification.WorkState"));
		slaveInterfaceSpecification.setBondNetworkInterfaceId(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.SlaveInterfaceSpecification.BondNetworkInterfaceId"));
		describeNetworkInterfaceAttributeResponse.setSlaveInterfaceSpecification(slaveInterfaceSpecification);

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

		List<Ipv4PrefixSet> ipv4PrefixSets = new ArrayList<Ipv4PrefixSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInterfaceAttributeResponse.Ipv4PrefixSets.Length"); i++) {
			Ipv4PrefixSet ipv4PrefixSet = new Ipv4PrefixSet();
			ipv4PrefixSet.setIpv4Prefix(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Ipv4PrefixSets["+ i +"].Ipv4Prefix"));

			ipv4PrefixSets.add(ipv4PrefixSet);
		}
		describeNetworkInterfaceAttributeResponse.setIpv4PrefixSets(ipv4PrefixSets);

		List<Ipv6PrefixSet> ipv6PrefixSets = new ArrayList<Ipv6PrefixSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInterfaceAttributeResponse.Ipv6PrefixSets.Length"); i++) {
			Ipv6PrefixSet ipv6PrefixSet = new Ipv6PrefixSet();
			ipv6PrefixSet.setIpv6Prefix(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Ipv6PrefixSets["+ i +"].Ipv6Prefix"));

			ipv6PrefixSets.add(ipv6PrefixSet);
		}
		describeNetworkInterfaceAttributeResponse.setIpv6PrefixSets(ipv6PrefixSets);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInterfaceAttributeResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagValue(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Tags["+ i +"].TagValue"));
			tag.setTagKey(_ctx.stringValue("DescribeNetworkInterfaceAttributeResponse.Tags["+ i +"].TagKey"));

			tags.add(tag);
		}
		describeNetworkInterfaceAttributeResponse.setTags(tags);
	 
	 	return describeNetworkInterfaceAttributeResponse;
	}
}