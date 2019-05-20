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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListAllImsUsersResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAllImsUsersResponse.Users;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAllImsUsersResponse.Users.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllImsUsersResponseUnmarshaller {

	public static ListAllImsUsersResponse unmarshall(ListAllImsUsersResponse listAllImsUsersResponse, UnmarshallerContext context) {
		
		listAllImsUsersResponse.setRequestId(context.stringValue("ListAllImsUsersResponse.RequestId"));
		listAllImsUsersResponse.setSuccess(context.booleanValue("ListAllImsUsersResponse.Success"));
		listAllImsUsersResponse.setCode(context.stringValue("ListAllImsUsersResponse.Code"));
		listAllImsUsersResponse.setMessage(context.stringValue("ListAllImsUsersResponse.Message"));
		listAllImsUsersResponse.setHttpStatusCode(context.integerValue("ListAllImsUsersResponse.HttpStatusCode"));

		Users users = new Users();
		users.setTotalCount(context.integerValue("ListAllImsUsersResponse.Users.TotalCount"));
		users.setPageNumber(context.integerValue("ListAllImsUsersResponse.Users.PageNumber"));
		users.setPageSize(context.integerValue("ListAllImsUsersResponse.Users.PageSize"));

		List<User> list = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("ListAllImsUsersResponse.Users.List.Length"); i++) {
			User user = new User();
			user.setUserId(context.stringValue("ListAllImsUsersResponse.Users.List["+ i +"].UserId"));
			user.setUserPrincipalName(context.stringValue("ListAllImsUsersResponse.Users.List["+ i +"].UserPrincipalName"));
			user.setDisplayName(context.stringValue("ListAllImsUsersResponse.Users.List["+ i +"].DisplayName"));
			user.setPhone(context.stringValue("ListAllImsUsersResponse.Users.List["+ i +"].Phone"));
			user.setEmail(context.stringValue("ListAllImsUsersResponse.Users.List["+ i +"].Email"));

			list.add(user);
		}
		users.setList(list);
		listAllImsUsersResponse.setUsers(users);
	 
	 	return listAllImsUsersResponse;
	}
}