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

package com.aliyuncs.rdc.transform.v20180816;

import com.aliyuncs.rdc.model.v20180816.DeleteProjectMembersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteProjectMembersResponseUnmarshaller {

	public static DeleteProjectMembersResponse unmarshall(DeleteProjectMembersResponse deleteProjectMembersResponse, UnmarshallerContext _ctx) {
		
		deleteProjectMembersResponse.setRequestId(_ctx.stringValue("DeleteProjectMembersResponse.RequestId"));
		deleteProjectMembersResponse.setCode(_ctx.integerValue("DeleteProjectMembersResponse.Code"));
		deleteProjectMembersResponse.setData(_ctx.booleanValue("DeleteProjectMembersResponse.Data"));
		deleteProjectMembersResponse.setSuccess(_ctx.booleanValue("DeleteProjectMembersResponse.Success"));
		deleteProjectMembersResponse.setMessage(_ctx.stringValue("DeleteProjectMembersResponse.Message"));
	 
	 	return deleteProjectMembersResponse;
	}
}