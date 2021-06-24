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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeGlobalSecurityGroupsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeGlobalSecurityGroupsResponse.SecurityGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeGlobalSecurityGroupsResponseUnmarshaller {

	public static OpsDescribeGlobalSecurityGroupsResponse unmarshall(OpsDescribeGlobalSecurityGroupsResponse opsDescribeGlobalSecurityGroupsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeGlobalSecurityGroupsResponse.setRequestId(_ctx.stringValue("OpsDescribeGlobalSecurityGroupsResponse.RequestId"));
		opsDescribeGlobalSecurityGroupsResponse.setPageSize(_ctx.integerValue("OpsDescribeGlobalSecurityGroupsResponse.PageSize"));
		opsDescribeGlobalSecurityGroupsResponse.setPageNumber(_ctx.integerValue("OpsDescribeGlobalSecurityGroupsResponse.PageNumber"));
		opsDescribeGlobalSecurityGroupsResponse.setTotal(_ctx.integerValue("OpsDescribeGlobalSecurityGroupsResponse.Total"));

		List<SecurityGroup> securityGroups = new ArrayList<SecurityGroup>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups.Length"); i++) {
			SecurityGroup securityGroup = new SecurityGroup();
			securityGroup.setType(_ctx.stringValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].Type"));
			securityGroup.setVpcId(_ctx.stringValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].VpcId"));
			securityGroup.setSecurityGroupId(_ctx.stringValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].SecurityGroupId"));
			securityGroup.setRegionNo(_ctx.stringValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].RegionNo"));
			securityGroup.setDefaultGroup(_ctx.booleanValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].DefaultGroup"));
			securityGroup.setAliUid(_ctx.longValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].AliUid"));
			securityGroup.setEcsNum(_ctx.integerValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].EcsNum"));
			securityGroup.setBid(_ctx.stringValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].Bid"));
			securityGroup.setAuthed(_ctx.booleanValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].Authed"));
			securityGroup.setModifiedTime(_ctx.stringValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].ModifiedTime"));
			securityGroup.setDescription(_ctx.stringValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].Description"));
			securityGroup.setSecurityGroupName(_ctx.stringValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].SecurityGroupName"));
			securityGroup.setGroupType(_ctx.integerValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].GroupType"));
			securityGroup.setCreatedTime(_ctx.stringValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].CreatedTime"));
			securityGroup.setId(_ctx.longValue("OpsDescribeGlobalSecurityGroupsResponse.SecurityGroups["+ i +"].Id"));

			securityGroups.add(securityGroup);
		}
		opsDescribeGlobalSecurityGroupsResponse.setSecurityGroups(securityGroups);
	 
	 	return opsDescribeGlobalSecurityGroupsResponse;
	}
}