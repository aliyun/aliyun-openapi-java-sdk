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

import com.aliyuncs.devops.model.v20210625.GetWorkspaceResponse;
import com.aliyuncs.devops.model.v20210625.GetWorkspaceResponse.Workspace;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkspaceResponseUnmarshaller {

	public static GetWorkspaceResponse unmarshall(GetWorkspaceResponse getWorkspaceResponse, UnmarshallerContext _ctx) {
		
		getWorkspaceResponse.setSuccess(_ctx.booleanValue("GetWorkspaceResponse.success"));
		getWorkspaceResponse.setErrorCode(_ctx.stringValue("GetWorkspaceResponse.errorCode"));
		getWorkspaceResponse.setErrorMessage(_ctx.stringValue("GetWorkspaceResponse.errorMessage"));
		getWorkspaceResponse.setRequestId(_ctx.stringValue("GetWorkspaceResponse.requestId"));

		Workspace workspace = new Workspace();
		workspace.setCodeVersion(_ctx.stringValue("GetWorkspaceResponse.workspace.codeVersion"));
		workspace.setCodeUrl(_ctx.stringValue("GetWorkspaceResponse.workspace.codeUrl"));
		workspace.setName(_ctx.stringValue("GetWorkspaceResponse.workspace.name"));
		workspace.setSpec(_ctx.stringValue("GetWorkspaceResponse.workspace.spec"));
		workspace.setStatus(_ctx.stringValue("GetWorkspaceResponse.workspace.status"));
		workspace.setTemplate(_ctx.stringValue("GetWorkspaceResponse.workspace.template"));
		workspace.setId(_ctx.stringValue("GetWorkspaceResponse.workspace.id"));
		workspace.setUserId(_ctx.stringValue("GetWorkspaceResponse.workspace.userId"));
		workspace.setCreateTime(_ctx.stringValue("GetWorkspaceResponse.workspace.createTime"));
		getWorkspaceResponse.setWorkspace(workspace);
	 
	 	return getWorkspaceResponse;
	}
}