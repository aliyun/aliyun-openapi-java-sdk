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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.UpdateAiotVehicleTableItemResponse;
import com.aliyuncs.vcs.model.v20200515.UpdateAiotVehicleTableItemResponse.VehicleTableItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAiotVehicleTableItemResponseUnmarshaller {

	public static UpdateAiotVehicleTableItemResponse unmarshall(UpdateAiotVehicleTableItemResponse updateAiotVehicleTableItemResponse, UnmarshallerContext _ctx) {
		
		updateAiotVehicleTableItemResponse.setRequestId(_ctx.stringValue("UpdateAiotVehicleTableItemResponse.RequestId"));
		updateAiotVehicleTableItemResponse.setCode(_ctx.stringValue("UpdateAiotVehicleTableItemResponse.Code"));
		updateAiotVehicleTableItemResponse.setMessage(_ctx.stringValue("UpdateAiotVehicleTableItemResponse.Message"));

		VehicleTableItem vehicleTableItem = new VehicleTableItem();
		vehicleTableItem.setVehicleTableItemId(_ctx.stringValue("UpdateAiotVehicleTableItemResponse.VehicleTableItem.VehicleTableItemId"));
		vehicleTableItem.setVehicleTableId(_ctx.stringValue("UpdateAiotVehicleTableItemResponse.VehicleTableItem.VehicleTableId"));
		vehicleTableItem.setPlateNo(_ctx.stringValue("UpdateAiotVehicleTableItemResponse.VehicleTableItem.PlateNo"));
		vehicleTableItem.setOwnerName(_ctx.stringValue("UpdateAiotVehicleTableItemResponse.VehicleTableItem.OwnerName"));
		vehicleTableItem.setPhoneNo(_ctx.stringValue("UpdateAiotVehicleTableItemResponse.VehicleTableItem.PhoneNo"));
		vehicleTableItem.setBeginTime(_ctx.stringValue("UpdateAiotVehicleTableItemResponse.VehicleTableItem.BeginTime"));
		vehicleTableItem.setEndTime(_ctx.stringValue("UpdateAiotVehicleTableItemResponse.VehicleTableItem.EndTime"));
		vehicleTableItem.setRemarks(_ctx.stringValue("UpdateAiotVehicleTableItemResponse.VehicleTableItem.Remarks"));
		updateAiotVehicleTableItemResponse.setVehicleTableItem(vehicleTableItem);
	 
	 	return updateAiotVehicleTableItemResponse;
	}
}