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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20191030.ListUsersResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.ListUsersResponse.Data;
import com.aliyuncs.aliyuncvc.model.v20191030.ListUsersResponse.Data.UserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setErrorCode(_ctx.integerValue("ListUsersResponse.ErrorCode"));
		listUsersResponse.setMessage(_ctx.stringValue("ListUsersResponse.Message"));
		listUsersResponse.setSuccess(_ctx.booleanValue("ListUsersResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListUsersResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("ListUsersResponse.Data.PageSize"));
		data.setPageNumber(_ctx.integerValue("ListUsersResponse.Data.PageNumber"));

		List<UserInfo> userInfos = new ArrayList<UserInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Data.UserInfos.Length"); i++) {
			UserInfo userInfo = new UserInfo();
			userInfo.setCreateTime(_ctx.longValue("ListUsersResponse.Data.UserInfos["+ i +"].CreateTime"));
			userInfo.setGroupName(_ctx.stringValue("ListUsersResponse.Data.UserInfos["+ i +"].GroupName"));
			userInfo.setUserName(_ctx.stringValue("ListUsersResponse.Data.UserInfos["+ i +"].UserName"));
			userInfo.setGroupId(_ctx.stringValue("ListUsersResponse.Data.UserInfos["+ i +"].GroupId"));
			userInfo.setDepartName(_ctx.stringValue("ListUsersResponse.Data.UserInfos["+ i +"].DepartName"));
			userInfo.setDepartId(_ctx.stringValue("ListUsersResponse.Data.UserInfos["+ i +"].DepartId"));
			userInfo.setUserEmail(_ctx.stringValue("ListUsersResponse.Data.UserInfos["+ i +"].UserEmail"));
			userInfo.setUserTel(_ctx.stringValue("ListUsersResponse.Data.UserInfos["+ i +"].UserTel"));
			userInfo.setUserMobile(_ctx.stringValue("ListUsersResponse.Data.UserInfos["+ i +"].UserMobile"));
			userInfo.setUserAvatarUrl(_ctx.stringValue("ListUsersResponse.Data.UserInfos["+ i +"].UserAvatarUrl"));
			userInfo.setJobName(_ctx.stringValue("ListUsersResponse.Data.UserInfos["+ i +"].JobName"));
			userInfo.setUserId(_ctx.stringValue("ListUsersResponse.Data.UserInfos["+ i +"].UserId"));

			userInfos.add(userInfo);
		}
		data.setUserInfos(userInfos);
		listUsersResponse.setData(data);
	 
	 	return listUsersResponse;
	}
}