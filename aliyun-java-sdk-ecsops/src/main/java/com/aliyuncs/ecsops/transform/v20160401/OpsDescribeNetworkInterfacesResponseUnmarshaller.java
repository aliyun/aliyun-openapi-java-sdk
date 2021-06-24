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
		opsDescribeNetworkInterfacesResponse.setPageSize(_ctx.integerValue("OpsDescribeNetworkInterfacesResponse.PageSize"));
		opsDescribeNetworkInterfacesResponse.setPageNumber(_ctx.integerValue("OpsDescribeNetworkInterfacesResponse.PageNumber"));

		List<NetworkInterfaceSet> networkInterfaceSets = new ArrayList<NetworkInterfaceSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets.Length"); i++) {
			NetworkInterfaceSet networkInterfaceSet = new NetworkInterfaceSet();
			networkInterfaceSet.setStatus(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Status"));
			networkInterfaceSet.setType(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Type"));
			networkInterfaceSet.setVpcId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].VpcId"));
			networkInterfaceSet.setCreationTime(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].CreationTime"));
			networkInterfaceSet.setNetworkInterfaceName(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceName"));
			networkInterfaceSet.setMacAddress(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].MacAddress"));
			networkInterfaceSet.setNetworkInterfaceId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].NetworkInterfaceId"));
			networkInterfaceSet.setServiceID(_ctx.longValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ServiceID"));
			networkInterfaceSet.setInstanceId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].InstanceId"));
			networkInterfaceSet.setGmtModified(_ctx.longValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].GmtModified"));
			networkInterfaceSet.setServiceManaged(_ctx.booleanValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ServiceManaged"));
			networkInterfaceSet.setVSwitchId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].VSwitchId"));
			networkInterfaceSet.setDescription(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Description"));
			networkInterfaceSet.setResourceGroupId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ResourceGroupId"));
			networkInterfaceSet.setGmtCreate(_ctx.longValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].GmtCreate"));
			networkInterfaceSet.setZoneId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].ZoneId"));
			networkInterfaceSet.setPrivateIpAddress(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpAddress"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			networkInterfaceSet.setSecurityGroupIds(securityGroupIds);

			Attachment attachment = new Attachment();
			attachment.setDeviceIndex(_ctx.integerValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Attachment.DeviceIndex"));
			attachment.setInstanceId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Attachment.InstanceId"));
			attachment.setTrunkNetworkInterfaceId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Attachment.TrunkNetworkInterfaceId"));

			List<String> memberNetworkInterfaceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Attachment.MemberNetworkInterfaceIds.Length"); j++) {
				memberNetworkInterfaceIds.add(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Attachment.MemberNetworkInterfaceIds["+ j +"]"));
			}
			attachment.setMemberNetworkInterfaceIds(memberNetworkInterfaceIds);
			networkInterfaceSet.setAttachment(attachment);

			AssociatedPublicIp associatedPublicIp = new AssociatedPublicIp();
			associatedPublicIp.setAllocationId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].AssociatedPublicIp.AllocationId"));
			associatedPublicIp.setPublicIpAddress(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].AssociatedPublicIp.PublicIpAddress"));
			networkInterfaceSet.setAssociatedPublicIp(associatedPublicIp);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			networkInterfaceSet.setTags(tags);

			List<Ipv6Set> ipv6Sets = new ArrayList<Ipv6Set>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Ipv6Sets.Length"); j++) {
				Ipv6Set ipv6Set = new Ipv6Set();
				ipv6Set.setIpv6Address(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].Ipv6Sets["+ j +"].Ipv6Address"));

				ipv6Sets.add(ipv6Set);
			}
			networkInterfaceSet.setIpv6Sets(ipv6Sets);

			List<PrivateIpSet> privateIpSets = new ArrayList<PrivateIpSet>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets.Length"); j++) {
				PrivateIpSet privateIpSet = new PrivateIpSet();
				privateIpSet.setPrimary(_ctx.booleanValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].Primary"));
				privateIpSet.setPrivateIpAddress(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].PrivateIpAddress"));

				AssociatedPublicIp1 associatedPublicIp1 = new AssociatedPublicIp1();
				associatedPublicIp1.setAllocationId(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].AssociatedPublicIp.AllocationId"));
				associatedPublicIp1.setPublicIpAddress(_ctx.stringValue("OpsDescribeNetworkInterfacesResponse.NetworkInterfaceSets["+ i +"].PrivateIpSets["+ j +"].AssociatedPublicIp.PublicIpAddress"));
				privateIpSet.setAssociatedPublicIp1(associatedPublicIp1);

				privateIpSets.add(privateIpSet);
			}
			networkInterfaceSet.setPrivateIpSets(privateIpSets);

			networkInterfaceSets.add(networkInterfaceSet);
		}
		opsDescribeNetworkInterfacesResponse.setNetworkInterfaceSets(networkInterfaceSets);
	 
	 	return opsDescribeNetworkInterfacesResponse;
	}
}