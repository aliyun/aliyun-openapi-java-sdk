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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivilegesOfRoleResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivilegesOfRoleResponse.Privilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivilegesOfRoleResponseUnmarshaller {

	public static ListPrivilegesOfRoleResponse unmarshall(ListPrivilegesOfRoleResponse listPrivilegesOfRoleResponse, UnmarshallerContext context) {
		
		listPrivilegesOfRoleResponse.setRequestId(context.stringValue("ListPrivilegesOfRoleResponse.RequestId"));
		listPrivilegesOfRoleResponse.setSuccess(context.booleanValue("ListPrivilegesOfRoleResponse.Success"));
		listPrivilegesOfRoleResponse.setCode(context.stringValue("ListPrivilegesOfRoleResponse.Code"));
		listPrivilegesOfRoleResponse.setMessage(context.stringValue("ListPrivilegesOfRoleResponse.Message"));
		listPrivilegesOfRoleResponse.setHttpStatusCode(context.integerValue("ListPrivilegesOfRoleResponse.HttpStatusCode"));

		List<Privilege> privileges = new ArrayList<Privilege>();
		for (int i = 0; i < context.lengthValue("ListPrivilegesOfRoleResponse.Privileges.Length"); i++) {
			Privilege privilege = new Privilege();
			privilege.setPrivilegeId(context.stringValue("ListPrivilegesOfRoleResponse.Privileges["+ i +"].PrivilegeId"));
			privilege.setPrivilegeName(context.stringValue("ListPrivilegesOfRoleResponse.Privileges["+ i +"].PrivilegeName"));
			privilege.setPrivilegeDescription(context.stringValue("ListPrivilegesOfRoleResponse.Privileges["+ i +"].PrivilegeDescription"));

			privileges.add(privilege);
		}
		listPrivilegesOfRoleResponse.setPrivileges(privileges);
	 
	 	return listPrivilegesOfRoleResponse;
	}
}