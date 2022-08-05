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

import com.aliyuncs.viapi_regen.model.v20211119.DeleteWorkspaceResponse;
import com.aliyuncs.viapi_regen.model.v20211119.DeleteWorkspaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteWorkspaceResponseUnmarshaller {

	public static DeleteWorkspaceResponse unmarshall(DeleteWorkspaceResponse deleteWorkspaceResponse, UnmarshallerContext _ctx) {
		
		deleteWorkspaceResponse.setRequestId(_ctx.stringValue("DeleteWorkspaceResponse.RequestId"));
		deleteWorkspaceResponse.setMessage(_ctx.stringValue("DeleteWorkspaceResponse.Message"));
		deleteWorkspaceResponse.setCode(_ctx.stringValue("DeleteWorkspaceResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("DeleteWorkspaceResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("DeleteWorkspaceResponse.Data.GmtCreate"));
		data.setName(_ctx.stringValue("DeleteWorkspaceResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("DeleteWorkspaceResponse.Data.Description"));
		data.setType(_ctx.stringValue("DeleteWorkspaceResponse.Data.Type"));
		deleteWorkspaceResponse.setData(data);
	 
	 	return deleteWorkspaceResponse;
	}
}