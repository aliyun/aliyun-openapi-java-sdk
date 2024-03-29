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

import com.aliyuncs.openitag.model.v20220616.UpdateUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateUserResponseUnmarshaller {

	public static UpdateUserResponse unmarshall(UpdateUserResponse updateUserResponse, UnmarshallerContext _ctx) {
		
		updateUserResponse.setRequestId(_ctx.stringValue("UpdateUserResponse.RequestId"));
		updateUserResponse.setCode(_ctx.integerValue("UpdateUserResponse.Code"));
		updateUserResponse.setMessage(_ctx.stringValue("UpdateUserResponse.Message"));
		updateUserResponse.setDetails(_ctx.stringValue("UpdateUserResponse.Details"));
		updateUserResponse.setSuccess(_ctx.booleanValue("UpdateUserResponse.Success"));
		updateUserResponse.setUserId(_ctx.stringValue("UpdateUserResponse.UserId"));
		updateUserResponse.setErrorCode(_ctx.stringValue("UpdateUserResponse.ErrorCode"));
	 
	 	return updateUserResponse;
	}
}