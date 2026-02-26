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

import com.aliyuncs.live.model.v20161101.ListMuteGroupUserResponse;
import com.aliyuncs.live.model.v20161101.ListMuteGroupUserResponse.Result;
import com.aliyuncs.live.model.v20161101.ListMuteGroupUserResponse.Result.UserListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMuteGroupUserResponseUnmarshaller {

	public static ListMuteGroupUserResponse unmarshall(ListMuteGroupUserResponse listMuteGroupUserResponse, UnmarshallerContext _ctx) {
		
		listMuteGroupUserResponse.setRequestId(_ctx.stringValue("ListMuteGroupUserResponse.RequestId"));

		Result result = new Result();
		result.setHasMore(_ctx.booleanValue("ListMuteGroupUserResponse.Result.HasMore"));
		result.setTotal(_ctx.integerValue("ListMuteGroupUserResponse.Result.Total"));

		List<UserListItem> userList = new ArrayList<UserListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMuteGroupUserResponse.Result.UserList.Length"); i++) {
			UserListItem userListItem = new UserListItem();
			userListItem.setUserId(_ctx.stringValue("ListMuteGroupUserResponse.Result.UserList["+ i +"].UserId"));

			userList.add(userListItem);
		}
		result.setUserList(userList);
		listMuteGroupUserResponse.setResult(result);
	 
	 	return listMuteGroupUserResponse;
	}
}