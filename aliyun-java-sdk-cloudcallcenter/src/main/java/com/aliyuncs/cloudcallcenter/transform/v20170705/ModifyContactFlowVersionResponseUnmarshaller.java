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

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyContactFlowVersionResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyContactFlowVersionResponse.ContactFlow;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyContactFlowVersionResponse.ContactFlow.ContactFlowVersion;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyContactFlowVersionResponse.ContactFlow.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyContactFlowVersionResponseUnmarshaller {

	public static ModifyContactFlowVersionResponse unmarshall(ModifyContactFlowVersionResponse modifyContactFlowVersionResponse, UnmarshallerContext context) {
		
		modifyContactFlowVersionResponse.setRequestId(context.stringValue("ModifyContactFlowVersionResponse.RequestId"));
		modifyContactFlowVersionResponse.setSuccess(context.booleanValue("ModifyContactFlowVersionResponse.Success"));
		modifyContactFlowVersionResponse.setCode(context.stringValue("ModifyContactFlowVersionResponse.Code"));
		modifyContactFlowVersionResponse.setMessage(context.stringValue("ModifyContactFlowVersionResponse.Message"));
		modifyContactFlowVersionResponse.setHttpStatusCode(context.integerValue("ModifyContactFlowVersionResponse.HttpStatusCode"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setContactFlowId(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.ContactFlowId"));
		contactFlow.setInstanceId(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.InstanceId"));
		contactFlow.setContactFlowName(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.ContactFlowName"));
		contactFlow.setContactFlowDescription(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.ContactFlowDescription"));
		contactFlow.setType(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.Type"));

		List<ContactFlowVersion> versions = new ArrayList<ContactFlowVersion>();
		for (int i = 0; i < context.lengthValue("ModifyContactFlowVersionResponse.ContactFlow.Versions.Length"); i++) {
			ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
			contactFlowVersion.setContactFlowVersionId(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionId"));
			contactFlowVersion.setVersion(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.Versions["+ i +"].Version"));
			contactFlowVersion.setContactFlowVersionDescription(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionDescription"));
			contactFlowVersion.setCanvas(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.Versions["+ i +"].Canvas"));
			contactFlowVersion.setContent(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.Versions["+ i +"].Content"));
			contactFlowVersion.setLastModified(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.Versions["+ i +"].LastModified"));
			contactFlowVersion.setLastModifiedBy(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.Versions["+ i +"].LastModifiedBy"));
			contactFlowVersion.setStatus(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.Versions["+ i +"].Status"));

			versions.add(contactFlowVersion);
		}
		contactFlow.setVersions(versions);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("ModifyContactFlowVersionResponse.ContactFlow.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("ModifyContactFlowVersionResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setRemainingTime(context.integerValue("ModifyContactFlowVersionResponse.ContactFlow.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setTrunks(context.integerValue("ModifyContactFlowVersionResponse.ContactFlow.PhoneNumbers["+ i +"].Trunks"));

			phoneNumbers.add(phoneNumber);
		}
		contactFlow.setPhoneNumbers(phoneNumbers);
		modifyContactFlowVersionResponse.setContactFlow(contactFlow);
	 
	 	return modifyContactFlowVersionResponse;
	}
}