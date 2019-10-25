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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20190919.QueryUserListResponse;
import com.aliyuncs.aliyuncvc.model.v20190919.QueryUserListResponse.Data;
import com.aliyuncs.aliyuncvc.model.v20190919.QueryUserListResponse.Data.UserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserListResponseUnmarshaller {

	public static QueryUserListResponse unmarshall(QueryUserListResponse queryUserListResponse, UnmarshallerContext _ctx) {
		
		queryUserListResponse.setRequestId(_ctx.stringValue("QueryUserListResponse.RequestId"));
		queryUserListResponse.setErrorCode(_ctx.integerValue("QueryUserListResponse.ErrorCode"));
		queryUserListResponse.setMessage(_ctx.stringValue("QueryUserListResponse.Message"));
		queryUserListResponse.setSuccess(_ctx.booleanValue("QueryUserListResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("QueryUserListResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("QueryUserListResponse.Data.PageSize"));
		data.setPageNumber(_ctx.integerValue("QueryUserListResponse.Data.PageNumber"));

		List<UserInfo> userInfos = new ArrayList<UserInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryUserListResponse.Data.UserInfos.Length"); i++) {
			UserInfo userInfo = new UserInfo();
			userInfo.setCreateTime(_ctx.longValue("QueryUserListResponse.Data.UserInfos["+ i +"].CreateTime"));
			userInfo.setGroupName(_ctx.stringValue("QueryUserListResponse.Data.UserInfos["+ i +"].GroupName"));
			userInfo.setUserName(_ctx.stringValue("QueryUserListResponse.Data.UserInfos["+ i +"].UserName"));
			userInfo.setGroupId(_ctx.stringValue("QueryUserListResponse.Data.UserInfos["+ i +"].GroupId"));
			userInfo.setGroupName1(_ctx.stringValue("QueryUserListResponse.Data.UserInfos["+ i +"].GroupName"));
			userInfo.setDepartName(_ctx.stringValue("QueryUserListResponse.Data.UserInfos["+ i +"].DepartName"));
			userInfo.setDepartId(_ctx.stringValue("QueryUserListResponse.Data.UserInfos["+ i +"].DepartId"));
			userInfo.setUserEmail(_ctx.stringValue("QueryUserListResponse.Data.UserInfos["+ i +"].UserEmail"));
			userInfo.setUserTel(_ctx.stringValue("QueryUserListResponse.Data.UserInfos["+ i +"].UserTel"));
			userInfo.setUserMobile(_ctx.stringValue("QueryUserListResponse.Data.UserInfos["+ i +"].UserMobile"));
			userInfo.setUserAvatarUrl(_ctx.stringValue("QueryUserListResponse.Data.UserInfos["+ i +"].UserAvatarUrl"));

			userInfos.add(userInfo);
		}
		data.setUserInfos(userInfos);
		queryUserListResponse.setData(data);
	 
	 	return queryUserListResponse;
	}
}