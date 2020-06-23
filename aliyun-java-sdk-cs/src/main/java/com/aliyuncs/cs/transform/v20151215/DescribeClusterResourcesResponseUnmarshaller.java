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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribeClusterResourcesResponse;
import com.aliyuncs.cs.model.v20151215.DescribeClusterResourcesResponse.ResourcesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterResourcesResponseUnmarshaller {

	public static DescribeClusterResourcesResponse unmarshall(DescribeClusterResourcesResponse describeClusterResourcesResponse, UnmarshallerContext _ctx) {
		

		List<ResourcesItem> resources = new ArrayList<ResourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterResourcesResponse.resources.Length"); i++) {
			ResourcesItem resourcesItem = new ResourcesItem();
			resourcesItem.setInstance_id(_ctx.stringValue("DescribeClusterResourcesResponse.resources["+ i +"].instance_id"));
			resourcesItem.setResource_type(_ctx.stringValue("DescribeClusterResourcesResponse.resources["+ i +"].resource_type"));
			resourcesItem.setResource_info(_ctx.stringValue("DescribeClusterResourcesResponse.resources["+ i +"].resource_info"));
			resourcesItem.setState(_ctx.stringValue("DescribeClusterResourcesResponse.resources["+ i +"].state"));

			resources.add(resourcesItem);
		}
		describeClusterResourcesResponse.setResources(resources);
	 
	 	return describeClusterResourcesResponse;
	}
}