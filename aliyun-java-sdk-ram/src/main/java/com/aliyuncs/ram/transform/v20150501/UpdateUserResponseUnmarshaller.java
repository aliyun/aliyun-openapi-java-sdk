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

import com.aliyuncs.ram.model.v20150501.UpdateUserResponse;
import com.aliyuncs.ram.model.v20150501.UpdateUserResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateUserResponseUnmarshaller {

	public static UpdateUserResponse unmarshall(UpdateUserResponse updateUserResponse, UnmarshallerContext _ctx) {
		
		updateUserResponse.setRequestId(_ctx.stringValue("UpdateUserResponse.RequestId"));

		User user = new User();
		user.setDisplayName(_ctx.stringValue("UpdateUserResponse.User.DisplayName"));
		user.setEmail(_ctx.stringValue("UpdateUserResponse.User.Email"));
		user.setUpdateDate(_ctx.stringValue("UpdateUserResponse.User.UpdateDate"));
		user.setMobilePhone(_ctx.stringValue("UpdateUserResponse.User.MobilePhone"));
		user.setUserId(_ctx.stringValue("UpdateUserResponse.User.UserId"));
		user.setComments(_ctx.stringValue("UpdateUserResponse.User.Comments"));
		user.setCreateDate(_ctx.stringValue("UpdateUserResponse.User.CreateDate"));
		user.setUserName(_ctx.stringValue("UpdateUserResponse.User.UserName"));
		updateUserResponse.setUser(user);
	 
	 	return updateUserResponse;
	}
}