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

package com.aliyuncs.linkedmall.transform.v20210616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20210616.QueryRolesByPartialRoleCodeResponse;
import com.aliyuncs.linkedmall.model.v20210616.QueryRolesByPartialRoleCodeResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRolesByPartialRoleCodeResponseUnmarshaller {

	public static QueryRolesByPartialRoleCodeResponse unmarshall(QueryRolesByPartialRoleCodeResponse queryRolesByPartialRoleCodeResponse, UnmarshallerContext _ctx) {
		
		queryRolesByPartialRoleCodeResponse.setRequestId(_ctx.stringValue("QueryRolesByPartialRoleCodeResponse.RequestId"));
		queryRolesByPartialRoleCodeResponse.setCode(_ctx.stringValue("QueryRolesByPartialRoleCodeResponse.Code"));
		queryRolesByPartialRoleCodeResponse.setMessage(_ctx.stringValue("QueryRolesByPartialRoleCodeResponse.Message"));

		List<Role> roleList = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("QueryRolesByPartialRoleCodeResponse.RoleList.Length"); i++) {
			Role role = new Role();
			role.setRoleId(_ctx.stringValue("QueryRolesByPartialRoleCodeResponse.RoleList["+ i +"].RoleId"));
			role.setName(_ctx.stringValue("QueryRolesByPartialRoleCodeResponse.RoleList["+ i +"].Name"));
			role.setCode(_ctx.stringValue("QueryRolesByPartialRoleCodeResponse.RoleList["+ i +"].Code"));
			role.setDescription(_ctx.stringValue("QueryRolesByPartialRoleCodeResponse.RoleList["+ i +"].Description"));

			roleList.add(role);
		}
		queryRolesByPartialRoleCodeResponse.setRoleList(roleList);
	 
	 	return queryRolesByPartialRoleCodeResponse;
	}
}