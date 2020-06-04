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

import com.aliyuncs.outboundbot.model.v20191226.DescribeTagHitsSummaryResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeTagHitsSummaryResponse.TagGroup;
import com.aliyuncs.outboundbot.model.v20191226.DescribeTagHitsSummaryResponse.TagHits;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagHitsSummaryResponseUnmarshaller {

	public static DescribeTagHitsSummaryResponse unmarshall(DescribeTagHitsSummaryResponse describeTagHitsSummaryResponse, UnmarshallerContext _ctx) {
		
		describeTagHitsSummaryResponse.setRequestId(_ctx.stringValue("DescribeTagHitsSummaryResponse.RequestId"));
		describeTagHitsSummaryResponse.setCode(_ctx.stringValue("DescribeTagHitsSummaryResponse.Code"));
		describeTagHitsSummaryResponse.setHttpStatusCode(_ctx.integerValue("DescribeTagHitsSummaryResponse.HttpStatusCode"));
		describeTagHitsSummaryResponse.setMessage(_ctx.stringValue("DescribeTagHitsSummaryResponse.Message"));
		describeTagHitsSummaryResponse.setSuccess(_ctx.booleanValue("DescribeTagHitsSummaryResponse.Success"));

		List<TagGroup> tagGroups = new ArrayList<TagGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagHitsSummaryResponse.TagGroups.Length"); i++) {
			TagGroup tagGroup = new TagGroup();
			tagGroup.setId(_ctx.stringValue("DescribeTagHitsSummaryResponse.TagGroups["+ i +"].Id"));
			tagGroup.setScriptId(_ctx.stringValue("DescribeTagHitsSummaryResponse.TagGroups["+ i +"].ScriptId"));
			tagGroup.setTagGroup(_ctx.stringValue("DescribeTagHitsSummaryResponse.TagGroups["+ i +"].TagGroup"));
			tagGroup.setTagGroupIndex(_ctx.integerValue("DescribeTagHitsSummaryResponse.TagGroups["+ i +"].TagGroupIndex"));

			tagGroups.add(tagGroup);
		}
		describeTagHitsSummaryResponse.setTagGroups(tagGroups);

		List<TagHits> tagHitsList = new ArrayList<TagHits>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagHitsSummaryResponse.TagHitsList.Length"); i++) {
			TagHits tagHits = new TagHits();
			tagHits.setHitCount(_ctx.integerValue("DescribeTagHitsSummaryResponse.TagHitsList["+ i +"].HitCount"));
			tagHits.setTagGroup(_ctx.stringValue("DescribeTagHitsSummaryResponse.TagHitsList["+ i +"].TagGroup"));
			tagHits.setTagName(_ctx.stringValue("DescribeTagHitsSummaryResponse.TagHitsList["+ i +"].TagName"));

			tagHitsList.add(tagHits);
		}
		describeTagHitsSummaryResponse.setTagHitsList(tagHitsList);
	 
	 	return describeTagHitsSummaryResponse;
	}
}