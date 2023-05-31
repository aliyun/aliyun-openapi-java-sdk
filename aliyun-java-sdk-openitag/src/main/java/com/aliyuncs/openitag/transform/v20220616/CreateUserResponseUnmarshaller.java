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

package com.aliyuncs.openitag.transform.v20220616;

import com.aliyuncs.openitag.model.v20220616.CreateUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserResponseUnmarshaller {

	public static CreateUserResponse unmarshall(CreateUserResponse createUserResponse, UnmarshallerContext _ctx) {
		
		createUserResponse.setRequestId(_ctx.stringValue("CreateUserResponse.RequestId"));
		createUserResponse.setCode(_ctx.integerValue("CreateUserResponse.Code"));
		createUserResponse.setMessage(_ctx.stringValue("CreateUserResponse.Message"));
		createUserResponse.setDetails(_ctx.stringValue("CreateUserResponse.Details"));
		createUserResponse.setSuccess(_ctx.booleanValue("CreateUserResponse.Success"));
		createUserResponse.setUserId(_ctx.longValue("CreateUserResponse.UserId"));
		createUserResponse.setErrorCode(_ctx.stringValue("CreateUserResponse.ErrorCode"));
	 
	 	return createUserResponse;
	}
}