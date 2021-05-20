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

package com.aliyuncs.quickbi_public.transform.v20200731;

import com.aliyuncs.quickbi_public.model.v20200731.DeleteUserGroupMembersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteUserGroupMembersResponseUnmarshaller {

	public static DeleteUserGroupMembersResponse unmarshall(DeleteUserGroupMembersResponse deleteUserGroupMembersResponse, UnmarshallerContext _ctx) {
		
		deleteUserGroupMembersResponse.setRequestId(_ctx.stringValue("DeleteUserGroupMembersResponse.RequestId"));
		deleteUserGroupMembersResponse.setResult(_ctx.booleanValue("DeleteUserGroupMembersResponse.Result"));
		deleteUserGroupMembersResponse.setSuccess(_ctx.booleanValue("DeleteUserGroupMembersResponse.Success"));
	 
	 	return deleteUserGroupMembersResponse;
	}
}