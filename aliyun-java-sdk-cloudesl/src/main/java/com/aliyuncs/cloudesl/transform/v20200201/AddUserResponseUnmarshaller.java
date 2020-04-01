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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.AddUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddUserResponseUnmarshaller {

	public static AddUserResponse unmarshall(AddUserResponse addUserResponse, UnmarshallerContext _ctx) {
		
		addUserResponse.setRequestId(_ctx.stringValue("AddUserResponse.RequestId"));
		addUserResponse.setErrorMessage(_ctx.stringValue("AddUserResponse.ErrorMessage"));
		addUserResponse.setErrorCode(_ctx.stringValue("AddUserResponse.ErrorCode"));
		addUserResponse.setMessage(_ctx.stringValue("AddUserResponse.Message"));
		addUserResponse.setDynamicCode(_ctx.stringValue("AddUserResponse.DynamicCode"));
		addUserResponse.setCode(_ctx.stringValue("AddUserResponse.Code"));
		addUserResponse.setDynamicMessage(_ctx.stringValue("AddUserResponse.DynamicMessage"));
		addUserResponse.setSuccess(_ctx.booleanValue("AddUserResponse.Success"));
	 
	 	return addUserResponse;
	}
}