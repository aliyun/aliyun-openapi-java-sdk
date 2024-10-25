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

import com.aliyuncs.vpc.model.v20160428.DescribeNetworkAclAttributesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeNetworkAclAttributesResponse.NetworkAclAttribute;
import com.aliyuncs.vpc.model.v20160428.DescribeNetworkAclAttributesResponse.NetworkAclAttribute.EgressAclEntry;
import com.aliyuncs.vpc.model.v20160428.DescribeNetworkAclAttributesResponse.NetworkAclAttribute.IngressAclEntry;
import com.aliyuncs.vpc.model.v20160428.DescribeNetworkAclAttributesResponse.NetworkAclAttribute.Resource;
import com.aliyuncs.vpc.model.v20160428.DescribeNetworkAclAttributesResponse.NetworkAclAttribute.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkAclAttributesResponseUnmarshaller {

	public static DescribeNetworkAclAttributesResponse unmarshall(DescribeNetworkAclAttributesResponse describeNetworkAclAttributesResponse, UnmarshallerContext _ctx) {
		
		describeNetworkAclAttributesResponse.setRequestId(_ctx.stringValue("DescribeNetworkAclAttributesResponse.RequestId"));

		NetworkAclAttribute networkAclAttribute = new NetworkAclAttribute();
		networkAclAttribute.setStatus(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.Status"));
		networkAclAttribute.setVpcId(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.VpcId"));
		networkAclAttribute.setCreationTime(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.CreationTime"));
		networkAclAttribute.setDescription(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.Description"));
		networkAclAttribute.setNetworkAclName(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.NetworkAclName"));
		networkAclAttribute.setNetworkAclId(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.NetworkAclId"));
		networkAclAttribute.setOwnerId(_ctx.longValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.OwnerId"));
		networkAclAttribute.setRegionId(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.RegionId"));

		List<IngressAclEntry> ingressAclEntries = new ArrayList<IngressAclEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.IngressAclEntries.Length"); i++) {
			IngressAclEntry ingressAclEntry = new IngressAclEntry();
			ingressAclEntry.setNetworkAclEntryId(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].NetworkAclEntryId"));
			ingressAclEntry.setEntryType(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].EntryType"));
			ingressAclEntry.setNetworkAclEntryName(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].NetworkAclEntryName"));
			ingressAclEntry.setPolicy(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].Policy"));
			ingressAclEntry.setDescription(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].Description"));
			ingressAclEntry.setSourceCidrIp(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].SourceCidrIp"));
			ingressAclEntry.setIpVersion(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].IpVersion"));
			ingressAclEntry.setBizProtocol(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].Protocol"));
			ingressAclEntry.setPort(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.IngressAclEntries["+ i +"].Port"));

			ingressAclEntries.add(ingressAclEntry);
		}
		networkAclAttribute.setIngressAclEntries(ingressAclEntries);

		List<EgressAclEntry> egressAclEntries = new ArrayList<EgressAclEntry>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.EgressAclEntries.Length"); i++) {
			EgressAclEntry egressAclEntry = new EgressAclEntry();
			egressAclEntry.setNetworkAclEntryId(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].NetworkAclEntryId"));
			egressAclEntry.setEntryType(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].EntryType"));
			egressAclEntry.setNetworkAclEntryName(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].NetworkAclEntryName"));
			egressAclEntry.setPolicy(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].Policy"));
			egressAclEntry.setDescription(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].Description"));
			egressAclEntry.setBizProtocol(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].Protocol"));
			egressAclEntry.setDestinationCidrIp(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].DestinationCidrIp"));
			egressAclEntry.setIpVersion(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].IpVersion"));
			egressAclEntry.setPort(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.EgressAclEntries["+ i +"].Port"));

			egressAclEntries.add(egressAclEntry);
		}
		networkAclAttribute.setEgressAclEntries(egressAclEntries);

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setStatus(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.Resources["+ i +"].Status"));
			resource.setResourceType(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.Resources["+ i +"].ResourceType"));
			resource.setResourceId(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.Resources["+ i +"].ResourceId"));

			resources.add(resource);
		}
		networkAclAttribute.setResources(resources);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeNetworkAclAttributesResponse.NetworkAclAttribute.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		networkAclAttribute.setTags(tags);
		describeNetworkAclAttributesResponse.setNetworkAclAttribute(networkAclAttribute);
	 
	 	return describeNetworkAclAttributesResponse;
	}
}