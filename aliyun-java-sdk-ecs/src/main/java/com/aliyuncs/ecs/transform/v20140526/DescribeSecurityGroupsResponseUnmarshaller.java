/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsResponse.SecurityGroup;
import com.aliyuncs.ecs.model.v20140526.DescribeSecurityGroupsResponse.SecurityGroup.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityGroupsResponseUnmarshaller {

	public static DescribeSecurityGroupsResponse unmarshall(DescribeSecurityGroupsResponse describeSecurityGroupsResponse, UnmarshallerContext context) {
		
		describeSecurityGroupsResponse.setRequestId(context.stringValue("DescribeSecurityGroupsResponse.RequestId"));
		describeSecurityGroupsResponse.setRegionId(context.stringValue("DescribeSecurityGroupsResponse.RegionId"));
		describeSecurityGroupsResponse.setTotalCount(context.integerValue("DescribeSecurityGroupsResponse.TotalCount"));
		describeSecurityGroupsResponse.setPageNumber(context.integerValue("DescribeSecurityGroupsResponse.PageNumber"));
		describeSecurityGroupsResponse.setPageSize(context.integerValue("DescribeSecurityGroupsResponse.PageSize"));

		List<SecurityGroup> securityGroups = new ArrayList<SecurityGroup>();
		for (int i = 0; i < context.lengthValue("DescribeSecurityGroupsResponse.SecurityGroups.Length"); i++) {
			SecurityGroup securityGroup = new SecurityGroup();
			securityGroup.setSecurityGroupId(context.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].SecurityGroupId"));
			securityGroup.setDescription(context.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].Description"));
			securityGroup.setSecurityGroupName(context.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].SecurityGroupName"));
			securityGroup.setVpcId(context.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].VpcId"));
			securityGroup.setCreationTime(context.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].CreationTime"));
			securityGroup.setAvailableInstanceAmount(context.integerValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].AvailableInstanceAmount"));
			securityGroup.setEcsCount(context.integerValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].EcsCount"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			securityGroup.setTags(tags);

			securityGroups.add(securityGroup);
		}
		describeSecurityGroupsResponse.setSecurityGroups(securityGroups);
	 
	 	return describeSecurityGroupsResponse;
	}
}