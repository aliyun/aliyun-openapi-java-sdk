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

import com.aliyuncs.qualitycheck.model.v20190115.GetSyncResultResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetSyncResultResponse.ResultInfo;
import com.aliyuncs.qualitycheck.model.v20190115.GetSyncResultResponse.ResultInfo.Agent;
import com.aliyuncs.qualitycheck.model.v20190115.GetSyncResultResponse.ResultInfo.AsrResultItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetSyncResultResponse.ResultInfo.HitResultItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetSyncResultResponse.ResultInfo.HitResultItem.Hit;
import com.aliyuncs.qualitycheck.model.v20190115.GetSyncResultResponse.ResultInfo.HitResultItem.Hit.KeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.GetSyncResultResponse.ResultInfo.HitResultItem.Hit.Phrase;
import com.aliyuncs.qualitycheck.model.v20190115.GetSyncResultResponse.ResultInfo.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSyncResultResponseUnmarshaller {

	public static GetSyncResultResponse unmarshall(GetSyncResultResponse getSyncResultResponse, UnmarshallerContext _ctx) {
		
		getSyncResultResponse.setRequestId(_ctx.stringValue("GetSyncResultResponse.RequestId"));
		getSyncResultResponse.setSuccess(_ctx.booleanValue("GetSyncResultResponse.Success"));
		getSyncResultResponse.setCode(_ctx.stringValue("GetSyncResultResponse.Code"));
		getSyncResultResponse.setMessage(_ctx.stringValue("GetSyncResultResponse.Message"));
		getSyncResultResponse.setCount(_ctx.integerValue("GetSyncResultResponse.Count"));
		getSyncResultResponse.setPageSize(_ctx.integerValue("GetSyncResultResponse.PageSize"));
		getSyncResultResponse.setPageNumber(_ctx.integerValue("GetSyncResultResponse.PageNumber"));
		getSyncResultResponse.setResultCountId(_ctx.stringValue("GetSyncResultResponse.ResultCountId"));

		List<ResultInfo> data = new ArrayList<ResultInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetSyncResultResponse.Data.Length"); i++) {
			ResultInfo resultInfo = new ResultInfo();
			resultInfo.setScore(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].Score"));
			resultInfo.setComments(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Comments"));
			resultInfo.setErrorMessage(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].ErrorMessage"));
			resultInfo.setStatus(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].Status"));
			resultInfo.setReviewStatus(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].ReviewStatus"));
			resultInfo.setReviewResult(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].ReviewResult"));
			resultInfo.setTaskId(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].TaskId"));
			resultInfo.setTaskName(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].TaskName"));
			resultInfo.setCreateTime(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].CreateTime"));
			resultInfo.setReviewer(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Reviewer"));
			resultInfo.setResolver(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Resolver"));

			Recording recording = new Recording();
			recording.setId(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Recording.Id"));
			recording.setPrimaryId(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Recording.PrimaryId"));
			recording.setCallId(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Recording.CallId"));
			recording.setName(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Recording.Name"));
			recording.setUrl(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Recording.Url"));
			recording.setDataSetName(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Recording.DataSetName"));
			recording.setDuration(_ctx.longValue("GetSyncResultResponse.Data["+ i +"].Recording.Duration"));
			recording.setCaller(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Recording.Caller"));
			recording.setCallee(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Recording.Callee"));
			recording.setCallTime(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Recording.CallTime"));
			recording.setCallType(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].Recording.CallType"));
			recording.setBusiness(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Recording.Business"));
			recording.setRemark1(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Recording.Remark1"));
			recording.setRemark2(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Recording.Remark2"));
			recording.setRemark3(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Recording.Remark3"));
			resultInfo.setRecording(recording);

			Agent agent = new Agent();
			agent.setId(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Agent.Id"));
			agent.setName(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Agent.Name"));
			agent.setSkillGroup(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].Agent.SkillGroup"));
			resultInfo.setAgent(agent);

			List<AsrResultItem> asrResult = new ArrayList<AsrResultItem>();
			for (int j = 0; j < _ctx.lengthValue("GetSyncResultResponse.Data["+ i +"].AsrResult.Length"); j++) {
				AsrResultItem asrResultItem = new AsrResultItem();
				asrResultItem.setRole(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].AsrResult["+ j +"].Role"));
				asrResultItem.setWords(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].AsrResult["+ j +"].Words"));
				asrResultItem.setBegin(_ctx.longValue("GetSyncResultResponse.Data["+ i +"].AsrResult["+ j +"].Begin"));
				asrResultItem.setEnd(_ctx.longValue("GetSyncResultResponse.Data["+ i +"].AsrResult["+ j +"].End"));
				asrResultItem.setEmotionValue(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].AsrResult["+ j +"].EmotionValue"));
				asrResultItem.setSilenceDuration(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].AsrResult["+ j +"].SilenceDuration"));
				asrResultItem.setSpeechRate(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].AsrResult["+ j +"].SpeechRate"));

				asrResult.add(asrResultItem);
			}
			resultInfo.setAsrResult(asrResult);

			List<HitResultItem> hitResult = new ArrayList<HitResultItem>();
			for (int j = 0; j < _ctx.lengthValue("GetSyncResultResponse.Data["+ i +"].HitResult.Length"); j++) {
				HitResultItem hitResultItem = new HitResultItem();
				hitResultItem.setRid(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Rid"));
				hitResultItem.setName(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Name"));
				hitResultItem.setType(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Type"));
				hitResultItem.setReviewResult(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].ReviewResult"));

				List<Hit> hits = new ArrayList<Hit>();
				for (int k = 0; k < _ctx.lengthValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits.Length"); k++) {
					Hit hit = new Hit();

					List<String> cid = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Cid.Length"); l++) {
						cid.add(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Cid["+ l +"]"));
					}
					hit.setCid(cid);

					Phrase phrase = new Phrase();
					phrase.setRole(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Role"));
					phrase.setWords(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Words"));
					phrase.setBegin(_ctx.longValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Begin"));
					phrase.setEnd(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.End"));
					phrase.setEmotionValue(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.EmotionValue"));
					phrase.setSilenceDuration(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.SilenceDuration"));
					phrase.setSpeechRate(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.SpeechRate"));
					hit.setPhrase(phrase);

					List<KeyWord> keyWords = new ArrayList<KeyWord>();
					for (int l = 0; l < _ctx.lengthValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords.Length"); l++) {
						KeyWord keyWord = new KeyWord();
						keyWord.setCid(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].Cid"));
						keyWord.setFrom(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].From"));
						keyWord.setTo(_ctx.integerValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].To"));
						keyWord.setVal(_ctx.stringValue("GetSyncResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].Val"));

						keyWords.add(keyWord);
					}
					hit.setKeyWords(keyWords);

					hits.add(hit);
				}
				hitResultItem.setHits(hits);

				hitResult.add(hitResultItem);
			}
			resultInfo.setHitResult(hitResult);

			data.add(resultInfo);
		}
		getSyncResultResponse.setData(data);
	 
	 	return getSyncResultResponse;
	}
}