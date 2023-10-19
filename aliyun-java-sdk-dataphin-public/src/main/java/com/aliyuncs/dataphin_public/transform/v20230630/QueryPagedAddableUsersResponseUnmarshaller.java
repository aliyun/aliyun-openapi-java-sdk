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

import com.aliyuncs.dataphin_public.model.v20230630.QueryPagedAddableUsersResponse;
import com.aliyuncs.dataphin_public.model.v20230630.QueryPagedAddableUsersResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.QueryPagedAddableUsersResponse.Data.UserDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPagedAddableUsersResponseUnmarshaller {

	public static QueryPagedAddableUsersResponse unmarshall(QueryPagedAddableUsersResponse queryPagedAddableUsersResponse, UnmarshallerContext _ctx) {
		
		queryPagedAddableUsersResponse.setRequestId(_ctx.stringValue("QueryPagedAddableUsersResponse.RequestId"));
		queryPagedAddableUsersResponse.setSuccess(_ctx.booleanValue("QueryPagedAddableUsersResponse.Success"));
		queryPagedAddableUsersResponse.setHttpStatusCode(_ctx.integerValue("QueryPagedAddableUsersResponse.HttpStatusCode"));
		queryPagedAddableUsersResponse.setCode(_ctx.stringValue("QueryPagedAddableUsersResponse.Code"));
		queryPagedAddableUsersResponse.setMessage(_ctx.stringValue("QueryPagedAddableUsersResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("QueryPagedAddableUsersResponse.Data.TotalCount"));

		List<UserDTO> userList = new ArrayList<UserDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryPagedAddableUsersResponse.Data.UserList.Length"); i++) {
			UserDTO userDTO = new UserDTO();
			userDTO.setAccountName(_ctx.stringValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].AccountName"));
			userDTO.setDingNumber(_ctx.stringValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].DingNumber"));
			userDTO.setDisplayName(_ctx.stringValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].DisplayName"));
			userDTO.setDisplayNameWithoutStatus(_ctx.stringValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].DisplayNameWithoutStatus"));
			userDTO.setGmtCreate(_ctx.longValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].GmtCreate"));
			userDTO.setGmtModified(_ctx.longValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].GmtModified"));
			userDTO.setMail(_ctx.stringValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].Mail"));
			userDTO.setMobilePhone(_ctx.stringValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].MobilePhone"));
			userDTO.setNickName(_ctx.stringValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].NickName"));
			userDTO.setRealName(_ctx.stringValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].RealName"));
			userDTO.setSourceType(_ctx.stringValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].SourceType"));
			userDTO.setSourceUserId(_ctx.stringValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].SourceUserId"));
			userDTO.setUserId(_ctx.stringValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].UserId"));
			userDTO.setUserName(_ctx.stringValue("QueryPagedAddableUsersResponse.Data.UserList["+ i +"].UserName"));

			userList.add(userDTO);
		}
		data.setUserList(userList);
		queryPagedAddableUsersResponse.setData(data);
	 
	 	return queryPagedAddableUsersResponse;
	}
}