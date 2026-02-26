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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.ModifyDatabaseUserRolesResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.ModifyDatabaseUserRolesResponse.TenantUser;
import com.aliyuncs.oceanbasepro.model.v20190901.ModifyDatabaseUserRolesResponse.TenantUser.UserRole;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDatabaseUserRolesResponseUnmarshaller {

	public static ModifyDatabaseUserRolesResponse unmarshall(ModifyDatabaseUserRolesResponse modifyDatabaseUserRolesResponse, UnmarshallerContext _ctx) {
		
		modifyDatabaseUserRolesResponse.setRequestId(_ctx.stringValue("ModifyDatabaseUserRolesResponse.RequestId"));

		TenantUser tenantUser = new TenantUser();
		tenantUser.setDatabaseName(_ctx.stringValue("ModifyDatabaseUserRolesResponse.TenantUser.DatabaseName"));
		tenantUser.setTenantId(_ctx.stringValue("ModifyDatabaseUserRolesResponse.TenantUser.TenantId"));

		List<UserRole> users = new ArrayList<UserRole>();
		for (int i = 0; i < _ctx.lengthValue("ModifyDatabaseUserRolesResponse.TenantUser.Users.Length"); i++) {
			UserRole userRole = new UserRole();
			userRole.setRole(_ctx.stringValue("ModifyDatabaseUserRolesResponse.TenantUser.Users["+ i +"].Role"));
			userRole.setUserName(_ctx.stringValue("ModifyDatabaseUserRolesResponse.TenantUser.Users["+ i +"].UserName"));

			users.add(userRole);
		}
		tenantUser.setUsers(users);
		modifyDatabaseUserRolesResponse.setTenantUser(tenantUser);
	 
	 	return modifyDatabaseUserRolesResponse;
	}
}