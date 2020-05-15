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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeContactGroupsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeContactGroupsResponse.ContactGroup;
import com.aliyuncs.hbr.model.v20170908.DescribeContactGroupsResponse.ContactGroup.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContactGroupsResponseUnmarshaller {

	public static DescribeContactGroupsResponse unmarshall(DescribeContactGroupsResponse describeContactGroupsResponse, UnmarshallerContext _ctx) {
		
		describeContactGroupsResponse.setRequestId(_ctx.stringValue("DescribeContactGroupsResponse.RequestId"));
		describeContactGroupsResponse.setSuccess(_ctx.booleanValue("DescribeContactGroupsResponse.Success"));
		describeContactGroupsResponse.setCode(_ctx.stringValue("DescribeContactGroupsResponse.Code"));
		describeContactGroupsResponse.setMessage(_ctx.stringValue("DescribeContactGroupsResponse.Message"));
		describeContactGroupsResponse.setTotalCount(_ctx.integerValue("DescribeContactGroupsResponse.TotalCount"));
		describeContactGroupsResponse.setPageSize(_ctx.integerValue("DescribeContactGroupsResponse.PageSize"));
		describeContactGroupsResponse.setPageNumber(_ctx.integerValue("DescribeContactGroupsResponse.PageNumber"));

		List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeContactGroupsResponse.ContactGroups.Length"); i++) {
			ContactGroup contactGroup = new ContactGroup();
			contactGroup.setContactGroupId(_ctx.stringValue("DescribeContactGroupsResponse.ContactGroups["+ i +"].ContactGroupId"));
			contactGroup.setDisplayName(_ctx.stringValue("DescribeContactGroupsResponse.ContactGroups["+ i +"].DisplayName"));

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < _ctx.lengthValue("DescribeContactGroupsResponse.ContactGroups["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(_ctx.stringValue("DescribeContactGroupsResponse.ContactGroups["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setName(_ctx.stringValue("DescribeContactGroupsResponse.ContactGroups["+ i +"].Contacts["+ j +"].Name"));
				contact.setEmail(_ctx.stringValue("DescribeContactGroupsResponse.ContactGroups["+ i +"].Contacts["+ j +"].Email"));
				contact.setMobile(_ctx.stringValue("DescribeContactGroupsResponse.ContactGroups["+ i +"].Contacts["+ j +"].Mobile"));
				contact.setDescription(_ctx.stringValue("DescribeContactGroupsResponse.ContactGroups["+ i +"].Contacts["+ j +"].Description"));

				contacts.add(contact);
			}
			contactGroup.setContacts(contacts);

			contactGroups.add(contactGroup);
		}
		describeContactGroupsResponse.setContactGroups(contactGroups);
	 
	 	return describeContactGroupsResponse;
	}
}