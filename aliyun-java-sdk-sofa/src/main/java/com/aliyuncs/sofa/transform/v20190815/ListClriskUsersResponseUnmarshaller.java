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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListClriskUsersResponse;
import com.aliyuncs.sofa.model.v20190815.ListClriskUsersResponse.UserListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskUsersResponseUnmarshaller {

	public static ListClriskUsersResponse unmarshall(ListClriskUsersResponse listClriskUsersResponse, UnmarshallerContext _ctx) {
		
		listClriskUsersResponse.setRequestId(_ctx.stringValue("ListClriskUsersResponse.RequestId"));
		listClriskUsersResponse.setResultCode(_ctx.stringValue("ListClriskUsersResponse.ResultCode"));
		listClriskUsersResponse.setResultMessage(_ctx.stringValue("ListClriskUsersResponse.ResultMessage"));

		List<UserListItem> userList = new ArrayList<UserListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskUsersResponse.UserList.Length"); i++) {
			UserListItem userListItem = new UserListItem();
			userListItem.setEmail(_ctx.stringValue("ListClriskUsersResponse.UserList["+ i +"].Email"));
			userListItem.setLoginName(_ctx.stringValue("ListClriskUsersResponse.UserList["+ i +"].LoginName"));
			userListItem.setMobile(_ctx.stringValue("ListClriskUsersResponse.UserList["+ i +"].Mobile"));
			userListItem.setNickName(_ctx.stringValue("ListClriskUsersResponse.UserList["+ i +"].NickName"));
			userListItem.setOriginId(_ctx.stringValue("ListClriskUsersResponse.UserList["+ i +"].OriginId"));
			userListItem.setType(_ctx.stringValue("ListClriskUsersResponse.UserList["+ i +"].Type"));

			userList.add(userListItem);
		}
		listClriskUsersResponse.setUserList(userList);
	 
	 	return listClriskUsersResponse;
	}
}