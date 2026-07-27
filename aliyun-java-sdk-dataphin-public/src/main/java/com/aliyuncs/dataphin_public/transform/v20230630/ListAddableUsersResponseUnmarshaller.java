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

import com.aliyuncs.dataphin_public.model.v20230630.ListAddableUsersResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListAddableUsersResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListAddableUsersResponse.PageResult.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAddableUsersResponseUnmarshaller {

	public static ListAddableUsersResponse unmarshall(ListAddableUsersResponse listAddableUsersResponse, UnmarshallerContext _ctx) {
		
		listAddableUsersResponse.setRequestId(_ctx.stringValue("ListAddableUsersResponse.RequestId"));
		listAddableUsersResponse.setMessage(_ctx.stringValue("ListAddableUsersResponse.Message"));
		listAddableUsersResponse.setHttpStatusCode(_ctx.integerValue("ListAddableUsersResponse.HttpStatusCode"));
		listAddableUsersResponse.setCode(_ctx.stringValue("ListAddableUsersResponse.Code"));
		listAddableUsersResponse.setSuccess(_ctx.booleanValue("ListAddableUsersResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListAddableUsersResponse.PageResult.TotalCount"));

		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListAddableUsersResponse.PageResult.UserList.Length"); i++) {
			User user = new User();
			user.setParentId(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].ParentId"));
			user.setWhiteIp(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].WhiteIp"));
			user.setSourceType(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].SourceType"));
			user.setSourceId(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].SourceId"));
			user.setFeiShuRobot(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].FeiShuRobot"));
			user.setGmtModified(_ctx.longValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].GmtModified"));
			user.setNickName(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].NickName"));
			user.setMobilePhone(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].MobilePhone"));
			user.setName(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].Name"));
			user.setGmtCreate(_ctx.longValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].GmtCreate"));
			user.setMail(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].Mail"));
			user.setDingNumber(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].DingNumber"));
			user.setDisplayName(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].DisplayName"));
			user.setEnableWhiteIp(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].EnableWhiteIp"));
			user.setId(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].Id"));
			user.setRealName(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].RealName"));
			user.setDisplayNameWithoutStatus(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].DisplayNameWithoutStatus"));
			user.setAccountName(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].AccountName"));
			user.setWeChatRobot(_ctx.stringValue("ListAddableUsersResponse.PageResult.UserList["+ i +"].WeChatRobot"));

			userList.add(user);
		}
		pageResult.setUserList(userList);
		listAddableUsersResponse.setPageResult(pageResult);
	 
	 	return listAddableUsersResponse;
	}
}