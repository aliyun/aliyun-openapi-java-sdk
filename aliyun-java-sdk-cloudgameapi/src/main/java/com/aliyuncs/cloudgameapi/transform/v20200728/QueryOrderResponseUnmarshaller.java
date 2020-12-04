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

import com.aliyuncs.cloudgameapi.model.v20200728.QueryOrderResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.QueryOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrderResponseUnmarshaller {

	public static QueryOrderResponse unmarshall(QueryOrderResponse queryOrderResponse, UnmarshallerContext _ctx) {
		
		queryOrderResponse.setRequestId(_ctx.stringValue("QueryOrderResponse.RequestId"));
		queryOrderResponse.setDeliveryStatus(_ctx.stringValue("QueryOrderResponse.DeliveryStatus"));
		queryOrderResponse.setRefundStatus(_ctx.stringValue("QueryOrderResponse.RefundStatus"));

		Data data = new Data();
		data.setOrderId(_ctx.stringValue("QueryOrderResponse.Data.OrderId"));
		data.setItemId(_ctx.stringValue("QueryOrderResponse.Data.ItemId"));
		data.setSkuId(_ctx.stringValue("QueryOrderResponse.Data.SkuId"));
		data.setCreateTime(_ctx.longValue("QueryOrderResponse.Data.CreateTime"));
		data.setApplyDeliveryTime(_ctx.longValue("QueryOrderResponse.Data.ApplyDeliveryTime"));
		data.setFinishTime(_ctx.longValue("QueryOrderResponse.Data.FinishTime"));
		data.setOriginPrice(_ctx.longValue("QueryOrderResponse.Data.OriginPrice"));
		data.setSettlementPrice(_ctx.longValue("QueryOrderResponse.Data.SettlementPrice"));
		data.setAmount(_ctx.longValue("QueryOrderResponse.Data.Amount"));
		data.setStatus(_ctx.stringValue("QueryOrderResponse.Data.Status"));
		data.setBuyerAccountId(_ctx.stringValue("QueryOrderResponse.Data.BuyerAccountId"));
		data.setAutoUnlockTime(_ctx.longValue("QueryOrderResponse.Data.AutoUnlockTime"));
		data.setAccountDomain(_ctx.stringValue("QueryOrderResponse.Data.AccountDomain"));
		queryOrderResponse.setData(data);
	 
	 	return queryOrderResponse;
	}
}