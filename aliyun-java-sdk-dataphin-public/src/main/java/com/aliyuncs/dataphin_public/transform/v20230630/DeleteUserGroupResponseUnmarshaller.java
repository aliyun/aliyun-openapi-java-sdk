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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.DeleteUserGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteUserGroupResponseUnmarshaller {

	public static DeleteUserGroupResponse unmarshall(DeleteUserGroupResponse deleteUserGroupResponse, UnmarshallerContext _ctx) {
		
		deleteUserGroupResponse.setRequestId(_ctx.stringValue("DeleteUserGroupResponse.RequestId"));
		deleteUserGroupResponse.setSuccess(_ctx.booleanValue("DeleteUserGroupResponse.Success"));
		deleteUserGroupResponse.setHttpStatusCode(_ctx.integerValue("DeleteUserGroupResponse.HttpStatusCode"));
		deleteUserGroupResponse.setCode(_ctx.stringValue("DeleteUserGroupResponse.Code"));
		deleteUserGroupResponse.setMessage(_ctx.stringValue("DeleteUserGroupResponse.Message"));
		deleteUserGroupResponse.setData(_ctx.booleanValue("DeleteUserGroupResponse.Data"));
	 
	 	return deleteUserGroupResponse;
	}
}