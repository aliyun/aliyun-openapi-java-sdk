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
		listContactFlowsResponse.setHttpStatusCode(_ctx.integerValue("ListContactFlowsResponse.HttpStatusCode"));
		listContactFlowsResponse.setCode(_ctx.stringValue("ListContactFlowsResponse.Code"));
		listContactFlowsResponse.setMessage(_ctx.stringValue("ListContactFlowsResponse.Message"));
		listContactFlowsResponse.setSuccess(_ctx.booleanValue("ListContactFlowsResponse.Success"));

		List<ContactFlow> contactFlows = new ArrayList<ContactFlow>();
		for (int i = 0; i < _ctx.lengthValue("ListContactFlowsResponse.ContactFlows.Length"); i++) {
			ContactFlow contactFlow = new ContactFlow();
			contactFlow.setContactFlowDescription(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].ContactFlowDescription"));
			contactFlow.setType(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Type"));
			contactFlow.setContactFlowName(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].ContactFlowName"));
			contactFlow.setInstanceId(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].InstanceId"));
			contactFlow.setContactFlowId(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].ContactFlowId"));
			contactFlow.setAppliedVersion(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].AppliedVersion"));

			List<ContactFlowVersion> versions = new ArrayList<ContactFlowVersion>();
			for (int j = 0; j < _ctx.lengthValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions.Length"); j++) {
				ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
				contactFlowVersion.setStatus(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].Status"));
				contactFlowVersion.setLastModified(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].LastModified"));
				contactFlowVersion.setLockedBy(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].LockedBy"));
				contactFlowVersion.setVersion(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].Version"));
				contactFlowVersion.setContactFlowVersionId(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].ContactFlowVersionId"));
				contactFlowVersion.setContactFlowVersionDescription(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].ContactFlowVersionDescription"));
				contactFlowVersion.setLastModifiedBy(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].LastModifiedBy"));

				versions.add(contactFlowVersion);
			}
			contactFlow.setVersions(versions);

			List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
			for (int j = 0; j < _ctx.lengthValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setTestOnly(_ctx.booleanValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].TestOnly"));
				phoneNumber.setTrunks(_ctx.integerValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].Trunks"));
				phoneNumber.setRemainingTime(_ctx.integerValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].RemainingTime"));
				phoneNumber.setNumber(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].Number"));
				phoneNumber.setInstanceId(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].InstanceId"));
				phoneNumber.setUsage(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].Usage"));
				phoneNumber.setAllowOutbound(_ctx.booleanValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].AllowOutbound"));
				phoneNumber.setPhoneNumberDescription(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].PhoneNumberDescription"));
				phoneNumber.setPhoneNumberId(_ctx.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].PhoneNumberId"));

				phoneNumbers.add(phoneNumber);
			}
			contactFlow.setPhoneNumbers(phoneNumbers);

			contactFlows.add(contactFlow);
		}
		listContactFlowsResponse.setContactFlows(contactFlows);
	 
	 	return listContactFlowsResponse;
	}
}