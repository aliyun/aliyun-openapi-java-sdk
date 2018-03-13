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
package com.aliyuncs.ram.transform.v20150501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ram.model.v20150501.ListUsersResponse;
import com.aliyuncs.ram.model.v20150501.ListUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext context) {
		
		listUsersResponse.setRequestId(context.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setIsTruncated(context.booleanValue("ListUsersResponse.IsTruncated"));
		listUsersResponse.setMarker(context.stringValue("ListUsersResponse.Marker"));

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("ListUsersResponse.Users.Length"); i++) {
			User user = new User();
			user.setUserId(context.stringValue("ListUsersResponse.Users["+ i +"].UserId"));
			user.setUserName(context.stringValue("ListUsersResponse.Users["+ i +"].UserName"));
			user.setDisplayName(context.stringValue("ListUsersResponse.Users["+ i +"].DisplayName"));
			user.setMobilePhone(context.stringValue("ListUsersResponse.Users["+ i +"].MobilePhone"));
			user.setEmail(context.stringValue("ListUsersResponse.Users["+ i +"].Email"));
			user.setComments(context.stringValue("ListUsersResponse.Users["+ i +"].Comments"));
			user.setCreateDate(context.stringValue("ListUsersResponse.Users["+ i +"].CreateDate"));
			user.setUpdateDate(context.stringValue("ListUsersResponse.Users["+ i +"].UpdateDate"));

			users.add(user);
		}
		listUsersResponse.setUsers(users);
	 
	 	return listUsersResponse;
	}
}