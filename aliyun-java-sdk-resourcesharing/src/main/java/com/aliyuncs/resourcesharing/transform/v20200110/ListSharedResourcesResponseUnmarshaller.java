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

package com.aliyuncs.resourcesharing.transform.v20200110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcesharing.model.v20200110.ListSharedResourcesResponse;
import com.aliyuncs.resourcesharing.model.v20200110.ListSharedResourcesResponse.SharedResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSharedResourcesResponseUnmarshaller {

	public static ListSharedResourcesResponse unmarshall(ListSharedResourcesResponse listSharedResourcesResponse, UnmarshallerContext _ctx) {
		
		listSharedResourcesResponse.setRequestId(_ctx.stringValue("ListSharedResourcesResponse.RequestId"));
		listSharedResourcesResponse.setNextToken(_ctx.stringValue("ListSharedResourcesResponse.NextToken"));

		List<SharedResource> sharedResources = new ArrayList<SharedResource>();
		for (int i = 0; i < _ctx.lengthValue("ListSharedResourcesResponse.SharedResources.Length"); i++) {
			SharedResource sharedResource = new SharedResource();
			sharedResource.setUpdateTime(_ctx.stringValue("ListSharedResourcesResponse.SharedResources["+ i +"].UpdateTime"));
			sharedResource.setResourceType(_ctx.stringValue("ListSharedResourcesResponse.SharedResources["+ i +"].ResourceType"));
			sharedResource.setCreateTime(_ctx.stringValue("ListSharedResourcesResponse.SharedResources["+ i +"].CreateTime"));
			sharedResource.setResourceShareId(_ctx.stringValue("ListSharedResourcesResponse.SharedResources["+ i +"].ResourceShareId"));
			sharedResource.setResourceId(_ctx.stringValue("ListSharedResourcesResponse.SharedResources["+ i +"].ResourceId"));
			sharedResource.setResourceStatus(_ctx.stringValue("ListSharedResourcesResponse.SharedResources["+ i +"].ResourceStatus"));
			sharedResource.setResourceStatusMessage(_ctx.stringValue("ListSharedResourcesResponse.SharedResources["+ i +"].ResourceStatusMessage"));

			sharedResources.add(sharedResource);
		}
		listSharedResourcesResponse.setSharedResources(sharedResources);
	 
	 	return listSharedResourcesResponse;
	}
}