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

import com.aliyuncs.hbr.model.v20170908.DescribeVaultAlertConfigResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeVaultAlertConfigResponse.Contact;
import com.aliyuncs.hbr.model.v20170908.DescribeVaultAlertConfigResponse.ContactGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVaultAlertConfigResponseUnmarshaller {

	public static DescribeVaultAlertConfigResponse unmarshall(DescribeVaultAlertConfigResponse describeVaultAlertConfigResponse, UnmarshallerContext _ctx) {
		
		describeVaultAlertConfigResponse.setRequestId(_ctx.stringValue("DescribeVaultAlertConfigResponse.RequestId"));
		describeVaultAlertConfigResponse.setSuccess(_ctx.booleanValue("DescribeVaultAlertConfigResponse.Success"));
		describeVaultAlertConfigResponse.setCode(_ctx.stringValue("DescribeVaultAlertConfigResponse.Code"));
		describeVaultAlertConfigResponse.setMessage(_ctx.stringValue("DescribeVaultAlertConfigResponse.Message"));
		describeVaultAlertConfigResponse.setAlertSetting(_ctx.stringValue("DescribeVaultAlertConfigResponse.AlertSetting"));

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVaultAlertConfigResponse.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setContactId(_ctx.stringValue("DescribeVaultAlertConfigResponse.Contacts["+ i +"].ContactId"));
			contact.setName(_ctx.stringValue("DescribeVaultAlertConfigResponse.Contacts["+ i +"].Name"));
			contact.setEmail(_ctx.stringValue("DescribeVaultAlertConfigResponse.Contacts["+ i +"].Email"));
			contact.setMobile(_ctx.stringValue("DescribeVaultAlertConfigResponse.Contacts["+ i +"].Mobile"));
			contact.setDescription(_ctx.stringValue("DescribeVaultAlertConfigResponse.Contacts["+ i +"].Description"));

			contacts.add(contact);
		}
		describeVaultAlertConfigResponse.setContacts(contacts);

		List<ContactGroup> contactGroups = new ArrayList<ContactGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVaultAlertConfigResponse.ContactGroups.Length"); i++) {
			ContactGroup contactGroup = new ContactGroup();
			contactGroup.setContactGroupId(_ctx.stringValue("DescribeVaultAlertConfigResponse.ContactGroups["+ i +"].ContactGroupId"));
			contactGroup.setDisplayName(_ctx.stringValue("DescribeVaultAlertConfigResponse.ContactGroups["+ i +"].DisplayName"));

			contactGroups.add(contactGroup);
		}
		describeVaultAlertConfigResponse.setContactGroups(contactGroups);
	 
	 	return describeVaultAlertConfigResponse;
	}
}