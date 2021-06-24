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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourcePlanningResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourcePlanningResponse.ResourcePlanningResult;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourcePlanningResponse.ResourcePlanningResult.ResourceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeResourcePlanningResponseUnmarshaller {

	public static OpsDescribeResourcePlanningResponse unmarshall(OpsDescribeResourcePlanningResponse opsDescribeResourcePlanningResponse, UnmarshallerContext _ctx) {
		
		opsDescribeResourcePlanningResponse.setRequestId(_ctx.stringValue("OpsDescribeResourcePlanningResponse.RequestId"));

		ResourcePlanningResult resourcePlanningResult = new ResourcePlanningResult();
		resourcePlanningResult.setResourceType(_ctx.stringValue("OpsDescribeResourcePlanningResponse.ResourcePlanningResult.ResourceType"));
		resourcePlanningResult.setSatisfiedCapacity(_ctx.integerValue("OpsDescribeResourcePlanningResponse.ResourcePlanningResult.SatisfiedCapacity"));

		List<ResourceModel> resourceModels = new ArrayList<ResourceModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeResourcePlanningResponse.ResourcePlanningResult.ResourceModels.Length"); i++) {
			ResourceModel resourceModel = new ResourceModel();
			resourceModel.setAmount(_ctx.integerValue("OpsDescribeResourcePlanningResponse.ResourcePlanningResult.ResourceModels["+ i +"].Amount"));
			resourceModel.setDeliveryTimeEnd(_ctx.stringValue("OpsDescribeResourcePlanningResponse.ResourcePlanningResult.ResourceModels["+ i +"].DeliveryTimeEnd"));
			resourceModel.setCores(_ctx.integerValue("OpsDescribeResourcePlanningResponse.ResourcePlanningResult.ResourceModels["+ i +"].Cores"));
			resourceModel.setPrice(_ctx.floatValue("OpsDescribeResourcePlanningResponse.ResourcePlanningResult.ResourceModels["+ i +"].Price"));
			resourceModel.setDeliveryType(_ctx.stringValue("OpsDescribeResourcePlanningResponse.ResourcePlanningResult.ResourceModels["+ i +"].DeliveryType"));
			resourceModel.setDeliveryTimeBegin(_ctx.stringValue("OpsDescribeResourcePlanningResponse.ResourcePlanningResult.ResourceModels["+ i +"].DeliveryTimeBegin"));
			resourceModel.setZoneId(_ctx.stringValue("OpsDescribeResourcePlanningResponse.ResourcePlanningResult.ResourceModels["+ i +"].ZoneId"));
			resourceModel.setMemory(_ctx.integerValue("OpsDescribeResourcePlanningResponse.ResourcePlanningResult.ResourceModels["+ i +"].Memory"));
			resourceModel.setInstanceType(_ctx.stringValue("OpsDescribeResourcePlanningResponse.ResourcePlanningResult.ResourceModels["+ i +"].InstanceType"));
			resourceModel.setRegionId(_ctx.stringValue("OpsDescribeResourcePlanningResponse.ResourcePlanningResult.ResourceModels["+ i +"].RegionId"));

			resourceModels.add(resourceModel);
		}
		resourcePlanningResult.setResourceModels(resourceModels);
		opsDescribeResourcePlanningResponse.setResourcePlanningResult(resourcePlanningResult);
	 
	 	return opsDescribeResourcePlanningResponse;
	}
}