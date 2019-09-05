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

import com.aliyuncs.ccc.model.v20170705.AddBulkPhoneNumbersResponse;
import com.aliyuncs.ccc.model.v20170705.AddBulkPhoneNumbersResponse.PhoneNumber;
import com.aliyuncs.ccc.model.v20170705.AddBulkPhoneNumbersResponse.PhoneNumber.ContactFlow;
import com.aliyuncs.ccc.model.v20170705.AddBulkPhoneNumbersResponse.PhoneNumber.SkillGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddBulkPhoneNumbersResponseUnmarshaller {

	public static AddBulkPhoneNumbersResponse unmarshall(AddBulkPhoneNumbersResponse addBulkPhoneNumbersResponse, UnmarshallerContext _ctx) {
		
		addBulkPhoneNumbersResponse.setRequestId(_ctx.stringValue("AddBulkPhoneNumbersResponse.RequestId"));
		addBulkPhoneNumbersResponse.setSuccess(_ctx.booleanValue("AddBulkPhoneNumbersResponse.Success"));
		addBulkPhoneNumbersResponse.setCode(_ctx.stringValue("AddBulkPhoneNumbersResponse.Code"));
		addBulkPhoneNumbersResponse.setMessage(_ctx.stringValue("AddBulkPhoneNumbersResponse.Message"));
		addBulkPhoneNumbersResponse.setHttpStatusCode(_ctx.integerValue("AddBulkPhoneNumbersResponse.HttpStatusCode"));

		List<String> arrearagePhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddBulkPhoneNumbersResponse.ArrearagePhoneNumbers.Length"); i++) {
			arrearagePhoneNumbers.add(_ctx.stringValue("AddBulkPhoneNumbersResponse.ArrearagePhoneNumbers["+ i +"]"));
		}
		addBulkPhoneNumbersResponse.setArrearagePhoneNumbers(arrearagePhoneNumbers);

		List<String> failedPhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddBulkPhoneNumbersResponse.FailedPhoneNumbers.Length"); i++) {
			failedPhoneNumbers.add(_ctx.stringValue("AddBulkPhoneNumbersResponse.FailedPhoneNumbers["+ i +"]"));
		}
		addBulkPhoneNumbersResponse.setFailedPhoneNumbers(failedPhoneNumbers);

		List<String> userdPhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddBulkPhoneNumbersResponse.UserdPhoneNumbers.Length"); i++) {
			userdPhoneNumbers.add(_ctx.stringValue("AddBulkPhoneNumbersResponse.UserdPhoneNumbers["+ i +"]"));
		}
		addBulkPhoneNumbersResponse.setUserdPhoneNumbers(userdPhoneNumbers);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("AddBulkPhoneNumbersResponse.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(_ctx.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(_ctx.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(_ctx.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(_ctx.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(_ctx.booleanValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(_ctx.integerValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(_ctx.booleanValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(_ctx.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(_ctx.integerValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].Trunks"));

			ContactFlow contactFlow = new ContactFlow();
			contactFlow.setContactFlowId(_ctx.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowId"));
			contactFlow.setInstanceId(_ctx.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.InstanceId"));
			contactFlow.setContactFlowName(_ctx.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowName"));
			contactFlow.setContactFlowDescription(_ctx.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowDescription"));
			contactFlow.setType(_ctx.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.Type"));
			phoneNumber.setContactFlow(contactFlow);

			List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
			for (int j = 0; j < _ctx.lengthValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].SkillGroups.Length"); j++) {
				SkillGroup skillGroup = new SkillGroup();
				skillGroup.setSkillGroupId(_ctx.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].SkillGroups["+ j +"].SkillGroupId"));
				skillGroup.setSkillGroupName(_ctx.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].SkillGroups["+ j +"].SkillGroupName"));

				skillGroups.add(skillGroup);
			}
			phoneNumber.setSkillGroups(skillGroups);

			phoneNumbers.add(phoneNumber);
		}
		addBulkPhoneNumbersResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return addBulkPhoneNumbersResponse;
	}
}