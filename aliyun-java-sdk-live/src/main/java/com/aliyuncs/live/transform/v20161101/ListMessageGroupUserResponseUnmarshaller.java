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

import com.aliyuncs.live.model.v20161101.ListMessageGroupUserResponse;
import com.aliyuncs.live.model.v20161101.ListMessageGroupUserResponse.Result;
import com.aliyuncs.live.model.v20161101.ListMessageGroupUserResponse.Result.UserListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMessageGroupUserResponseUnmarshaller {

	public static ListMessageGroupUserResponse unmarshall(ListMessageGroupUserResponse listMessageGroupUserResponse, UnmarshallerContext _ctx) {
		
		listMessageGroupUserResponse.setRequestId(_ctx.stringValue("ListMessageGroupUserResponse.RequestId"));

		Result result = new Result();
		result.setTotal(_ctx.integerValue("ListMessageGroupUserResponse.Result.Total"));
		result.setHasMore(_ctx.booleanValue("ListMessageGroupUserResponse.Result.HasMore"));

		List<UserListItem> userList = new ArrayList<UserListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMessageGroupUserResponse.Result.UserList.Length"); i++) {
			UserListItem userListItem = new UserListItem();
			userListItem.setUserId(_ctx.stringValue("ListMessageGroupUserResponse.Result.UserList["+ i +"].UserId"));
			userListItem.setJoinTime(_ctx.longValue("ListMessageGroupUserResponse.Result.UserList["+ i +"].JoinTime"));

			userList.add(userListItem);
		}
		result.setUserList(userList);
		listMessageGroupUserResponse.setResult(result);
	 
	 	return listMessageGroupUserResponse;
	}
}