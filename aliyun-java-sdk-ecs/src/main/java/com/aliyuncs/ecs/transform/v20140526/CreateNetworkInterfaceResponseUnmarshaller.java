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

import com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfaceResponse;
import com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfaceResponse.PrivateIpSet;
import com.aliyuncs.ecs.model.v20140526.CreateNetworkInterfaceResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNetworkInterfaceResponseUnmarshaller {

	public static CreateNetworkInterfaceResponse unmarshall(CreateNetworkInterfaceResponse createNetworkInterfaceResponse, UnmarshallerContext _ctx) {
		
		createNetworkInterfaceResponse.setRequestId(_ctx.stringValue("CreateNetworkInterfaceResponse.RequestId"));
		createNetworkInterfaceResponse.setNetworkInterfaceId(_ctx.stringValue("CreateNetworkInterfaceResponse.NetworkInterfaceId"));
		createNetworkInterfaceResponse.setStatus(_ctx.stringValue("CreateNetworkInterfaceResponse.Status"));
		createNetworkInterfaceResponse.setType(_ctx.stringValue("CreateNetworkInterfaceResponse.Type"));
		createNetworkInterfaceResponse.setVpcId(_ctx.stringValue("CreateNetworkInterfaceResponse.VpcId"));
		createNetworkInterfaceResponse.setVSwitchId(_ctx.stringValue("CreateNetworkInterfaceResponse.VSwitchId"));
		createNetworkInterfaceResponse.setZoneId(_ctx.stringValue("CreateNetworkInterfaceResponse.ZoneId"));
		createNetworkInterfaceResponse.setPrivateIpAddress(_ctx.stringValue("CreateNetworkInterfaceResponse.PrivateIpAddress"));
		createNetworkInterfaceResponse.setMacAddress(_ctx.stringValue("CreateNetworkInterfaceResponse.MacAddress"));
		createNetworkInterfaceResponse.setNetworkInterfaceName(_ctx.stringValue("CreateNetworkInterfaceResponse.NetworkInterfaceName"));
		createNetworkInterfaceResponse.setDescription(_ctx.stringValue("CreateNetworkInterfaceResponse.Description"));
		createNetworkInterfaceResponse.setResourceGroupId(_ctx.stringValue("CreateNetworkInterfaceResponse.ResourceGroupId"));
		createNetworkInterfaceResponse.setServiceID(_ctx.longValue("CreateNetworkInterfaceResponse.ServiceID"));
		createNetworkInterfaceResponse.setServiceManaged(_ctx.booleanValue("CreateNetworkInterfaceResponse.ServiceManaged"));
		createNetworkInterfaceResponse.setOwnerId(_ctx.stringValue("CreateNetworkInterfaceResponse.OwnerId"));

		List<String> securityGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateNetworkInterfaceResponse.SecurityGroupIds.Length"); i++) {
			securityGroupIds.add(_ctx.stringValue("CreateNetworkInterfaceResponse.SecurityGroupIds["+ i +"]"));
		}
		createNetworkInterfaceResponse.setSecurityGroupIds(securityGroupIds);

		List<PrivateIpSet> privateIpSets = new ArrayList<PrivateIpSet>();
		for (int i = 0; i < _ctx.lengthValue("CreateNetworkInterfaceResponse.PrivateIpSets.Length"); i++) {
			PrivateIpSet privateIpSet = new PrivateIpSet();
			privateIpSet.setPrivateIpAddress(_ctx.stringValue("CreateNetworkInterfaceResponse.PrivateIpSets["+ i +"].PrivateIpAddress"));
			privateIpSet.setPrimary(_ctx.booleanValue("CreateNetworkInterfaceResponse.PrivateIpSets["+ i +"].Primary"));

			privateIpSets.add(privateIpSet);
		}
		createNetworkInterfaceResponse.setPrivateIpSets(privateIpSets);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("CreateNetworkInterfaceResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("CreateNetworkInterfaceResponse.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("CreateNetworkInterfaceResponse.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		createNetworkInterfaceResponse.setTags(tags);
	 
	 	return createNetworkInterfaceResponse;
	}
}