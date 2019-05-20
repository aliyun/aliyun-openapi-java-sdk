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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListRealTimeAgentResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListRealTimeAgentResponse.User;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListRealTimeAgentResponse.User.SkillLevel;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListRealTimeAgentResponse.User.SkillLevel.Skill;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRealTimeAgentResponseUnmarshaller {

	public static ListRealTimeAgentResponse unmarshall(ListRealTimeAgentResponse listRealTimeAgentResponse, UnmarshallerContext context) {
		
		listRealTimeAgentResponse.setRequestId(context.stringValue("ListRealTimeAgentResponse.RequestId"));
		listRealTimeAgentResponse.setSuccess(context.booleanValue("ListRealTimeAgentResponse.Success"));
		listRealTimeAgentResponse.setCode(context.stringValue("ListRealTimeAgentResponse.Code"));
		listRealTimeAgentResponse.setMessage(context.stringValue("ListRealTimeAgentResponse.Message"));
		listRealTimeAgentResponse.setHttpStatusCode(context.integerValue("ListRealTimeAgentResponse.HttpStatusCode"));

		List<User> data = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("ListRealTimeAgentResponse.Data.Length"); i++) {
			User user = new User();
			user.setRamId(context.stringValue("ListRealTimeAgentResponse.Data["+ i +"].RamId"));
			user.setDisplayName(context.stringValue("ListRealTimeAgentResponse.Data["+ i +"].DisplayName"));
			user.setPhone(context.stringValue("ListRealTimeAgentResponse.Data["+ i +"].Phone"));
			user.setDn(context.stringValue("ListRealTimeAgentResponse.Data["+ i +"].Dn"));
			user.setState(context.stringValue("ListRealTimeAgentResponse.Data["+ i +"].State"));
			user.setStateDesc(context.stringValue("ListRealTimeAgentResponse.Data["+ i +"].StateDesc"));

			List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
			for (int j = 0; j < context.lengthValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels.Length"); j++) {
				SkillLevel skillLevel = new SkillLevel();
				skillLevel.setSkillLevelId(context.stringValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels["+ j +"].SkillLevelId"));
				skillLevel.setLevel(context.integerValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels["+ j +"].Level"));

				Skill skill = new Skill();
				skill.setSkillGroupId(context.stringValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupId"));
				skill.setInstanceId(context.stringValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels["+ j +"].Skill.InstanceId"));
				skill.setSkillGroupName(context.stringValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupName"));
				skill.setSkillGroupDescription(context.stringValue("ListRealTimeAgentResponse.Data["+ i +"].SkillLevels["+ j +"].Skill.SkillGroupDescription"));
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