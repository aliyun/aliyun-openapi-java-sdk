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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CreateAKSMeshWorkspaceResponse;
import com.aliyuncs.sofa.model.v20190815.CreateAKSMeshWorkspaceResponse.Workspace;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAKSMeshWorkspaceResponseUnmarshaller {

	public static CreateAKSMeshWorkspaceResponse unmarshall(CreateAKSMeshWorkspaceResponse createAKSMeshWorkspaceResponse, UnmarshallerContext _ctx) {
		
		createAKSMeshWorkspaceResponse.setRequestId(_ctx.stringValue("CreateAKSMeshWorkspaceResponse.RequestId"));
		createAKSMeshWorkspaceResponse.setResultCode(_ctx.stringValue("CreateAKSMeshWorkspaceResponse.ResultCode"));
		createAKSMeshWorkspaceResponse.setResultMessage(_ctx.stringValue("CreateAKSMeshWorkspaceResponse.ResultMessage"));

		Workspace workspace = new Workspace();
		workspace.setId(_ctx.stringValue("CreateAKSMeshWorkspaceResponse.Workspace.Id"));
		workspace.setName(_ctx.stringValue("CreateAKSMeshWorkspaceResponse.Workspace.Name"));
		workspace.setNetworkType(_ctx.stringValue("CreateAKSMeshWorkspaceResponse.Workspace.NetworkType"));
		workspace.setRegionId(_ctx.stringValue("CreateAKSMeshWorkspaceResponse.Workspace.RegionId"));
		workspace.setTenant(_ctx.stringValue("CreateAKSMeshWorkspaceResponse.Workspace.Tenant"));
		workspace.setZoneIds(_ctx.stringValue("CreateAKSMeshWorkspaceResponse.Workspace.ZoneIds"));
		createAKSMeshWorkspaceResponse.setWorkspace(workspace);
	 
	 	return createAKSMeshWorkspaceResponse;
	}
}