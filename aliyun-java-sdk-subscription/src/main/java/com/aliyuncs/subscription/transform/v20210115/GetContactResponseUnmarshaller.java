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

package com.aliyuncs.subscription.transform.v20210115;

import com.aliyuncs.subscription.model.v20210115.GetContactResponse;
import com.aliyuncs.subscription.model.v20210115.GetContactResponse.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContactResponseUnmarshaller {

	public static GetContactResponse unmarshall(GetContactResponse getContactResponse, UnmarshallerContext _ctx) {
		
		getContactResponse.setRequestId(_ctx.stringValue("GetContactResponse.RequestId"));
		getContactResponse.setMessage(_ctx.stringValue("GetContactResponse.Message"));
		getContactResponse.setCode(_ctx.stringValue("GetContactResponse.Code"));
		getContactResponse.setSuccess(_ctx.booleanValue("GetContactResponse.Success"));

		Contact contact = new Contact();
		contact.setEmail(_ctx.stringValue("GetContactResponse.Contact.Email"));
		contact.setIsAccount(_ctx.booleanValue("GetContactResponse.Contact.IsAccount"));
		contact.setPosition(_ctx.stringValue("GetContactResponse.Contact.Position"));
		contact.setIsVerifiedEmail(_ctx.booleanValue("GetContactResponse.Contact.IsVerifiedEmail"));
		contact.setLastMobileVerificationTimeStamp(_ctx.longValue("GetContactResponse.Contact.LastMobileVerificationTimeStamp"));
		contact.setIsObsolete(_ctx.booleanValue("GetContactResponse.Contact.IsObsolete"));
		contact.setIsVerifiedMobile(_ctx.booleanValue("GetContactResponse.Contact.IsVerifiedMobile"));
		contact.setContactId(_ctx.longValue("GetContactResponse.Contact.ContactId"));
		contact.setAccountUID(_ctx.longValue("GetContactResponse.Contact.AccountUID"));
		contact.setMobile(_ctx.stringValue("GetContactResponse.Contact.Mobile"));
		contact.setLastEmailVerificationTimeStamp(_ctx.longValue("GetContactResponse.Contact.LastEmailVerificationTimeStamp"));
		contact.setName(_ctx.stringValue("GetContactResponse.Contact.Name"));
		getContactResponse.setContact(contact);
	 
	 	return getContactResponse;
	}
}