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

import com.aliyuncs.hbr.model.v20170908.DescribeAlertConfigResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeAlertConfigResponse.Contact;
import com.aliyuncs.hbr.model.v20170908.DescribeAlertConfigResponse.ContactGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertConfigResponseUnmarshaller {

	public static DescribeAlertConfigResponse unmarshall(DescribeAlertConfigResponse describeAlertConfigResponse, UnmarshallerContext _ctx) {
		
		describeAlertConfigResponse.setRequestId(_ctx.stringValue("DescribeAlertConfigResponse.RequestId"));
		describeAlertConfigResponse.setSuccess(_ctx.booleanValue("DescribeAlertConfigResponse.Success"));
		describeAlertConfigResponse.setCode(_ctx.stringValue("DescribeAlertConfigResponse.Code"));
		describeAlertConfigResponse.setMessage(_ctx.stringValue("DescribeAlertConfigResponse.Message"));
		describeAlertConfigResponse.setAlertSetting(_ctx.stringValue("DescribeAlertConfigResponse.AlertSetting"));

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertConfigResponse.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setContactId(_ctx.stringValue("DescribeAlertConfigResponse.Contacts["+ i +"].ContactId"));
			contact.setName(_ctx.stringValue("DescribeAlertConfigResponse.Contacts["+ i +"].Name"));
			contact.setEmail(_ctx.stringValue("DescribeAlertConfigResponse.Contacts["+ i +"].Email"));
			contact.setMobile(_ctx.stringValue("DescribeAlertConfigResponse.Contacts["+ i +"].Mobile"));
			contact.setDescription(_ctx.stringValue("DescribeAlertConfigResponse.Contacts["+ i +"].Description"));

			contacts.add(contact);
		}
		describeAlertConfigResponse.setContacts(contacts);

		List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertConfigResponse.ContactGroups.Length"); i++) {
			ContactGroup contactGroup = new ContactGroup();
			contactGroup.setContactGroupId(_ctx.stringValue("DescribeAlertConfigResponse.ContactGroups["+ i +"].ContactGroupId"));
			contactGroup.setDisplayName(_ctx.stringValue("DescribeAlertConfigResponse.ContactGroups["+ i +"].DisplayName"));

			contactGroups.add(contactGroup);
		}
		describeAlertConfigResponse.setContactGroups(contactGroups);
	 
	 	return describeAlertConfigResponse;
	}
}