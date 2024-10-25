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

import com.aliyuncs.vpc.model.v20160428.DescribeVpcsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpcsResponse.Vpc;
import com.aliyuncs.vpc.model.v20160428.DescribeVpcsResponse.Vpc.Ipv6CidrBlock;
import com.aliyuncs.vpc.model.v20160428.DescribeVpcsResponse.Vpc.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcsResponseUnmarshaller {

	public static DescribeVpcsResponse unmarshall(DescribeVpcsResponse describeVpcsResponse, UnmarshallerContext _ctx) {
		
		describeVpcsResponse.setRequestId(_ctx.stringValue("DescribeVpcsResponse.RequestId"));
		describeVpcsResponse.setPageSize(_ctx.integerValue("DescribeVpcsResponse.PageSize"));
		describeVpcsResponse.setPageNumber(_ctx.integerValue("DescribeVpcsResponse.PageNumber"));
		describeVpcsResponse.setTotalCount(_ctx.integerValue("DescribeVpcsResponse.TotalCount"));

		List<Vpc> vpcs = new ArrayList<Vpc>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcsResponse.Vpcs.Length"); i++) {
			Vpc vpc = new Vpc();
			vpc.setCreationTime(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].CreationTime"));
			vpc.setStatus(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Status"));
			vpc.setVpcId(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VpcId"));
			vpc.setIsDefault(_ctx.booleanValue("DescribeVpcsResponse.Vpcs["+ i +"].IsDefault"));
			vpc.setAdvancedResource(_ctx.booleanValue("DescribeVpcsResponse.Vpcs["+ i +"].AdvancedResource"));
			vpc.setOwnerId(_ctx.longValue("DescribeVpcsResponse.Vpcs["+ i +"].OwnerId"));
			vpc.setRegionId(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].RegionId"));
			vpc.setVpcName(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VpcName"));
			vpc.setVRouterId(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VRouterId"));
			vpc.setDhcpOptionsSetStatus(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].DhcpOptionsSetStatus"));
			vpc.setCidrBlock(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].CidrBlock"));
			vpc.setDescription(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Description"));
			vpc.setNetworkAclNum(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].NetworkAclNum"));
			vpc.setSupportAdvancedFeature(_ctx.booleanValue("DescribeVpcsResponse.Vpcs["+ i +"].SupportAdvancedFeature"));
			vpc.setResourceGroupId(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].ResourceGroupId"));
			vpc.setDhcpOptionsSetId(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].DhcpOptionsSetId"));
			vpc.setIpv6CidrBlock(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Ipv6CidrBlock"));
			vpc.setCenStatus(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].CenStatus"));
			vpc.setEnabledIpv6(_ctx.booleanValue("DescribeVpcsResponse.Vpcs["+ i +"].EnabledIpv6"));
			vpc.setDnsHostnameStatus(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].DnsHostnameStatus"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchIds["+ j +"]"));
			}
			vpc.setVSwitchIds(vSwitchIds);

			List<String> secondaryCidrBlocks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].SecondaryCidrBlocks.Length"); j++) {
				secondaryCidrBlocks.add(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].SecondaryCidrBlocks["+ j +"]"));
			}
			vpc.setSecondaryCidrBlocks(secondaryCidrBlocks);

			List<String> userCidrs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].UserCidrs.Length"); j++) {
				userCidrs.add(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].UserCidrs["+ j +"]"));
			}
			vpc.setUserCidrs(userCidrs);

			List<String> natGatewayIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].NatGatewayIds.Length"); j++) {
				natGatewayIds.add(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].NatGatewayIds["+ j +"]"));
			}
			vpc.setNatGatewayIds(natGatewayIds);

			List<String> routerTableIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].RouterTableIds.Length"); j++) {
				routerTableIds.add(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].RouterTableIds["+ j +"]"));
			}
			vpc.setRouterTableIds(routerTableIds);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			vpc.setTags(tags);

			List<Ipv6CidrBlock> ipv6CidrBlocks = new ArrayList<Ipv6CidrBlock>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].Ipv6CidrBlocks.Length"); j++) {
				Ipv6CidrBlock ipv6CidrBlock = new Ipv6CidrBlock();
				ipv6CidrBlock.setIpv6Isp(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Ipv6CidrBlocks["+ j +"].Ipv6Isp"));
				ipv6CidrBlock.setIpv6CidrBlock(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Ipv6CidrBlocks["+ j +"].Ipv6CidrBlock"));

				ipv6CidrBlocks.add(ipv6CidrBlock);
			}
			vpc.setIpv6CidrBlocks(ipv6CidrBlocks);

			vpcs.add(vpc);
		}
		describeVpcsResponse.setVpcs(vpcs);
	 
	 	return describeVpcsResponse;
	}
}