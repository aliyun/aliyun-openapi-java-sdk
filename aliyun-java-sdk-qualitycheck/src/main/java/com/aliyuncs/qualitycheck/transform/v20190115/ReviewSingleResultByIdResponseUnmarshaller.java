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

import com.aliyuncs.qualitycheck.model.v20190115.ReviewSingleResultByIdResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ReviewSingleResultByIdResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.ReviewSingleResultByIdResponse.Data.Dialogue;
import com.aliyuncs.qualitycheck.model.v20190115.ReviewSingleResultByIdResponse.Data.HitRuleReviewInfo;
import com.aliyuncs.qualitycheck.model.v20190115.ReviewSingleResultByIdResponse.Data.HitRuleReviewInfo.ConditionHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.ReviewSingleResultByIdResponse.Data.HitRuleReviewInfo.ConditionHitInfo.KeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.ReviewSingleResultByIdResponse.Data.HitRuleReviewInfo.ConditionHitInfo.Phrase;
import com.aliyuncs.qualitycheck.model.v20190115.ReviewSingleResultByIdResponse.Data.HitRuleReviewInfo.ReviewInfo;
import com.aliyuncs.qualitycheck.model.v20190115.ReviewSingleResultByIdResponse.Data.ScorePo;
import com.aliyuncs.qualitycheck.model.v20190115.ReviewSingleResultByIdResponse.Data.ScorePo.ScoreParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReviewSingleResultByIdResponseUnmarshaller {

	public static ReviewSingleResultByIdResponse unmarshall(ReviewSingleResultByIdResponse reviewSingleResultByIdResponse, UnmarshallerContext context) {
		
		reviewSingleResultByIdResponse.setRequestId(context.stringValue("ReviewSingleResultByIdResponse.RequestId"));
		reviewSingleResultByIdResponse.setSuccess(context.booleanValue("ReviewSingleResultByIdResponse.Success"));
		reviewSingleResultByIdResponse.setCode(context.stringValue("ReviewSingleResultByIdResponse.Code"));
		reviewSingleResultByIdResponse.setMessage(context.stringValue("ReviewSingleResultByIdResponse.Message"));

		Data data = new Data();
		data.setAsrWordsCount(context.integerValue("ReviewSingleResultByIdResponse.Data.AsrWordsCount"));
		data.setAudio(context.booleanValue("ReviewSingleResultByIdResponse.Data.Audio"));
		data.setAudioURL(context.stringValue("ReviewSingleResultByIdResponse.Data.AudioURL"));
		data.setBusinessType(context.integerValue("ReviewSingleResultByIdResponse.Data.BusinessType"));
		data.setDeleted(context.booleanValue("ReviewSingleResultByIdResponse.Data.Deleted"));
		data.setFileMergeName(context.stringValue("ReviewSingleResultByIdResponse.Data.FileMergeName"));
		data.setHitNumber(context.integerValue("ReviewSingleResultByIdResponse.Data.HitNumber"));
		data.setIsAudio(context.booleanValue("ReviewSingleResultByIdResponse.Data.IsAudio"));
		data.setIsDeleted(context.booleanValue("ReviewSingleResultByIdResponse.Data.IsDeleted"));
		data.setNextVid(context.stringValue("ReviewSingleResultByIdResponse.Data.NextVid"));
		data.setPreVid(context.stringValue("ReviewSingleResultByIdResponse.Data.PreVid"));
		data.setReviewNumber(context.integerValue("ReviewSingleResultByIdResponse.Data.ReviewNumber"));
		data.setTotalScore(context.integerValue("ReviewSingleResultByIdResponse.Data.TotalScore"));
		data.setVid(context.integerValue("ReviewSingleResultByIdResponse.Data.Vid"));

		List<String> manualScoreMappingList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ReviewSingleResultByIdResponse.Data.ManualScoreMappingList.Length"); i++) {
			manualScoreMappingList.add(context.stringValue("ReviewSingleResultByIdResponse.Data.ManualScoreMappingList["+ i +"]"));
		}
		data.setManualScoreMappingList(manualScoreMappingList);

		List<Dialogue> dialogues = new ArrayList<Dialogue>();
		for (int i = 0; i < context.lengthValue("ReviewSingleResultByIdResponse.Data.Dialogues.Length"); i++) {
			Dialogue dialogue = new Dialogue();
			dialogue.setBegin(context.longValue("ReviewSingleResultByIdResponse.Data.Dialogues["+ i +"].Begin"));
			dialogue.setBeginTime(context.longValue("ReviewSingleResultByIdResponse.Data.Dialogues["+ i +"].BeginTime"));
			dialogue.setEmotionValue(context.integerValue("ReviewSingleResultByIdResponse.Data.Dialogues["+ i +"].EmotionValue"));
			dialogue.setEnd(context.longValue("ReviewSingleResultByIdResponse.Data.Dialogues["+ i +"].End"));
			dialogue.setHourMinSec(context.stringValue("ReviewSingleResultByIdResponse.Data.Dialogues["+ i +"].HourMinSec"));
			dialogue.setIdentity(context.stringValue("ReviewSingleResultByIdResponse.Data.Dialogues["+ i +"].Identity"));
			dialogue.setRole(context.stringValue("ReviewSingleResultByIdResponse.Data.Dialogues["+ i +"].Role"));
			dialogue.setSilenceDuration(context.integerValue("ReviewSingleResultByIdResponse.Data.Dialogues["+ i +"].SilenceDuration"));
			dialogue.setSpeechRate(context.integerValue("ReviewSingleResultByIdResponse.Data.Dialogues["+ i +"].SpeechRate"));
			dialogue.setWords(context.stringValue("ReviewSingleResultByIdResponse.Data.Dialogues["+ i +"].Words"));

			dialogues.add(dialogue);
		}
		data.setDialogues(dialogues);

		List<ScorePo> handScoreInfoList = new ArrayList<ScorePo>();
		for (int i = 0; i < context.lengthValue("ReviewSingleResultByIdResponse.Data.HandScoreInfoList.Length"); i++) {
			ScorePo scorePo = new ScorePo();
			scorePo.setScoreId(context.longValue("ReviewSingleResultByIdResponse.Data.HandScoreInfoList["+ i +"].ScoreId"));
			scorePo.setScoreName(context.stringValue("ReviewSingleResultByIdResponse.Data.HandScoreInfoList["+ i +"].ScoreName"));

			List<ScoreParam> scoreInfos = new ArrayList<ScoreParam>();
			for (int j = 0; j < context.lengthValue("ReviewSingleResultByIdResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos.Length"); j++) {
				ScoreParam scoreParam = new ScoreParam();
				scoreParam.setHit(context.integerValue("ReviewSingleResultByIdResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].Hit"));
				scoreParam.setScoreNum(context.integerValue("ReviewSingleResultByIdResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreNum"));
				scoreParam.setScoreSubId(context.longValue("ReviewSingleResultByIdResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubId"));
				scoreParam.setScoreSubName(context.stringValue("ReviewSingleResultByIdResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubName"));
				scoreParam.setScoreType(context.integerValue("ReviewSingleResultByIdResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreType"));

				scoreInfos.add(scoreParam);
			}
			scorePo.setScoreInfos(scoreInfos);

			handScoreInfoList.add(scorePo);
		}
		data.setHandScoreInfoList(handScoreInfoList);

		List<HitRuleReviewInfo> hitRuleReviewInfoList = new ArrayList<HitRuleReviewInfo>();
		for (int i = 0; i < context.lengthValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList.Length"); i++) {
			HitRuleReviewInfo hitRuleReviewInfo = new HitRuleReviewInfo();
			hitRuleReviewInfo.setAutoReview(context.integerValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].AutoReview"));
			hitRuleReviewInfo.setRid(context.longValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].Rid"));
			hitRuleReviewInfo.setRuleName(context.stringValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].RuleName"));
			hitRuleReviewInfo.setRuleScoreType(context.integerValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].RuleScoreType"));
			hitRuleReviewInfo.setRuleType(context.integerValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].RuleType"));
			hitRuleReviewInfo.setScoreId(context.longValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreId"));
			hitRuleReviewInfo.setScoreSubId(context.longValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreSubId"));
			hitRuleReviewInfo.setTotalNumber(context.integerValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].TotalNumber"));
			hitRuleReviewInfo.setComments(context.stringValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].Comments"));

			ReviewInfo reviewInfo = new ReviewInfo();
			reviewInfo.setHitId(context.stringValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.HitId"));
			reviewInfo.setRid(context.longValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.Rid"));
			hitRuleReviewInfo.setReviewInfo(reviewInfo);

			List<ConditionHitInfo> conditionHitInfoList = new ArrayList<ConditionHitInfo>();
			for (int j = 0; j < context.lengthValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList.Length"); j++) {
				ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

				List<String> cid = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid.Length"); k++) {
					cid.add(context.stringValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid["+ k +"]"));
				}
				conditionHitInfo.setCid(cid);

				Phrase phrase = new Phrase();
				phrase.setRole(context.stringValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Role"));
				phrase.setIdentity(context.stringValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Identity"));
				phrase.setEmotionValue(context.integerValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.EmotionValue"));
				phrase.setWords(context.stringValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Words"));
				phrase.setEnd(context.longValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.End"));
				phrase.setPid(context.integerValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Pid"));
				phrase.setBegin(context.longValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Begin"));
				conditionHitInfo.setPhrase(phrase);

				List<KeyWord> keyWords = new ArrayList<KeyWord>();
				for (int k = 0; k < context.lengthValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords.Length"); k++) {
					KeyWord keyWord = new KeyWord();
					keyWord.setVal(context.stringValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Val"));
					keyWord.setPid(context.integerValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Pid"));
					keyWord.setFrom(context.integerValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].From"));
					keyWord.setTo(context.integerValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].To"));
					keyWord.setTid(context.stringValue("ReviewSingleResultByIdResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Tid"));

					keyWords.add(keyWord);
				}
				conditionHitInfo.setKeyWords(keyWords);

				conditionHitInfoList.add(conditionHitInfo);
			}
			hitRuleReviewInfo.setConditionHitInfoList(conditionHitInfoList);

			hitRuleReviewInfoList.add(hitRuleReviewInfo);
		}
		data.setHitRuleReviewInfoList(hitRuleReviewInfoList);
		reviewSingleResultByIdResponse.setData(data);
	 
	 	return reviewSingleResultByIdResponse;
	}
}