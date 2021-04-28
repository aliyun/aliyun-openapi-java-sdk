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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListRolesResponse;
import com.aliyuncs.ccc.model.v20200701.ListRolesResponse.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRolesResponseUnmarshaller {

	public static ListRolesResponse unmarshall(ListRolesResponse listRolesResponse, UnmarshallerContext _ctx) {
		
		listRolesResponse.setRequestId(_ctx.stringValue("ListRolesResponse.RequestId"));
		listRolesResponse.setCode(_ctx.stringValue("ListRolesResponse.Code"));
		listRolesResponse.setHttpStatusCode(_ctx.integerValue("ListRolesResponse.HttpStatusCode"));
		listRolesResponse.setMessage(_ctx.stringValue("ListRolesResponse.Message"));

		List<Role> data = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("ListRolesResponse.Data.Length"); i++) {
			Role role = new Role();
			role.setName(_ctx.stringValue("ListRolesResponse.Data["+ i +"].Name"));
			role.setRoleId(_ctx.stringValue("ListRolesResponse.Data["+ i +"].RoleId"));

			data.add(role);
		}
		listRolesResponse.setData(data);
	 
	 	return listRolesResponse;
	}
}