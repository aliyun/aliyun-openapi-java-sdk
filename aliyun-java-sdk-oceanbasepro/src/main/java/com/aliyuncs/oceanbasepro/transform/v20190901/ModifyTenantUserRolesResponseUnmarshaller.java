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

import com.aliyuncs.oceanbasepro.model.v20190901.ModifyTenantUserRolesResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.ModifyTenantUserRolesResponse.TenantUser;
import com.aliyuncs.oceanbasepro.model.v20190901.ModifyTenantUserRolesResponse.TenantUser.UserRoleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyTenantUserRolesResponseUnmarshaller {

	public static ModifyTenantUserRolesResponse unmarshall(ModifyTenantUserRolesResponse modifyTenantUserRolesResponse, UnmarshallerContext _ctx) {
		
		modifyTenantUserRolesResponse.setRequestId(_ctx.stringValue("ModifyTenantUserRolesResponse.RequestId"));

		TenantUser tenantUser = new TenantUser();
		tenantUser.setUserName(_ctx.stringValue("ModifyTenantUserRolesResponse.TenantUser.UserName"));
		tenantUser.setTenantId(_ctx.stringValue("ModifyTenantUserRolesResponse.TenantUser.TenantId"));

		List<UserRoleItem> userRole = new ArrayList<UserRoleItem>();
		for (int i = 0; i < _ctx.lengthValue("ModifyTenantUserRolesResponse.TenantUser.UserRole.Length"); i++) {
			UserRoleItem userRoleItem = new UserRoleItem();
			userRoleItem.setDatabase(_ctx.stringValue("ModifyTenantUserRolesResponse.TenantUser.UserRole["+ i +"].Database"));
			userRoleItem.setRole(_ctx.stringValue("ModifyTenantUserRolesResponse.TenantUser.UserRole["+ i +"].Role"));
			userRoleItem.setTable(_ctx.stringValue("ModifyTenantUserRolesResponse.TenantUser.UserRole["+ i +"].Table"));
			userRoleItem.setIsSuccess(_ctx.booleanValue("ModifyTenantUserRolesResponse.TenantUser.UserRole["+ i +"].IsSuccess"));

			userRole.add(userRoleItem);
		}
		tenantUser.setUserRole(userRole);
		modifyTenantUserRolesResponse.setTenantUser(tenantUser);
	 
	 	return modifyTenantUserRolesResponse;
	}
}