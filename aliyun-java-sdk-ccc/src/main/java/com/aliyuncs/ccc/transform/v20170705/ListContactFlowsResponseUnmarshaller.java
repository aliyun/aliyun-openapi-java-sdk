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

import com.aliyuncs.ccc.model.v20170705.ListContactFlowsResponse;
import com.aliyuncs.ccc.model.v20170705.ListContactFlowsResponse.ContactFlow;
import com.aliyuncs.ccc.model.v20170705.ListContactFlowsResponse.ContactFlow.ContactFlowVersion;
import com.aliyuncs.ccc.model.v20170705.ListContactFlowsResponse.ContactFlow.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListContactFlowsResponseUnmarshaller {

	public static ListContactFlowsResponse unmarshall(ListContactFlowsResponse listContactFlowsResponse, UnmarshallerContext _ctx) {
		
		listContactFlowsResponse.setRequestId(_ctx.stringValue("ListContactFlowsResponse.RequestId"));
		listContactFlowsResponse.setSuccess(_ctx.booleanValue("ListContactFlowsResponse.Success"));
		listContactFlowsResponse.setCode(_ctx.stringValue("ListContactFlowsResponse.Code"));
		listContactFlowsResponse.setMessage(_ctx.stringValue("ListContactFlowsResponse.Message"));
		listContactFlowsResponse.setHttpStatusCode(_ctx.integerValue("ListContactFlowsResponse.HttpStatusCode"));

		List<ContactFlow> contactFlows = new ArrayList<ContactFlow>();
		for (int i = 0; i < _ctx.lengthValue("ListContactFlowsResponse.ContactFlows.Length"); i++) {
			ContactFlow contactFlow = new ContactFlow();
			contactFlow.setContactFlowId(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].ContactFlowId"));
			contactFlow.setInstanceId(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].InstanceId"));
			contactFlow.setContactFlowName(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].ContactFlowName"));
			contactFlow.setContactFlowDescription(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].ContactFlowDescription"));
			contactFlow.setType(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Type"));
			contactFlow.setAppliedVersion(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].AppliedVersion"));

			List<ContactFlowVersion> versions = new ArrayList<ContactFlowVersion>();
			for (int j = 0; j < _ctx.lengthValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions.Length"); j++) {
				ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
				contactFlowVersion.setContactFlowVersionId(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].ContactFlowVersionId"));
				contactFlowVersion.setVersion(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].Version"));
				contactFlowVersion.setContactFlowVersionDescription(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].ContactFlowVersionDescription"));
				contactFlowVersion.setLastModified(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].LastModified"));
				contactFlowVersion.setLastModifiedBy(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].LastModifiedBy"));
				contactFlowVersion.setLockedBy(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].LockedBy"));
				contactFlowVersion.setStatus(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].Status"));

				versions.add(contactFlowVersion);
			}
			contactFlow.setVersions(versions);

			List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
			for (int j = 0; j < _ctx.lengthValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setPhoneNumberId(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].PhoneNumberId"));
				phoneNumber.setInstanceId(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].InstanceId"));
				phoneNumber.setNumber(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].Number"));
				phoneNumber.setPhoneNumberDescription(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].PhoneNumberDescription"));
				phoneNumber.setTestOnly(_ctx.booleanValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].TestOnly"));
				phoneNumber.setRemainingTime(_ctx.integerValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].RemainingTime"));
				phoneNumber.setAllowOutbound(_ctx.booleanValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].AllowOutbound"));
				phoneNumber.setUsage(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].Usage"));
				phoneNumber.setTrunks(_ctx.integerValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].Trunks"));

				phoneNumbers.add(phoneNumber);
			}
			contactFlow.setPhoneNumbers(phoneNumbers);

			contactFlows.add(contactFlow);
		}
		listContactFlowsResponse.setContactFlows(contactFlows);
	 
	 	return listContactFlowsResponse;
	}
}