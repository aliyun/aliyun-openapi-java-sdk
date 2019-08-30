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

import com.aliyuncs.imm.model.v20170906.DetectImageTagsResponse;
import com.aliyuncs.imm.model.v20170906.DetectImageTagsResponse.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageTagsResponseUnmarshaller {

	public static DetectImageTagsResponse unmarshall(DetectImageTagsResponse detectImageTagsResponse, UnmarshallerContext _ctx) {
		
		detectImageTagsResponse.setRequestId(_ctx.stringValue("DetectImageTagsResponse.RequestId"));
		detectImageTagsResponse.setImageUri(_ctx.stringValue("DetectImageTagsResponse.ImageUri"));

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectImageTagsResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagName(_ctx.stringValue("DetectImageTagsResponse.Tags["+ i +"].TagName"));
			tagsItem.setTagConfidence(_ctx.floatValue("DetectImageTagsResponse.Tags["+ i +"].TagConfidence"));
			tagsItem.setTagLevel(_ctx.integerValue("DetectImageTagsResponse.Tags["+ i +"].TagLevel"));
			tagsItem.setParentTagName(_ctx.stringValue("DetectImageTagsResponse.Tags["+ i +"].ParentTagName"));
			tagsItem.setParentTagEnName(_ctx.stringValue("DetectImageTagsResponse.Tags["+ i +"].ParentTagEnName"));
			tagsItem.setTagEnName(_ctx.stringValue("DetectImageTagsResponse.Tags["+ i +"].TagEnName"));

			tags.add(tagsItem);
		}
		detectImageTagsResponse.setTags(tags);
	 
	 	return detectImageTagsResponse;
	}
}