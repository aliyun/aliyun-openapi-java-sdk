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

import com.aliyuncs.cms.model.v20190101.DescribeContactListByContactGroupResponse;
import com.aliyuncs.cms.model.v20190101.DescribeContactListByContactGroupResponse.Contact;
import com.aliyuncs.cms.model.v20190101.DescribeContactListByContactGroupResponse.Contact.Channels;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContactListByContactGroupResponseUnmarshaller {

	public static DescribeContactListByContactGroupResponse unmarshall(DescribeContactListByContactGroupResponse describeContactListByContactGroupResponse, UnmarshallerContext context) {
		
		describeContactListByContactGroupResponse.setRequestId(context.stringValue("DescribeContactListByContactGroupResponse.RequestId"));
		describeContactListByContactGroupResponse.setSuccess(context.booleanValue("DescribeContactListByContactGroupResponse.Success"));
		describeContactListByContactGroupResponse.setCode(context.stringValue("DescribeContactListByContactGroupResponse.Code"));
		describeContactListByContactGroupResponse.setMessage(context.stringValue("DescribeContactListByContactGroupResponse.Message"));

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < context.lengthValue("DescribeContactListByContactGroupResponse.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setName(context.stringValue("DescribeContactListByContactGroupResponse.Contacts["+ i +"].Name"));
			contact.setDesc(context.stringValue("DescribeContactListByContactGroupResponse.Contacts["+ i +"].Desc"));
			contact.setCreateTime(context.longValue("DescribeContactListByContactGroupResponse.Contacts["+ i +"].CreateTime"));
			contact.setUpdateTime(context.longValue("DescribeContactListByContactGroupResponse.Contacts["+ i +"].UpdateTime"));

			Channels channels = new Channels();
			channels.setSMS(context.stringValue("DescribeContactListByContactGroupResponse.Contacts["+ i +"].Channels.SMS"));
			channels.setMail(context.stringValue("DescribeContactListByContactGroupResponse.Contacts["+ i +"].Channels.Mail"));
			channels.setAliIM(context.stringValue("DescribeContactListByContactGroupResponse.Contacts["+ i +"].Channels.AliIM"));
			channels.setDingWebHook(context.stringValue("DescribeContactListByContactGroupResponse.Contacts["+ i +"].Channels.DingWebHook"));
			contact.setChannels(channels);

			contacts.add(contact);
		}
		describeContactListByContactGroupResponse.setContacts(contacts);
	 
	 	return describeContactListByContactGroupResponse;
	}
}