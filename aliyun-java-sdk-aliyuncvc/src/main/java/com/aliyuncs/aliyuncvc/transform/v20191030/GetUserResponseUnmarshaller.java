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

import com.aliyuncs.aliyuncvc.model.v20191030.GetUserResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.GetUserResponse.UserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserResponseUnmarshaller {

	public static GetUserResponse unmarshall(GetUserResponse getUserResponse, UnmarshallerContext _ctx) {
		
		getUserResponse.setRequestId(_ctx.stringValue("GetUserResponse.RequestId"));
		getUserResponse.setErrorCode(_ctx.integerValue("GetUserResponse.ErrorCode"));
		getUserResponse.setMessage(_ctx.stringValue("GetUserResponse.Message"));
		getUserResponse.setSuccess(_ctx.booleanValue("GetUserResponse.Success"));

		UserInfo userInfo = new UserInfo();
		userInfo.setUserName(_ctx.stringValue("GetUserResponse.UserInfo.UserName"));
		userInfo.setCreateTime(_ctx.longValue("GetUserResponse.UserInfo.CreateTime"));
		userInfo.setGroupId(_ctx.stringValue("GetUserResponse.UserInfo.GroupId"));
		userInfo.setGroupName(_ctx.stringValue("GetUserResponse.UserInfo.GroupName"));
		userInfo.setUserId(_ctx.stringValue("GetUserResponse.UserInfo.UserId"));
		userInfo.setUserTel(_ctx.stringValue("GetUserResponse.UserInfo.UserTel"));
		userInfo.setUserEmail(_ctx.stringValue("GetUserResponse.UserInfo.UserEmail"));
		userInfo.setUserMobile(_ctx.stringValue("GetUserResponse.UserInfo.UserMobile"));
		userInfo.setUserAvatarUrl(_ctx.stringValue("GetUserResponse.UserInfo.UserAvatarUrl"));
		userInfo.setDepartId(_ctx.stringValue("GetUserResponse.UserInfo.DepartId"));
		userInfo.setDepartName(_ctx.stringValue("GetUserResponse.UserInfo.DepartName"));
		getUserResponse.setUserInfo(userInfo);
	 
	 	return getUserResponse;
	}
}