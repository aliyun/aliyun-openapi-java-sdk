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

package com.aliyuncs.objectdet.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.objectdet.model.v20191230.GetVehicleRepairPlanResponse;
import com.aliyuncs.objectdet.model.v20191230.GetVehicleRepairPlanResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.GetVehicleRepairPlanResponse.Data.RepairItems;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVehicleRepairPlanResponseUnmarshaller {

	public static GetVehicleRepairPlanResponse unmarshall(GetVehicleRepairPlanResponse getVehicleRepairPlanResponse, UnmarshallerContext _ctx) {
		
		getVehicleRepairPlanResponse.setRequestId(_ctx.stringValue("GetVehicleRepairPlanResponse.RequestId"));
		getVehicleRepairPlanResponse.setCode(_ctx.stringValue("GetVehicleRepairPlanResponse.Code"));
		getVehicleRepairPlanResponse.setErrorMessage(_ctx.stringValue("GetVehicleRepairPlanResponse.ErrorMessage"));
		getVehicleRepairPlanResponse.setSuccess(_ctx.booleanValue("GetVehicleRepairPlanResponse.Success"));
		getVehicleRepairPlanResponse.setHttpCode(_ctx.integerValue("GetVehicleRepairPlanResponse.HttpCode"));

		Data data = new Data();
		data.setFrameNo(_ctx.stringValue("GetVehicleRepairPlanResponse.Data.FrameNo"));

		List<RepairItems> repairParts = new ArrayList<RepairItems>();
		for (int i = 0; i < _ctx.lengthValue("GetVehicleRepairPlanResponse.Data.RepairParts.Length"); i++) {
			RepairItems repairItems = new RepairItems();
			repairItems.setGarageType(_ctx.stringValue("GetVehicleRepairPlanResponse.Data.RepairParts["+ i +"].GarageType"));
			repairItems.setOeMatch(_ctx.booleanValue("GetVehicleRepairPlanResponse.Data.RepairParts["+ i +"].OeMatch"));
			repairItems.setOutStandardPartsId(_ctx.stringValue("GetVehicleRepairPlanResponse.Data.RepairParts["+ i +"].OutStandardPartsId"));
			repairItems.setOutStandardPartsName(_ctx.stringValue("GetVehicleRepairPlanResponse.Data.RepairParts["+ i +"].OutStandardPartsName"));
			repairItems.setPartNameMatch(_ctx.booleanValue("GetVehicleRepairPlanResponse.Data.RepairParts["+ i +"].PartNameMatch"));
			repairItems.setPartsStdCode(_ctx.stringValue("GetVehicleRepairPlanResponse.Data.RepairParts["+ i +"].PartsStdCode"));
			repairItems.setPartsStdName(_ctx.stringValue("GetVehicleRepairPlanResponse.Data.RepairParts["+ i +"].PartsStdName"));
			repairItems.setRelationType(_ctx.stringValue("GetVehicleRepairPlanResponse.Data.RepairParts["+ i +"].RelationType"));
			repairItems.setRepairFee(_ctx.stringValue("GetVehicleRepairPlanResponse.Data.RepairParts["+ i +"].RepairFee"));
			repairItems.setRepairType(_ctx.stringValue("GetVehicleRepairPlanResponse.Data.RepairParts["+ i +"].RepairType"));
			repairItems.setRepairTypeName(_ctx.stringValue("GetVehicleRepairPlanResponse.Data.RepairParts["+ i +"].RepairTypeName"));

			repairParts.add(repairItems);
		}
		data.setRepairParts(repairParts);
		getVehicleRepairPlanResponse.setData(data);
	 
	 	return getVehicleRepairPlanResponse;
	}
}