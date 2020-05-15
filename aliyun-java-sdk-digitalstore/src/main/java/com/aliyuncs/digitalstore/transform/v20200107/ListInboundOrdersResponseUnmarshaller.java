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

import com.aliyuncs.digitalstore.model.v20200107.ListInboundOrdersResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListInboundOrdersResponse.InboundOrder;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInboundOrdersResponseUnmarshaller {

	public static ListInboundOrdersResponse unmarshall(ListInboundOrdersResponse listInboundOrdersResponse, UnmarshallerContext _ctx) {
		
		listInboundOrdersResponse.setRequestId(_ctx.stringValue("ListInboundOrdersResponse.RequestId"));
		listInboundOrdersResponse.setPageSize(_ctx.integerValue("ListInboundOrdersResponse.PageSize"));
		listInboundOrdersResponse.setTotalCount(_ctx.integerValue("ListInboundOrdersResponse.TotalCount"));
		listInboundOrdersResponse.setPageNumber(_ctx.integerValue("ListInboundOrdersResponse.PageNumber"));
		listInboundOrdersResponse.setSuccess(_ctx.booleanValue("ListInboundOrdersResponse.Success"));

		List<InboundOrder> inboundOrders = new ArrayList<InboundOrder>();
		for (int i = 0; i < _ctx.lengthValue("ListInboundOrdersResponse.InboundOrders.Length"); i++) {
			InboundOrder inboundOrder = new InboundOrder();
			inboundOrder.setToWarehouseName(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].ToWarehouseName"));
			inboundOrder.setConfirmTime(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].ConfirmTime"));
			inboundOrder.setOrderSubTypeCode(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].OrderSubTypeCode"));
			inboundOrder.setOrderStatus(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].OrderStatus"));
			inboundOrder.setDescription(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].Description"));
			inboundOrder.setOperateQuantity(_ctx.integerValue("ListInboundOrdersResponse.InboundOrders["+ i +"].OperateQuantity"));
			inboundOrder.setFromWarehouseId(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].FromWarehouseId"));
			inboundOrder.setLastSyncTime(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].LastSyncTime"));
			inboundOrder.setConfirmQuantity(_ctx.integerValue("ListInboundOrdersResponse.InboundOrders["+ i +"].ConfirmQuantity"));
			inboundOrder.setModifiedTime(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].ModifiedTime"));
			inboundOrder.setFromBusinessUnitId(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].FromBusinessUnitId"));
			inboundOrder.setId(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].Id"));
			inboundOrder.setFromBusinessUnitName(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].FromBusinessUnitName"));
			inboundOrder.setOrderCode(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].OrderCode"));
			inboundOrder.setCreatedTime(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].CreatedTime"));
			inboundOrder.setToWarehouseId(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].ToWarehouseId"));
			inboundOrder.setSyncStatus(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].SyncStatus"));
			inboundOrder.setFromWarehouseName(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].FromWarehouseName"));
			inboundOrder.setQuantity(_ctx.integerValue("ListInboundOrdersResponse.InboundOrders["+ i +"].Quantity"));
			inboundOrder.setSourceOrderCode(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].SourceOrderCode"));
			inboundOrder.setOrderId(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].OrderId"));
			inboundOrder.setToBusinessUnitId(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].ToBusinessUnitId"));
			inboundOrder.setCaseCount(_ctx.integerValue("ListInboundOrdersResponse.InboundOrders["+ i +"].CaseCount"));
			inboundOrder.setToWarehouseCode(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].ToWarehouseCode"));
			inboundOrder.setFromWarehouseCode(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].FromWarehouseCode"));
			inboundOrder.setToBusinessUnitCode(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].ToBusinessUnitCode"));
			inboundOrder.setFromBusinessUnitCode(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].FromBusinessUnitCode"));
			inboundOrder.setCreateUserId(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].CreateUserId"));
			inboundOrder.setCreateUserName(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].CreateUserName"));
			inboundOrder.setCreateDateTime(_ctx.stringValue("ListInboundOrdersResponse.InboundOrders["+ i +"].CreateDateTime"));

			inboundOrders.add(inboundOrder);
		}
		listInboundOrdersResponse.setInboundOrders(inboundOrders);
	 
	 	return listInboundOrdersResponse;
	}
}