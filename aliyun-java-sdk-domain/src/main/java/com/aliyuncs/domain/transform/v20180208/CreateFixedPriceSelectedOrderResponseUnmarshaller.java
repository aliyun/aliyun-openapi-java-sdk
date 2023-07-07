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

package com.aliyuncs.domain.transform.v20180208;

import com.aliyuncs.domain.model.v20180208.CreateFixedPriceSelectedOrderResponse;
import com.aliyuncs.domain.model.v20180208.CreateFixedPriceSelectedOrderResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFixedPriceSelectedOrderResponseUnmarshaller {

	public static CreateFixedPriceSelectedOrderResponse unmarshall(CreateFixedPriceSelectedOrderResponse createFixedPriceSelectedOrderResponse, UnmarshallerContext _ctx) {
		
		createFixedPriceSelectedOrderResponse.setRequestId(_ctx.stringValue("CreateFixedPriceSelectedOrderResponse.RequestId"));
		createFixedPriceSelectedOrderResponse.setHttpStatusCode(_ctx.integerValue("CreateFixedPriceSelectedOrderResponse.HttpStatusCode"));
		createFixedPriceSelectedOrderResponse.setErrorCode(_ctx.stringValue("CreateFixedPriceSelectedOrderResponse.ErrorCode"));
		createFixedPriceSelectedOrderResponse.setSuccess(_ctx.booleanValue("CreateFixedPriceSelectedOrderResponse.Success"));

		Module module = new Module();
		module.setOrderNo(_ctx.stringValue("CreateFixedPriceSelectedOrderResponse.Module.OrderNo"));
		module.setDomain(_ctx.stringValue("CreateFixedPriceSelectedOrderResponse.Module.Domain"));
		module.setPrice(_ctx.longValue("CreateFixedPriceSelectedOrderResponse.Module.Price"));
		createFixedPriceSelectedOrderResponse.setModule(module);
	 
	 	return createFixedPriceSelectedOrderResponse;
	}
}