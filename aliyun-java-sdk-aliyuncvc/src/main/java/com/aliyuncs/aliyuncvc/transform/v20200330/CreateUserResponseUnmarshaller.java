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

package com.aliyuncs.aliyuncvc.transform.v20200330;

import com.aliyuncs.aliyuncvc.model.v20200330.CreateUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserResponseUnmarshaller {

	public static CreateUserResponse unmarshall(CreateUserResponse createUserResponse, UnmarshallerContext _ctx) {
		
		createUserResponse.setRequestId(_ctx.stringValue("CreateUserResponse.RequestId"));
		createUserResponse.setErrorCode(_ctx.integerValue("CreateUserResponse.ErrorCode"));
		createUserResponse.setMessage(_ctx.stringValue("CreateUserResponse.Message"));
		createUserResponse.setSuccess(_ctx.booleanValue("CreateUserResponse.Success"));
		createUserResponse.setUserId(_ctx.stringValue("CreateUserResponse.UserId"));
	 
	 	return createUserResponse;
	}
}