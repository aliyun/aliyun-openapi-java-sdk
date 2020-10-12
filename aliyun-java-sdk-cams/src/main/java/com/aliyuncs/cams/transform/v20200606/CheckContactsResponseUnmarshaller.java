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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.CheckContactsResponse;
import com.aliyuncs.cams.model.v20200606.CheckContactsResponse.ContactStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckContactsResponseUnmarshaller {

	public static CheckContactsResponse unmarshall(CheckContactsResponse checkContactsResponse, UnmarshallerContext _ctx) {
		
		checkContactsResponse.setRequestId(_ctx.stringValue("CheckContactsResponse.RequestId"));
		checkContactsResponse.setResultCode(_ctx.stringValue("CheckContactsResponse.ResultCode"));
		checkContactsResponse.setResultMessage(_ctx.stringValue("CheckContactsResponse.ResultMessage"));

		List<ContactStatus> contacts = new ArrayList<ContactStatus>();
		for (int i = 0; i < _ctx.lengthValue("CheckContactsResponse.Contacts.Length"); i++) {
			ContactStatus contactStatus = new ContactStatus();
			contactStatus.setPhoneNumber(_ctx.stringValue("CheckContactsResponse.Contacts["+ i +"].PhoneNumber"));
			contactStatus.setStatus(_ctx.stringValue("CheckContactsResponse.Contacts["+ i +"].Status"));

			contacts.add(contactStatus);
		}
		checkContactsResponse.setContacts(contacts);
	 
	 	return checkContactsResponse;
	}
}