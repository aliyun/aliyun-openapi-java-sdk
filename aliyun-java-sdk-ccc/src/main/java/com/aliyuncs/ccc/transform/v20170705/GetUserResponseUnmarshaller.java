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
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserResponseUnmarshaller {

	public static GetUserResponse unmarshall(GetUserResponse getUserResponse, UnmarshallerContext _ctx) {
		
		getUserResponse.setRequestId(_ctx.stringValue("GetUserResponse.RequestId"));
		getUserResponse.setHttpStatusCode(_ctx.integerValue("GetUserResponse.HttpStatusCode"));
		getUserResponse.setCode(_ctx.stringValue("GetUserResponse.Code"));
		getUserResponse.setMessage(_ctx.stringValue("GetUserResponse.Message"));
		getUserResponse.setSuccess(_ctx.booleanValue("GetUserResponse.Success"));

		User user = new User();
		user.setInstanceId(_ctx.stringValue("GetUserResponse.User.InstanceId"));
		user.setRamId(_ctx.stringValue("GetUserResponse.User.RamId"));
		user.setUserId(_ctx.stringValue("GetUserResponse.User.UserId"));

		Detail detail = new Detail();
		detail.setDisplayName(_ctx.stringValue("GetUserResponse.User.Detail.DisplayName"));
		detail.setEmail(_ctx.stringValue("GetUserResponse.User.Detail.Email"));
		detail.setLoginName(_ctx.stringValue("GetUserResponse.User.Detail.LoginName"));
		detail.setDepartment(_ctx.stringValue("GetUserResponse.User.Detail.Department"));
		detail.setPhone(_ctx.stringValue("GetUserResponse.User.Detail.Phone"));
		user.setDetail(detail);

		List<Role> roles = new ArrayList<Role>();
		for (int i = 0; i < _ctx.lengthValue("GetUserResponse.User.Roles.Length"); i++) {
			Role role = new Role();
			role.setInstanceId(_ctx.stringValue("GetUserResponse.User.Roles["+ i +"].InstanceId"));
			role.setRoleName(_ctx.stringValue("GetUserResponse.User.Roles["+ i +"].RoleName"));
			role.setRoleDescription(_ctx.stringValue("GetUserResponse.User.Roles["+ i +"].RoleDescription"));
			role.setRoleId(_ctx.stringValue("GetUserResponse.User.Roles["+ i +"].RoleId"));

			roles.add(role);
		}
		user.setRoles(roles);

		List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
		for (int i = 0; i < _ctx.lengthValue("GetUserResponse.User.SkillLevels.Length"); i++) {
			SkillLevel skillLevel = new SkillLevel();
			skillLevel.setSkillLevelId(_ctx.stringValue("GetUserResponse.User.SkillLevels["+ i +"].SkillLevelId"));
			skillLevel.setLevel(_ctx.integerValue("GetUserResponse.User.SkillLevels["+ i +"].Level"));

			Skill skill = new Skill();
			skill.setInstanceId(_ctx.stringValue("GetUserResponse.User.SkillLevels["+ i +"].Skill.InstanceId"));
			skill.setSkillGroupDescription(_ctx.stringValue("GetUserResponse.User.SkillLevels["+ i +"].Skill.SkillGroupDescription"));
			skill.setSkillGroupId(_ctx.stringValue("GetUserResponse.User.SkillLevels["+ i +"].Skill.SkillGroupId"));
			skill.setSkillGroupName(_ctx.stringValue("GetUserResponse.User.SkillLevels["+ i +"].Skill.SkillGroupName"));
			skillLevel.setSkill(skill);

			skillLevels.add(skillLevel);
		}
		user.setSkillLevels(skillLevels);
		getUserResponse.setUser(user);
	 
	 	return getUserResponse;
	}
}