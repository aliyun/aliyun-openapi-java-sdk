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

import com.aliyuncs.ecsops.model.v20160401.OpsListTagResourcesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListTagResourcesResponse.TagResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListTagResourcesResponseUnmarshaller {

	public static OpsListTagResourcesResponse unmarshall(OpsListTagResourcesResponse opsListTagResourcesResponse, UnmarshallerContext _ctx) {
		
		opsListTagResourcesResponse.setRequestId(_ctx.stringValue("OpsListTagResourcesResponse.RequestId"));
		opsListTagResourcesResponse.setNextToken(_ctx.stringValue("OpsListTagResourcesResponse.NextToken"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("OpsListTagResourcesResponse.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setResourceType(_ctx.stringValue("OpsListTagResourcesResponse.TagResources["+ i +"].ResourceType"));
			tagResource.setResourceId(_ctx.stringValue("OpsListTagResourcesResponse.TagResources["+ i +"].ResourceId"));
			tagResource.setTagKey(_ctx.stringValue("OpsListTagResourcesResponse.TagResources["+ i +"].TagKey"));
			tagResource.setTagValue(_ctx.stringValue("OpsListTagResourcesResponse.TagResources["+ i +"].TagValue"));
			tagResource.setAliUid(_ctx.longValue("OpsListTagResourcesResponse.TagResources["+ i +"].AliUid"));

			tagResources.add(tagResource);
		}
		opsListTagResourcesResponse.setTagResources(tagResources);
	 
	 	return opsListTagResourcesResponse;
	}
}