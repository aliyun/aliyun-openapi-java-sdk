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

import com.aliyuncs.quickbi_public.model.v20220101.ListWorkspaceRolesResponse;
import com.aliyuncs.quickbi_public.model.v20220101.ListWorkspaceRolesResponse.Data;
import com.aliyuncs.quickbi_public.model.v20220101.ListWorkspaceRolesResponse.Data.AuthConfigListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkspaceRolesResponseUnmarshaller {

	public static ListWorkspaceRolesResponse unmarshall(ListWorkspaceRolesResponse listWorkspaceRolesResponse, UnmarshallerContext _ctx) {
		
		listWorkspaceRolesResponse.setRequestId(_ctx.stringValue("ListWorkspaceRolesResponse.RequestId"));
		listWorkspaceRolesResponse.setSuccess(_ctx.booleanValue("ListWorkspaceRolesResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkspaceRolesResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setIsSystemRole(_ctx.booleanValue("ListWorkspaceRolesResponse.Result["+ i +"].IsSystemRole"));
			data.setRoleId(_ctx.longValue("ListWorkspaceRolesResponse.Result["+ i +"].RoleId"));
			data.setRoleName(_ctx.stringValue("ListWorkspaceRolesResponse.Result["+ i +"].RoleName"));

			List<AuthConfigListItem> authConfigList = new ArrayList<AuthConfigListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListWorkspaceRolesResponse.Result["+ i +"].AuthConfigList.Length"); j++) {
				AuthConfigListItem authConfigListItem = new AuthConfigListItem();
				authConfigListItem.setAuthKey(_ctx.stringValue("ListWorkspaceRolesResponse.Result["+ i +"].AuthConfigList["+ j +"].AuthKey"));

				List<String> actionAuthKeys = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListWorkspaceRolesResponse.Result["+ i +"].AuthConfigList["+ j +"].ActionAuthKeys.Length"); k++) {
					actionAuthKeys.add(_ctx.stringValue("ListWorkspaceRolesResponse.Result["+ i +"].AuthConfigList["+ j +"].ActionAuthKeys["+ k +"]"));
				}
				authConfigListItem.setActionAuthKeys(actionAuthKeys);

				authConfigList.add(authConfigListItem);
			}
			data.setAuthConfigList(authConfigList);

			result.add(data);
		}
		listWorkspaceRolesResponse.setResult(result);
	 
	 	return listWorkspaceRolesResponse;
	}
}