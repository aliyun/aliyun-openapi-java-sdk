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

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext context) {
		
		listUsersResponse.setRequestId(context.stringValue("ListUsersResponse.RequestId"));

		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("ListUsersResponse.UserList.Length"); i++) {
			User user = new User();
			user.setUserName(context.stringValue("ListUsersResponse.UserList["+ i +"].UserName"));
			user.setGroupName(context.stringValue("ListUsersResponse.UserList["+ i +"].GroupName"));
			user.setUserId(context.stringValue("ListUsersResponse.UserList["+ i +"].UserId"));
			user.setKnoxStatus(context.stringValue("ListUsersResponse.UserList["+ i +"].KnoxStatus"));
			user.setLinuxStatus(context.stringValue("ListUsersResponse.UserList["+ i +"].LinuxStatus"));
			user.setKerberosStatus(context.stringValue("ListUsersResponse.UserList["+ i +"].KerberosStatus"));

			userList.add(user);
		}
		listUsersResponse.setUserList(userList);
	 
	 	return listUsersResponse;
	}
}