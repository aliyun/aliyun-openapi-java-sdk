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

import com.aliyuncs.live.model.v20161101.CheckLiveMessageUsersInGroupResponse;
import com.aliyuncs.live.model.v20161101.CheckLiveMessageUsersInGroupResponse.UsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLiveMessageUsersInGroupResponseUnmarshaller {

	public static CheckLiveMessageUsersInGroupResponse unmarshall(CheckLiveMessageUsersInGroupResponse checkLiveMessageUsersInGroupResponse, UnmarshallerContext _ctx) {
		
		checkLiveMessageUsersInGroupResponse.setRequestId(_ctx.stringValue("CheckLiveMessageUsersInGroupResponse.RequestId"));

		List<UsersItem> users = new ArrayList<UsersItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckLiveMessageUsersInGroupResponse.Users.Length"); i++) {
			UsersItem usersItem = new UsersItem();
			usersItem.setUserId(_ctx.stringValue("CheckLiveMessageUsersInGroupResponse.Users["+ i +"].UserId"));
			usersItem.setOnline(_ctx.booleanValue("CheckLiveMessageUsersInGroupResponse.Users["+ i +"].Online"));

			users.add(usersItem);
		}
		checkLiveMessageUsersInGroupResponse.setUsers(users);
	 
	 	return checkLiveMessageUsersInGroupResponse;
	}
}