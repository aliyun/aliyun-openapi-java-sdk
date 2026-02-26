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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListUserGroupsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListUserGroupsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListUserGroupsResponse.PageResult.UserGroupInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListUserGroupsResponse.PageResult.UserGroupInfo.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserGroupsResponseUnmarshaller {

	public static ListUserGroupsResponse unmarshall(ListUserGroupsResponse listUserGroupsResponse, UnmarshallerContext _ctx) {
		
		listUserGroupsResponse.setRequestId(_ctx.stringValue("ListUserGroupsResponse.RequestId"));
		listUserGroupsResponse.setSuccess(_ctx.booleanValue("ListUserGroupsResponse.Success"));
		listUserGroupsResponse.setHttpStatusCode(_ctx.integerValue("ListUserGroupsResponse.HttpStatusCode"));
		listUserGroupsResponse.setCode(_ctx.stringValue("ListUserGroupsResponse.Code"));
		listUserGroupsResponse.setMessage(_ctx.stringValue("ListUserGroupsResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListUserGroupsResponse.PageResult.TotalCount"));

		List<UserGroupInfo> userGroupList = new ArrayList<UserGroupInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListUserGroupsResponse.PageResult.UserGroupList.Length"); i++) {
			UserGroupInfo userGroupInfo = new UserGroupInfo();
			userGroupInfo.setId(_ctx.stringValue("ListUserGroupsResponse.PageResult.UserGroupList["+ i +"].Id"));
			userGroupInfo.setName(_ctx.stringValue("ListUserGroupsResponse.PageResult.UserGroupList["+ i +"].Name"));
			userGroupInfo.setDescription(_ctx.stringValue("ListUserGroupsResponse.PageResult.UserGroupList["+ i +"].Description"));
			userGroupInfo.setActive(_ctx.booleanValue("ListUserGroupsResponse.PageResult.UserGroupList["+ i +"].Active"));
			userGroupInfo.setMyRole(_ctx.stringValue("ListUserGroupsResponse.PageResult.UserGroupList["+ i +"].MyRole"));

			List<User> adminList = new ArrayList<User>();
			for (int j = 0; j < _ctx.lengthValue("ListUserGroupsResponse.PageResult.UserGroupList["+ i +"].AdminList.Length"); j++) {
				User user = new User();
				user.setId(_ctx.stringValue("ListUserGroupsResponse.PageResult.UserGroupList["+ i +"].AdminList["+ j +"].Id"));
				user.setDisplayName(_ctx.stringValue("ListUserGroupsResponse.PageResult.UserGroupList["+ i +"].AdminList["+ j +"].DisplayName"));
				user.setAccountName(_ctx.stringValue("ListUserGroupsResponse.PageResult.UserGroupList["+ i +"].AdminList["+ j +"].AccountName"));

				adminList.add(user);
			}
			userGroupInfo.setAdminList(adminList);

			userGroupList.add(userGroupInfo);
		}
		pageResult.setUserGroupList(userGroupList);
		listUserGroupsResponse.setPageResult(pageResult);
	 
	 	return listUserGroupsResponse;
	}
}