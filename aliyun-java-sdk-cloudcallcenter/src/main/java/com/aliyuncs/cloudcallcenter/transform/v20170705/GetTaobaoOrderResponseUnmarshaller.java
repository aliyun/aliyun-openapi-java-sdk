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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetTaobaoOrderResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetTaobaoOrderResponse.TaobaoOrder;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaobaoOrderResponseUnmarshaller {

	public static GetTaobaoOrderResponse unmarshall(GetTaobaoOrderResponse getTaobaoOrderResponse, UnmarshallerContext context) {
		
		getTaobaoOrderResponse.setRequestId(context.stringValue("GetTaobaoOrderResponse.RequestId"));
		getTaobaoOrderResponse.setSuccess(context.booleanValue("GetTaobaoOrderResponse.Success"));
		getTaobaoOrderResponse.setCode(context.stringValue("GetTaobaoOrderResponse.Code"));
		getTaobaoOrderResponse.setMessage(context.stringValue("GetTaobaoOrderResponse.Message"));
		getTaobaoOrderResponse.setHttpStatusCode(context.integerValue("GetTaobaoOrderResponse.HttpStatusCode"));

		List<TaobaoOrder> orders = new ArrayList<TaobaoOrder>();
		for (int i = 0; i < context.lengthValue("GetTaobaoOrderResponse.Orders.Length"); i++) {
			TaobaoOrder taobaoOrder = new TaobaoOrder();
			taobaoOrder.setId(context.longValue("GetTaobaoOrderResponse.Orders["+ i +"].id"));
			taobaoOrder.setType(context.integerValue("GetTaobaoOrderResponse.Orders["+ i +"].type"));
			taobaoOrder.setIncomingAccount(context.integerValue("GetTaobaoOrderResponse.Orders["+ i +"].incomingAccount"));
			taobaoOrder.setOutcomingAccount(context.integerValue("GetTaobaoOrderResponse.Orders["+ i +"].outcomingAccount"));
			taobaoOrder.setConsumedIncomingAccount(context.integerValue("GetTaobaoOrderResponse.Orders["+ i +"].consumedIncomingAccount"));
			taobaoOrder.setConsumedOutcomingAccount(context.integerValue("GetTaobaoOrderResponse.Orders["+ i +"].consumedOutcomingAccount"));
			taobaoOrder.setConfirmedAccount(context.integerValue("GetTaobaoOrderResponse.Orders["+ i +"].confirmedAccount"));
			taobaoOrder.setLastCalculateTime(context.longValue("GetTaobaoOrderResponse.Orders["+ i +"].lastCalculateTime"));
			taobaoOrder.setExpiresIn(context.longValue("GetTaobaoOrderResponse.Orders["+ i +"].expiresIn"));
			taobaoOrder.setOrderRecordId(context.longValue("GetTaobaoOrderResponse.Orders["+ i +"].orderRecordId"));
			taobaoOrder.setOrderId(context.longValue("GetTaobaoOrderResponse.Orders["+ i +"].OrderId"));
			taobaoOrder.setParentOrderId(context.longValue("GetTaobaoOrderResponse.Orders["+ i +"].ParentOrderId"));
			taobaoOrder.setPlanId(context.longValue("GetTaobaoOrderResponse.Orders["+ i +"].planId"));
			taobaoOrder.setStartDate(context.longValue("GetTaobaoOrderResponse.Orders["+ i +"].startDate"));
			taobaoOrder.setStatus(context.integerValue("GetTaobaoOrderResponse.Orders["+ i +"].status"));
			taobaoOrder.setProdFee(context.floatValue("GetTaobaoOrderResponse.Orders["+ i +"].prodFee"));
			taobaoOrder.setTaobaoNick(context.stringValue("GetTaobaoOrderResponse.Orders["+ i +"].taobaoNick"));
			taobaoOrder.setTaobaoUid(context.longValue("GetTaobaoOrderResponse.Orders["+ i +"].TaobaoUid"));
			taobaoOrder.setPayDate(context.longValue("GetTaobaoOrderResponse.Orders["+ i +"].payDate"));
			taobaoOrder.setFactMoney(context.floatValue("GetTaobaoOrderResponse.Orders["+ i +"].factMoney"));
			taobaoOrder.setArticleCode(context.stringValue("GetTaobaoOrderResponse.Orders["+ i +"].articleCode"));
			taobaoOrder.setArticleItemCode(context.stringValue("GetTaobaoOrderResponse.Orders["+ i +"].articleItemCode"));

			orders.add(taobaoOrder);
		}
		getTaobaoOrderResponse.setOrders(orders);
	 
	 	return getTaobaoOrderResponse;
	}
}