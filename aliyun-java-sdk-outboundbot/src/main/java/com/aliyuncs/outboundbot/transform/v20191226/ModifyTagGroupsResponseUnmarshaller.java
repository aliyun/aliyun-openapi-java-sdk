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

import com.aliyuncs.outboundbot.model.v20191226.ModifyTagGroupsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ModifyTagGroupsResponse.Tag;
import com.aliyuncs.outboundbot.model.v20191226.ModifyTagGroupsResponse.TagGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyTagGroupsResponseUnmarshaller {

	public static ModifyTagGroupsResponse unmarshall(ModifyTagGroupsResponse modifyTagGroupsResponse, UnmarshallerContext _ctx) {
		
		modifyTagGroupsResponse.setRequestId(_ctx.stringValue("ModifyTagGroupsResponse.RequestId"));
		modifyTagGroupsResponse.setHttpStatusCode(_ctx.integerValue("ModifyTagGroupsResponse.HttpStatusCode"));
		modifyTagGroupsResponse.setCode(_ctx.stringValue("ModifyTagGroupsResponse.Code"));
		modifyTagGroupsResponse.setMessage(_ctx.stringValue("ModifyTagGroupsResponse.Message"));
		modifyTagGroupsResponse.setSuccess(_ctx.booleanValue("ModifyTagGroupsResponse.Success"));

		List<TagGroup> tagGroups = new ArrayList<TagGroup>();
		for (int i = 0; i < _ctx.lengthValue("ModifyTagGroupsResponse.TagGroups.Length"); i++) {
			TagGroup tagGroup = new TagGroup();
			tagGroup.setTagGroupId(_ctx.stringValue("ModifyTagGroupsResponse.TagGroups["+ i +"].TagGroupId"));
			tagGroup.setTagGroupIndex(_ctx.integerValue("ModifyTagGroupsResponse.TagGroups["+ i +"].TagGroupIndex"));
			tagGroup.setTagGroup(_ctx.stringValue("ModifyTagGroupsResponse.TagGroups["+ i +"].TagGroup"));
			tagGroup.setScriptId(_ctx.stringValue("ModifyTagGroupsResponse.TagGroups["+ i +"].ScriptId"));

			tagGroups.add(tagGroup);
		}
		modifyTagGroupsResponse.setTagGroups(tagGroups);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("ModifyTagGroupsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagGroup(_ctx.stringValue("ModifyTagGroupsResponse.Tags["+ i +"].TagGroup"));
			tag.setTagName(_ctx.stringValue("ModifyTagGroupsResponse.Tags["+ i +"].TagName"));
			tag.setTagIndex(_ctx.integerValue("ModifyTagGroupsResponse.Tags["+ i +"].TagIndex"));
			tag.setScriptId(_ctx.stringValue("ModifyTagGroupsResponse.Tags["+ i +"].ScriptId"));
			tag.setTagId(_ctx.stringValue("ModifyTagGroupsResponse.Tags["+ i +"].TagId"));

			tags.add(tag);
		}
		modifyTagGroupsResponse.setTags(tags);
	 
	 	return modifyTagGroupsResponse;
	}
}