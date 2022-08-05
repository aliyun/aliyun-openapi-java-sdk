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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.CreateWorkspaceResponse;
import com.aliyuncs.viapi_regen.model.v20211119.CreateWorkspaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWorkspaceResponseUnmarshaller {

	public static CreateWorkspaceResponse unmarshall(CreateWorkspaceResponse createWorkspaceResponse, UnmarshallerContext _ctx) {
		
		createWorkspaceResponse.setRequestId(_ctx.stringValue("CreateWorkspaceResponse.RequestId"));
		createWorkspaceResponse.setMessage(_ctx.stringValue("CreateWorkspaceResponse.Message"));
		createWorkspaceResponse.setCode(_ctx.stringValue("CreateWorkspaceResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("CreateWorkspaceResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("CreateWorkspaceResponse.Data.GmtCreate"));
		data.setName(_ctx.stringValue("CreateWorkspaceResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("CreateWorkspaceResponse.Data.Description"));
		data.setType(_ctx.stringValue("CreateWorkspaceResponse.Data.Type"));
		createWorkspaceResponse.setData(data);
	 
	 	return createWorkspaceResponse;
	}
}