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

import com.aliyuncs.smartag.model.v20180313.DescribeUserOnlineClientsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeUserOnlineClientsResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserOnlineClientsResponseUnmarshaller {

	public static DescribeUserOnlineClientsResponse unmarshall(DescribeUserOnlineClientsResponse describeUserOnlineClientsResponse, UnmarshallerContext context) {
		
		describeUserOnlineClientsResponse.setRequestId(context.stringValue("DescribeUserOnlineClientsResponse.RequestId"));

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("DescribeUserOnlineClientsResponse.Users.Length"); i++) {
			User user = new User();
			user.setClientIp(context.stringValue("DescribeUserOnlineClientsResponse.Users["+ i +"].ClientIp"));
			user.setOnlineTime(context.stringValue("DescribeUserOnlineClientsResponse.Users["+ i +"].OnlineTime"));

			users.add(user);
		}
		describeUserOnlineClientsResponse.setUsers(users);
	 
	 	return describeUserOnlineClientsResponse;
	}
}