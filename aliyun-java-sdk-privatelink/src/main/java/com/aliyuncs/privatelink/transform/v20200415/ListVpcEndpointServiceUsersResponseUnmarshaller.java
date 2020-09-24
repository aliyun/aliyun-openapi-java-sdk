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

package com.aliyuncs.privatelink.transform.v20200415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointServiceUsersResponse;
import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointServiceUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcEndpointServiceUsersResponseUnmarshaller {

	public static ListVpcEndpointServiceUsersResponse unmarshall(ListVpcEndpointServiceUsersResponse listVpcEndpointServiceUsersResponse, UnmarshallerContext _ctx) {
		
		listVpcEndpointServiceUsersResponse.setRequestId(_ctx.stringValue("ListVpcEndpointServiceUsersResponse.RequestId"));
		listVpcEndpointServiceUsersResponse.setMaxResults(_ctx.stringValue("ListVpcEndpointServiceUsersResponse.MaxResults"));
		listVpcEndpointServiceUsersResponse.setNextToken(_ctx.stringValue("ListVpcEndpointServiceUsersResponse.NextToken"));

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcEndpointServiceUsersResponse.Users.Length"); i++) {
			User user = new User();
			user.setUserId(_ctx.longValue("ListVpcEndpointServiceUsersResponse.Users["+ i +"].UserId"));

			users.add(user);
		}
		listVpcEndpointServiceUsersResponse.setUsers(users);
	 
	 	return listVpcEndpointServiceUsersResponse;
	}
}