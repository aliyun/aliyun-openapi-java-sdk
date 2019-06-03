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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.CreateUserQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserQuotaResponseUnmarshaller {

	public static CreateUserQuotaResponse unmarshall(CreateUserQuotaResponse createUserQuotaResponse, UnmarshallerContext context) {
		
		createUserQuotaResponse.setRequestId(context.stringValue("CreateUserQuotaResponse.RequestId"));
		createUserQuotaResponse.setCode(context.stringValue("CreateUserQuotaResponse.Code"));
		createUserQuotaResponse.setMessage(context.stringValue("CreateUserQuotaResponse.Message"));
		createUserQuotaResponse.setSuccess(context.booleanValue("CreateUserQuotaResponse.Success"));
		createUserQuotaResponse.setData(context.booleanValue("CreateUserQuotaResponse.Data"));
	 
	 	return createUserQuotaResponse;
	}
}