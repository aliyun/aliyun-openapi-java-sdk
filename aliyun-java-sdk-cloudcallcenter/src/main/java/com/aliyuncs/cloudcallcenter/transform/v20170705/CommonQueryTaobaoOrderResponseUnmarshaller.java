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

import com.aliyuncs.cloudcallcenter.model.v20170705.CommonQueryTaobaoOrderResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.CommonQueryTaobaoOrderResponse.TaobaoOrder;
import com.aliyuncs.transform.UnmarshallerContext;


public class CommonQueryTaobaoOrderResponseUnmarshaller {

	public static CommonQueryTaobaoOrderResponse unmarshall(CommonQueryTaobaoOrderResponse commonQueryTaobaoOrderResponse, UnmarshallerContext context) {
		
		commonQueryTaobaoOrderResponse.setRequestId(context.stringValue("CommonQueryTaobaoOrderResponse.RequestId"));
		commonQueryTaobaoOrderResponse.setSuccess(context.booleanValue("CommonQueryTaobaoOrderResponse.Success"));
		commonQueryTaobaoOrderResponse.setCode(context.stringValue("CommonQueryTaobaoOrderResponse.Code"));
		commonQueryTaobaoOrderResponse.setMessage(context.stringValue("CommonQueryTaobaoOrderResponse.Message"));
		commonQueryTaobaoOrderResponse.setHttpStatusCode(context.integerValue("CommonQueryTaobaoOrderResponse.HttpStatusCode"));

		List<TaobaoOrder> orders = new ArrayList<TaobaoOrder>();
		for (int i = 0; i < context.lengthValue("CommonQueryTaobaoOrderResponse.Orders.Length"); i++) {
			TaobaoOrder taobaoOrder = new TaobaoOrder();
			taobaoOrder.setId(context.longValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].id"));
			taobaoOrder.setType(context.integerValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].type"));
			taobaoOrder.setIncomingAccount(context.integerValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].incomingAccount"));
			taobaoOrder.setOutcomingAccount(context.integerValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].outcomingAccount"));
			taobaoOrder.setConsumedIncomingAccount(context.integerValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].consumedIncomingAccount"));
			taobaoOrder.setConsumedOutcomingAccount(context.integerValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].consumedOutcomingAccount"));
			taobaoOrder.setConfirmedAccount(context.integerValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].confirmedAccount"));
			taobaoOrder.setLastCalculateTime(context.longValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].lastCalculateTime"));
			taobaoOrder.setExpiresIn(context.longValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].expiresIn"));
			taobaoOrder.setOrderRecordId(context.longValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].orderRecordId"));
			taobaoOrder.setOrderId(context.longValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].OrderId"));
			taobaoOrder.setParentOrderId(context.longValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].ParentOrderId"));
			taobaoOrder.setPlanId(context.longValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].planId"));
			taobaoOrder.setStartDate(context.longValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].startDate"));
			taobaoOrder.setStatus(context.integerValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].status"));
			taobaoOrder.setProdFee(context.floatValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].prodFee"));
			taobaoOrder.setTaobaoNick(context.stringValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].taobaoNick"));
			taobaoOrder.setTaobaoUid(context.longValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].TaobaoUid"));
			taobaoOrder.setPayDate(context.longValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].payDate"));
			taobaoOrder.setFactMoney(context.floatValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].factMoney"));
			taobaoOrder.setArticleCode(context.stringValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].articleCode"));
			taobaoOrder.setArticleItemCode(context.stringValue("CommonQueryTaobaoOrderResponse.Orders["+ i +"].articleItemCode"));

			orders.add(taobaoOrder);
		}
		commonQueryTaobaoOrderResponse.setOrders(orders);
	 
	 	return commonQueryTaobaoOrderResponse;
	}
}