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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListUnreachableContactsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListUnreachableContactsResponse.UnreachableContacts;
import com.aliyuncs.outboundbot.model.v20191226.ListUnreachableContactsResponse.UnreachableContacts.UnreachableContact;
import com.aliyuncs.outboundbot.model.v20191226.ListUnreachableContactsResponse.UnreachableContacts.UnreachableContact.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUnreachableContactsResponseUnmarshaller {

	public static ListUnreachableContactsResponse unmarshall(ListUnreachableContactsResponse listUnreachableContactsResponse, UnmarshallerContext _ctx) {
		
		listUnreachableContactsResponse.setRequestId(_ctx.stringValue("ListUnreachableContactsResponse.RequestId"));
		listUnreachableContactsResponse.setSuccess(_ctx.booleanValue("ListUnreachableContactsResponse.Success"));
		listUnreachableContactsResponse.setCode(_ctx.stringValue("ListUnreachableContactsResponse.Code"));
		listUnreachableContactsResponse.setMessage(_ctx.stringValue("ListUnreachableContactsResponse.Message"));
		listUnreachableContactsResponse.setHttpStatusCode(_ctx.integerValue("ListUnreachableContactsResponse.HttpStatusCode"));

		UnreachableContacts unreachableContacts = new UnreachableContacts();
		unreachableContacts.setTotalCount(_ctx.integerValue("ListUnreachableContactsResponse.UnreachableContacts.TotalCount"));
		unreachableContacts.setPageNumber(_ctx.integerValue("ListUnreachableContactsResponse.UnreachableContacts.PageNumber"));
		unreachableContacts.setPageSize(_ctx.integerValue("ListUnreachableContactsResponse.UnreachableContacts.PageSize"));

		List<UnreachableContact> list = new ArrayList<UnreachableContact>();
		for (int i = 0; i < _ctx.lengthValue("ListUnreachableContactsResponse.UnreachableContacts.List.Length"); i++) {
			UnreachableContact unreachableContact = new UnreachableContact();
			unreachableContact.setTotalAttempts(_ctx.integerValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].TotalAttempts"));

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < _ctx.lengthValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(_ctx.stringValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setContactName(_ctx.stringValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setRole(_ctx.stringValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts["+ j +"].Role"));
				contact.setPhoneNumber(_ctx.stringValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts["+ j +"].PhoneNumber"));
				contact.setState(_ctx.stringValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts["+ j +"].State"));
				contact.setReferenceId(_ctx.stringValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts["+ j +"].ReferenceId"));

				contacts.add(contact);
			}
			unreachableContact.setContacts(contacts);

			list.add(unreachableContact);
		}
		unreachableContacts.setList(list);
		listUnreachableContactsResponse.setUnreachableContacts(unreachableContacts);
	 
	 	return listUnreachableContactsResponse;
	}
}