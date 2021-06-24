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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSecurityGroupsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSecurityGroupsResponse.SecurityGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeSecurityGroupsResponseUnmarshaller {

	public static OpsDescribeSecurityGroupsResponse unmarshall(OpsDescribeSecurityGroupsResponse opsDescribeSecurityGroupsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeSecurityGroupsResponse.setRequestId(_ctx.stringValue("OpsDescribeSecurityGroupsResponse.RequestId"));
		opsDescribeSecurityGroupsResponse.setTotalCount(_ctx.integerValue("OpsDescribeSecurityGroupsResponse.TotalCount"));
		opsDescribeSecurityGroupsResponse.setPageSize(_ctx.integerValue("OpsDescribeSecurityGroupsResponse.PageSize"));
		opsDescribeSecurityGroupsResponse.setPageNumber(_ctx.integerValue("OpsDescribeSecurityGroupsResponse.PageNumber"));

		List<SecurityGroup> securityGroups = new ArrayList<SecurityGroup>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeSecurityGroupsResponse.SecurityGroups.Length"); i++) {
			SecurityGroup securityGroup = new SecurityGroup();
			securityGroup.setVpcId(_ctx.stringValue("OpsDescribeSecurityGroupsResponse.SecurityGroups["+ i +"].VpcId"));
			securityGroup.setModifiedTime(_ctx.stringValue("OpsDescribeSecurityGroupsResponse.SecurityGroups["+ i +"].ModifiedTime"));
			securityGroup.setDescription(_ctx.stringValue("OpsDescribeSecurityGroupsResponse.SecurityGroups["+ i +"].Description"));
			securityGroup.setSecurityGroupId(_ctx.stringValue("OpsDescribeSecurityGroupsResponse.SecurityGroups["+ i +"].SecurityGroupId"));
			securityGroup.setSecurityGroupName(_ctx.stringValue("OpsDescribeSecurityGroupsResponse.SecurityGroups["+ i +"].SecurityGroupName"));
			securityGroup.setEcsCount(_ctx.integerValue("OpsDescribeSecurityGroupsResponse.SecurityGroups["+ i +"].EcsCount"));
			securityGroup.setCreatedTime(_ctx.stringValue("OpsDescribeSecurityGroupsResponse.SecurityGroups["+ i +"].CreatedTime"));
			securityGroup.setGroupType(_ctx.stringValue("OpsDescribeSecurityGroupsResponse.SecurityGroups["+ i +"].GroupType"));
			securityGroup.setAvailableInstanceAmount(_ctx.longValue("OpsDescribeSecurityGroupsResponse.SecurityGroups["+ i +"].AvailableInstanceAmount"));
			securityGroup.setRegionId(_ctx.stringValue("OpsDescribeSecurityGroupsResponse.SecurityGroups["+ i +"].RegionId"));

			securityGroups.add(securityGroup);
		}
		opsDescribeSecurityGroupsResponse.setSecurityGroups(securityGroups);
	 
	 	return opsDescribeSecurityGroupsResponse;
	}
}