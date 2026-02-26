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

package com.aliyuncs.eds_user.transform.v20210308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_user.model.v20210308.DescribeGroupUserResponse;
import com.aliyuncs.eds_user.model.v20210308.DescribeGroupUserResponse.Group;
import com.aliyuncs.eds_user.model.v20210308.DescribeGroupUserResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupUserResponseUnmarshaller {

	public static DescribeGroupUserResponse unmarshall(DescribeGroupUserResponse describeGroupUserResponse, UnmarshallerContext _ctx) {
		
		describeGroupUserResponse.setRequestId(_ctx.stringValue("DescribeGroupUserResponse.RequestId"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupUserResponse.Groups.Length"); i++) {
			Group group = new Group();
			group.setGroupName(_ctx.stringValue("DescribeGroupUserResponse.Groups["+ i +"].GroupName"));
			group.setGroupId(_ctx.stringValue("DescribeGroupUserResponse.Groups["+ i +"].GroupId"));
			group.setUserCount(_ctx.stringValue("DescribeGroupUserResponse.Groups["+ i +"].UserCount"));

			groups.add(group);
		}
		describeGroupUserResponse.setGroups(groups);

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupUserResponse.Users.Length"); i++) {
			User user = new User();
			user.setEndUserId(_ctx.stringValue("DescribeGroupUserResponse.Users["+ i +"].EndUserId"));
			user.setAvatar(_ctx.stringValue("DescribeGroupUserResponse.Users["+ i +"].Avatar"));
			user.setAddress(_ctx.stringValue("DescribeGroupUserResponse.Users["+ i +"].Address"));
			user.setPhone(_ctx.stringValue("DescribeGroupUserResponse.Users["+ i +"].Phone"));
			user.setEmail(_ctx.stringValue("DescribeGroupUserResponse.Users["+ i +"].Email"));
			user.setNickName(_ctx.stringValue("DescribeGroupUserResponse.Users["+ i +"].NickName"));
			user.setJobNumber(_ctx.stringValue("DescribeGroupUserResponse.Users["+ i +"].JobNumber"));
			user.setGmtJoinGroup(_ctx.stringValue("DescribeGroupUserResponse.Users["+ i +"].GmtJoinGroup"));
			user.setGmtCreated(_ctx.stringValue("DescribeGroupUserResponse.Users["+ i +"].GmtCreated"));

			users.add(user);
		}
		describeGroupUserResponse.setUsers(users);
	 
	 	return describeGroupUserResponse;
	}
}