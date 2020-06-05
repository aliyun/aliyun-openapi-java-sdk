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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewaySMBUsersResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewaySMBUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewaySMBUsersResponseUnmarshaller {

	public static DescribeGatewaySMBUsersResponse unmarshall(DescribeGatewaySMBUsersResponse describeGatewaySMBUsersResponse, UnmarshallerContext _ctx) {
		
		describeGatewaySMBUsersResponse.setRequestId(_ctx.stringValue("DescribeGatewaySMBUsersResponse.RequestId"));
		describeGatewaySMBUsersResponse.setSuccess(_ctx.booleanValue("DescribeGatewaySMBUsersResponse.Success"));
		describeGatewaySMBUsersResponse.setCode(_ctx.stringValue("DescribeGatewaySMBUsersResponse.Code"));
		describeGatewaySMBUsersResponse.setMessage(_ctx.stringValue("DescribeGatewaySMBUsersResponse.Message"));
		describeGatewaySMBUsersResponse.setTotalCount(_ctx.integerValue("DescribeGatewaySMBUsersResponse.TotalCount"));
		describeGatewaySMBUsersResponse.setPageNumber(_ctx.integerValue("DescribeGatewaySMBUsersResponse.PageNumber"));
		describeGatewaySMBUsersResponse.setPageSize(_ctx.integerValue("DescribeGatewaySMBUsersResponse.PageSize"));

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewaySMBUsersResponse.Users.Length"); i++) {
			User user = new User();
			user.setUsername(_ctx.stringValue("DescribeGatewaySMBUsersResponse.Users["+ i +"].Username"));

			users.add(user);
		}
		describeGatewaySMBUsersResponse.setUsers(users);
	 
	 	return describeGatewaySMBUsersResponse;
	}
}