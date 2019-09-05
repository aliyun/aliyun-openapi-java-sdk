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

import com.aliyuncs.ccc.model.v20170705.AddPhoneNumberResponse;
import com.aliyuncs.ccc.model.v20170705.AddPhoneNumberResponse.PhoneNumber;
import com.aliyuncs.ccc.model.v20170705.AddPhoneNumberResponse.PhoneNumber.ContactFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPhoneNumberResponseUnmarshaller {

	public static AddPhoneNumberResponse unmarshall(AddPhoneNumberResponse addPhoneNumberResponse, UnmarshallerContext _ctx) {
		
		addPhoneNumberResponse.setRequestId(_ctx.stringValue("AddPhoneNumberResponse.RequestId"));
		addPhoneNumberResponse.setSuccess(_ctx.booleanValue("AddPhoneNumberResponse.Success"));
		addPhoneNumberResponse.setCode(_ctx.stringValue("AddPhoneNumberResponse.Code"));
		addPhoneNumberResponse.setMessage(_ctx.stringValue("AddPhoneNumberResponse.Message"));
		addPhoneNumberResponse.setHttpStatusCode(_ctx.integerValue("AddPhoneNumberResponse.HttpStatusCode"));

		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.setPhoneNumberId(_ctx.stringValue("AddPhoneNumberResponse.PhoneNumber.PhoneNumberId"));
		phoneNumber.setInstanceId(_ctx.stringValue("AddPhoneNumberResponse.PhoneNumber.InstanceId"));
		phoneNumber.setNumber(_ctx.stringValue("AddPhoneNumberResponse.PhoneNumber.Number"));
		phoneNumber.setPhoneNumberDescription(_ctx.stringValue("AddPhoneNumberResponse.PhoneNumber.PhoneNumberDescription"));
		phoneNumber.setTestOnly(_ctx.booleanValue("AddPhoneNumberResponse.PhoneNumber.TestOnly"));
		phoneNumber.setRemainingTime(_ctx.integerValue("AddPhoneNumberResponse.PhoneNumber.RemainingTime"));
		phoneNumber.setAllowOutbound(_ctx.booleanValue("AddPhoneNumberResponse.PhoneNumber.AllowOutbound"));
		phoneNumber.setUsage(_ctx.stringValue("AddPhoneNumberResponse.PhoneNumber.Usage"));
		phoneNumber.setTrunks(_ctx.integerValue("AddPhoneNumberResponse.PhoneNumber.Trunks"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setContactFlowId(_ctx.stringValue("AddPhoneNumberResponse.PhoneNumber.ContactFlow.ContactFlowId"));
		contactFlow.setInstanceId(_ctx.stringValue("AddPhoneNumberResponse.PhoneNumber.ContactFlow.InstanceId"));
		contactFlow.setContactFlowName(_ctx.stringValue("AddPhoneNumberResponse.PhoneNumber.ContactFlow.ContactFlowName"));
		contactFlow.setContactFlowDescription(_ctx.stringValue("AddPhoneNumberResponse.PhoneNumber.ContactFlow.ContactFlowDescription"));
		contactFlow.setType(_ctx.stringValue("AddPhoneNumberResponse.PhoneNumber.ContactFlow.Type"));
		phoneNumber.setContactFlow(contactFlow);
		addPhoneNumberResponse.setPhoneNumber(phoneNumber);
	 
	 	return addPhoneNumberResponse;
	}
}