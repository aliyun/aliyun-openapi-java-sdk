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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.ListLiveMessageGroupUsersResponse;
import com.aliyuncs.live.model.v20161101.ListLiveMessageGroupUsersResponse.Users;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLiveMessageGroupUsersResponseUnmarshaller {

	public static ListLiveMessageGroupUsersResponse unmarshall(ListLiveMessageGroupUsersResponse listLiveMessageGroupUsersResponse, UnmarshallerContext _ctx) {
		
		listLiveMessageGroupUsersResponse.setRequestId(_ctx.stringValue("ListLiveMessageGroupUsersResponse.RequestId"));
		listLiveMessageGroupUsersResponse.setGroupId(_ctx.stringValue("ListLiveMessageGroupUsersResponse.GroupId"));
		listLiveMessageGroupUsersResponse.setNextPageToken(_ctx.longValue("ListLiveMessageGroupUsersResponse.NextPageToken"));
		listLiveMessageGroupUsersResponse.setHasmore(_ctx.booleanValue("ListLiveMessageGroupUsersResponse.Hasmore"));

		List<Users> userList = new ArrayList<Users>();
		for (int i = 0; i < _ctx.lengthValue("ListLiveMessageGroupUsersResponse.UserList.Length"); i++) {
			Users users = new Users();
			users.setUserId(_ctx.stringValue("ListLiveMessageGroupUsersResponse.UserList["+ i +"].UserId"));
			users.setUserInfo(_ctx.stringValue("ListLiveMessageGroupUsersResponse.UserList["+ i +"].UserInfo"));

			userList.add(users);
		}
		listLiveMessageGroupUsersResponse.setUserList(userList);
	 
	 	return listLiveMessageGroupUsersResponse;
	}
}