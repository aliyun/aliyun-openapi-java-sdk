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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNetworkInterfacesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSet;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSet.AssociatedPublicIp;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSet.Attachment;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSet.Ipv6Set;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSet.PrivateIpSet;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSet.PrivateIpSet.AssociatedPublicIp1;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeNetworkInterfacesResponseUnmarshaller {

	public static OpsDescribeNetworkInterfacesResponse unmarshall(OpsDescribeNetworkInterfacesResponse opsDescribeNetworkInterfacesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeNetworkInterfacesResponse.setRequestId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.RequestId"));
		opsDescribeNetworkInterfacesResponse.setTotalCount(_ctx.integerValue("OpsDescribeNetworkInterfacesResponse.TotalCount"));
		opsDescribeNetworkInterfacesResponse.setPageNumber(_ctx.integerValue("OpsDescribeNetworkInterfacesResponse.PageNumber"));
		opsDescribeNetworkInterfacesResponse.setPageSize(_ctx.integerValue("OpsDescribeNetworkInterfacesResponse.PageSize"));

		List<NetworkInterfaceSet> networkInterfaceSets = new ArrayList<NetworkInterfaceSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets.Length"); i++) {
			NetworkInterfaceSet networkInterfaceSet = new NetworkInterfaceSet();
			networkInterfaceSet.setNetworkInterfaceId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceId"));
			networkInterfaceSet.setStatus(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Status"));
			networkInterfaceSet.setType(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Type"));
			networkInterfaceSet.setVpcId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].VpcId"));
			networkInterfaceSet.setVSwitchId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].VSwitchId"));
			networkInterfaceSet.setZoneId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ZoneId"));
			networkInterfaceSet.setPrivateIpAddress(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpAddress"));
			networkInterfaceSet.setMacAddress(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].MacAddress"));
			networkInterfaceSet.setNetworkInterfaceName(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceName"));
			networkInterfaceSet.setDescription(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Description"));
			networkInterfaceSet.setInstanceId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].InstanceId"));
			networkInterfaceSet.setCreationTime(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].CreationTime"));
			networkInterfaceSet.setResourceGroupId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ResourceGroupId"));
			networkInterfaceSet.setServiceID(_ctx.longValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ServiceID"));
			networkInterfaceSet.setServiceManaged(_ctx.booleanValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ServiceManaged"));
			networkInterfaceSet.setGmtModified(_ctx.longValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].GmtModified"));
			networkInterfaceSet.setGmtCreate(_ctx.longValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].GmtCreate"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			networkInterfaceSet.setSecurityGroupIds(securityGroupIds);

			AssociatedPublicIp associatedPublicIp = new AssociatedPublicIp();
			associatedPublicIp.setPublicIpAddress(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].AssociatedPublicIp.PublicIpAddress"));
			associatedPublicIp.setAllocationId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].AssociatedPublicIp.AllocationId"));
			networkInterfaceSet.setAssociatedPublicIp(associatedPublicIp);

			Attachment attachment = new Attachment();
			attachment.setInstanceId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Attachment.InstanceId"));
			attachment.setTrunkNetworkInterfaceId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Attachment.TrunkNetworkInterfaceId"));
			attachment.setDeviceIndex(_ctx.integerValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Attachment.DeviceIndex"));

			List<String> memberNetworkInterfaceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Attachment.MemberNetworkInterfaceIds.Length"); j++) {
				memberNetworkInterfaceIds.add(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Attachment.MemberNetworkInterfaceIds["+ j +"]"));
			}
			attachment.setMemberNetworkInterfaceIds(memberNetworkInterfaceIds);
			networkInterfaceSet.setAttachment(attachment);

			List<PrivateIpSet> privateIpSets = new ArrayList<PrivateIpSet>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets.Length"); j++) {
				PrivateIpSet privateIpSet = new PrivateIpSet();
				privateIpSet.setPrivateIpAddress(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].PrivateIpAddress"));
				privateIpSet.setPrimary(_ctx.booleanValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].Primary"));

				AssociatedPublicIp1 associatedPublicIp1 = new AssociatedPublicIp1();
				associatedPublicIp1.setPublicIpAddress(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].AssociatedPublicIp.PublicIpAddress"));
				associatedPublicIp1.setAllocationId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].AssociatedPublicIp.AllocationId"));
				privateIpSet.setAssociatedPublicIp1(associatedPublicIp1);

				privateIpSets.add(privateIpSet);
			}
			networkInterfaceSet.setPrivateIpSets(privateIpSets);

			List<Ipv6Set> ipv6Sets = new ArrayList<Ipv6Set>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Ipv6Sets.Length"); j++) {
				Ipv6Set ipv6Set = new Ipv6Set();
				ipv6Set.setIpv6Address(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Ipv6Sets["+ j +"].Ipv6Address"));

				ipv6Sets.add(ipv6Set);
			}
			networkInterfaceSet.setIpv6Sets(ipv6Sets);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			networkInterfaceSet.setTags(tags);

			networkInterfaceSets.add(networkInterfaceSet);
		}
		opsDescribeNetworkInterfacesResponse.setNetworkInterfaceSets(networkInterfaceSets);
	 
	 	return opsDescribeNetworkInterfacesResponse;
	}
}