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

import com.aliyuncs.outboundbot.model.v20191226.GetTagHitsSummaryResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetTagHitsSummaryResponse.TagGroup;
import com.aliyuncs.outboundbot.model.v20191226.GetTagHitsSummaryResponse.TagHits;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTagHitsSummaryResponseUnmarshaller {

	public static GetTagHitsSummaryResponse unmarshall(GetTagHitsSummaryResponse getTagHitsSummaryResponse, UnmarshallerContext _ctx) {
		
		getTagHitsSummaryResponse.setRequestId(_ctx.stringValue("GetTagHitsSummaryResponse.RequestId"));
		getTagHitsSummaryResponse.setSuccess(_ctx.booleanValue("GetTagHitsSummaryResponse.Success"));
		getTagHitsSummaryResponse.setCode(_ctx.stringValue("GetTagHitsSummaryResponse.Code"));
		getTagHitsSummaryResponse.setMessage(_ctx.stringValue("GetTagHitsSummaryResponse.Message"));
		getTagHitsSummaryResponse.setHttpStatusCode(_ctx.integerValue("GetTagHitsSummaryResponse.HttpStatusCode"));

		List<TagHits> tagHitsList = new ArrayList<TagHits>();
		for (int i = 0; i < _ctx.lengthValue("GetTagHitsSummaryResponse.TagHitsList.Length"); i++) {
			TagHits tagHits = new TagHits();
			tagHits.setTagName(_ctx.stringValue("GetTagHitsSummaryResponse.TagHitsList["+ i +"].TagName"));
			tagHits.setHitCount(_ctx.integerValue("GetTagHitsSummaryResponse.TagHitsList["+ i +"].HitCount"));
			tagHits.setTagGroup(_ctx.stringValue("GetTagHitsSummaryResponse.TagHitsList["+ i +"].TagGroup"));

			tagHitsList.add(tagHits);
		}
		getTagHitsSummaryResponse.setTagHitsList(tagHitsList);

		List<TagGroup> tagGroups = new ArrayList<TagGroup>();
		for (int i = 0; i < _ctx.lengthValue("GetTagHitsSummaryResponse.TagGroups.Length"); i++) {
			TagGroup tagGroup = new TagGroup();
			tagGroup.setId(_ctx.stringValue("GetTagHitsSummaryResponse.TagGroups["+ i +"].Id"));
			tagGroup.setTagGroupIndex(_ctx.integerValue("GetTagHitsSummaryResponse.TagGroups["+ i +"].TagGroupIndex"));
			tagGroup.setScriptId(_ctx.stringValue("GetTagHitsSummaryResponse.TagGroups["+ i +"].ScriptId"));
			tagGroup.setTagGroup(_ctx.stringValue("GetTagHitsSummaryResponse.TagGroups["+ i +"].TagGroup"));

			tagGroups.add(tagGroup);
		}
		getTagHitsSummaryResponse.setTagGroups(tagGroups);
	 
	 	return getTagHitsSummaryResponse;
	}
}