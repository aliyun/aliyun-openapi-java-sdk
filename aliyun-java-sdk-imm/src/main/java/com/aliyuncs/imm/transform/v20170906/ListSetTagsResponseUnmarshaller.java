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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListSetTagsResponse;
import com.aliyuncs.imm.model.v20170906.ListSetTagsResponse.TagsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSetTagsResponseUnmarshaller {

	public static ListSetTagsResponse unmarshall(ListSetTagsResponse listSetTagsResponse, UnmarshallerContext context) {
		
		listSetTagsResponse.setRequestId(context.stringValue("ListSetTagsResponse.RequestId"));
		listSetTagsResponse.setSetId(context.stringValue("ListSetTagsResponse.SetId"));

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < context.lengthValue("ListSetTagsResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagName(context.stringValue("ListSetTagsResponse.Tags["+ i +"].TagName"));
			tagsItem.setTagCount(context.integerValue("ListSetTagsResponse.Tags["+ i +"].TagCount"));

			tags.add(tagsItem);
		}
		listSetTagsResponse.setTags(tags);
	 
	 	return listSetTagsResponse;
	}
}