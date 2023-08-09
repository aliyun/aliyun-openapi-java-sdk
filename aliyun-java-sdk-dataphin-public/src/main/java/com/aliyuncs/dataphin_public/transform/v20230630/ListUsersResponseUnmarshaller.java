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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListUsersResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListUsersResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.ListUsersResponse.Data.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setSuccess(_ctx.booleanValue("ListUsersResponse.Success"));
		listUsersResponse.setHttpStatusCode(_ctx.integerValue("ListUsersResponse.HttpStatusCode"));
		listUsersResponse.setCode(_ctx.stringValue("ListUsersResponse.Code"));
		listUsersResponse.setMessage(_ctx.stringValue("ListUsersResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListUsersResponse.Data.TotalCount"));

		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Data.UserList.Length"); i++) {
			User user = new User();
			user.setAccountName(_ctx.stringValue("ListUsersResponse.Data.UserList["+ i +"].AccountName"));
			user.setDingNumber(_ctx.stringValue("ListUsersResponse.Data.UserList["+ i +"].DingNumber"));
			user.setDisplayName(_ctx.stringValue("ListUsersResponse.Data.UserList["+ i +"].DisplayName"));
			user.setGmtCreate(_ctx.longValue("ListUsersResponse.Data.UserList["+ i +"].GmtCreate"));
			user.setGmtModified(_ctx.longValue("ListUsersResponse.Data.UserList["+ i +"].GmtModified"));
			user.setMail(_ctx.stringValue("ListUsersResponse.Data.UserList["+ i +"].Mail"));
			user.setMobilePhone(_ctx.stringValue("ListUsersResponse.Data.UserList["+ i +"].MobilePhone"));
			user.setNickName(_ctx.stringValue("ListUsersResponse.Data.UserList["+ i +"].NickName"));
			user.setRealName(_ctx.stringValue("ListUsersResponse.Data.UserList["+ i +"].RealName"));
			user.setSourceType(_ctx.stringValue("ListUsersResponse.Data.UserList["+ i +"].SourceType"));
			user.setSourceUserId(_ctx.stringValue("ListUsersResponse.Data.UserList["+ i +"].SourceUserId"));
			user.setUserId(_ctx.stringValue("ListUsersResponse.Data.UserList["+ i +"].UserId"));
			user.setUserName(_ctx.stringValue("ListUsersResponse.Data.UserList["+ i +"].UserName"));

			userList.add(user);
		}
		data.setUserList(userList);
		listUsersResponse.setData(data);
	 
	 	return listUsersResponse;
	}
}