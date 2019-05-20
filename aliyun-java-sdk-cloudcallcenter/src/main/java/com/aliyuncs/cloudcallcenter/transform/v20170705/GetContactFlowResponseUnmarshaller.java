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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetContactFlowResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetContactFlowResponse.ContactFlow;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetContactFlowResponse.ContactFlow.ContactFlowVersion;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetContactFlowResponse.ContactFlow.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContactFlowResponseUnmarshaller {

	public static GetContactFlowResponse unmarshall(GetContactFlowResponse getContactFlowResponse, UnmarshallerContext context) {
		
		getContactFlowResponse.setRequestId(context.stringValue("GetContactFlowResponse.RequestId"));
		getContactFlowResponse.setSuccess(context.booleanValue("GetContactFlowResponse.Success"));
		getContactFlowResponse.setCode(context.stringValue("GetContactFlowResponse.Code"));
		getContactFlowResponse.setMessage(context.stringValue("GetContactFlowResponse.Message"));
		getContactFlowResponse.setHttpStatusCode(context.integerValue("GetContactFlowResponse.HttpStatusCode"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setContactFlowId(context.stringValue("GetContactFlowResponse.ContactFlow.ContactFlowId"));
		contactFlow.setInstanceId(context.stringValue("GetContactFlowResponse.ContactFlow.InstanceId"));
		contactFlow.setContactFlowName(context.stringValue("GetContactFlowResponse.ContactFlow.ContactFlowName"));
		contactFlow.setContactFlowDescription(context.stringValue("GetContactFlowResponse.ContactFlow.ContactFlowDescription"));
		contactFlow.setType(context.stringValue("GetContactFlowResponse.ContactFlow.Type"));

		List<ContactFlowVersion> versions = new ArrayList<ContactFlowVersion>();
		for (int i = 0; i < context.lengthValue("GetContactFlowResponse.ContactFlow.Versions.Length"); i++) {
			ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
			contactFlowVersion.setContactFlowVersionId(context.stringValue("GetContactFlowResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionId"));
			contactFlowVersion.setVersion(context.stringValue("GetContactFlowResponse.ContactFlow.Versions["+ i +"].Version"));
			contactFlowVersion.setContactFlowVersionDescription(context.stringValue("GetContactFlowResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionDescription"));
			contactFlowVersion.setCanvas(context.stringValue("GetContactFlowResponse.ContactFlow.Versions["+ i +"].Canvas"));
			contactFlowVersion.setContent(context.stringValue("GetContactFlowResponse.ContactFlow.Versions["+ i +"].Content"));
			contactFlowVersion.setLastModified(context.stringValue("GetContactFlowResponse.ContactFlow.Versions["+ i +"].LastModified"));
			contactFlowVersion.setLastModifiedBy(context.stringValue("GetContactFlowResponse.ContactFlow.Versions["+ i +"].LastModifiedBy"));
			contactFlowVersion.setStatus(context.stringValue("GetContactFlowResponse.ContactFlow.Versions["+ i +"].Status"));

			versions.add(contactFlowVersion);
		}
		contactFlow.setVersions(versions);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("GetContactFlowResponse.ContactFlow.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("GetContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("GetContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("GetContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("GetContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setRemainingTime(context.integerValue("GetContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setTrunks(context.integerValue("GetContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].Trunks"));

			phoneNumbers.add(phoneNumber);
		}
		contactFlow.setPhoneNumbers(phoneNumbers);
		getContactFlowResponse.setContactFlow(contactFlow);
	 
	 	return getContactFlowResponse;
	}
}