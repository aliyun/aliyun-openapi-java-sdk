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

package com.aliyuncs.mscopensubscription.transform.v20210713;

import com.aliyuncs.mscopensubscription.model.v20210713.CreateContactResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateContactResponseUnmarshaller {

	public static CreateContactResponse unmarshall(CreateContactResponse createContactResponse, UnmarshallerContext _ctx) {
		
		createContactResponse.setRequestId(_ctx.stringValue("CreateContactResponse.RequestId"));
		createContactResponse.setContactId(_ctx.longValue("CreateContactResponse.ContactId"));
		createContactResponse.setSuccess(_ctx.booleanValue("CreateContactResponse.Success"));
		createContactResponse.setCode(_ctx.stringValue("CreateContactResponse.Code"));
		createContactResponse.setMessage(_ctx.stringValue("CreateContactResponse.Message"));
	 
	 	return createContactResponse;
	}
}