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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.ListResourceTypesResponse;
import com.aliyuncs.ros.model.v20190910.ListResourceTypesResponse.ResourceTypeSummarie;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceTypesResponseUnmarshaller {

	public static ListResourceTypesResponse unmarshall(ListResourceTypesResponse listResourceTypesResponse, UnmarshallerContext _ctx) {
		
		listResourceTypesResponse.setRequestId(_ctx.stringValue("ListResourceTypesResponse.RequestId"));

		List<String> resourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceTypesResponse.ResourceTypes.Length"); i++) {
			resourceTypes.add(_ctx.stringValue("ListResourceTypesResponse.ResourceTypes["+ i +"]"));
		}
		listResourceTypesResponse.setResourceTypes(resourceTypes);

		List<ResourceTypeSummarie> resourceTypeSummaries = new ArrayList<ResourceTypeSummarie>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceTypesResponse.ResourceTypeSummaries.Length"); i++) {
			ResourceTypeSummarie resourceTypeSummarie = new ResourceTypeSummarie();
			resourceTypeSummarie.setProvider(_ctx.stringValue("ListResourceTypesResponse.ResourceTypeSummaries["+ i +"].Provider"));
			resourceTypeSummarie.setEntityType(_ctx.stringValue("ListResourceTypesResponse.ResourceTypeSummaries["+ i +"].EntityType"));
			resourceTypeSummarie.setResourceType(_ctx.stringValue("ListResourceTypesResponse.ResourceTypeSummaries["+ i +"].ResourceType"));
			resourceTypeSummarie.setDefaultVersionId(_ctx.stringValue("ListResourceTypesResponse.ResourceTypeSummaries["+ i +"].DefaultVersionId"));
			resourceTypeSummarie.setLatestVersionId(_ctx.stringValue("ListResourceTypesResponse.ResourceTypeSummaries["+ i +"].LatestVersionId"));
			resourceTypeSummarie.setCreateTime(_ctx.stringValue("ListResourceTypesResponse.ResourceTypeSummaries["+ i +"].CreateTime"));
			resourceTypeSummarie.setUpdateTime(_ctx.stringValue("ListResourceTypesResponse.ResourceTypeSummaries["+ i +"].UpdateTime"));
			resourceTypeSummarie.setDescription(_ctx.stringValue("ListResourceTypesResponse.ResourceTypeSummaries["+ i +"].Description"));
			resourceTypeSummarie.setTotalVersionCount(_ctx.integerValue("ListResourceTypesResponse.ResourceTypeSummaries["+ i +"].TotalVersionCount"));
			resourceTypeSummarie.setReachVersionCountLimit(_ctx.booleanValue("ListResourceTypesResponse.ResourceTypeSummaries["+ i +"].ReachVersionCountLimit"));

			resourceTypeSummaries.add(resourceTypeSummarie);
		}
		listResourceTypesResponse.setResourceTypeSummaries(resourceTypeSummaries);
	 
	 	return listResourceTypesResponse;
	}
}