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

import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.Dialogue;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.HitRuleReviewInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.HitRuleReviewInfo.ConditionHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.HitRuleReviewInfo.ConditionHitInfo.KeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.HitRuleReviewInfo.ConditionHitInfo.Phrase;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.HitRuleReviewInfo.ReviewInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.ScorePo;
import com.aliyuncs.qualitycheck.model.v20190115.GetReviewInfoResponse.Data.ScorePo.ScoreParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetReviewInfoResponseUnmarshaller {

	public static GetReviewInfoResponse unmarshall(GetReviewInfoResponse getReviewInfoResponse, UnmarshallerContext context) {
		
		getReviewInfoResponse.setRequestId(context.stringValue("GetReviewInfoResponse.RequestId"));
		getReviewInfoResponse.setSuccess(context.booleanValue("GetReviewInfoResponse.Success"));
		getReviewInfoResponse.setCode(context.stringValue("GetReviewInfoResponse.Code"));
		getReviewInfoResponse.setMessage(context.stringValue("GetReviewInfoResponse.Message"));

		Data data = new Data();
		data.setAsrWordsCount(context.integerValue("GetReviewInfoResponse.Data.AsrWordsCount"));
		data.setAudio(context.booleanValue("GetReviewInfoResponse.Data.Audio"));
		data.setAudioURL(context.stringValue("GetReviewInfoResponse.Data.AudioURL"));
		data.setBusinessType(context.integerValue("GetReviewInfoResponse.Data.BusinessType"));
		data.setDeleted(context.booleanValue("GetReviewInfoResponse.Data.Deleted"));
		data.setFileMergeName(context.stringValue("GetReviewInfoResponse.Data.FileMergeName"));
		data.setHitNumber(context.integerValue("GetReviewInfoResponse.Data.HitNumber"));
		data.setIsAudio(context.booleanValue("GetReviewInfoResponse.Data.IsAudio"));
		data.setIsDeleted(context.booleanValue("GetReviewInfoResponse.Data.IsDeleted"));
		data.setNextVid(context.stringValue("GetReviewInfoResponse.Data.NextVid"));
		data.setPreVid(context.stringValue("GetReviewInfoResponse.Data.PreVid"));
		data.setReviewNumber(context.integerValue("GetReviewInfoResponse.Data.ReviewNumber"));
		data.setTotalScore(context.integerValue("GetReviewInfoResponse.Data.TotalScore"));
		data.setVid(context.stringValue("GetReviewInfoResponse.Data.Vid"));

		List<String> manualScoreMappingList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetReviewInfoResponse.Data.ManualScoreMappingList.Length"); i++) {
			manualScoreMappingList.add(context.stringValue("GetReviewInfoResponse.Data.ManualScoreMappingList["+ i +"]"));
		}
		data.setManualScoreMappingList(manualScoreMappingList);

		List<Dialogue> dialogues = new ArrayList<Dialogue>();
		for (int i = 0; i < context.lengthValue("GetReviewInfoResponse.Data.Dialogues.Length"); i++) {
			Dialogue dialogue = new Dialogue();
			dialogue.setBegin(context.longValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].Begin"));
			dialogue.setBeginTime(context.stringValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].BeginTime"));
			dialogue.setEmotionValue(context.integerValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].EmotionValue"));
			dialogue.setEnd(context.longValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].End"));
			dialogue.setHourMinSec(context.stringValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].HourMinSec"));
			dialogue.setIdentity(context.stringValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].Identity"));
			dialogue.setRole(context.stringValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].Role"));
			dialogue.setSilenceDuration(context.integerValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].SilenceDuration"));
			dialogue.setSpeechRate(context.integerValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].SpeechRate"));
			dialogue.setWords(context.stringValue("GetReviewInfoResponse.Data.Dialogues["+ i +"].Words"));

			dialogues.add(dialogue);
		}
		data.setDialogues(dialogues);

		List<ScorePo> handScoreInfoList = new ArrayList<ScorePo>();
		for (int i = 0; i < context.lengthValue("GetReviewInfoResponse.Data.HandScoreInfoList.Length"); i++) {
			ScorePo scorePo = new ScorePo();
			scorePo.setScoreId(context.longValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreId"));
			scorePo.setScoreName(context.stringValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreName"));

			List<ScoreParam> scoreInfos = new ArrayList<ScoreParam>();
			for (int j = 0; j < context.lengthValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos.Length"); j++) {
				ScoreParam scoreParam = new ScoreParam();
				scoreParam.setHit(context.integerValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].Hit"));
				scoreParam.setScoreNum(context.integerValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreNum"));
				scoreParam.setScoreSubId(context.longValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubId"));
				scoreParam.setScoreSubName(context.stringValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubName"));
				scoreParam.setScoreType(context.integerValue("GetReviewInfoResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreType"));

				scoreInfos.add(scoreParam);
			}
			scorePo.setScoreInfos(scoreInfos);

			handScoreInfoList.add(scorePo);
		}
		data.setHandScoreInfoList(handScoreInfoList);

		List<HitRuleReviewInfo> hitRuleReviewInfoList = new ArrayList<HitRuleReviewInfo>();
		for (int i = 0; i < context.lengthValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList.Length"); i++) {
			HitRuleReviewInfo hitRuleReviewInfo = new HitRuleReviewInfo();
			hitRuleReviewInfo.setAutoReview(context.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].AutoReview"));
			hitRuleReviewInfo.setRid(context.longValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].Rid"));
			hitRuleReviewInfo.setRuleName(context.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].RuleName"));
			hitRuleReviewInfo.setRuleScoreType(context.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].RuleScoreType"));
			hitRuleReviewInfo.setRuleType(context.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].RuleType"));
			hitRuleReviewInfo.setScoreId(context.longValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreId"));
			hitRuleReviewInfo.setScoreSubId(context.longValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreSubId"));
			hitRuleReviewInfo.setTotalNumber(context.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].TotalNumber"));

			ReviewInfo reviewInfo = new ReviewInfo();
			reviewInfo.setHitId(context.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.HitId"));
			reviewInfo.setRid(context.longValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.Rid"));
			hitRuleReviewInfo.setReviewInfo(reviewInfo);

			List<ConditionHitInfo> conditionHitInfoList = new ArrayList<ConditionHitInfo>();
			for (int j = 0; j < context.lengthValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList.Length"); j++) {
				ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

				List<String> cid = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid.Length"); k++) {
					cid.add(context.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid["+ k +"]"));
				}
				conditionHitInfo.setCid(cid);

				Phrase phrase = new Phrase();
				phrase.setRole(context.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Role"));
				phrase.setIdentity(context.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Identity"));
				phrase.setEmotionValue(context.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.EmotionValue"));
				phrase.setWords(context.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Words"));
				phrase.setEnd(context.longValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.End"));
				phrase.setPid(context.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Pid"));
				phrase.setBegin(context.longValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Begin"));
				conditionHitInfo.setPhrase(phrase);

				List<KeyWord> keyWords = new ArrayList<KeyWord>();
				for (int k = 0; k < context.lengthValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords.Length"); k++) {
					KeyWord keyWord = new KeyWord();
					keyWord.setVal(context.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Val"));
					keyWord.setPid(context.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Pid"));
					keyWord.setFrom(context.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].From"));
					keyWord.setTo(context.integerValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].To"));
					keyWord.setTid(context.stringValue("GetReviewInfoResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Tid"));

					keyWords.add(keyWord);
				}
				conditionHitInfo.setKeyWords(keyWords);

				conditionHitInfoList.add(conditionHitInfo);
			}
			hitRuleReviewInfo.setConditionHitInfoList(conditionHitInfoList);

			hitRuleReviewInfoList.add(hitRuleReviewInfo);
		}
		data.setHitRuleReviewInfoList(hitRuleReviewInfoList);
		getReviewInfoResponse.setData(data);
	 
	 	return getReviewInfoResponse;
	}
}