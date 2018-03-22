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

	public static ListSkillGroupsOfUserResponse unmarshall(ListSkillGroupsOfUserResponse listSkillGroupsOfUserResponse, UnmarshallerContext context) {
		
		listSkillGroupsOfUserResponse.setRequestId(context.stringValue("ListSkillGroupsOfUserResponse.RequestId"));
		listSkillGroupsOfUserResponse.setSuccess(context.booleanValue("ListSkillGroupsOfUserResponse.Success"));
		listSkillGroupsOfUserResponse.setCode(context.stringValue("ListSkillGroupsOfUserResponse.Code"));
		listSkillGroupsOfUserResponse.setMessage(context.stringValue("ListSkillGroupsOfUserResponse.Message"));
		listSkillGroupsOfUserResponse.setHttpStatusCode(context.integerValue("ListSkillGroupsOfUserResponse.HttpStatusCode"));

		List<SkillLevel> skillLevels = new ArrayList<SkillLevel>();
		for (int i = 0; i < context.lengthValue("ListSkillGroupsOfUserResponse.SkillLevels.Length"); i++) {
			SkillLevel skillLevel = new SkillLevel();
			skillLevel.setSkillLevelId(context.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].SkillLevelId"));
			skillLevel.setLevel(context.integerValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Level"));

			Skill skill = new Skill();
			skill.setSkillGroupId(context.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.SkillGroupId"));
			skill.setInstanceId(context.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.InstanceId"));
			skill.setSkillGroupName(context.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.SkillGroupName"));
			skill.setSkillGroupDescription(context.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.SkillGroupDescription"));

			List<PhoneNumber> outboundPhoneNumbers = new ArrayList<PhoneNumber>();
			for (int j = 0; j < context.lengthValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setPhoneNumberId(context.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].PhoneNumberId"));
				phoneNumber.setInstanceId(context.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].InstanceId"));
				phoneNumber.setNumber(context.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].Number"));
				phoneNumber.setPhoneNumberDescription(context.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].PhoneNumberDescription"));
				phoneNumber.setTestOnly(context.booleanValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].TestOnly"));
				phoneNumber.setRemainingTime(context.integerValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].RemainingTime"));
				phoneNumber.setAllowOutbound(context.booleanValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].AllowOutbound"));
				phoneNumber.setUsage(context.stringValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].Usage"));
				phoneNumber.setTrunks(context.integerValue("ListSkillGroupsOfUserResponse.SkillLevels["+ i +"].Skill.OutboundPhoneNumbers["+ j +"].Trunks"));

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