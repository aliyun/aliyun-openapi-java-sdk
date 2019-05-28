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

import com.aliyuncs.ccc.model.v20170705.ListPhoneNumbersResponse;
import com.aliyuncs.ccc.model.v20170705.ListPhoneNumbersResponse.PhoneNumber;
import com.aliyuncs.ccc.model.v20170705.ListPhoneNumbersResponse.PhoneNumber.ContactFlow;
import com.aliyuncs.ccc.model.v20170705.ListPhoneNumbersResponse.PhoneNumber.PrivacyNumber;
import com.aliyuncs.ccc.model.v20170705.ListPhoneNumbersResponse.PhoneNumber.SkillGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPhoneNumbersResponseUnmarshaller {

	public static ListPhoneNumbersResponse unmarshall(ListPhoneNumbersResponse listPhoneNumbersResponse, UnmarshallerContext context) {
		
		listPhoneNumbersResponse.setRequestId(context.stringValue("ListPhoneNumbersResponse.RequestId"));
		listPhoneNumbersResponse.setSuccess(context.booleanValue("ListPhoneNumbersResponse.Success"));
		listPhoneNumbersResponse.setCode(context.stringValue("ListPhoneNumbersResponse.Code"));
		listPhoneNumbersResponse.setMessage(context.stringValue("ListPhoneNumbersResponse.Message"));
		listPhoneNumbersResponse.setHttpStatusCode(context.integerValue("ListPhoneNumbersResponse.HttpStatusCode"));

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("ListPhoneNumbersResponse.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(context.booleanValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(context.integerValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(context.booleanValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(context.integerValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].Trunks"));
			phoneNumber.setProvince(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].Province"));
			phoneNumber.setCity(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].City"));
			phoneNumber.setAssignee(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].Assignee"));

			ContactFlow contactFlow = new ContactFlow();
			contactFlow.setContactFlowId(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowId"));
			contactFlow.setInstanceId(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.InstanceId"));
			contactFlow.setContactFlowName(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowName"));
			contactFlow.setContactFlowDescription(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowDescription"));
			contactFlow.setType(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.Type"));
			phoneNumber.setContactFlow(contactFlow);

			PrivacyNumber privacyNumber = new PrivacyNumber();
			privacyNumber.setPoolId(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.PoolId"));
			privacyNumber.setType(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.Type"));
			privacyNumber.setTelX(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.TelX"));
			privacyNumber.setPoolName(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.PoolName"));
			privacyNumber.setPhoneNumber(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.PhoneNumber"));
			privacyNumber.setExtra(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.Extra"));
			privacyNumber.setBizId(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.BizId"));
			privacyNumber.setSubId(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.SubId"));
			privacyNumber.setRegionNameCity(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.RegionNameCity"));
			phoneNumber.setPrivacyNumber(privacyNumber);

			List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
			for (int j = 0; j < context.lengthValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].SkillGroups.Length"); j++) {
				SkillGroup skillGroup = new SkillGroup();
				skillGroup.setSkillGroupId(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].SkillGroups["+ j +"].SkillGroupId"));
				skillGroup.setSkillGroupName(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].SkillGroups["+ j +"].SkillGroupName"));

				skillGroups.add(skillGroup);
			}
			phoneNumber.setSkillGroups(skillGroups);

			phoneNumbers.add(phoneNumber);
		}
		listPhoneNumbersResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return listPhoneNumbersResponse;
	}
}