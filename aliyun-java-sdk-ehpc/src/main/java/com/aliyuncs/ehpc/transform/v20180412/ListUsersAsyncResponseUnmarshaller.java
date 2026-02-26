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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListUsersAsyncResponse;
import com.aliyuncs.ehpc.model.v20180412.ListUsersAsyncResponse.UserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersAsyncResponseUnmarshaller {

	public static ListUsersAsyncResponse unmarshall(ListUsersAsyncResponse listUsersAsyncResponse, UnmarshallerContext _ctx) {
		
		listUsersAsyncResponse.setRequestId(_ctx.stringValue("ListUsersAsyncResponse.RequestId"));
		listUsersAsyncResponse.setPageSize(_ctx.integerValue("ListUsersAsyncResponse.PageSize"));
		listUsersAsyncResponse.setPageNumber(_ctx.integerValue("ListUsersAsyncResponse.PageNumber"));
		listUsersAsyncResponse.setTotalCount(_ctx.integerValue("ListUsersAsyncResponse.TotalCount"));
		listUsersAsyncResponse.setAsyncId(_ctx.stringValue("ListUsersAsyncResponse.AsyncId"));
		listUsersAsyncResponse.setAsyncStatus(_ctx.stringValue("ListUsersAsyncResponse.AsyncStatus"));

		List<UserInfo> users = new ArrayList<UserInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersAsyncResponse.Users.Length"); i++) {
			UserInfo userInfo = new UserInfo();
			userInfo.setName(_ctx.stringValue("ListUsersAsyncResponse.Users["+ i +"].Name"));
			userInfo.setAddTime(_ctx.stringValue("ListUsersAsyncResponse.Users["+ i +"].AddTime"));
			userInfo.setGroup(_ctx.stringValue("ListUsersAsyncResponse.Users["+ i +"].Group"));
			userInfo.setUserId(_ctx.stringValue("ListUsersAsyncResponse.Users["+ i +"].UserId"));
			userInfo.setGroupId(_ctx.stringValue("ListUsersAsyncResponse.Users["+ i +"].GroupId"));

			users.add(userInfo);
		}
		listUsersAsyncResponse.setUsers(users);
	 
	 	return listUsersAsyncResponse;
	}
}