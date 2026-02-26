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

import com.aliyuncs.dataphin_public.model.v20230630.ListTenantMembersResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListTenantMembersResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListTenantMembersResponse.PageResult.User;
import com.aliyuncs.dataphin_public.model.v20230630.ListTenantMembersResponse.PageResult.User.UserGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTenantMembersResponseUnmarshaller {

	public static ListTenantMembersResponse unmarshall(ListTenantMembersResponse listTenantMembersResponse, UnmarshallerContext _ctx) {
		
		listTenantMembersResponse.setRequestId(_ctx.stringValue("ListTenantMembersResponse.RequestId"));
		listTenantMembersResponse.setSuccess(_ctx.booleanValue("ListTenantMembersResponse.Success"));
		listTenantMembersResponse.setHttpStatusCode(_ctx.integerValue("ListTenantMembersResponse.HttpStatusCode"));
		listTenantMembersResponse.setCode(_ctx.stringValue("ListTenantMembersResponse.Code"));
		listTenantMembersResponse.setMessage(_ctx.stringValue("ListTenantMembersResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListTenantMembersResponse.PageResult.TotalCount"));

		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListTenantMembersResponse.PageResult.UserList.Length"); i++) {
			User user = new User();
			user.setId(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].Id"));
			user.setSourceType(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].SourceType"));
			user.setSourceId(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].SourceId"));
			user.setName(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].Name"));
			user.setDisplayName(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].DisplayName"));
			user.setDisplayNameWithoutStatus(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].DisplayNameWithoutStatus"));
			user.setAccountName(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].AccountName"));
			user.setRealName(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].RealName"));
			user.setNickName(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].NickName"));
			user.setGmtCreate(_ctx.longValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].GmtCreate"));
			user.setMobilePhone(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].MobilePhone"));
			user.setMail(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].Mail"));
			user.setDingNumber(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].DingNumber"));
			user.setEnableWhiteIp(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].EnableWhiteIp"));
			user.setWhiteIp(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].WhiteIp"));
			user.setGmtModified(_ctx.longValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].GmtModified"));

			List<String> roleList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].RoleList.Length"); j++) {
				roleList.add(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].RoleList["+ j +"]"));
			}
			user.setRoleList(roleList);

			List<UserGroup> userGroupList = new ArrayList<UserGroup>();
			for (int j = 0; j < _ctx.lengthValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].UserGroupList.Length"); j++) {
				UserGroup userGroup = new UserGroup();
				userGroup.setId(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].UserGroupList["+ j +"].Id"));
				userGroup.setName(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].UserGroupList["+ j +"].Name"));
				userGroup.setDescription(_ctx.stringValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].UserGroupList["+ j +"].Description"));
				userGroup.setActive(_ctx.booleanValue("ListTenantMembersResponse.PageResult.UserList["+ i +"].UserGroupList["+ j +"].Active"));

				userGroupList.add(userGroup);
			}
			user.setUserGroupList(userGroupList);

			userList.add(user);
		}
		pageResult.setUserList(userList);
		listTenantMembersResponse.setPageResult(pageResult);
	 
	 	return listTenantMembersResponse;
	}
}