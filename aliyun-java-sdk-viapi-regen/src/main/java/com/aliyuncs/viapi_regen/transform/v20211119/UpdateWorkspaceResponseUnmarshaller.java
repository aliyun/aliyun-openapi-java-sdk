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

import com.aliyuncs.viapi_regen.model.v20211119.UpdateWorkspaceResponse;
import com.aliyuncs.viapi_regen.model.v20211119.UpdateWorkspaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWorkspaceResponseUnmarshaller {

	public static UpdateWorkspaceResponse unmarshall(UpdateWorkspaceResponse updateWorkspaceResponse, UnmarshallerContext _ctx) {
		
		updateWorkspaceResponse.setRequestId(_ctx.stringValue("UpdateWorkspaceResponse.RequestId"));
		updateWorkspaceResponse.setMessage(_ctx.stringValue("UpdateWorkspaceResponse.Message"));
		updateWorkspaceResponse.setCode(_ctx.stringValue("UpdateWorkspaceResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("UpdateWorkspaceResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("UpdateWorkspaceResponse.Data.GmtCreate"));
		data.setName(_ctx.stringValue("UpdateWorkspaceResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("UpdateWorkspaceResponse.Data.Description"));
		data.setType(_ctx.stringValue("UpdateWorkspaceResponse.Data.Type"));
		updateWorkspaceResponse.setData(data);
	 
	 	return updateWorkspaceResponse;
	}
}