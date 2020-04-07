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

import com.aliyuncs.hbr.model.v20170908.DescribeClientAlertConfigResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeClientAlertConfigResponse.Contact;
import com.aliyuncs.hbr.model.v20170908.DescribeClientAlertConfigResponse.ContactGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClientAlertConfigResponseUnmarshaller {

	public static DescribeClientAlertConfigResponse unmarshall(DescribeClientAlertConfigResponse describeClientAlertConfigResponse, UnmarshallerContext _ctx) {
		
		describeClientAlertConfigResponse.setRequestId(_ctx.stringValue("DescribeClientAlertConfigResponse.RequestId"));
		describeClientAlertConfigResponse.setSuccess(_ctx.booleanValue("DescribeClientAlertConfigResponse.Success"));
		describeClientAlertConfigResponse.setCode(_ctx.stringValue("DescribeClientAlertConfigResponse.Code"));
		describeClientAlertConfigResponse.setMessage(_ctx.stringValue("DescribeClientAlertConfigResponse.Message"));
		describeClientAlertConfigResponse.setAlertSetting(_ctx.stringValue("DescribeClientAlertConfigResponse.AlertSetting"));

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClientAlertConfigResponse.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setContactId(_ctx.stringValue("DescribeClientAlertConfigResponse.Contacts["+ i +"].ContactId"));
			contact.setName(_ctx.stringValue("DescribeClientAlertConfigResponse.Contacts["+ i +"].Name"));
			contact.setEmail(_ctx.stringValue("DescribeClientAlertConfigResponse.Contacts["+ i +"].Email"));
			contact.setMobile(_ctx.stringValue("DescribeClientAlertConfigResponse.Contacts["+ i +"].Mobile"));
			contact.setDescription(_ctx.stringValue("DescribeClientAlertConfigResponse.Contacts["+ i +"].Description"));

			contacts.add(contact);
		}
		describeClientAlertConfigResponse.setContacts(contacts);

		List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClientAlertConfigResponse.ContactGroups.Length"); i++) {
			ContactGroup contactGroup = new ContactGroup();
			contactGroup.setContactGroupId(_ctx.stringValue("DescribeClientAlertConfigResponse.ContactGroups["+ i +"].ContactGroupId"));
			contactGroup.setDisplayName(_ctx.stringValue("DescribeClientAlertConfigResponse.ContactGroups["+ i +"].DisplayName"));

			contactGroups.add(contactGroup);
		}
		describeClientAlertConfigResponse.setContactGroups(contactGroups);
	 
	 	return describeClientAlertConfigResponse;
	}
}