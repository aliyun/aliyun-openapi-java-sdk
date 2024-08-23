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

package com.aliyuncs.governance.transform.v20210120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.governance.model.v20210120.ListEvaluationMetricDetailsResponse;
import com.aliyuncs.governance.model.v20210120.ListEvaluationMetricDetailsResponse.Resource;
import com.aliyuncs.governance.model.v20210120.ListEvaluationMetricDetailsResponse.Resource.ResourcePropertie;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEvaluationMetricDetailsResponseUnmarshaller {

	public static ListEvaluationMetricDetailsResponse unmarshall(ListEvaluationMetricDetailsResponse listEvaluationMetricDetailsResponse, UnmarshallerContext _ctx) {
		
		listEvaluationMetricDetailsResponse.setRequestId(_ctx.stringValue("ListEvaluationMetricDetailsResponse.RequestId"));
		listEvaluationMetricDetailsResponse.setNextToken(_ctx.stringValue("ListEvaluationMetricDetailsResponse.NextToken"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("ListEvaluationMetricDetailsResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setRegionId(_ctx.stringValue("ListEvaluationMetricDetailsResponse.Resources["+ i +"].RegionId"));
			resource.setResourceClassification(_ctx.stringValue("ListEvaluationMetricDetailsResponse.Resources["+ i +"].ResourceClassification"));
			resource.setResourceId(_ctx.stringValue("ListEvaluationMetricDetailsResponse.Resources["+ i +"].ResourceId"));
			resource.setResourceName(_ctx.stringValue("ListEvaluationMetricDetailsResponse.Resources["+ i +"].ResourceName"));
			resource.setResourceOwnerDisplayName(_ctx.stringValue("ListEvaluationMetricDetailsResponse.Resources["+ i +"].ResourceOwnerDisplayName"));
			resource.setResourceOwnerId(_ctx.longValue("ListEvaluationMetricDetailsResponse.Resources["+ i +"].ResourceOwnerId"));
			resource.setResourceType(_ctx.stringValue("ListEvaluationMetricDetailsResponse.Resources["+ i +"].ResourceType"));

			List<ResourcePropertie> resourceProperties = new ArrayList<ResourcePropertie>();
			for (int j = 0; j < _ctx.lengthValue("ListEvaluationMetricDetailsResponse.Resources["+ i +"].ResourceProperties.Length"); j++) {
				ResourcePropertie resourcePropertie = new ResourcePropertie();
				resourcePropertie.setPropertyName(_ctx.stringValue("ListEvaluationMetricDetailsResponse.Resources["+ i +"].ResourceProperties["+ j +"].PropertyName"));
				resourcePropertie.setPropertyValue(_ctx.stringValue("ListEvaluationMetricDetailsResponse.Resources["+ i +"].ResourceProperties["+ j +"].PropertyValue"));

				resourceProperties.add(resourcePropertie);
			}
			resource.setResourceProperties(resourceProperties);

			resources.add(resource);
		}
		listEvaluationMetricDetailsResponse.setResources(resources);
	 
	 	return listEvaluationMetricDetailsResponse;
	}
}