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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.ListTagResourcesResponse;
import com.aliyuncs.r_kvstore.model.v20150101.ListTagResourcesResponse.TagResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagResourcesResponseUnmarshaller {

	public static ListTagResourcesResponse unmarshall(ListTagResourcesResponse listTagResourcesResponse, UnmarshallerContext context) {
		
		listTagResourcesResponse.setRequestId(context.stringValue("ListTagResourcesResponse.RequestId"));
		listTagResourcesResponse.setNextToken(context.stringValue("ListTagResourcesResponse.NextToken"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < context.lengthValue("ListTagResourcesResponse.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setTagKey(context.stringValue("ListTagResourcesResponse.TagResources["+ i +"].TagKey"));
			tagResource.setTagValue(context.stringValue("ListTagResourcesResponse.TagResources["+ i +"].TagValue"));
			tagResource.setResourceType(context.stringValue("ListTagResourcesResponse.TagResources["+ i +"].ResourceType"));
			tagResource.setResourceId(context.stringValue("ListTagResourcesResponse.TagResources["+ i +"].ResourceId"));

			tagResources.add(tagResource);
		}
		listTagResourcesResponse.setTagResources(tagResources);
	 
	 	return listTagResourcesResponse;
	}
}