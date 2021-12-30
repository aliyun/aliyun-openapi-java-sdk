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

import com.aliyuncs.ccc.model.v20170705.ListSkillGroupsOfUserResponse;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupsOfUserResponse.SkillLevel;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupsOfUserResponse.SkillLevel.Skill;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupsOfUserResponse.SkillLevel.Skill.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupsOfUserResponseUnmarshaller {

	public static ListSkillGroupsOfUserResponse unmarshall(ListSkillGroupsOfUserResponse listSkillGroupsOfUserResponse, UnmarshallerContext _ctx) {
		
		listSkillGroupsOfUserResponse.setRequestId(_ctx.stringValue("ListSkillGroupsOfUserResponse.RequestId"));
		listSkillGroupsOfUserResponse.setSuccess(_ctx.booleanValue("ListSkillGroupsOfUserResponse.Success"));
		listSkillGroupsOfUserResponse.setCode(_ctx.stringValue("ListSkillGroupsOfUserResponse.Code"));
		listSkillGroupsOfUserResponse.setMessage(_ctx.stringValue("ListSkillGroupsOfUserResponse.Message"));
		listSkillGroupsOfUserResponse.setHttpStatusCode(_ctx.integerValue("ListSkillGroupsOfUserResponse.HttpStatusCode"));

		List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
		for (int i = 0; i < _ctx.lengthValue("ListSkillGroupsOfUserResponse.SkillLevels.Length"); i++) {
			SkillLevel skillLevel = new SkillLevel();
			skillLevel.setSkillLevelId(_ctx.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].SkillLevelId"));
			skillLevel.setLevel(_ctx.integerValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Level"));

			Skill skill = new Skill();
			skill.setSkillGroupId(_ctx.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.SkillGroupId"));
			skill.setInstanceId(_ctx.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.InstanceId"));
			skill.setSkillGroupName(_ctx.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.SkillGroupName"));
			skill.setSkillGroupDescription(_ctx.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.SkillGroupDescription"));
			skill.setRoutingStrategy(_ctx.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.RoutingStrategy"));

			List<PhoneNumber> outboundPhoneNumbers = new ArrayList<PhoneNumber>();
			for (int j = 0; j < _ctx.lengthValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setPhoneNumberId(_ctx.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].PhoneNumberId"));
				phoneNumber.setInstanceId(_ctx.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].InstanceId"));
				phoneNumber.setNumber(_ctx.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].Number"));
				phoneNumber.setPhoneNumberDescription(_ctx.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].PhoneNumberDescription"));
				phoneNumber.setTestOnly(_ctx.booleanValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].TestOnly"));
				phoneNumber.setRemainingTime(_ctx.integerValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].RemainingTime"));
				phoneNumber.setAllowOutbound(_ctx.booleanValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].AllowOutbound"));
				phoneNumber.setUsage(_ctx.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].Usage"));
				phoneNumber.setTrunks(_ctx.integerValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].Trunks"));
				phoneNumber.setProvince(_ctx.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].Province"));
				phoneNumber.setCity(_ctx.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].City"));

				outboundPhoneNumbers.add(phoneNumber);
			}
			skill.setOutboundPhoneNumbers(outboundPhoneNumbers);
			skillLevel.setSkill(skill);

			skillLevels.add(skillLevel);
		}
		listSkillGroupsOfUserResponse.setSkillLevels(skillLevels);
	 
	 	return listSkillGroupsOfUserResponse;
	}
}