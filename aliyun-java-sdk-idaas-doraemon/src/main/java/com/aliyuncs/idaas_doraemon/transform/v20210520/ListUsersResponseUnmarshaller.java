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

package com.aliyuncs.idaas_doraemon.transform.v20210520;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idaas_doraemon.model.v20210520.ListUsersResponse;
import com.aliyuncs.idaas_doraemon.model.v20210520.ListUsersResponse.UsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setTotalCount(_ctx.longValue("ListUsersResponse.TotalCount"));

		List<UsersItem> users = new ArrayList<UsersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Users.Length"); i++) {
			UsersItem usersItem = new UsersItem();
			usersItem.setUserId(_ctx.stringValue("ListUsersResponse.Users["+ i +"].UserId"));
			usersItem.setUserName(_ctx.stringValue("ListUsersResponse.Users["+ i +"].UserName"));
			usersItem.setUserDisplayName(_ctx.stringValue("ListUsersResponse.Users["+ i +"].UserDisplayName"));

			users.add(usersItem);
		}
		listUsersResponse.setUsers(users);
	 
	 	return listUsersResponse;
	}
}