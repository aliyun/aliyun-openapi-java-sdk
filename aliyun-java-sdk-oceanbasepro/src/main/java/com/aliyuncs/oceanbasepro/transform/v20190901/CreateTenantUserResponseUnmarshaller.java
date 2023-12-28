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

import com.aliyuncs.oceanbasepro.model.v20190901.CreateTenantUserResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.CreateTenantUserResponse.TenantUser;
import com.aliyuncs.oceanbasepro.model.v20190901.CreateTenantUserResponse.TenantUser.RolesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTenantUserResponseUnmarshaller {

	public static CreateTenantUserResponse unmarshall(CreateTenantUserResponse createTenantUserResponse, UnmarshallerContext _ctx) {
		
		createTenantUserResponse.setRequestId(_ctx.stringValue("CreateTenantUserResponse.RequestId"));

		TenantUser tenantUser = new TenantUser();
		tenantUser.setUserType(_ctx.stringValue("CreateTenantUserResponse.TenantUser.UserType"));
		tenantUser.setUserStatus(_ctx.stringValue("CreateTenantUserResponse.TenantUser.UserStatus"));
		tenantUser.setUserName(_ctx.stringValue("CreateTenantUserResponse.TenantUser.UserName"));

		List<RolesItem> roles = new ArrayList<RolesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateTenantUserResponse.TenantUser.Roles.Length"); i++) {
			RolesItem rolesItem = new RolesItem();
			rolesItem.setDatabase(_ctx.stringValue("CreateTenantUserResponse.TenantUser.Roles["+ i +"].Database"));
			rolesItem.setRole(_ctx.stringValue("CreateTenantUserResponse.TenantUser.Roles["+ i +"].Role"));

			roles.add(rolesItem);
		}
		tenantUser.setRoles(roles);
		createTenantUserResponse.setTenantUser(tenantUser);
	 
	 	return createTenantUserResponse;
	}
}