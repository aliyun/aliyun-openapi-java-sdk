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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetMyRolesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetMyRolesResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMyRolesResponseUnmarshaller {

	public static GetMyRolesResponse unmarshall(GetMyRolesResponse getMyRolesResponse, UnmarshallerContext _ctx) {
		
		getMyRolesResponse.setRequestId(_ctx.stringValue("GetMyRolesResponse.RequestId"));
		getMyRolesResponse.setSuccess(_ctx.booleanValue("GetMyRolesResponse.Success"));
		getMyRolesResponse.setHttpStatusCode(_ctx.integerValue("GetMyRolesResponse.HttpStatusCode"));
		getMyRolesResponse.setCode(_ctx.stringValue("GetMyRolesResponse.Code"));
		getMyRolesResponse.setMessage(_ctx.stringValue("GetMyRolesResponse.Message"));

		List<Role> roleList = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("GetMyRolesResponse.RoleList.Length"); i++) {
			Role role = new Role();
			role.setId(_ctx.longValue("GetMyRolesResponse.RoleList["+ i +"].Id"));
			role.setName(_ctx.stringValue("GetMyRolesResponse.RoleList["+ i +"].Name"));
			role.setDescription(_ctx.stringValue("GetMyRolesResponse.RoleList["+ i +"].Description"));

			roleList.add(role);
		}
		getMyRolesResponse.setRoleList(roleList);
	 
	 	return getMyRolesResponse;
	}
}