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

import com.aliyuncs.digitalstore.model.v20200107.ListWarehousesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListWarehousesResponse.WarehouseModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWarehousesResponseUnmarshaller {

	public static ListWarehousesResponse unmarshall(ListWarehousesResponse listWarehousesResponse, UnmarshallerContext _ctx) {
		
		listWarehousesResponse.setRequestId(_ctx.stringValue("ListWarehousesResponse.RequestId"));
		listWarehousesResponse.setPageSize(_ctx.integerValue("ListWarehousesResponse.PageSize"));
		listWarehousesResponse.setTotalCount(_ctx.integerValue("ListWarehousesResponse.TotalCount"));
		listWarehousesResponse.setPageNumber(_ctx.integerValue("ListWarehousesResponse.PageNumber"));
		listWarehousesResponse.setSuccess(_ctx.booleanValue("ListWarehousesResponse.Success"));

		List<WarehouseModel> warehouses = new ArrayList<WarehouseModel>();
		for (int i = 0; i < _ctx.lengthValue("ListWarehousesResponse.Warehouses.Length"); i++) {
			WarehouseModel warehouseModel = new WarehouseModel();
			warehouseModel.setTel(_ctx.stringValue("ListWarehousesResponse.Warehouses["+ i +"].Tel"));
			warehouseModel.setDescription(_ctx.stringValue("ListWarehousesResponse.Warehouses["+ i +"].Description"));
			warehouseModel.setName(_ctx.stringValue("ListWarehousesResponse.Warehouses["+ i +"].Name"));
			warehouseModel.setWarehouseCategoryCode(_ctx.stringValue("ListWarehousesResponse.Warehouses["+ i +"].WarehouseCategoryCode"));
			warehouseModel.setCreateDate(_ctx.stringValue("ListWarehousesResponse.Warehouses["+ i +"].CreateDate"));
			warehouseModel.setCode(_ctx.stringValue("ListWarehousesResponse.Warehouses["+ i +"].Code"));
			warehouseModel.setAddress(_ctx.stringValue("ListWarehousesResponse.Warehouses["+ i +"].Address"));
			warehouseModel.setUpdateDate(_ctx.stringValue("ListWarehousesResponse.Warehouses["+ i +"].UpdateDate"));
			warehouseModel.setContact(_ctx.stringValue("ListWarehousesResponse.Warehouses["+ i +"].Contact"));
			warehouseModel.setDisable(_ctx.integerValue("ListWarehousesResponse.Warehouses["+ i +"].Disable"));
			warehouseModel.setWarehouseId(_ctx.stringValue("ListWarehousesResponse.Warehouses["+ i +"].WarehouseId"));

			warehouses.add(warehouseModel);
		}
		listWarehousesResponse.setWarehouses(warehouses);
	 
	 	return listWarehousesResponse;
	}
}