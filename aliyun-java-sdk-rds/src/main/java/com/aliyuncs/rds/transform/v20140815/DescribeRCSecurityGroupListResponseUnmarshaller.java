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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCSecurityGroupListResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCSecurityGroupListResponse.RCSecurityGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCSecurityGroupListResponseUnmarshaller {

	public static DescribeRCSecurityGroupListResponse unmarshall(DescribeRCSecurityGroupListResponse describeRCSecurityGroupListResponse, UnmarshallerContext _ctx) {
		
		describeRCSecurityGroupListResponse.setRequestId(_ctx.stringValue("DescribeRCSecurityGroupListResponse.RequestId"));

		List<RCSecurityGroup> rCSecurityGroups = new ArrayList<RCSecurityGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCSecurityGroupListResponse.RCSecurityGroups.Length"); i++) {
			RCSecurityGroup rCSecurityGroup = new RCSecurityGroup();
			rCSecurityGroup.setSecurityGroupId(_ctx.stringValue("DescribeRCSecurityGroupListResponse.RCSecurityGroups["+ i +"].SecurityGroupId"));
			rCSecurityGroup.setDescription(_ctx.stringValue("DescribeRCSecurityGroupListResponse.RCSecurityGroups["+ i +"].Description"));
			rCSecurityGroup.setSecurityGroupType(_ctx.stringValue("DescribeRCSecurityGroupListResponse.RCSecurityGroups["+ i +"].SecurityGroupType"));
			rCSecurityGroup.setVpcId(_ctx.stringValue("DescribeRCSecurityGroupListResponse.RCSecurityGroups["+ i +"].VpcId"));
			rCSecurityGroup.setCreationTime(_ctx.stringValue("DescribeRCSecurityGroupListResponse.RCSecurityGroups["+ i +"].CreationTime"));
			rCSecurityGroup.setInstanceCount(_ctx.integerValue("DescribeRCSecurityGroupListResponse.RCSecurityGroups["+ i +"].InstanceCount"));
			rCSecurityGroup.setAvailableInstanceAmount(_ctx.integerValue("DescribeRCSecurityGroupListResponse.RCSecurityGroups["+ i +"].AvailableInstanceAmount"));

			rCSecurityGroups.add(rCSecurityGroup);
		}
		describeRCSecurityGroupListResponse.setRCSecurityGroups(rCSecurityGroups);
	 
	 	return describeRCSecurityGroupListResponse;
	}
}