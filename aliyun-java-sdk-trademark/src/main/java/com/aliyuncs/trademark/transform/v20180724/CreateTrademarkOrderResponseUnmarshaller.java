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

package com.aliyuncs.trademark.transform.v20180724;

import com.aliyuncs.trademark.model.v20180724.CreateTrademarkOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTrademarkOrderResponseUnmarshaller {

	public static CreateTrademarkOrderResponse unmarshall(CreateTrademarkOrderResponse createTrademarkOrderResponse, UnmarshallerContext _ctx) {
		
		createTrademarkOrderResponse.setRequestId(_ctx.stringValue("CreateTrademarkOrderResponse.RequestId"));
		createTrademarkOrderResponse.setOrderId(_ctx.longValue("CreateTrademarkOrderResponse.OrderId"));
		createTrademarkOrderResponse.setSuccess(_ctx.booleanValue("CreateTrademarkOrderResponse.Success"));
		createTrademarkOrderResponse.setErrorMsg(_ctx.stringValue("CreateTrademarkOrderResponse.ErrorMsg"));
	 
	 	return createTrademarkOrderResponse;
	}
}