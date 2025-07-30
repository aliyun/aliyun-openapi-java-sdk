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

import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceProjectAddableUsersResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceProjectAddableUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceProjectAddableUsersResponseUnmarshaller {

	public static GetDataServiceProjectAddableUsersResponse unmarshall(GetDataServiceProjectAddableUsersResponse getDataServiceProjectAddableUsersResponse, UnmarshallerContext _ctx) {
		
		getDataServiceProjectAddableUsersResponse.setRequestId(_ctx.stringValue("GetDataServiceProjectAddableUsersResponse.RequestId"));
		getDataServiceProjectAddableUsersResponse.setSuccess(_ctx.booleanValue("GetDataServiceProjectAddableUsersResponse.Success"));
		getDataServiceProjectAddableUsersResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceProjectAddableUsersResponse.HttpStatusCode"));
		getDataServiceProjectAddableUsersResponse.setCode(_ctx.stringValue("GetDataServiceProjectAddableUsersResponse.Code"));
		getDataServiceProjectAddableUsersResponse.setMessage(_ctx.stringValue("GetDataServiceProjectAddableUsersResponse.Message"));

		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceProjectAddableUsersResponse.UserList.Length"); i++) {
			User user = new User();
			user.setUserId(_ctx.stringValue("GetDataServiceProjectAddableUsersResponse.UserList["+ i +"].UserId"));
			user.setDisplayName(_ctx.stringValue("GetDataServiceProjectAddableUsersResponse.UserList["+ i +"].DisplayName"));
			user.setAccountName(_ctx.stringValue("GetDataServiceProjectAddableUsersResponse.UserList["+ i +"].AccountName"));

			userList.add(user);
		}
		getDataServiceProjectAddableUsersResponse.setUserList(userList);
	 
	 	return getDataServiceProjectAddableUsersResponse;
	}
}