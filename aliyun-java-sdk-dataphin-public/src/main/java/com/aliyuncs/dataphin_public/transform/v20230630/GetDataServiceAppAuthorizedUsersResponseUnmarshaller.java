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

import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAppAuthorizedUsersResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAppAuthorizedUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceAppAuthorizedUsersResponseUnmarshaller {

	public static GetDataServiceAppAuthorizedUsersResponse unmarshall(GetDataServiceAppAuthorizedUsersResponse getDataServiceAppAuthorizedUsersResponse, UnmarshallerContext _ctx) {
		
		getDataServiceAppAuthorizedUsersResponse.setRequestId(_ctx.stringValue("GetDataServiceAppAuthorizedUsersResponse.RequestId"));
		getDataServiceAppAuthorizedUsersResponse.setSuccess(_ctx.booleanValue("GetDataServiceAppAuthorizedUsersResponse.Success"));
		getDataServiceAppAuthorizedUsersResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceAppAuthorizedUsersResponse.HttpStatusCode"));
		getDataServiceAppAuthorizedUsersResponse.setCode(_ctx.stringValue("GetDataServiceAppAuthorizedUsersResponse.Code"));
		getDataServiceAppAuthorizedUsersResponse.setMessage(_ctx.stringValue("GetDataServiceAppAuthorizedUsersResponse.Message"));

		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceAppAuthorizedUsersResponse.UserList.Length"); i++) {
			User user = new User();
			user.setDisplayName(_ctx.stringValue("GetDataServiceAppAuthorizedUsersResponse.UserList["+ i +"].DisplayName"));
			user.setId(_ctx.stringValue("GetDataServiceAppAuthorizedUsersResponse.UserList["+ i +"].Id"));

			userList.add(user);
		}
		getDataServiceAppAuthorizedUsersResponse.setUserList(userList);
	 
	 	return getDataServiceAppAuthorizedUsersResponse;
	}
}