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

import com.aliyuncs.cloudcallcenter.model.v20170705.BeginContactFlowVersionModificationResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.BeginContactFlowVersionModificationResponse.ContactFlow;
import com.aliyuncs.cloudcallcenter.model.v20170705.BeginContactFlowVersionModificationResponse.ContactFlow.ContactFlowVersion;
import com.aliyuncs.cloudcallcenter.model.v20170705.BeginContactFlowVersionModificationResponse.ContactFlow.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class BeginContactFlowVersionModificationResponseUnmarshaller {

	public static BeginContactFlowVersionModificationResponse unmarshall(BeginContactFlowVersionModificationResponse beginContactFlowVersionModificationResponse, UnmarshallerContext context) {
		
		beginContactFlowVersionModificationResponse.setRequestId(context.stringValue("BeginContactFlowVersionModificationResponse.RequestId"));
		beginContactFlowVersionModificationResponse.setSuccess(context.booleanValue("BeginContactFlowVersionModificationResponse.Success"));
		beginContactFlowVersionModificationResponse.setCode(context.stringValue("BeginContactFlowVersionModificationResponse.Code"));
		beginContactFlowVersionModificationResponse.setMessage(context.stringValue("BeginContactFlowVersionModificationResponse.Message"));
		beginContactFlowVersionModificationResponse.setHttpStatusCode(context.integerValue("BeginContactFlowVersionModificationResponse.HttpStatusCode"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setContactFlowId(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.ContactFlowId"));
		contactFlow.setInstanceId(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.InstanceId"));
		contactFlow.setContactFlowName(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.ContactFlowName"));
		contactFlow.setContactFlowDescription(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.ContactFlowDescription"));
		contactFlow.setType(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.Type"));
		contactFlow.setAppliedVersion(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.AppliedVersion"));

		List<ContactFlowVersion> versions = new ArrayList<ContactFlowVersion>();
		for (int i = 0; i < context.lengthValue("BeginContactFlowVersionModificationResponse.ContactFlow.Versions.Length"); i++) {
			ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
			contactFlowVersion.setContactFlowVersionId(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionId"));
			contactFlowVersion.setVersion(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.Versions["+ i +"].Version"));
			contactFlowVersion.setContactFlowVersionDescription(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionDescription"));
			contactFlowVersion.setCanvas(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.Versions["+ i +"].Canvas"));
			contactFlowVersion.setContent(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.Versions["+ i +"].Content"));
			contactFlowVersion.setLastModified(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.Versions["+ i +"].LastModified"));
			contactFlowVersion.setLastModifiedBy(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.Versions["+ i +"].LastModifiedBy"));
			contactFlowVersion.setStatus(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.Versions["+ i +"].Status"));

			versions.add(contactFlowVersion);
		}
		contactFlow.setVersions(versions);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("BeginContactFlowVersionModificationResponse.ContactFlow.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("BeginContactFlowVersionModificationResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setRemainingTime(context.integerValue("BeginContactFlowVersionModificationResponse.ContactFlow.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setTrunks(context.integerValue("BeginContactFlowVersionModificationResponse.ContactFlow.PhoneNumbers["+ i +"].Trunks"));

			phoneNumbers.add(phoneNumber);
		}
		contactFlow.setPhoneNumbers(phoneNumbers);
		beginContactFlowVersionModificationResponse.setContactFlow(contactFlow);
	 
	 	return beginContactFlowVersionModificationResponse;
	}
}