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

import com.aliyuncs.ram.model.v20150501.GetUserResponse;
import com.aliyuncs.ram.model.v20150501.GetUserResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserResponseUnmarshaller {

	public static GetUserResponse unmarshall(GetUserResponse getUserResponse, UnmarshallerContext _ctx) {
		
		getUserResponse.setRequestId(_ctx.stringValue("GetUserResponse.RequestId"));

		User user = new User();
		user.setDisplayName(_ctx.stringValue("GetUserResponse.User.DisplayName"));
		user.setEmail(_ctx.stringValue("GetUserResponse.User.Email"));
		user.setUpdateDate(_ctx.stringValue("GetUserResponse.User.UpdateDate"));
		user.setMobilePhone(_ctx.stringValue("GetUserResponse.User.MobilePhone"));
		user.setUserId(_ctx.stringValue("GetUserResponse.User.UserId"));
		user.setComments(_ctx.stringValue("GetUserResponse.User.Comments"));
		user.setLastLoginDate(_ctx.stringValue("GetUserResponse.User.LastLoginDate"));
		user.setCreateDate(_ctx.stringValue("GetUserResponse.User.CreateDate"));
		user.setUserName(_ctx.stringValue("GetUserResponse.User.UserName"));
		getUserResponse.setUser(user);
	 
	 	return getUserResponse;
	}
}