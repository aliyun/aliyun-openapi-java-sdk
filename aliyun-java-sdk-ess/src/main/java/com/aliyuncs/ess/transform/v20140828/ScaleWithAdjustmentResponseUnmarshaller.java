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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.ScaleWithAdjustmentResponse;
import com.aliyuncs.ess.model.v20140828.ScaleWithAdjustmentResponse.PlanResult;
import com.aliyuncs.ess.model.v20140828.ScaleWithAdjustmentResponse.PlanResult.ResourceAllocationModels;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScaleWithAdjustmentResponseUnmarshaller {

	public static ScaleWithAdjustmentResponse unmarshall(ScaleWithAdjustmentResponse scaleWithAdjustmentResponse, UnmarshallerContext _ctx) {
		
		scaleWithAdjustmentResponse.setRequestId(_ctx.stringValue("ScaleWithAdjustmentResponse.RequestId"));
		scaleWithAdjustmentResponse.setScalingActivityId(_ctx.stringValue("ScaleWithAdjustmentResponse.ScalingActivityId"));
		scaleWithAdjustmentResponse.setActivityType(_ctx.stringValue("ScaleWithAdjustmentResponse.ActivityType"));

		PlanResult planResult = new PlanResult();

		List<ResourceAllocationModels> resourceAllocations = new ArrayList<ResourceAllocationModels>();
		for (int i = 0; i < _ctx.lengthValue("ScaleWithAdjustmentResponse.PlanResult.ResourceAllocations.Length"); i++) {
			ResourceAllocationModels resourceAllocationModels = new ResourceAllocationModels();
			resourceAllocationModels.setZoneId(_ctx.stringValue("ScaleWithAdjustmentResponse.PlanResult.ResourceAllocations["+ i +"].ZoneId"));
			resourceAllocationModels.setInstanceType(_ctx.stringValue("ScaleWithAdjustmentResponse.PlanResult.ResourceAllocations["+ i +"].InstanceType"));
			resourceAllocationModels.setSpotStrategy(_ctx.stringValue("ScaleWithAdjustmentResponse.PlanResult.ResourceAllocations["+ i +"].SpotStrategy"));
			resourceAllocationModels.setAmount(_ctx.integerValue("ScaleWithAdjustmentResponse.PlanResult.ResourceAllocations["+ i +"].Amount"));
			resourceAllocationModels.setInstanceChargeType(_ctx.stringValue("ScaleWithAdjustmentResponse.PlanResult.ResourceAllocations["+ i +"].InstanceChargeType"));

			resourceAllocations.add(resourceAllocationModels);
		}
		planResult.setResourceAllocations(resourceAllocations);
		scaleWithAdjustmentResponse.setPlanResult(planResult);
	 
	 	return scaleWithAdjustmentResponse;
	}
}