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

package com.aliyuncs.cloudgameapi.transform.v20200728;

import com.aliyuncs.cloudgameapi.model.v20200728.CreateOrderResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.CreateOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrderResponseUnmarshaller {

	public static CreateOrderResponse unmarshall(CreateOrderResponse createOrderResponse, UnmarshallerContext _ctx) {
		
		createOrderResponse.setRequestId(_ctx.stringValue("CreateOrderResponse.RequestId"));

		Data data = new Data();
		data.setOrderId(_ctx.stringValue("CreateOrderResponse.Data.OrderId"));
		data.setItemId(_ctx.stringValue("CreateOrderResponse.Data.ItemId"));
		data.setSkuId(_ctx.stringValue("CreateOrderResponse.Data.SkuId"));
		data.setCreateTime(_ctx.longValue("CreateOrderResponse.Data.CreateTime"));
		data.setApplyDeliveryTime(_ctx.longValue("CreateOrderResponse.Data.ApplyDeliveryTime"));
		data.setFinishTime(_ctx.longValue("CreateOrderResponse.Data.FinishTime"));
		data.setOriginPrice(_ctx.longValue("CreateOrderResponse.Data.OriginPrice"));
		data.setSettlementPrice(_ctx.longValue("CreateOrderResponse.Data.SettlementPrice"));
		data.setAmount(_ctx.longValue("CreateOrderResponse.Data.Amount"));
		data.setStatus(_ctx.stringValue("CreateOrderResponse.Data.Status"));
		data.setBuyerAccountId(_ctx.stringValue("CreateOrderResponse.Data.BuyerAccountId"));
		data.setAutoUnlockTime(_ctx.longValue("CreateOrderResponse.Data.AutoUnlockTime"));
		data.setAccountDomain(_ctx.stringValue("CreateOrderResponse.Data.AccountDomain"));
		createOrderResponse.setData(data);
	 
	 	return createOrderResponse;
	}
}