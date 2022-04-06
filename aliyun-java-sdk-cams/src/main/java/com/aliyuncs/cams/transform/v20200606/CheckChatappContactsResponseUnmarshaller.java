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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.CheckChatappContactsResponse;
import com.aliyuncs.cams.model.v20200606.CheckChatappContactsResponse.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckChatappContactsResponseUnmarshaller {

	public static CheckChatappContactsResponse unmarshall(CheckChatappContactsResponse checkChatappContactsResponse, UnmarshallerContext _ctx) {
		
		checkChatappContactsResponse.setRequestId(_ctx.stringValue("CheckChatappContactsResponse.RequestId"));
		checkChatappContactsResponse.setCode(_ctx.stringValue("CheckChatappContactsResponse.Code"));
		checkChatappContactsResponse.setMessage(_ctx.stringValue("CheckChatappContactsResponse.Message"));

		List<Contact> data = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("CheckChatappContactsResponse.Data.Length"); i++) {
			Contact contact = new Contact();
			contact.setStatus(_ctx.stringValue("CheckChatappContactsResponse.Data["+ i +"].Status"));
			contact.setPhoneNumber(_ctx.stringValue("CheckChatappContactsResponse.Data["+ i +"].PhoneNumber"));

			data.add(contact);
		}
		checkChatappContactsResponse.setData(data);
	 
	 	return checkChatappContactsResponse;
	}
}