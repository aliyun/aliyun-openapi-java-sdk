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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import com.aliyuncs.aliyuncvc.model.v20191030.CreateUserInternationalResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserInternationalResponseUnmarshaller {

	public static CreateUserInternationalResponse unmarshall(CreateUserInternationalResponse createUserInternationalResponse, UnmarshallerContext _ctx) {
		
		createUserInternationalResponse.setRequestId(_ctx.stringValue("CreateUserInternationalResponse.RequestId"));
		createUserInternationalResponse.setErrorCode(_ctx.integerValue("CreateUserInternationalResponse.ErrorCode"));
		createUserInternationalResponse.setMessage(_ctx.stringValue("CreateUserInternationalResponse.Message"));
		createUserInternationalResponse.setSuccess(_ctx.booleanValue("CreateUserInternationalResponse.Success"));
		createUserInternationalResponse.setUserId(_ctx.stringValue("CreateUserInternationalResponse.UserId"));
	 
	 	return createUserInternationalResponse;
	}
}