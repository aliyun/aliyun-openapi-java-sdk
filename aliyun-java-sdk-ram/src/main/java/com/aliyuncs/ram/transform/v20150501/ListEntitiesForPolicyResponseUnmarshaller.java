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

package com.aliyuncs.ram.transform.v20150501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ram.model.v20150501.ListEntitiesForPolicyResponse;
import com.aliyuncs.ram.model.v20150501.ListEntitiesForPolicyResponse.Group;
import com.aliyuncs.ram.model.v20150501.ListEntitiesForPolicyResponse.Role;
import com.aliyuncs.ram.model.v20150501.ListEntitiesForPolicyResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEntitiesForPolicyResponseUnmarshaller {

	public static ListEntitiesForPolicyResponse unmarshall(ListEntitiesForPolicyResponse listEntitiesForPolicyResponse, UnmarshallerContext _ctx) {
		
		listEntitiesForPolicyResponse.setRequestId(_ctx.stringValue("ListEntitiesForPolicyResponse.RequestId"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < _ctx.lengthValue("ListEntitiesForPolicyResponse.Groups.Length"); i++) {
			Group group = new Group();
			group.setGroupName(_ctx.stringValue("ListEntitiesForPolicyResponse.Groups["+ i +"].GroupName"));
			group.setComments(_ctx.stringValue("ListEntitiesForPolicyResponse.Groups["+ i +"].Comments"));
			group.setAttachDate(_ctx.stringValue("ListEntitiesForPolicyResponse.Groups["+ i +"].AttachDate"));

			groups.add(group);
		}
		listEntitiesForPolicyResponse.setGroups(groups);

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListEntitiesForPolicyResponse.Users.Length"); i++) {
			User user = new User();
			user.setUserId(_ctx.stringValue("ListEntitiesForPolicyResponse.Users["+ i +"].UserId"));
			user.setUserName(_ctx.stringValue("ListEntitiesForPolicyResponse.Users["+ i +"].UserName"));
			user.setDisplayName(_ctx.stringValue("ListEntitiesForPolicyResponse.Users["+ i +"].DisplayName"));
			user.setAttachDate(_ctx.stringValue("ListEntitiesForPolicyResponse.Users["+ i +"].AttachDate"));

			users.add(user);
		}
		listEntitiesForPolicyResponse.setUsers(users);

		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("ListEntitiesForPolicyResponse.Roles.Length"); i++) {
			Role role = new Role();
			role.setRoleId(_ctx.stringValue("ListEntitiesForPolicyResponse.Roles["+ i +"].RoleId"));
			role.setRoleName(_ctx.stringValue("ListEntitiesForPolicyResponse.Roles["+ i +"].RoleName"));
			role.setArn(_ctx.stringValue("ListEntitiesForPolicyResponse.Roles["+ i +"].Arn"));
			role.setDescription(_ctx.stringValue("ListEntitiesForPolicyResponse.Roles["+ i +"].Description"));
			role.setAttachDate(_ctx.stringValue("ListEntitiesForPolicyResponse.Roles["+ i +"].AttachDate"));

			roles.add(role);
		}
		listEntitiesForPolicyResponse.setRoles(roles);
	 
	 	return listEntitiesForPolicyResponse;
	}
}