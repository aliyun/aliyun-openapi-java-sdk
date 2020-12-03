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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.SyncQualityCheckResponse;
import com.aliyuncs.qualitycheck.model.v20190115.SyncQualityCheckResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.SyncQualityCheckResponse.Data.RuleHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.SyncQualityCheckResponse.Data.RuleHitInfo.ConditionHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.SyncQualityCheckResponse.Data.RuleHitInfo.ConditionHitInfo.HitKeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.SyncQualityCheckResponse.Data.RuleHitInfo.ConditionHitInfo.Phrase;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncQualityCheckResponseUnmarshaller {

	public static SyncQualityCheckResponse unmarshall(SyncQualityCheckResponse syncQualityCheckResponse, UnmarshallerContext _ctx) {
		
		syncQualityCheckResponse.setRequestId(_ctx.stringValue("SyncQualityCheckResponse.RequestId"));
		syncQualityCheckResponse.setSuccess(_ctx.booleanValue("SyncQualityCheckResponse.Success"));
		syncQualityCheckResponse.setCode(_ctx.stringValue("SyncQualityCheckResponse.Code"));
		syncQualityCheckResponse.setMessage(_ctx.stringValue("SyncQualityCheckResponse.Message"));

		Data data = new Data();
		data.setScore(_ctx.integerValue("SyncQualityCheckResponse.Data.Score"));
		data.setTid(_ctx.stringValue("SyncQualityCheckResponse.Data.Tid"));
		data.setBeginTime(_ctx.longValue("SyncQualityCheckResponse.Data.BeginTime"));
		data.setTaskId(_ctx.stringValue("SyncQualityCheckResponse.Data.TaskId"));

		List<RuleHitInfo> rules = new ArrayList<RuleHitInfo>();
		for (int i = 0; i < _ctx.lengthValue("SyncQualityCheckResponse.Data.Rules.Length"); i++) {
			RuleHitInfo ruleHitInfo = new RuleHitInfo();
			ruleHitInfo.setRid(_ctx.stringValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Rid"));
			ruleHitInfo.setRuleName(_ctx.stringValue("SyncQualityCheckResponse.Data.Rules["+ i +"].RuleName"));

			List<ConditionHitInfo> hit = new ArrayList<ConditionHitInfo>();
			for (int j = 0; j < _ctx.lengthValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit.Length"); j++) {
				ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

				Phrase phrase = new Phrase();
				phrase.setRole(_ctx.stringValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].Phrase.Role"));
				phrase.setIdentity(_ctx.stringValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].Phrase.Identity"));
				phrase.setWords(_ctx.stringValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].Phrase.Words"));
				phrase.setBegin(_ctx.longValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].Phrase.Begin"));
				phrase.setEnd(_ctx.longValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].Phrase.End"));
				phrase.setEmotionValue(_ctx.integerValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].Phrase.EmotionValue"));
				phrase.setSpeechRate(_ctx.integerValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].Phrase.SpeechRate"));
				phrase.setSilenceDuration(_ctx.integerValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].Phrase.SilenceDuration"));
				conditionHitInfo.setPhrase(phrase);

				List<HitKeyWord> hitKeyWords = new ArrayList<HitKeyWord>();
				for (int k = 0; k < _ctx.lengthValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].HitKeyWords.Length"); k++) {
					HitKeyWord hitKeyWord = new HitKeyWord();
					hitKeyWord.setVal(_ctx.stringValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].HitKeyWords["+ k +"].Val"));
					hitKeyWord.setPid(_ctx.integerValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].HitKeyWords["+ k +"].Pid"));
					hitKeyWord.setFrom(_ctx.integerValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].HitKeyWords["+ k +"].From"));
					hitKeyWord.setTo(_ctx.integerValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].HitKeyWords["+ k +"].To"));
					hitKeyWord.setCid(_ctx.integerValue("SyncQualityCheckResponse.Data.Rules["+ i +"].Hit["+ j +"].HitKeyWords["+ k +"].Cid"));

					hitKeyWords.add(hitKeyWord);
				}
				conditionHitInfo.setHitKeyWords(hitKeyWords);

				hit.add(conditionHitInfo);
			}
			ruleHitInfo.setHit(hit);

			rules.add(ruleHitInfo);
		}
		data.setRules(rules);
		syncQualityCheckResponse.setData(data);
	 
	 	return syncQualityCheckResponse;
	}
}