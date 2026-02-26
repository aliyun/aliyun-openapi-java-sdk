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

import com.aliyuncs.cams.model.v20200606.QueryChatappPhoneNumbersResponse;
import com.aliyuncs.cams.model.v20200606.QueryChatappPhoneNumbersResponse.PhoneNumbersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryChatappPhoneNumbersResponseUnmarshaller {

	public static QueryChatappPhoneNumbersResponse unmarshall(QueryChatappPhoneNumbersResponse queryChatappPhoneNumbersResponse, UnmarshallerContext _ctx) {
		
		queryChatappPhoneNumbersResponse.setRequestId(_ctx.stringValue("QueryChatappPhoneNumbersResponse.RequestId"));
		queryChatappPhoneNumbersResponse.setCode(_ctx.stringValue("QueryChatappPhoneNumbersResponse.Code"));
		queryChatappPhoneNumbersResponse.setMessage(_ctx.stringValue("QueryChatappPhoneNumbersResponse.Message"));
		queryChatappPhoneNumbersResponse.setAccessDeniedDetail(_ctx.stringValue("QueryChatappPhoneNumbersResponse.AccessDeniedDetail"));

		List<PhoneNumbersItem> phoneNumbers = new ArrayList<PhoneNumbersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryChatappPhoneNumbersResponse.PhoneNumbers.Length"); i++) {
			PhoneNumbersItem phoneNumbersItem = new PhoneNumbersItem();
			phoneNumbersItem.setUpQueue(_ctx.stringValue("QueryChatappPhoneNumbersResponse.PhoneNumbers["+ i +"].UpQueue"));
			phoneNumbersItem.setPhoneNumber(_ctx.stringValue("QueryChatappPhoneNumbersResponse.PhoneNumbers["+ i +"].PhoneNumber"));
			phoneNumbersItem.setStatusQueue(_ctx.stringValue("QueryChatappPhoneNumbersResponse.PhoneNumbers["+ i +"].StatusQueue"));
			phoneNumbersItem.setVerifiedName(_ctx.stringValue("QueryChatappPhoneNumbersResponse.PhoneNumbers["+ i +"].VerifiedName"));
			phoneNumbersItem.setStatusCallbackUrl(_ctx.stringValue("QueryChatappPhoneNumbersResponse.PhoneNumbers["+ i +"].StatusCallbackUrl"));
			phoneNumbersItem.setUpCallbackUrl(_ctx.stringValue("QueryChatappPhoneNumbersResponse.PhoneNumbers["+ i +"].UpCallbackUrl"));
			phoneNumbersItem.setQualityRating(_ctx.stringValue("QueryChatappPhoneNumbersResponse.PhoneNumbers["+ i +"].QualityRating"));
			phoneNumbersItem.setStatus(_ctx.stringValue("QueryChatappPhoneNumbersResponse.PhoneNumbers["+ i +"].Status"));
			phoneNumbersItem.setCodeVerificationStatus(_ctx.stringValue("QueryChatappPhoneNumbersResponse.PhoneNumbers["+ i +"].CodeVerificationStatus"));
			phoneNumbersItem.setNameStatus(_ctx.stringValue("QueryChatappPhoneNumbersResponse.PhoneNumbers["+ i +"].NameStatus"));
			phoneNumbersItem.setMessagingLimitTier(_ctx.stringValue("QueryChatappPhoneNumbersResponse.PhoneNumbers["+ i +"].MessagingLimitTier"));
			phoneNumbersItem.setNewNameStatus(_ctx.stringValue("QueryChatappPhoneNumbersResponse.PhoneNumbers["+ i +"].NewNameStatus"));

			phoneNumbers.add(phoneNumbersItem);
		}
		queryChatappPhoneNumbersResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return queryChatappPhoneNumbersResponse;
	}
}