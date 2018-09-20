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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryOrdersResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryOrdersResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryOrdersResponse.Data.Order;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrdersResponseUnmarshaller {

	public static QueryOrdersResponse unmarshall(QueryOrdersResponse queryOrdersResponse, UnmarshallerContext context) {
		
		queryOrdersResponse.setRequestId(context.stringValue("QueryOrdersResponse.RequestId"));
		queryOrdersResponse.setSuccess(context.booleanValue("QueryOrdersResponse.Success"));
		queryOrdersResponse.setCode(context.stringValue("QueryOrdersResponse.Code"));
		queryOrdersResponse.setMessage(context.stringValue("QueryOrdersResponse.Message"));

		Data data = new Data();
		data.setHostName(context.stringValue("QueryOrdersResponse.Data.HostName"));
		data.setPageNum(context.integerValue("QueryOrdersResponse.Data.PageNum"));
		data.setPageSize(context.integerValue("QueryOrdersResponse.Data.PageSize"));
		data.setTotalCount(context.integerValue("QueryOrdersResponse.Data.TotalCount"));

		List<Order> orderList = new ArrayList<Order>();
		for (int i = 0; i < context.lengthValue("QueryOrdersResponse.Data.OrderList.Length"); i++) {
			Order order = new Order();
			order.setOrderId(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].OrderId"));
			order.setProductCode(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].ProductCode"));
			order.setProductType(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].ProductType"));
			order.setSubscriptionType(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].SubscriptionType"));
			order.setOrderType(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].OrderType"));
			order.setCreateTime(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].CreateTime"));
			order.setPaymentTime(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].PaymentTime"));
			order.setPaymentStatus(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].PaymentStatus"));
			order.setPretaxGrossAmount(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].PretaxGrossAmount"));
			order.setPretaxAmount(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].PretaxAmount"));
			order.setCurrency(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].Currency"));
			order.setPretaxAmountLocal(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].PretaxAmountLocal"));
			order.setTax(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].Tax"));
			order.setAfterTaxAmount(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].AfterTaxAmount"));
			order.setPaymentCurrency(context.stringValue("QueryOrdersResponse.Data.OrderList["+ i +"].PaymentCurrency"));

			orderList.add(order);
		}
		data.setOrderList(orderList);
		queryOrdersResponse.setData(data);
	 
	 	return queryOrdersResponse;
	}
}