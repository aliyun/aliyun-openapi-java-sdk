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

import com.aliyuncs.live.model.v20161101.BatchGetOnlineUsersResponse;
import com.aliyuncs.live.model.v20161101.BatchGetOnlineUsersResponse.Result;
import com.aliyuncs.live.model.v20161101.BatchGetOnlineUsersResponse.Result.OnlineUsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetOnlineUsersResponseUnmarshaller {

	public static BatchGetOnlineUsersResponse unmarshall(BatchGetOnlineUsersResponse batchGetOnlineUsersResponse, UnmarshallerContext _ctx) {
		
		batchGetOnlineUsersResponse.setRequestId(_ctx.stringValue("BatchGetOnlineUsersResponse.RequestId"));

		Result result = new Result();

		List<OnlineUsersItem> onlineUsers = new ArrayList<OnlineUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetOnlineUsersResponse.Result.OnlineUsers.Length"); i++) {
			OnlineUsersItem onlineUsersItem = new OnlineUsersItem();
			onlineUsersItem.setJoinTime(_ctx.longValue("BatchGetOnlineUsersResponse.Result.OnlineUsers["+ i +"].JoinTime"));
			onlineUsersItem.setOnline(_ctx.booleanValue("BatchGetOnlineUsersResponse.Result.OnlineUsers["+ i +"].Online"));
			onlineUsersItem.setUserId(_ctx.stringValue("BatchGetOnlineUsersResponse.Result.OnlineUsers["+ i +"].UserId"));

			onlineUsers.add(onlineUsersItem);
		}
		result.setOnlineUsers(onlineUsers);
		batchGetOnlineUsersResponse.setResult(result);
	 
	 	return batchGetOnlineUsersResponse;
	}
}