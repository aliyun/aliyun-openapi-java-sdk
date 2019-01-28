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

import com.aliyuncs.bssopenapi.model.v20171214.GetOrderDetailResponse;
import com.aliyuncs.bssopenapi.model.v20171214.GetOrderDetailResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.GetOrderDetailResponse.Data.Order;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrderDetailResponseUnmarshaller {

	public static GetOrderDetailResponse unmarshall(GetOrderDetailResponse getOrderDetailResponse, UnmarshallerContext context) {
		
		getOrderDetailResponse.setRequestId(context.stringValue("GetOrderDetailResponse.RequestId"));
		getOrderDetailResponse.setSuccess(context.booleanValue("GetOrderDetailResponse.Success"));
		getOrderDetailResponse.setCode(context.stringValue("GetOrderDetailResponse.Code"));
		getOrderDetailResponse.setMessage(context.stringValue("GetOrderDetailResponse.Message"));

		Data data = new Data();
		data.setHostName(context.stringValue("GetOrderDetailResponse.Data.HostName"));
		data.setPageNum(context.integerValue("GetOrderDetailResponse.Data.PageNum"));
		data.setPageSize(context.integerValue("GetOrderDetailResponse.Data.PageSize"));
		data.setTotalCount(context.integerValue("GetOrderDetailResponse.Data.TotalCount"));

		List<Order> orderList = new ArrayList<Order>();
		for (int i = 0; i < context.lengthValue("GetOrderDetailResponse.Data.OrderList.Length"); i++) {
			Order order = new Order();
			order.setOrderId(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].OrderId"));
			order.setSubOrderId(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].SubOrderId"));
			order.setProductCode(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].ProductCode"));
			order.setProductType(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].ProductType"));
			order.setSubscriptionType(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].SubscriptionType"));
			order.setOrderType(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].OrderType"));
			order.setCreateTime(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].CreateTime"));
			order.setPaymentTime(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].PaymentTime"));
			order.setPaymentStatus(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].PaymentStatus"));
			order.setRegion(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].Region"));
			order.setConfig(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].Config"));
			order.setQuantity(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].Quantity"));
			order.setUsageStartTime(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].UsageStartTime"));
			order.setUsageEndTime(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].UsageEndTime"));
			order.setInstanceIDs(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].InstanceIDs"));
			order.setPretaxGrossAmount(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].PretaxGrossAmount"));
			order.setPretaxAmount(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].PretaxAmount"));
			order.setCurrency(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].Currency"));
			order.setPretaxAmountLocal(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].PretaxAmountLocal"));
			order.setTax(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].Tax"));
			order.setAfterTaxAmount(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].AfterTaxAmount"));
			order.setPaymentCurrency(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].PaymentCurrency"));
			order.setOperator(context.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].Operator"));

			orderList.add(order);
		}
		data.setOrderList(orderList);
		getOrderDetailResponse.setData(data);
	 
	 	return getOrderDetailResponse;
	}
}