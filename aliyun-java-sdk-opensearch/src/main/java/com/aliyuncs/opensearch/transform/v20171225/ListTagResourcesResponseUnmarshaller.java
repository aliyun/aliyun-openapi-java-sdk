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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListTagResourcesResponse;
import com.aliyuncs.opensearch.model.v20171225.ListTagResourcesResponse.TagResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagResourcesResponseUnmarshaller {

	public static ListTagResourcesResponse unmarshall(ListTagResourcesResponse listTagResourcesResponse, UnmarshallerContext _ctx) {
		
		listTagResourcesResponse.setRequestId(_ctx.stringValue("ListTagResourcesResponse.requestId"));
		listTagResourcesResponse.setNextToken(_ctx.stringValue("ListTagResourcesResponse.nextToken"));

		List<TagResource> result = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("ListTagResourcesResponse.result.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setTagKey(_ctx.stringValue("ListTagResourcesResponse.result["+ i +"].tagKey"));
			tagResource.setTagValue(_ctx.stringValue("ListTagResourcesResponse.result["+ i +"].tagValue"));
			tagResource.setResourceId(_ctx.stringValue("ListTagResourcesResponse.result["+ i +"].resourceId"));
			tagResource.setResourceType(_ctx.stringValue("ListTagResourcesResponse.result["+ i +"].resourceType"));

			result.add(tagResource);
		}
		listTagResourcesResponse.setResult(result);
	 
	 	return listTagResourcesResponse;
	}
}