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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListUsersResponse;
import com.aliyuncs.emr.model.v20160408.ListUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));

		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.UserList.Length"); i++) {
			User user = new User();
			user.setUserName(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].UserName"));
			user.setGroupName(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].GroupName"));
			user.setUserId(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].UserId"));
			user.setKnoxStatus(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].KnoxStatus"));
			user.setLinuxStatus(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].LinuxStatus"));
			user.setKerberosStatus(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].KerberosStatus"));

			userList.add(user);
		}
		listUsersResponse.setUserList(userList);
	 
	 	return listUsersResponse;
	}
}