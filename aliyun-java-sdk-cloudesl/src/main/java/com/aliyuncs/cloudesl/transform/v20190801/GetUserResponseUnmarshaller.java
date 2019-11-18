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

import com.aliyuncs.cloudesl.model.v20190801.GetUserResponse;
import com.aliyuncs.cloudesl.model.v20190801.GetUserResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserResponseUnmarshaller {

	public static GetUserResponse unmarshall(GetUserResponse getUserResponse, UnmarshallerContext _ctx) {
		
		getUserResponse.setRequestId(_ctx.stringValue("GetUserResponse.RequestId"));
		getUserResponse.setErrorMessage(_ctx.stringValue("GetUserResponse.ErrorMessage"));
		getUserResponse.setErrorCode(_ctx.stringValue("GetUserResponse.ErrorCode"));
		getUserResponse.setMessage(_ctx.stringValue("GetUserResponse.Message"));
		getUserResponse.setDynamicCode(_ctx.stringValue("GetUserResponse.DynamicCode"));
		getUserResponse.setCode(_ctx.stringValue("GetUserResponse.Code"));
		getUserResponse.setDynamicMessage(_ctx.stringValue("GetUserResponse.DynamicMessage"));
		getUserResponse.setSuccess(_ctx.booleanValue("GetUserResponse.Success"));

		User user = new User();
		user.setStores(_ctx.stringValue("GetUserResponse.User.Stores"));
		user.setUserName(_ctx.stringValue("GetUserResponse.User.UserName"));
		user.setUserId(_ctx.stringValue("GetUserResponse.User.UserId"));
		user.setUserType(_ctx.stringValue("GetUserResponse.User.UserType"));
		getUserResponse.setUser(user);
	 
	 	return getUserResponse;
	}
}