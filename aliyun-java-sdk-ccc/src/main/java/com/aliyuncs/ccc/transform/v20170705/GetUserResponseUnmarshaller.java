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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.GetUserResponse;
import com.aliyuncs.ccc.model.v20170705.GetUserResponse.User;
import com.aliyuncs.ccc.model.v20170705.GetUserResponse.User.Detail;
import com.aliyuncs.ccc.model.v20170705.GetUserResponse.User.Role;
import com.aliyuncs.ccc.model.v20170705.GetUserResponse.User.SkillLevel;
import com.aliyuncs.ccc.model.v20170705.GetUserResponse.User.SkillLevel.Skill;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserResponseUnmarshaller {

	public static GetUserResponse unmarshall(GetUserResponse getUserResponse, UnmarshallerContext context) {
		
		getUserResponse.setRequestId(context.stringValue("GetUserResponse.RequestId"));
		getUserResponse.setSuccess(context.booleanValue("GetUserResponse.Success"));
		getUserResponse.setCode(context.stringValue("GetUserResponse.Code"));
		getUserResponse.setMessage(context.stringValue("GetUserResponse.Message"));
		getUserResponse.setHttpStatusCode(context.integerValue("GetUserResponse.HttpStatusCode"));

		User user = new User();
		user.setUserId(context.stringValue("GetUserResponse.User.UserId"));
		user.setRamId(context.stringValue("GetUserResponse.User.RamId"));
		user.setInstanceId(context.stringValue("GetUserResponse.User.InstanceId"));

		Detail detail = new Detail();
		detail.setLoginName(context.stringValue("GetUserResponse.User.Detail.LoginName"));
		detail.setDisplayName(context.stringValue("GetUserResponse.User.Detail.DisplayName"));
		detail.setPhone(context.stringValue("GetUserResponse.User.Detail.Phone"));
		detail.setEmail(context.stringValue("GetUserResponse.User.Detail.Email"));
		detail.setDepartment(context.stringValue("GetUserResponse.User.Detail.Department"));
		user.setDetail(detail);

		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < context.lengthValue("GetUserResponse.User.Roles.Length"); i++) {
			Role role = new Role();
			role.setRoleId(context.stringValue("GetUserResponse.User.Roles["+ i +"].RoleId"));
			role.setInstanceId(context.stringValue("GetUserResponse.User.Roles["+ i +"].InstanceId"));
			role.setRoleName(context.stringValue("GetUserResponse.User.Roles["+ i +"].RoleName"));
			role.setRoleDescription(context.stringValue("GetUserResponse.User.Roles["+ i +"].RoleDescription"));

			roles.add(role);
		}
		user.setRoles(roles);

		List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
		for (int i = 0; i < context.lengthValue("GetUserResponse.User.SkillLevels.Length"); i++) {
			SkillLevel skillLevel = new SkillLevel();
			skillLevel.setSkillLevelId(context.stringValue("GetUserResponse.User.SkillLevels["+ i +"].SkillLevelId"));
			skillLevel.setLevel(context.integerValue("GetUserResponse.User.SkillLevels["+ i +"].Level"));

			Skill skill = new Skill();
			skill.setSkillGroupId(context.stringValue("GetUserResponse.User.SkillLevels["+ i +"].Skill.SkillGroupId"));
			skill.setInstanceId(context.stringValue("GetUserResponse.User.SkillLevels["+ i +"].Skill.InstanceId"));
			skill.setSkillGroupName(context.stringValue("GetUserResponse.User.SkillLevels["+ i +"].Skill.SkillGroupName"));
			skill.setSkillGroupDescription(context.stringValue("GetUserResponse.User.SkillLevels["+ i +"].Skill.SkillGroupDescription"));
			skillLevel.setSkill(skill);

			skillLevels.add(skillLevel);
		}
		user.setSkillLevels(skillLevels);
		getUserResponse.setUser(user);
	 
	 	return getUserResponse;
	}
}