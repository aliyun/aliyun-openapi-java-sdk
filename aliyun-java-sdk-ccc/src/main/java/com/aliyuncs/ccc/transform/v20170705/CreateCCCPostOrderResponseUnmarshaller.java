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

import com.aliyuncs.ccc.model.v20170705.CreateCCCPostOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCCCPostOrderResponseUnmarshaller {

	public static CreateCCCPostOrderResponse unmarshall(CreateCCCPostOrderResponse createCCCPostOrderResponse, UnmarshallerContext context) {
		
		createCCCPostOrderResponse.setRequestId(context.stringValue("CreateCCCPostOrderResponse.RequestId"));
		createCCCPostOrderResponse.setSuccess(context.booleanValue("CreateCCCPostOrderResponse.Success"));
		createCCCPostOrderResponse.setCode(context.stringValue("CreateCCCPostOrderResponse.Code"));
		createCCCPostOrderResponse.setMessage(context.stringValue("CreateCCCPostOrderResponse.Message"));
		createCCCPostOrderResponse.setHttpStatusCode(context.integerValue("CreateCCCPostOrderResponse.HttpStatusCode"));
		createCCCPostOrderResponse.setOrderId(context.stringValue("CreateCCCPostOrderResponse.OrderId"));
	 
	 	return createCCCPostOrderResponse;
	}
}