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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceRelatedResourcesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceRelatedResourcesResponse.Resource;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceRelatedResourcesResponse.Resource.RelatedResource;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourceRelatedResourcesResponse.Resource.RelatedResource.ResourceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeResourceRelatedResourcesResponseUnmarshaller {

	public static OpsDescribeResourceRelatedResourcesResponse unmarshall(OpsDescribeResourceRelatedResourcesResponse opsDescribeResourceRelatedResourcesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeResourceRelatedResourcesResponse.setRequestId(_ctx.stringValue("OpsDescribeResourceRelatedResourcesResponse.RequestId"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeResourceRelatedResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setResourceType(_ctx.stringValue("OpsDescribeResourceRelatedResourcesResponse.Resources["+ i +"].ResourceType"));
			resource.setResourceId(_ctx.stringValue("OpsDescribeResourceRelatedResourcesResponse.Resources["+ i +"].ResourceId"));

			List<RelatedResource> relatedResources = new ArrayList<RelatedResource>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeResourceRelatedResourcesResponse.Resources["+ i +"].RelatedResources.Length"); j++) {
				RelatedResource relatedResource = new RelatedResource();
				relatedResource.setRelatedResourceType(_ctx.stringValue("OpsDescribeResourceRelatedResourcesResponse.Resources["+ i +"].RelatedResources["+ j +"].RelatedResourceType"));

				List<ResourceInfo> resourcesInfo = new ArrayList<ResourceInfo>();
				for (int k = 0; k < _ctx.lengthValue("OpsDescribeResourceRelatedResourcesResponse.Resources["+ i +"].RelatedResources["+ j +"].ResourcesInfo.Length"); k++) {
					ResourceInfo resourceInfo = new ResourceInfo();
					resourceInfo.setRelatedResourceId(_ctx.stringValue("OpsDescribeResourceRelatedResourcesResponse.Resources["+ i +"].RelatedResources["+ j +"].ResourcesInfo["+ k +"].RelatedResourceId"));
					resourceInfo.setAliUid(_ctx.stringValue("OpsDescribeResourceRelatedResourcesResponse.Resources["+ i +"].RelatedResources["+ j +"].ResourcesInfo["+ k +"].AliUid"));

					resourcesInfo.add(resourceInfo);
				}
				relatedResource.setResourcesInfo(resourcesInfo);

				relatedResources.add(relatedResource);
			}
			resource.setRelatedResources(relatedResources);

			resources.add(resource);
		}
		opsDescribeResourceRelatedResourcesResponse.setResources(resources);
	 
	 	return opsDescribeResourceRelatedResourcesResponse;
	}
}