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

import com.aliyuncs.dataphin_public.model.v20230630.ListAddableRolesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListAddableRolesResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAddableRolesResponseUnmarshaller {

	public static ListAddableRolesResponse unmarshall(ListAddableRolesResponse listAddableRolesResponse, UnmarshallerContext _ctx) {
		
		listAddableRolesResponse.setRequestId(_ctx.stringValue("ListAddableRolesResponse.RequestId"));
		listAddableRolesResponse.setSuccess(_ctx.booleanValue("ListAddableRolesResponse.Success"));
		listAddableRolesResponse.setHttpStatusCode(_ctx.integerValue("ListAddableRolesResponse.HttpStatusCode"));
		listAddableRolesResponse.setCode(_ctx.stringValue("ListAddableRolesResponse.Code"));
		listAddableRolesResponse.setMessage(_ctx.stringValue("ListAddableRolesResponse.Message"));

		List<Role> roleList = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("ListAddableRolesResponse.RoleList.Length"); i++) {
			Role role = new Role();
			role.setCode(_ctx.stringValue("ListAddableRolesResponse.RoleList["+ i +"].Code"));
			role.setName(_ctx.stringValue("ListAddableRolesResponse.RoleList["+ i +"].Name"));

			roleList.add(role);
		}
		listAddableRolesResponse.setRoleList(roleList);
	 
	 	return listAddableRolesResponse;
	}
}