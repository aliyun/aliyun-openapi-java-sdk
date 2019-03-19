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

import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.Dialogue;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.HitRuleReviewInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.HitRuleReviewInfo.ConditionHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.HitRuleReviewInfo.ConditionHitInfo.KeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.HitRuleReviewInfo.ConditionHitInfo.Phrase;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.HitRuleReviewInfo.ReviewInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.ScorePo;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.ScorePo.ScoreParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResultToReviewResponseUnmarshaller {

	public static GetResultToReviewResponse unmarshall(GetResultToReviewResponse getResultToReviewResponse, UnmarshallerContext context) {
		
		getResultToReviewResponse.setRequestId(context.stringValue("GetResultToReviewResponse.RequestId"));
		getResultToReviewResponse.setSuccess(context.booleanValue("GetResultToReviewResponse.Success"));
		getResultToReviewResponse.setCode(context.stringValue("GetResultToReviewResponse.Code"));
		getResultToReviewResponse.setMessage(context.stringValue("GetResultToReviewResponse.Message"));

		Data data = new Data();
		data.setAudio(context.booleanValue("GetResultToReviewResponse.Data.Audio"));
		data.setAudioScheme(context.stringValue("GetResultToReviewResponse.Data.AudioScheme"));
		data.setAudioURL(context.stringValue("GetResultToReviewResponse.Data.AudioURL"));
		data.setBusinessType(context.integerValue("GetResultToReviewResponse.Data.BusinessType"));
		data.setDeleted(context.booleanValue("GetResultToReviewResponse.Data.Deleted"));
		data.setFileMergeName(context.stringValue("GetResultToReviewResponse.Data.FileMergeName"));
		data.setHitNumber(context.integerValue("GetResultToReviewResponse.Data.HitNumber"));
		data.setReviewNumber(context.integerValue("GetResultToReviewResponse.Data.ReviewNumber"));
		data.setTotalScore(context.integerValue("GetResultToReviewResponse.Data.TotalScore"));
		data.setVid(context.stringValue("GetResultToReviewResponse.Data.Vid"));
		data.setComments(context.stringValue("GetResultToReviewResponse.Data.Comments"));
		data.setFileId(context.stringValue("GetResultToReviewResponse.Data.FileId"));

		List<String> manualScoreMappingList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetResultToReviewResponse.Data.ManualScoreMappingList.Length"); i++) {
			manualScoreMappingList.add(context.stringValue("GetResultToReviewResponse.Data.ManualScoreMappingList["+ i +"]"));
		}
		data.setManualScoreMappingList(manualScoreMappingList);

		List<Dialogue> dialogues = new ArrayList<Dialogue>();
		for (int i = 0; i < context.lengthValue("GetResultToReviewResponse.Data.Dialogues.Length"); i++) {
			Dialogue dialogue = new Dialogue();
			dialogue.setBegin(context.longValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].Begin"));
			dialogue.setBeginTime(context.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].BeginTime"));
			dialogue.setEmotionValue(context.integerValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].EmotionValue"));
			dialogue.setEnd(context.longValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].End"));
			dialogue.setHourMinSec(context.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].HourMinSec"));
			dialogue.setIdentity(context.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].Identity"));
			dialogue.setRole(context.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].Role"));
			dialogue.setSilenceDuration(context.integerValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].SilenceDuration"));
			dialogue.setSpeechRate(context.integerValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].SpeechRate"));
			dialogue.setWords(context.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].Words"));

			dialogues.add(dialogue);
		}
		data.setDialogues(dialogues);

		List<ScorePo> handScoreInfoList = new ArrayList<ScorePo>();
		for (int i = 0; i < context.lengthValue("GetResultToReviewResponse.Data.HandScoreInfoList.Length"); i++) {
			ScorePo scorePo = new ScorePo();
			scorePo.setScoreId(context.longValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreId"));
			scorePo.setScoreName(context.stringValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreName"));

			List<ScoreParam> scoreInfos = new ArrayList<ScoreParam>();
			for (int j = 0; j < context.lengthValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos.Length"); j++) {
				ScoreParam scoreParam = new ScoreParam();
				scoreParam.setHit(context.integerValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].Hit"));
				scoreParam.setScoreNum(context.integerValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreNum"));
				scoreParam.setScoreSubId(context.longValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubId"));
				scoreParam.setScoreSubName(context.stringValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubName"));
				scoreParam.setScoreType(context.integerValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreType"));

				scoreInfos.add(scoreParam);
			}
			scorePo.setScoreInfos(scoreInfos);

			handScoreInfoList.add(scorePo);
		}
		data.setHandScoreInfoList(handScoreInfoList);

		List<HitRuleReviewInfo> hitRuleReviewInfoList = new ArrayList<HitRuleReviewInfo>();
		for (int i = 0; i < context.lengthValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList.Length"); i++) {
			HitRuleReviewInfo hitRuleReviewInfo = new HitRuleReviewInfo();
			hitRuleReviewInfo.setAutoReview(context.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].AutoReview"));
			hitRuleReviewInfo.setRid(context.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].Rid"));
			hitRuleReviewInfo.setRuleName(context.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleName"));
			hitRuleReviewInfo.setRuleScoreType(context.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleScoreType"));
			hitRuleReviewInfo.setRuleType(context.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleType"));
			hitRuleReviewInfo.setScoreId(context.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreId"));
			hitRuleReviewInfo.setScoreSubId(context.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreSubId"));
			hitRuleReviewInfo.setTotalNumber(context.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].TotalNumber"));

			ReviewInfo reviewInfo = new ReviewInfo();
			reviewInfo.setHitId(context.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.HitId"));
			reviewInfo.setRid(context.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.Rid"));
			hitRuleReviewInfo.setReviewInfo(reviewInfo);

			List<ConditionHitInfo> conditionHitInfoList = new ArrayList<ConditionHitInfo>();
			for (int j = 0; j < context.lengthValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList.Length"); j++) {
				ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

				List<String> cid = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid.Length"); k++) {
					cid.add(context.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid["+ k +"]"));
				}
				conditionHitInfo.setCid(cid);

				Phrase phrase = new Phrase();
				phrase.setRole(context.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Role"));
				phrase.setIdentity(context.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Identity"));
				phrase.setEmotionValue(context.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.EmotionValue"));
				phrase.setWords(context.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Words"));
				phrase.setEnd(context.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.End"));
				phrase.setPid(context.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Pid"));
				phrase.setBegin(context.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Begin"));
				conditionHitInfo.setPhrase(phrase);

				List<KeyWord> keyWords = new ArrayList<KeyWord>();
				for (int k = 0; k < context.lengthValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords.Length"); k++) {
					KeyWord keyWord = new KeyWord();
					keyWord.setVal(context.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Val"));
					keyWord.setPid(context.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Pid"));
					keyWord.setFrom(context.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].From"));
					keyWord.setTo(context.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].To"));
					keyWord.setTid(context.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Tid"));

					keyWords.add(keyWord);
				}
				conditionHitInfo.setKeyWords(keyWords);

				conditionHitInfoList.add(conditionHitInfo);
			}
			hitRuleReviewInfo.setConditionHitInfoList(conditionHitInfoList);

			hitRuleReviewInfoList.add(hitRuleReviewInfo);
		}
		data.setHitRuleReviewInfoList(hitRuleReviewInfoList);
		getResultToReviewResponse.setData(data);
	 
	 	return getResultToReviewResponse;
	}
}