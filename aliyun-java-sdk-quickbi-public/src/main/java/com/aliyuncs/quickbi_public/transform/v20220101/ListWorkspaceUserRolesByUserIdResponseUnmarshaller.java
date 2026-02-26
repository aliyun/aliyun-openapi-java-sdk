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

import com.aliyuncs.quickbi_public.model.v20220101.ListWorkspaceUserRolesByUserIdResponse;
import com.aliyuncs.quickbi_public.model.v20220101.ListWorkspaceUserRolesByUserIdResponse.Data;
import com.aliyuncs.quickbi_public.model.v20220101.ListWorkspaceUserRolesByUserIdResponse.Data.RoleModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkspaceUserRolesByUserIdResponseUnmarshaller {

	public static ListWorkspaceUserRolesByUserIdResponse unmarshall(ListWorkspaceUserRolesByUserIdResponse listWorkspaceUserRolesByUserIdResponse, UnmarshallerContext _ctx) {
		
		listWorkspaceUserRolesByUserIdResponse.setRequestId(_ctx.stringValue("ListWorkspaceUserRolesByUserIdResponse.RequestId"));
		listWorkspaceUserRolesByUserIdResponse.setSuccess(_ctx.booleanValue("ListWorkspaceUserRolesByUserIdResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkspaceUserRolesByUserIdResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setWorkspaceId(_ctx.stringValue("ListWorkspaceUserRolesByUserIdResponse.Result["+ i +"].WorkspaceId"));
			data.setWorkspaceName(_ctx.stringValue("ListWorkspaceUserRolesByUserIdResponse.Result["+ i +"].WorkspaceName"));

			RoleModel roleModel = new RoleModel();
			roleModel.setRoleId(_ctx.stringValue("ListWorkspaceUserRolesByUserIdResponse.Result["+ i +"].RoleModel.RoleId"));
			roleModel.setRoleCode(_ctx.stringValue("ListWorkspaceUserRolesByUserIdResponse.Result["+ i +"].RoleModel.RoleCode"));
			roleModel.setRoleName(_ctx.stringValue("ListWorkspaceUserRolesByUserIdResponse.Result["+ i +"].RoleModel.RoleName"));
			data.setRoleModel(roleModel);

			result.add(data);
		}
		listWorkspaceUserRolesByUserIdResponse.setResult(result);
	 
	 	return listWorkspaceUserRolesByUserIdResponse;
	}
}