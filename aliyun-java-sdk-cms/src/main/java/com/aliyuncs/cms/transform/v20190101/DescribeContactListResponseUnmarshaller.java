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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeContactListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeContactListResponse.Contact;
import com.aliyuncs.cms.model.v20190101.DescribeContactListResponse.Contact.Channels;
import com.aliyuncs.cms.model.v20190101.DescribeContactListResponse.Contact.ChannelsState;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContactListResponseUnmarshaller {

	public static DescribeContactListResponse unmarshall(DescribeContactListResponse describeContactListResponse, UnmarshallerContext _ctx) {
		
		describeContactListResponse.setRequestId(_ctx.stringValue("DescribeContactListResponse.RequestId"));
		describeContactListResponse.setSuccess(_ctx.booleanValue("DescribeContactListResponse.Success"));
		describeContactListResponse.setCode(_ctx.stringValue("DescribeContactListResponse.Code"));
		describeContactListResponse.setMessage(_ctx.stringValue("DescribeContactListResponse.Message"));
		describeContactListResponse.setTotal(_ctx.integerValue("DescribeContactListResponse.Total"));

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("DescribeContactListResponse.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setName(_ctx.stringValue("DescribeContactListResponse.Contacts["+ i +"].Name"));
			contact.setDesc(_ctx.stringValue("DescribeContactListResponse.Contacts["+ i +"].Desc"));
			contact.setLang(_ctx.stringValue("DescribeContactListResponse.Contacts["+ i +"].Lang"));
			contact.setCreateTime(_ctx.longValue("DescribeContactListResponse.Contacts["+ i +"].CreateTime"));
			contact.setUpdateTime(_ctx.longValue("DescribeContactListResponse.Contacts["+ i +"].UpdateTime"));

			List<String> contactGroups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeContactListResponse.Contacts["+ i +"].ContactGroups.Length"); j++) {
				contactGroups.add(_ctx.stringValue("DescribeContactListResponse.Contacts["+ i +"].ContactGroups["+ j +"]"));
			}
			contact.setContactGroups(contactGroups);

			Channels channels = new Channels();
			channels.setSMS(_ctx.stringValue("DescribeContactListResponse.Contacts["+ i +"].Channels.SMS"));
			channels.setMail(_ctx.stringValue("DescribeContactListResponse.Contacts["+ i +"].Channels.Mail"));
			channels.setAliIM(_ctx.stringValue("DescribeContactListResponse.Contacts["+ i +"].Channels.AliIM"));
			channels.setDingWebHook(_ctx.stringValue("DescribeContactListResponse.Contacts["+ i +"].Channels.DingWebHook"));
			contact.setChannels(channels);

			ChannelsState channelsState = new ChannelsState();
			channelsState.setSMS(_ctx.stringValue("DescribeContactListResponse.Contacts["+ i +"].ChannelsState.SMS"));
			channelsState.setMail(_ctx.stringValue("DescribeContactListResponse.Contacts["+ i +"].ChannelsState.Mail"));
			channelsState.setAliIM(_ctx.stringValue("DescribeContactListResponse.Contacts["+ i +"].ChannelsState.AliIM"));
			channelsState.setDingWebHook(_ctx.stringValue("DescribeContactListResponse.Contacts["+ i +"].ChannelsState.DingWebHook"));
			contact.setChannelsState(channelsState);

			contacts.add(contact);
		}
		describeContactListResponse.setContacts(contacts);
	 
	 	return describeContactListResponse;
	}
}