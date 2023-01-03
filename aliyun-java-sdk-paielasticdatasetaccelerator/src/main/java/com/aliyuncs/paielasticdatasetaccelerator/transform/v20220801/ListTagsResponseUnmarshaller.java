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

package com.aliyuncs.paielasticdatasetaccelerator.transform.v20220801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListTagsResponse;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListTagsResponse.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagsResponseUnmarshaller {

	public static ListTagsResponse unmarshall(ListTagsResponse listTagsResponse, UnmarshallerContext _ctx) {
		
		listTagsResponse.setRequestId(_ctx.stringValue("ListTagsResponse.RequestId"));
		listTagsResponse.setTotalCount(_ctx.integerValue("ListTagsResponse.TotalCount"));

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTagsResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setUserId(_ctx.stringValue("ListTagsResponse.Tags["+ i +"].UserId"));
			tagsItem.setOwnerId(_ctx.stringValue("ListTagsResponse.Tags["+ i +"].OwnerId"));
			tagsItem.setGmtCreateTime(_ctx.stringValue("ListTagsResponse.Tags["+ i +"].GmtCreateTime"));
			tagsItem.setGmtModifiedTime(_ctx.stringValue("ListTagsResponse.Tags["+ i +"].GmtModifiedTime"));
			tagsItem.setResourceType(_ctx.stringValue("ListTagsResponse.Tags["+ i +"].ResourceType"));
			tagsItem.setResourceId(_ctx.stringValue("ListTagsResponse.Tags["+ i +"].ResourceId"));
			tagsItem.setKey(_ctx.stringValue("ListTagsResponse.Tags["+ i +"].Key"));
			tagsItem.setValue(_ctx.stringValue("ListTagsResponse.Tags["+ i +"].Value"));

			tags.add(tagsItem);
		}
		listTagsResponse.setTags(tags);
	 
	 	return listTagsResponse;
	}
}