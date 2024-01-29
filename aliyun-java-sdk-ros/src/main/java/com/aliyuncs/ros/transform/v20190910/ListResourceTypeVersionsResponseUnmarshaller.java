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

import com.aliyuncs.ros.model.v20190910.ListResourceTypeVersionsResponse;
import com.aliyuncs.ros.model.v20190910.ListResourceTypeVersionsResponse.ResourceTypeVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceTypeVersionsResponseUnmarshaller {

	public static ListResourceTypeVersionsResponse unmarshall(ListResourceTypeVersionsResponse listResourceTypeVersionsResponse, UnmarshallerContext _ctx) {
		
		listResourceTypeVersionsResponse.setRequestId(_ctx.stringValue("ListResourceTypeVersionsResponse.RequestId"));

		List<ResourceTypeVersion> resourceTypeVersions = new ArrayList<ResourceTypeVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceTypeVersionsResponse.ResourceTypeVersions.Length"); i++) {
			ResourceTypeVersion resourceTypeVersion = new ResourceTypeVersion();
			resourceTypeVersion.setProvider(_ctx.stringValue("ListResourceTypeVersionsResponse.ResourceTypeVersions["+ i +"].Provider"));
			resourceTypeVersion.setEntityType(_ctx.stringValue("ListResourceTypeVersionsResponse.ResourceTypeVersions["+ i +"].EntityType"));
			resourceTypeVersion.setResourceType(_ctx.stringValue("ListResourceTypeVersionsResponse.ResourceTypeVersions["+ i +"].ResourceType"));
			resourceTypeVersion.setIsDefaultVersion(_ctx.booleanValue("ListResourceTypeVersionsResponse.ResourceTypeVersions["+ i +"].IsDefaultVersion"));
			resourceTypeVersion.setCreateTime(_ctx.stringValue("ListResourceTypeVersionsResponse.ResourceTypeVersions["+ i +"].CreateTime"));
			resourceTypeVersion.setUpdateTime(_ctx.stringValue("ListResourceTypeVersionsResponse.ResourceTypeVersions["+ i +"].UpdateTime"));
			resourceTypeVersion.setVersionId(_ctx.stringValue("ListResourceTypeVersionsResponse.ResourceTypeVersions["+ i +"].VersionId"));
			resourceTypeVersion.setDescription(_ctx.stringValue("ListResourceTypeVersionsResponse.ResourceTypeVersions["+ i +"].Description"));

			resourceTypeVersions.add(resourceTypeVersion);
		}
		listResourceTypeVersionsResponse.setResourceTypeVersions(resourceTypeVersions);
	 
	 	return listResourceTypeVersionsResponse;
	}
}