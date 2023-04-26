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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeResourceAllocationResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceAllocationResponse.ResourcePlanningResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceAllocationResponseUnmarshaller {

	public static DescribeResourceAllocationResponse unmarshall(DescribeResourceAllocationResponse describeResourceAllocationResponse, UnmarshallerContext _ctx) {
		
		describeResourceAllocationResponse.setRequestId(_ctx.stringValue("DescribeResourceAllocationResponse.RequestId"));

		ResourcePlanningResponse resourcePlanningResponse = new ResourcePlanningResponse();
		resourcePlanningResponse.setSatisfiedAmount(_ctx.integerValue("DescribeResourceAllocationResponse.ResourcePlanningResponse.SatisfiedAmount"));

		List<ResourceModel> resourceModels = new ArrayList<ResourceModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels.Length"); i++) {
			ResourceModel resourceModel = new ResourceModel();
			resourceModel.setAmount(_ctx.integerValue("DescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].Amount"));
			resourceModel.setIoOptimized(_ctx.stringValue("DescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].IoOptimized"));
			resourceModel.setPrice(_ctx.floatValue("DescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].Price"));
			resourceModel.setZoneId(_ctx.stringValue("DescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].ZoneId"));
			resourceModel.setNetworkType(_ctx.stringValue("DescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].NetworkType"));
			resourceModel.setInstanceType(_ctx.stringValue("DescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].InstanceType"));
			resourceModel.setSpotStrategy(_ctx.stringValue("DescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].SpotStrategy"));
			resourceModel.setInstanceChargeType(_ctx.stringValue("DescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].InstanceChargeType"));
			resourceModel.setRegionId(_ctx.stringValue("DescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].RegionId"));

			resourceModels.add(resourceModel);
		}
		resourcePlanningResponse.setResourceModels(resourceModels);
		describeResourceAllocationResponse.setResourcePlanningResponse(resourcePlanningResponse);
	 
	 	return describeResourceAllocationResponse;
	}
}