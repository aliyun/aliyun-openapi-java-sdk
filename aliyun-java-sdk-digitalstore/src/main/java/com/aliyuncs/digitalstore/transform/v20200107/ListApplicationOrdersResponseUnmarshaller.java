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

import com.aliyuncs.digitalstore.model.v20200107.ListApplicationOrdersResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListApplicationOrdersResponse.ApplyOrderModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationOrdersResponseUnmarshaller {

	public static ListApplicationOrdersResponse unmarshall(ListApplicationOrdersResponse listApplicationOrdersResponse, UnmarshallerContext _ctx) {
		
		listApplicationOrdersResponse.setRequestId(_ctx.stringValue("ListApplicationOrdersResponse.RequestId"));
		listApplicationOrdersResponse.setPageSize(_ctx.integerValue("ListApplicationOrdersResponse.PageSize"));
		listApplicationOrdersResponse.setTotalCount(_ctx.integerValue("ListApplicationOrdersResponse.TotalCount"));
		listApplicationOrdersResponse.setPageNumber(_ctx.integerValue("ListApplicationOrdersResponse.PageNumber"));
		listApplicationOrdersResponse.setSuccess(_ctx.booleanValue("ListApplicationOrdersResponse.Success"));

		List<ApplyOrderModel> applyOrders = new ArrayList<ApplyOrderModel>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationOrdersResponse.ApplyOrders.Length"); i++) {
			ApplyOrderModel applyOrderModel = new ApplyOrderModel();
			applyOrderModel.setOrderId(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].OrderId"));
			applyOrderModel.setConfirmTotal(_ctx.integerValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ConfirmTotal"));
			applyOrderModel.setCode(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].Code"));
			applyOrderModel.setUpdateDate(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].UpdateDate"));
			applyOrderModel.setWarehouseName(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].WarehouseName"));
			applyOrderModel.setProductionOrderQuantity(_ctx.integerValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ProductionOrderQuantity"));
			applyOrderModel.setWarehouseCode(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].WarehouseCode"));
			applyOrderModel.setConfirmDateTime(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ConfirmDateTime"));
			applyOrderModel.setConfirmCaseQuantity(_ctx.integerValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ConfirmCaseQuantity"));
			applyOrderModel.setProductionOrderSourceOrderCode(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ProductionOrderSourceOrderCode"));
			applyOrderModel.setConfirmDeliveryDate(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ConfirmDeliveryDate"));
			applyOrderModel.setPurchaseOrderCode(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].PurchaseOrderCode"));
			applyOrderModel.setRejectReason(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].RejectReason"));
			applyOrderModel.setTotal(_ctx.integerValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].Total"));
			applyOrderModel.setDeliveryDate(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].DeliveryDate"));
			applyOrderModel.setConfirmDeliveryDateTimeRange(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ConfirmDeliveryDateTimeRange"));
			applyOrderModel.setProductId(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ProductId"));
			applyOrderModel.setFromBusinessUnitCode(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].FromBusinessUnitCode"));
			applyOrderModel.setFromBusinessUnitId(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].FromBusinessUnitId"));
			applyOrderModel.setCreateDate(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].CreateDate"));
			applyOrderModel.setToWarehouseContact(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ToWarehouseContact"));
			applyOrderModel.setContractNumber(_ctx.integerValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ContractNumber"));
			applyOrderModel.setWarehouseId(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].WarehouseId"));
			applyOrderModel.setCaseQuantity(_ctx.integerValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].CaseQuantity"));
			applyOrderModel.setPurchaseOrderId(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].PurchaseOrderId"));
			applyOrderModel.setSourceOrderCode(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].SourceOrderCode"));
			applyOrderModel.setToWarehouseTel(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ToWarehouseTel"));
			applyOrderModel.setReceivedQuantity(_ctx.integerValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ReceivedQuantity"));
			applyOrderModel.setStatus(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].Status"));
			applyOrderModel.setFromBusinessUnitName(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].FromBusinessUnitName"));
			applyOrderModel.setScanType(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ScanType"));
			applyOrderModel.setToWarehouseAddress(_ctx.stringValue("ListApplicationOrdersResponse.ApplyOrders["+ i +"].ToWarehouseAddress"));

			applyOrders.add(applyOrderModel);
		}
		listApplicationOrdersResponse.setApplyOrders(applyOrders);
	 
	 	return listApplicationOrdersResponse;
	}
}