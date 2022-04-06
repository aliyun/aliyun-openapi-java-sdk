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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.SearchAlertContactGroupResponse;
import com.aliyuncs.arms.model.v20190808.SearchAlertContactGroupResponse.ContactGroup;
import com.aliyuncs.arms.model.v20190808.SearchAlertContactGroupResponse.ContactGroup.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchAlertContactGroupResponseUnmarshaller {

	public static SearchAlertContactGroupResponse unmarshall(SearchAlertContactGroupResponse searchAlertContactGroupResponse, UnmarshallerContext _ctx) {
		
		searchAlertContactGroupResponse.setRequestId(_ctx.stringValue("SearchAlertContactGroupResponse.RequestId"));

		List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();
		for (int i = 0; i < _ctx.lengthValue("SearchAlertContactGroupResponse.ContactGroups.Length"); i++) {
			ContactGroup contactGroup = new ContactGroup();
			contactGroup.setUpdateTime(_ctx.longValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].UpdateTime"));
			contactGroup.setContactGroupName(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].ContactGroupName"));
			contactGroup.setContactGroupId(_ctx.longValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].ContactGroupId"));
			contactGroup.setCreateTime(_ctx.longValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].CreateTime"));
			contactGroup.setUserId(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].UserId"));

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < _ctx.lengthValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setUpdateTime(_ctx.longValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].UpdateTime"));
				contact.setDingRobot(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].DingRobot"));
				contact.setEmail(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].Email"));
				contact.setContactId(_ctx.longValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setCreateTime(_ctx.longValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].CreateTime"));
				contact.setUserId(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].UserId"));
				contact.setContactName(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setSystemNoc(_ctx.booleanValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].SystemNoc"));
				contact.setPhone(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].Phone"));

				contacts.add(contact);
			}
			contactGroup.setContacts(contacts);

			contactGroups.add(contactGroup);
		}
		searchAlertContactGroupResponse.setContactGroups(contactGroups);
	 
	 	return searchAlertContactGroupResponse;
	}
}