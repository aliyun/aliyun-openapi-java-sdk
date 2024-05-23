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

	public static ListOutboundPhoneNumberOfUserResponse unmarshall(ListOutboundPhoneNumberOfUserResponse listOutboundPhoneNumberOfUserResponse, UnmarshallerContext _ctx) {
		
		listOutboundPhoneNumberOfUserResponse.setRequestId(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.RequestId"));
		listOutboundPhoneNumberOfUserResponse.setHttpStatusCode(_ctx.integerValue("ListOutboundPhoneNumberOfUserResponse.HttpStatusCode"));
		listOutboundPhoneNumberOfUserResponse.setCode(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.Code"));
		listOutboundPhoneNumberOfUserResponse.setMessage(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.Message"));
		listOutboundPhoneNumberOfUserResponse.setSuccess(_ctx.booleanValue("ListOutboundPhoneNumberOfUserResponse.Success"));

		List<String> numberList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListOutboundPhoneNumberOfUserResponse.NumberList.Length"); i++) {
			numberList.add(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.NumberList["+ i +"]"));
		}
		listOutboundPhoneNumberOfUserResponse.setNumberList(numberList);

		List<PhoneNumber> outboundPhoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPrivateFlag(_ctx.booleanValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivateFlag"));
			phoneNumber.setTestOnly(_ctx.booleanValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setSipTelX(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].SipTelX"));
			phoneNumber.setRemainingTime(_ctx.integerValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setCity(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].City"));
			phoneNumber.setInstanceId(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setAllowOutbound(_ctx.booleanValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].Usage"));
			phoneNumber.setPhoneNumberId(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setTrunks(_ctx.integerValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].Trunks"));
			phoneNumber.setNumber(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setProvince(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].Province"));

			PrivacyNumber privacyNumber = new PrivacyNumber();
			privacyNumber.setType(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.Type"));
			privacyNumber.setPoolId(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.PoolId"));
			privacyNumber.setSubId(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.SubId"));
			privacyNumber.setPhoneNumber(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.PhoneNumber"));
			privacyNumber.setPoolName(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.PoolName"));
			privacyNumber.setBizId(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.BizId"));
			privacyNumber.setRegionNameCity(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.RegionNameCity"));
			privacyNumber.setExtra(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.Extra"));
			privacyNumber.setTelX(_ctx.stringValue("ListOutboundPhoneNumberOfUserResponse.OutboundPhoneNumbers["+ i +"].PrivacyNumber.TelX"));
			phoneNumber.setPrivacyNumber(privacyNumber);

			outboundPhoneNumbers.add(phoneNumber);
		}
		listOutboundPhoneNumberOfUserResponse.setOutboundPhoneNumbers(outboundPhoneNumbers);
	 
	 	return listOutboundPhoneNumberOfUserResponse;
	}
}