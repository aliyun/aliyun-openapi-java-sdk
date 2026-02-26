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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListWorkspacesResponse;
import com.aliyuncs.devops.model.v20210625.ListWorkspacesResponse.WorkspaceDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkspacesResponseUnmarshaller {

	public static ListWorkspacesResponse unmarshall(ListWorkspacesResponse listWorkspacesResponse, UnmarshallerContext _ctx) {
		
		listWorkspacesResponse.setTotalCount(_ctx.integerValue("ListWorkspacesResponse.totalCount"));
		listWorkspacesResponse.setNextToken(_ctx.stringValue("ListWorkspacesResponse.nextToken"));
		listWorkspacesResponse.setMaxResults(_ctx.integerValue("ListWorkspacesResponse.maxResults"));
		listWorkspacesResponse.setRequestId(_ctx.stringValue("ListWorkspacesResponse.requestId"));
		listWorkspacesResponse.setSuccess(_ctx.booleanValue("ListWorkspacesResponse.success"));
		listWorkspacesResponse.setErrorCode(_ctx.stringValue("ListWorkspacesResponse.errorCode"));
		listWorkspacesResponse.setErrorMessage(_ctx.stringValue("ListWorkspacesResponse.errorMessage"));

		List<WorkspaceDTO> workspaces = new ArrayList<WorkspaceDTO>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkspacesResponse.workspaces.Length"); i++) {
			WorkspaceDTO workspaceDTO = new WorkspaceDTO();
			workspaceDTO.setCodeVersion(_ctx.stringValue("ListWorkspacesResponse.workspaces["+ i +"].codeVersion"));
			workspaceDTO.setCodeUrl(_ctx.stringValue("ListWorkspacesResponse.workspaces["+ i +"].codeUrl"));
			workspaceDTO.setName(_ctx.stringValue("ListWorkspacesResponse.workspaces["+ i +"].name"));
			workspaceDTO.setSpec(_ctx.stringValue("ListWorkspacesResponse.workspaces["+ i +"].spec"));
			workspaceDTO.setStatus(_ctx.stringValue("ListWorkspacesResponse.workspaces["+ i +"].status"));
			workspaceDTO.setTemplate(_ctx.stringValue("ListWorkspacesResponse.workspaces["+ i +"].template"));
			workspaceDTO.setId(_ctx.stringValue("ListWorkspacesResponse.workspaces["+ i +"].id"));
			workspaceDTO.setUserId(_ctx.stringValue("ListWorkspacesResponse.workspaces["+ i +"].userId"));
			workspaceDTO.setCreateTime(_ctx.stringValue("ListWorkspacesResponse.workspaces["+ i +"].createTime"));

			workspaces.add(workspaceDTO);
		}
		listWorkspacesResponse.setWorkspaces(workspaces);
	 
	 	return listWorkspacesResponse;
	}
}