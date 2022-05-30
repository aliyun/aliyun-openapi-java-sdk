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

import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.Agent;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.AsrResultItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.Hit;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.Hit.KeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.Hit.Phrase;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitScoreItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResultResponseUnmarshaller {

	public static GetResultResponse unmarshall(GetResultResponse getResultResponse, UnmarshallerContext _ctx) {
		
		getResultResponse.setRequestId(_ctx.stringValue("GetResultResponse.RequestId"));
		getResultResponse.setSuccess(_ctx.booleanValue("GetResultResponse.Success"));
		getResultResponse.setResultCountId(_ctx.stringValue("GetResultResponse.ResultCountId"));
		getResultResponse.setCode(_ctx.stringValue("GetResultResponse.Code"));
		getResultResponse.setMessage(_ctx.stringValue("GetResultResponse.Message"));
		getResultResponse.setPageNumber(_ctx.integerValue("GetResultResponse.PageNumber"));
		getResultResponse.setPageSize(_ctx.integerValue("GetResultResponse.PageSize"));
		getResultResponse.setCount(_ctx.integerValue("GetResultResponse.Count"));

		List<ResultInfo> data = new ArrayList<ResultInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetResultResponse.Data.Length"); i++) {
			ResultInfo resultInfo = new ResultInfo();
			resultInfo.setStatus(_ctx.integerValue("GetResultResponse.Data["+ i +"].Status"));
			resultInfo.setAssignmentTime(_ctx.stringValue("GetResultResponse.Data["+ i +"].AssignmentTime"));
			resultInfo.setLastDataId(_ctx.stringValue("GetResultResponse.Data["+ i +"].LastDataId"));
			resultInfo.setErrorMessage(_ctx.stringValue("GetResultResponse.Data["+ i +"].ErrorMessage"));
			resultInfo.setReviewer(_ctx.stringValue("GetResultResponse.Data["+ i +"].Reviewer"));
			resultInfo.setCreateTime(_ctx.stringValue("GetResultResponse.Data["+ i +"].CreateTime"));
			resultInfo.setReviewStatus(_ctx.integerValue("GetResultResponse.Data["+ i +"].ReviewStatus"));
			resultInfo.setReviewTimeLong(_ctx.stringValue("GetResultResponse.Data["+ i +"].ReviewTimeLong"));
			resultInfo.setTaskName(_ctx.stringValue("GetResultResponse.Data["+ i +"].TaskName"));
			resultInfo.setReviewResult(_ctx.integerValue("GetResultResponse.Data["+ i +"].ReviewResult"));
			resultInfo.setScore(_ctx.integerValue("GetResultResponse.Data["+ i +"].Score"));
			resultInfo.setCreateTimeLong(_ctx.stringValue("GetResultResponse.Data["+ i +"].CreateTimeLong"));
			resultInfo.setReviewTime(_ctx.stringValue("GetResultResponse.Data["+ i +"].ReviewTime"));
			resultInfo.setComments(_ctx.stringValue("GetResultResponse.Data["+ i +"].Comments"));
			resultInfo.setTaskId(_ctx.stringValue("GetResultResponse.Data["+ i +"].TaskId"));
			resultInfo.setReviewType(_ctx.integerValue("GetResultResponse.Data["+ i +"].ReviewType"));
			resultInfo.setResolver(_ctx.stringValue("GetResultResponse.Data["+ i +"].Resolver"));

			List<Long> schemeIdList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].SchemeIdList.Length"); j++) {
				schemeIdList.add(_ctx.longValue("GetResultResponse.Data["+ i +"].SchemeIdList["+ j +"]"));
			}
			resultInfo.setSchemeIdList(schemeIdList);

			List<String> schemeNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].SchemeNameList.Length"); j++) {
				schemeNameList.add(_ctx.stringValue("GetResultResponse.Data["+ i +"].SchemeNameList["+ j +"]"));
			}
			resultInfo.setSchemeNameList(schemeNameList);

			Recording recording = new Recording();
			recording.setRemark13(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark13"));
			recording.setCallee(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Callee"));
			recording.setDialogueSize(_ctx.integerValue("GetResultResponse.Data["+ i +"].Recording.DialogueSize"));
			recording.setPrimaryId(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.PrimaryId"));
			recording.setRemark12(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark12"));
			recording.setRemark1(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark1"));
			recording.setRemark7(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark7"));
			recording.setRemark8(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark8"));
			recording.setRemark2(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark2"));
			recording.setCallId(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.CallId"));
			recording.setRemark9(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark9"));
			recording.setName(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Name"));
			recording.setRemark6(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark6"));
			recording.setRemark10(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark10"));
			recording.setBusiness(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Business"));
			recording.setRemark3(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark3"));
			recording.setUrl(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Url"));
			recording.setRemark11(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark11"));
			recording.setRemark4(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Remark4"));
			recording.setCallType(_ctx.integerValue("GetResultResponse.Data["+ i +"].Recording.CallType"));
			recording.setCaller(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Caller"));
			recording.setDataSetName(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.DataSetName"));
			recording.setDuration(_ctx.longValue("GetResultResponse.Data["+ i +"].Recording.Duration"));
			recording.setRemark5(_ctx.longValue("GetResultResponse.Data["+ i +"].Recording.Remark5"));
			recording.setId(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Id"));
			recording.setCallTime(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.CallTime"));
			resultInfo.setRecording(recording);

			Agent agent = new Agent();
			agent.setName(_ctx.stringValue("GetResultResponse.Data["+ i +"].Agent.Name"));
			agent.setSkillGroup(_ctx.stringValue("GetResultResponse.Data["+ i +"].Agent.SkillGroup"));
			agent.setId(_ctx.stringValue("GetResultResponse.Data["+ i +"].Agent.Id"));
			resultInfo.setAgent(agent);

			List<AsrResultItem> asrResult = new ArrayList<AsrResultItem>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].AsrResult.Length"); j++) {
				AsrResultItem asrResultItem = new AsrResultItem();
				asrResultItem.setWords(_ctx.stringValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].Words"));
				asrResultItem.setBegin(_ctx.longValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].Begin"));
				asrResultItem.setEmotionValue(_ctx.integerValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].EmotionValue"));
				asrResultItem.setEnd(_ctx.longValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].End"));
				asrResultItem.setSpeechRate(_ctx.integerValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].SpeechRate"));
				asrResultItem.setRole(_ctx.stringValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].Role"));

				asrResult.add(asrResultItem);
			}
			resultInfo.setAsrResult(asrResult);

			List<HitResultItem> hitResult = new ArrayList<HitResultItem>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult.Length"); j++) {
				HitResultItem hitResultItem = new HitResultItem();
				hitResultItem.setType(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Type"));
				hitResultItem.setReviewResult(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].ReviewResult"));
				hitResultItem.setName(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Name"));
				hitResultItem.setRid(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Rid"));
				hitResultItem.setSchemeId(_ctx.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].SchemeId"));
				hitResultItem.setSchemeVersion(_ctx.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].SchemeVersion"));

				List<Hit> hits = new ArrayList<Hit>();
				for (int k = 0; k < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits.Length"); k++) {
					Hit hit = new Hit();

					List<String> cid = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Cid.Length"); l++) {
						cid.add(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Cid["+ l +"]"));
					}
					hit.setCid(cid);

					Phrase phrase = new Phrase();
					phrase.setEmotionValue(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.EmotionValue"));
					phrase.setEnd(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.End"));
					phrase.setWords(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Words"));
					phrase.setRole(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Role"));
					phrase.setBegin(_ctx.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Begin"));
					hit.setPhrase(phrase);

					List<KeyWord> keyWords = new ArrayList<KeyWord>();
					for (int l = 0; l < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords.Length"); l++) {
						KeyWord keyWord = new KeyWord();
						keyWord.setFrom(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].From"));
						keyWord.setTo(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].To"));
						keyWord.setVal(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].Val"));
						keyWord.setCid(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].Cid"));

						keyWords.add(keyWord);
					}
					hit.setKeyWords(keyWords);

					hits.add(hit);
				}
				hitResultItem.setHits(hits);

				hitResult.add(hitResultItem);
			}
			resultInfo.setHitResult(hitResult);

			List<HitScoreItem> hitScore = new ArrayList<HitScoreItem>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitScore.Length"); j++) {
				HitScoreItem hitScoreItem = new HitScoreItem();
				hitScoreItem.setScoreName(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitScore["+ j +"].ScoreName"));
				hitScoreItem.setScoreNumber(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitScore["+ j +"].ScoreNumber"));
				hitScoreItem.setScoreId(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitScore["+ j +"].ScoreId"));
				hitScoreItem.setRuleId(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitScore["+ j +"].RuleId"));

				hitScore.add(hitScoreItem);
			}
			resultInfo.setHitScore(hitScore);

			data.add(resultInfo);
		}
		getResultResponse.setData(data);
	 
	 	return getResultResponse;
	}
}