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

	public static GetAccAsrResultResponse unmarshall(GetAccAsrResultResponse getAccAsrResultResponse, UnmarshallerContext _ctx) {
		
		getAccAsrResultResponse.setRequestId(_ctx.stringValue("GetAccAsrResultResponse.RequestId"));
		getAccAsrResultResponse.setSuccess(_ctx.booleanValue("GetAccAsrResultResponse.Success"));
		getAccAsrResultResponse.setCode(_ctx.stringValue("GetAccAsrResultResponse.Code"));
		getAccAsrResultResponse.setMessage(_ctx.stringValue("GetAccAsrResultResponse.Message"));
		getAccAsrResultResponse.setCount(_ctx.integerValue("GetAccAsrResultResponse.Count"));

		List<AccAsrSentenceResult> data = new ArrayList<AccAsrSentenceResult>();
		for (int i = 0; i < _ctx.lengthValue("GetAccAsrResultResponse.Data.Length"); i++) {
			AccAsrSentenceResult accAsrSentenceResult = new AccAsrSentenceResult();
			accAsrSentenceResult.setRecordId(_ctx.stringValue("GetAccAsrResultResponse.Data["+ i +"].RecordId"));
			accAsrSentenceResult.setStatus(_ctx.stringValue("GetAccAsrResultResponse.Data["+ i +"].Status"));
			accAsrSentenceResult.setStatusCode(_ctx.stringValue("GetAccAsrResultResponse.Data["+ i +"].StatusCode"));
			accAsrSentenceResult.setErrorMessage(_ctx.stringValue("GetAccAsrResultResponse.Data["+ i +"].ErrorMessage"));
			accAsrSentenceResult.setDuration(_ctx.longValue("GetAccAsrResultResponse.Data["+ i +"].Duration"));
			accAsrSentenceResult.setClientDuration(_ctx.longValue("GetAccAsrResultResponse.Data["+ i +"].ClientDuration"));
			accAsrSentenceResult.setServiceDuration(_ctx.longValue("GetAccAsrResultResponse.Data["+ i +"].ServiceDuration"));
			accAsrSentenceResult.setInteractiveCount(_ctx.integerValue("GetAccAsrResultResponse.Data["+ i +"].InteractiveCount"));

			ServiceEvStat serviceEvStat = new ServiceEvStat();
			serviceEvStat.setSrole(_ctx.integerValue("GetAccAsrResultResponse.Data["+ i +"].ServiceEvStat.Srole"));
			serviceEvStat.setSmaxEmotionValue(_ctx.floatValue("GetAccAsrResultResponse.Data["+ i +"].ServiceEvStat.SmaxEmotionValue"));
			serviceEvStat.setSminEmotionValue(_ctx.floatValue("GetAccAsrResultResponse.Data["+ i +"].ServiceEvStat.SminEmotionValue"));
			serviceEvStat.setSavgEmotionValue(_ctx.floatValue("GetAccAsrResultResponse.Data["+ i +"].ServiceEvStat.SavgEmotionValue"));
			accAsrSentenceResult.setServiceEvStat(serviceEvStat);

			ClientEvStat clientEvStat = new ClientEvStat();
			clientEvStat.setCrole(_ctx.integerValue("GetAccAsrResultResponse.Data["+ i +"].ClientEvStat.Crole"));
			clientEvStat.setCmaxEmotionValue(_ctx.floatValue("GetAccAsrResultResponse.Data["+ i +"].ClientEvStat.CmaxEmotionValue"));
			clientEvStat.setCminEmotionValue(_ctx.floatValue("GetAccAsrResultResponse.Data["+ i +"].ClientEvStat.CminEmotionValue"));
			clientEvStat.setCavgEmotionValue(_ctx.floatValue("GetAccAsrResultResponse.Data["+ i +"].ClientEvStat.CavgEmotionValue"));
			accAsrSentenceResult.setClientEvStat(clientEvStat);

			ServiceSrStat serviceSrStat = new ServiceSrStat();
			serviceSrStat.setSrole(_ctx.integerValue("GetAccAsrResultResponse.Data["+ i +"].ServiceSrStat.Srole"));
			serviceSrStat.setSmaxSpeechRate(_ctx.floatValue("GetAccAsrResultResponse.Data["+ i +"].ServiceSrStat.SmaxSpeechRate"));
			serviceSrStat.setSminSpeechRate(_ctx.floatValue("GetAccAsrResultResponse.Data["+ i +"].ServiceSrStat.SminSpeechRate"));
			serviceSrStat.setSavgSpeechRate(_ctx.floatValue("GetAccAsrResultResponse.Data["+ i +"].ServiceSrStat.SavgSpeechRate"));
			accAsrSentenceResult.setServiceSrStat(serviceSrStat);

			ClientSrStat clientSrStat = new ClientSrStat();
			clientSrStat.setCrole(_ctx.integerValue("GetAccAsrResultResponse.Data["+ i +"].ClientSrStat.Crole"));
			clientSrStat.setCmaxSpeechRate(_ctx.floatValue("GetAccAsrResultResponse.Data["+ i +"].ClientSrStat.CmaxSpeechRate"));
			clientSrStat.setCminSpeechRate(_ctx.floatValue("GetAccAsrResultResponse.Data["+ i +"].ClientSrStat.CminSpeechRate"));
			clientSrStat.setCavgSpeechRate(_ctx.floatValue("GetAccAsrResultResponse.Data["+ i +"].ClientSrStat.CavgSpeechRate"));
			accAsrSentenceResult.setClientSrStat(clientSrStat);

			List<SentenceResult> results = new ArrayList<SentenceResult>();
			for (int j = 0; j < _ctx.lengthValue("GetAccAsrResultResponse.Data["+ i +"].Results.Length"); j++) {
				SentenceResult sentenceResult = new SentenceResult();
				sentenceResult.setBeginTime(_ctx.longValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].BeginTime"));
				sentenceResult.setEndTime(_ctx.longValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].EndTime"));
				sentenceResult.setChannelId(_ctx.integerValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].ChannelId"));
				sentenceResult.setText(_ctx.stringValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].Text"));
				sentenceResult.setEmotionValue(_ctx.integerValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].EmotionValue"));
				sentenceResult.setSilenceDuration(_ctx.integerValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].SilenceDuration"));
				sentenceResult.setSpeechRate(_ctx.integerValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].SpeechRate"));
				sentenceResult.setSpeakerId(_ctx.stringValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].SpeakerId"));
				sentenceResult.setAgentId(_ctx.stringValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].AgentId"));
				sentenceResult.setChannelKey(_ctx.stringValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].ChannelKey"));

				results.add(sentenceResult);
			}
			accAsrSentenceResult.setResults(results);

			data.add(accAsrSentenceResult);
		}
		getAccAsrResultResponse.setData(data);
	 
	 	return getAccAsrResultResponse;
	}
}