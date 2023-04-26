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

import com.aliyuncs.ecs.model.v20160314.DescribeResourceSolutionsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceSolutionsResponse.ResourcePlanningResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceSolutionsResponse.ResourcePlanningResponse.ResourceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceSolutionsResponseUnmarshaller {

	public static DescribeResourceSolutionsResponse unmarshall(DescribeResourceSolutionsResponse describeResourceSolutionsResponse, UnmarshallerContext _ctx) {
		
		describeResourceSolutionsResponse.setRequestId(_ctx.stringValue("DescribeResourceSolutionsResponse.RequestId"));

		List<ResourcePlanningResponse> resourcePlanningResponses = new ArrayList<ResourcePlanningResponse>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceSolutionsResponse.ResourcePlanningResponses.Length"); i++) {
			ResourcePlanningResponse resourcePlanningResponse = new ResourcePlanningResponse();
			resourcePlanningResponse.setSatisfiedAmount(_ctx.integerValue("DescribeResourceSolutionsResponse.ResourcePlanningResponses["+ i +"].SatisfiedAmount"));

			List<String> recommendReasons = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResourceSolutionsResponse.ResourcePlanningResponses["+ i +"].RecommendReasons.Length"); j++) {
				recommendReasons.add(_ctx.stringValue("DescribeResourceSolutionsResponse.ResourcePlanningResponses["+ i +"].RecommendReasons["+ j +"]"));
			}
			resourcePlanningResponse.setRecommendReasons(recommendReasons);

			List<ResourceModel> resourceModels = new ArrayList<ResourceModel>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResourceSolutionsResponse.ResourcePlanningResponses["+ i +"].ResourceModels.Length"); j++) {
				ResourceModel resourceModel = new ResourceModel();
				resourceModel.setAmount(_ctx.integerValue("DescribeResourceSolutionsResponse.ResourcePlanningResponses["+ i +"].ResourceModels["+ j +"].Amount"));
				resourceModel.setZoneId(_ctx.stringValue("DescribeResourceSolutionsResponse.ResourcePlanningResponses["+ i +"].ResourceModels["+ j +"].ZoneId"));
				resourceModel.setInstanceType(_ctx.stringValue("DescribeResourceSolutionsResponse.ResourcePlanningResponses["+ i +"].ResourceModels["+ j +"].InstanceType"));
				resourceModel.setRegionId(_ctx.stringValue("DescribeResourceSolutionsResponse.ResourcePlanningResponses["+ i +"].ResourceModels["+ j +"].RegionId"));
				resourceModel.setDeliveryTime(_ctx.stringValue("DescribeResourceSolutionsResponse.ResourcePlanningResponses["+ i +"].ResourceModels["+ j +"].DeliveryTime"));

				resourceModels.add(resourceModel);
			}
			resourcePlanningResponse.setResourceModels(resourceModels);

			resourcePlanningResponses.add(resourcePlanningResponse);
		}
		describeResourceSolutionsResponse.setResourcePlanningResponses(resourcePlanningResponses);
	 
	 	return describeResourceSolutionsResponse;
	}
}