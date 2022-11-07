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
import com.aliyuncs.oceanbasepro.model.v20190901.CreateTenantUserResponse.Data;
import com.aliyuncs.oceanbasepro.model.v20190901.CreateTenantUserResponse.Data.RolesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTenantUserResponseUnmarshaller {

	public static CreateTenantUserResponse unmarshall(CreateTenantUserResponse createTenantUserResponse, UnmarshallerContext _ctx) {
		
		createTenantUserResponse.setRequestId(_ctx.stringValue("CreateTenantUserResponse.RequestId"));

		List<Data> tenantUser = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("CreateTenantUserResponse.TenantUser.Length"); i++) {
			Data data = new Data();
			data.setUserType(_ctx.stringValue("CreateTenantUserResponse.TenantUser["+ i +"].UserType"));
			data.setUserStatus(_ctx.stringValue("CreateTenantUserResponse.TenantUser["+ i +"].UserStatus"));
			data.setUserName(_ctx.stringValue("CreateTenantUserResponse.TenantUser["+ i +"].UserName"));

			List<RolesItem> roles = new ArrayList<RolesItem>();
			for (int j = 0; j < _ctx.lengthValue("CreateTenantUserResponse.TenantUser["+ i +"].Roles.Length"); j++) {
				RolesItem rolesItem = new RolesItem();
				rolesItem.setDatabase(_ctx.stringValue("CreateTenantUserResponse.TenantUser["+ i +"].Roles["+ j +"].Database"));
				rolesItem.setRole(_ctx.stringValue("CreateTenantUserResponse.TenantUser["+ i +"].Roles["+ j +"].Role"));

				roles.add(rolesItem);
			}
			data.setRoles(roles);

			tenantUser.add(data);
		}
		createTenantUserResponse.setTenantUser(tenantUser);
	 
	 	return createTenantUserResponse;
	}
}