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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.ListDirectoryUsersResponse;
import com.aliyuncs.ecd.model.v20200930.ListDirectoryUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDirectoryUsersResponseUnmarshaller {

	public static ListDirectoryUsersResponse unmarshall(ListDirectoryUsersResponse listDirectoryUsersResponse, UnmarshallerContext _ctx) {
		
		listDirectoryUsersResponse.setRequestId(_ctx.stringValue("ListDirectoryUsersResponse.RequestId"));
		listDirectoryUsersResponse.setNextToken(_ctx.stringValue("ListDirectoryUsersResponse.NextToken"));

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListDirectoryUsersResponse.Users.Length"); i++) {
			User user = new User();
			user.setEndUser(_ctx.stringValue("ListDirectoryUsersResponse.Users["+ i +"].EndUser"));

			users.add(user);
		}
		listDirectoryUsersResponse.setUsers(users);
	 
	 	return listDirectoryUsersResponse;
	}
}