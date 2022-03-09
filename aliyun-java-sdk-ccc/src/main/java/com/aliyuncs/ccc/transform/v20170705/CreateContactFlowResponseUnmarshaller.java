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

	public static CreateContactFlowResponse unmarshall(CreateContactFlowResponse createContactFlowResponse, UnmarshallerContext _ctx) {
		
		createContactFlowResponse.setRequestId(_ctx.stringValue("CreateContactFlowResponse.RequestId"));
		createContactFlowResponse.setHttpStatusCode(_ctx.integerValue("CreateContactFlowResponse.HttpStatusCode"));
		createContactFlowResponse.setCode(_ctx.stringValue("CreateContactFlowResponse.Code"));
		createContactFlowResponse.setMessage(_ctx.stringValue("CreateContactFlowResponse.Message"));
		createContactFlowResponse.setSuccess(_ctx.booleanValue("CreateContactFlowResponse.Success"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setContactFlowDescription(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.ContactFlowDescription"));
		contactFlow.setType(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.Type"));
		contactFlow.setContactFlowName(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.ContactFlowName"));
		contactFlow.setInstanceId(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.InstanceId"));
		contactFlow.setContactFlowId(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.ContactFlowId"));
		contactFlow.setAppliedVersion(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.AppliedVersion"));

		List<ContactFlowVersion> versions = new ArrayList<ContactFlowVersion>();
		for (int i = 0; i < _ctx.lengthValue("CreateContactFlowResponse.ContactFlow.Versions.Length"); i++) {
			ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
			contactFlowVersion.setStatus(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].Status"));
			contactFlowVersion.setLastModified(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].LastModified"));
			contactFlowVersion.setCanvas(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].Canvas"));
			contactFlowVersion.setLockedBy(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].LockedBy"));
			contactFlowVersion.setVersion(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].Version"));
			contactFlowVersion.setContactFlowVersionId(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionId"));
			contactFlowVersion.setLastModifiedBy(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].LastModifiedBy"));
			contactFlowVersion.setContactFlowVersionDescription(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionDescription"));
			contactFlowVersion.setContent(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.Versions["+ i +"].Content"));

			versions.add(contactFlowVersion);
		}
		contactFlow.setVersions(versions);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setTestOnly(_ctx.booleanValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setTrunks(_ctx.integerValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].Trunks"));
			phoneNumber.setRemainingTime(_ctx.integerValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setNumber(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setInstanceId(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setUsage(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setAllowOutbound(_ctx.booleanValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setPhoneNumberDescription(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setPhoneNumberId(_ctx.stringValue("CreateContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberId"));

			phoneNumbers.add(phoneNumber);
		}
		contactFlow.setPhoneNumbers(phoneNumbers);
		createContactFlowResponse.setContactFlow(contactFlow);
	 
	 	return createContactFlowResponse;
	}
}