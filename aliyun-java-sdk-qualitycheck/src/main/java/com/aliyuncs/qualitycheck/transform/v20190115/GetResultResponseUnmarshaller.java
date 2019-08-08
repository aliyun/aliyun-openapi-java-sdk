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
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResultResponseUnmarshaller {

	public static GetResultResponse unmarshall(GetResultResponse getResultResponse, UnmarshallerContext _ctx) {
		
		getResultResponse.setRequestId(_ctx.stringValue("GetResultResponse.RequestId"));
		getResultResponse.setSuccess(_ctx.booleanValue("GetResultResponse.Success"));
		getResultResponse.setCode(_ctx.stringValue("GetResultResponse.Code"));
		getResultResponse.setMessage(_ctx.stringValue("GetResultResponse.Message"));
		getResultResponse.setCount(_ctx.integerValue("GetResultResponse.Count"));
		getResultResponse.setPageSize(_ctx.integerValue("GetResultResponse.PageSize"));
		getResultResponse.setPageNumber(_ctx.integerValue("GetResultResponse.PageNumber"));

		List<ResultInfo> data = new ArrayList<ResultInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetResultResponse.Data.Length"); i++) {
			ResultInfo resultInfo = new ResultInfo();
			resultInfo.setScore(_ctx.integerValue("GetResultResponse.Data["+ i +"].Score"));
			resultInfo.setComments(_ctx.stringValue("GetResultResponse.Data["+ i +"].Comments"));
			resultInfo.setErrorMessage(_ctx.stringValue("GetResultResponse.Data["+ i +"].ErrorMessage"));
			resultInfo.setStatus(_ctx.integerValue("GetResultResponse.Data["+ i +"].Status"));
			resultInfo.setReviewStatus(_ctx.integerValue("GetResultResponse.Data["+ i +"].ReviewStatus"));
			resultInfo.setReviewResult(_ctx.integerValue("GetResultResponse.Data["+ i +"].ReviewResult"));
			resultInfo.setTaskId(_ctx.stringValue("GetResultResponse.Data["+ i +"].TaskId"));
			resultInfo.setTaskName(_ctx.stringValue("GetResultResponse.Data["+ i +"].TaskName"));
			resultInfo.setCreateTime(_ctx.stringValue("GetResultResponse.Data["+ i +"].CreateTime"));
			resultInfo.setReviewer(_ctx.stringValue("GetResultResponse.Data["+ i +"].Reviewer"));
			resultInfo.setResolver(_ctx.stringValue("GetResultResponse.Data["+ i +"].Resolver"));

			Recording recording = new Recording();
			recording.setId(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Id"));
			recording.setPrimaryId(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.PrimaryId"));
			recording.setCallId(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.CallId"));
			recording.setName(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Name"));
			recording.setUrl(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Url"));
			recording.setDataSetName(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.DataSetName"));
			recording.setDuration(_ctx.longValue("GetResultResponse.Data["+ i +"].Recording.Duration"));
			recording.setCaller(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Caller"));
			recording.setCallee(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.Callee"));
			recording.setCallTime(_ctx.stringValue("GetResultResponse.Data["+ i +"].Recording.CallTime"));
			recording.setCallType(_ctx.integerValue("GetResultResponse.Data["+ i +"].Recording.CallType"));
			resultInfo.setRecording(recording);

			Agent agent = new Agent();
			agent.setId(_ctx.stringValue("GetResultResponse.Data["+ i +"].Agent.Id"));
			agent.setName(_ctx.stringValue("GetResultResponse.Data["+ i +"].Agent.Name"));
			agent.setSkillGroup(_ctx.stringValue("GetResultResponse.Data["+ i +"].Agent.SkillGroup"));
			resultInfo.setAgent(agent);

			List<AsrResultItem> asrResult = new ArrayList<AsrResultItem>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].AsrResult.Length"); j++) {
				AsrResultItem asrResultItem = new AsrResultItem();
				asrResultItem.setRole(_ctx.stringValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].Role"));
				asrResultItem.setWords(_ctx.stringValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].Words"));
				asrResultItem.setBegin(_ctx.longValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].Begin"));
				asrResultItem.setEnd(_ctx.longValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].End"));
				asrResultItem.setEmotionValue(_ctx.integerValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].EmotionValue"));
				asrResultItem.setSilenceDuration(_ctx.integerValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].SilenceDuration"));
				asrResultItem.setSpeechRate(_ctx.integerValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].SpeechRate"));

				asrResult.add(asrResultItem);
			}
			resultInfo.setAsrResult(asrResult);

			List<HitResultItem> hitResult = new ArrayList<HitResultItem>();
			for (int j = 0; j < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult.Length"); j++) {
				HitResultItem hitResultItem = new HitResultItem();
				hitResultItem.setRid(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Rid"));
				hitResultItem.setName(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Name"));
				hitResultItem.setType(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Type"));
				hitResultItem.setReviewResult(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].ReviewResult"));

				List<Hit> hits = new ArrayList<Hit>();
				for (int k = 0; k < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits.Length"); k++) {
					Hit hit = new Hit();

					List<String> cid = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Cid.Length"); l++) {
						cid.add(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Cid["+ l +"]"));
					}
					hit.setCid(cid);

					Phrase phrase = new Phrase();
					phrase.setRole(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Role"));
					phrase.setWords(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Words"));
					phrase.setBegin(_ctx.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Begin"));
					phrase.setEnd(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.End"));
					phrase.setEmotionValue(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.EmotionValue"));
					phrase.setSilenceDuration(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.SilenceDuration"));
					phrase.setSpeechRate(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.SpeechRate"));
					hit.setPhrase(phrase);

					List<KeyWord> keyWords = new ArrayList<KeyWord>();
					for (int l = 0; l < _ctx.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords.Length"); l++) {
						KeyWord keyWord = new KeyWord();
						keyWord.setCid(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].Cid"));
						keyWord.setFrom(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].From"));
						keyWord.setTo(_ctx.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].To"));
						keyWord.setVal(_ctx.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].Val"));

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
		getResultResponse.setData(data);
	 
	 	return getResultResponse;
	}
}