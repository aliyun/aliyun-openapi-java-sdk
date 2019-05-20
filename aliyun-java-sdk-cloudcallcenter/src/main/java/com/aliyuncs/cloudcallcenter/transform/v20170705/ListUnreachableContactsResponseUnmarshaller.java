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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListUnreachableContactsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListUnreachableContactsResponse.UnreachableContacts;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListUnreachableContactsResponse.UnreachableContacts.UnreachableContact;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListUnreachableContactsResponse.UnreachableContacts.UnreachableContact.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUnreachableContactsResponseUnmarshaller {

	public static ListUnreachableContactsResponse unmarshall(ListUnreachableContactsResponse listUnreachableContactsResponse, UnmarshallerContext context) {
		
		listUnreachableContactsResponse.setRequestId(context.stringValue("ListUnreachableContactsResponse.RequestId"));
		listUnreachableContactsResponse.setSuccess(context.booleanValue("ListUnreachableContactsResponse.Success"));
		listUnreachableContactsResponse.setCode(context.stringValue("ListUnreachableContactsResponse.Code"));
		listUnreachableContactsResponse.setMessage(context.stringValue("ListUnreachableContactsResponse.Message"));
		listUnreachableContactsResponse.setHttpStatusCode(context.integerValue("ListUnreachableContactsResponse.HttpStatusCode"));

		UnreachableContacts unreachableContacts = new UnreachableContacts();
		unreachableContacts.setTotalCount(context.integerValue("ListUnreachableContactsResponse.UnreachableContacts.TotalCount"));
		unreachableContacts.setPageNumber(context.integerValue("ListUnreachableContactsResponse.UnreachableContacts.PageNumber"));
		unreachableContacts.setPageSize(context.integerValue("ListUnreachableContactsResponse.UnreachableContacts.PageSize"));

		List<UnreachableContact> list = new ArrayList<UnreachableContact>();
		for (int i = 0; i < context.lengthValue("ListUnreachableContactsResponse.UnreachableContacts.List.Length"); i++) {
			UnreachableContact unreachableContact = new UnreachableContact();
			unreachableContact.setTotalAttempts(context.integerValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].TotalAttempts"));

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < context.lengthValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(context.stringValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setContactName(context.stringValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setRole(context.stringValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts["+ j +"].Role"));
				contact.setPhoneNumber(context.stringValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts["+ j +"].PhoneNumber"));
				contact.setState(context.stringValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts["+ j +"].State"));
				contact.setReferenceId(context.stringValue("ListUnreachableContactsResponse.UnreachableContacts.List["+ i +"].Contacts["+ j +"].ReferenceId"));

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