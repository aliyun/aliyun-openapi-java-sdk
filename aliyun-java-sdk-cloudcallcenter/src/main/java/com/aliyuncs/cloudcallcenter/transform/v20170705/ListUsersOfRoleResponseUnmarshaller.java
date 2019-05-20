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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListUsersOfRoleResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListUsersOfRoleResponse.Users;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListUsersOfRoleResponse.Users.User;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListUsersOfRoleResponse.Users.User.Detail;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListUsersOfRoleResponse.Users.User.SkillLevel;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListUsersOfRoleResponse.Users.User.SkillLevel.Skill;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersOfRoleResponseUnmarshaller {

	public static ListUsersOfRoleResponse unmarshall(ListUsersOfRoleResponse listUsersOfRoleResponse, UnmarshallerContext context) {
		
		listUsersOfRoleResponse.setRequestId(context.stringValue("ListUsersOfRoleResponse.RequestId"));
		listUsersOfRoleResponse.setSuccess(context.booleanValue("ListUsersOfRoleResponse.Success"));
		listUsersOfRoleResponse.setCode(context.stringValue("ListUsersOfRoleResponse.Code"));
		listUsersOfRoleResponse.setMessage(context.stringValue("ListUsersOfRoleResponse.Message"));
		listUsersOfRoleResponse.setHttpStatusCode(context.integerValue("ListUsersOfRoleResponse.HttpStatusCode"));

		Users users = new Users();
		users.setTotalCount(context.integerValue("ListUsersOfRoleResponse.Users.TotalCount"));
		users.setPageNumber(context.integerValue("ListUsersOfRoleResponse.Users.PageNumber"));
		users.setPageSize(context.integerValue("ListUsersOfRoleResponse.Users.PageSize"));

		List<User> list = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("ListUsersOfRoleResponse.Users.List.Length"); i++) {
			User user = new User();
			user.setUserId(context.stringValue("ListUsersOfRoleResponse.Users.List["+ i +"].UserId"));
			user.setRamId(context.stringValue("ListUsersOfRoleResponse.Users.List["+ i +"].RamId"));
			user.setInstanceId(context.stringValue("ListUsersOfRoleResponse.Users.List["+ i +"].InstanceId"));

			Detail detail = new Detail();
			detail.setLoginName(context.stringValue("ListUsersOfRoleResponse.Users.List["+ i +"].Detail.LoginName"));
			detail.setDisplayName(context.stringValue("ListUsersOfRoleResponse.Users.List["+ i +"].Detail.DisplayName"));
			detail.setPhone(context.stringValue("ListUsersOfRoleResponse.Users.List["+ i +"].Detail.Phone"));
			detail.setEmail(context.stringValue("ListUsersOfRoleResponse.Users.List["+ i +"].Detail.Email"));
			detail.setDepartment(context.stringValue("ListUsersOfRoleResponse.Users.List["+ i +"].Detail.Department"));
			user.setDetail(detail);

			List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
			for (int j = 0; j < context.lengthValue("ListUsersOfRoleResponse.Users.List["+ i +"].SkillLevels.Length"); j++) {
				SkillLevel skillLevel = new SkillLevel();
				skillLevel.setSkillLevelId(context.stringValue("ListUsersOfRoleResponse.Users.List["+ i +"].SkillLevels["+ j +"].SkillLevelId"));
				skillLevel.setLevel(context.integerValue("ListUsersOfRoleResponse.Users.List["+ i +"].SkillLevels["+ j +"].Level"));

				Skill skill = new Skill();
				skill.setSkillGroupId(context.stringValue("ListUsersOfRoleResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupId"));
				skill.setInstanceId(context.stringValue("ListUsersOfRoleResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.InstanceId"));
				skill.setSkillGroupName(context.stringValue("ListUsersOfRoleResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupName"));
				skill.setSkillGroupDescription(context.stringValue("ListUsersOfRoleResponse.Users.List["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupDescription"));
				skillLevel.setSkill(skill);

				skillLevels.add(skillLevel);
			}
			user.setSkillLevels(skillLevels);

			list.add(user);
		}
		users.setList(list);
		listUsersOfRoleResponse.setUsers(users);
	 
	 	return listUsersOfRoleResponse;
	}
}