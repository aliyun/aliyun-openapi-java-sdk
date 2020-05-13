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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListOutboundOrdersResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListOutboundOrdersResponse.OutboundOrder;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOutboundOrdersResponseUnmarshaller {

	public static ListOutboundOrdersResponse unmarshall(ListOutboundOrdersResponse listOutboundOrdersResponse, UnmarshallerContext _ctx) {
		
		listOutboundOrdersResponse.setRequestId(_ctx.stringValue("ListOutboundOrdersResponse.RequestId"));
		listOutboundOrdersResponse.setPageSize(_ctx.integerValue("ListOutboundOrdersResponse.PageSize"));
		listOutboundOrdersResponse.setTotalCount(_ctx.integerValue("ListOutboundOrdersResponse.TotalCount"));
		listOutboundOrdersResponse.setPageNumber(_ctx.integerValue("ListOutboundOrdersResponse.PageNumber"));
		listOutboundOrdersResponse.setSuccess(_ctx.booleanValue("ListOutboundOrdersResponse.Success"));

		List<OutboundOrder> outboundOrders = new ArrayList<OutboundOrder>();
		for (int i = 0; i < _ctx.lengthValue("ListOutboundOrdersResponse.OutboundOrders.Length"); i++) {
			OutboundOrder outboundOrder = new OutboundOrder();
			outboundOrder.setToWarehouseName(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].ToWarehouseName"));
			outboundOrder.setConfirmTime(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].ConfirmTime"));
			outboundOrder.setOrderSubTypeCode(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].OrderSubTypeCode"));
			outboundOrder.setOrderStatus(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].OrderStatus"));
			outboundOrder.setDescription(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].Description"));
			outboundOrder.setOperateQuantity(_ctx.integerValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].OperateQuantity"));
			outboundOrder.setFromWarehouseId(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].FromWarehouseId"));
			outboundOrder.setLastSyncTime(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].LastSyncTime"));
			outboundOrder.setConfirmQuantity(_ctx.integerValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].ConfirmQuantity"));
			outboundOrder.setUpdateDate(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].UpdateDate"));
			outboundOrder.setFromBusinessUnitId(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].FromBusinessUnitId"));
			outboundOrder.setId(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].Id"));
			outboundOrder.setFromBusinessUnitName(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].FromBusinessUnitName"));
			outboundOrder.setOrderCode(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].OrderCode"));
			outboundOrder.setCreateDate(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].CreateDate"));
			outboundOrder.setToWarehouseId(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].ToWarehouseId"));
			outboundOrder.setSyncStatus(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].SyncStatus"));
			outboundOrder.setFromWarehouseName(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].FromWarehouseName"));
			outboundOrder.setQuantity(_ctx.integerValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].Quantity"));
			outboundOrder.setSourceOrderCode(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].SourceOrderCode"));
			outboundOrder.setOrderId(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].OrderId"));
			outboundOrder.setToBusinessUnitId(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].ToBusinessUnitId"));
			outboundOrder.setCaseCount(_ctx.integerValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].CaseCount"));
			outboundOrder.setToWarehouseCode(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].ToWarehouseCode"));
			outboundOrder.setFromWarehouseCode(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].FromWarehouseCode"));
			outboundOrder.setToBusinessUnitCode(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].ToBusinessUnitCode"));
			outboundOrder.setFromBusinessUnitCode(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].FromBusinessUnitCode"));
			outboundOrder.setCreateUserId(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].CreateUserId"));
			outboundOrder.setCreateUserName(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].CreateUserName"));
			outboundOrder.setCreateDateTime(_ctx.stringValue("ListOutboundOrdersResponse.OutboundOrders["+ i +"].CreateDateTime"));

			outboundOrders.add(outboundOrder);
		}
		listOutboundOrdersResponse.setOutboundOrders(outboundOrders);
	 
	 	return listOutboundOrdersResponse;
	}
}