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
		opsDescribeResourcesResponse.setEstimatedTotal(_ctx.integerValue("OpsDescribeResourcesResponse.EstimatedTotal"));
		opsDescribeResourcesResponse.setTruncated(_ctx.booleanValue("OpsDescribeResourcesResponse.Truncated"));
		opsDescribeResourcesResponse.setMarker(_ctx.stringValue("OpsDescribeResourcesResponse.Marker"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setUpdateTime(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].UpdateTime"));
			resource.setResourceType(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].ResourceType"));
			resource.setProduct(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].Product"));
			resource.setCreateTime(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].CreateTime"));
			resource.setMatchedAttributes(_ctx.mapValue("OpsDescribeResourcesResponse.Resources["+ i +"].MatchedAttributes"));
			resource.setResourceId(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].ResourceId"));
			resource.setArn(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].Arn"));
			resource.setResourceName(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].ResourceName"));
			resource.setRegionId(_ctx.stringValue("OpsDescribeResourcesResponse.Resources["+ i +"].RegionId"));

			resources.add(resource);
		}
		opsDescribeResourcesResponse.setResources(resources);
	 
	 	return opsDescribeResourcesResponse;
	}
}