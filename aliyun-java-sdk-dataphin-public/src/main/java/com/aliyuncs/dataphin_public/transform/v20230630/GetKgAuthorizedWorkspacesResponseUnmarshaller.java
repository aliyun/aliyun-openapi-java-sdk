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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetKgAuthorizedWorkspacesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetKgAuthorizedWorkspacesResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetKgAuthorizedWorkspacesResponse.Data.Workspace;
import com.aliyuncs.dataphin_public.model.v20230630.GetKgAuthorizedWorkspacesResponse.Data.Workspace.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetKgAuthorizedWorkspacesResponseUnmarshaller {

	public static GetKgAuthorizedWorkspacesResponse unmarshall(GetKgAuthorizedWorkspacesResponse getKgAuthorizedWorkspacesResponse, UnmarshallerContext _ctx) {
		
		getKgAuthorizedWorkspacesResponse.setRequestId(_ctx.stringValue("GetKgAuthorizedWorkspacesResponse.RequestId"));
		getKgAuthorizedWorkspacesResponse.setMessage(_ctx.stringValue("GetKgAuthorizedWorkspacesResponse.Message"));
		getKgAuthorizedWorkspacesResponse.setHttpStatusCode(_ctx.integerValue("GetKgAuthorizedWorkspacesResponse.HttpStatusCode"));
		getKgAuthorizedWorkspacesResponse.setCode(_ctx.stringValue("GetKgAuthorizedWorkspacesResponse.Code"));
		getKgAuthorizedWorkspacesResponse.setSuccess(_ctx.booleanValue("GetKgAuthorizedWorkspacesResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("GetKgAuthorizedWorkspacesResponse.Data.TotalCount"));

		List<Workspace> workspaceList = new ArrayList<Workspace>();
		for (int i = 0; i < _ctx.lengthValue("GetKgAuthorizedWorkspacesResponse.Data.WorkspaceList.Length"); i++) {
			Workspace workspace = new Workspace();
			workspace.setGmtCreate(_ctx.stringValue("GetKgAuthorizedWorkspacesResponse.Data.WorkspaceList["+ i +"].GmtCreate"));
			workspace.setDescription(_ctx.stringValue("GetKgAuthorizedWorkspacesResponse.Data.WorkspaceList["+ i +"].Description"));
			workspace.setWorkspaceId(_ctx.stringValue("GetKgAuthorizedWorkspacesResponse.Data.WorkspaceList["+ i +"].WorkspaceId"));
			workspace.setLastPublishTime(_ctx.stringValue("GetKgAuthorizedWorkspacesResponse.Data.WorkspaceList["+ i +"].LastPublishTime"));
			workspace.setLastPublishVersion(_ctx.integerValue("GetKgAuthorizedWorkspacesResponse.Data.WorkspaceList["+ i +"].LastPublishVersion"));
			workspace.setName(_ctx.stringValue("GetKgAuthorizedWorkspacesResponse.Data.WorkspaceList["+ i +"].Name"));

			List<Role> roleList = new ArrayList<Role>();
			for (int j = 0; j < _ctx.lengthValue("GetKgAuthorizedWorkspacesResponse.Data.WorkspaceList["+ i +"].RoleList.Length"); j++) {
				Role role = new Role();
				role.setCode(_ctx.stringValue("GetKgAuthorizedWorkspacesResponse.Data.WorkspaceList["+ i +"].RoleList["+ j +"].Code"));
				role.setName(_ctx.stringValue("GetKgAuthorizedWorkspacesResponse.Data.WorkspaceList["+ i +"].RoleList["+ j +"].Name"));

				roleList.add(role);
			}
			workspace.setRoleList(roleList);

			workspaceList.add(workspace);
		}
		data.setWorkspaceList(workspaceList);
		getKgAuthorizedWorkspacesResponse.setData(data);
	 
	 	return getKgAuthorizedWorkspacesResponse;
	}
}