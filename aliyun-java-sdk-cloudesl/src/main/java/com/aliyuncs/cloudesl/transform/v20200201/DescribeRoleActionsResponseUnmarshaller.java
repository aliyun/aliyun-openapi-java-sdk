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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeRoleActionsResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeRoleActionsResponse.RoleAclInfo;
import com.aliyuncs.cloudesl.model.v20200201.DescribeRoleActionsResponse.RoleAclInfo.RoleActionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRoleActionsResponseUnmarshaller {

	public static DescribeRoleActionsResponse unmarshall(DescribeRoleActionsResponse describeRoleActionsResponse, UnmarshallerContext _ctx) {
		
		describeRoleActionsResponse.setRequestId(_ctx.stringValue("DescribeRoleActionsResponse.RequestId"));
		describeRoleActionsResponse.setErrorMessage(_ctx.stringValue("DescribeRoleActionsResponse.ErrorMessage"));
		describeRoleActionsResponse.setErrorCode(_ctx.stringValue("DescribeRoleActionsResponse.ErrorCode"));
		describeRoleActionsResponse.setMessage(_ctx.stringValue("DescribeRoleActionsResponse.Message"));
		describeRoleActionsResponse.setDynamicCode(_ctx.stringValue("DescribeRoleActionsResponse.DynamicCode"));
		describeRoleActionsResponse.setCode(_ctx.stringValue("DescribeRoleActionsResponse.Code"));
		describeRoleActionsResponse.setDynamicMessage(_ctx.stringValue("DescribeRoleActionsResponse.DynamicMessage"));
		describeRoleActionsResponse.setSuccess(_ctx.booleanValue("DescribeRoleActionsResponse.Success"));

		List<RoleAclInfo> roleAclInfos = new ArrayList<RoleAclInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRoleActionsResponse.RoleAclInfos.Length"); i++) {
			RoleAclInfo roleAclInfo = new RoleAclInfo();
			roleAclInfo.setRoleCode(_ctx.stringValue("DescribeRoleActionsResponse.RoleAclInfos["+ i +"].RoleCode"));
			roleAclInfo.setName(_ctx.stringValue("DescribeRoleActionsResponse.RoleAclInfos["+ i +"].Name"));

			List<RoleActionInfo> accessControlLists = new ArrayList<RoleActionInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRoleActionsResponse.RoleAclInfos["+ i +"].AccessControlLists.Length"); j++) {
				RoleActionInfo roleActionInfo = new RoleActionInfo();
				roleActionInfo.setCode(_ctx.stringValue("DescribeRoleActionsResponse.RoleAclInfos["+ i +"].AccessControlLists["+ j +"].Code"));

				accessControlLists.add(roleActionInfo);
			}
			roleAclInfo.setAccessControlLists(accessControlLists);

			roleAclInfos.add(roleAclInfo);
		}
		describeRoleActionsResponse.setRoleAclInfos(roleAclInfos);
	 
	 	return describeRoleActionsResponse;
	}
}