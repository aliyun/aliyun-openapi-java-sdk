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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceAllocationResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceAllocationResponse.ResourcePlanningResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModel;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModel.InstanceType;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModel.SpotPlanningModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeResourceAllocationResponseUnmarshaller {

	public static OpsDescribeResourceAllocationResponse unmarshall(OpsDescribeResourceAllocationResponse opsDescribeResourceAllocationResponse, UnmarshallerContext _ctx) {
		
		opsDescribeResourceAllocationResponse.setRequestId(_ctx.stringValue("OpsDescribeResourceAllocationResponse.RequestId"));
		opsDescribeResourceAllocationResponse.setMessage(_ctx.stringValue("OpsDescribeResourceAllocationResponse.Message"));
		opsDescribeResourceAllocationResponse.setCode(_ctx.stringValue("OpsDescribeResourceAllocationResponse.Code"));
		opsDescribeResourceAllocationResponse.setSuccess(_ctx.booleanValue("OpsDescribeResourceAllocationResponse.Success"));

		ResourcePlanningResponse resourcePlanningResponse = new ResourcePlanningResponse();
		resourcePlanningResponse.setSatisfiedAmount(_ctx.integerValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.SatisfiedAmount"));

		List<ResourceModel> resourceModels = new ArrayList<ResourceModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels.Length"); i++) {
			ResourceModel resourceModel = new ResourceModel();
			resourceModel.setResourcePoolName(_ctx.stringValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].ResourcePoolName"));
			resourceModel.setRegionId(_ctx.stringValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].regionId"));
			resourceModel.setMaxPrice(_ctx.floatValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].MaxPrice"));
			resourceModel.setNetworkType(_ctx.stringValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].NetworkType"));
			resourceModel.setSpotStrategy(_ctx.stringValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].SpotStrategy"));
			resourceModel.setInstanceChargeType(_ctx.stringValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].InstanceChargeType"));
			resourceModel.setAmount(_ctx.integerValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].Amount"));
			resourceModel.setIoOptimized(_ctx.stringValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].IoOptimized"));
			resourceModel.setPrice(_ctx.floatValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].Price"));
			resourceModel.setZoneId(_ctx.stringValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].ZoneId"));
			resourceModel.setWeightedCapacity(_ctx.floatValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].WeightedCapacity"));

			InstanceType instanceType = new InstanceType();
			instanceType.setSupportIoOptimized(_ctx.stringValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].InstanceType.SupportIoOptimized"));
			instanceType.setCores(_ctx.integerValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].InstanceType.Cores"));
			instanceType.setInstanceFamilyLevel(_ctx.stringValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].InstanceType.InstanceFamilyLevel"));
			instanceType.setMemory(_ctx.integerValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].InstanceType.Memory"));
			instanceType.setInstanceType(_ctx.stringValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].InstanceType.InstanceType"));
			instanceType.setInstanceTypeFamily(_ctx.stringValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].InstanceType.InstanceTypeFamily"));
			instanceType.setGeneration(_ctx.stringValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].InstanceType.Generation"));
			resourceModel.setInstanceType(instanceType);

			List<SpotPlanningModel> spotPlanningModels = new ArrayList<SpotPlanningModel>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].SpotPlanningModels.Length"); j++) {
				SpotPlanningModel spotPlanningModel = new SpotPlanningModel();
				spotPlanningModel.setAmount(_ctx.integerValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].SpotPlanningModels["+ j +"].Amount"));
				spotPlanningModel.setDiscount(_ctx.integerValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].SpotPlanningModels["+ j +"].Discount"));
				spotPlanningModel.setOriginPrice(_ctx.floatValue("OpsDescribeResourceAllocationResponse.ResourcePlanningResponse.ResourceModels["+ i +"].SpotPlanningModels["+ j +"].OriginPrice"));

				spotPlanningModels.add(spotPlanningModel);
			}
			resourceModel.setSpotPlanningModels(spotPlanningModels);

			resourceModels.add(resourceModel);
		}
		resourcePlanningResponse.setResourceModels(resourceModels);
		opsDescribeResourceAllocationResponse.setResourcePlanningResponse(resourcePlanningResponse);
	 
	 	return opsDescribeResourceAllocationResponse;
	}
}