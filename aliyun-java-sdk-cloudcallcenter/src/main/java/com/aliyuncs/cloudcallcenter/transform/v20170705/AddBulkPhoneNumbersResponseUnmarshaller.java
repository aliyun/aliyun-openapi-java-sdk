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

import com.aliyuncs.cloudcallcenter.model.v20170705.AddBulkPhoneNumbersResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.AddBulkPhoneNumbersResponse.PhoneNumber;
import com.aliyuncs.cloudcallcenter.model.v20170705.AddBulkPhoneNumbersResponse.PhoneNumber.ContactFlow;
import com.aliyuncs.cloudcallcenter.model.v20170705.AddBulkPhoneNumbersResponse.PhoneNumber.SkillGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddBulkPhoneNumbersResponseUnmarshaller {

	public static AddBulkPhoneNumbersResponse unmarshall(AddBulkPhoneNumbersResponse addBulkPhoneNumbersResponse, UnmarshallerContext context) {
		
		addBulkPhoneNumbersResponse.setRequestId(context.stringValue("AddBulkPhoneNumbersResponse.RequestId"));
		addBulkPhoneNumbersResponse.setSuccess(context.booleanValue("AddBulkPhoneNumbersResponse.Success"));
		addBulkPhoneNumbersResponse.setCode(context.stringValue("AddBulkPhoneNumbersResponse.Code"));
		addBulkPhoneNumbersResponse.setMessage(context.stringValue("AddBulkPhoneNumbersResponse.Message"));
		addBulkPhoneNumbersResponse.setHttpStatusCode(context.integerValue("AddBulkPhoneNumbersResponse.HttpStatusCode"));

		List<String> arrearagePhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("AddBulkPhoneNumbersResponse.ArrearagePhoneNumbers.Length"); i++) {
			arrearagePhoneNumbers.add(context.stringValue("AddBulkPhoneNumbersResponse.ArrearagePhoneNumbers["+ i +"]"));
		}
		addBulkPhoneNumbersResponse.setArrearagePhoneNumbers(arrearagePhoneNumbers);

		List<String> failedPhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("AddBulkPhoneNumbersResponse.FailedPhoneNumbers.Length"); i++) {
			failedPhoneNumbers.add(context.stringValue("AddBulkPhoneNumbersResponse.FailedPhoneNumbers["+ i +"]"));
		}
		addBulkPhoneNumbersResponse.setFailedPhoneNumbers(failedPhoneNumbers);

		List<String> userdPhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("AddBulkPhoneNumbersResponse.UserdPhoneNumbers.Length"); i++) {
			userdPhoneNumbers.add(context.stringValue("AddBulkPhoneNumbersResponse.UserdPhoneNumbers["+ i +"]"));
		}
		addBulkPhoneNumbersResponse.setUserdPhoneNumbers(userdPhoneNumbers);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("AddBulkPhoneNumbersResponse.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(context.booleanValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(context.integerValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(context.booleanValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(context.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(context.integerValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].Trunks"));

			ContactFlow contactFlow = new ContactFlow();
			contactFlow.setContactFlowId(context.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowId"));
			contactFlow.setInstanceId(context.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.InstanceId"));
			contactFlow.setContactFlowName(context.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowName"));
			contactFlow.setContactFlowDescription(context.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowDescription"));
			contactFlow.setType(context.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.Type"));
			phoneNumber.setContactFlow(contactFlow);

			List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
			for (int j = 0; j < context.lengthValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].SkillGroups.Length"); j++) {
				SkillGroup skillGroup = new SkillGroup();
				skillGroup.setSkillGroupId(context.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].SkillGroups["+ j +"].SkillGroupId"));
				skillGroup.setSkillGroupName(context.stringValue("AddBulkPhoneNumbersResponse.PhoneNumbers["+ i +"].SkillGroups["+ j +"].SkillGroupName"));

				skillGroups.add(skillGroup);
			}
			phoneNumber.setSkillGroups(skillGroups);

			phoneNumbers.add(phoneNumber);
		}
		addBulkPhoneNumbersResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return addBulkPhoneNumbersResponse;
	}
}