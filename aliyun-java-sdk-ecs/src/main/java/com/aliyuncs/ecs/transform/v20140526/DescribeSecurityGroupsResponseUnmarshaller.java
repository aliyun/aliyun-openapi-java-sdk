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

import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsResponse.SecurityGroup;
import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsResponse.SecurityGroup.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityGroupsResponseUnmarshaller {

	public static DescribeSecurityGroupsResponse unmarshall(DescribeSecurityGroupsResponse describeSecurityGroupsResponse, UnmarshallerContext _ctx) {
		
		describeSecurityGroupsResponse.setRequestId(_ctx.stringValue("DescribeSecurityGroupsResponse.RequestId"));
		describeSecurityGroupsResponse.setTotalCount(_ctx.integerValue("DescribeSecurityGroupsResponse.TotalCount"));
		describeSecurityGroupsResponse.setNextToken(_ctx.stringValue("DescribeSecurityGroupsResponse.NextToken"));
		describeSecurityGroupsResponse.setPageSize(_ctx.integerValue("DescribeSecurityGroupsResponse.PageSize"));
		describeSecurityGroupsResponse.setPageNumber(_ctx.integerValue("DescribeSecurityGroupsResponse.PageNumber"));
		describeSecurityGroupsResponse.setRegionId(_ctx.stringValue("DescribeSecurityGroupsResponse.RegionId"));

		List<SecurityGroup> securityGroups = new ArrayList<SecurityGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityGroupsResponse.SecurityGroups.Length"); i++) {
			SecurityGroup securityGroup = new SecurityGroup();
			securityGroup.setRuleCount(_ctx.integerValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].RuleCount"));
			securityGroup.setEcsCount(_ctx.integerValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].EcsCount"));
			securityGroup.setDescription(_ctx.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].Description"));
			securityGroup.setSecurityGroupName(_ctx.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].SecurityGroupName"));
			securityGroup.setResourceGroupId(_ctx.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].ResourceGroupId"));
			securityGroup.setServiceManaged(_ctx.booleanValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].ServiceManaged"));
			securityGroup.setSecurityGroupId(_ctx.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].SecurityGroupId"));
			securityGroup.setSecurityGroupType(_ctx.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].SecurityGroupType"));
			securityGroup.setAvailableInstanceAmount(_ctx.integerValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].AvailableInstanceAmount"));
			securityGroup.setServiceID(_ctx.longValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].ServiceID"));
			securityGroup.setVpcId(_ctx.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].VpcId"));
			securityGroup.setGroupToGroupRuleCount(_ctx.integerValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].GroupToGroupRuleCount"));
			securityGroup.setCreationTime(_ctx.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].CreationTime"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			securityGroup.setTags(tags);

			securityGroups.add(securityGroup);
		}
		describeSecurityGroupsResponse.setSecurityGroups(securityGroups);
	 
	 	return describeSecurityGroupsResponse;
	}
}