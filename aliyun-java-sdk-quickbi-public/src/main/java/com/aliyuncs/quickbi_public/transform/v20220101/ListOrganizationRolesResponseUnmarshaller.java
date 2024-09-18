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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.ListOrganizationRolesResponse;
import com.aliyuncs.quickbi_public.model.v20220101.ListOrganizationRolesResponse.Data;
import com.aliyuncs.quickbi_public.model.v20220101.ListOrganizationRolesResponse.Data.AuthConfigListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrganizationRolesResponseUnmarshaller {

	public static ListOrganizationRolesResponse unmarshall(ListOrganizationRolesResponse listOrganizationRolesResponse, UnmarshallerContext _ctx) {
		
		listOrganizationRolesResponse.setRequestId(_ctx.stringValue("ListOrganizationRolesResponse.RequestId"));
		listOrganizationRolesResponse.setSuccess(_ctx.booleanValue("ListOrganizationRolesResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListOrganizationRolesResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setIsSystemRole(_ctx.booleanValue("ListOrganizationRolesResponse.Result["+ i +"].IsSystemRole"));
			data.setRoleId(_ctx.longValue("ListOrganizationRolesResponse.Result["+ i +"].RoleId"));
			data.setRoleName(_ctx.stringValue("ListOrganizationRolesResponse.Result["+ i +"].RoleName"));

			List<AuthConfigListItem> authConfigList = new ArrayList<AuthConfigListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListOrganizationRolesResponse.Result["+ i +"].AuthConfigList.Length"); j++) {
				AuthConfigListItem authConfigListItem = new AuthConfigListItem();
				authConfigListItem.setAuthKey(_ctx.stringValue("ListOrganizationRolesResponse.Result["+ i +"].AuthConfigList["+ j +"].AuthKey"));

				authConfigList.add(authConfigListItem);
			}
			data.setAuthConfigList(authConfigList);

			result.add(data);
		}
		listOrganizationRolesResponse.setResult(result);
	 
	 	return listOrganizationRolesResponse;
	}
}