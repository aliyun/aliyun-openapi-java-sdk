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

import com.aliyuncs.vpc.model.v20160428.DescribeVpcAttributeResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpcAttributeResponse.AssociatedCen;
import com.aliyuncs.vpc.model.v20160428.DescribeVpcAttributeResponse.AssociatedPropagationSourcesItem;
import com.aliyuncs.vpc.model.v20160428.DescribeVpcAttributeResponse.CloudResourceSetType;
import com.aliyuncs.vpc.model.v20160428.DescribeVpcAttributeResponse.Ipv6CidrBlock;
import com.aliyuncs.vpc.model.v20160428.DescribeVpcAttributeResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcAttributeResponseUnmarshaller {

	public static DescribeVpcAttributeResponse unmarshall(DescribeVpcAttributeResponse describeVpcAttributeResponse, UnmarshallerContext _ctx) {
		
		describeVpcAttributeResponse.setRequestId(_ctx.stringValue("DescribeVpcAttributeResponse.RequestId"));
		describeVpcAttributeResponse.setCreationTime(_ctx.stringValue("DescribeVpcAttributeResponse.CreationTime"));
		describeVpcAttributeResponse.setStatus(_ctx.stringValue("DescribeVpcAttributeResponse.Status"));
		describeVpcAttributeResponse.setVpcId(_ctx.stringValue("DescribeVpcAttributeResponse.VpcId"));
		describeVpcAttributeResponse.setIsDefault(_ctx.booleanValue("DescribeVpcAttributeResponse.IsDefault"));
		describeVpcAttributeResponse.setClassicLinkEnabled(_ctx.booleanValue("DescribeVpcAttributeResponse.ClassicLinkEnabled"));
		describeVpcAttributeResponse.setOwnerId(_ctx.longValue("DescribeVpcAttributeResponse.OwnerId"));
		describeVpcAttributeResponse.setRegionId(_ctx.stringValue("DescribeVpcAttributeResponse.RegionId"));
		describeVpcAttributeResponse.setVpcName(_ctx.stringValue("DescribeVpcAttributeResponse.VpcName"));
		describeVpcAttributeResponse.setVRouterId(_ctx.stringValue("DescribeVpcAttributeResponse.VRouterId"));
		describeVpcAttributeResponse.setDhcpOptionsSetStatus(_ctx.stringValue("DescribeVpcAttributeResponse.DhcpOptionsSetStatus"));
		describeVpcAttributeResponse.setCidrBlock(_ctx.stringValue("DescribeVpcAttributeResponse.CidrBlock"));
		describeVpcAttributeResponse.setDescription(_ctx.stringValue("DescribeVpcAttributeResponse.Description"));
		describeVpcAttributeResponse.setNetworkAclNum(_ctx.stringValue("DescribeVpcAttributeResponse.NetworkAclNum"));
		describeVpcAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeVpcAttributeResponse.ResourceGroupId"));
		describeVpcAttributeResponse.setDhcpOptionsSetId(_ctx.stringValue("DescribeVpcAttributeResponse.DhcpOptionsSetId"));
		describeVpcAttributeResponse.setIpv6CidrBlock(_ctx.stringValue("DescribeVpcAttributeResponse.Ipv6CidrBlock"));
		describeVpcAttributeResponse.setSupportIpv4Gateway(_ctx.booleanValue("DescribeVpcAttributeResponse.SupportIpv4Gateway"));
		describeVpcAttributeResponse.setIpv4GatewayId(_ctx.stringValue("DescribeVpcAttributeResponse.Ipv4GatewayId"));
		describeVpcAttributeResponse.setEnabledIpv6(_ctx.booleanValue("DescribeVpcAttributeResponse.EnabledIpv6"));
		describeVpcAttributeResponse.setDnsHostnameStatus(_ctx.stringValue("DescribeVpcAttributeResponse.DnsHostnameStatus"));

		List<String> vSwitchIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcAttributeResponse.VSwitchIds.Length"); i++) {
			vSwitchIds.add(_ctx.stringValue("DescribeVpcAttributeResponse.VSwitchIds["+ i +"]"));
		}
		describeVpcAttributeResponse.setVSwitchIds(vSwitchIds);

		List<String> userCidrs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcAttributeResponse.UserCidrs.Length"); i++) {
			userCidrs.add(_ctx.stringValue("DescribeVpcAttributeResponse.UserCidrs["+ i +"]"));
		}
		describeVpcAttributeResponse.setUserCidrs(userCidrs);

		List<String> secondaryCidrBlocks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcAttributeResponse.SecondaryCidrBlocks.Length"); i++) {
			secondaryCidrBlocks.add(_ctx.stringValue("DescribeVpcAttributeResponse.SecondaryCidrBlocks["+ i +"]"));
		}
		describeVpcAttributeResponse.setSecondaryCidrBlocks(secondaryCidrBlocks);

		List<AssociatedCen> associatedCens = new ArrayList<AssociatedCen>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcAttributeResponse.AssociatedCens.Length"); i++) {
			AssociatedCen associatedCen = new AssociatedCen();
			associatedCen.setCenOwnerId(_ctx.longValue("DescribeVpcAttributeResponse.AssociatedCens["+ i +"].CenOwnerId"));
			associatedCen.setCenId(_ctx.stringValue("DescribeVpcAttributeResponse.AssociatedCens["+ i +"].CenId"));
			associatedCen.setCenStatus(_ctx.stringValue("DescribeVpcAttributeResponse.AssociatedCens["+ i +"].CenStatus"));

			associatedCens.add(associatedCen);
		}
		describeVpcAttributeResponse.setAssociatedCens(associatedCens);

		List<CloudResourceSetType> cloudResources = new ArrayList<CloudResourceSetType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcAttributeResponse.CloudResources.Length"); i++) {
			CloudResourceSetType cloudResourceSetType = new CloudResourceSetType();
			cloudResourceSetType.setResourceCount(_ctx.integerValue("DescribeVpcAttributeResponse.CloudResources["+ i +"].ResourceCount"));
			cloudResourceSetType.setResourceType(_ctx.stringValue("DescribeVpcAttributeResponse.CloudResources["+ i +"].ResourceType"));

			cloudResources.add(cloudResourceSetType);
		}
		describeVpcAttributeResponse.setCloudResources(cloudResources);

		List<Ipv6CidrBlock> ipv6CidrBlocks = new ArrayList<Ipv6CidrBlock>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcAttributeResponse.Ipv6CidrBlocks.Length"); i++) {
			Ipv6CidrBlock ipv6CidrBlock = new Ipv6CidrBlock();
			ipv6CidrBlock.setIpv6Isp(_ctx.stringValue("DescribeVpcAttributeResponse.Ipv6CidrBlocks["+ i +"].Ipv6Isp"));
			ipv6CidrBlock.setIpv6CidrBlock(_ctx.stringValue("DescribeVpcAttributeResponse.Ipv6CidrBlocks["+ i +"].Ipv6CidrBlock"));

			ipv6CidrBlocks.add(ipv6CidrBlock);
		}
		describeVpcAttributeResponse.setIpv6CidrBlocks(ipv6CidrBlocks);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcAttributeResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeVpcAttributeResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeVpcAttributeResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		describeVpcAttributeResponse.setTags(tags);

		List<AssociatedPropagationSourcesItem> associatedPropagationSources = new ArrayList<AssociatedPropagationSourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcAttributeResponse.AssociatedPropagationSources.Length"); i++) {
			AssociatedPropagationSourcesItem associatedPropagationSourcesItem = new AssociatedPropagationSourcesItem();
			associatedPropagationSourcesItem.setSourceType(_ctx.stringValue("DescribeVpcAttributeResponse.AssociatedPropagationSources["+ i +"].SourceType"));
			associatedPropagationSourcesItem.setSourceOwnerId(_ctx.longValue("DescribeVpcAttributeResponse.AssociatedPropagationSources["+ i +"].SourceOwnerId"));
			associatedPropagationSourcesItem.setSourceInstanceId(_ctx.stringValue("DescribeVpcAttributeResponse.AssociatedPropagationSources["+ i +"].SourceInstanceId"));
			associatedPropagationSourcesItem.setStatus(_ctx.stringValue("DescribeVpcAttributeResponse.AssociatedPropagationSources["+ i +"].Status"));
			associatedPropagationSourcesItem.setRoutePropagated(_ctx.booleanValue("DescribeVpcAttributeResponse.AssociatedPropagationSources["+ i +"].RoutePropagated"));

			associatedPropagationSources.add(associatedPropagationSourcesItem);
		}
		describeVpcAttributeResponse.setAssociatedPropagationSources(associatedPropagationSources);
	 
	 	return describeVpcAttributeResponse;
	}
}