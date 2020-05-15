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

import com.aliyuncs.hbr.model.v20170908.DescribeHanaAlertConfigResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeHanaAlertConfigResponse.Contact;
import com.aliyuncs.hbr.model.v20170908.DescribeHanaAlertConfigResponse.ContactGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHanaAlertConfigResponseUnmarshaller {

	public static DescribeHanaAlertConfigResponse unmarshall(DescribeHanaAlertConfigResponse describeHanaAlertConfigResponse, UnmarshallerContext _ctx) {
		
		describeHanaAlertConfigResponse.setRequestId(_ctx.stringValue("DescribeHanaAlertConfigResponse.RequestId"));
		describeHanaAlertConfigResponse.setSuccess(_ctx.booleanValue("DescribeHanaAlertConfigResponse.Success"));
		describeHanaAlertConfigResponse.setCode(_ctx.stringValue("DescribeHanaAlertConfigResponse.Code"));
		describeHanaAlertConfigResponse.setMessage(_ctx.stringValue("DescribeHanaAlertConfigResponse.Message"));
		describeHanaAlertConfigResponse.setAlertSetting(_ctx.stringValue("DescribeHanaAlertConfigResponse.AlertSetting"));

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHanaAlertConfigResponse.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setContactId(_ctx.stringValue("DescribeHanaAlertConfigResponse.Contacts["+ i +"].ContactId"));
			contact.setName(_ctx.stringValue("DescribeHanaAlertConfigResponse.Contacts["+ i +"].Name"));
			contact.setEmail(_ctx.stringValue("DescribeHanaAlertConfigResponse.Contacts["+ i +"].Email"));
			contact.setMobile(_ctx.stringValue("DescribeHanaAlertConfigResponse.Contacts["+ i +"].Mobile"));
			contact.setDescription(_ctx.stringValue("DescribeHanaAlertConfigResponse.Contacts["+ i +"].Description"));

			contacts.add(contact);
		}
		describeHanaAlertConfigResponse.setContacts(contacts);

		List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHanaAlertConfigResponse.ContactGroups.Length"); i++) {
			ContactGroup contactGroup = new ContactGroup();
			contactGroup.setContactGroupId(_ctx.stringValue("DescribeHanaAlertConfigResponse.ContactGroups["+ i +"].ContactGroupId"));
			contactGroup.setDisplayName(_ctx.stringValue("DescribeHanaAlertConfigResponse.ContactGroups["+ i +"].DisplayName"));

			contactGroups.add(contactGroup);
		}
		describeHanaAlertConfigResponse.setContactGroups(contactGroups);
	 
	 	return describeHanaAlertConfigResponse;
	}
}