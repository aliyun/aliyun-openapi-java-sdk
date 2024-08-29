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

import com.aliyuncs.outboundbot.model.v20191226.GetAnnotationMissionSummaryResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetAnnotationMissionSummaryResponse.Data;
import com.aliyuncs.outboundbot.model.v20191226.GetAnnotationMissionSummaryResponse.Data.AsrSummaryInfo;
import com.aliyuncs.outboundbot.model.v20191226.GetAnnotationMissionSummaryResponse.Data.IntentSummaryInfo;
import com.aliyuncs.outboundbot.model.v20191226.GetAnnotationMissionSummaryResponse.Data.TagSummaryInfo;
import com.aliyuncs.outboundbot.model.v20191226.GetAnnotationMissionSummaryResponse.Data.TagSummaryInfo.TagSummaryInfoDetailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAnnotationMissionSummaryResponseUnmarshaller {

	public static GetAnnotationMissionSummaryResponse unmarshall(GetAnnotationMissionSummaryResponse getAnnotationMissionSummaryResponse, UnmarshallerContext _ctx) {
		
		getAnnotationMissionSummaryResponse.setRequestId(_ctx.stringValue("GetAnnotationMissionSummaryResponse.RequestId"));
		getAnnotationMissionSummaryResponse.setSuccess(_ctx.booleanValue("GetAnnotationMissionSummaryResponse.Success"));
		getAnnotationMissionSummaryResponse.setCode(_ctx.stringValue("GetAnnotationMissionSummaryResponse.Code"));
		getAnnotationMissionSummaryResponse.setMessage(_ctx.stringValue("GetAnnotationMissionSummaryResponse.Message"));
		getAnnotationMissionSummaryResponse.setHttpStatusCode(_ctx.integerValue("GetAnnotationMissionSummaryResponse.HttpStatusCode"));

		Data data = new Data();
		data.setAnnotationMissionId(_ctx.stringValue("GetAnnotationMissionSummaryResponse.Data.AnnotationMissionId"));
		data.setSuccess(_ctx.booleanValue("GetAnnotationMissionSummaryResponse.Data.Success"));
		data.setMessage(_ctx.stringValue("GetAnnotationMissionSummaryResponse.Data.Message"));

		IntentSummaryInfo intentSummaryInfo = new IntentSummaryInfo();
		intentSummaryInfo.setIntentUserSayCount(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.IntentSummaryInfo.IntentUserSayCount"));
		intentSummaryInfo.setAnnotationCorrectCount(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.IntentSummaryInfo.AnnotationCorrectCount"));
		intentSummaryInfo.setMatchErrorCount(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.IntentSummaryInfo.MatchErrorCount"));
		intentSummaryInfo.setAnnotationInvalid(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.IntentSummaryInfo.AnnotationInvalid"));
		intentSummaryInfo.setNoAnnotation(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.IntentSummaryInfo.NoAnnotation"));
		intentSummaryInfo.setChatTotalCount(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.IntentSummaryInfo.ChatTotalCount"));
		intentSummaryInfo.setTranslationUnrecognizedCount(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.IntentSummaryInfo.TranslationUnrecognizedCount"));
		intentSummaryInfo.setIntentionNotCoveredCount(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.IntentSummaryInfo.IntentionNotCoveredCount"));
		data.setIntentSummaryInfo(intentSummaryInfo);

		AsrSummaryInfo asrSummaryInfo = new AsrSummaryInfo();
		asrSummaryInfo.setWordErrorRate(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.AsrSummaryInfo.WordErrorRate"));
		asrSummaryInfo.setCharacterErrorRate(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.AsrSummaryInfo.CharacterErrorRate"));
		asrSummaryInfo.setSentenceErrorRate(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.AsrSummaryInfo.SentenceErrorRate"));
		asrSummaryInfo.setAnnotationInvalid(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.AsrSummaryInfo.AnnotationInvalid"));
		asrSummaryInfo.setNoAnnotation(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.AsrSummaryInfo.NoAnnotation"));
		asrSummaryInfo.setChatTotalCount(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.AsrSummaryInfo.ChatTotalCount"));
		asrSummaryInfo.setAddVocabularyDataCount(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.AsrSummaryInfo.AddVocabularyDataCount"));
		asrSummaryInfo.setAddCustomizationDataCount(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.AsrSummaryInfo.AddCustomizationDataCount"));
		asrSummaryInfo.setCharacterCorrectRate(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.AsrSummaryInfo.CharacterCorrectRate"));
		data.setAsrSummaryInfo(asrSummaryInfo);

		TagSummaryInfo tagSummaryInfo = new TagSummaryInfo();

		List<TagSummaryInfoDetailListItem> tagSummaryInfoDetailList = new ArrayList<TagSummaryInfoDetailListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAnnotationMissionSummaryResponse.Data.TagSummaryInfo.TagSummaryInfoDetailList.Length"); i++) {
			TagSummaryInfoDetailListItem tagSummaryInfoDetailListItem = new TagSummaryInfoDetailListItem();
			tagSummaryInfoDetailListItem.setName(_ctx.stringValue("GetAnnotationMissionSummaryResponse.Data.TagSummaryInfo.TagSummaryInfoDetailList["+ i +"].Name"));
			tagSummaryInfoDetailListItem.setCount(_ctx.integerValue("GetAnnotationMissionSummaryResponse.Data.TagSummaryInfo.TagSummaryInfoDetailList["+ i +"].Count"));

			tagSummaryInfoDetailList.add(tagSummaryInfoDetailListItem);
		}
		tagSummaryInfo.setTagSummaryInfoDetailList(tagSummaryInfoDetailList);
		data.setTagSummaryInfo(tagSummaryInfo);
		getAnnotationMissionSummaryResponse.setData(data);
	 
	 	return getAnnotationMissionSummaryResponse;
	}
}