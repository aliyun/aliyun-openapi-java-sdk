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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivilegesOfUserResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivilegesOfUserResponse.Privilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivilegesOfUserResponseUnmarshaller {

	public static ListPrivilegesOfUserResponse unmarshall(ListPrivilegesOfUserResponse listPrivilegesOfUserResponse, UnmarshallerContext context) {
		
		listPrivilegesOfUserResponse.setRequestId(context.stringValue("ListPrivilegesOfUserResponse.RequestId"));
		listPrivilegesOfUserResponse.setSuccess(context.booleanValue("ListPrivilegesOfUserResponse.Success"));
		listPrivilegesOfUserResponse.setCode(context.stringValue("ListPrivilegesOfUserResponse.Code"));
		listPrivilegesOfUserResponse.setMessage(context.stringValue("ListPrivilegesOfUserResponse.Message"));
		listPrivilegesOfUserResponse.setHttpStatusCode(context.integerValue("ListPrivilegesOfUserResponse.HttpStatusCode"));

		List<Privilege> privileges = new ArrayList<Privilege>();
		for (int i = 0; i < context.lengthValue("ListPrivilegesOfUserResponse.Privileges.Length"); i++) {
			Privilege privilege = new Privilege();
			privilege.setPrivilegeId(context.stringValue("ListPrivilegesOfUserResponse.Privileges["+ i +"].PrivilegeId"));
			privilege.setPrivilegeName(context.stringValue("ListPrivilegesOfUserResponse.Privileges["+ i +"].PrivilegeName"));
			privilege.setPrivilegeDescription(context.stringValue("ListPrivilegesOfUserResponse.Privileges["+ i +"].PrivilegeDescription"));

			privileges.add(privilege);
		}
		listPrivilegesOfUserResponse.setPrivileges(privileges);
	 
	 	return listPrivilegesOfUserResponse;
	}
}