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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListPhoneNumbersByRamIdResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPhoneNumbersByRamIdResponse.PhoneNumber;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPhoneNumbersByRamIdResponse.PhoneNumber.ContactFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPhoneNumbersByRamIdResponseUnmarshaller {

	public static ListPhoneNumbersByRamIdResponse unmarshall(ListPhoneNumbersByRamIdResponse listPhoneNumbersByRamIdResponse, UnmarshallerContext context) {
		
		listPhoneNumbersByRamIdResponse.setRequestId(context.stringValue("ListPhoneNumbersByRamIdResponse.RequestId"));
		listPhoneNumbersByRamIdResponse.setSuccess(context.booleanValue("ListPhoneNumbersByRamIdResponse.Success"));
		listPhoneNumbersByRamIdResponse.setCode(context.stringValue("ListPhoneNumbersByRamIdResponse.Code"));
		listPhoneNumbersByRamIdResponse.setMessage(context.stringValue("ListPhoneNumbersByRamIdResponse.Message"));
		listPhoneNumbersByRamIdResponse.setHttpStatusCode(context.integerValue("ListPhoneNumbersByRamIdResponse.HttpStatusCode"));

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(context.booleanValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(context.integerValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(context.booleanValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(context.stringValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(context.integerValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].Trunks"));

			ContactFlow contactFlow = new ContactFlow();
			contactFlow.setContactFlowId(context.stringValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowId"));
			contactFlow.setInstanceId(context.stringValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].ContactFlow.InstanceId"));
			contactFlow.setContactFlowName(context.stringValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowName"));
			contactFlow.setContactFlowDescription(context.stringValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowDescription"));
			contactFlow.setType(context.stringValue("ListPhoneNumbersByRamIdResponse.PhoneNumbers["+ i +"].ContactFlow.Type"));
			phoneNumber.setContactFlow(contactFlow);

			phoneNumbers.add(phoneNumber);
		}
		listPhoneNumbersByRamIdResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return listPhoneNumbersByRamIdResponse;
	}
}