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

import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo.ConditionBasicInfo;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo.ConditionHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo.ConditionHitInfo.HitKeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.UploadDataSyncResponse.ResultInfo.RuleHitInfo.ConditionHitInfo.Phrase;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadDataSyncResponseUnmarshaller {

	public static UploadDataSyncResponse unmarshall(UploadDataSyncResponse uploadDataSyncResponse, UnmarshallerContext _ctx) {
		
		uploadDataSyncResponse.setRequestId(_ctx.stringValue("UploadDataSyncResponse.RequestId"));
		uploadDataSyncResponse.setSuccess(_ctx.booleanValue("UploadDataSyncResponse.Success"));
		uploadDataSyncResponse.setCode(_ctx.stringValue("UploadDataSyncResponse.Code"));
		uploadDataSyncResponse.setMessage(_ctx.stringValue("UploadDataSyncResponse.Message"));

		List<ResultInfo> data = new ArrayList<ResultInfo>();
		for (int i = 0; i < _ctx.lengthValue("UploadDataSyncResponse.Data.Length"); i++) {
			ResultInfo resultInfo = new ResultInfo();
			resultInfo.setScore(_ctx.integerValue("UploadDataSyncResponse.Data["+ i +"].Score"));

			List<String> handScoreIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UploadDataSyncResponse.Data["+ i +"].HandScoreIdList.Length"); j++) {
				handScoreIdList.add(_ctx.stringValue("UploadDataSyncResponse.Data["+ i +"].HandScoreIdList["+ j +"]"));
			}
			resultInfo.setHandScoreIdList(handScoreIdList);

			List<RuleHitInfo> rules = new ArrayList<RuleHitInfo>();
			for (int j = 0; j < _ctx.lengthValue("UploadDataSyncResponse.Data["+ i +"].Rules.Length"); j++) {
				RuleHitInfo ruleHitInfo = new RuleHitInfo();
				ruleHitInfo.setRid(_ctx.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Rid"));
				ruleHitInfo.setTid(_ctx.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Tid"));

				List<ConditionHitInfo> hit = new ArrayList<ConditionHitInfo>();
				for (int k = 0; k < _ctx.lengthValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit.Length"); k++) {
					ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

					List<String> hitCids = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitCids.Length"); l++) {
						hitCids.add(_ctx.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitCids["+ l +"]"));
					}
					conditionHitInfo.setHitCids(hitCids);

					Phrase phrase = new Phrase();
					phrase.setRole(_ctx.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Role"));
					phrase.setIdentity(_ctx.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Identity"));
					phrase.setWords(_ctx.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Words"));
					phrase.setBegin(_ctx.longValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.Begin"));
					phrase.setEnd(_ctx.longValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.End"));
					phrase.setBeginTime(_ctx.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].Phrase.BeginTime"));
					conditionHitInfo.setPhrase(phrase);

					List<HitKeyWord> hitKeyWords = new ArrayList<HitKeyWord>();
					for (int l = 0; l < _ctx.lengthValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords.Length"); l++) {
						HitKeyWord hitKeyWord = new HitKeyWord();
						hitKeyWord.setVal(_ctx.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].Val"));
						hitKeyWord.setPid(_ctx.integerValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].Pid"));
						hitKeyWord.setFrom(_ctx.integerValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].From"));
						hitKeyWord.setTo(_ctx.integerValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].To"));
						hitKeyWord.setTid(_ctx.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].Hit["+ k +"].HitKeyWords["+ l +"].Tid"));

						hitKeyWords.add(hitKeyWord);
					}
					conditionHitInfo.setHitKeyWords(hitKeyWords);

					hit.add(conditionHitInfo);
				}
				ruleHitInfo.setHit(hit);

				List<ConditionBasicInfo> conditionInfo = new ArrayList<ConditionBasicInfo>();
				for (int k = 0; k < _ctx.lengthValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo.Length"); k++) {
					ConditionBasicInfo conditionBasicInfo = new ConditionBasicInfo();
					conditionBasicInfo.setConditionInfoCid(_ctx.stringValue("UploadDataSyncResponse.Data["+ i +"].Rules["+ j +"].ConditionInfo["+ k +"].ConditionInfoCid"));

					conditionInfo.add(conditionBasicInfo);
				}
				ruleHitInfo.setConditionInfo(conditionInfo);

				rules.add(ruleHitInfo);
			}
			resultInfo.setRules(rules);

			data.add(resultInfo);
		}
		uploadDataSyncResponse.setData(data);
	 
	 	return uploadDataSyncResponse;
	}
}