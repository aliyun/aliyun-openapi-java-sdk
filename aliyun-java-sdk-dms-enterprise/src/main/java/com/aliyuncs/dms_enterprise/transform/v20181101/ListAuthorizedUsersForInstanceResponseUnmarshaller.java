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

import com.aliyuncs.dms_enterprise.model.v20181101.ListAuthorizedUsersForInstanceResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListAuthorizedUsersForInstanceResponse.UsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAuthorizedUsersForInstanceResponseUnmarshaller {

	public static ListAuthorizedUsersForInstanceResponse unmarshall(ListAuthorizedUsersForInstanceResponse listAuthorizedUsersForInstanceResponse, UnmarshallerContext _ctx) {
		
		listAuthorizedUsersForInstanceResponse.setRequestId(_ctx.stringValue("ListAuthorizedUsersForInstanceResponse.RequestId"));

		List<UsersItem> users = new ArrayList<UsersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAuthorizedUsersForInstanceResponse.Users.Length"); i++) {
			UsersItem usersItem = new UsersItem();
			usersItem.setUserId(_ctx.stringValue("ListAuthorizedUsersForInstanceResponse.Users["+ i +"].UserId"));
			usersItem.setUid(_ctx.stringValue("ListAuthorizedUsersForInstanceResponse.Users["+ i +"].Uid"));
			usersItem.setUserNickName(_ctx.stringValue("ListAuthorizedUsersForInstanceResponse.Users["+ i +"].UserNickName"));
			usersItem.setUserRealName(_ctx.stringValue("ListAuthorizedUsersForInstanceResponse.Users["+ i +"].UserRealName"));

			users.add(usersItem);
		}
		listAuthorizedUsersForInstanceResponse.setUsers(users);
	 
	 	return listAuthorizedUsersForInstanceResponse;
	}
}