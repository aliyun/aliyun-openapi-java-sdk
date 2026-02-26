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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrderDetailResponseUnmarshaller {

	public static GetOrderDetailResponse unmarshall(GetOrderDetailResponse getOrderDetailResponse, UnmarshallerContext _ctx) {
		
		getOrderDetailResponse.setRequestId(_ctx.stringValue("GetOrderDetailResponse.RequestId"));
		getOrderDetailResponse.setCode(_ctx.stringValue("GetOrderDetailResponse.Code"));
		getOrderDetailResponse.setMessage(_ctx.stringValue("GetOrderDetailResponse.Message"));
		getOrderDetailResponse.setSuccess(_ctx.booleanValue("GetOrderDetailResponse.Success"));

		Data data = new Data();
		data.setHostName(_ctx.stringValue("GetOrderDetailResponse.Data.HostName"));
		data.setPageNum(_ctx.integerValue("GetOrderDetailResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("GetOrderDetailResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("GetOrderDetailResponse.Data.TotalCount"));

		List<Order> orderList = new ArrayList<Order>();
		for (int i = 0; i < _ctx.lengthValue("GetOrderDetailResponse.Data.OrderList.Length"); i++) {
			Order order = new Order();
			order.setOrderSubType(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].OrderSubType"));
			order.setCreateTime(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].CreateTime"));
			order.setCurrency(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].Currency"));
			order.setConfig(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].Config"));
			order.setSubscriptionType(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].SubscriptionType"));
			order.setUsageStartTime(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].UsageStartTime"));
			order.setUsageEndTime(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].UsageEndTime"));
			order.setSubOrderId(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].SubOrderId"));
			order.setRegion(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].Region"));
			order.setAfterTaxAmount(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].AfterTaxAmount"));
			order.setPaymentTime(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].PaymentTime"));
			order.setOperator(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].Operator"));
			order.setOrderType(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].OrderType"));
			order.setPaymentStatus(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].PaymentStatus"));
			order.setQuantity(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].Quantity"));
			order.setPretaxAmountLocal(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].PretaxAmountLocal"));
			order.setTax(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].Tax"));
			order.setOriginalConfig(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].OriginalConfig"));
			order.setPretaxAmount(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].PretaxAmount"));
			order.setCommodityCode(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].CommodityCode"));
			order.setRelatedOrderId(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].RelatedOrderId"));
			order.setPaymentCurrency(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].PaymentCurrency"));
			order.setProductType(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].ProductType"));
			order.setInstanceIDs(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].InstanceIDs"));
			order.setPretaxGrossAmount(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].PretaxGrossAmount"));
			order.setOrderId(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].OrderId"));
			order.setProductCode(_ctx.stringValue("GetOrderDetailResponse.Data.OrderList["+ i +"].ProductCode"));
			order.setExtendInfos(_ctx.mapValue("GetOrderDetailResponse.Data.OrderList["+ i +"].ExtendInfos"));

			orderList.add(order);
		}
		data.setOrderList(orderList);
		getOrderDetailResponse.setData(data);
	 
	 	return getOrderDetailResponse;
	}
}