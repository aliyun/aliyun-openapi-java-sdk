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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.DeleteUserGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteUserGroupResponseUnmarshaller {

	public static DeleteUserGroupResponse unmarshall(DeleteUserGroupResponse deleteUserGroupResponse, UnmarshallerContext _ctx) {
		
		deleteUserGroupResponse.setRequestId(_ctx.stringValue("DeleteUserGroupResponse.RequestId"));
		deleteUserGroupResponse.setCode(_ctx.stringValue("DeleteUserGroupResponse.Code"));
		deleteUserGroupResponse.setErrInfo(_ctx.stringValue("DeleteUserGroupResponse.ErrInfo"));
		deleteUserGroupResponse.setMsg(_ctx.stringValue("DeleteUserGroupResponse.Msg"));
		deleteUserGroupResponse.setSucc(_ctx.booleanValue("DeleteUserGroupResponse.Succ"));
		deleteUserGroupResponse.setResult(_ctx.booleanValue("DeleteUserGroupResponse.Result"));
		deleteUserGroupResponse.setErrorCode(_ctx.stringValue("DeleteUserGroupResponse.ErrorCode"));
	 
	 	return deleteUserGroupResponse;
	}
}