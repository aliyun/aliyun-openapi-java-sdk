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

import com.aliyuncs.digitalstore.model.v20200107.ListTakeStockOrdersResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListTakeStockOrdersResponse.TakeStockOrderModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTakeStockOrdersResponseUnmarshaller {

	public static ListTakeStockOrdersResponse unmarshall(ListTakeStockOrdersResponse listTakeStockOrdersResponse, UnmarshallerContext _ctx) {
		
		listTakeStockOrdersResponse.setRequestId(_ctx.stringValue("ListTakeStockOrdersResponse.RequestId"));
		listTakeStockOrdersResponse.setPageSize(_ctx.integerValue("ListTakeStockOrdersResponse.PageSize"));
		listTakeStockOrdersResponse.setTotalCount(_ctx.integerValue("ListTakeStockOrdersResponse.TotalCount"));
		listTakeStockOrdersResponse.setPageNumber(_ctx.integerValue("ListTakeStockOrdersResponse.PageNumber"));
		listTakeStockOrdersResponse.setSuccess(_ctx.booleanValue("ListTakeStockOrdersResponse.Success"));

		List<TakeStockOrderModel> takeStockOrders = new ArrayList<TakeStockOrderModel>();
		for (int i = 0; i < _ctx.lengthValue("ListTakeStockOrdersResponse.TakeStockOrders.Length"); i++) {
			TakeStockOrderModel takeStockOrderModel = new TakeStockOrderModel();
			takeStockOrderModel.setWarehouseCode(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].WarehouseCode"));
			takeStockOrderModel.setCreateDate(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].CreateDate"));
			takeStockOrderModel.setWarehouseName(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].WarehouseName"));
			takeStockOrderModel.setConfirmDateTime(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].ConfirmDateTime"));
			takeStockOrderModel.setDescription(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].Description"));
			takeStockOrderModel.setOrderId(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].OrderId"));
			takeStockOrderModel.setUpdateDate(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].UpdateDate"));
			takeStockOrderModel.setCode(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].Code"));
			takeStockOrderModel.setSyncStatus(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].SyncStatus"));
			takeStockOrderModel.setStatus(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].Status"));
			takeStockOrderModel.setMakeDateTime(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].MakeDateTime"));
			takeStockOrderModel.setSourceOrderCode(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].SourceOrderCode"));
			takeStockOrderModel.setLastSyncDateTime(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].LastSyncDateTime"));
			takeStockOrderModel.setWarehouseId(_ctx.stringValue("ListTakeStockOrdersResponse.TakeStockOrders["+ i +"].WarehouseId"));

			takeStockOrders.add(takeStockOrderModel);
		}
		listTakeStockOrdersResponse.setTakeStockOrders(takeStockOrders);
	 
	 	return listTakeStockOrdersResponse;
	}
}