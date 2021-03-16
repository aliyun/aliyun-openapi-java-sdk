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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourcesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeResourcesResponse.Resource;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeResourcesResponseUnmarshaller {

	public static OpsDescribeResourcesResponse unmarshall(OpsDescribeResourcesResponse opsDescribeResourcesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeResourcesResponse.setRequestId(_ctx.stringValue("OpsDescribeResourcesResponse.RequestId"));
		opsDescribeResourcesResponse.setMarker(_ctx.stringValue("OpsDescribeResourcesResponse.Marker"));
		opsDescribeResourcesResponse.setTruncated(_ctx.booleanValue("OpsDescribeResourcesResponse.Truncated"));
		opsDescribeResourcesResponse.setEstimatedTotal(_ctx.integerValue("OpsDescribeResourcesResponse.EstimatedTotal"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setProduct(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].Product"));
			resource.setResourceType(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].ResourceType"));
			resource.setResourceId(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].ResourceId"));
			resource.setResourceName(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].ResourceName"));
			resource.setCreateTime(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].CreateTime"));
			resource.setUpdateTime(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].UpdateTime"));
			resource.setRegionId(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].RegionId"));
			resource.setMatchedAttributes(_ctx.mapValue("OpsDescribeResourcesResponse.Resources["+ i +"].MatchedAttributes"));
			resource.setArn(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].Arn"));

			resources.add(resource);
		}
		opsDescribeResourcesResponse.setResources(resources);
	 
	 	return opsDescribeResourcesResponse;
	}
}