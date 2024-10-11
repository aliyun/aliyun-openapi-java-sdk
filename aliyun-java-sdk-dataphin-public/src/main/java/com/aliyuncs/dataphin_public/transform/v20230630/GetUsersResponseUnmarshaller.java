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

import com.aliyuncs.dataphin_public.model.v20230630.GetUsersResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUsersResponseUnmarshaller {

	public static GetUsersResponse unmarshall(GetUsersResponse getUsersResponse, UnmarshallerContext _ctx) {
		
		getUsersResponse.setRequestId(_ctx.stringValue("GetUsersResponse.RequestId"));
		getUsersResponse.setSuccess(_ctx.booleanValue("GetUsersResponse.Success"));
		getUsersResponse.setHttpStatusCode(_ctx.integerValue("GetUsersResponse.HttpStatusCode"));
		getUsersResponse.setCode(_ctx.stringValue("GetUsersResponse.Code"));
		getUsersResponse.setMessage(_ctx.stringValue("GetUsersResponse.Message"));

		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("GetUsersResponse.UserList.Length"); i++) {
			User user = new User();
			user.setId(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].Id"));
			user.setParentId(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].ParentId"));
			user.setSourceType(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].SourceType"));
			user.setSourceId(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].SourceId"));
			user.setName(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].Name"));
			user.setDisplayName(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].DisplayName"));
			user.setDisplayNameWithoutStatus(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].DisplayNameWithoutStatus"));
			user.setAccountName(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].AccountName"));
			user.setRealName(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].RealName"));
			user.setNickName(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].NickName"));
			user.setGmtCreate(_ctx.longValue("GetUsersResponse.UserList["+ i +"].GmtCreate"));
			user.setMobilePhone(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].MobilePhone"));
			user.setMail(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].Mail"));
			user.setDingNumber(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].DingNumber"));
			user.setWeChatRobot(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].WeChatRobot"));
			user.setFeiShuRobot(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].FeiShuRobot"));
			user.setEnableWhiteIp(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].EnableWhiteIp"));
			user.setWhiteIp(_ctx.stringValue("GetUsersResponse.UserList["+ i +"].WhiteIp"));
			user.setGmtModified(_ctx.longValue("GetUsersResponse.UserList["+ i +"].GmtModified"));

			userList.add(user);
		}
		getUsersResponse.setUserList(userList);
	 
	 	return getUsersResponse;
	}
}