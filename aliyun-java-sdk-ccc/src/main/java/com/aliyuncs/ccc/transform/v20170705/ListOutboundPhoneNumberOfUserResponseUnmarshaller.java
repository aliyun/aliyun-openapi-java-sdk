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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListOutboundPhoneNumberOfUserResponse;
import com.aliyuncs.ccc.model.v20170705.ListOutboundPhoneNumberOfUserResponse.PhoneNumber;
import com.aliyuncs.ccc.model.v20170705.ListOutboundPhoneNumberOfUserResponse.PhoneNumber.PrivacyNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOutboundPhoneNumberOfUserResponseUnmarshaller {

	public static ListOutboundPhoneNumberOfUserResponse unmarshall(ListOutboundPhoneNumberOfUserResponse listOutboundPhoneNumberOfUserResponse, UnmarshallerContext context) {
		
		listOutboundPhoneNumberOfUserResponse.setRequestId(context.stringValue("ListOutboundPhoneNumberOfUserResponse.RequestId"));
		listOutboundPhoneNumberOfUserResponse.setSuccess(context.booleanValue("ListOutboundPhoneNumberOfUserResponse.Success"));
		listOutboundPhoneNumberOfUserResponse.setCode(context.stringValue("ListOutboundPhoneNumberOfUserResponse.Code"));
		listOutboundPhoneNumberOfUserResponse.setMessage(context.stringValue("ListOutboundPhoneNumberOfUserResponse.Message"));
		listOutboundPhoneNumberOfUserResponse.setHttpStatusCode(context.integerValue("ListOutboundPhoneNumberOfUserResponse.HttpStatusCode"));

		List<PhoneNumber> outboundPhoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(context.booleanValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(context.integerValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(context.booleanValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(context.integerValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].Trunks"));
			phoneNumber.setCity(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].City"));
			phoneNumber.setProvince(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].Province"));
			phoneNumber.setPrivateFlag(context.booleanValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivateFlag"));

			PrivacyNumber privacyNumber = new PrivacyNumber();
			privacyNumber.setPoolId(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.PoolId"));
			privacyNumber.setType(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.Type"));
			privacyNumber.setTelX(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.TelX"));
			privacyNumber.setPoolName(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.PoolName"));
			privacyNumber.setPhoneNumber(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.PhoneNumber"));
			privacyNumber.setExtra(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.Extra"));
			privacyNumber.setBizId(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.BizId"));
			privacyNumber.setSubId(context.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.SubId"));
			phoneNumber.setPrivacyNumber(privacyNumber);

			outboundPhoneNumbers.add(phoneNumber);
		}
		listOutboundPhoneNumberOfUserResponse.setOutboundPhoneNumbers(outboundPhoneNumbers);
	 
	 	return listOutboundPhoneNumberOfUserResponse;
	}
}