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

package com.aliyuncs.mscopensubscription.transform.v20210713;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mscopensubscription.model.v20210713.ListContactsResponse;
import com.aliyuncs.mscopensubscription.model.v20210713.ListContactsResponse.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListContactsResponseUnmarshaller {

	public static ListContactsResponse unmarshall(ListContactsResponse listContactsResponse, UnmarshallerContext _ctx) {
		
		listContactsResponse.setRequestId(_ctx.stringValue("ListContactsResponse.RequestId"));
		listContactsResponse.setTotalCount(_ctx.integerValue("ListContactsResponse.TotalCount"));
		listContactsResponse.setNextToken(_ctx.integerValue("ListContactsResponse.NextToken"));
		listContactsResponse.setSuccess(_ctx.booleanValue("ListContactsResponse.Success"));
		listContactsResponse.setCode(_ctx.stringValue("ListContactsResponse.Code"));
		listContactsResponse.setMessage(_ctx.stringValue("ListContactsResponse.Message"));

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("ListContactsResponse.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setLastMobileVerificationTimeStamp(_ctx.longValue("ListContactsResponse.Contacts["+ i +"].LastMobileVerificationTimeStamp"));
			contact.setEmail(_ctx.stringValue("ListContactsResponse.Contacts["+ i +"].Email"));
			contact.setLastEmailVerificationTimeStamp(_ctx.longValue("ListContactsResponse.Contacts["+ i +"].LastEmailVerificationTimeStamp"));
			contact.setContactId(_ctx.longValue("ListContactsResponse.Contacts["+ i +"].ContactId"));
			contact.setContactName(_ctx.stringValue("ListContactsResponse.Contacts["+ i +"].ContactName"));
			contact.setIsVerifiedEmail(_ctx.booleanValue("ListContactsResponse.Contacts["+ i +"].IsVerifiedEmail"));
			contact.setIsObsolete(_ctx.booleanValue("ListContactsResponse.Contacts["+ i +"].IsObsolete"));
			contact.setPosition(_ctx.stringValue("ListContactsResponse.Contacts["+ i +"].Position"));
			contact.setAccountUid(_ctx.longValue("ListContactsResponse.Contacts["+ i +"].AccountUid"));
			contact.setMobile(_ctx.stringValue("ListContactsResponse.Contacts["+ i +"].Mobile"));
			contact.setIsAccount(_ctx.booleanValue("ListContactsResponse.Contacts["+ i +"].IsAccount"));
			contact.setIsVerifiedMobile(_ctx.booleanValue("ListContactsResponse.Contacts["+ i +"].IsVerifiedMobile"));

			contacts.add(contact);
		}
		listContactsResponse.setContacts(contacts);
	 
	 	return listContactsResponse;
	}
}