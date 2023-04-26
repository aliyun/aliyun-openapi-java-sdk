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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeResourcesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeResourcesResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourcesResponseUnmarshaller {

	public static DescribeResourcesResponse unmarshall(DescribeResourcesResponse describeResourcesResponse, UnmarshallerContext _ctx) {
		
		describeResourcesResponse.setRequestId(_ctx.stringValue("DescribeResourcesResponse.RequestId"));
		describeResourcesResponse.setMarker(_ctx.stringValue("DescribeResourcesResponse.Marker"));
		describeResourcesResponse.setEstimatedTotal(_ctx.integerValue("DescribeResourcesResponse.EstimatedTotal"));
		describeResourcesResponse.setTruncated(_ctx.booleanValue("DescribeResourcesResponse.Truncated"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setUpdateTime(_ctx.stringValue("DescribeResourcesResponse.Resources["+ i +"].UpdateTime"));
			resource.setResourceType(_ctx.stringValue("DescribeResourcesResponse.Resources["+ i +"].ResourceType"));
			resource.setProduct(_ctx.stringValue("DescribeResourcesResponse.Resources["+ i +"].Product"));
			resource.setCreateTime(_ctx.stringValue("DescribeResourcesResponse.Resources["+ i +"].CreateTime"));
			resource.setMatchedAttributes(_ctx.stringValue("DescribeResourcesResponse.Resources["+ i +"].MatchedAttributes"));
			resource.setResourceId(_ctx.stringValue("DescribeResourcesResponse.Resources["+ i +"].ResourceId"));
			resource.setArn(_ctx.stringValue("DescribeResourcesResponse.Resources["+ i +"].Arn"));
			resource.setResourceName(_ctx.stringValue("DescribeResourcesResponse.Resources["+ i +"].ResourceName"));
			resource.setRegionId(_ctx.stringValue("DescribeResourcesResponse.Resources["+ i +"].RegionId"));

			resources.add(resource);
		}
		describeResourcesResponse.setResources(resources);
	 
	 	return describeResourcesResponse;
	}
}