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
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.HitRuleReviewInfo.ComplainHistoriesItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.HitRuleReviewInfo.ConditionHitInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.HitRuleReviewInfo.ConditionHitInfo.KeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.HitRuleReviewInfo.ConditionHitInfo.Phrase;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.HitRuleReviewInfo.ReviewInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.ManualScoreInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.ManualScoreInfo.ComplainHistoriesItem2;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.ReviewHistory;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.ScorePo;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultToReviewResponse.Data.ScorePo.ScoreParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResultToReviewResponseUnmarshaller {

	public static GetResultToReviewResponse unmarshall(GetResultToReviewResponse getResultToReviewResponse, UnmarshallerContext _ctx) {
		
		getResultToReviewResponse.setRequestId(_ctx.stringValue("GetResultToReviewResponse.RequestId"));
		getResultToReviewResponse.setSuccess(_ctx.booleanValue("GetResultToReviewResponse.Success"));
		getResultToReviewResponse.setCode(_ctx.stringValue("GetResultToReviewResponse.Code"));
		getResultToReviewResponse.setMessage(_ctx.stringValue("GetResultToReviewResponse.Message"));

		Data data = new Data();
		data.setAudio(_ctx.booleanValue("GetResultToReviewResponse.Data.Audio"));
		data.setAudioScheme(_ctx.stringValue("GetResultToReviewResponse.Data.AudioScheme"));
		data.setAudioURL(_ctx.stringValue("GetResultToReviewResponse.Data.AudioURL"));
		data.setBusinessType(_ctx.integerValue("GetResultToReviewResponse.Data.BusinessType"));
		data.setDeleted(_ctx.booleanValue("GetResultToReviewResponse.Data.Deleted"));
		data.setFileMergeName(_ctx.stringValue("GetResultToReviewResponse.Data.FileMergeName"));
		data.setHitNumber(_ctx.integerValue("GetResultToReviewResponse.Data.HitNumber"));
		data.setReviewNumber(_ctx.integerValue("GetResultToReviewResponse.Data.ReviewNumber"));
		data.setTotalScore(_ctx.integerValue("GetResultToReviewResponse.Data.TotalScore"));
		data.setVid(_ctx.stringValue("GetResultToReviewResponse.Data.Vid"));
		data.setComments(_ctx.stringValue("GetResultToReviewResponse.Data.Comments"));
		data.setFileId(_ctx.stringValue("GetResultToReviewResponse.Data.FileId"));

		List<Dialogue> dialogues = new ArrayList<Dialogue>();
		for (int i = 0; i < _ctx.lengthValue("GetResultToReviewResponse.Data.Dialogues.Length"); i++) {
			Dialogue dialogue = new Dialogue();
			dialogue.setBegin(_ctx.longValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].Begin"));
			dialogue.setBeginTime(_ctx.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].BeginTime"));
			dialogue.setEmotionValue(_ctx.integerValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].EmotionValue"));
			dialogue.setEnd(_ctx.longValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].End"));
			dialogue.setHourMinSec(_ctx.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].HourMinSec"));
			dialogue.setIdentity(_ctx.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].Identity"));
			dialogue.setRole(_ctx.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].Role"));
			dialogue.setSilenceDuration(_ctx.integerValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].SilenceDuration"));
			dialogue.setSpeechRate(_ctx.integerValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].SpeechRate"));
			dialogue.setWords(_ctx.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].Words"));

			dialogues.add(dialogue);
		}
		data.setDialogues(dialogues);

		List<ScorePo> handScoreInfoList = new ArrayList<ScorePo>();
		for (int i = 0; i < _ctx.lengthValue("GetResultToReviewResponse.Data.HandScoreInfoList.Length"); i++) {
			ScorePo scorePo = new ScorePo();
			scorePo.setScoreId(_ctx.longValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreId"));
			scorePo.setScoreName(_ctx.stringValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreName"));

			List<ScoreParam> scoreInfos = new ArrayList<ScoreParam>();
			for (int j = 0; j < _ctx.lengthValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos.Length"); j++) {
				ScoreParam scoreParam = new ScoreParam();
				scoreParam.setHit(_ctx.integerValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].Hit"));
				scoreParam.setScoreNum(_ctx.integerValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreNum"));
				scoreParam.setScoreSubId(_ctx.longValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubId"));
				scoreParam.setScoreSubName(_ctx.stringValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubName"));
				scoreParam.setScoreType(_ctx.integerValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreType"));

				scoreInfos.add(scoreParam);
			}
			scorePo.setScoreInfos(scoreInfos);

			handScoreInfoList.add(scorePo);
		}
		data.setHandScoreInfoList(handScoreInfoList);

		List<HitRuleReviewInfo> hitRuleReviewInfoList = new ArrayList<HitRuleReviewInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList.Length"); i++) {
			HitRuleReviewInfo hitRuleReviewInfo = new HitRuleReviewInfo();
			hitRuleReviewInfo.setAutoReview(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].AutoReview"));
			hitRuleReviewInfo.setRid(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].Rid"));
			hitRuleReviewInfo.setRuleName(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleName"));
			hitRuleReviewInfo.setRuleScoreType(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleScoreType"));
			hitRuleReviewInfo.setRuleType(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleType"));
			hitRuleReviewInfo.setScoreId(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreId"));
			hitRuleReviewInfo.setScoreSubId(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreSubId"));
			hitRuleReviewInfo.setTotalNumber(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].TotalNumber"));
			hitRuleReviewInfo.setScoreSubName(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreSubName"));
			hitRuleReviewInfo.setScoreNum(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreNum"));
			hitRuleReviewInfo.setComplainable(_ctx.booleanValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].Complainable"));

			ReviewInfo reviewInfo = new ReviewInfo();
			reviewInfo.setHitId(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.HitId"));
			reviewInfo.setRid(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.Rid"));
			reviewInfo.setReviewResult(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.ReviewResult"));
			reviewInfo.setReviewer(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.Reviewer"));
			reviewInfo.setReviewTime(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.ReviewTime"));
			hitRuleReviewInfo.setReviewInfo(reviewInfo);

			List<ConditionHitInfo> conditionHitInfoList = new ArrayList<ConditionHitInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList.Length"); j++) {
				ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

				List<String> cid = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid.Length"); k++) {
					cid.add(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid["+ k +"]"));
				}
				conditionHitInfo.setCid(cid);

				Phrase phrase = new Phrase();
				phrase.setRole(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Role"));
				phrase.setIdentity(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Identity"));
				phrase.setEmotionValue(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.EmotionValue"));
				phrase.setWords(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Words"));
				phrase.setEnd(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.End"));
				phrase.setPid(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Pid"));
				phrase.setBegin(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Begin"));
				conditionHitInfo.setPhrase(phrase);

				List<KeyWord> keyWords = new ArrayList<KeyWord>();
				for (int k = 0; k < _ctx.lengthValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords.Length"); k++) {
					KeyWord keyWord = new KeyWord();
					keyWord.setVal(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Val"));
					keyWord.setPid(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Pid"));
					keyWord.setFrom(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].From"));
					keyWord.setTo(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].To"));
					keyWord.setTid(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Tid"));
					keyWord.setCid(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Cid"));

					keyWords.add(keyWord);
				}
				conditionHitInfo.setKeyWords(keyWords);

				conditionHitInfoList.add(conditionHitInfo);
			}
			hitRuleReviewInfo.setConditionHitInfoList(conditionHitInfoList);

			List<ComplainHistoriesItem> complainHistories = new ArrayList<ComplainHistoriesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ComplainHistories.Length"); j++) {
				ComplainHistoriesItem complainHistoriesItem = new ComplainHistoriesItem();
				complainHistoriesItem.setComments(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ComplainHistories["+ j +"].Comments"));
				complainHistoriesItem.setOperatorName(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ComplainHistories["+ j +"].OperatorName"));
				complainHistoriesItem.setOperator(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ComplainHistories["+ j +"].Operator"));
				complainHistoriesItem.setOperationType(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ComplainHistories["+ j +"].OperationType"));
				complainHistoriesItem.setOperationTime(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ComplainHistories["+ j +"].OperationTime"));

				complainHistories.add(complainHistoriesItem);
			}
			hitRuleReviewInfo.setComplainHistories(complainHistories);

			hitRuleReviewInfoList.add(hitRuleReviewInfo);
		}
		data.setHitRuleReviewInfoList(hitRuleReviewInfoList);

		List<ManualScoreInfo> manualScoreInfoList = new ArrayList<ManualScoreInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetResultToReviewResponse.Data.ManualScoreInfoList.Length"); i++) {
			ManualScoreInfo manualScoreInfo = new ManualScoreInfo();
			manualScoreInfo.setScoreId(_ctx.longValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ScoreId"));
			manualScoreInfo.setScoreSubId(_ctx.longValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ScoreSubId"));
			manualScoreInfo.setScoreSubName(_ctx.stringValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ScoreSubName"));
			manualScoreInfo.setScoreNum(_ctx.integerValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ScoreNum"));
			manualScoreInfo.setComplainable(_ctx.booleanValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].Complainable"));

			List<ComplainHistoriesItem2> complainHistories1 = new ArrayList<ComplainHistoriesItem2>();
			for (int j = 0; j < _ctx.lengthValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ComplainHistories.Length"); j++) {
				ComplainHistoriesItem2 complainHistoriesItem2 = new ComplainHistoriesItem2();
				complainHistoriesItem2.setComments(_ctx.stringValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ComplainHistories["+ j +"].Comments"));
				complainHistoriesItem2.setOperatorName(_ctx.stringValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ComplainHistories["+ j +"].OperatorName"));
				complainHistoriesItem2.setOperator(_ctx.longValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ComplainHistories["+ j +"].Operator"));
				complainHistoriesItem2.setOperationType(_ctx.integerValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ComplainHistories["+ j +"].OperationType"));
				complainHistoriesItem2.setOperationTime(_ctx.stringValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ComplainHistories["+ j +"].OperationTime"));

				complainHistories1.add(complainHistoriesItem2);
			}
			manualScoreInfo.setComplainHistories1(complainHistories1);

			manualScoreInfoList.add(manualScoreInfo);
		}
		data.setManualScoreInfoList(manualScoreInfoList);

		List<ReviewHistory> reviewHistoryList = new ArrayList<ReviewHistory>();
		for (int i = 0; i < _ctx.lengthValue("GetResultToReviewResponse.Data.ReviewHistoryList.Length"); i++) {
			ReviewHistory reviewHistory = new ReviewHistory();
			reviewHistory.setTimeStr(_ctx.stringValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].TimeStr"));
			reviewHistory.setOperatorName(_ctx.stringValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].OperatorName"));
			reviewHistory.setType(_ctx.integerValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].Type"));
			reviewHistory.setReviewResult(_ctx.integerValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].ReviewResult"));
			reviewHistory.setComplainResult(_ctx.integerValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].ComplainResult"));
			reviewHistory.setOldScore(_ctx.integerValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].OldScore"));
			reviewHistory.setScore(_ctx.integerValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].Score"));

			reviewHistoryList.add(reviewHistory);
		}
		data.setReviewHistoryList(reviewHistoryList);
		getResultToReviewResponse.setData(data);
	 
	 	return getResultToReviewResponse;
	}
}