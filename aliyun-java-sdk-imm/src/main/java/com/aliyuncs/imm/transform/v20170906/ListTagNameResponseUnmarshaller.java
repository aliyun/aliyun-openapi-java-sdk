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

import com.aliyuncs.imm.model.v20170906.ListTagNameResponse;
import com.aliyuncs.imm.model.v20170906.ListTagNameResponse.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagNameResponseUnmarshaller {

	public static ListTagNameResponse unmarshall(ListTagNameResponse listTagNameResponse, UnmarshallerContext context) {
		
		listTagNameResponse.setRequestId(context.stringValue("ListTagNameResponse.RequestId"));

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < context.lengthValue("ListTagNameResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagName(context.stringValue("ListTagNameResponse.Tags["+ i +"].TagName"));
			tagsItem.setNum(context.integerValue("ListTagNameResponse.Tags["+ i +"].Num"));

			tags.add(tagsItem);
		}
		listTagNameResponse.setTags(tags);
	 
	 	return listTagNameResponse;
	}
}