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
import com.aliyuncs.vpc.model.v20160428.DescribeVpcAttributeResponse.CloudResourceSetType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcAttributeResponseUnmarshaller {

	public static DescribeVpcAttributeResponse unmarshall(DescribeVpcAttributeResponse describeVpcAttributeResponse, UnmarshallerContext _ctx) {
		
		describeVpcAttributeResponse.setRequestId(_ctx.stringValue("DescribeVpcAttributeResponse.RequestId"));
		describeVpcAttributeResponse.setVpcId(_ctx.stringValue("DescribeVpcAttributeResponse.VpcId"));
		describeVpcAttributeResponse.setRegionId(_ctx.stringValue("DescribeVpcAttributeResponse.RegionId"));
		describeVpcAttributeResponse.setStatus(_ctx.stringValue("DescribeVpcAttributeResponse.Status"));
		describeVpcAttributeResponse.setVpcName(_ctx.stringValue("DescribeVpcAttributeResponse.VpcName"));
		describeVpcAttributeResponse.setCreationTime(_ctx.stringValue("DescribeVpcAttributeResponse.CreationTime"));
		describeVpcAttributeResponse.setCidrBlock(_ctx.stringValue("DescribeVpcAttributeResponse.CidrBlock"));
		describeVpcAttributeResponse.setIpv6CidrBlock(_ctx.stringValue("DescribeVpcAttributeResponse.Ipv6CidrBlock"));
		describeVpcAttributeResponse.setVRouterId(_ctx.stringValue("DescribeVpcAttributeResponse.VRouterId"));
		describeVpcAttributeResponse.setDescription(_ctx.stringValue("DescribeVpcAttributeResponse.Description"));
		describeVpcAttributeResponse.setIsDefault(_ctx.booleanValue("DescribeVpcAttributeResponse.IsDefault"));
		describeVpcAttributeResponse.setClassicLinkEnabled(_ctx.booleanValue("DescribeVpcAttributeResponse.ClassicLinkEnabled"));
		describeVpcAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeVpcAttributeResponse.ResourceGroupId"));
		describeVpcAttributeResponse.setNetworkAclNum(_ctx.stringValue("DescribeVpcAttributeResponse.NetworkAclNum"));

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
			associatedCen.setCenId(_ctx.stringValue("DescribeVpcAttributeResponse.AssociatedCens["+ i +"].CenId"));
			associatedCen.setCenOwnerId(_ctx.longValue("DescribeVpcAttributeResponse.AssociatedCens["+ i +"].CenOwnerId"));
			associatedCen.setCenStatus(_ctx.stringValue("DescribeVpcAttributeResponse.AssociatedCens["+ i +"].CenStatus"));

			associatedCens.add(associatedCen);
		}
		describeVpcAttributeResponse.setAssociatedCens(associatedCens);

		List<CloudResourceSetType> cloudResources = new ArrayList<CloudResourceSetType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcAttributeResponse.CloudResources.Length"); i++) {
			CloudResourceSetType cloudResourceSetType = new CloudResourceSetType();
			cloudResourceSetType.setResourceType(_ctx.stringValue("DescribeVpcAttributeResponse.CloudResources["+ i +"].ResourceType"));
			cloudResourceSetType.setResourceCount(_ctx.integerValue("DescribeVpcAttributeResponse.CloudResources["+ i +"].ResourceCount"));

			cloudResources.add(cloudResourceSetType);
		}
		describeVpcAttributeResponse.setCloudResources(cloudResources);
	 
	 	return describeVpcAttributeResponse;
	}
}