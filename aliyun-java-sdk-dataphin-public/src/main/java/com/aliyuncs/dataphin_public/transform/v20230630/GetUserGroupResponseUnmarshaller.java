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

import com.aliyuncs.dataphin_public.model.v20230630.GetUserGroupResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetUserGroupResponse.UserGroupInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetUserGroupResponse.UserGroupInfo.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserGroupResponseUnmarshaller {

	public static GetUserGroupResponse unmarshall(GetUserGroupResponse getUserGroupResponse, UnmarshallerContext _ctx) {
		
		getUserGroupResponse.setRequestId(_ctx.stringValue("GetUserGroupResponse.RequestId"));
		getUserGroupResponse.setSuccess(_ctx.booleanValue("GetUserGroupResponse.Success"));
		getUserGroupResponse.setHttpStatusCode(_ctx.integerValue("GetUserGroupResponse.HttpStatusCode"));
		getUserGroupResponse.setCode(_ctx.stringValue("GetUserGroupResponse.Code"));
		getUserGroupResponse.setMessage(_ctx.stringValue("GetUserGroupResponse.Message"));

		UserGroupInfo userGroupInfo = new UserGroupInfo();
		userGroupInfo.setId(_ctx.stringValue("GetUserGroupResponse.UserGroupInfo.Id"));
		userGroupInfo.setName(_ctx.stringValue("GetUserGroupResponse.UserGroupInfo.Name"));
		userGroupInfo.setDescription(_ctx.stringValue("GetUserGroupResponse.UserGroupInfo.Description"));
		userGroupInfo.setActive(_ctx.booleanValue("GetUserGroupResponse.UserGroupInfo.Active"));
		userGroupInfo.setMyRole(_ctx.stringValue("GetUserGroupResponse.UserGroupInfo.MyRole"));

		List<User> adminList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("GetUserGroupResponse.UserGroupInfo.AdminList.Length"); i++) {
			User user = new User();
			user.setId(_ctx.stringValue("GetUserGroupResponse.UserGroupInfo.AdminList["+ i +"].Id"));
			user.setDisplayName(_ctx.stringValue("GetUserGroupResponse.UserGroupInfo.AdminList["+ i +"].DisplayName"));
			user.setAccountName(_ctx.stringValue("GetUserGroupResponse.UserGroupInfo.AdminList["+ i +"].AccountName"));

			adminList.add(user);
		}
		userGroupInfo.setAdminList(adminList);
		getUserGroupResponse.setUserGroupInfo(userGroupInfo);
	 
	 	return getUserGroupResponse;
	}
}