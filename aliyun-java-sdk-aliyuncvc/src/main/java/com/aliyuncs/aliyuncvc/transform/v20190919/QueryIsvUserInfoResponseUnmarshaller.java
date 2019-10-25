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

package com.aliyuncs.aliyuncvc.transform.v20190919;

import com.aliyuncs.aliyuncvc.model.v20190919.QueryIsvUserInfoResponse;
import com.aliyuncs.aliyuncvc.model.v20190919.QueryIsvUserInfoResponse.UserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIsvUserInfoResponseUnmarshaller {

	public static QueryIsvUserInfoResponse unmarshall(QueryIsvUserInfoResponse queryIsvUserInfoResponse, UnmarshallerContext _ctx) {
		
		queryIsvUserInfoResponse.setRequestId(_ctx.stringValue("QueryIsvUserInfoResponse.RequestId"));
		queryIsvUserInfoResponse.setErrorCode(_ctx.integerValue("QueryIsvUserInfoResponse.ErrorCode"));
		queryIsvUserInfoResponse.setMessage(_ctx.stringValue("QueryIsvUserInfoResponse.Message"));
		queryIsvUserInfoResponse.setSuccess(_ctx.booleanValue("QueryIsvUserInfoResponse.Success"));

		UserInfo userInfo = new UserInfo();
		userInfo.setUserName(_ctx.stringValue("QueryIsvUserInfoResponse.UserInfo.UserName"));
		userInfo.setCreateTime(_ctx.longValue("QueryIsvUserInfoResponse.UserInfo.CreateTime"));
		userInfo.setGroupId(_ctx.stringValue("QueryIsvUserInfoResponse.UserInfo.GroupId"));
		userInfo.setGroupName(_ctx.stringValue("QueryIsvUserInfoResponse.UserInfo.GroupName"));
		userInfo.setUserId(_ctx.stringValue("QueryIsvUserInfoResponse.UserInfo.UserId"));
		userInfo.setUserTel(_ctx.stringValue("QueryIsvUserInfoResponse.UserInfo.UserTel"));
		userInfo.setUserEmail(_ctx.stringValue("QueryIsvUserInfoResponse.UserInfo.UserEmail"));
		userInfo.setUserMobile(_ctx.stringValue("QueryIsvUserInfoResponse.UserInfo.UserMobile"));
		userInfo.setUserAvatarUrl(_ctx.stringValue("QueryIsvUserInfoResponse.UserInfo.UserAvatarUrl"));
		userInfo.setDepartId(_ctx.stringValue("QueryIsvUserInfoResponse.UserInfo.DepartId"));
		userInfo.setDepartName(_ctx.stringValue("QueryIsvUserInfoResponse.UserInfo.DepartName"));
		queryIsvUserInfoResponse.setUserInfo(userInfo);
	 
	 	return queryIsvUserInfoResponse;
	}
}