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

import com.aliyuncs.cloudcallcenter.model.v20170705.AssignRolesToUserResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.AssignRolesToUserResponse.User;
import com.aliyuncs.cloudcallcenter.model.v20170705.AssignRolesToUserResponse.User.Detail;
import com.aliyuncs.cloudcallcenter.model.v20170705.AssignRolesToUserResponse.User.Role;
import com.aliyuncs.cloudcallcenter.model.v20170705.AssignRolesToUserResponse.User.SkillLevel;
import com.aliyuncs.cloudcallcenter.model.v20170705.AssignRolesToUserResponse.User.SkillLevel.Skill;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssignRolesToUserResponseUnmarshaller {

	public static AssignRolesToUserResponse unmarshall(AssignRolesToUserResponse assignRolesToUserResponse, UnmarshallerContext context) {
		
		assignRolesToUserResponse.setRequestId(context.stringValue("AssignRolesToUserResponse.RequestId"));
		assignRolesToUserResponse.setSuccess(context.booleanValue("AssignRolesToUserResponse.Success"));
		assignRolesToUserResponse.setCode(context.stringValue("AssignRolesToUserResponse.Code"));
		assignRolesToUserResponse.setMessage(context.stringValue("AssignRolesToUserResponse.Message"));
		assignRolesToUserResponse.setHttpStatusCode(context.integerValue("AssignRolesToUserResponse.HttpStatusCode"));

		User user = new User();
		user.setUserId(context.stringValue("AssignRolesToUserResponse.User.UserId"));
		user.setRamId(context.stringValue("AssignRolesToUserResponse.User.RamId"));
		user.setInstanceId(context.stringValue("AssignRolesToUserResponse.User.InstanceId"));

		Detail detail = new Detail();
		detail.setLoginName(context.stringValue("AssignRolesToUserResponse.User.Detail.LoginName"));
		detail.setDisplayName(context.stringValue("AssignRolesToUserResponse.User.Detail.DisplayName"));
		detail.setPhone(context.stringValue("AssignRolesToUserResponse.User.Detail.Phone"));
		detail.setEmail(context.stringValue("AssignRolesToUserResponse.User.Detail.Email"));
		detail.setDepartment(context.stringValue("AssignRolesToUserResponse.User.Detail.Department"));
		user.setDetail(detail);

		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < context.lengthValue("AssignRolesToUserResponse.User.Roles.Length"); i++) {
			Role role = new Role();
			role.setRoleId(context.stringValue("AssignRolesToUserResponse.User.Roles["+ i +"].RoleId"));
			role.setInstanceId(context.stringValue("AssignRolesToUserResponse.User.Roles["+ i +"].InstanceId"));
			role.setRoleName(context.stringValue("AssignRolesToUserResponse.User.Roles["+ i +"].RoleName"));
			role.setRoleDescription(context.stringValue("AssignRolesToUserResponse.User.Roles["+ i +"].RoleDescription"));

			roles.add(role);
		}
		user.setRoles(roles);

		List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
		for (int i = 0; i < context.lengthValue("AssignRolesToUserResponse.User.SkillLevels.Length"); i++) {
			SkillLevel skillLevel = new SkillLevel();
			skillLevel.setSkillLevelId(context.stringValue("AssignRolesToUserResponse.User.SkillLevels["+ i +"].SkillLevelId"));
			skillLevel.setLevel(context.integerValue("AssignRolesToUserResponse.User.SkillLevels["+ i +"].Level"));

			Skill skill = new Skill();
			skill.setSkillGroupId(context.stringValue("AssignRolesToUserResponse.User.SkillLevels["+ i +"].Skill.SkillGroupId"));
			skill.setInstanceId(context.stringValue("AssignRolesToUserResponse.User.SkillLevels["+ i +"].Skill.InstanceId"));
			skill.setSkillGroupName(context.stringValue("AssignRolesToUserResponse.User.SkillLevels["+ i +"].Skill.SkillGroupName"));
			skill.setSkillGroupDescription(context.stringValue("AssignRolesToUserResponse.User.SkillLevels["+ i +"].Skill.SkillGroupDescription"));
			skillLevel.setSkill(skill);

			skillLevels.add(skillLevel);
		}
		user.setSkillLevels(skillLevels);
		assignRolesToUserResponse.setUser(user);
	 
	 	return assignRolesToUserResponse;
	}
}