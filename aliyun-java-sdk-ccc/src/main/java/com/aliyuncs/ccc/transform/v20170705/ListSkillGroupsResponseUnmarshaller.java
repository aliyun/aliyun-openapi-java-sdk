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

import com.aliyuncs.ccc.model.v20170705.ListSkillGroupsResponse;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupsResponse.SkillGroup;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupsResponse.SkillGroup.PhoneNumber;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupsResponseUnmarshaller {

	public static ListSkillGroupsResponse unmarshall(ListSkillGroupsResponse listSkillGroupsResponse, UnmarshallerContext context) {
		
		listSkillGroupsResponse.setRequestId(context.stringValue("ListSkillGroupsResponse.RequestId"));
		listSkillGroupsResponse.setSuccess(context.booleanValue("ListSkillGroupsResponse.Success"));
		listSkillGroupsResponse.setCode(context.stringValue("ListSkillGroupsResponse.Code"));
		listSkillGroupsResponse.setMessage(context.stringValue("ListSkillGroupsResponse.Message"));
		listSkillGroupsResponse.setHttpStatusCode(context.integerValue("ListSkillGroupsResponse.HttpStatusCode"));

		List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
		for (int i = 0; i < context.lengthValue("ListSkillGroupsResponse.SkillGroups.Length"); i++) {
			SkillGroup skillGroup = new SkillGroup();
			skillGroup.setSkillGroupId(context.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].SkillGroupId"));
			skillGroup.setInstanceId(context.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].InstanceId"));
			skillGroup.setSkillGroupName(context.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].SkillGroupName"));
			skillGroup.setAccSkillGroupName(context.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].AccSkillGroupName"));
			skillGroup.setAccQueueName(context.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].AccQueueName"));
			skillGroup.setSkillGroupDescription(context.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].SkillGroupDescription"));
			skillGroup.setUserCount(context.integerValue("ListSkillGroupsResponse.SkillGroups["+ i +"].UserCount"));

			List<PhoneNumber> outboundPhoneNumbers = new ArrayList<PhoneNumber>();
			for (int j = 0; j < context.lengthValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setPhoneNumberId(context.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].PhoneNumberId"));
				phoneNumber.setInstanceId(context.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].InstanceId"));
				phoneNumber.setNumber(context.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].Number"));
				phoneNumber.setPhoneNumberDescription(context.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].PhoneNumberDescription"));
				phoneNumber.setTestOnly(context.booleanValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].TestOnly"));
				phoneNumber.setRemainingTime(context.integerValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].RemainingTime"));
				phoneNumber.setAllowOutbound(context.booleanValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].AllowOutbound"));
				phoneNumber.setUsage(context.stringValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].Usage"));
				phoneNumber.setTrunks(context.integerValue("ListSkillGroupsResponse.SkillGroups["+ i +"].OutboundPhoneNumbers["+ j +"].Trunks"));

				outboundPhoneNumbers.add(phoneNumber);
			}
			skillGroup.setOutboundPhoneNumbers(outboundPhoneNumbers);

			skillGroups.add(skillGroup);
		}
		listSkillGroupsResponse.setSkillGroups(skillGroups);
	 
	 	return listSkillGroupsResponse;
	}
}