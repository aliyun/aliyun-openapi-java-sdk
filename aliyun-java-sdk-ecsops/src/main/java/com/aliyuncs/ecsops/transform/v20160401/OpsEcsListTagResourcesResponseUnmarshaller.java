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

import com.aliyuncs.ecsops.model.v20160401.OpsEcsListTagResourcesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsEcsListTagResourcesResponse.TagResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsEcsListTagResourcesResponseUnmarshaller {

	public static OpsEcsListTagResourcesResponse unmarshall(OpsEcsListTagResourcesResponse opsEcsListTagResourcesResponse, UnmarshallerContext _ctx) {
		
		opsEcsListTagResourcesResponse.setRequestId(_ctx.stringValue("OpsEcsListTagResourcesResponse.RequestId"));
		opsEcsListTagResourcesResponse.setNextToken(_ctx.stringValue("OpsEcsListTagResourcesResponse.NextToken"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("OpsEcsListTagResourcesResponse.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setResourceType(_ctx.stringValue("OpsEcsListTagResourcesResponse.TagResources["+ i +"].ResourceType"));
			tagResource.setTagValue(_ctx.stringValue("OpsEcsListTagResourcesResponse.TagResources["+ i +"].TagValue"));
			tagResource.setResourceId(_ctx.stringValue("OpsEcsListTagResourcesResponse.TagResources["+ i +"].ResourceId"));
			tagResource.setTagKey(_ctx.stringValue("OpsEcsListTagResourcesResponse.TagResources["+ i +"].TagKey"));

			tagResources.add(tagResource);
		}
		opsEcsListTagResourcesResponse.setTagResources(tagResources);
	 
	 	return opsEcsListTagResourcesResponse;
	}
}