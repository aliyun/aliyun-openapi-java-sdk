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

	public static GetContactInfoByOutboundTaskIdResponse unmarshall(GetContactInfoByOutboundTaskIdResponse getContactInfoByOutboundTaskIdResponse, UnmarshallerContext _ctx) {
		
		getContactInfoByOutboundTaskIdResponse.setRequestId(_ctx.stringValue("GetContactInfoByOutboundTaskIdResponse.RequestId"));
		getContactInfoByOutboundTaskIdResponse.setSuccess(_ctx.booleanValue("GetContactInfoByOutboundTaskIdResponse.Success"));
		getContactInfoByOutboundTaskIdResponse.setCode(_ctx.stringValue("GetContactInfoByOutboundTaskIdResponse.Code"));
		getContactInfoByOutboundTaskIdResponse.setMessage(_ctx.stringValue("GetContactInfoByOutboundTaskIdResponse.Message"));
		getContactInfoByOutboundTaskIdResponse.setHttpStatusCode(_ctx.integerValue("GetContactInfoByOutboundTaskIdResponse.HttpStatusCode"));

		ContactIdentity contactIdentity = new ContactIdentity();
		contactIdentity.setContactReferrnceId(_ctx.stringValue("GetContactInfoByOutboundTaskIdResponse.ContactIdentity.ContactReferrnceId"));
		contactIdentity.setJobGroupId(_ctx.stringValue("GetContactInfoByOutboundTaskIdResponse.ContactIdentity.JobGroupId"));
		contactIdentity.setUserPhone(_ctx.stringValue("GetContactInfoByOutboundTaskIdResponse.ContactIdentity.UserPhone"));
		contactIdentity.setCaller(_ctx.stringValue("GetContactInfoByOutboundTaskIdResponse.ContactIdentity.Caller"));
		getContactInfoByOutboundTaskIdResponse.setContactIdentity(contactIdentity);
	 
	 	return getContactInfoByOutboundTaskIdResponse;
	}
}