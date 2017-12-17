/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListPhoneNumbersResponse;
import com.aliyuncs.ccc.model.v20170705.ListPhoneNumbersResponse.PhoneNumber;
import com.aliyuncs.ccc.model.v20170705.ListPhoneNumbersResponse.PhoneNumber.ContactFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPhoneNumbersResponseUnmarshaller {

	public static ListPhoneNumbersResponse unmarshall(ListPhoneNumbersResponse listPhoneNumbersResponse, UnmarshallerContext context) {
		
		listPhoneNumbersResponse.setRequestId(context.stringValue("ListPhoneNumbersResponse.RequestId"));
		listPhoneNumbersResponse.setSuccess(context.booleanValue("ListPhoneNumbersResponse.Success"));
		listPhoneNumbersResponse.setCode(context.stringValue("ListPhoneNumbersResponse.Code"));
		listPhoneNumbersResponse.setMessage(context.stringValue("ListPhoneNumbersResponse.Message"));
		listPhoneNumbersResponse.setHttpStatusCode(context.integerValue("ListPhoneNumbersResponse.HttpStatusCode"));

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("ListPhoneNumbersResponse.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(context.booleanValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(context.integerValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(context.booleanValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(context.integerValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].Trunks"));

			ContactFlow contactFlow = new ContactFlow();
			contactFlow.setContactFlowId(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowId"));
			contactFlow.setInstanceId(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.InstanceId"));
			contactFlow.setContactFlowName(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowName"));
			contactFlow.setContactFlowDescription(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.ContactFlowDescription"));
			contactFlow.setType(context.stringValue("ListPhoneNumbersResponse.PhoneNumbers["+ i +"].ContactFlow.Type"));
			phoneNumber.setContactFlow(contactFlow);

			phoneNumbers.add(phoneNumber);
		}
		listPhoneNumbersResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return listPhoneNumbersResponse;
	}
}