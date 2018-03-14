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

package com.aliyuncs.qualitycheck.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20160801.GetAccAsrResultResponse;
import com.aliyuncs.qualitycheck.model.v20160801.GetAccAsrResultResponse.AccAsrSentenceResult;
import com.aliyuncs.qualitycheck.model.v20160801.GetAccAsrResultResponse.AccAsrSentenceResult.ClientEvStat;
import com.aliyuncs.qualitycheck.model.v20160801.GetAccAsrResultResponse.AccAsrSentenceResult.ClientSrStat;
import com.aliyuncs.qualitycheck.model.v20160801.GetAccAsrResultResponse.AccAsrSentenceResult.SentenceResult;
import com.aliyuncs.qualitycheck.model.v20160801.GetAccAsrResultResponse.AccAsrSentenceResult.ServiceEvStat;
import com.aliyuncs.qualitycheck.model.v20160801.GetAccAsrResultResponse.AccAsrSentenceResult.ServiceSrStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccAsrResultResponseUnmarshaller {

	public static GetAccAsrResultResponse unmarshall(GetAccAsrResultResponse getAccAsrResultResponse, UnmarshallerContext context) {
		
		getAccAsrResultResponse.setRequestId(context.stringValue("GetAccAsrResultResponse.requestId"));
		getAccAsrResultResponse.setSuccess(context.booleanValue("GetAccAsrResultResponse.success"));
		getAccAsrResultResponse.setCode(context.stringValue("GetAccAsrResultResponse.code"));
		getAccAsrResultResponse.setMessage(context.stringValue("GetAccAsrResultResponse.message"));
		getAccAsrResultResponse.setCount(context.integerValue("GetAccAsrResultResponse.count"));

		List<AccAsrSentenceResult> data = new ArrayList<AccAsrSentenceResult>();
		for (int i = 0; i < context.lengthValue("GetAccAsrResultResponse.data.Length"); i++) {
			AccAsrSentenceResult accAsrSentenceResult = new AccAsrSentenceResult();
			accAsrSentenceResult.setRecordId(context.stringValue("GetAccAsrResultResponse.data["+ i +"].recordId"));
			accAsrSentenceResult.setStatus(context.stringValue("GetAccAsrResultResponse.data["+ i +"].status"));
			accAsrSentenceResult.setStatusCode(context.stringValue("GetAccAsrResultResponse.data["+ i +"].statusCode"));
			accAsrSentenceResult.setErrorMessage(context.stringValue("GetAccAsrResultResponse.data["+ i +"].errorMessage"));
			accAsrSentenceResult.setDuration(context.longValue("GetAccAsrResultResponse.data["+ i +"].duration"));
			accAsrSentenceResult.setInteractiveCount(context.integerValue("GetAccAsrResultResponse.data["+ i +"].interactiveCount"));

			ServiceEvStat serviceEvStat = new ServiceEvStat();
			serviceEvStat.setSrole(context.integerValue("GetAccAsrResultResponse.data["+ i +"].serviceEvStat.srole"));
			serviceEvStat.setSmaxEmotionValue(context.floatValue("GetAccAsrResultResponse.data["+ i +"].serviceEvStat.smaxEmotionValue"));
			serviceEvStat.setSminEmotionValue(context.floatValue("GetAccAsrResultResponse.data["+ i +"].serviceEvStat.sminEmotionValue"));
			serviceEvStat.setSavgEmotionValue(context.floatValue("GetAccAsrResultResponse.data["+ i +"].serviceEvStat.savgEmotionValue"));
			accAsrSentenceResult.setServiceEvStat(serviceEvStat);

			ClientEvStat clientEvStat = new ClientEvStat();
			clientEvStat.setCrole(context.integerValue("GetAccAsrResultResponse.data["+ i +"].clientEvStat.crole"));
			clientEvStat.setCmaxEmotionValue(context.floatValue("GetAccAsrResultResponse.data["+ i +"].clientEvStat.cmaxEmotionValue"));
			clientEvStat.setCminEmotionValue(context.floatValue("GetAccAsrResultResponse.data["+ i +"].clientEvStat.cminEmotionValue"));
			clientEvStat.setCavgEmotionValue(context.floatValue("GetAccAsrResultResponse.data["+ i +"].clientEvStat.cavgEmotionValue"));
			accAsrSentenceResult.setClientEvStat(clientEvStat);

			ServiceSrStat serviceSrStat = new ServiceSrStat();
			serviceSrStat.setSrole(context.integerValue("GetAccAsrResultResponse.data["+ i +"].serviceSrStat.srole"));
			serviceSrStat.setSmaxSpeechRate(context.floatValue("GetAccAsrResultResponse.data["+ i +"].serviceSrStat.smaxSpeechRate"));
			serviceSrStat.setSminSpeechRate(context.floatValue("GetAccAsrResultResponse.data["+ i +"].serviceSrStat.sminSpeechRate"));
			serviceSrStat.setSavgSpeechRate(context.floatValue("GetAccAsrResultResponse.data["+ i +"].serviceSrStat.savgSpeechRate"));
			accAsrSentenceResult.setServiceSrStat(serviceSrStat);

			ClientSrStat clientSrStat = new ClientSrStat();
			clientSrStat.setCrole(context.integerValue("GetAccAsrResultResponse.data["+ i +"].clientSrStat.crole"));
			clientSrStat.setCmaxSpeechRate(context.floatValue("GetAccAsrResultResponse.data["+ i +"].clientSrStat.cmaxSpeechRate"));
			clientSrStat.setCminSpeechRate(context.floatValue("GetAccAsrResultResponse.data["+ i +"].clientSrStat.cminSpeechRate"));
			clientSrStat.setCavgSpeechRate(context.floatValue("GetAccAsrResultResponse.data["+ i +"].clientSrStat.cavgSpeechRate"));
			accAsrSentenceResult.setClientSrStat(clientSrStat);

			List<SentenceResult> results = new ArrayList<SentenceResult>();
			for (int j = 0; j < context.lengthValue("GetAccAsrResultResponse.data["+ i +"].results.Length"); j++) {
				SentenceResult sentenceResult = new SentenceResult();
				sentenceResult.setBeginTime(context.longValue("GetAccAsrResultResponse.data["+ i +"].results["+ j +"].beginTime"));
				sentenceResult.setEndTime(context.longValue("GetAccAsrResultResponse.data["+ i +"].results["+ j +"].endTime"));
				sentenceResult.setChannelId(context.integerValue("GetAccAsrResultResponse.data["+ i +"].results["+ j +"].channelId"));
				sentenceResult.setText(context.stringValue("GetAccAsrResultResponse.data["+ i +"].results["+ j +"].text"));
				sentenceResult.setEmotionValue(context.integerValue("GetAccAsrResultResponse.data["+ i +"].results["+ j +"].emotionValue"));
				sentenceResult.setSilenceDuration(context.integerValue("GetAccAsrResultResponse.data["+ i +"].results["+ j +"].silenceDuration"));
				sentenceResult.setSpeechRate(context.integerValue("GetAccAsrResultResponse.data["+ i +"].results["+ j +"].speechRate"));
				sentenceResult.setSpeakerId(context.stringValue("GetAccAsrResultResponse.data["+ i +"].results["+ j +"].speakerId"));
				sentenceResult.setAgentId(context.stringValue("GetAccAsrResultResponse.data["+ i +"].results["+ j +"].agentId"));
				sentenceResult.setChannelKey(context.stringValue("GetAccAsrResultResponse.data["+ i +"].results["+ j +"].channelKey"));

				results.add(sentenceResult);
			}
			accAsrSentenceResult.setResults(results);

			data.add(accAsrSentenceResult);
		}
		getAccAsrResultResponse.setData(data);
	 
	 	return getAccAsrResultResponse;
	}
}