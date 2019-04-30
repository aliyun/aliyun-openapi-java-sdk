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
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.AsrResultItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.Hit;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.Hit.KeyWord;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.HitResultItem.Hit.Phrase;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultResponse.ResultInfo.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResultResponseUnmarshaller {

	public static GetResultResponse unmarshall(GetResultResponse getResultResponse, UnmarshallerContext context) {
		
		getResultResponse.setRequestId(context.stringValue("GetResultResponse.RequestId"));
		getResultResponse.setSuccess(context.booleanValue("GetResultResponse.Success"));
		getResultResponse.setCode(context.stringValue("GetResultResponse.Code"));
		getResultResponse.setMessage(context.stringValue("GetResultResponse.Message"));
		getResultResponse.setCount(context.integerValue("GetResultResponse.Count"));

		List<ResultInfo> data = new ArrayList<ResultInfo>();
		for (int i = 0; i < context.lengthValue("GetResultResponse.Data.Length"); i++) {
			ResultInfo resultInfo = new ResultInfo();
			resultInfo.setScore(context.integerValue("GetResultResponse.Data["+ i +"].Score"));
			resultInfo.setStatus(context.integerValue("GetResultResponse.Data["+ i +"].Status"));
			resultInfo.setTaskId(context.stringValue("GetResultResponse.Data["+ i +"].TaskId"));
			resultInfo.setComments(context.stringValue("GetResultResponse.Data["+ i +"].Comments"));

			Recording recording = new Recording();
			recording.setId(context.stringValue("GetResultResponse.Data["+ i +"].Recording.Id"));
			recording.setName(context.stringValue("GetResultResponse.Data["+ i +"].Recording.Name"));
			recording.setUrl(context.stringValue("GetResultResponse.Data["+ i +"].Recording.Url"));
			resultInfo.setRecording(recording);

			List<AsrResultItem> asrResult = new ArrayList<AsrResultItem>();
			for (int j = 0; j < context.lengthValue("GetResultResponse.Data["+ i +"].AsrResult.Length"); j++) {
				AsrResultItem asrResultItem = new AsrResultItem();
				asrResultItem.setRole(context.stringValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].Role"));
				asrResultItem.setWords(context.stringValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].Words"));
				asrResultItem.setBegin(context.longValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].Begin"));
				asrResultItem.setEnd(context.longValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].End"));
				asrResultItem.setEmotionValue(context.integerValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].EmotionValue"));
				asrResultItem.setSilenceDuration(context.integerValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].SilenceDuration"));
				asrResultItem.setSpeechRate(context.integerValue("GetResultResponse.Data["+ i +"].AsrResult["+ j +"].SpeechRate"));

				asrResult.add(asrResultItem);
			}
			resultInfo.setAsrResult(asrResult);

			List<HitResultItem> hitResult = new ArrayList<HitResultItem>();
			for (int j = 0; j < context.lengthValue("GetResultResponse.Data["+ i +"].HitResult.Length"); j++) {
				HitResultItem hitResultItem = new HitResultItem();
				hitResultItem.setRid(context.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Rid"));
				hitResultItem.setName(context.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Name"));
				hitResultItem.setType(context.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Type"));

				List<Hit> hits = new ArrayList<Hit>();
				for (int k = 0; k < context.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits.Length"); k++) {
					Hit hit = new Hit();

					List<String> cid = new ArrayList<String>();
					for (int l = 0; l < context.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Cid.Length"); l++) {
						cid.add(context.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Cid["+ l +"]"));
					}
					hit.setCid(cid);

					Phrase phrase = new Phrase();
					phrase.setRole(context.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Role"));
					phrase.setWords(context.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Words"));
					phrase.setBegin(context.longValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.Begin"));
					phrase.setEnd(context.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.End"));
					phrase.setEmotionValue(context.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.EmotionValue"));
					phrase.setSilenceDuration(context.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.SilenceDuration"));
					phrase.setSpeechRate(context.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].Phrase.SpeechRate"));
					hit.setPhrase(phrase);

					List<KeyWord> keyWords = new ArrayList<KeyWord>();
					for (int l = 0; l < context.lengthValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords.Length"); l++) {
						KeyWord keyWord = new KeyWord();
						keyWord.setCid(context.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].Cid"));
						keyWord.setFrom(context.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].From"));
						keyWord.setTo(context.integerValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].To"));
						keyWord.setVal(context.stringValue("GetResultResponse.Data["+ i +"].HitResult["+ j +"].Hits["+ k +"].KeyWords["+ l +"].Val"));

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