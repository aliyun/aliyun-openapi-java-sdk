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

package com.aliyuncs.tag.transform.v20180828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.tag.model.v20180828.ListTagResourcesResponse;
import com.aliyuncs.tag.model.v20180828.ListTagResourcesResponse.TagResource;
import com.aliyuncs.tag.model.v20180828.ListTagResourcesResponse.TagResource.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagResourcesResponseUnmarshaller {

	public static ListTagResourcesResponse unmarshall(ListTagResourcesResponse listTagResourcesResponse, UnmarshallerContext _ctx) {
		
		listTagResourcesResponse.setRequestId(_ctx.stringValue("ListTagResourcesResponse.RequestId"));
		listTagResourcesResponse.setNextToken(_ctx.stringValue("ListTagResourcesResponse.NextToken"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("ListTagResourcesResponse.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setResourceARN(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].ResourceARN"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListTagResourcesResponse.TagResources["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].Tags["+ j +"].Value"));
				tag.setCategory(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].Tags["+ j +"].Category"));

				tags.add(tag);
			}
			tagResource.setTags(tags);

			tagResources.add(tagResource);
		}
		listTagResourcesResponse.setTagResources(tagResources);
	 
	 	return listTagResourcesResponse;
	}
}