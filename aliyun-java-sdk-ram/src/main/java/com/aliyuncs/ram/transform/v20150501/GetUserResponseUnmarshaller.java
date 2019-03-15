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

	public static GetUserResponse unmarshall(GetUserResponse getUserResponse, UnmarshallerContext context) {
		
		getUserResponse.setRequestId(context.stringValue("GetUserResponse.RequestId"));

		User user = new User();
		user.setUserId(context.stringValue("GetUserResponse.User.UserId"));
		user.setUserName(context.stringValue("GetUserResponse.User.UserName"));
		user.setDisplayName(context.stringValue("GetUserResponse.User.DisplayName"));
		user.setMobilePhone(context.stringValue("GetUserResponse.User.MobilePhone"));
		user.setEmail(context.stringValue("GetUserResponse.User.Email"));
		user.setComments(context.stringValue("GetUserResponse.User.Comments"));
		user.setCreateDate(context.stringValue("GetUserResponse.User.CreateDate"));
		user.setUpdateDate(context.stringValue("GetUserResponse.User.UpdateDate"));
		user.setLastLoginDate(context.stringValue("GetUserResponse.User.LastLoginDate"));
		getUserResponse.setUser(user);
	 
	 	return getUserResponse;
	}
}