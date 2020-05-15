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

import com.aliyuncs.hbr.model.v20170908.DescribeContactsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeContactsResponse.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContactsResponseUnmarshaller {

	public static DescribeContactsResponse unmarshall(DescribeContactsResponse describeContactsResponse, UnmarshallerContext _ctx) {
		
		describeContactsResponse.setRequestId(_ctx.stringValue("DescribeContactsResponse.RequestId"));
		describeContactsResponse.setSuccess(_ctx.booleanValue("DescribeContactsResponse.Success"));
		describeContactsResponse.setCode(_ctx.stringValue("DescribeContactsResponse.Code"));
		describeContactsResponse.setMessage(_ctx.stringValue("DescribeContactsResponse.Message"));
		describeContactsResponse.setTotalCount(_ctx.integerValue("DescribeContactsResponse.TotalCount"));
		describeContactsResponse.setPageSize(_ctx.integerValue("DescribeContactsResponse.PageSize"));
		describeContactsResponse.setPageNumber(_ctx.integerValue("DescribeContactsResponse.PageNumber"));

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("DescribeContactsResponse.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setContactId(_ctx.stringValue("DescribeContactsResponse.Contacts["+ i +"].ContactId"));
			contact.setName(_ctx.stringValue("DescribeContactsResponse.Contacts["+ i +"].Name"));
			contact.setEmail(_ctx.stringValue("DescribeContactsResponse.Contacts["+ i +"].Email"));
			contact.setMobile(_ctx.stringValue("DescribeContactsResponse.Contacts["+ i +"].Mobile"));
			contact.setDescription(_ctx.stringValue("DescribeContactsResponse.Contacts["+ i +"].Description"));

			contacts.add(contact);
		}
		describeContactsResponse.setContacts(contacts);
	 
	 	return describeContactsResponse;
	}
}