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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.ListWorkspacesResponse;
import com.aliyuncs.datalake.model.v20200710.ListWorkspacesResponse.Workspaces;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkspacesResponseUnmarshaller {

	public static ListWorkspacesResponse unmarshall(ListWorkspacesResponse listWorkspacesResponse, UnmarshallerContext _ctx) {
		
		listWorkspacesResponse.setRequestId(_ctx.stringValue("ListWorkspacesResponse.RequestId"));
		listWorkspacesResponse.setSuccess(_ctx.booleanValue("ListWorkspacesResponse.Success"));

		List<Workspaces> data = new ArrayList<Workspaces>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkspacesResponse.Data.Length"); i++) {
			Workspaces workspaces = new Workspaces();
			workspaces.setName(_ctx.stringValue("ListWorkspacesResponse.Data["+ i +"].Name"));
			workspaces.setType(_ctx.stringValue("ListWorkspacesResponse.Data["+ i +"].Type"));
			workspaces.setDescription(_ctx.stringValue("ListWorkspacesResponse.Data["+ i +"].Description"));
			workspaces.setConfig(_ctx.stringValue("ListWorkspacesResponse.Data["+ i +"].Config"));
			workspaces.setIsDefault(_ctx.booleanValue("ListWorkspacesResponse.Data["+ i +"].IsDefault"));
			workspaces.setRegionId(_ctx.stringValue("ListWorkspacesResponse.Data["+ i +"].RegionId"));
			workspaces.setWorkspaceId(_ctx.stringValue("ListWorkspacesResponse.Data["+ i +"].WorkspaceId"));

			data.add(workspaces);
		}
		listWorkspacesResponse.setData(data);
	 
	 	return listWorkspacesResponse;
	}
}