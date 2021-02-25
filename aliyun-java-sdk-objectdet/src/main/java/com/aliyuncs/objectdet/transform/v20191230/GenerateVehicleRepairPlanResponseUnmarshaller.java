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

import com.aliyuncs.objectdet.model.v20191230.GenerateVehicleRepairPlanResponse;
import com.aliyuncs.objectdet.model.v20191230.GenerateVehicleRepairPlanResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateVehicleRepairPlanResponseUnmarshaller {

	public static GenerateVehicleRepairPlanResponse unmarshall(GenerateVehicleRepairPlanResponse generateVehicleRepairPlanResponse, UnmarshallerContext _ctx) {
		
		generateVehicleRepairPlanResponse.setRequestId(_ctx.stringValue("GenerateVehicleRepairPlanResponse.RequestId"));
		generateVehicleRepairPlanResponse.setHttpCode(_ctx.integerValue("GenerateVehicleRepairPlanResponse.HttpCode"));
		generateVehicleRepairPlanResponse.setErrorMessage(_ctx.stringValue("GenerateVehicleRepairPlanResponse.ErrorMessage"));
		generateVehicleRepairPlanResponse.setCode(_ctx.stringValue("GenerateVehicleRepairPlanResponse.Code"));
		generateVehicleRepairPlanResponse.setSuccess(_ctx.booleanValue("GenerateVehicleRepairPlanResponse.Success"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("GenerateVehicleRepairPlanResponse.Data.TaskId"));
		generateVehicleRepairPlanResponse.setData(data);
	 
	 	return generateVehicleRepairPlanResponse;
	}
}