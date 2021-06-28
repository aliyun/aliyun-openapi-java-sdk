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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.ListOfficeSiteUsersResponse;
import com.aliyuncs.ecd.model.v20200930.ListOfficeSiteUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOfficeSiteUsersResponseUnmarshaller {

	public static ListOfficeSiteUsersResponse unmarshall(ListOfficeSiteUsersResponse listOfficeSiteUsersResponse, UnmarshallerContext _ctx) {
		
		listOfficeSiteUsersResponse.setRequestId(_ctx.stringValue("ListOfficeSiteUsersResponse.RequestId"));
		listOfficeSiteUsersResponse.setNextToken(_ctx.stringValue("ListOfficeSiteUsersResponse.NextToken"));

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListOfficeSiteUsersResponse.Users.Length"); i++) {
			User user = new User();
			user.setEndUser(_ctx.stringValue("ListOfficeSiteUsersResponse.Users["+ i +"].EndUser"));

			users.add(user);
		}
		listOfficeSiteUsersResponse.setUsers(users);
	 
	 	return listOfficeSiteUsersResponse;
	}
}