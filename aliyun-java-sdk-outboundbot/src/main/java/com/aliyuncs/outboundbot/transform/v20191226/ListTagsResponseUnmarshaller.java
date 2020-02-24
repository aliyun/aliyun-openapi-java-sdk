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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListTagsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListTagsResponse.Tag;
import com.aliyuncs.outboundbot.model.v20191226.ListTagsResponse.TagGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagsResponseUnmarshaller {

	public static ListTagsResponse unmarshall(ListTagsResponse listTagsResponse, UnmarshallerContext _ctx) {
		
		listTagsResponse.setRequestId(_ctx.stringValue("ListTagsResponse.RequestId"));
		listTagsResponse.setSuccess(_ctx.booleanValue("ListTagsResponse.Success"));
		listTagsResponse.setCode(_ctx.stringValue("ListTagsResponse.Code"));
		listTagsResponse.setMessage(_ctx.stringValue("ListTagsResponse.Message"));
		listTagsResponse.setHttpStatusCode(_ctx.integerValue("ListTagsResponse.HttpStatusCode"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("ListTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagId(_ctx.stringValue("ListTagsResponse.Tags["+ i +"].TagId"));
			tag.setTagName(_ctx.stringValue("ListTagsResponse.Tags["+ i +"].TagName"));
			tag.setTagIndex(_ctx.integerValue("ListTagsResponse.Tags["+ i +"].TagIndex"));
			tag.setScriptId(_ctx.stringValue("ListTagsResponse.Tags["+ i +"].ScriptId"));
			tag.setTagGroup(_ctx.stringValue("ListTagsResponse.Tags["+ i +"].TagGroup"));

			tags.add(tag);
		}
		listTagsResponse.setTags(tags);

		List<TagGroup> tagGroups = new ArrayList<TagGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListTagsResponse.TagGroups.Length"); i++) {
			TagGroup tagGroup = new TagGroup();
			tagGroup.setTagGroupId(_ctx.stringValue("ListTagsResponse.TagGroups["+ i +"].TagGroupId"));
			tagGroup.setTagGroupIndex(_ctx.integerValue("ListTagsResponse.TagGroups["+ i +"].TagGroupIndex"));
			tagGroup.setScriptId(_ctx.stringValue("ListTagsResponse.TagGroups["+ i +"].ScriptId"));
			tagGroup.setTagGroup(_ctx.stringValue("ListTagsResponse.TagGroups["+ i +"].TagGroup"));

			tagGroups.add(tagGroup);
		}
		listTagsResponse.setTagGroups(tagGroups);
	 
	 	return listTagsResponse;
	}
}