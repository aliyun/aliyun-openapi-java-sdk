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

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateCCCPhoneNumberOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCCCPhoneNumberOrderResponseUnmarshaller {

	public static CreateCCCPhoneNumberOrderResponse unmarshall(CreateCCCPhoneNumberOrderResponse createCCCPhoneNumberOrderResponse, UnmarshallerContext context) {
		
		createCCCPhoneNumberOrderResponse.setRequestId(context.stringValue("CreateCCCPhoneNumberOrderResponse.RequestId"));
		createCCCPhoneNumberOrderResponse.setSuccess(context.booleanValue("CreateCCCPhoneNumberOrderResponse.Success"));
		createCCCPhoneNumberOrderResponse.setCode(context.stringValue("CreateCCCPhoneNumberOrderResponse.Code"));
		createCCCPhoneNumberOrderResponse.setMessage(context.stringValue("CreateCCCPhoneNumberOrderResponse.Message"));
		createCCCPhoneNumberOrderResponse.setHttpStatusCode(context.integerValue("CreateCCCPhoneNumberOrderResponse.HttpStatusCode"));
		createCCCPhoneNumberOrderResponse.setOrderPayUrl(context.stringValue("CreateCCCPhoneNumberOrderResponse.OrderPayUrl"));
	 
	 	return createCCCPhoneNumberOrderResponse;
	}
}