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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListUsersResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext context) {
		
		listUsersResponse.setRequestId(context.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setSuccess(context.booleanValue("ListUsersResponse.Success"));
		listUsersResponse.setCode(context.stringValue("ListUsersResponse.Code"));
		listUsersResponse.setMessage(context.stringValue("ListUsersResponse.Message"));
		listUsersResponse.setPageNumber(context.integerValue("ListUsersResponse.PageNumber"));
		listUsersResponse.setPageSize(context.integerValue("ListUsersResponse.PageSize"));
		listUsersResponse.setCount(context.integerValue("ListUsersResponse.Count"));

		List<User> data = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("ListUsersResponse.Data.Length"); i++) {
			User user = new User();
			user.setId(context.longValue("ListUsersResponse.Data["+ i +"].Id"));
			user.setUserName(context.stringValue("ListUsersResponse.Data["+ i +"].UserName"));
			user.setDisplayName(context.stringValue("ListUsersResponse.Data["+ i +"].DisplayName"));
			user.setCreateTime(context.stringValue("ListUsersResponse.Data["+ i +"].CreateTime"));
			user.setUpdateTime(context.stringValue("ListUsersResponse.Data["+ i +"].UpdateTime"));
			user.setDescription(context.stringValue("ListUsersResponse.Data["+ i +"].Description"));
			user.setAliUid(context.stringValue("ListUsersResponse.Data["+ i +"].AliUid"));
			user.setRoleName(context.stringValue("ListUsersResponse.Data["+ i +"].RoleName"));
			user.setLoginUserType(context.integerValue("ListUsersResponse.Data["+ i +"].LoginUserType"));

			data.add(user);
		}
		listUsersResponse.setData(data);
	 
	 	return listUsersResponse;
	}
}