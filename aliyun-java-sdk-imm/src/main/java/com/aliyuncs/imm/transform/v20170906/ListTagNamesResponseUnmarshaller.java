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

import com.aliyuncs.imm.model.v20170906.ListTagNamesResponse;
import com.aliyuncs.imm.model.v20170906.ListTagNamesResponse.TagsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagNamesResponseUnmarshaller {

	public static ListTagNamesResponse unmarshall(ListTagNamesResponse listTagNamesResponse, UnmarshallerContext context) {
		
		listTagNamesResponse.setRequestId(context.stringValue("ListTagNamesResponse.RequestId"));

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < context.lengthValue("ListTagNamesResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagName(context.stringValue("ListTagNamesResponse.Tags["+ i +"].TagName"));
			tagsItem.setNum(context.integerValue("ListTagNamesResponse.Tags["+ i +"].Num"));

			tags.add(tagsItem);
		}
		listTagNamesResponse.setTags(tags);
	 
	 	return listTagNamesResponse;
	}
}