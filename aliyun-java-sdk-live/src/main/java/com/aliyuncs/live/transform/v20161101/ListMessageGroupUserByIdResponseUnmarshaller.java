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

import com.aliyuncs.live.model.v20161101.ListMessageGroupUserByIdResponse;
import com.aliyuncs.live.model.v20161101.ListMessageGroupUserByIdResponse.Result;
import com.aliyuncs.live.model.v20161101.ListMessageGroupUserByIdResponse.Result.UserListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMessageGroupUserByIdResponseUnmarshaller {

	public static ListMessageGroupUserByIdResponse unmarshall(ListMessageGroupUserByIdResponse listMessageGroupUserByIdResponse, UnmarshallerContext _ctx) {
		
		listMessageGroupUserByIdResponse.setRequestId(_ctx.stringValue("ListMessageGroupUserByIdResponse.RequestId"));

		Result result = new Result();
		result.setTotal(_ctx.integerValue("ListMessageGroupUserByIdResponse.Result.Total"));
		result.setHasMore(_ctx.booleanValue("ListMessageGroupUserByIdResponse.Result.HasMore"));

		List<UserListItem> userList = new ArrayList<UserListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMessageGroupUserByIdResponse.Result.UserList.Length"); i++) {
			UserListItem userListItem = new UserListItem();
			userListItem.setUserId(_ctx.stringValue("ListMessageGroupUserByIdResponse.Result.UserList["+ i +"].UserId"));
			userListItem.setUserNick(_ctx.stringValue("ListMessageGroupUserByIdResponse.Result.UserList["+ i +"].UserNick"));
			userListItem.setUserAvatar(_ctx.stringValue("ListMessageGroupUserByIdResponse.Result.UserList["+ i +"].UserAvatar"));
			userListItem.setUserExtension(_ctx.stringValue("ListMessageGroupUserByIdResponse.Result.UserList["+ i +"].UserExtension"));
			userListItem.setIsMute(_ctx.booleanValue("ListMessageGroupUserByIdResponse.Result.UserList["+ i +"].IsMute"));

			List<String> muteBy = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListMessageGroupUserByIdResponse.Result.UserList["+ i +"].MuteBy.Length"); j++) {
				muteBy.add(_ctx.stringValue("ListMessageGroupUserByIdResponse.Result.UserList["+ i +"].MuteBy["+ j +"]"));
			}
			userListItem.setMuteBy(muteBy);

			userList.add(userListItem);
		}
		result.setUserList(userList);
		listMessageGroupUserByIdResponse.setResult(result);
	 
	 	return listMessageGroupUserByIdResponse;
	}
}