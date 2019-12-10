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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewayClientUsersResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewayClientUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSmartAccessGatewayClientUsersResponseUnmarshaller {

	public static DescribeSmartAccessGatewayClientUsersResponse unmarshall(DescribeSmartAccessGatewayClientUsersResponse describeSmartAccessGatewayClientUsersResponse, UnmarshallerContext _ctx) {
		
		describeSmartAccessGatewayClientUsersResponse.setRequestId(_ctx.stringValue("DescribeSmartAccessGatewayClientUsersResponse.RequestId"));
		describeSmartAccessGatewayClientUsersResponse.setTotalCount(_ctx.integerValue("DescribeSmartAccessGatewayClientUsersResponse.TotalCount"));
		describeSmartAccessGatewayClientUsersResponse.setPageNumber(_ctx.integerValue("DescribeSmartAccessGatewayClientUsersResponse.PageNumber"));
		describeSmartAccessGatewayClientUsersResponse.setPageSize(_ctx.integerValue("DescribeSmartAccessGatewayClientUsersResponse.PageSize"));

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSmartAccessGatewayClientUsersResponse.Users.Length"); i++) {
			User user = new User();
			user.setClientIp(_ctx.stringValue("DescribeSmartAccessGatewayClientUsersResponse.Users["+ i +"].ClientIp"));
			user.setUserMail(_ctx.stringValue("DescribeSmartAccessGatewayClientUsersResponse.Users["+ i +"].UserMail"));
			user.setUserName(_ctx.stringValue("DescribeSmartAccessGatewayClientUsersResponse.Users["+ i +"].UserName"));
			user.setBandwidth(_ctx.integerValue("DescribeSmartAccessGatewayClientUsersResponse.Users["+ i +"].Bandwidth"));
			user.setState(_ctx.integerValue("DescribeSmartAccessGatewayClientUsersResponse.Users["+ i +"].State"));

			users.add(user);
		}
		describeSmartAccessGatewayClientUsersResponse.setUsers(users);
	 
	 	return describeSmartAccessGatewayClientUsersResponse;
	}
}