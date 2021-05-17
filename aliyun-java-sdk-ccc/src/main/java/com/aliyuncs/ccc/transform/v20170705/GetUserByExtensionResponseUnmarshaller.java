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

import com.aliyuncs.ccc.model.v20170705.GetUserByExtensionResponse;
import com.aliyuncs.ccc.model.v20170705.GetUserByExtensionResponse.User;
import com.aliyuncs.ccc.model.v20170705.GetUserByExtensionResponse.User.Detail;
import com.aliyuncs.ccc.model.v20170705.GetUserByExtensionResponse.User.Role;
import com.aliyuncs.ccc.model.v20170705.GetUserByExtensionResponse.User.SkillLevel;
import com.aliyuncs.ccc.model.v20170705.GetUserByExtensionResponse.User.SkillLevel.Skill;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserByExtensionResponseUnmarshaller {

	public static GetUserByExtensionResponse unmarshall(GetUserByExtensionResponse getUserByExtensionResponse, UnmarshallerContext _ctx) {
		
		getUserByExtensionResponse.setRequestId(_ctx.stringValue("GetUserByExtensionResponse.RequestId"));
		getUserByExtensionResponse.setSuccess(_ctx.booleanValue("GetUserByExtensionResponse.Success"));
		getUserByExtensionResponse.setCode(_ctx.stringValue("GetUserByExtensionResponse.Code"));
		getUserByExtensionResponse.setMessage(_ctx.stringValue("GetUserByExtensionResponse.Message"));
		getUserByExtensionResponse.setHttpStatusCode(_ctx.integerValue("GetUserByExtensionResponse.HttpStatusCode"));

		User user = new User();
		user.setUserId(_ctx.stringValue("GetUserByExtensionResponse.User.UserId"));
		user.setRamId(_ctx.stringValue("GetUserByExtensionResponse.User.RamId"));
		user.setInstanceId(_ctx.stringValue("GetUserByExtensionResponse.User.InstanceId"));

		Detail detail = new Detail();
		detail.setLoginName(_ctx.stringValue("GetUserByExtensionResponse.User.Detail.LoginName"));
		detail.setDisplayName(_ctx.stringValue("GetUserByExtensionResponse.User.Detail.DisplayName"));
		detail.setPhone(_ctx.stringValue("GetUserByExtensionResponse.User.Detail.Phone"));
		detail.setEmail(_ctx.stringValue("GetUserByExtensionResponse.User.Detail.Email"));
		detail.setDepartment(_ctx.stringValue("GetUserByExtensionResponse.User.Detail.Department"));
		detail.setExtension(_ctx.stringValue("GetUserByExtensionResponse.User.Detail.Extension"));
		user.setDetail(detail);

		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("GetUserByExtensionResponse.User.Roles.Length"); i++) {
			Role role = new Role();
			role.setRoleId(_ctx.stringValue("GetUserByExtensionResponse.User.Roles["+ i +"].RoleId"));
			role.setInstanceId(_ctx.stringValue("GetUserByExtensionResponse.User.Roles["+ i +"].InstanceId"));
			role.setRoleName(_ctx.stringValue("GetUserByExtensionResponse.User.Roles["+ i +"].RoleName"));
			role.setRoleDescription(_ctx.stringValue("GetUserByExtensionResponse.User.Roles["+ i +"].RoleDescription"));

			roles.add(role);
		}
		user.setRoles(roles);

		List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
		for (int i = 0; i < _ctx.lengthValue("GetUserByExtensionResponse.User.SkillLevels.Length"); i++) {
			SkillLevel skillLevel = new SkillLevel();
			skillLevel.setSkillLevelId(_ctx.stringValue("GetUserByExtensionResponse.User.SkillLevels["+ i +"].SkillLevelId"));
			skillLevel.setLevel(_ctx.integerValue("GetUserByExtensionResponse.User.SkillLevels["+ i +"].Level"));

			Skill skill = new Skill();
			skill.setSkillGroupId(_ctx.stringValue("GetUserByExtensionResponse.User.SkillLevels["+ i +"].Skill.SkillGroupId"));
			skill.setInstanceId(_ctx.stringValue("GetUserByExtensionResponse.User.SkillLevels["+ i +"].Skill.InstanceId"));
			skill.setSkillGroupName(_ctx.stringValue("GetUserByExtensionResponse.User.SkillLevels["+ i +"].Skill.SkillGroupName"));
			skill.setSkillGroupDescription(_ctx.stringValue("GetUserByExtensionResponse.User.SkillLevels["+ i +"].Skill.SkillGroupDescription"));
			skillLevel.setSkill(skill);

			skillLevels.add(skillLevel);
		}
		user.setSkillLevels(skillLevels);
		getUserByExtensionResponse.setUser(user);
	 
	 	return getUserByExtensionResponse;
	}
}