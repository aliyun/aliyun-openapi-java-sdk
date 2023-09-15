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
import com.aliyuncs.cams.model.v20200606.ChatappSyncPhoneNumberResponse.PhoneNumbersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChatappSyncPhoneNumberResponseUnmarshaller {

	public static ChatappSyncPhoneNumberResponse unmarshall(ChatappSyncPhoneNumberResponse chatappSyncPhoneNumberResponse, UnmarshallerContext _ctx) {
		
		chatappSyncPhoneNumberResponse.setRequestId(_ctx.stringValue("ChatappSyncPhoneNumberResponse.RequestId"));
		chatappSyncPhoneNumberResponse.setCode(_ctx.stringValue("ChatappSyncPhoneNumberResponse.Code"));
		chatappSyncPhoneNumberResponse.setMessage(_ctx.stringValue("ChatappSyncPhoneNumberResponse.Message"));
		chatappSyncPhoneNumberResponse.setAccessDeniedDetail(_ctx.stringValue("ChatappSyncPhoneNumberResponse.AccessDeniedDetail"));

		List<PhoneNumbersItem> phoneNumbers = new ArrayList<PhoneNumbersItem>();
		for (int i = 0; i < _ctx.lengthValue("ChatappSyncPhoneNumberResponse.PhoneNumbers.Length"); i++) {
			PhoneNumbersItem phoneNumbersItem = new PhoneNumbersItem();
			phoneNumbersItem.setUpQueue(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].UpQueue"));
			phoneNumbersItem.setPhoneNumber(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].PhoneNumber"));
			phoneNumbersItem.setStatusQueue(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].StatusQueue"));
			phoneNumbersItem.setVerifiedName(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].VerifiedName"));
			phoneNumbersItem.setStatusCallbackUrl(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].StatusCallbackUrl"));
			phoneNumbersItem.setUpCallbackUrl(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].UpCallbackUrl"));
			phoneNumbersItem.setQualityRating(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].QualityRating"));
			phoneNumbersItem.setStatus(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].Status"));
			phoneNumbersItem.setCodeVerificationStatus(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].CodeVerificationStatus"));
			phoneNumbersItem.setNameStatus(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].NameStatus"));
			phoneNumbersItem.setMessagingLimitTier(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].MessagingLimitTier"));
			phoneNumbersItem.setNewNameStatus(_ctx.stringValue("ChatappSyncPhoneNumberResponse.PhoneNumbers["+ i +"].NewNameStatus"));

			phoneNumbers.add(phoneNumbersItem);
		}
		chatappSyncPhoneNumberResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return chatappSyncPhoneNumberResponse;
	}
}