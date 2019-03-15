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

	public static ListEntitiesForPolicyResponse unmarshall(ListEntitiesForPolicyResponse listEntitiesForPolicyResponse, UnmarshallerContext context) {
		
		listEntitiesForPolicyResponse.setRequestId(context.stringValue("ListEntitiesForPolicyResponse.RequestId"));

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < context.lengthValue("ListEntitiesForPolicyResponse.Groups.Length"); i++) {
			Group group = new Group();
			group.setGroupName(context.stringValue("ListEntitiesForPolicyResponse.Groups["+ i +"].GroupName"));
			group.setComments(context.stringValue("ListEntitiesForPolicyResponse.Groups["+ i +"].Comments"));
			group.setAttachDate(context.stringValue("ListEntitiesForPolicyResponse.Groups["+ i +"].AttachDate"));

			groups.add(group);
		}
		listEntitiesForPolicyResponse.setGroups(groups);

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("ListEntitiesForPolicyResponse.Users.Length"); i++) {
			User user = new User();
			user.setUserId(context.stringValue("ListEntitiesForPolicyResponse.Users["+ i +"].UserId"));
			user.setUserName(context.stringValue("ListEntitiesForPolicyResponse.Users["+ i +"].UserName"));
			user.setDisplayName(context.stringValue("ListEntitiesForPolicyResponse.Users["+ i +"].DisplayName"));
			user.setAttachDate(context.stringValue("ListEntitiesForPolicyResponse.Users["+ i +"].AttachDate"));

			users.add(user);
		}
		listEntitiesForPolicyResponse.setUsers(users);

		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < context.lengthValue("ListEntitiesForPolicyResponse.Roles.Length"); i++) {
			Role role = new Role();
			role.setRoleId(context.stringValue("ListEntitiesForPolicyResponse.Roles["+ i +"].RoleId"));
			role.setRoleName(context.stringValue("ListEntitiesForPolicyResponse.Roles["+ i +"].RoleName"));
			role.setArn(context.stringValue("ListEntitiesForPolicyResponse.Roles["+ i +"].Arn"));
			role.setDescription(context.stringValue("ListEntitiesForPolicyResponse.Roles["+ i +"].Description"));
			role.setAttachDate(context.stringValue("ListEntitiesForPolicyResponse.Roles["+ i +"].AttachDate"));

			roles.add(role);
		}
		listEntitiesForPolicyResponse.setRoles(roles);
	 
	 	return listEntitiesForPolicyResponse;
	}
}