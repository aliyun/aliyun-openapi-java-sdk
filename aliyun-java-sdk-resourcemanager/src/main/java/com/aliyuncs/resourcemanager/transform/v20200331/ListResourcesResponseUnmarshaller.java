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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.ListResourcesResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListResourcesResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourcesResponseUnmarshaller {

	public static ListResourcesResponse unmarshall(ListResourcesResponse listResourcesResponse, UnmarshallerContext _ctx) {
		
		listResourcesResponse.setRequestId(_ctx.stringValue("ListResourcesResponse.RequestId"));
		listResourcesResponse.setPageNumber(_ctx.integerValue("ListResourcesResponse.PageNumber"));
		listResourcesResponse.setPageSize(_ctx.integerValue("ListResourcesResponse.PageSize"));
		listResourcesResponse.setTotalCount(_ctx.integerValue("ListResourcesResponse.TotalCount"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("ListResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setResourceGroupId(_ctx.stringValue("ListResourcesResponse.Resources["+ i +"].ResourceGroupId"));
			resource.setService(_ctx.stringValue("ListResourcesResponse.Resources["+ i +"].Service"));
			resource.setResourceType(_ctx.stringValue("ListResourcesResponse.Resources["+ i +"].ResourceType"));
			resource.setResourceId(_ctx.stringValue("ListResourcesResponse.Resources["+ i +"].ResourceId"));
			resource.setRegionId(_ctx.stringValue("ListResourcesResponse.Resources["+ i +"].RegionId"));
			resource.setCreateDate(_ctx.stringValue("ListResourcesResponse.Resources["+ i +"].CreateDate"));

			resources.add(resource);
		}
		listResourcesResponse.setResources(resources);
	 
	 	return listResourcesResponse;
	}
}