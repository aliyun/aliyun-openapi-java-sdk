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

import com.aliyuncs.emr.model.v20160408.ListSecurityGroupResponse;
import com.aliyuncs.emr.model.v20160408.ListSecurityGroupResponse.SecurityGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecurityGroupResponseUnmarshaller {

	public static ListSecurityGroupResponse unmarshall(ListSecurityGroupResponse listSecurityGroupResponse, UnmarshallerContext _ctx) {
		
		listSecurityGroupResponse.setRequestId(_ctx.stringValue("ListSecurityGroupResponse.RequestId"));

		List<SecurityGroup> securityGroupList = new ArrayList<SecurityGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListSecurityGroupResponse.SecurityGroupList.Length"); i++) {
			SecurityGroup securityGroup = new SecurityGroup();
			securityGroup.setSecurityGroupId(_ctx.stringValue("ListSecurityGroupResponse.SecurityGroupList["+ i +"].SecurityGroupId"));
			securityGroup.setDescription(_ctx.stringValue("ListSecurityGroupResponse.SecurityGroupList["+ i +"].Description"));
			securityGroup.setSecurityGroupName(_ctx.stringValue("ListSecurityGroupResponse.SecurityGroupList["+ i +"].SecurityGroupName"));
			securityGroup.setVpcId(_ctx.stringValue("ListSecurityGroupResponse.SecurityGroupList["+ i +"].VpcId"));
			securityGroup.setCreationTime(_ctx.stringValue("ListSecurityGroupResponse.SecurityGroupList["+ i +"].CreationTime"));
			securityGroup.setSecurityGroupType(_ctx.stringValue("ListSecurityGroupResponse.SecurityGroupList["+ i +"].SecurityGroupType"));
			securityGroup.setAvailableInstanceAmount(_ctx.integerValue("ListSecurityGroupResponse.SecurityGroupList["+ i +"].AvailableInstanceAmount"));
			securityGroup.setEcsCount(_ctx.integerValue("ListSecurityGroupResponse.SecurityGroupList["+ i +"].EcsCount"));

			securityGroupList.add(securityGroup);
		}
		listSecurityGroupResponse.setSecurityGroupList(securityGroupList);
	 
	 	return listSecurityGroupResponse;
	}
}