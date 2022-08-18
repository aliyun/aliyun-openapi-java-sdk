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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListUsersResponse;
import com.aliyuncs.eiam.model.v20211201.ListUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setTotalCount(_ctx.longValue("ListUsersResponse.TotalCount"));

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Users.Length"); i++) {
			User user = new User();
			user.setUserId(_ctx.stringValue("ListUsersResponse.Users["+ i +"].UserId"));
			user.setUsername(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Username"));
			user.setDisplayName(_ctx.stringValue("ListUsersResponse.Users["+ i +"].DisplayName"));
			user.setPasswordSet(_ctx.booleanValue("ListUsersResponse.Users["+ i +"].PasswordSet"));
			user.setPhoneRegion(_ctx.stringValue("ListUsersResponse.Users["+ i +"].PhoneRegion"));
			user.setPhoneNumber(_ctx.stringValue("ListUsersResponse.Users["+ i +"].PhoneNumber"));
			user.setPhoneVerified(_ctx.booleanValue("ListUsersResponse.Users["+ i +"].PhoneVerified"));
			user.setPhoneNumberVerified(_ctx.booleanValue("ListUsersResponse.Users["+ i +"].PhoneNumberVerified"));
			user.setEmail(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Email"));
			user.setEmailVerified(_ctx.booleanValue("ListUsersResponse.Users["+ i +"].EmailVerified"));
			user.setExternalId(_ctx.stringValue("ListUsersResponse.Users["+ i +"].ExternalId"));
			user.setUserExternalId(_ctx.stringValue("ListUsersResponse.Users["+ i +"].UserExternalId"));
			user.setSourceType(_ctx.stringValue("ListUsersResponse.Users["+ i +"].SourceType"));
			user.setUserSourceType(_ctx.stringValue("ListUsersResponse.Users["+ i +"].UserSourceType"));
			user.setSourceId(_ctx.stringValue("ListUsersResponse.Users["+ i +"].SourceId"));
			user.setUserSourceId(_ctx.stringValue("ListUsersResponse.Users["+ i +"].UserSourceId"));
			user.setStatus(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Status"));
			user.setAccountExpireTime(_ctx.longValue("ListUsersResponse.Users["+ i +"].AccountExpireTime"));
			user.setRegisterTime(_ctx.longValue("ListUsersResponse.Users["+ i +"].RegisterTime"));
			user.setLockExpireTime(_ctx.longValue("ListUsersResponse.Users["+ i +"].LockExpireTime"));
			user.setCreateTime(_ctx.longValue("ListUsersResponse.Users["+ i +"].CreateTime"));
			user.setUpdateTime(_ctx.longValue("ListUsersResponse.Users["+ i +"].UpdateTime"));
			user.setDescription(_ctx.stringValue("ListUsersResponse.Users["+ i +"].Description"));
			user.setAliUid(_ctx.longValue("ListUsersResponse.Users["+ i +"].AliUid"));
			user.setInstanceId(_ctx.stringValue("ListUsersResponse.Users["+ i +"].InstanceId"));
			user.setLocked(_ctx.booleanValue("ListUsersResponse.Users["+ i +"].Locked"));

			users.add(user);
		}
		listUsersResponse.setUsers(users);
	 
	 	return listUsersResponse;
	}
}