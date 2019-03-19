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

import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToReviewResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToReviewResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToReviewResponse.Data.Dialogue;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToReviewResponse.Data.HitRuleReviewInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToReviewResponse.Data.HitRuleReviewInfo.ConditionHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToReviewResponse.Data.HitRuleReviewInfo.ConditionHitInfo.KeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToReviewResponse.Data.HitRuleReviewInfo.ConditionHitInfo.Phrase;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToReviewResponse.Data.HitRuleReviewInfo.ReviewInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToReviewResponse.Data.ScorePo;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToReviewResponse.Data.ScorePo.ScoreParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNextResultToReviewResponseUnmarshaller {

	public static GetNextResultToReviewResponse unmarshall(GetNextResultToReviewResponse getNextResultToReviewResponse, UnmarshallerContext context) {
		
		getNextResultToReviewResponse.setRequestId(context.stringValue("GetNextResultToReviewResponse.RequestId"));
		getNextResultToReviewResponse.setSuccess(context.booleanValue("GetNextResultToReviewResponse.Success"));
		getNextResultToReviewResponse.setCode(context.stringValue("GetNextResultToReviewResponse.Code"));
		getNextResultToReviewResponse.setMessage(context.stringValue("GetNextResultToReviewResponse.Message"));

		Data data = new Data();
		data.setAsrWordsCount(context.integerValue("GetNextResultToReviewResponse.Data.AsrWordsCount"));
		data.setAudio(context.booleanValue("GetNextResultToReviewResponse.Data.Audio"));
		data.setAudioScheme(context.stringValue("GetNextResultToReviewResponse.Data.AudioScheme"));
		data.setAudioURL(context.stringValue("GetNextResultToReviewResponse.Data.AudioURL"));
		data.setBusinessType(context.integerValue("GetNextResultToReviewResponse.Data.BusinessType"));
		data.setDeleted(context.booleanValue("GetNextResultToReviewResponse.Data.Deleted"));
		data.setFileMergeName(context.stringValue("GetNextResultToReviewResponse.Data.FileMergeName"));
		data.setHitNumber(context.integerValue("GetNextResultToReviewResponse.Data.HitNumber"));
		data.setReviewNumber(context.integerValue("GetNextResultToReviewResponse.Data.ReviewNumber"));
		data.setTotalScore(context.integerValue("GetNextResultToReviewResponse.Data.TotalScore"));
		data.setVid(context.stringValue("GetNextResultToReviewResponse.Data.Vid"));
		data.setComments(context.stringValue("GetNextResultToReviewResponse.Data.Comments"));
		data.setFileId(context.stringValue("GetNextResultToReviewResponse.Data.FileId"));

		List<String> manualScoreMappingList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetNextResultToReviewResponse.Data.ManualScoreMappingList.Length"); i++) {
			manualScoreMappingList.add(context.stringValue("GetNextResultToReviewResponse.Data.ManualScoreMappingList["+ i +"]"));
		}
		data.setManualScoreMappingList(manualScoreMappingList);

		List<Dialogue> dialogues = new ArrayList<Dialogue>();
		for (int i = 0; i < context.lengthValue("GetNextResultToReviewResponse.Data.Dialogues.Length"); i++) {
			Dialogue dialogue = new Dialogue();
			dialogue.setBegin(context.longValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].Begin"));
			dialogue.setBeginTime(context.stringValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].BeginTime"));
			dialogue.setEmotionValue(context.integerValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].EmotionValue"));
			dialogue.setEnd(context.longValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].End"));
			dialogue.setHourMinSec(context.stringValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].HourMinSec"));
			dialogue.setIdentity(context.stringValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].Identity"));
			dialogue.setRole(context.stringValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].Role"));
			dialogue.setSilenceDuration(context.integerValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].SilenceDuration"));
			dialogue.setSpeechRate(context.integerValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].SpeechRate"));
			dialogue.setWords(context.stringValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].Words"));

			dialogues.add(dialogue);
		}
		data.setDialogues(dialogues);

		List<ScorePo> handScoreInfoList = new ArrayList<ScorePo>();
		for (int i = 0; i < context.lengthValue("GetNextResultToReviewResponse.Data.HandScoreInfoList.Length"); i++) {
			ScorePo scorePo = new ScorePo();
			scorePo.setScoreId(context.longValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreId"));
			scorePo.setScoreName(context.stringValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreName"));

			List<ScoreParam> scoreInfos = new ArrayList<ScoreParam>();
			for (int j = 0; j < context.lengthValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos.Length"); j++) {
				ScoreParam scoreParam = new ScoreParam();
				scoreParam.setHit(context.integerValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].Hit"));
				scoreParam.setScoreNum(context.integerValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreNum"));
				scoreParam.setScoreSubId(context.longValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubId"));
				scoreParam.setScoreSubName(context.stringValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubName"));
				scoreParam.setScoreType(context.integerValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreType"));

				scoreInfos.add(scoreParam);
			}
			scorePo.setScoreInfos(scoreInfos);

			handScoreInfoList.add(scorePo);
		}
		data.setHandScoreInfoList(handScoreInfoList);

		List<HitRuleReviewInfo> hitRuleReviewInfoList = new ArrayList<HitRuleReviewInfo>();
		for (int i = 0; i < context.lengthValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList.Length"); i++) {
			HitRuleReviewInfo hitRuleReviewInfo = new HitRuleReviewInfo();
			hitRuleReviewInfo.setAutoReview(context.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].AutoReview"));
			hitRuleReviewInfo.setRid(context.longValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].Rid"));
			hitRuleReviewInfo.setRuleName(context.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleName"));
			hitRuleReviewInfo.setRuleScoreType(context.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleScoreType"));
			hitRuleReviewInfo.setRuleType(context.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleType"));
			hitRuleReviewInfo.setScoreId(context.longValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreId"));
			hitRuleReviewInfo.setScoreSubId(context.longValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreSubId"));
			hitRuleReviewInfo.setTotalNumber(context.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].TotalNumber"));

			ReviewInfo reviewInfo = new ReviewInfo();
			reviewInfo.setHitId(context.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.HitId"));
			reviewInfo.setRid(context.longValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.Rid"));
			hitRuleReviewInfo.setReviewInfo(reviewInfo);

			List<ConditionHitInfo> conditionHitInfoList = new ArrayList<ConditionHitInfo>();
			for (int j = 0; j < context.lengthValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList.Length"); j++) {
				ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

				List<String> cid = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid.Length"); k++) {
					cid.add(context.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid["+ k +"]"));
				}
				conditionHitInfo.setCid(cid);

				Phrase phrase = new Phrase();
				phrase.setRole(context.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Role"));
				phrase.setIdentity(context.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Identity"));
				phrase.setEmotionValue(context.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.EmotionValue"));
				phrase.setWords(context.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Words"));
				phrase.setEnd(context.longValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.End"));
				phrase.setPid(context.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Pid"));
				phrase.setBegin(context.longValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Begin"));
				conditionHitInfo.setPhrase(phrase);

				List<KeyWord> keyWords = new ArrayList<KeyWord>();
				for (int k = 0; k < context.lengthValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords.Length"); k++) {
					KeyWord keyWord = new KeyWord();
					keyWord.setVal(context.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Val"));
					keyWord.setPid(context.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Pid"));
					keyWord.setFrom(context.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].From"));
					keyWord.setTo(context.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].To"));
					keyWord.setTid(context.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Tid"));

					keyWords.add(keyWord);
				}
				conditionHitInfo.setKeyWords(keyWords);

				conditionHitInfoList.add(conditionHitInfo);
			}
			hitRuleReviewInfo.setConditionHitInfoList(conditionHitInfoList);

			hitRuleReviewInfoList.add(hitRuleReviewInfo);
		}
		data.setHitRuleReviewInfoList(hitRuleReviewInfoList);
		getNextResultToReviewResponse.setData(data);
	 
	 	return getNextResultToReviewResponse;
	}
}