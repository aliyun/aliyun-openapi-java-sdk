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

import com.aliyuncs.qualitycheck.model.v20190115.GetAudioDataStatusResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioDataStatusResponse.TaskAsrResult;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioDataStatusResponse.TaskAsrResult.AsrResult;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioDataStatusResponse.TaskAsrResult.AsrResult.ClientEvStat;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioDataStatusResponse.TaskAsrResult.AsrResult.ClientSrStat;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioDataStatusResponse.TaskAsrResult.AsrResult.SentenceResult;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioDataStatusResponse.TaskAsrResult.AsrResult.ServiceEvStat;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioDataStatusResponse.TaskAsrResult.AsrResult.ServiceSrStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAudioDataStatusResponseUnmarshaller {

	public static GetAudioDataStatusResponse unmarshall(GetAudioDataStatusResponse getAudioDataStatusResponse, UnmarshallerContext _ctx) {
		
		getAudioDataStatusResponse.setRequestId(_ctx.stringValue("GetAudioDataStatusResponse.RequestId"));
		getAudioDataStatusResponse.setSuccess(_ctx.booleanValue("GetAudioDataStatusResponse.Success"));
		getAudioDataStatusResponse.setCode(_ctx.stringValue("GetAudioDataStatusResponse.Code"));
		getAudioDataStatusResponse.setMessage(_ctx.stringValue("GetAudioDataStatusResponse.Message"));
		getAudioDataStatusResponse.setCount(_ctx.integerValue("GetAudioDataStatusResponse.Count"));
		getAudioDataStatusResponse.setOverallStatus(_ctx.integerValue("GetAudioDataStatusResponse.OverallStatus"));

		List<TaskAsrResult> data = new ArrayList<TaskAsrResult>();
		for (int i = 0; i < _ctx.lengthValue("GetAudioDataStatusResponse.Data.Length"); i++) {
			TaskAsrResult taskAsrResult = new TaskAsrResult();
			taskAsrResult.setTid(_ctx.stringValue("GetAudioDataStatusResponse.Data["+ i +"].Tid"));
			taskAsrResult.setStatusCode(_ctx.integerValue("GetAudioDataStatusResponse.Data["+ i +"].StatusCode"));
			taskAsrResult.setStatusMsg(_ctx.stringValue("GetAudioDataStatusResponse.Data["+ i +"].StatusMsg"));

			AsrResult asrResult = new AsrResult();
			asrResult.setAsrstatus(_ctx.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.Asrstatus"));
			asrResult.setAsrStatusCode(_ctx.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.AsrStatusCode"));
			asrResult.setErrorMessage(_ctx.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ErrorMessage"));
			asrResult.setDuration(_ctx.longValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.Duration"));
			asrResult.setInteractiveCount(_ctx.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.InteractiveCount"));

			ServiceEvStat serviceEvStat = new ServiceEvStat();
			serviceEvStat.setSrole(_ctx.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceEvStat.Srole"));
			serviceEvStat.setSmaxEmotionValue(_ctx.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceEvStat.SmaxEmotionValue"));
			serviceEvStat.setSminEmotionValue(_ctx.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceEvStat.SminEmotionValue"));
			serviceEvStat.setSavgEmotionValue(_ctx.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceEvStat.SavgEmotionValue"));
			asrResult.setServiceEvStat(serviceEvStat);

			ClientEvStat clientEvStat = new ClientEvStat();
			clientEvStat.setCrole(_ctx.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientEvStat.Crole"));
			clientEvStat.setCmaxEmotionValue(_ctx.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientEvStat.CmaxEmotionValue"));
			clientEvStat.setCminEmotionValue(_ctx.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientEvStat.CminEmotionValue"));
			clientEvStat.setCavgEmotionValue(_ctx.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientEvStat.CavgEmotionValue"));
			asrResult.setClientEvStat(clientEvStat);

			ServiceSrStat serviceSrStat = new ServiceSrStat();
			serviceSrStat.setSrole(_ctx.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceSrStat.Srole"));
			serviceSrStat.setSmaxSpeechRate(_ctx.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceSrStat.SmaxSpeechRate"));
			serviceSrStat.setSminSpeechRate(_ctx.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceSrStat.SminSpeechRate"));
			serviceSrStat.setSavgSpeechRate(_ctx.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceSrStat.SavgSpeechRate"));
			asrResult.setServiceSrStat(serviceSrStat);

			ClientSrStat clientSrStat = new ClientSrStat();
			clientSrStat.setCrole(_ctx.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientSrStat.Crole"));
			clientSrStat.setCmaxSpeechRate(_ctx.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientSrStat.CmaxSpeechRate"));
			clientSrStat.setCminSpeechRate(_ctx.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientSrStat.CminSpeechRate"));
			clientSrStat.setCavgSpeechRate(_ctx.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientSrStat.CavgSpeechRate"));
			asrResult.setClientSrStat(clientSrStat);

			List<SentenceResult> sentenceResults = new ArrayList<SentenceResult>();
			for (int j = 0; j < _ctx.lengthValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults.Length"); j++) {
				SentenceResult sentenceResult = new SentenceResult();
				sentenceResult.setBeginTime(_ctx.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].BeginTime"));
				sentenceResult.setEndTime(_ctx.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].EndTime"));
				sentenceResult.setChannelId(_ctx.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].ChannelId"));
				sentenceResult.setText(_ctx.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].Text"));
				sentenceResult.setEmotionValue(_ctx.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].EmotionValue"));
				sentenceResult.setSilenceDuration(_ctx.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].SilenceDuration"));
				sentenceResult.setSpeechRate(_ctx.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].SpeechRate"));
				sentenceResult.setSpeakerId(_ctx.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].SpeakerId"));
				sentenceResult.setAgentId(_ctx.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].AgentId"));
				sentenceResult.setChannelKey(_ctx.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].ChannelKey"));

				sentenceResults.add(sentenceResult);
			}
			asrResult.setSentenceResults(sentenceResults);
			taskAsrResult.setAsrResult(asrResult);

			data.add(taskAsrResult);
		}
		getAudioDataStatusResponse.setData(data);
	 
	 	return getAudioDataStatusResponse;
	}
}