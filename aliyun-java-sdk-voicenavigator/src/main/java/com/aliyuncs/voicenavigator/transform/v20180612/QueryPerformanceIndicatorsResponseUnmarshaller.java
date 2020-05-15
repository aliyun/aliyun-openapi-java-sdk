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

package com.aliyuncs.voicenavigator.transform.v20180612;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.voicenavigator.model.v20180612.QueryPerformanceIndicatorsResponse;
import com.aliyuncs.voicenavigator.model.v20180612.QueryPerformanceIndicatorsResponse.DialoguePassRate;
import com.aliyuncs.voicenavigator.model.v20180612.QueryPerformanceIndicatorsResponse.DialoguePassRate.ValuePerDateUnit4;
import com.aliyuncs.voicenavigator.model.v20180612.QueryPerformanceIndicatorsResponse.KnowledgeHitRate;
import com.aliyuncs.voicenavigator.model.v20180612.QueryPerformanceIndicatorsResponse.KnowledgeHitRate.ValuePerDateUnit6;
import com.aliyuncs.voicenavigator.model.v20180612.QueryPerformanceIndicatorsResponse.ResolutionRate;
import com.aliyuncs.voicenavigator.model.v20180612.QueryPerformanceIndicatorsResponse.ResolutionRate.ValuePerDateUnit;
import com.aliyuncs.voicenavigator.model.v20180612.QueryPerformanceIndicatorsResponse.ValidAnswerRate;
import com.aliyuncs.voicenavigator.model.v20180612.QueryPerformanceIndicatorsResponse.ValidAnswerRate.ValuePerDateUnit2;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPerformanceIndicatorsResponseUnmarshaller {

	public static QueryPerformanceIndicatorsResponse unmarshall(QueryPerformanceIndicatorsResponse queryPerformanceIndicatorsResponse, UnmarshallerContext _ctx) {
		
		queryPerformanceIndicatorsResponse.setRequestId(_ctx.stringValue("QueryPerformanceIndicatorsResponse.RequestId"));

		ResolutionRate resolutionRate = new ResolutionRate();
		resolutionRate.setTotalRateValue(_ctx.floatValue("QueryPerformanceIndicatorsResponse.ResolutionRate.TotalRateValue"));

		List<ValuePerDateUnit> valuePerDateUnits = new ArrayList<ValuePerDateUnit>();
		for (int i = 0; i < _ctx.lengthValue("QueryPerformanceIndicatorsResponse.ResolutionRate.ValuePerDateUnits.Length"); i++) {
			ValuePerDateUnit valuePerDateUnit = new ValuePerDateUnit();
			valuePerDateUnit.setDate(_ctx.longValue("QueryPerformanceIndicatorsResponse.ResolutionRate.ValuePerDateUnits["+ i +"].Date"));
			valuePerDateUnit.setRateValue(_ctx.floatValue("QueryPerformanceIndicatorsResponse.ResolutionRate.ValuePerDateUnits["+ i +"].RateValue"));

			valuePerDateUnits.add(valuePerDateUnit);
		}
		resolutionRate.setValuePerDateUnits(valuePerDateUnits);
		queryPerformanceIndicatorsResponse.setResolutionRate(resolutionRate);

		ValidAnswerRate validAnswerRate = new ValidAnswerRate();
		validAnswerRate.setTotalRateValue(_ctx.floatValue("QueryPerformanceIndicatorsResponse.ValidAnswerRate.TotalRateValue"));

		List<ValuePerDateUnit2> valuePerDateUnits1 = new ArrayList<ValuePerDateUnit2>();
		for (int i = 0; i < _ctx.lengthValue("QueryPerformanceIndicatorsResponse.ValidAnswerRate.ValuePerDateUnits.Length"); i++) {
			ValuePerDateUnit2 valuePerDateUnit2 = new ValuePerDateUnit2();
			valuePerDateUnit2.setDate(_ctx.longValue("QueryPerformanceIndicatorsResponse.ValidAnswerRate.ValuePerDateUnits["+ i +"].Date"));
			valuePerDateUnit2.setRateValue(_ctx.floatValue("QueryPerformanceIndicatorsResponse.ValidAnswerRate.ValuePerDateUnits["+ i +"].RateValue"));

			valuePerDateUnits1.add(valuePerDateUnit2);
		}
		validAnswerRate.setValuePerDateUnits1(valuePerDateUnits1);
		queryPerformanceIndicatorsResponse.setValidAnswerRate(validAnswerRate);

		DialoguePassRate dialoguePassRate = new DialoguePassRate();
		dialoguePassRate.setTotalRateValue(_ctx.floatValue("QueryPerformanceIndicatorsResponse.DialoguePassRate.TotalRateValue"));

		List<ValuePerDateUnit4> valuePerDateUnits3 = new ArrayList<ValuePerDateUnit4>();
		for (int i = 0; i < _ctx.lengthValue("QueryPerformanceIndicatorsResponse.DialoguePassRate.ValuePerDateUnits.Length"); i++) {
			ValuePerDateUnit4 valuePerDateUnit4 = new ValuePerDateUnit4();
			valuePerDateUnit4.setDate(_ctx.longValue("QueryPerformanceIndicatorsResponse.DialoguePassRate.ValuePerDateUnits["+ i +"].Date"));
			valuePerDateUnit4.setRateValue(_ctx.floatValue("QueryPerformanceIndicatorsResponse.DialoguePassRate.ValuePerDateUnits["+ i +"].RateValue"));

			valuePerDateUnits3.add(valuePerDateUnit4);
		}
		dialoguePassRate.setValuePerDateUnits3(valuePerDateUnits3);
		queryPerformanceIndicatorsResponse.setDialoguePassRate(dialoguePassRate);

		KnowledgeHitRate knowledgeHitRate = new KnowledgeHitRate();
		knowledgeHitRate.setTotalRateValue(_ctx.floatValue("QueryPerformanceIndicatorsResponse.KnowledgeHitRate.TotalRateValue"));

		List<ValuePerDateUnit6> valuePerDateUnits5 = new ArrayList<ValuePerDateUnit6>();
		for (int i = 0; i < _ctx.lengthValue("QueryPerformanceIndicatorsResponse.KnowledgeHitRate.ValuePerDateUnits.Length"); i++) {
			ValuePerDateUnit6 valuePerDateUnit6 = new ValuePerDateUnit6();
			valuePerDateUnit6.setDate(_ctx.longValue("QueryPerformanceIndicatorsResponse.KnowledgeHitRate.ValuePerDateUnits["+ i +"].Date"));
			valuePerDateUnit6.setRateValue(_ctx.floatValue("QueryPerformanceIndicatorsResponse.KnowledgeHitRate.ValuePerDateUnits["+ i +"].RateValue"));

			valuePerDateUnits5.add(valuePerDateUnit6);
		}
		knowledgeHitRate.setValuePerDateUnits5(valuePerDateUnits5);
		queryPerformanceIndicatorsResponse.setKnowledgeHitRate(knowledgeHitRate);
	 
	 	return queryPerformanceIndicatorsResponse;
	}
}