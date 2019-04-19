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

import com.aliyuncs.ccc.model.v20170705.CreateContactFlowResponse;
import com.aliyuncs.ccc.model.v20170705.CreateContactFlowResponse.ContactFlow;
import com.aliyuncs.ccc.model.v20170705.CreateContactFlowResponse.ContactFlow.ContactFlowVersion;
import com.aliyuncs.ccc.model.v20170705.CreateContactFlowResponse.ContactFlow.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateContactFlowResponseUnmarshaller {

	public static CreateContactFlowResponse unmarshall(CreateContactFlowResponse createContactFlowResponse, UnmarshallerContext context) {
		
		createContactFlowResponse.setRequestId(context.stringValue("CreateContactFlowResponse.RequestId"));
		createContactFlowResponse.setSuccess(context.booleanValue("CreateContactFlowResponse.Success"));
		createContactFlowResponse.setCode(context.stringValue("CreateContactFlowResponse.Code"));
		createContactFlowResponse.setMessage(context.stringValue("CreateContactFlowResponse.Message"));
		createContactFlowResponse.setHttpStatusCode(context.integerValue("CreateContactFlowResponse.HttpStatusCode"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setContactFlowId(context.stringValue("CreateContactFlowResponse.ContactFlow.ContactFlowId"));
		contactFlow.setInstanceId(context.stringValue("CreateContactFlowResponse.ContactFlow.InstanceId"));
		contactFlow.setContactFlowName(context.stringValue("CreateContactFlowResponse.ContactFlow.ContactFlowName"));
		contactFlow.setContactFlowDescription(context.stringValue("CreateContactFlowResponse.ContactFlow.ContactFlowDescription"));
		contactFlow.setType(context.stringValue("CreateContactFlowResponse.ContactFlow.Type"));
		contactFlow.setAppliedVersion(context.stringValue("CreateContactFlowResponse.ContactFlow.AppliedVersion"));

		List<ContactFlowVersion> versions = new ArrayList<ContactFlowVersion>();
		for (int i = 0; i < context.lengthValue("CreateContactFlowResponse.ContactFlow.Versions.Length"); i++) {
			ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
			contactFlowVersion.setContactFlowVersionId(context.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionId"));
			contactFlowVersion.setVersion(context.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].Version"));
			contactFlowVersion.setContactFlowVersionDescription(context.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionDescription"));
			contactFlowVersion.setCanvas(context.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].Canvas"));
			contactFlowVersion.setContent(context.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].Content"));
			contactFlowVersion.setLastModified(context.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].LastModified"));
			contactFlowVersion.setLastModifiedBy(context.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].LastModifiedBy"));
			contactFlowVersion.setLockedBy(context.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].LockedBy"));
			contactFlowVersion.setStatus(context.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].Status"));

			versions.add(contactFlowVersion);
		}
		contactFlow.setVersions(versions);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(context.booleanValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(context.integerValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(context.booleanValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(context.stringValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(context.integerValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].Trunks"));

			phoneNumbers.add(phoneNumber);
		}
		contactFlow.setPhoneNumbers(phoneNumbers);
		createContactFlowResponse.setContactFlow(contactFlow);
	 
	 	return createContactFlowResponse;
	}
}