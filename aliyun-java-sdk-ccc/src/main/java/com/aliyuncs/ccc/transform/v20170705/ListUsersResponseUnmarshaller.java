/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListUsersResponse;
import com.aliyuncs.ccc.model.v20170705.ListUsersResponse.Users;
import com.aliyuncs.ccc.model.v20170705.ListUsersResponse.Users.User;
import com.aliyuncs.ccc.model.v20170705.ListUsersResponse.Users.User.Detail;
import com.aliyuncs.ccc.model.v20170705.ListUsersResponse.Users.User.Role;
import com.aliyuncs.ccc.model.v20170705.ListUsersResponse.Users.User.SkillLevel;
import com.aliyuncs.ccc.model.v20170705.ListUsersResponse.Users.User.SkillLevel.Skill;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext context) {
		
		listUsersResponse.setRequestId(context.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setSuccess(context.booleanValue("ListUsersResponse.Success"));
		listUsersResponse.setCode(context.stringValue("ListUsersResponse.Code"));
		listUsersResponse.setMessage(context.stringValue("ListUsersResponse.Message"));
		listUsersResponse.setHttpStatusCode(context.integerValue("ListUsersResponse.HttpStatusCode"));

		Users users = new Users();
		users.setTotalCount(context.integerValue("ListUsersResponse.Users.TotalCount"));
		users.setPageNumber(context.integerValue("ListUsersResponse.Users.PageNumber"));
		users.setPageSize(context.integerValue("ListUsersResponse.Users.PageSize"));

		List<User> list = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("ListUsersResponse.Users.List.Length"); i++) {
			User user = new User();
			user.setUserId(context.stringValue("ListUsersResponse.Users.List["+ i +"].UserId"));
			user.setRamId(context.stringValue("ListUsersResponse.Users.List["+ i +"].RamId"));
			user.setInstanceId(context.stringValue("ListUsersResponse.Users.List["+ i +"].InstanceId"));
			user.setPrimary(context.booleanValue("ListUsersResponse.Users.List["+ i +"].Primary"));

			Detail detail = new Detail();
			detail.setLoginName(context.stringValue("ListUsersResponse.Users.List["+ i +"].Detail.LoginName"));
			detail.setDisplayName(context.stringValue("ListUsersResponse.Users.List["+ i +"].Detail.DisplayName"));
			detail.setPhone(context.stringValue("ListUsersResponse.Users.List["+ i +"].Detail.Phone"));
			detail.setEmail(context.stringValue("ListUsersResponse.Users.List["+ i +"].Detail.Email"));
			detail.setDepartment(context.stringValue("ListUsersResponse.Users.List["+ i +"].Detail.Department"));
			user.setDetail(detail);

			List<Role> roles = new ArrayList<Role>();
			for (int j = 0; j < context.lengthValue("ListUsersResponse.Users.List["+ i +"].Roles.Length"); j++) {
				Role role = new Role();
				role.setRoleId(context.stringValue("ListUsersResponse.Users.List["+ i +"].Roles["+ j +"].RoleId"));
				role.setInstanceId(context.stringValue("ListUsersResponse.Users.List["+ i +"].Roles["+ j +"].InstanceId"));
				role.setRoleName(context.stringValue("ListUsersResponse.Users.List["+ i +"].Roles["+ j +"].RoleName"));
				role.setRoleDescription(context.stringValue("ListUsersResponse.Users.List["+ i +"].Roles["+ j +"].RoleDescription"));

				roles.add(role);
			}
			user.setRoles(roles);

			List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
			for (int j = 0; j < context.lengthValue("ListUsersResponse.Users.List["+ i +"].SkillLevels.Length"); j++) {
				SkillLevel skillLevel = new SkillLevel();
				skillLevel.setSkillLevelId(context.stringValue("ListUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].SkillLevelId"));
				skillLevel.setLevel(context.integerValue("ListUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Level"));

				Skill skill = new Skill();
				skill.setSkillGroupId(context.stringValue("ListUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupId"));
				skill.setInstanceId(context.stringValue("ListUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.InstanceId"));
				skill.setSkillGroupName(context.stringValue("ListUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupName"));
				skill.setSkillGroupDescription(context.stringValue("ListUsersResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupDescription"));
				skillLevel.setSkill(skill);

				skillLevels.add(skillLevel);
			}
			user.setSkillLevels(skillLevels);

			list.add(user);
		}
		users.setList(list);
		listUsersResponse.setUsers(users);
	 
	 	return listUsersResponse;
	}
}