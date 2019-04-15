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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsResourceGroupQueryByResourcesResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsResourceGroupQueryByResourcesResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsResourceGroupQueryByResourcesResponseUnmarshaller {

	public static InnerEcsResourceGroupQueryByResourcesResponse unmarshall(InnerEcsResourceGroupQueryByResourcesResponse innerEcsResourceGroupQueryByResourcesResponse, UnmarshallerContext context) {
		
		innerEcsResourceGroupQueryByResourcesResponse.setRequestId(context.stringValue("InnerEcsResourceGroupQueryByResourcesResponse.RequestId"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("InnerEcsResourceGroupQueryByResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setResourceId(context.stringValue("InnerEcsResourceGroupQueryByResourcesResponse.Resources["+ i +"].ResourceId"));
			resource.setRegionId(context.stringValue("InnerEcsResourceGroupQueryByResourcesResponse.Resources["+ i +"].RegionId"));
			resource.setResourceGroupId(context.stringValue("InnerEcsResourceGroupQueryByResourcesResponse.Resources["+ i +"].ResourceGroupId"));
			resource.setResourceType(context.stringValue("InnerEcsResourceGroupQueryByResourcesResponse.Resources["+ i +"].ResourceType"));
			resource.setAliUid(context.longValue("InnerEcsResourceGroupQueryByResourcesResponse.Resources["+ i +"].AliUid"));

			resources.add(resource);
		}
		innerEcsResourceGroupQueryByResourcesResponse.setResources(resources);
	 
	 	return innerEcsResourceGroupQueryByResourcesResponse;
	}
}