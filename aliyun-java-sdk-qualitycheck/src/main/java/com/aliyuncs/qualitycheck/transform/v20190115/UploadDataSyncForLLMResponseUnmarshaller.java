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

import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncForLLMResponse;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncForLLMResponse.ResultInfo;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncForLLMResponse.ResultInfo.RuleHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncForLLMResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncForLLMResponse.ResultInfo.RuleHitInfo.ConditionHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncForLLMResponse.ResultInfo.RuleHitInfo.ConditionHitInfo.HitKeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncForLLMResponse.ResultInfo.RuleHitInfo.ConditionHitInfo.Phrase;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadDataSyncForLLMResponseUnmarshaller {

	public static UploadDataSyncForLLMResponse unmarshall(UploadDataSyncForLLMResponse uploadDataSyncForLLMResponse, UnmarshallerContext _ctx) {
		
		uploadDataSyncForLLMResponse.setRequestId(_ctx.stringValue("UploadDataSyncForLLMResponse.RequestId"));
		uploadDataSyncForLLMResponse.setCode(_ctx.stringValue("UploadDataSyncForLLMResponse.Code"));
		uploadDataSyncForLLMResponse.setMessage(_ctx.stringValue("UploadDataSyncForLLMResponse.Message"));
		uploadDataSyncForLLMResponse.setSuccess(_ctx.booleanValue("UploadDataSyncForLLMResponse.Success"));

		List<ResultInfo> data = new ArrayList<ResultInfo>();
		for (int i = 0; i < _ctx.lengthValue("UploadDataSyncForLLMResponse.Data.Length"); i++) {
			ResultInfo resultInfo = new ResultInfo();
			resultInfo.setScore(_ctx.integerValue("UploadDataSyncForLLMResponse.Data["+ i +"].Score"));

			List<RuleHitInfo> rules = new ArrayList<RuleHitInfo>();
			for (int j = 0; j < _ctx.lengthValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules.Length"); j++) {
				RuleHitInfo ruleHitInfo = new RuleHitInfo();
				ruleHitInfo.setTid(_ctx.stringValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Tid"));
				ruleHitInfo.setRid(_ctx.stringValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Rid"));

				List<ConditionHitInfo> hit = new ArrayList<ConditionHitInfo>();
				for (int k = 0; k < _ctx.lengthValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit.Length"); k++) {
					ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

					List<String> hitCids = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitCids.Length"); l++) {
						hitCids.add(_ctx.stringValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitCids["+ l +"]"));
					}
					conditionHitInfo.setHitCids(hitCids);

					Phrase phrase = new Phrase();
					phrase.setWords(_ctx.stringValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Words"));
					phrase.setIdentity(_ctx.stringValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Identity"));
					phrase.setBegin(_ctx.longValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Begin"));
					phrase.setBeginTime(_ctx.stringValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.BeginTime"));
					phrase.setEnd(_ctx.longValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.End"));
					phrase.setRole(_ctx.stringValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Role"));
					conditionHitInfo.setPhrase(phrase);

					List<HitKeyWord> hitKeyWords = new ArrayList<HitKeyWord>();
					for (int l = 0; l < _ctx.lengthValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords.Length"); l++) {
						HitKeyWord hitKeyWord = new HitKeyWord();
						hitKeyWord.setTo(_ctx.integerValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].To"));
						hitKeyWord.setFrom(_ctx.integerValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].From"));
						hitKeyWord.setVal(_ctx.stringValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].Val"));
						hitKeyWord.setTid(_ctx.stringValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].Tid"));
						hitKeyWord.setPid(_ctx.integerValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].Pid"));

						hitKeyWords.add(hitKeyWord);
					}
					conditionHitInfo.setHitKeyWords(hitKeyWords);

					hit.add(conditionHitInfo);
				}
				ruleHitInfo.setHit(hit);

				List<ConditionBasicInfo> conditionInfo = new ArrayList<ConditionBasicInfo>();
				for (int k = 0; k < _ctx.lengthValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo.Length"); k++) {
					ConditionBasicInfo conditionBasicInfo = new ConditionBasicInfo();
					conditionBasicInfo.setConditionInfoCid(_ctx.stringValue("UploadDataSyncForLLMResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].ConditionInfoCid"));

					conditionInfo.add(conditionBasicInfo);
				}
				ruleHitInfo.setConditionInfo(conditionInfo);

				rules.add(ruleHitInfo);
			}
			resultInfo.setRules(rules);

			data.add(resultInfo);
		}
		uploadDataSyncForLLMResponse.setData(data);
	 
	 	return uploadDataSyncForLLMResponse;
	}
}