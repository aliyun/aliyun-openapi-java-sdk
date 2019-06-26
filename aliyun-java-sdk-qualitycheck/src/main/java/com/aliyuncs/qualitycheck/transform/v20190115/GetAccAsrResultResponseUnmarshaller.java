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

import com.aliyuncs.qualitycheck.model.v20190115.GetAccAsrResultResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetAccAsrResultResponse.AccAsrSentenceResult;
import com.aliyuncs.qualitycheck.model.v20190115.GetAccAsrResultResponse.AccAsrSentenceResult.ClientEvStat;
import com.aliyuncs.qualitycheck.model.v20190115.GetAccAsrResultResponse.AccAsrSentenceResult.ClientSrStat;
import com.aliyuncs.qualitycheck.model.v20190115.GetAccAsrResultResponse.AccAsrSentenceResult.SentenceResult;
import com.aliyuncs.qualitycheck.model.v20190115.GetAccAsrResultResponse.AccAsrSentenceResult.ServiceEvStat;
import com.aliyuncs.qualitycheck.model.v20190115.GetAccAsrResultResponse.AccAsrSentenceResult.ServiceSrStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccAsrResultResponseUnmarshaller {

	public static GetAccAsrResultResponse unmarshall(GetAccAsrResultResponse getAccAsrResultResponse, UnmarshallerContext context) {
		
		getAccAsrResultResponse.setRequestId(context.stringValue("GetAccAsrResultResponse.RequestId"));
		getAccAsrResultResponse.setSuccess(context.booleanValue("GetAccAsrResultResponse.Success"));
		getAccAsrResultResponse.setCode(context.stringValue("GetAccAsrResultResponse.Code"));
		getAccAsrResultResponse.setMessage(context.stringValue("GetAccAsrResultResponse.Message"));
		getAccAsrResultResponse.setCount(context.integerValue("GetAccAsrResultResponse.Count"));

		List<AccAsrSentenceResult> data = new ArrayList<AccAsrSentenceResult>();
		for (int i = 0; i < context.lengthValue("GetAccAsrResultResponse.Data.Length"); i++) {
			AccAsrSentenceResult accAsrSentenceResult = new AccAsrSentenceResult();
			accAsrSentenceResult.setRecordId(context.stringValue("GetAccAsrResultResponse.Data["+ i +"].RecordId"));
			accAsrSentenceResult.setStatus(context.stringValue("GetAccAsrResultResponse.Data["+ i +"].Status"));
			accAsrSentenceResult.setStatusCode(context.stringValue("GetAccAsrResultResponse.Data["+ i +"].StatusCode"));
			accAsrSentenceResult.setErrorMessage(context.stringValue("GetAccAsrResultResponse.Data["+ i +"].ErrorMessage"));
			accAsrSentenceResult.setDuration(context.longValue("GetAccAsrResultResponse.Data["+ i +"].Duration"));
			accAsrSentenceResult.setClientDuration(context.longValue("GetAccAsrResultResponse.Data["+ i +"].ClientDuration"));
			accAsrSentenceResult.setServiceDuration(context.longValue("GetAccAsrResultResponse.Data["+ i +"].ServiceDuration"));
			accAsrSentenceResult.setInteractiveCount(context.integerValue("GetAccAsrResultResponse.Data["+ i +"].InteractiveCount"));

			ServiceEvStat serviceEvStat = new ServiceEvStat();
			serviceEvStat.setSrole(context.integerValue("GetAccAsrResultResponse.Data["+ i +"].ServiceEvStat.Srole"));
			serviceEvStat.setSmaxEmotionValue(context.floatValue("GetAccAsrResultResponse.Data["+ i +"].ServiceEvStat.SmaxEmotionValue"));
			serviceEvStat.setSminEmotionValue(context.floatValue("GetAccAsrResultResponse.Data["+ i +"].ServiceEvStat.SminEmotionValue"));
			serviceEvStat.setSavgEmotionValue(context.floatValue("GetAccAsrResultResponse.Data["+ i +"].ServiceEvStat.SavgEmotionValue"));
			accAsrSentenceResult.setServiceEvStat(serviceEvStat);

			ClientEvStat clientEvStat = new ClientEvStat();
			clientEvStat.setCrole(context.integerValue("GetAccAsrResultResponse.Data["+ i +"].ClientEvStat.Crole"));
			clientEvStat.setCmaxEmotionValue(context.floatValue("GetAccAsrResultResponse.Data["+ i +"].ClientEvStat.CmaxEmotionValue"));
			clientEvStat.setCminEmotionValue(context.floatValue("GetAccAsrResultResponse.Data["+ i +"].ClientEvStat.CminEmotionValue"));
			clientEvStat.setCavgEmotionValue(context.floatValue("GetAccAsrResultResponse.Data["+ i +"].ClientEvStat.CavgEmotionValue"));
			accAsrSentenceResult.setClientEvStat(clientEvStat);

			ServiceSrStat serviceSrStat = new ServiceSrStat();
			serviceSrStat.setSrole(context.integerValue("GetAccAsrResultResponse.Data["+ i +"].ServiceSrStat.Srole"));
			serviceSrStat.setSmaxSpeechRate(context.floatValue("GetAccAsrResultResponse.Data["+ i +"].ServiceSrStat.SmaxSpeechRate"));
			serviceSrStat.setSminSpeechRate(context.floatValue("GetAccAsrResultResponse.Data["+ i +"].ServiceSrStat.SminSpeechRate"));
			serviceSrStat.setSavgSpeechRate(context.floatValue("GetAccAsrResultResponse.Data["+ i +"].ServiceSrStat.SavgSpeechRate"));
			accAsrSentenceResult.setServiceSrStat(serviceSrStat);

			ClientSrStat clientSrStat = new ClientSrStat();
			clientSrStat.setCrole(context.integerValue("GetAccAsrResultResponse.Data["+ i +"].ClientSrStat.Crole"));
			clientSrStat.setCmaxSpeechRate(context.floatValue("GetAccAsrResultResponse.Data["+ i +"].ClientSrStat.CmaxSpeechRate"));
			clientSrStat.setCminSpeechRate(context.floatValue("GetAccAsrResultResponse.Data["+ i +"].ClientSrStat.CminSpeechRate"));
			clientSrStat.setCavgSpeechRate(context.floatValue("GetAccAsrResultResponse.Data["+ i +"].ClientSrStat.CavgSpeechRate"));
			accAsrSentenceResult.setClientSrStat(clientSrStat);

			List<SentenceResult> results = new ArrayList<SentenceResult>();
			for (int j = 0; j < context.lengthValue("GetAccAsrResultResponse.Data["+ i +"].Results.Length"); j++) {
				SentenceResult sentenceResult = new SentenceResult();
				sentenceResult.setBeginTime(context.longValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].BeginTime"));
				sentenceResult.setEndTime(context.longValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].EndTime"));
				sentenceResult.setChannelId(context.integerValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].ChannelId"));
				sentenceResult.setText(context.stringValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].Text"));
				sentenceResult.setEmotionValue(context.integerValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].EmotionValue"));
				sentenceResult.setSilenceDuration(context.integerValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].SilenceDuration"));
				sentenceResult.setSpeechRate(context.integerValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].SpeechRate"));
				sentenceResult.setSpeakerId(context.stringValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].SpeakerId"));
				sentenceResult.setAgentId(context.stringValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].AgentId"));
				sentenceResult.setChannelKey(context.stringValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].ChannelKey"));

				results.add(sentenceResult);
			}
			accAsrSentenceResult.setResults(results);

			data.add(accAsrSentenceResult);
		}
		getAccAsrResultResponse.setData(data);
	 
	 	return getAccAsrResultResponse;
	}
}