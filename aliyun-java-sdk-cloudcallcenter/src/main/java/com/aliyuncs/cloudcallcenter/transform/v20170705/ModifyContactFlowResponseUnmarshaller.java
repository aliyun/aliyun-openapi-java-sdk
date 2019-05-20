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

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyContactFlowResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyContactFlowResponse.ContactFlow;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyContactFlowResponse.ContactFlow.ContactFlowVersion;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyContactFlowResponse.ContactFlow.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyContactFlowResponseUnmarshaller {

	public static ModifyContactFlowResponse unmarshall(ModifyContactFlowResponse modifyContactFlowResponse, UnmarshallerContext context) {
		
		modifyContactFlowResponse.setRequestId(context.stringValue("ModifyContactFlowResponse.RequestId"));
		modifyContactFlowResponse.setSuccess(context.booleanValue("ModifyContactFlowResponse.Success"));
		modifyContactFlowResponse.setCode(context.stringValue("ModifyContactFlowResponse.Code"));
		modifyContactFlowResponse.setMessage(context.stringValue("ModifyContactFlowResponse.Message"));
		modifyContactFlowResponse.setHttpStatusCode(context.integerValue("ModifyContactFlowResponse.HttpStatusCode"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setContactFlowId(context.stringValue("ModifyContactFlowResponse.ContactFlow.ContactFlowId"));
		contactFlow.setInstanceId(context.stringValue("ModifyContactFlowResponse.ContactFlow.InstanceId"));
		contactFlow.setContactFlowName(context.stringValue("ModifyContactFlowResponse.ContactFlow.ContactFlowName"));
		contactFlow.setContactFlowDescription(context.stringValue("ModifyContactFlowResponse.ContactFlow.ContactFlowDescription"));
		contactFlow.setType(context.stringValue("ModifyContactFlowResponse.ContactFlow.Type"));
		contactFlow.setAppliedVersion(context.stringValue("ModifyContactFlowResponse.ContactFlow.AppliedVersion"));

		List<ContactFlowVersion> versions = new ArrayList<ContactFlowVersion>();
		for (int i = 0; i < context.lengthValue("ModifyContactFlowResponse.ContactFlow.Versions.Length"); i++) {
			ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
			contactFlowVersion.setContactFlowVersionId(context.stringValue("ModifyContactFlowResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionId"));
			contactFlowVersion.setVersion(context.stringValue("ModifyContactFlowResponse.ContactFlow.Versions["+ i +"].Version"));
			contactFlowVersion.setContactFlowVersionDescription(context.stringValue("ModifyContactFlowResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionDescription"));
			contactFlowVersion.setLastModified(context.stringValue("ModifyContactFlowResponse.ContactFlow.Versions["+ i +"].LastModified"));
			contactFlowVersion.setLastModifiedBy(context.stringValue("ModifyContactFlowResponse.ContactFlow.Versions["+ i +"].LastModifiedBy"));
			contactFlowVersion.setLockedBy(context.stringValue("ModifyContactFlowResponse.ContactFlow.Versions["+ i +"].LockedBy"));
			contactFlowVersion.setStatus(context.stringValue("ModifyContactFlowResponse.ContactFlow.Versions["+ i +"].Status"));

			versions.add(contactFlowVersion);
		}
		contactFlow.setVersions(versions);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("ModifyContactFlowResponse.ContactFlow.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("ModifyContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("ModifyContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("ModifyContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("ModifyContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(context.booleanValue("ModifyContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(context.integerValue("ModifyContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(context.booleanValue("ModifyContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(context.stringValue("ModifyContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(context.integerValue("ModifyContactFlowResponse.ContactFlow.PhoneNumbers["+ i +"].Trunks"));

			phoneNumbers.add(phoneNumber);
		}
		contactFlow.setPhoneNumbers(phoneNumbers);
		modifyContactFlowResponse.setContactFlow(contactFlow);
	 
	 	return modifyContactFlowResponse;
	}
}