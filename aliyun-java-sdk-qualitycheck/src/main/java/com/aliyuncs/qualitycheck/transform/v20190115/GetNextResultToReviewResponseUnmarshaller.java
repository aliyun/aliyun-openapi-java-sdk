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

	public static GetNextResultToReviewResponse unmarshall(GetNextResultToReviewResponse getNextResultToReviewResponse, UnmarshallerContext _ctx) {
		
		getNextResultToReviewResponse.setRequestId(_ctx.stringValue("GetNextResultToReviewResponse.RequestId"));
		getNextResultToReviewResponse.setSuccess(_ctx.booleanValue("GetNextResultToReviewResponse.Success"));
		getNextResultToReviewResponse.setCode(_ctx.stringValue("GetNextResultToReviewResponse.Code"));
		getNextResultToReviewResponse.setMessage(_ctx.stringValue("GetNextResultToReviewResponse.Message"));

		Data data = new Data();
		data.setAsrWordsCount(_ctx.integerValue("GetNextResultToReviewResponse.Data.AsrWordsCount"));
		data.setAudio(_ctx.booleanValue("GetNextResultToReviewResponse.Data.Audio"));
		data.setAudioScheme(_ctx.stringValue("GetNextResultToReviewResponse.Data.AudioScheme"));
		data.setAudioURL(_ctx.stringValue("GetNextResultToReviewResponse.Data.AudioURL"));
		data.setBusinessType(_ctx.integerValue("GetNextResultToReviewResponse.Data.BusinessType"));
		data.setDeleted(_ctx.booleanValue("GetNextResultToReviewResponse.Data.Deleted"));
		data.setFileMergeName(_ctx.stringValue("GetNextResultToReviewResponse.Data.FileMergeName"));
		data.setHitNumber(_ctx.integerValue("GetNextResultToReviewResponse.Data.HitNumber"));
		data.setReviewNumber(_ctx.integerValue("GetNextResultToReviewResponse.Data.ReviewNumber"));
		data.setTotalScore(_ctx.integerValue("GetNextResultToReviewResponse.Data.TotalScore"));
		data.setVid(_ctx.stringValue("GetNextResultToReviewResponse.Data.Vid"));
		data.setComments(_ctx.stringValue("GetNextResultToReviewResponse.Data.Comments"));
		data.setFileId(_ctx.stringValue("GetNextResultToReviewResponse.Data.FileId"));

		List<String> manualScoreMappingList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetNextResultToReviewResponse.Data.ManualScoreMappingList.Length"); i++) {
			manualScoreMappingList.add(_ctx.stringValue("GetNextResultToReviewResponse.Data.ManualScoreMappingList["+ i +"]"));
		}
		data.setManualScoreMappingList(manualScoreMappingList);

		List<Dialogue> dialogues = new ArrayList<Dialogue>();
		for (int i = 0; i < _ctx.lengthValue("GetNextResultToReviewResponse.Data.Dialogues.Length"); i++) {
			Dialogue dialogue = new Dialogue();
			dialogue.setBegin(_ctx.longValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].Begin"));
			dialogue.setBeginTime(_ctx.stringValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].BeginTime"));
			dialogue.setEmotionValue(_ctx.integerValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].EmotionValue"));
			dialogue.setEnd(_ctx.longValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].End"));
			dialogue.setHourMinSec(_ctx.stringValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].HourMinSec"));
			dialogue.setIdentity(_ctx.stringValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].Identity"));
			dialogue.setRole(_ctx.stringValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].Role"));
			dialogue.setSilenceDuration(_ctx.integerValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].SilenceDuration"));
			dialogue.setSpeechRate(_ctx.integerValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].SpeechRate"));
			dialogue.setWords(_ctx.stringValue("GetNextResultToReviewResponse.Data.Dialogues["+ i +"].Words"));

			dialogues.add(dialogue);
		}
		data.setDialogues(dialogues);

		List<ScorePo> handScoreInfoList = new ArrayList<ScorePo>();
		for (int i = 0; i < _ctx.lengthValue("GetNextResultToReviewResponse.Data.HandScoreInfoList.Length"); i++) {
			ScorePo scorePo = new ScorePo();
			scorePo.setScoreId(_ctx.longValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreId"));
			scorePo.setScoreName(_ctx.stringValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreName"));

			List<ScoreParam> scoreInfos = new ArrayList<ScoreParam>();
			for (int j = 0; j < _ctx.lengthValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos.Length"); j++) {
				ScoreParam scoreParam = new ScoreParam();
				scoreParam.setHit(_ctx.integerValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].Hit"));
				scoreParam.setScoreNum(_ctx.integerValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreNum"));
				scoreParam.setScoreSubId(_ctx.longValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubId"));
				scoreParam.setScoreSubName(_ctx.stringValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreSubName"));
				scoreParam.setScoreType(_ctx.integerValue("GetNextResultToReviewResponse.Data.HandScoreInfoList["+ i +"].ScoreInfos["+ j +"].ScoreType"));

				scoreInfos.add(scoreParam);
			}
			scorePo.setScoreInfos(scoreInfos);

			handScoreInfoList.add(scorePo);
		}
		data.setHandScoreInfoList(handScoreInfoList);

		List<HitRuleReviewInfo> hitRuleReviewInfoList = new ArrayList<HitRuleReviewInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList.Length"); i++) {
			HitRuleReviewInfo hitRuleReviewInfo = new HitRuleReviewInfo();
			hitRuleReviewInfo.setAutoReview(_ctx.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].AutoReview"));
			hitRuleReviewInfo.setRid(_ctx.longValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].Rid"));
			hitRuleReviewInfo.setRuleName(_ctx.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleName"));
			hitRuleReviewInfo.setRuleScoreType(_ctx.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleScoreType"));
			hitRuleReviewInfo.setRuleType(_ctx.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].RuleType"));
			hitRuleReviewInfo.setScoreId(_ctx.longValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreId"));
			hitRuleReviewInfo.setScoreSubId(_ctx.longValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ScoreSubId"));
			hitRuleReviewInfo.setTotalNumber(_ctx.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].TotalNumber"));

			ReviewInfo reviewInfo = new ReviewInfo();
			reviewInfo.setHitId(_ctx.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.HitId"));
			reviewInfo.setRid(_ctx.longValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ReviewInfo.Rid"));
			hitRuleReviewInfo.setReviewInfo(reviewInfo);

			List<ConditionHitInfo> conditionHitInfoList = new ArrayList<ConditionHitInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList.Length"); j++) {
				ConditionHitInfo conditionHitInfo = new ConditionHitInfo();

				List<String> cid = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid.Length"); k++) {
					cid.add(_ctx.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Cid["+ k +"]"));
				}
				conditionHitInfo.setCid(cid);

				Phrase phrase = new Phrase();
				phrase.setRole(_ctx.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Role"));
				phrase.setIdentity(_ctx.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Identity"));
				phrase.setEmotionValue(_ctx.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.EmotionValue"));
				phrase.setWords(_ctx.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Words"));
				phrase.setEnd(_ctx.longValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.End"));
				phrase.setPid(_ctx.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Pid"));
				phrase.setBegin(_ctx.longValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].Phrase.Begin"));
				conditionHitInfo.setPhrase(phrase);

				List<KeyWord> keyWords = new ArrayList<KeyWord>();
				for (int k = 0; k < _ctx.lengthValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords.Length"); k++) {
					KeyWord keyWord = new KeyWord();
					keyWord.setVal(_ctx.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Val"));
					keyWord.setPid(_ctx.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Pid"));
					keyWord.setFrom(_ctx.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].From"));
					keyWord.setTo(_ctx.integerValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].To"));
					keyWord.setTid(_ctx.stringValue("GetNextResultToReviewResponse.Data.HitRuleReviewInfoList["+ i +"].ConditionHitInfoList["+ j +"].KeyWords["+ k +"].Tid"));

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