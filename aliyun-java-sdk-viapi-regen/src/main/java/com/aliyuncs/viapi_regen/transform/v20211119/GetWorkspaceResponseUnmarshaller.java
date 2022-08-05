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

import com.aliyuncs.viapi_regen.model.v20211119.GetWorkspaceResponse;
import com.aliyuncs.viapi_regen.model.v20211119.GetWorkspaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkspaceResponseUnmarshaller {

	public static GetWorkspaceResponse unmarshall(GetWorkspaceResponse getWorkspaceResponse, UnmarshallerContext _ctx) {
		
		getWorkspaceResponse.setRequestId(_ctx.stringValue("GetWorkspaceResponse.RequestId"));
		getWorkspaceResponse.setMessage(_ctx.stringValue("GetWorkspaceResponse.Message"));
		getWorkspaceResponse.setCode(_ctx.stringValue("GetWorkspaceResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetWorkspaceResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("GetWorkspaceResponse.Data.GmtCreate"));
		data.setName(_ctx.stringValue("GetWorkspaceResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("GetWorkspaceResponse.Data.Description"));
		data.setType(_ctx.stringValue("GetWorkspaceResponse.Data.Type"));
		getWorkspaceResponse.setData(data);
	 
	 	return getWorkspaceResponse;
	}
}