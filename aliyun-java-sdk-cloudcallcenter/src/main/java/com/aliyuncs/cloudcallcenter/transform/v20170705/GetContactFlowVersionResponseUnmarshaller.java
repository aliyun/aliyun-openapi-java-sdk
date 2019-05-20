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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetContactFlowVersionResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetContactFlowVersionResponse.ContactFlow;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetContactFlowVersionResponse.ContactFlow.ContactFlowVersion;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetContactFlowVersionResponse.ContactFlow.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContactFlowVersionResponseUnmarshaller {

	public static GetContactFlowVersionResponse unmarshall(GetContactFlowVersionResponse getContactFlowVersionResponse, UnmarshallerContext context) {
		
		getContactFlowVersionResponse.setRequestId(context.stringValue("GetContactFlowVersionResponse.RequestId"));
		getContactFlowVersionResponse.setSuccess(context.booleanValue("GetContactFlowVersionResponse.Success"));
		getContactFlowVersionResponse.setCode(context.stringValue("GetContactFlowVersionResponse.Code"));
		getContactFlowVersionResponse.setMessage(context.stringValue("GetContactFlowVersionResponse.Message"));
		getContactFlowVersionResponse.setHttpStatusCode(context.integerValue("GetContactFlowVersionResponse.HttpStatusCode"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setContactFlowId(context.stringValue("GetContactFlowVersionResponse.ContactFlow.ContactFlowId"));
		contactFlow.setInstanceId(context.stringValue("GetContactFlowVersionResponse.ContactFlow.InstanceId"));
		contactFlow.setContactFlowName(context.stringValue("GetContactFlowVersionResponse.ContactFlow.ContactFlowName"));
		contactFlow.setContactFlowDescription(context.stringValue("GetContactFlowVersionResponse.ContactFlow.ContactFlowDescription"));
		contactFlow.setType(context.stringValue("GetContactFlowVersionResponse.ContactFlow.Type"));

		List<ContactFlowVersion> versions = new ArrayList<ContactFlowVersion>();
		for (int i = 0; i < context.lengthValue("GetContactFlowVersionResponse.ContactFlow.Versions.Length"); i++) {
			ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
			contactFlowVersion.setContactFlowVersionId(context.stringValue("GetContactFlowVersionResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionId"));
			contactFlowVersion.setVersion(context.stringValue("GetContactFlowVersionResponse.ContactFlow.Versions["+ i +"].Version"));
			contactFlowVersion.setContactFlowVersionDescription(context.stringValue("GetContactFlowVersionResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionDescription"));
			contactFlowVersion.setCanvas(context.stringValue("GetContactFlowVersionResponse.ContactFlow.Versions["+ i +"].Canvas"));
			contactFlowVersion.setContent(context.stringValue("GetContactFlowVersionResponse.ContactFlow.Versions["+ i +"].Content"));
			contactFlowVersion.setLastModified(context.stringValue("GetContactFlowVersionResponse.ContactFlow.Versions["+ i +"].LastModified"));
			contactFlowVersion.setLastModifiedBy(context.stringValue("GetContactFlowVersionResponse.ContactFlow.Versions["+ i +"].LastModifiedBy"));
			contactFlowVersion.setStatus(context.stringValue("GetContactFlowVersionResponse.ContactFlow.Versions["+ i +"].Status"));

			versions.add(contactFlowVersion);
		}
		contactFlow.setVersions(versions);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("GetContactFlowVersionResponse.ContactFlow.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("GetContactFlowVersionResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("GetContactFlowVersionResponse.ContactFlow.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("GetContactFlowVersionResponse.ContactFlow.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("GetContactFlowVersionResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setRemainingTime(context.integerValue("GetContactFlowVersionResponse.ContactFlow.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setTrunks(context.integerValue("GetContactFlowVersionResponse.ContactFlow.PhoneNumbers["+ i +"].Trunks"));

			phoneNumbers.add(phoneNumber);
		}
		contactFlow.setPhoneNumbers(phoneNumbers);
		getContactFlowVersionResponse.setContactFlow(contactFlow);
	 
	 	return getContactFlowVersionResponse;
	}
}