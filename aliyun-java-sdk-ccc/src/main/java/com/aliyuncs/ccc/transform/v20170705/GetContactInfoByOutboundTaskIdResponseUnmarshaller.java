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

import com.aliyuncs.ccc.model.v20170705.GetContactInfoByOutboundTaskIdResponse;
import com.aliyuncs.ccc.model.v20170705.GetContactInfoByOutboundTaskIdResponse.ContactIdentity;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContactInfoByOutboundTaskIdResponseUnmarshaller {

	public static GetContactInfoByOutboundTaskIdResponse unmarshall(GetContactInfoByOutboundTaskIdResponse getContactInfoByOutboundTaskIdResponse, UnmarshallerContext context) {
		
		getContactInfoByOutboundTaskIdResponse.setRequestId(context.stringValue("GetContactInfoByOutboundTaskIdResponse.RequestId"));
		getContactInfoByOutboundTaskIdResponse.setSuccess(context.booleanValue("GetContactInfoByOutboundTaskIdResponse.Success"));
		getContactInfoByOutboundTaskIdResponse.setCode(context.stringValue("GetContactInfoByOutboundTaskIdResponse.Code"));
		getContactInfoByOutboundTaskIdResponse.setMessage(context.stringValue("GetContactInfoByOutboundTaskIdResponse.Message"));
		getContactInfoByOutboundTaskIdResponse.setHttpStatusCode(context.integerValue("GetContactInfoByOutboundTaskIdResponse.HttpStatusCode"));

		ContactIdentity contactIdentity = new ContactIdentity();
		contactIdentity.setContactReferrnceId(context.stringValue("GetContactInfoByOutboundTaskIdResponse.ContactIdentity.ContactReferrnceId"));
		contactIdentity.setJobGroupId(context.stringValue("GetContactInfoByOutboundTaskIdResponse.ContactIdentity.JobGroupId"));
		contactIdentity.setUserPhone(context.stringValue("GetContactInfoByOutboundTaskIdResponse.ContactIdentity.UserPhone"));
		getContactInfoByOutboundTaskIdResponse.setContactIdentity(contactIdentity);
	 
	 	return getContactInfoByOutboundTaskIdResponse;
	}
}