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

import com.aliyuncs.cloudcallcenter.model.v20170705.AddPhoneNumberExResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.AddPhoneNumberExResponse.PhoneNumber;
import com.aliyuncs.cloudcallcenter.model.v20170705.AddPhoneNumberExResponse.PhoneNumber.ContactFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPhoneNumberExResponseUnmarshaller {

	public static AddPhoneNumberExResponse unmarshall(AddPhoneNumberExResponse addPhoneNumberExResponse, UnmarshallerContext context) {
		
		addPhoneNumberExResponse.setRequestId(context.stringValue("AddPhoneNumberExResponse.RequestId"));
		addPhoneNumberExResponse.setSuccess(context.booleanValue("AddPhoneNumberExResponse.Success"));
		addPhoneNumberExResponse.setCode(context.stringValue("AddPhoneNumberExResponse.Code"));
		addPhoneNumberExResponse.setMessage(context.stringValue("AddPhoneNumberExResponse.Message"));
		addPhoneNumberExResponse.setHttpStatusCode(context.integerValue("AddPhoneNumberExResponse.HttpStatusCode"));

		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.setPhoneNumberId(context.stringValue("AddPhoneNumberExResponse.PhoneNumber.PhoneNumberId"));
		phoneNumber.setInstanceId(context.stringValue("AddPhoneNumberExResponse.PhoneNumber.InstanceId"));
		phoneNumber.setNumber(context.stringValue("AddPhoneNumberExResponse.PhoneNumber.Number"));
		phoneNumber.setPhoneNumberDescription(context.stringValue("AddPhoneNumberExResponse.PhoneNumber.PhoneNumberDescription"));
		phoneNumber.setTestOnly(context.booleanValue("AddPhoneNumberExResponse.PhoneNumber.TestOnly"));
		phoneNumber.setRemainingTime(context.integerValue("AddPhoneNumberExResponse.PhoneNumber.RemainingTime"));
		phoneNumber.setAllowOutbound(context.booleanValue("AddPhoneNumberExResponse.PhoneNumber.AllowOutbound"));
		phoneNumber.setUsage(context.stringValue("AddPhoneNumberExResponse.PhoneNumber.Usage"));
		phoneNumber.setTrunks(context.integerValue("AddPhoneNumberExResponse.PhoneNumber.Trunks"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setContactFlowId(context.stringValue("AddPhoneNumberExResponse.PhoneNumber.ContactFlow.ContactFlowId"));
		contactFlow.setInstanceId(context.stringValue("AddPhoneNumberExResponse.PhoneNumber.ContactFlow.InstanceId"));
		contactFlow.setContactFlowName(context.stringValue("AddPhoneNumberExResponse.PhoneNumber.ContactFlow.ContactFlowName"));
		contactFlow.setContactFlowDescription(context.stringValue("AddPhoneNumberExResponse.PhoneNumber.ContactFlow.ContactFlowDescription"));
		contactFlow.setType(context.stringValue("AddPhoneNumberExResponse.PhoneNumber.ContactFlow.Type"));
		phoneNumber.setContactFlow(contactFlow);
		addPhoneNumberExResponse.setPhoneNumber(phoneNumber);
	 
	 	return addPhoneNumberExResponse;
	}
}