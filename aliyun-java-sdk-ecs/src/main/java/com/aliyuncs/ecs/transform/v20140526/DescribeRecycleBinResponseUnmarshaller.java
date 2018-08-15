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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeRecycleBinResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeRecycleBinResponse.RecycleBinModel;
import com.aliyuncs.ecs.model.v20140526.DescribeRecycleBinResponse.RecycleBinModel.RelationResource;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecycleBinResponseUnmarshaller {

	public static DescribeRecycleBinResponse unmarshall(DescribeRecycleBinResponse describeRecycleBinResponse, UnmarshallerContext context) {
		
		describeRecycleBinResponse.setRequestId(context.stringValue("DescribeRecycleBinResponse.RequestId"));
		describeRecycleBinResponse.setTotalCount(context.integerValue("DescribeRecycleBinResponse.TotalCount"));

		List<RecycleBinModel> recycleBinModels = new ArrayList<RecycleBinModel>();
		for (int i = 0; i < context.lengthValue("DescribeRecycleBinResponse.RecycleBinModels.Length"); i++) {
			RecycleBinModel recycleBinModel = new RecycleBinModel();
			recycleBinModel.setResourceId(context.stringValue("DescribeRecycleBinResponse.RecycleBinModels["+ i +"].ResourceId"));
			recycleBinModel.setRegionId(context.stringValue("DescribeRecycleBinResponse.RecycleBinModels["+ i +"].RegionId"));
			recycleBinModel.setResourceType(context.stringValue("DescribeRecycleBinResponse.RecycleBinModels["+ i +"].ResourceType"));
			recycleBinModel.setCreationTime(context.stringValue("DescribeRecycleBinResponse.RecycleBinModels["+ i +"].CreationTime"));
			recycleBinModel.setStatus(context.stringValue("DescribeRecycleBinResponse.RecycleBinModels["+ i +"].Status"));

			List<RelationResource> relationResources = new ArrayList<RelationResource>();
			for (int j = 0; j < context.lengthValue("DescribeRecycleBinResponse.RecycleBinModels["+ i +"].RelationResources.Length"); j++) {
				RelationResource relationResource = new RelationResource();
				relationResource.setRelationResourceId(context.stringValue("DescribeRecycleBinResponse.RecycleBinModels["+ i +"].RelationResources["+ j +"].RelationResourceId"));
				relationResource.setRelationResourceType(context.stringValue("DescribeRecycleBinResponse.RecycleBinModels["+ i +"].RelationResources["+ j +"].RelationResourceType"));

				relationResources.add(relationResource);
			}
			recycleBinModel.setRelationResources(relationResources);

			recycleBinModels.add(recycleBinModel);
		}
		describeRecycleBinResponse.setRecycleBinModels(recycleBinModels);
	 
	 	return describeRecycleBinResponse;
	}
}