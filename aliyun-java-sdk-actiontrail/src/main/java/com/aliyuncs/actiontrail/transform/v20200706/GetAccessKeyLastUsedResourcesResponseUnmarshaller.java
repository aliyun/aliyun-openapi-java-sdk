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

package com.aliyuncs.actiontrail.transform.v20200706;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.actiontrail.model.v20200706.GetAccessKeyLastUsedResourcesResponse;
import com.aliyuncs.actiontrail.model.v20200706.GetAccessKeyLastUsedResourcesResponse.ResourcesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccessKeyLastUsedResourcesResponseUnmarshaller {

	public static GetAccessKeyLastUsedResourcesResponse unmarshall(GetAccessKeyLastUsedResourcesResponse getAccessKeyLastUsedResourcesResponse, UnmarshallerContext _ctx) {
		
		getAccessKeyLastUsedResourcesResponse.setRequestId(_ctx.stringValue("GetAccessKeyLastUsedResourcesResponse.RequestId"));
		getAccessKeyLastUsedResourcesResponse.setNextToken(_ctx.stringValue("GetAccessKeyLastUsedResourcesResponse.NextToken"));

		List<ResourcesItem> resources = new ArrayList<ResourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAccessKeyLastUsedResourcesResponse.Resources.Length"); i++) {
			ResourcesItem resourcesItem = new ResourcesItem();
			resourcesItem.setUsedTimestamp(_ctx.longValue("GetAccessKeyLastUsedResourcesResponse.Resources["+ i +"].UsedTimestamp"));
			resourcesItem.setDetail(_ctx.stringValue("GetAccessKeyLastUsedResourcesResponse.Resources["+ i +"].Detail"));
			resourcesItem.setResourceName(_ctx.stringValue("GetAccessKeyLastUsedResourcesResponse.Resources["+ i +"].ResourceName"));
			resourcesItem.setResourceType(_ctx.stringValue("GetAccessKeyLastUsedResourcesResponse.Resources["+ i +"].ResourceType"));
			resourcesItem.setSource(_ctx.stringValue("GetAccessKeyLastUsedResourcesResponse.Resources["+ i +"].Source"));

			resources.add(resourcesItem);
		}
		getAccessKeyLastUsedResourcesResponse.setResources(resources);
	 
	 	return getAccessKeyLastUsedResourcesResponse;
	}
}