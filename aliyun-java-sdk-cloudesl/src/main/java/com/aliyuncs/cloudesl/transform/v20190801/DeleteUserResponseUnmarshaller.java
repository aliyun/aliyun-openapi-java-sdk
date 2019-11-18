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

package com.aliyuncs.cloudesl.transform.v20190801;

import com.aliyuncs.cloudesl.model.v20190801.DeleteUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteUserResponseUnmarshaller {

	public static DeleteUserResponse unmarshall(DeleteUserResponse deleteUserResponse, UnmarshallerContext _ctx) {
		
		deleteUserResponse.setRequestId(_ctx.stringValue("DeleteUserResponse.RequestId"));
		deleteUserResponse.setErrorMessage(_ctx.stringValue("DeleteUserResponse.ErrorMessage"));
		deleteUserResponse.setErrorCode(_ctx.stringValue("DeleteUserResponse.ErrorCode"));
		deleteUserResponse.setMessage(_ctx.stringValue("DeleteUserResponse.Message"));
		deleteUserResponse.setDynamicCode(_ctx.stringValue("DeleteUserResponse.DynamicCode"));
		deleteUserResponse.setCode(_ctx.stringValue("DeleteUserResponse.Code"));
		deleteUserResponse.setDynamicMessage(_ctx.stringValue("DeleteUserResponse.DynamicMessage"));
		deleteUserResponse.setSuccess(_ctx.booleanValue("DeleteUserResponse.Success"));
	 
	 	return deleteUserResponse;
	}
}