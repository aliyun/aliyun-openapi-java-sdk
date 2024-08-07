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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListUsersForGroupResponse;
import com.aliyuncs.eiam.model.v20211201.ListUsersForGroupResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersForGroupResponseUnmarshaller {

	public static ListUsersForGroupResponse unmarshall(ListUsersForGroupResponse listUsersForGroupResponse, UnmarshallerContext _ctx) {
		
		listUsersForGroupResponse.setRequestId(_ctx.stringValue("ListUsersForGroupResponse.RequestId"));
		listUsersForGroupResponse.setTotalCount(_ctx.longValue("ListUsersForGroupResponse.TotalCount"));

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersForGroupResponse.Users.Length"); i++) {
			User user = new User();
			user.setUserId(_ctx.stringValue("ListUsersForGroupResponse.Users["+ i +"].UserId"));
			user.setGroupMemberRelationSourceId(_ctx.stringValue("ListUsersForGroupResponse.Users["+ i +"].GroupMemberRelationSourceId"));
			user.setGroupMemberRelationSourceType(_ctx.stringValue("ListUsersForGroupResponse.Users["+ i +"].GroupMemberRelationSourceType"));

			users.add(user);
		}
		listUsersForGroupResponse.setUsers(users);
	 
	 	return listUsersForGroupResponse;
	}
}