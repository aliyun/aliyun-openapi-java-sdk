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

import com.aliyuncs.ccc.model.v20170705.ListRealTimeAgentResponse;
import com.aliyuncs.ccc.model.v20170705.ListRealTimeAgentResponse.User;
import com.aliyuncs.ccc.model.v20170705.ListRealTimeAgentResponse.User.SkillLevel;
import com.aliyuncs.ccc.model.v20170705.ListRealTimeAgentResponse.User.SkillLevel.Skill;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRealTimeAgentResponseUnmarshaller {

	public static ListRealTimeAgentResponse unmarshall(ListRealTimeAgentResponse listRealTimeAgentResponse, UnmarshallerContext _ctx) {
		
		listRealTimeAgentResponse.setRequestId(_ctx.stringValue("ListRealTimeAgentResponse.RequestId"));
		listRealTimeAgentResponse.setSuccess(_ctx.booleanValue("ListRealTimeAgentResponse.Success"));
		listRealTimeAgentResponse.setCode(_ctx.stringValue("ListRealTimeAgentResponse.Code"));
		listRealTimeAgentResponse.setMessage(_ctx.stringValue("ListRealTimeAgentResponse.Message"));
		listRealTimeAgentResponse.setHttpStatusCode(_ctx.integerValue("ListRealTimeAgentResponse.HttpStatusCode"));

		List<User> data = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListRealTimeAgentResponse.Data.Length"); i++) {
			User user = new User();
			user.setRamId(_ctx.stringValue("ListRealTimeAgentResponse.Data["+ i +"].RamId"));
			user.setDisplayName(_ctx.stringValue("ListRealTimeAgentResponse.Data["+ i +"].DisplayName"));
			user.setPhone(_ctx.stringValue("ListRealTimeAgentResponse.Data["+ i +"].Phone"));
			user.setDn(_ctx.stringValue("ListRealTimeAgentResponse.Data["+ i +"].Dn"));
			user.setState(_ctx.stringValue("ListRealTimeAgentResponse.Data["+ i +"].State"));
			user.setStateDesc(_ctx.stringValue("ListRealTimeAgentResponse.Data["+ i +"].StateDesc"));

			List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
			for (int j = 0; j < _ctx.lengthValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels.Length"); j++) {
				SkillLevel skillLevel = new SkillLevel();
				skillLevel.setSkillLevelId(_ctx.stringValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels["+ j +"].SkillLevelId"));
				skillLevel.setLevel(_ctx.integerValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels["+ j +"].Level"));

				Skill skill = new Skill();
				skill.setSkillGroupId(_ctx.stringValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupId"));
				skill.setInstanceId(_ctx.stringValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels["+ j +"].Skill.InstanceId"));
				skill.setSkillGroupName(_ctx.stringValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupName"));
				skill.setSkillGroupDescription(_ctx.stringValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupDescription"));
				skillLevel.setSkill(skill);

				skillLevels.add(skillLevel);
			}
			user.setSkillLevels(skillLevels);

			data.add(user);
		}
		listRealTimeAgentResponse.setData(data);
	 
	 	return listRealTimeAgentResponse;
	}
}