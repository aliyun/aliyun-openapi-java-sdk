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

	public static GetAudioDataStatusResponse unmarshall(GetAudioDataStatusResponse getAudioDataStatusResponse, UnmarshallerContext context) {
		
		getAudioDataStatusResponse.setRequestId(context.stringValue("GetAudioDataStatusResponse.RequestId"));
		getAudioDataStatusResponse.setSuccess(context.booleanValue("GetAudioDataStatusResponse.Success"));
		getAudioDataStatusResponse.setCode(context.stringValue("GetAudioDataStatusResponse.Code"));
		getAudioDataStatusResponse.setMessage(context.stringValue("GetAudioDataStatusResponse.Message"));
		getAudioDataStatusResponse.setCount(context.integerValue("GetAudioDataStatusResponse.Count"));
		getAudioDataStatusResponse.setOverallStatus(context.integerValue("GetAudioDataStatusResponse.OverallStatus"));

		List<TaskAsrResult> data = new ArrayList<TaskAsrResult>();
		for (int i = 0; i < context.lengthValue("GetAudioDataStatusResponse.Data.Length"); i++) {
			TaskAsrResult taskAsrResult = new TaskAsrResult();
			taskAsrResult.setTid(context.stringValue("GetAudioDataStatusResponse.Data["+ i +"].Tid"));
			taskAsrResult.setStatusCode(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].StatusCode"));
			taskAsrResult.setStatusMsg(context.stringValue("GetAudioDataStatusResponse.Data["+ i +"].StatusMsg"));

			AsrResult asrResult = new AsrResult();
			asrResult.setAsrstatus(context.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.Asrstatus"));
			asrResult.setAsrStatusCode(context.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.AsrStatusCode"));
			asrResult.setErrorMessage(context.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ErrorMessage"));
			asrResult.setDuration(context.longValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.Duration"));
			asrResult.setInteractiveCount(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.InteractiveCount"));

			ServiceEvStat serviceEvStat = new ServiceEvStat();
			serviceEvStat.setSrole(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceEvStat.Srole"));
			serviceEvStat.setSmaxEmotionValue(context.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceEvStat.SmaxEmotionValue"));
			serviceEvStat.setSminEmotionValue(context.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceEvStat.SminEmotionValue"));
			serviceEvStat.setSavgEmotionValue(context.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceEvStat.SavgEmotionValue"));
			asrResult.setServiceEvStat(serviceEvStat);

			ClientEvStat clientEvStat = new ClientEvStat();
			clientEvStat.setCrole(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientEvStat.Crole"));
			clientEvStat.setCmaxEmotionValue(context.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientEvStat.CmaxEmotionValue"));
			clientEvStat.setCminEmotionValue(context.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientEvStat.CminEmotionValue"));
			clientEvStat.setCavgEmotionValue(context.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientEvStat.CavgEmotionValue"));
			asrResult.setClientEvStat(clientEvStat);

			ServiceSrStat serviceSrStat = new ServiceSrStat();
			serviceSrStat.setSrole(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceSrStat.Srole"));
			serviceSrStat.setSmaxSpeechRate(context.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceSrStat.SmaxSpeechRate"));
			serviceSrStat.setSminSpeechRate(context.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceSrStat.SminSpeechRate"));
			serviceSrStat.setSavgSpeechRate(context.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ServiceSrStat.SavgSpeechRate"));
			asrResult.setServiceSrStat(serviceSrStat);

			ClientSrStat clientSrStat = new ClientSrStat();
			clientSrStat.setCrole(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientSrStat.Crole"));
			clientSrStat.setCmaxSpeechRate(context.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientSrStat.CmaxSpeechRate"));
			clientSrStat.setCminSpeechRate(context.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientSrStat.CminSpeechRate"));
			clientSrStat.setCavgSpeechRate(context.floatValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.ClientSrStat.CavgSpeechRate"));
			asrResult.setClientSrStat(clientSrStat);

			List<SentenceResult> sentenceResults = new ArrayList<SentenceResult>();
			for (int j = 0; j < context.lengthValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults.Length"); j++) {
				SentenceResult sentenceResult = new SentenceResult();
				sentenceResult.setBeginTime(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].BeginTime"));
				sentenceResult.setEndTime(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].EndTime"));
				sentenceResult.setChannelId(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].ChannelId"));
				sentenceResult.setText(context.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].Text"));
				sentenceResult.setEmotionValue(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].EmotionValue"));
				sentenceResult.setSilenceDuration(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].SilenceDuration"));
				sentenceResult.setSpeechRate(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].SpeechRate"));
				sentenceResult.setSpeakerId(context.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].SpeakerId"));
				sentenceResult.setAgentId(context.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].AgentId"));
				sentenceResult.setChannelKey(context.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].ChannelKey"));

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