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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.GetUserWorkspaceResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.GetUserWorkspaceResponse.WorkspaceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserWorkspaceResponseUnmarshaller {

	public static GetUserWorkspaceResponse unmarshall(GetUserWorkspaceResponse getUserWorkspaceResponse, UnmarshallerContext _ctx) {
		
		getUserWorkspaceResponse.setRequestId(_ctx.stringValue("GetUserWorkspaceResponse.RequestId"));
		getUserWorkspaceResponse.setMessage(_ctx.stringValue("GetUserWorkspaceResponse.Message"));
		getUserWorkspaceResponse.setHttpStatusCode(_ctx.integerValue("GetUserWorkspaceResponse.HttpStatusCode"));
		getUserWorkspaceResponse.setCode(_ctx.stringValue("GetUserWorkspaceResponse.Code"));
		getUserWorkspaceResponse.setSuccess(_ctx.booleanValue("GetUserWorkspaceResponse.Success"));

		List<WorkspaceInfo> workspaceList = new ArrayList<WorkspaceInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetUserWorkspaceResponse.WorkspaceList.Length"); i++) {
			WorkspaceInfo workspaceInfo = new WorkspaceInfo();
			workspaceInfo.setType(_ctx.integerValue("GetUserWorkspaceResponse.WorkspaceList["+ i +"].Type"));
			workspaceInfo.setWorkspaceId(_ctx.stringValue("GetUserWorkspaceResponse.WorkspaceList["+ i +"].WorkspaceId"));
			workspaceInfo.setDescription(_ctx.stringValue("GetUserWorkspaceResponse.WorkspaceList["+ i +"].Description"));
			workspaceInfo.setName(_ctx.stringValue("GetUserWorkspaceResponse.WorkspaceList["+ i +"].Name"));

			workspaceList.add(workspaceInfo);
		}
		getUserWorkspaceResponse.setWorkspaceList(workspaceList);
	 
	 	return getUserWorkspaceResponse;
	}
}