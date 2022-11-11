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

package com.aliyuncs.pvtz.transform.v20180101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pvtz.model.v20180101.DescribeUserVpcAuthorizationsResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeUserVpcAuthorizationsResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserVpcAuthorizationsResponseUnmarshaller {

	public static DescribeUserVpcAuthorizationsResponse unmarshall(DescribeUserVpcAuthorizationsResponse describeUserVpcAuthorizationsResponse, UnmarshallerContext _ctx) {
		
		describeUserVpcAuthorizationsResponse.setRequestId(_ctx.stringValue("DescribeUserVpcAuthorizationsResponse.RequestId"));
		describeUserVpcAuthorizationsResponse.setPageSize(_ctx.integerValue("DescribeUserVpcAuthorizationsResponse.PageSize"));
		describeUserVpcAuthorizationsResponse.setPageNumber(_ctx.integerValue("DescribeUserVpcAuthorizationsResponse.PageNumber"));
		describeUserVpcAuthorizationsResponse.setTotalPages(_ctx.integerValue("DescribeUserVpcAuthorizationsResponse.TotalPages"));
		describeUserVpcAuthorizationsResponse.setTotalItems(_ctx.integerValue("DescribeUserVpcAuthorizationsResponse.TotalItems"));

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserVpcAuthorizationsResponse.Users.Length"); i++) {
			User user = new User();
			user.setAuthType(_ctx.stringValue("DescribeUserVpcAuthorizationsResponse.Users["+ i +"].AuthType"));
			user.setAuthorizedUserId(_ctx.longValue("DescribeUserVpcAuthorizationsResponse.Users["+ i +"].AuthorizedUserId"));
			user.setAuthorizedAliyunId(_ctx.stringValue("DescribeUserVpcAuthorizationsResponse.Users["+ i +"].AuthorizedAliyunId"));

			users.add(user);
		}
		describeUserVpcAuthorizationsResponse.setUsers(users);
	 
	 	return describeUserVpcAuthorizationsResponse;
	}
}