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

import com.aliyuncs.itag.model.v20210517.CreateUserGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserGroupResponseUnmarshaller {

	public static CreateUserGroupResponse unmarshall(CreateUserGroupResponse createUserGroupResponse, UnmarshallerContext _ctx) {
		
		createUserGroupResponse.setRequestId(_ctx.stringValue("CreateUserGroupResponse.RequestId"));
		createUserGroupResponse.setCode(_ctx.stringValue("CreateUserGroupResponse.Code"));
		createUserGroupResponse.setErrInfo(_ctx.stringValue("CreateUserGroupResponse.ErrInfo"));
		createUserGroupResponse.setMsg(_ctx.stringValue("CreateUserGroupResponse.Msg"));
		createUserGroupResponse.setSucc(_ctx.booleanValue("CreateUserGroupResponse.Succ"));
		createUserGroupResponse.setResult(_ctx.stringValue("CreateUserGroupResponse.Result"));
		createUserGroupResponse.setErrorCode(_ctx.stringValue("CreateUserGroupResponse.ErrorCode"));
	 
	 	return createUserGroupResponse;
	}
}