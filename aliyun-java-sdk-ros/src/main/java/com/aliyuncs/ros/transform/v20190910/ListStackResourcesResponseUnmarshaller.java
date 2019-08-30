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

import com.aliyuncs.ros.model.v20190910.ListStackResourcesResponse;
import com.aliyuncs.ros.model.v20190910.ListStackResourcesResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStackResourcesResponseUnmarshaller {

	public static ListStackResourcesResponse unmarshall(ListStackResourcesResponse listStackResourcesResponse, UnmarshallerContext _ctx) {
		
		listStackResourcesResponse.setRequestId(_ctx.stringValue("ListStackResourcesResponse.RequestId"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("ListStackResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setCreateTime(_ctx.stringValue("ListStackResourcesResponse.Resources["+ i +"].CreateTime"));
			resource.setLogicalResourceId(_ctx.stringValue("ListStackResourcesResponse.Resources["+ i +"].LogicalResourceId"));
			resource.setPhysicalResourceId(_ctx.stringValue("ListStackResourcesResponse.Resources["+ i +"].PhysicalResourceId"));
			resource.setResourceType(_ctx.stringValue("ListStackResourcesResponse.Resources["+ i +"].ResourceType"));
			resource.setStackId(_ctx.stringValue("ListStackResourcesResponse.Resources["+ i +"].StackId"));
			resource.setStackName(_ctx.stringValue("ListStackResourcesResponse.Resources["+ i +"].StackName"));
			resource.setStatus(_ctx.stringValue("ListStackResourcesResponse.Resources["+ i +"].Status"));
			resource.setStatusReason(_ctx.stringValue("ListStackResourcesResponse.Resources["+ i +"].StatusReason"));
			resource.setUpdateTime(_ctx.stringValue("ListStackResourcesResponse.Resources["+ i +"].UpdateTime"));

			resources.add(resource);
		}
		listStackResourcesResponse.setResources(resources);
	 
	 	return listStackResourcesResponse;
	}
}