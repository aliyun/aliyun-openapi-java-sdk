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

package com.aliyuncs.domain.transform.v20180129;

import com.aliyuncs.domain.model.v20180129.CreateIntlFixedPriceDomainOrderResponse;
import com.aliyuncs.domain.model.v20180129.CreateIntlFixedPriceDomainOrderResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateIntlFixedPriceDomainOrderResponseUnmarshaller {

	public static CreateIntlFixedPriceDomainOrderResponse unmarshall(CreateIntlFixedPriceDomainOrderResponse createIntlFixedPriceDomainOrderResponse, UnmarshallerContext _ctx) {
		
		createIntlFixedPriceDomainOrderResponse.setRequestId(_ctx.stringValue("CreateIntlFixedPriceDomainOrderResponse.RequestId"));

		Module module = new Module();
		module.setDomain(_ctx.stringValue("CreateIntlFixedPriceDomainOrderResponse.Module.Domain"));
		module.setOrderNo(_ctx.stringValue("CreateIntlFixedPriceDomainOrderResponse.Module.OrderNo"));
		module.setPayPrice(_ctx.longValue("CreateIntlFixedPriceDomainOrderResponse.Module.PayPrice"));
		module.setPayUrl(_ctx.stringValue("CreateIntlFixedPriceDomainOrderResponse.Module.PayUrl"));
		createIntlFixedPriceDomainOrderResponse.setModule(module);
	 
	 	return createIntlFixedPriceDomainOrderResponse;
	}
}