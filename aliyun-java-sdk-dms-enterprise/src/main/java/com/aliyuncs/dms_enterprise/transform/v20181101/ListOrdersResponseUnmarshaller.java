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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListOrdersResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListOrdersResponse.Order;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrdersResponseUnmarshaller {

	public static ListOrdersResponse unmarshall(ListOrdersResponse listOrdersResponse, UnmarshallerContext _ctx) {
		
		listOrdersResponse.setRequestId(_ctx.stringValue("ListOrdersResponse.RequestId"));
		listOrdersResponse.setTotalCount(_ctx.longValue("ListOrdersResponse.TotalCount"));
		listOrdersResponse.setErrorCode(_ctx.stringValue("ListOrdersResponse.ErrorCode"));
		listOrdersResponse.setErrorMessage(_ctx.stringValue("ListOrdersResponse.ErrorMessage"));
		listOrdersResponse.setSuccess(_ctx.booleanValue("ListOrdersResponse.Success"));

		List<Order> orders = new ArrayList<Order>();
		for (int i = 0; i < _ctx.lengthValue("ListOrdersResponse.Orders.Length"); i++) {
			Order order = new Order();
			order.setStatusDesc(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].StatusDesc"));
			order.setComment(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].Comment"));
			order.setCreateTime(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].CreateTime"));
			order.setCommitter(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].Committer"));
			order.setOrderId(_ctx.longValue("ListOrdersResponse.Orders["+ i +"].OrderId"));
			order.setLastModifyTime(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].LastModifyTime"));
			order.setPluginType(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].PluginType"));
			order.setCommitterId(_ctx.longValue("ListOrdersResponse.Orders["+ i +"].CommitterId"));
			order.setStatusCode(_ctx.stringValue("ListOrdersResponse.Orders["+ i +"].StatusCode"));

			orders.add(order);
		}
		listOrdersResponse.setOrders(orders);
	 
	 	return listOrdersResponse;
	}
}