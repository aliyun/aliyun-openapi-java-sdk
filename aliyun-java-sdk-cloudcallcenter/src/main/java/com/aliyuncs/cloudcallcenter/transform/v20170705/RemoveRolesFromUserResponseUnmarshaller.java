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

import com.aliyuncs.cloudcallcenter.model.v20170705.RemoveRolesFromUserResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.RemoveRolesFromUserResponse.User;
import com.aliyuncs.cloudcallcenter.model.v20170705.RemoveRolesFromUserResponse.User.Detail;
import com.aliyuncs.cloudcallcenter.model.v20170705.RemoveRolesFromUserResponse.User.Role;
import com.aliyuncs.cloudcallcenter.model.v20170705.RemoveRolesFromUserResponse.User.SkillLevel;
import com.aliyuncs.cloudcallcenter.model.v20170705.RemoveRolesFromUserResponse.User.SkillLevel.Skill;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveRolesFromUserResponseUnmarshaller {

	public static RemoveRolesFromUserResponse unmarshall(RemoveRolesFromUserResponse removeRolesFromUserResponse, UnmarshallerContext context) {
		
		removeRolesFromUserResponse.setRequestId(context.stringValue("RemoveRolesFromUserResponse.RequestId"));
		removeRolesFromUserResponse.setSuccess(context.booleanValue("RemoveRolesFromUserResponse.Success"));
		removeRolesFromUserResponse.setCode(context.stringValue("RemoveRolesFromUserResponse.Code"));
		removeRolesFromUserResponse.setMessage(context.stringValue("RemoveRolesFromUserResponse.Message"));
		removeRolesFromUserResponse.setHttpStatusCode(context.integerValue("RemoveRolesFromUserResponse.HttpStatusCode"));

		User user = new User();
		user.setUserId(context.stringValue("RemoveRolesFromUserResponse.User.UserId"));
		user.setRamId(context.stringValue("RemoveRolesFromUserResponse.User.RamId"));
		user.setInstanceId(context.stringValue("RemoveRolesFromUserResponse.User.InstanceId"));

		Detail detail = new Detail();
		detail.setLoginName(context.stringValue("RemoveRolesFromUserResponse.User.Detail.LoginName"));
		detail.setDisplayName(context.stringValue("RemoveRolesFromUserResponse.User.Detail.DisplayName"));
		detail.setPhone(context.stringValue("RemoveRolesFromUserResponse.User.Detail.Phone"));
		detail.setEmail(context.stringValue("RemoveRolesFromUserResponse.User.Detail.Email"));
		detail.setDepartment(context.stringValue("RemoveRolesFromUserResponse.User.Detail.Department"));
		user.setDetail(detail);

		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < context.lengthValue("RemoveRolesFromUserResponse.User.Roles.Length"); i++) {
			Role role = new Role();
			role.setRoleId(context.stringValue("RemoveRolesFromUserResponse.User.Roles["+ i +"].RoleId"));
			role.setInstanceId(context.stringValue("RemoveRolesFromUserResponse.User.Roles["+ i +"].InstanceId"));
			role.setRoleName(context.stringValue("RemoveRolesFromUserResponse.User.Roles["+ i +"].RoleName"));
			role.setRoleDescription(context.stringValue("RemoveRolesFromUserResponse.User.Roles["+ i +"].RoleDescription"));

			roles.add(role);
		}
		user.setRoles(roles);

		List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
		for (int i = 0; i < context.lengthValue("RemoveRolesFromUserResponse.User.SkillLevels.Length"); i++) {
			SkillLevel skillLevel = new SkillLevel();
			skillLevel.setSkillLevelId(context.stringValue("RemoveRolesFromUserResponse.User.SkillLevels["+ i +"].SkillLevelId"));
			skillLevel.setLevel(context.integerValue("RemoveRolesFromUserResponse.User.SkillLevels["+ i +"].Level"));

			Skill skill = new Skill();
			skill.setSkillGroupId(context.stringValue("RemoveRolesFromUserResponse.User.SkillLevels["+ i +"].Skill.SkillGroupId"));
			skill.setInstanceId(context.stringValue("RemoveRolesFromUserResponse.User.SkillLevels["+ i +"].Skill.InstanceId"));
			skill.setSkillGroupName(context.stringValue("RemoveRolesFromUserResponse.User.SkillLevels["+ i +"].Skill.SkillGroupName"));
			skill.setSkillGroupDescription(context.stringValue("RemoveRolesFromUserResponse.User.SkillLevels["+ i +"].Skill.SkillGroupDescription"));
			skillLevel.setSkill(skill);

			skillLevels.add(skillLevel);
		}
		user.setSkillLevels(skillLevels);
		removeRolesFromUserResponse.setUser(user);
	 
	 	return removeRolesFromUserResponse;
	}
}