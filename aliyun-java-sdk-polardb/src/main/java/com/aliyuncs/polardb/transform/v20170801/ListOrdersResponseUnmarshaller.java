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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.ListOrdersResponse;
import com.aliyuncs.polardb.model.v20170801.ListOrdersResponse.Order;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrdersResponseUnmarshaller {

	public static ListOrdersResponse unmarshall(ListOrdersResponse listOrdersResponse, UnmarshallerContext _ctx) {
		
		listOrdersResponse.setRequestId(_ctx.stringValue("ListOrdersResponse.RequestId"));
		listOrdersResponse.setMaxResults(_ctx.integerValue("ListOrdersResponse.MaxResults"));
		listOrdersResponse.setNextToken(_ctx.stringValue("ListOrdersResponse.NextToken"));
		listOrdersResponse.setPageNumber(_ctx.integerValue("ListOrdersResponse.PageNumber"));
		listOrdersResponse.setPageSize(_ctx.integerValue("ListOrdersResponse.PageSize"));
		listOrdersResponse.setTotalCount(_ctx.integerValue("ListOrdersResponse.TotalCount"));

		List<Order> orderList = new ArrayList<Order>();
		for (int i = 0; i < _ctx.lengthValue("ListOrdersResponse.OrderList.Length"); i++) {
			Order order = new Order();
			order.setAliUid(_ctx.stringValue("ListOrdersResponse.OrderList["+ i +"].AliUid"));
			order.setChargeType(_ctx.stringValue("ListOrdersResponse.OrderList["+ i +"].ChargeType"));
			order.setCommodityCode(_ctx.stringValue("ListOrdersResponse.OrderList["+ i +"].CommodityCode"));
			order.setCreatedTime(_ctx.stringValue("ListOrdersResponse.OrderList["+ i +"].CreatedTime"));
			order.setInstanceId(_ctx.stringValue("ListOrdersResponse.OrderList["+ i +"].InstanceId"));
			order.setOrderId(_ctx.stringValue("ListOrdersResponse.OrderList["+ i +"].OrderId"));
			order.setOrderStatus(_ctx.stringValue("ListOrdersResponse.OrderList["+ i +"].OrderStatus"));
			order.setOrderType(_ctx.stringValue("ListOrdersResponse.OrderList["+ i +"].OrderType"));
			order.setProduceCode(_ctx.stringValue("ListOrdersResponse.OrderList["+ i +"].ProduceCode"));
			order.setRegion(_ctx.stringValue("ListOrdersResponse.OrderList["+ i +"].Region"));

			orderList.add(order);
		}
		listOrdersResponse.setOrderList(orderList);
	 
	 	return listOrdersResponse;
	}
}