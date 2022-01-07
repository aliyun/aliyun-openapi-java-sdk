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

import com.aliyuncs.arms.model.v20190808.DescribeContactGroupsResponse;
import com.aliyuncs.arms.model.v20190808.DescribeContactGroupsResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.DescribeContactGroupsResponse.PageBean.ContactGroups;
import com.aliyuncs.arms.model.v20190808.DescribeContactGroupsResponse.PageBean.ContactGroups.ContactsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContactGroupsResponseUnmarshaller {

	public static DescribeContactGroupsResponse unmarshall(DescribeContactGroupsResponse describeContactGroupsResponse, UnmarshallerContext _ctx) {
		
		describeContactGroupsResponse.setRequestId(_ctx.stringValue("DescribeContactGroupsResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotal(_ctx.longValue("DescribeContactGroupsResponse.PageBean.Total"));
		pageBean.setPage(_ctx.longValue("DescribeContactGroupsResponse.PageBean.Page"));
		pageBean.setSize(_ctx.longValue("DescribeContactGroupsResponse.PageBean.Size"));

		List<ContactGroups> alertContactGroups = new ArrayList<ContactGroups>();
		for (int i = 0; i < _ctx.lengthValue("DescribeContactGroupsResponse.PageBean.AlertContactGroups.Length"); i++) {
			ContactGroups contactGroups = new ContactGroups();
			contactGroups.setContactGroupId(_ctx.floatValue("DescribeContactGroupsResponse.PageBean.AlertContactGroups["+ i +"].ContactGroupId"));
			contactGroups.setContactGroupName(_ctx.stringValue("DescribeContactGroupsResponse.PageBean.AlertContactGroups["+ i +"].ContactGroupName"));

			List<ContactsItem> contacts = new ArrayList<ContactsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeContactGroupsResponse.PageBean.AlertContactGroups["+ i +"].Contacts.Length"); j++) {
				ContactsItem contactsItem = new ContactsItem();
				contactsItem.setContactId(_ctx.floatValue("DescribeContactGroupsResponse.PageBean.AlertContactGroups["+ i +"].Contacts["+ j +"].ContactId"));
				contactsItem.setContactName(_ctx.stringValue("DescribeContactGroupsResponse.PageBean.AlertContactGroups["+ i +"].Contacts["+ j +"].ContactName"));
				contactsItem.setPhone(_ctx.stringValue("DescribeContactGroupsResponse.PageBean.AlertContactGroups["+ i +"].Contacts["+ j +"].Phone"));
				contactsItem.setEmail(_ctx.stringValue("DescribeContactGroupsResponse.PageBean.AlertContactGroups["+ i +"].Contacts["+ j +"].Email"));

				contacts.add(contactsItem);
			}
			contactGroups.setContacts(contacts);

			alertContactGroups.add(contactGroups);
		}
		pageBean.setAlertContactGroups(alertContactGroups);
		describeContactGroupsResponse.setPageBean(pageBean);
	 
	 	return describeContactGroupsResponse;
	}
}