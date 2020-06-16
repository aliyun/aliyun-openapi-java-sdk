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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeSecurityGroupsResponse;
import com.aliyuncs.ens.model.v20171110.DescribeSecurityGroupsResponse.SecurityGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityGroupsResponseUnmarshaller {

	public static DescribeSecurityGroupsResponse unmarshall(DescribeSecurityGroupsResponse describeSecurityGroupsResponse, UnmarshallerContext _ctx) {
		
		describeSecurityGroupsResponse.setRequestId(_ctx.stringValue("DescribeSecurityGroupsResponse.RequestId"));
		describeSecurityGroupsResponse.setTotalCount(_ctx.integerValue("DescribeSecurityGroupsResponse.TotalCount"));
		describeSecurityGroupsResponse.setPageNumber(_ctx.integerValue("DescribeSecurityGroupsResponse.PageNumber"));
		describeSecurityGroupsResponse.setPageSize(_ctx.integerValue("DescribeSecurityGroupsResponse.PageSize"));

		List<SecurityGroup> securityGroups = new ArrayList<SecurityGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityGroupsResponse.SecurityGroups.Length"); i++) {
			SecurityGroup securityGroup = new SecurityGroup();
			securityGroup.setSecurityGroupId(_ctx.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].SecurityGroupId"));
			securityGroup.setCreationTime(_ctx.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].CreationTime"));
			securityGroup.setSecurityGroupName(_ctx.stringValue("DescribeSecurityGroupsResponse.SecurityGroups["+ i +"].SecurityGroupName"));

			securityGroups.add(securityGroup);
		}
		describeSecurityGroupsResponse.setSecurityGroups(securityGroups);
	 
	 	return describeSecurityGroupsResponse;
	}
}