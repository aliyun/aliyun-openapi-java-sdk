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

	public static ListPhoneNumbersResponse unmarshall(ListPhoneNumbersResponse listPhoneNumbersResponse, UnmarshallerContext _ctx) {
		
		listPhoneNumbersResponse.setRequestId(_ctx.stringValue("ListPhoneNumbersResponse.RequestId"));
		listPhoneNumbersResponse.setHttpStatusCode(_ctx.integerValue("ListPhoneNumbersResponse.HttpStatusCode"));
		listPhoneNumbersResponse.setCode(_ctx.stringValue("ListPhoneNumbersResponse.Code"));
		listPhoneNumbersResponse.setMessage(_ctx.stringValue("ListPhoneNumbersResponse.Message"));
		listPhoneNumbersResponse.setSuccess(_ctx.booleanValue("ListPhoneNumbersResponse.Success"));

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("ListPhoneNumbersResponse.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setTestOnly(_ctx.booleanValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setSipTelX(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].SipTelX"));
			phoneNumber.setRemainingTime(_ctx.integerValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setCity(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].City"));
			phoneNumber.setInstanceId(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setAllowOutbound(_ctx.booleanValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setAssignee(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].Assignee"));
			phoneNumber.setPhoneNumberId(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setTrunks(_ctx.integerValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].Trunks"));
			phoneNumber.setNumber(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setNumberCommodityStatus(_ctx.integerValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].NumberCommodityStatus"));
			phoneNumber.setProvince(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].Province"));

			ContactFlow contactFlow = new ContactFlow();
			contactFlow.setType(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.Type"));
			contactFlow.setContactFlowDescription(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowDescription"));
			contactFlow.setInstanceId(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.InstanceId"));
			contactFlow.setContactFlowName(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowName"));
			contactFlow.setContactFlowId(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowId"));
			phoneNumber.setContactFlow(contactFlow);

			PrivacyNumber privacyNumber = new PrivacyNumber();
			privacyNumber.setType(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.Type"));
			privacyNumber.setPoolId(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.PoolId"));
			privacyNumber.setSubId(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.SubId"));
			privacyNumber.setPhoneNumber(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.PhoneNumber"));
			privacyNumber.setPoolName(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.PoolName"));
			privacyNumber.setBizId(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.BizId"));
			privacyNumber.setRegionNameCity(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.RegionNameCity"));
			privacyNumber.setExtra(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.Extra"));
			privacyNumber.setTelX(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PrivacyNumber.TelX"));
			phoneNumber.setPrivacyNumber(privacyNumber);

			List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
			for (int j = 0; j < _ctx.lengthValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].SkillGroups.Length"); j++) {
				SkillGroup skillGroup = new SkillGroup();
				skillGroup.setSkillGroupName(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].SkillGroups["+ j +"].SkillGroupName"));
				skillGroup.setSkillGroupId(_ctx.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].SkillGroups["+ j +"].SkillGroupId"));

				skillGroups.add(skillGroup);
			}
			phoneNumber.setSkillGroups(skillGroups);

			phoneNumbers.add(phoneNumber);
		}
		listPhoneNumbersResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return listPhoneNumbersResponse;
	}
}