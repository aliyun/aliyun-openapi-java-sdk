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

import com.aliyuncs.ccc.model.v20170705.ListContactFlowsResponse;
import com.aliyuncs.ccc.model.v20170705.ListContactFlowsResponse.ContactFlow;
import com.aliyuncs.ccc.model.v20170705.ListContactFlowsResponse.ContactFlow.ContactFlowVersion;
import com.aliyuncs.ccc.model.v20170705.ListContactFlowsResponse.ContactFlow.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListContactFlowsResponseUnmarshaller {

	public static ListContactFlowsResponse unmarshall(ListContactFlowsResponse listContactFlowsResponse, UnmarshallerContext context) {
		
		listContactFlowsResponse.setRequestId(context.stringValue("ListContactFlowsResponse.RequestId"));
		listContactFlowsResponse.setSuccess(context.booleanValue("ListContactFlowsResponse.Success"));
		listContactFlowsResponse.setCode(context.stringValue("ListContactFlowsResponse.Code"));
		listContactFlowsResponse.setMessage(context.stringValue("ListContactFlowsResponse.Message"));
		listContactFlowsResponse.setHttpStatusCode(context.integerValue("ListContactFlowsResponse.HttpStatusCode"));

		List<ContactFlow> contactFlows = new ArrayList<ContactFlow>();
		for (int i = 0; i < context.lengthValue("ListContactFlowsResponse.ContactFlows.Length"); i++) {
			ContactFlow contactFlow = new ContactFlow();
			contactFlow.setContactFlowId(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].ContactFlowId"));
			contactFlow.setInstanceId(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].InstanceId"));
			contactFlow.setContactFlowName(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].ContactFlowName"));
			contactFlow.setContactFlowDescription(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].ContactFlowDescription"));
			contactFlow.setType(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Type"));
			contactFlow.setAppliedVersion(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].AppliedVersion"));

			List<ContactFlowVersion> versions = new ArrayList<ContactFlowVersion>();
			for (int j = 0; j < context.lengthValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions.Length"); j++) {
				ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
				contactFlowVersion.setContactFlowVersionId(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].ContactFlowVersionId"));
				contactFlowVersion.setVersion(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].Version"));
				contactFlowVersion.setContactFlowVersionDescription(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].ContactFlowVersionDescription"));
				contactFlowVersion.setLastModified(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].LastModified"));
				contactFlowVersion.setLastModifiedBy(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].LastModifiedBy"));
				contactFlowVersion.setLockedBy(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].LockedBy"));
				contactFlowVersion.setStatus(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].Versions["+ j +"].Status"));

				versions.add(contactFlowVersion);
			}
			contactFlow.setVersions(versions);

			List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
			for (int j = 0; j < context.lengthValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setPhoneNumberId(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].PhoneNumberId"));
				phoneNumber.setInstanceId(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].InstanceId"));
				phoneNumber.setNumber(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].Number"));
				phoneNumber.setPhoneNumberDescription(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].PhoneNumberDescription"));
				phoneNumber.setTestOnly(context.booleanValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].TestOnly"));
				phoneNumber.setRemainingTime(context.integerValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].RemainingTime"));
				phoneNumber.setAllowOutbound(context.booleanValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].AllowOutbound"));
				phoneNumber.setUsage(context.stringValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].Usage"));
				phoneNumber.setTrunks(context.integerValue("ListContactFlowsResponse.ContactFlows["+ i +"].PhoneNumbers["+ j +"].Trunks"));

				phoneNumbers.add(phoneNumber);
			}
			contactFlow.setPhoneNumbers(phoneNumbers);

			contactFlows.add(contactFlow);
		}
		listContactFlowsResponse.setContactFlows(contactFlows);
	 
	 	return listContactFlowsResponse;
	}
}