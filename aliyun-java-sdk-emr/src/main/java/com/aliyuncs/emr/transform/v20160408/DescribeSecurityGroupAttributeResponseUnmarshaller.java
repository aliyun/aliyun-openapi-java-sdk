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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeSecurityGroupAttributeResponse;
import com.aliyuncs.emr.model.v20160408.DescribeSecurityGroupAttributeResponse.SecurityGroup;
import com.aliyuncs.emr.model.v20160408.DescribeSecurityGroupAttributeResponse.SecurityGroupAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityGroupAttributeResponseUnmarshaller {

	public static DescribeSecurityGroupAttributeResponse unmarshall(DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeResponse, UnmarshallerContext _ctx) {
		
		describeSecurityGroupAttributeResponse.setRequestId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.RequestId"));

		List<SecurityGroup> availableGroupList = new ArrayList<SecurityGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityGroupAttributeResponse.AvailableGroupList.Length"); i++) {
			SecurityGroup securityGroup = new SecurityGroup();
			securityGroup.setSecurityGroupId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.AvailableGroupList["+ i +"].SecurityGroupId"));
			securityGroup.setDescription(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.AvailableGroupList["+ i +"].Description"));
			securityGroup.setSecurityGroupName(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.AvailableGroupList["+ i +"].SecurityGroupName"));
			securityGroup.setVpcId(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.AvailableGroupList["+ i +"].VpcId"));
			securityGroup.setCreationTime(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.AvailableGroupList["+ i +"].CreationTime"));
			securityGroup.setAvailableInstanceAmount(_ctx.integerValue("DescribeSecurityGroupAttributeResponse.AvailableGroupList["+ i +"].AvailableInstanceAmount"));
			securityGroup.setEcsCount(_ctx.integerValue("DescribeSecurityGroupAttributeResponse.AvailableGroupList["+ i +"].EcsCount"));

			availableGroupList.add(securityGroup);
		}
		describeSecurityGroupAttributeResponse.setAvailableGroupList(availableGroupList);

		List<SecurityGroupAttribute> securityGroupAttributeList = new ArrayList<SecurityGroupAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityGroupAttributeResponse.SecurityGroupAttributeList.Length"); i++) {
			SecurityGroupAttribute securityGroupAttribute = new SecurityGroupAttribute();
			securityGroupAttribute.setBizType(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.SecurityGroupAttributeList["+ i +"].BizType"));
			securityGroupAttribute.setBizContent(_ctx.stringValue("DescribeSecurityGroupAttributeResponse.SecurityGroupAttributeList["+ i +"].BizContent"));

			securityGroupAttributeList.add(securityGroupAttribute);
		}
		describeSecurityGroupAttributeResponse.setSecurityGroupAttributeList(securityGroupAttributeList);
	 
	 	return describeSecurityGroupAttributeResponse;
	}
}