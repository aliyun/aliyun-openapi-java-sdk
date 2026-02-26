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

package com.aliyuncs.pts.transform.v20201020;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20201020.GetUserVpcSecurityGroupResponse;
import com.aliyuncs.pts.model.v20201020.GetUserVpcSecurityGroupResponse.SecurityGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserVpcSecurityGroupResponseUnmarshaller {

	public static GetUserVpcSecurityGroupResponse unmarshall(GetUserVpcSecurityGroupResponse getUserVpcSecurityGroupResponse, UnmarshallerContext _ctx) {
		
		getUserVpcSecurityGroupResponse.setRequestId(_ctx.stringValue("GetUserVpcSecurityGroupResponse.RequestId"));
		getUserVpcSecurityGroupResponse.setSecurityGroupCount(_ctx.integerValue("GetUserVpcSecurityGroupResponse.SecurityGroupCount"));
		getUserVpcSecurityGroupResponse.setMessage(_ctx.stringValue("GetUserVpcSecurityGroupResponse.Message"));
		getUserVpcSecurityGroupResponse.setPageSize(_ctx.integerValue("GetUserVpcSecurityGroupResponse.PageSize"));
		getUserVpcSecurityGroupResponse.setPageNumber(_ctx.integerValue("GetUserVpcSecurityGroupResponse.PageNumber"));
		getUserVpcSecurityGroupResponse.setHttpStatusCode(_ctx.integerValue("GetUserVpcSecurityGroupResponse.HttpStatusCode"));
		getUserVpcSecurityGroupResponse.setCode(_ctx.stringValue("GetUserVpcSecurityGroupResponse.Code"));
		getUserVpcSecurityGroupResponse.setSuccess(_ctx.booleanValue("GetUserVpcSecurityGroupResponse.Success"));

		List<SecurityGroup> securityGroupList = new ArrayList<SecurityGroup>();
		for (int i = 0; i < _ctx.lengthValue("GetUserVpcSecurityGroupResponse.SecurityGroupList.Length"); i++) {
			SecurityGroup securityGroup = new SecurityGroup();
			securityGroup.setVpcId(_ctx.stringValue("GetUserVpcSecurityGroupResponse.SecurityGroupList["+ i +"].VpcId"));
			securityGroup.setDescription(_ctx.stringValue("GetUserVpcSecurityGroupResponse.SecurityGroupList["+ i +"].Description"));
			securityGroup.setSecurityGroupId(_ctx.stringValue("GetUserVpcSecurityGroupResponse.SecurityGroupList["+ i +"].SecurityGroupId"));
			securityGroup.setSecurityGroupName(_ctx.stringValue("GetUserVpcSecurityGroupResponse.SecurityGroupList["+ i +"].SecurityGroupName"));

			securityGroupList.add(securityGroup);
		}
		getUserVpcSecurityGroupResponse.setSecurityGroupList(securityGroupList);
	 
	 	return getUserVpcSecurityGroupResponse;
	}
}