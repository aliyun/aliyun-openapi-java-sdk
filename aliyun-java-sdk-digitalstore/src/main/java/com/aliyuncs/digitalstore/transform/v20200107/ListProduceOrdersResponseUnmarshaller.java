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

import com.aliyuncs.digitalstore.model.v20200107.ListProduceOrdersResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListProduceOrdersResponse.ProduceOrderModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProduceOrdersResponseUnmarshaller {

	public static ListProduceOrdersResponse unmarshall(ListProduceOrdersResponse listProduceOrdersResponse, UnmarshallerContext _ctx) {
		
		listProduceOrdersResponse.setRequestId(_ctx.stringValue("ListProduceOrdersResponse.RequestId"));
		listProduceOrdersResponse.setPageSize(_ctx.integerValue("ListProduceOrdersResponse.PageSize"));
		listProduceOrdersResponse.setTotalCount(_ctx.integerValue("ListProduceOrdersResponse.TotalCount"));
		listProduceOrdersResponse.setPageNumber(_ctx.integerValue("ListProduceOrdersResponse.PageNumber"));
		listProduceOrdersResponse.setSuccess(_ctx.booleanValue("ListProduceOrdersResponse.Success"));

		List<ProduceOrderModel> orders = new ArrayList<ProduceOrderModel>();
		for (int i = 0; i < _ctx.lengthValue("ListProduceOrdersResponse.Orders.Length"); i++) {
			ProduceOrderModel produceOrderModel = new ProduceOrderModel();
			produceOrderModel.setOrderId(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].OrderId"));
			produceOrderModel.setTotalBinding(_ctx.integerValue("ListProduceOrdersResponse.Orders["+ i +"].TotalBinding"));
			produceOrderModel.setCode(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].Code"));
			produceOrderModel.setUpdateDate(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].UpdateDate"));
			produceOrderModel.setWarehouseName(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].WarehouseName"));
			produceOrderModel.setInboundQuantity(_ctx.integerValue("ListProduceOrdersResponse.Orders["+ i +"].InboundQuantity"));
			produceOrderModel.setBusinessUnitId(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].BusinessUnitId"));
			produceOrderModel.setWarehouseCode(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].WarehouseCode"));
			produceOrderModel.setDescription(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].Description"));
			produceOrderModel.setStyleName(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].StyleName"));
			produceOrderModel.setStyleId(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].StyleId"));
			produceOrderModel.setPurchaseOrderCode(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].PurchaseOrderCode"));
			produceOrderModel.setBusinessAmount(_ctx.floatValue("ListProduceOrdersResponse.Orders["+ i +"].BusinessAmount"));
			produceOrderModel.setDeliveryDate(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].DeliveryDate"));
			produceOrderModel.setBusinessUnitCode(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].BusinessUnitCode"));
			produceOrderModel.setMakeDateTime(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].MakeDateTime"));
			produceOrderModel.setBusinessUnitName(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].BusinessUnitName"));
			produceOrderModel.setTotalBoxQuantity(_ctx.integerValue("ListProduceOrdersResponse.Orders["+ i +"].TotalBoxQuantity"));
			produceOrderModel.setCreateDate(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].CreateDate"));
			produceOrderModel.setStyleCode(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].StyleCode"));
			produceOrderModel.setContractNumber(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].ContractNumber"));
			produceOrderModel.setWarehouseId(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].WarehouseId"));
			produceOrderModel.setQuantity(_ctx.integerValue("ListProduceOrdersResponse.Orders["+ i +"].Quantity"));
			produceOrderModel.setSourceOrderCode(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].SourceOrderCode"));
			produceOrderModel.setPurchaseOrderId(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].PurchaseOrderId"));
			produceOrderModel.setSourceOrderType(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].SourceOrderType"));
			produceOrderModel.setStatus(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].Status"));
			produceOrderModel.setScanType(_ctx.stringValue("ListProduceOrdersResponse.Orders["+ i +"].ScanType"));
			produceOrderModel.setApplyOrderQuantity(_ctx.integerValue("ListProduceOrdersResponse.Orders["+ i +"].ApplyOrderQuantity"));
			produceOrderModel.setApplyCaseQuantity(_ctx.integerValue("ListProduceOrdersResponse.Orders["+ i +"].ApplyCaseQuantity"));

			orders.add(produceOrderModel);
		}
		listProduceOrdersResponse.setOrders(orders);
	 
	 	return listProduceOrdersResponse;
	}
}