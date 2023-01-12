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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetEventSubscriptionResponse;
import com.aliyuncs.das.model.v20200116.GetEventSubscriptionResponse.Data;
import com.aliyuncs.das.model.v20200116.GetEventSubscriptionResponse.Data.ContactGroupsItem;
import com.aliyuncs.das.model.v20200116.GetEventSubscriptionResponse.Data.ContactsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEventSubscriptionResponseUnmarshaller {

	public static GetEventSubscriptionResponse unmarshall(GetEventSubscriptionResponse getEventSubscriptionResponse, UnmarshallerContext _ctx) {
		
		getEventSubscriptionResponse.setRequestId(_ctx.stringValue("GetEventSubscriptionResponse.RequestId"));
		getEventSubscriptionResponse.setMessage(_ctx.stringValue("GetEventSubscriptionResponse.Message"));
		getEventSubscriptionResponse.setCode(_ctx.stringValue("GetEventSubscriptionResponse.Code"));
		getEventSubscriptionResponse.setSuccess(_ctx.stringValue("GetEventSubscriptionResponse.Success"));

		Data data = new Data();
		data.setUserId(_ctx.stringValue("GetEventSubscriptionResponse.Data.userId"));
		data.setInstanceId(_ctx.stringValue("GetEventSubscriptionResponse.Data.instanceId"));
		data.setEventContext(_ctx.stringValue("GetEventSubscriptionResponse.Data.eventContext"));
		data.setLang(_ctx.stringValue("GetEventSubscriptionResponse.Data.lang"));
		data.setActive(_ctx.integerValue("GetEventSubscriptionResponse.Data.active"));
		data.setMinInterval(_ctx.stringValue("GetEventSubscriptionResponse.Data.minInterval"));
		data.setContactName(_ctx.stringValue("GetEventSubscriptionResponse.Data.contactName"));
		data.setContactGroupName(_ctx.stringValue("GetEventSubscriptionResponse.Data.contactGroupName"));
		data.setChannelType(_ctx.stringValue("GetEventSubscriptionResponse.Data.channelType"));
		data.setLevel(_ctx.stringValue("GetEventSubscriptionResponse.Data.level"));
		data.setId(_ctx.longValue("GetEventSubscriptionResponse.Data.id"));
		data.setGmtCreate(_ctx.longValue("GetEventSubscriptionResponse.Data.gmtCreate"));
		data.setGmtModified(_ctx.longValue("GetEventSubscriptionResponse.Data.gmtModified"));

		List<String> eventSendGroup = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetEventSubscriptionResponse.Data.eventSendGroup.Length"); i++) {
			eventSendGroup.add(_ctx.stringValue("GetEventSubscriptionResponse.Data.eventSendGroup["+ i +"]"));
		}
		data.setEventSendGroup(eventSendGroup);

		List<ContactsItem> contacts = new ArrayList<ContactsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetEventSubscriptionResponse.Data.contacts.Length"); i++) {
			ContactsItem contactsItem = new ContactsItem();
			contactsItem.setName(_ctx.stringValue("GetEventSubscriptionResponse.Data.contacts["+ i +"].name"));
			contactsItem.setPhone(_ctx.stringValue("GetEventSubscriptionResponse.Data.contacts["+ i +"].phone"));
			contactsItem.setEmail(_ctx.stringValue("GetEventSubscriptionResponse.Data.contacts["+ i +"].email"));
			contactsItem.setDingtalkHook(_ctx.stringValue("GetEventSubscriptionResponse.Data.contacts["+ i +"].dingtalkHook"));
			contactsItem.setIsCmsReduplicated(_ctx.booleanValue("GetEventSubscriptionResponse.Data.contacts["+ i +"].isCmsReduplicated"));
			contactsItem.setUserId(_ctx.stringValue("GetEventSubscriptionResponse.Data.contacts["+ i +"].userId"));

			List<String> groups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetEventSubscriptionResponse.Data.contacts["+ i +"].groups.Length"); j++) {
				groups.add(_ctx.stringValue("GetEventSubscriptionResponse.Data.contacts["+ i +"].groups["+ j +"]"));
			}
			contactsItem.setGroups(groups);

			contacts.add(contactsItem);
		}
		data.setContacts(contacts);

		List<ContactGroupsItem> contactGroups = new ArrayList<ContactGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetEventSubscriptionResponse.Data.contactGroups.Length"); i++) {
			ContactGroupsItem contactGroupsItem = new ContactGroupsItem();
			contactGroupsItem.setName(_ctx.stringValue("GetEventSubscriptionResponse.Data.contactGroups["+ i +"].name"));
			contactGroupsItem.setDescription(_ctx.stringValue("GetEventSubscriptionResponse.Data.contactGroups["+ i +"].description"));
			contactGroupsItem.setContacts(_ctx.stringValue("GetEventSubscriptionResponse.Data.contactGroups["+ i +"].contacts"));
			contactGroupsItem.setUserId(_ctx.stringValue("GetEventSubscriptionResponse.Data.contactGroups["+ i +"].userId"));

			contactGroups.add(contactGroupsItem);
		}
		data.setContactGroups(contactGroups);
		getEventSubscriptionResponse.setData(data);
	 
	 	return getEventSubscriptionResponse;
	}
}