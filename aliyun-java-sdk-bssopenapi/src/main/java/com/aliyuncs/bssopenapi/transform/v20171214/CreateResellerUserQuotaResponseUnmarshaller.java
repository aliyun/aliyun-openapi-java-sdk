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

import com.aliyuncs.bssopenapi.model.v20171214.CreateResellerUserQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateResellerUserQuotaResponseUnmarshaller {

	public static CreateResellerUserQuotaResponse unmarshall(CreateResellerUserQuotaResponse createResellerUserQuotaResponse, UnmarshallerContext context) {
		
		createResellerUserQuotaResponse.setRequestId(context.stringValue("CreateResellerUserQuotaResponse.RequestId"));
		createResellerUserQuotaResponse.setCode(context.stringValue("CreateResellerUserQuotaResponse.Code"));
		createResellerUserQuotaResponse.setMessage(context.stringValue("CreateResellerUserQuotaResponse.Message"));
		createResellerUserQuotaResponse.setSuccess(context.booleanValue("CreateResellerUserQuotaResponse.Success"));
		createResellerUserQuotaResponse.setData(context.booleanValue("CreateResellerUserQuotaResponse.Data"));
	 
	 	return createResellerUserQuotaResponse;
	}
}