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

package com.aliyuncs.openitag.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openitag.model.v20220616.ListUsersResponse;
import com.aliyuncs.openitag.model.v20220616.ListUsersResponse.UsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setCode(_ctx.integerValue("ListUsersResponse.Code"));
		listUsersResponse.setMessage(_ctx.stringValue("ListUsersResponse.Message"));
		listUsersResponse.setDetails(_ctx.stringValue("ListUsersResponse.Details"));
		listUsersResponse.setSuccess(_ctx.booleanValue("ListUsersResponse.Success"));
		listUsersResponse.setPageNumber(_ctx.integerValue("ListUsersResponse.PageNumber"));
		listUsersResponse.setPageSize(_ctx.integerValue("ListUsersResponse.PageSize"));
		listUsersResponse.setTotalPage(_ctx.integerValue("ListUsersResponse.TotalPage"));
		listUsersResponse.setTotalCount(_ctx.integerValue("ListUsersResponse.TotalCount"));
		listUsersResponse.setErrorCode(_ctx.stringValue("ListUsersResponse.ErrorCode"));

		List<UsersItem> users = new ArrayList<UsersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Users.Length"); i++) {
			UsersItem usersItem = new UsersItem();
			usersItem.setUserId(_ctx.longValue("ListUsersResponse.Users["+ i +"].UserId"));
			usersItem.setAccountType(_ctx.stringValue("ListUsersResponse.Users["+ i +"].AccountType"));
			usersItem.setAccountNo(_ctx.stringValue("ListUsersResponse.Users["+ i +"].AccountNo"));
			usersItem.setUserName(_ctx.stringValue("ListUsersResponse.Users["+ i +"].UserName"));
			usersItem.setRole(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Role"));

			users.add(usersItem);
		}
		listUsersResponse.setUsers(users);
	 
	 	return listUsersResponse;
	}
}