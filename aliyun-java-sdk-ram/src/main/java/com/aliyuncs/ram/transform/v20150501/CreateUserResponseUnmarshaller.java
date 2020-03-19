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

package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.CreateUserResponse;
import com.aliyuncs.ram.model.v20150501.CreateUserResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserResponseUnmarshaller {

	public static CreateUserResponse unmarshall(CreateUserResponse createUserResponse, UnmarshallerContext _ctx) {
		
		createUserResponse.setRequestId(_ctx.stringValue("CreateUserResponse.RequestId"));

		User user = new User();
		user.setUserId(_ctx.stringValue("CreateUserResponse.User.UserId"));
		user.setUserName(_ctx.stringValue("CreateUserResponse.User.UserName"));
		user.setDisplayName(_ctx.stringValue("CreateUserResponse.User.DisplayName"));
		user.setMobilePhone(_ctx.stringValue("CreateUserResponse.User.MobilePhone"));
		user.setEmail(_ctx.stringValue("CreateUserResponse.User.Email"));
		user.setComments(_ctx.stringValue("CreateUserResponse.User.Comments"));
		user.setCreateDate(_ctx.stringValue("CreateUserResponse.User.CreateDate"));
		createUserResponse.setUser(user);
	 
	 	return createUserResponse;
	}
}