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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListAuthorizedUsersForDatabaseResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListAuthorizedUsersForDatabaseResponse.UsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAuthorizedUsersForDatabaseResponseUnmarshaller {

	public static ListAuthorizedUsersForDatabaseResponse unmarshall(ListAuthorizedUsersForDatabaseResponse listAuthorizedUsersForDatabaseResponse, UnmarshallerContext _ctx) {
		
		listAuthorizedUsersForDatabaseResponse.setRequestId(_ctx.stringValue("ListAuthorizedUsersForDatabaseResponse.RequestId"));

		List<UsersItem> users = new ArrayList<UsersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAuthorizedUsersForDatabaseResponse.Users.Length"); i++) {
			UsersItem usersItem = new UsersItem();
			usersItem.setUserId(_ctx.stringValue("ListAuthorizedUsersForDatabaseResponse.Users["+ i +"].UserId"));
			usersItem.setUserNickName(_ctx.stringValue("ListAuthorizedUsersForDatabaseResponse.Users["+ i +"].UserNickName"));
			usersItem.setUid(_ctx.stringValue("ListAuthorizedUsersForDatabaseResponse.Users["+ i +"].Uid"));

			users.add(usersItem);
		}
		listAuthorizedUsersForDatabaseResponse.setUsers(users);
	 
	 	return listAuthorizedUsersForDatabaseResponse;
	}
}