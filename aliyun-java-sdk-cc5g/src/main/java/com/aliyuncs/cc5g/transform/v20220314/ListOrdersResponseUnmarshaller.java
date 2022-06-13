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

package com.aliyuncs.cc5g.transform.v20220314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cc5g.model.v20220314.ListOrdersResponse;
import com.aliyuncs.cc5g.model.v20220314.ListOrdersResponse.Order;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrdersResponseUnmarshaller {

	public static ListOrdersResponse unmarshall(ListOrdersResponse listOrdersResponse, UnmarshallerContext _ctx) {
		
		listOrdersResponse.setRequestId(_ctx.stringValue("ListOrdersResponse.RequestId"));
		listOrdersResponse.setNextToken(_ctx.stringValue("ListOrdersResponse.NextToken"));
		listOrdersResponse.setMaxResults(_ctx.stringValue("ListOrdersResponse.MaxResults"));
		listOrdersResponse.setTotalCount(_ctx.stringValue("ListOrdersResponse.TotalCount"));

		List<Order> orders = new ArrayList<Order>();
		for (int i = 0; i < _ctx.lengthValue("ListOrdersResponse.Orders.Length"); i++) {
			Order order = new Order();
			order.setOrderId(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].OrderId"));
			order.setStatus(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].Status"));
			order.setAction(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].Action"));
			order.setDescription(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].Description"));
			order.setLogisticsId(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].LogisticsId"));
			order.setLogisticsStatus(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].LogisticsStatus"));
			order.setLogisticsType(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].LogisticsType"));
			order.setLogisticsUpdateTime(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].LogisticsUpdateTime"));
			order.setCardCount(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].CardCount"));
			order.setContactName(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].ContactName"));
			order.setContactPhone(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].ContactPhone"));
			order.setPostAddress(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].PostAddress"));
			order.setCreateTime(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].CreateTime"));
			order.setPayTime(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].PayTime"));
			order.setRegionId(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].RegionId"));
			order.setCardType(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].CardType"));
			order.setCardNetType(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].CardNetType"));

			orders.add(order);
		}
		listOrdersResponse.setOrders(orders);
	 
	 	return listOrdersResponse;
	}
}