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
		getResultToReviewResponse.setCode(_ctx.stringValue("GetResultToReviewResponse.Code"));
		getResultToReviewResponse.setMessage(_ctx.stringValue("GetResultToReviewResponse.Message"));
		getResultToReviewResponse.setSuccess(_ctx.booleanValue("GetResultToReviewResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("GetResultToReviewResponse.Data.Status"));
		data.setAudioScheme(_ctx.stringValue("GetResultToReviewResponse.Data.AudioScheme"));
		data.setAudioURL(_ctx.stringValue("GetResultToReviewResponse.Data.AudioURL"));
		data.setHitNumber(_ctx.integerValue("GetResultToReviewResponse.Data.HitNumber"));
		data.setAudio(_ctx.booleanValue("GetResultToReviewResponse.Data.Audio"));
		data.setTotalScore(_ctx.integerValue("GetResultToReviewResponse.Data.TotalScore"));
		data.setBusinessType(_ctx.integerValue("GetResultToReviewResponse.Data.BusinessType"));
		data.setFileId(_ctx.stringValue("GetResultToReviewResponse.Data.FileId"));
		data.setFileMergeName(_ctx.stringValue("GetResultToReviewResponse.Data.FileMergeName"));
		data.setComments(_ctx.stringValue("GetResultToReviewResponse.Data.Comments"));
		data.setDeleted(_ctx.booleanValue("GetResultToReviewResponse.Data.Deleted"));
		data.setVid(_ctx.stringValue("GetResultToReviewResponse.Data.Vid"));
		data.setReviewNumber(_ctx.integerValue("GetResultToReviewResponse.Data.ReviewNumber"));

		List<Dialogue> dialogues = new ArrayList<Dialogue>();
		for (int i = 0; i < _ctx.lengthValue("GetResultToReviewResponse.Data.Dialogues.Length"); i++) {
			Dialogue dialogue = new Dialogue();
			dialogue.setWords(_ctx.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].Words"));
			dialogue.setIdentity(_ctx.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].Identity"));
			dialogue.setBegin(_ctx.longValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].Begin"));
			dialogue.setBeginTime(_ctx.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].BeginTime"));
			dialogue.setEmotionValue(_ctx.integerValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].EmotionValue"));
			dialogue.setEnd(_ctx.longValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].End"));
			dialogue.setSpeechRate(_ctx.integerValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].SpeechRate"));
			dialogue.setRole(_ctx.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].Role"));
			dialogue.setSilenceDuration(_ctx.integerValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].SilenceDuration"));
			dialogue.setHourMinSec(_ctx.stringValue("GetResultToReviewResponse.Data.Dialogues["+ i +"].HourMinSec"));

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
				scoreParam.setScoreSubName(_ctx.stringValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubName"));
				scoreParam.setScoreNum(_ctx.integerValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreNum"));
				scoreParam.setHit(_ctx.integerValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].Hit"));
				scoreParam.setScoreSubId(_ctx.longValue("GetResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubId"));
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
			hitRuleReviewInfo.setRuleScoreType(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleScoreType"));
			hitRuleReviewInfo.setRuleType(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleType"));
			hitRuleReviewInfo.setScoreSubName(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreSubName"));
			hitRuleReviewInfo.setScoreNum(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreNum"));
			hitRuleReviewInfo.setAutoReview(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].AutoReview"));
			hitRuleReviewInfo.setScoreSubId(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreSubId"));
			hitRuleReviewInfo.setComplainable(_ctx.booleanValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].Complainable"));
			hitRuleReviewInfo.setTotalNumber(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].TotalNumber"));
			hitRuleReviewInfo.setScoreId(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreId"));
			hitRuleReviewInfo.setRuleName(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleName"));
			hitRuleReviewInfo.setRid(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].Rid"));

			ReviewInfo reviewInfo = new ReviewInfo();
			reviewInfo.setReviewResult(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.ReviewResult"));
			reviewInfo.setReviewTime(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.ReviewTime"));
			reviewInfo.setHitId(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.HitId"));
			reviewInfo.setReviewer(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.Reviewer"));
			reviewInfo.setRid(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.Rid"));
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
				phrase.setWords(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Words"));
				phrase.setBegin(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Begin"));
				phrase.setIdentity(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Identity"));
				phrase.setPid(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Pid"));
				phrase.setEmotionValue(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.EmotionValue"));
				phrase.setEnd(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.End"));
				phrase.setRole(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Role"));
				conditionHitInfo.setPhrase(phrase);

				List<KeyWord> keyWords = new ArrayList<KeyWord>();
				for (int k = 0; k < _ctx.lengthValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords.Length"); k++) {
					KeyWord keyWord = new KeyWord();
					keyWord.setFrom(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].From"));
					keyWord.setVal(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Val"));
					keyWord.setPid(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Pid"));
					keyWord.setTid(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Tid"));
					keyWord.setCid(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Cid"));
					keyWord.setTo(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].To"));
					keyWord.setCustomizeCode(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].CustomizeCode"));

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
				complainHistoriesItem.setOperator(_ctx.longValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ComplainHistories["+ j +"].Operator"));
				complainHistoriesItem.setOperationTime(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ComplainHistories["+ j +"].OperationTime"));
				complainHistoriesItem.setOperationType(_ctx.integerValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ComplainHistories["+ j +"].OperationType"));
				complainHistoriesItem.setOperatorName(_ctx.stringValue("GetResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ComplainHistories["+ j +"].OperatorName"));

				complainHistories.add(complainHistoriesItem);
			}
			hitRuleReviewInfo.setComplainHistories(complainHistories);

			hitRuleReviewInfoList.add(hitRuleReviewInfo);
		}
		data.setHitRuleReviewInfoList(hitRuleReviewInfoList);

		List<ManualScoreInfo> manualScoreInfoList = new ArrayList<ManualScoreInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetResultToReviewResponse.Data.ManualScoreInfoList.Length"); i++) {
			ManualScoreInfo manualScoreInfo = new ManualScoreInfo();
			manualScoreInfo.setScoreSubName(_ctx.stringValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ScoreSubName"));
			manualScoreInfo.setComplainable(_ctx.booleanValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].Complainable"));
			manualScoreInfo.setScoreNum(_ctx.integerValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ScoreNum"));
			manualScoreInfo.setScoreSubId(_ctx.longValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ScoreSubId"));
			manualScoreInfo.setScoreId(_ctx.longValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ScoreId"));

			List<ComplainHistoriesItem2> complainHistories1 = new ArrayList<ComplainHistoriesItem2>();
			for (int j = 0; j < _ctx.lengthValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ComplainHistories.Length"); j++) {
				ComplainHistoriesItem2 complainHistoriesItem2 = new ComplainHistoriesItem2();
				complainHistoriesItem2.setComments(_ctx.stringValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ComplainHistories["+ j +"].Comments"));
				complainHistoriesItem2.setOperator(_ctx.longValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ComplainHistories["+ j +"].Operator"));
				complainHistoriesItem2.setOperationTime(_ctx.stringValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ComplainHistories["+ j +"].OperationTime"));
				complainHistoriesItem2.setOperationType(_ctx.integerValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ComplainHistories["+ j +"].OperationType"));
				complainHistoriesItem2.setOperatorName(_ctx.stringValue("GetResultToReviewResponse.Data.ManualScoreInfoList["+ i +"].ComplainHistories["+ j +"].OperatorName"));

				complainHistories1.add(complainHistoriesItem2);
			}
			manualScoreInfo.setComplainHistories1(complainHistories1);

			manualScoreInfoList.add(manualScoreInfo);
		}
		data.setManualScoreInfoList(manualScoreInfoList);

		List<ReviewHistory> reviewHistoryList = new ArrayList<ReviewHistory>();
		for (int i = 0; i < _ctx.lengthValue("GetResultToReviewResponse.Data.ReviewHistoryList.Length"); i++) {
			ReviewHistory reviewHistory = new ReviewHistory();
			reviewHistory.setType(_ctx.integerValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].Type"));
			reviewHistory.setOperatorName(_ctx.stringValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].OperatorName"));
			reviewHistory.setTimeStr(_ctx.stringValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].TimeStr"));
			reviewHistory.setScore(_ctx.integerValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].Score"));
			reviewHistory.setReviewResult(_ctx.integerValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].ReviewResult"));
			reviewHistory.setComplainResult(_ctx.integerValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].ComplainResult"));
			reviewHistory.setOldScore(_ctx.integerValue("GetResultToReviewResponse.Data.ReviewHistoryList["+ i +"].OldScore"));

			reviewHistoryList.add(reviewHistory);
		}
		data.setReviewHistoryList(reviewHistoryList);
		getResultToReviewResponse.setData(data);
	 
	 	return getResultToReviewResponse;
	}
}