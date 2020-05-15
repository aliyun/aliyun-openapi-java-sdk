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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeUsersResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeUsersResponse.UserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUsersResponseUnmarshaller {

	public static DescribeUsersResponse unmarshall(DescribeUsersResponse describeUsersResponse, UnmarshallerContext _ctx) {
		
		describeUsersResponse.setRequestId(_ctx.stringValue("DescribeUsersResponse.RequestId"));
		describeUsersResponse.setErrorMessage(_ctx.stringValue("DescribeUsersResponse.ErrorMessage"));
		describeUsersResponse.setErrorCode(_ctx.stringValue("DescribeUsersResponse.ErrorCode"));
		describeUsersResponse.setMessage(_ctx.stringValue("DescribeUsersResponse.Message"));
		describeUsersResponse.setPageNumber(_ctx.integerValue("DescribeUsersResponse.PageNumber"));
		describeUsersResponse.setDynamicCode(_ctx.stringValue("DescribeUsersResponse.DynamicCode"));
		describeUsersResponse.setCode(_ctx.stringValue("DescribeUsersResponse.Code"));
		describeUsersResponse.setTotalCount(_ctx.integerValue("DescribeUsersResponse.TotalCount"));
		describeUsersResponse.setDynamicMessage(_ctx.stringValue("DescribeUsersResponse.DynamicMessage"));
		describeUsersResponse.setSuccess(_ctx.booleanValue("DescribeUsersResponse.Success"));
		describeUsersResponse.setPageSize(_ctx.integerValue("DescribeUsersResponse.PageSize"));

		List<UserInfo> users = new ArrayList<UserInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUsersResponse.Users.Length"); i++) {
			UserInfo userInfo = new UserInfo();
			userInfo.setStores(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].Stores"));
			userInfo.setUserName(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].UserName"));
			userInfo.setUserId(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].UserId"));
			userInfo.setUserType(_ctx.stringValue("DescribeUsersResponse.Users["+ i +"].UserType"));

			users.add(userInfo);
		}
		describeUsersResponse.setUsers(users);
	 
	 	return describeUsersResponse;
	}
}