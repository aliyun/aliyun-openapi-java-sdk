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

import com.aliyuncs.dataphin_public.model.v20230630.ListUserGroupMembersResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListUserGroupMembersResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListUserGroupMembersResponse.PageResult.UserGroupMemberInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListUserGroupMembersResponse.PageResult.UserGroupMemberInfo.Creator;
import com.aliyuncs.dataphin_public.model.v20230630.ListUserGroupMembersResponse.PageResult.UserGroupMemberInfo.UserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserGroupMembersResponseUnmarshaller {

	public static ListUserGroupMembersResponse unmarshall(ListUserGroupMembersResponse listUserGroupMembersResponse, UnmarshallerContext _ctx) {
		
		listUserGroupMembersResponse.setRequestId(_ctx.stringValue("ListUserGroupMembersResponse.RequestId"));
		listUserGroupMembersResponse.setSuccess(_ctx.booleanValue("ListUserGroupMembersResponse.Success"));
		listUserGroupMembersResponse.setHttpStatusCode(_ctx.integerValue("ListUserGroupMembersResponse.HttpStatusCode"));
		listUserGroupMembersResponse.setCode(_ctx.stringValue("ListUserGroupMembersResponse.Code"));
		listUserGroupMembersResponse.setMessage(_ctx.stringValue("ListUserGroupMembersResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListUserGroupMembersResponse.PageResult.TotalCount"));

		List<UserGroupMemberInfo> memberList = new ArrayList<UserGroupMemberInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListUserGroupMembersResponse.PageResult.MemberList.Length"); i++) {
			UserGroupMemberInfo userGroupMemberInfo = new UserGroupMemberInfo();
			userGroupMemberInfo.setId(_ctx.stringValue("ListUserGroupMembersResponse.PageResult.MemberList["+ i +"].Id"));
			userGroupMemberInfo.setUserGroupId(_ctx.stringValue("ListUserGroupMembersResponse.PageResult.MemberList["+ i +"].UserGroupId"));
			userGroupMemberInfo.setUserRole(_ctx.stringValue("ListUserGroupMembersResponse.PageResult.MemberList["+ i +"].UserRole"));
			userGroupMemberInfo.setGmtCreate(_ctx.longValue("ListUserGroupMembersResponse.PageResult.MemberList["+ i +"].GmtCreate"));

			UserInfo userInfo = new UserInfo();
			userInfo.setId(_ctx.stringValue("ListUserGroupMembersResponse.PageResult.MemberList["+ i +"].UserInfo.Id"));
			userInfo.setDisplayName(_ctx.stringValue("ListUserGroupMembersResponse.PageResult.MemberList["+ i +"].UserInfo.DisplayName"));
			userInfo.setAccountName(_ctx.stringValue("ListUserGroupMembersResponse.PageResult.MemberList["+ i +"].UserInfo.AccountName"));
			userGroupMemberInfo.setUserInfo(userInfo);

			Creator creator = new Creator();
			creator.setId(_ctx.stringValue("ListUserGroupMembersResponse.PageResult.MemberList["+ i +"].Creator.Id"));
			creator.setDisplayName(_ctx.stringValue("ListUserGroupMembersResponse.PageResult.MemberList["+ i +"].Creator.DisplayName"));
			creator.setAccountName(_ctx.stringValue("ListUserGroupMembersResponse.PageResult.MemberList["+ i +"].Creator.AccountName"));
			userGroupMemberInfo.setCreator(creator);

			memberList.add(userGroupMemberInfo);
		}
		pageResult.setMemberList(memberList);
		listUserGroupMembersResponse.setPageResult(pageResult);
	 
	 	return listUserGroupMembersResponse;
	}
}