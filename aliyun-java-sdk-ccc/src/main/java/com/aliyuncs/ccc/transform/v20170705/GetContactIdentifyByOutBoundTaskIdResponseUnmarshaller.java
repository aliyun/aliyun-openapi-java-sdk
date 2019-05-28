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

import com.aliyuncs.ccc.model.v20170705.GetContactIdentifyByOutBoundTaskIdResponse;
import com.aliyuncs.ccc.model.v20170705.GetContactIdentifyByOutBoundTaskIdResponse.ContactIdentity;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContactIdentifyByOutBoundTaskIdResponseUnmarshaller {

	public static GetContactIdentifyByOutBoundTaskIdResponse unmarshall(GetContactIdentifyByOutBoundTaskIdResponse getContactIdentifyByOutBoundTaskIdResponse, UnmarshallerContext context) {
		
		getContactIdentifyByOutBoundTaskIdResponse.setRequestId(context.stringValue("GetContactIdentifyByOutBoundTaskIdResponse.RequestId"));
		getContactIdentifyByOutBoundTaskIdResponse.setSuccess(context.booleanValue("GetContactIdentifyByOutBoundTaskIdResponse.Success"));
		getContactIdentifyByOutBoundTaskIdResponse.setCode(context.stringValue("GetContactIdentifyByOutBoundTaskIdResponse.Code"));
		getContactIdentifyByOutBoundTaskIdResponse.setMessage(context.stringValue("GetContactIdentifyByOutBoundTaskIdResponse.Message"));
		getContactIdentifyByOutBoundTaskIdResponse.setHttpStatusCode(context.integerValue("GetContactIdentifyByOutBoundTaskIdResponse.HttpStatusCode"));

		ContactIdentity contactIdentity = new ContactIdentity();
		contactIdentity.setContactReferrnceId(context.stringValue("GetContactIdentifyByOutBoundTaskIdResponse.ContactIdentity.ContactReferrnceId"));
		contactIdentity.setJobGroupId(context.stringValue("GetContactIdentifyByOutBoundTaskIdResponse.ContactIdentity.JobGroupId"));
		contactIdentity.setUserPhone(context.stringValue("GetContactIdentifyByOutBoundTaskIdResponse.ContactIdentity.UserPhone"));
		getContactIdentifyByOutBoundTaskIdResponse.setContactIdentity(contactIdentity);
	 
	 	return getContactIdentifyByOutBoundTaskIdResponse;
	}
}