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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.ListLiveTagResourcesResponse;
import com.aliyuncs.live.model.v20161101.ListLiveTagResourcesResponse.TagResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLiveTagResourcesResponseUnmarshaller {

	public static ListLiveTagResourcesResponse unmarshall(ListLiveTagResourcesResponse listLiveTagResourcesResponse, UnmarshallerContext _ctx) {
		
		listLiveTagResourcesResponse.setRequestId(_ctx.stringValue("ListLiveTagResourcesResponse.RequestId"));
		listLiveTagResourcesResponse.setNextToken(_ctx.stringValue("ListLiveTagResourcesResponse.NextToken"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("ListLiveTagResourcesResponse.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setResourceId(_ctx.stringValue("ListLiveTagResourcesResponse.TagResources["+ i +"].ResourceId"));
			tagResource.setResourceType(_ctx.stringValue("ListLiveTagResourcesResponse.TagResources["+ i +"].ResourceType"));
			tagResource.setTagKey(_ctx.stringValue("ListLiveTagResourcesResponse.TagResources["+ i +"].TagKey"));
			tagResource.setTagValue(_ctx.stringValue("ListLiveTagResourcesResponse.TagResources["+ i +"].TagValue"));

			tagResources.add(tagResource);
		}
		listLiveTagResourcesResponse.setTagResources(tagResources);
	 
	 	return listLiveTagResourcesResponse;
	}
}