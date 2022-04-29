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

	public static ListVoiceAppraiseResponse unmarshall(ListVoiceAppraiseResponse listVoiceAppraiseResponse, UnmarshallerContext _ctx) {
		
		listVoiceAppraiseResponse.setRequestId(_ctx.stringValue("ListVoiceAppraiseResponse.RequestId"));
		listVoiceAppraiseResponse.setHttpStatusCode(_ctx.integerValue("ListVoiceAppraiseResponse.HttpStatusCode"));
		listVoiceAppraiseResponse.setSuccess(_ctx.booleanValue("ListVoiceAppraiseResponse.Success"));
		listVoiceAppraiseResponse.setNotice(_ctx.stringValue("ListVoiceAppraiseResponse.Notice"));
		listVoiceAppraiseResponse.setCode(_ctx.stringValue("ListVoiceAppraiseResponse.Code"));
		listVoiceAppraiseResponse.setMessage(_ctx.stringValue("ListVoiceAppraiseResponse.Message"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setContactFlowDescription(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.ContactFlowDescription"));
		contactFlow.setType(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.Type"));
		contactFlow.setContactFlowName(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.ContactFlowName"));
		contactFlow.setInstanceId(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.InstanceId"));
		contactFlow.setContactFlowId(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.ContactFlowId"));
		contactFlow.setAppliedVersion(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.AppliedVersion"));

		List<ContactFlowVersion> versions = new ArrayList<ContactFlowVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListVoiceAppraiseResponse.ContactFlow.Versions.Length"); i++) {
			ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
			contactFlowVersion.setStatus(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].Status"));
			contactFlowVersion.setLastModified(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].LastModified"));
			contactFlowVersion.setVersion(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].Version"));
			contactFlowVersion.setContactFlowVersionId(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionId"));
			contactFlowVersion.setContactFlowVersionDescription(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionDescription"));
			contactFlowVersion.setLastModifiedBy(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].LastModifiedBy"));
			contactFlowVersion.setContent(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.Versions["+ i +"].Content"));

			versions.add(contactFlowVersion);
		}
		contactFlow.setVersions(versions);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setTrunks(_ctx.integerValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers["+ i +"].Trunks"));
			phoneNumber.setNumber(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setRemainingTime(_ctx.integerValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setInstanceId(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setPhoneNumberDescription(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setPhoneNumberId(_ctx.stringValue("ListVoiceAppraiseResponse.ContactFlow.PhoneNumbers["+ i +"].PhoneNumberId"));

			phoneNumbers.add(phoneNumber);
		}
		contactFlow.setPhoneNumbers(phoneNumbers);
		listVoiceAppraiseResponse.setContactFlow(contactFlow);
	 
	 	return listVoiceAppraiseResponse;
	}
}