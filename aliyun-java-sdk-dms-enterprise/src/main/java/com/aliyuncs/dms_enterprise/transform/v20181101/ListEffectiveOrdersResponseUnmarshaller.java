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

import com.aliyuncs.dms_enterprise.model.v20181101.ListEffectiveOrdersResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListEffectiveOrdersResponse.OrderSummaryItem;
import com.aliyuncs.dms_enterprise.model.v20181101.ListEffectiveOrdersResponse.OrderSummaryItem.OrderListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEffectiveOrdersResponseUnmarshaller {

	public static ListEffectiveOrdersResponse unmarshall(ListEffectiveOrdersResponse listEffectiveOrdersResponse, UnmarshallerContext _ctx) {
		
		listEffectiveOrdersResponse.setRequestId(_ctx.stringValue("ListEffectiveOrdersResponse.RequestId"));
		listEffectiveOrdersResponse.setSuccess(_ctx.booleanValue("ListEffectiveOrdersResponse.Success"));
		listEffectiveOrdersResponse.setErrorMessage(_ctx.stringValue("ListEffectiveOrdersResponse.ErrorMessage"));
		listEffectiveOrdersResponse.setErrorCode(_ctx.stringValue("ListEffectiveOrdersResponse.ErrorCode"));

		List<OrderSummaryItem> orderSummary = new ArrayList<OrderSummaryItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEffectiveOrdersResponse.OrderSummary.Length"); i++) {
			OrderSummaryItem orderSummaryItem = new OrderSummaryItem();
			orderSummaryItem.setCommodityCode(_ctx.stringValue("ListEffectiveOrdersResponse.OrderSummary["+ i +"].CommodityCode"));
			orderSummaryItem.setCommodityType(_ctx.stringValue("ListEffectiveOrdersResponse.OrderSummary["+ i +"].CommodityType"));
			orderSummaryItem.setVersionType(_ctx.stringValue("ListEffectiveOrdersResponse.OrderSummary["+ i +"].VersionType"));
			orderSummaryItem.setTotalQuota(_ctx.integerValue("ListEffectiveOrdersResponse.OrderSummary["+ i +"].TotalQuota"));

			List<OrderListItem> orderList = new ArrayList<OrderListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEffectiveOrdersResponse.OrderSummary["+ i +"].OrderList.Length"); j++) {
				OrderListItem orderListItem = new OrderListItem();
				orderListItem.setOrderId(_ctx.stringValue("ListEffectiveOrdersResponse.OrderSummary["+ i +"].OrderList["+ j +"].OrderId"));
				orderListItem.setBuyerId(_ctx.stringValue("ListEffectiveOrdersResponse.OrderSummary["+ i +"].OrderList["+ j +"].BuyerId"));
				orderListItem.setInstanceId(_ctx.stringValue("ListEffectiveOrdersResponse.OrderSummary["+ i +"].OrderList["+ j +"].InstanceId"));
				orderListItem.setStartTime(_ctx.stringValue("ListEffectiveOrdersResponse.OrderSummary["+ i +"].OrderList["+ j +"].StartTime"));
				orderListItem.setEndTime(_ctx.stringValue("ListEffectiveOrdersResponse.OrderSummary["+ i +"].OrderList["+ j +"].EndTime"));
				orderListItem.setInsNum(_ctx.stringValue("ListEffectiveOrdersResponse.OrderSummary["+ i +"].OrderList["+ j +"].InsNum"));

				orderList.add(orderListItem);
			}
			orderSummaryItem.setOrderList(orderList);

			orderSummary.add(orderSummaryItem);
		}
		listEffectiveOrdersResponse.setOrderSummary(orderSummary);
	 
	 	return listEffectiveOrdersResponse;
	}
}