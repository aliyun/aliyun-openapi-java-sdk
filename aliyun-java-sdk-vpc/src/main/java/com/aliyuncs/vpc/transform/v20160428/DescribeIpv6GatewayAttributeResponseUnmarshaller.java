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

import com.aliyuncs.vpc.model.v20160428.DescribeIpv6GatewayAttributeResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeIpv6GatewayAttributeResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpv6GatewayAttributeResponseUnmarshaller {

	public static DescribeIpv6GatewayAttributeResponse unmarshall(DescribeIpv6GatewayAttributeResponse describeIpv6GatewayAttributeResponse, UnmarshallerContext _ctx) {
		
		describeIpv6GatewayAttributeResponse.setRequestId(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.RequestId"));
		describeIpv6GatewayAttributeResponse.setVpcId(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.VpcId"));
		describeIpv6GatewayAttributeResponse.setStatus(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.Status"));
		describeIpv6GatewayAttributeResponse.setCreationTime(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.CreationTime"));
		describeIpv6GatewayAttributeResponse.setSpec(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.Spec"));
		describeIpv6GatewayAttributeResponse.setRegionId(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.RegionId"));
		describeIpv6GatewayAttributeResponse.setInstanceChargeType(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.InstanceChargeType"));
		describeIpv6GatewayAttributeResponse.setIpv6GatewayId(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.Ipv6GatewayId"));
		describeIpv6GatewayAttributeResponse.setDescription(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.Description"));
		describeIpv6GatewayAttributeResponse.setExpiredTime(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.ExpiredTime"));
		describeIpv6GatewayAttributeResponse.setBusinessStatus(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.BusinessStatus"));
		describeIpv6GatewayAttributeResponse.setName(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.Name"));
		describeIpv6GatewayAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.ResourceGroupId"));
		describeIpv6GatewayAttributeResponse.setGatewayRouteTableId(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.GatewayRouteTableId"));
		describeIpv6GatewayAttributeResponse.setOwnerId(_ctx.longValue("DescribeIpv6GatewayAttributeResponse.OwnerId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIpv6GatewayAttributeResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeIpv6GatewayAttributeResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		describeIpv6GatewayAttributeResponse.setTags(tags);
	 
	 	return describeIpv6GatewayAttributeResponse;
	}
}