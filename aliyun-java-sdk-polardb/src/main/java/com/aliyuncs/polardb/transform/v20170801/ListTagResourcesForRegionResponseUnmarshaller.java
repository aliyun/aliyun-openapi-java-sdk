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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.ListTagResourcesForRegionResponse;
import com.aliyuncs.polardb.model.v20170801.ListTagResourcesForRegionResponse.TagResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagResourcesForRegionResponseUnmarshaller {

	public static ListTagResourcesForRegionResponse unmarshall(ListTagResourcesForRegionResponse listTagResourcesForRegionResponse, UnmarshallerContext _ctx) {
		
		listTagResourcesForRegionResponse.setRequestId(_ctx.stringValue("ListTagResourcesForRegionResponse.RequestId"));
		listTagResourcesForRegionResponse.setNextToken(_ctx.stringValue("ListTagResourcesForRegionResponse.NextToken"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("ListTagResourcesForRegionResponse.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setResourceType(_ctx.stringValue("ListTagResourcesForRegionResponse.TagResources["+ i +"].ResourceType"));
			tagResource.setTagValue(_ctx.stringValue("ListTagResourcesForRegionResponse.TagResources["+ i +"].TagValue"));
			tagResource.setResourceId(_ctx.stringValue("ListTagResourcesForRegionResponse.TagResources["+ i +"].ResourceId"));
			tagResource.setTagKey(_ctx.stringValue("ListTagResourcesForRegionResponse.TagResources["+ i +"].TagKey"));

			tagResources.add(tagResource);
		}
		listTagResourcesForRegionResponse.setTagResources(tagResources);
	 
	 	return listTagResourcesForRegionResponse;
	}
}