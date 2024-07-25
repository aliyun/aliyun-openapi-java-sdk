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

import com.aliyuncs.cams.model.v20200606.ChatappSyncPhoneNumberResponse;
import com.aliyuncs.cams.model.v20200606.ChatappSyncPhoneNumberResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChatappSyncPhoneNumberResponseUnmarshaller {

	public static ChatappSyncPhoneNumberResponse unmarshall(ChatappSyncPhoneNumberResponse chatappSyncPhoneNumberResponse, UnmarshallerContext _ctx) {
		
		chatappSyncPhoneNumberResponse.setRequestId(_ctx.stringValue("ChatappSyncPhoneNumberResponse.RequestId"));
		chatappSyncPhoneNumberResponse.setAccessDeniedDetail(_ctx.stringValue("ChatappSyncPhoneNumberResponse.AccessDeniedDetail"));
		chatappSyncPhoneNumberResponse.setMessage(_ctx.stringValue("ChatappSyncPhoneNumberResponse.Message"));
		chatappSyncPhoneNumberResponse.setCode(_ctx.stringValue("ChatappSyncPhoneNumberResponse.Code"));
		chatappSyncPhoneNumberResponse.setSuccess(_ctx.booleanValue("ChatappSyncPhoneNumberResponse.Success"));

		List<Content> phoneNumbers = new ArrayList<Content>();
		for (int i = 0; i < _ctx.lengthValue("ChatappSyncPhoneNumberResponse.PhoneNumbers.Length"); i++) {
			Content content = new Content();
			content.setVerifiedName(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].VerifiedName"));
			content.setStatus(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].Status"));
			content.setQualityRating(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].QualityRating"));
			content.setCodeVerificationStatus(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].CodeVerificationStatus"));
			content.setNewNameStatus(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].NewNameStatus"));
			content.setPhoneNumber(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].PhoneNumber"));
			content.setStatusQueue(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].StatusQueue"));
			content.setUpQueue(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].UpQueue"));
			content.setNameStatus(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].NameStatus"));
			content.setUpCallbackUrl(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].UpCallbackUrl"));
			content.setMessagingLimitTier(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].MessagingLimitTier"));
			content.setStatusCallbackUrl(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].StatusCallbackUrl"));

			phoneNumbers.add(content);
		}
		chatappSyncPhoneNumberResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return chatappSyncPhoneNumberResponse;
	}
}