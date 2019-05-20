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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListImsUsersResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListImsUsersResponse.Users;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListImsUsersResponse.Users.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImsUsersResponseUnmarshaller {

	public static ListImsUsersResponse unmarshall(ListImsUsersResponse listImsUsersResponse, UnmarshallerContext context) {
		
		listImsUsersResponse.setRequestId(context.stringValue("ListImsUsersResponse.RequestId"));
		listImsUsersResponse.setSuccess(context.booleanValue("ListImsUsersResponse.Success"));
		listImsUsersResponse.setCode(context.stringValue("ListImsUsersResponse.Code"));
		listImsUsersResponse.setMessage(context.stringValue("ListImsUsersResponse.Message"));
		listImsUsersResponse.setHttpStatusCode(context.integerValue("ListImsUsersResponse.HttpStatusCode"));

		Users users = new Users();
		users.setTotalCount(context.integerValue("ListImsUsersResponse.Users.TotalCount"));
		users.setPageNumber(context.integerValue("ListImsUsersResponse.Users.PageNumber"));
		users.setPageSize(context.integerValue("ListImsUsersResponse.Users.PageSize"));

		List<User> list = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("ListImsUsersResponse.Users.List.Length"); i++) {
			User user = new User();
			user.setUserId(context.stringValue("ListImsUsersResponse.Users.List["+ i +"].UserId"));
			user.setUserPrincipalName(context.stringValue("ListImsUsersResponse.Users.List["+ i +"].UserPrincipalName"));
			user.setDisplayName(context.stringValue("ListImsUsersResponse.Users.List["+ i +"].DisplayName"));
			user.setPhone(context.stringValue("ListImsUsersResponse.Users.List["+ i +"].Phone"));
			user.setEmail(context.stringValue("ListImsUsersResponse.Users.List["+ i +"].Email"));

			list.add(user);
		}
		users.setList(list);
		listImsUsersResponse.setUsers(users);
	 
	 	return listImsUsersResponse;
	}
}