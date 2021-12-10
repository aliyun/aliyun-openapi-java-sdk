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

package com.aliyuncs.mscopensubscription.transform.v20210713;

import com.aliyuncs.mscopensubscription.model.v20210713.GetContactResponse;
import com.aliyuncs.mscopensubscription.model.v20210713.GetContactResponse.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContactResponseUnmarshaller {

	public static GetContactResponse unmarshall(GetContactResponse getContactResponse, UnmarshallerContext _ctx) {
		
		getContactResponse.setRequestId(_ctx.stringValue("GetContactResponse.RequestId"));
		getContactResponse.setSuccess(_ctx.booleanValue("GetContactResponse.Success"));
		getContactResponse.setCode(_ctx.stringValue("GetContactResponse.Code"));
		getContactResponse.setMessage(_ctx.stringValue("GetContactResponse.Message"));

		Contact contact = new Contact();
		contact.setLastMobileVerificationTimeStamp(_ctx.longValue("GetContactResponse.Contact.LastMobileVerificationTimeStamp"));
		contact.setEmail(_ctx.stringValue("GetContactResponse.Contact.Email"));
		contact.setPosition(_ctx.stringValue("GetContactResponse.Contact.Position"));
		contact.setLastEmailVerificationTimeStamp(_ctx.longValue("GetContactResponse.Contact.LastEmailVerificationTimeStamp"));
		contact.setContactId(_ctx.longValue("GetContactResponse.Contact.ContactId"));
		contact.setAccountUid(_ctx.longValue("GetContactResponse.Contact.AccountUid"));
		contact.setMobile(_ctx.stringValue("GetContactResponse.Contact.Mobile"));
		contact.setContactName(_ctx.stringValue("GetContactResponse.Contact.ContactName"));
		contact.setIsAccount(_ctx.booleanValue("GetContactResponse.Contact.IsAccount"));
		contact.setIsVerifiedEmail(_ctx.booleanValue("GetContactResponse.Contact.IsVerifiedEmail"));
		contact.setIsObsolete(_ctx.booleanValue("GetContactResponse.Contact.IsObsolete"));
		contact.setIsVerifiedMobile(_ctx.booleanValue("GetContactResponse.Contact.IsVerifiedMobile"));
		getContactResponse.setContact(contact);
	 
	 	return getContactResponse;
	}
}