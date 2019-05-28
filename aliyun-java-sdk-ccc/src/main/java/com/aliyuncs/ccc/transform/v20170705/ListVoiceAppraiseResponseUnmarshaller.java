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

import com.aliyuncs.ccc.model.v20170705.ListVoiceAppraiseResponse;
import com.aliyuncs.ccc.model.v20170705.ListVoiceAppraiseResponse.ContactFlow;
import com.aliyuncs.ccc.model.v20170705.ListVoiceAppraiseResponse.ContactFlow.ContactFlowVersion;
import com.aliyuncs.ccc.model.v20170705.ListVoiceAppraiseResponse.ContactFlow.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVoiceAppraiseResponseUnmarshaller {

	public static ListVoiceAppraiseResponse unmarshall(ListVoiceAppraiseResponse listVoiceAppraiseResponse, UnmarshallerContext context) {
		
		listVoiceAppraiseResponse.setRequestId(context.stringValue("ListVoiceAppraiseResponse.RequestId"));
		listVoiceAppraiseResponse.setSuccess(context.booleanValue("ListVoiceAppraiseResponse.Success"));
		listVoiceAppraiseResponse.setCode(context.stringValue("ListVoiceAppraiseResponse.Code"));
		listVoiceAppraiseResponse.setMessage(context.stringValue("ListVoiceAppraiseResponse.Message"));
		listVoiceAppraiseResponse.setHttpStatusCode(context.integerValue("ListVoiceAppraiseResponse.HttpStatusCode"));
		listVoiceAppraiseResponse.setNotice(context.stringValue("ListVoiceAppraiseResponse.Notice"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setContactFlowId(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.ContactFlowId"));
		contactFlow.setInstanceId(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.InstanceId"));
		contactFlow.setContactFlowName(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.ContactFlowName"));
		contactFlow.setContactFlowDescription(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.ContactFlowDescription"));
		contactFlow.setType(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.Type"));
		contactFlow.setAppliedVersion(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.AppliedVersion"));

		List<ContactFlowVersion> versions = new ArrayList<ContactFlowVersion>();
		for (int i = 0; i < context.lengthValue("ListVoiceAppraiseResponse.ContactFlow.Versions.Length"); i++) {
			ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
			contactFlowVersion.setContactFlowVersionId(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionId"));
			contactFlowVersion.setVersion(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].Version"));
			contactFlowVersion.setContactFlowVersionDescription(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionDescription"));
			contactFlowVersion.setContent(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].Content"));
			contactFlowVersion.setLastModified(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].LastModified"));
			contactFlowVersion.setLastModifiedBy(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].LastModifiedBy"));
			contactFlowVersion.setStatus(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].Status"));

			versions.add(contactFlowVersion);
		}
		contactFlow.setVersions(versions);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setRemainingTime(context.integerValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setTrunks(context.integerValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers["+ i +"].Trunks"));

			phoneNumbers.add(phoneNumber);
		}
		contactFlow.setPhoneNumbers(phoneNumbers);
		listVoiceAppraiseResponse.setContactFlow(contactFlow);
	 
	 	return listVoiceAppraiseResponse;
	}
}