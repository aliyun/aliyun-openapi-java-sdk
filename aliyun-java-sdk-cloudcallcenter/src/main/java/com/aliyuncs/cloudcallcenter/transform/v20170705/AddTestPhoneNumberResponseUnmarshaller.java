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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.AddTestPhoneNumberResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.AddTestPhoneNumberResponse.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddTestPhoneNumberResponseUnmarshaller {

	public static AddTestPhoneNumberResponse unmarshall(AddTestPhoneNumberResponse addTestPhoneNumberResponse, UnmarshallerContext context) {
		
		addTestPhoneNumberResponse.setRequestId(context.stringValue("AddTestPhoneNumberResponse.RequestId"));
		addTestPhoneNumberResponse.setSuccess(context.booleanValue("AddTestPhoneNumberResponse.Success"));
		addTestPhoneNumberResponse.setCode(context.stringValue("AddTestPhoneNumberResponse.Code"));
		addTestPhoneNumberResponse.setMessage(context.stringValue("AddTestPhoneNumberResponse.Message"));
		addTestPhoneNumberResponse.setHttpStatusCode(context.integerValue("AddTestPhoneNumberResponse.HttpStatusCode"));

		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.setPhoneNumberId(context.stringValue("AddTestPhoneNumberResponse.PhoneNumber.PhoneNumberId"));
		phoneNumber.setInstanceId(context.stringValue("AddTestPhoneNumberResponse.PhoneNumber.InstanceId"));
		phoneNumber.setNumber(context.stringValue("AddTestPhoneNumberResponse.PhoneNumber.Number"));
		phoneNumber.setPhoneNumberDescription(context.stringValue("AddTestPhoneNumberResponse.PhoneNumber.PhoneNumberDescription"));
		phoneNumber.setTestOnly(context.booleanValue("AddTestPhoneNumberResponse.PhoneNumber.TestOnly"));
		phoneNumber.setRemainingTime(context.integerValue("AddTestPhoneNumberResponse.PhoneNumber.RemainingTime"));
		phoneNumber.setAllowOutbound(context.booleanValue("AddTestPhoneNumberResponse.PhoneNumber.AllowOutbound"));
		phoneNumber.setUsage(context.stringValue("AddTestPhoneNumberResponse.PhoneNumber.Usage"));
		phoneNumber.setTrunks(context.integerValue("AddTestPhoneNumberResponse.PhoneNumber.Trunks"));
		addTestPhoneNumberResponse.setPhoneNumber(phoneNumber);
	 
	 	return addTestPhoneNumberResponse;
	}
}