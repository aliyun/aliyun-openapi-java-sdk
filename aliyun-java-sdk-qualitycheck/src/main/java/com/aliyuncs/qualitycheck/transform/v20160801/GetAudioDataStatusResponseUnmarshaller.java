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

import com.aliyuncs.qualitycheck.model.v20160801.GetAudioDataStatusResponse;
import com.aliyuncs.qualitycheck.model.v20160801.GetAudioDataStatusResponse.TaskAsrResult;
import com.aliyuncs.qualitycheck.model.v20160801.GetAudioDataStatusResponse.TaskAsrResult.AsrResult;
import com.aliyuncs.qualitycheck.model.v20160801.GetAudioDataStatusResponse.TaskAsrResult.AsrResult.ClientEvStat;
import com.aliyuncs.qualitycheck.model.v20160801.GetAudioDataStatusResponse.TaskAsrResult.AsrResult.ClientSrStat;
import com.aliyuncs.qualitycheck.model.v20160801.GetAudioDataStatusResponse.TaskAsrResult.AsrResult.SentenceResult;
import com.aliyuncs.qualitycheck.model.v20160801.GetAudioDataStatusResponse.TaskAsrResult.AsrResult.ServiceEvStat;
import com.aliyuncs.qualitycheck.model.v20160801.GetAudioDataStatusResponse.TaskAsrResult.AsrResult.ServiceSrStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAudioDataStatusResponseUnmarshaller {

	public static GetAudioDataStatusResponse unmarshall(GetAudioDataStatusResponse getAudioDataStatusResponse, UnmarshallerContext context) {
		
		getAudioDataStatusResponse.setRequestId(context.stringValue("GetAudioDataStatusResponse.requestId"));
		getAudioDataStatusResponse.setSuccess(context.booleanValue("GetAudioDataStatusResponse.success"));
		getAudioDataStatusResponse.setCode(context.stringValue("GetAudioDataStatusResponse.code"));
		getAudioDataStatusResponse.setMessage(context.stringValue("GetAudioDataStatusResponse.message"));
		getAudioDataStatusResponse.setCount(context.integerValue("GetAudioDataStatusResponse.count"));
		getAudioDataStatusResponse.setOverallStatus(context.integerValue("GetAudioDataStatusResponse.overallStatus"));

		List<TaskAsrResult> data = new ArrayList<TaskAsrResult>();
		for (int i = 0; i < context.lengthValue("GetAudioDataStatusResponse.data.Length"); i++) {
			TaskAsrResult taskAsrResult = new TaskAsrResult();
			taskAsrResult.setTid(context.stringValue("GetAudioDataStatusResponse.data["+ i +"].tid"));
			taskAsrResult.setStatusCode(context.integerValue("GetAudioDataStatusResponse.data["+ i +"].statusCode"));
			taskAsrResult.setStatusMsg(context.stringValue("GetAudioDataStatusResponse.data["+ i +"].statusMsg"));

			AsrResult asrResult = new AsrResult();
			asrResult.setAsrstatus(context.stringValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.asrstatus"));
			asrResult.setAsrStatusCode(context.stringValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.asrStatusCode"));
			asrResult.setErrorMessage(context.stringValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.errorMessage"));
			asrResult.setDuration(context.longValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.duration"));
			asrResult.setInteractiveCount(context.integerValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.interactiveCount"));

			ServiceEvStat serviceEvStat = new ServiceEvStat();
			serviceEvStat.setSrole(context.integerValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.serviceEvStat.srole"));
			serviceEvStat.setSmaxEmotionValue(context.floatValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.serviceEvStat.smaxEmotionValue"));
			serviceEvStat.setSminEmotionValue(context.floatValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.serviceEvStat.sminEmotionValue"));
			serviceEvStat.setSavgEmotionValue(context.floatValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.serviceEvStat.savgEmotionValue"));
			asrResult.setServiceEvStat(serviceEvStat);

			ClientEvStat clientEvStat = new ClientEvStat();
			clientEvStat.setCrole(context.integerValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.clientEvStat.crole"));
			clientEvStat.setCmaxEmotionValue(context.floatValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.clientEvStat.cmaxEmotionValue"));
			clientEvStat.setCminEmotionValue(context.floatValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.clientEvStat.cminEmotionValue"));
			clientEvStat.setCavgEmotionValue(context.floatValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.clientEvStat.cavgEmotionValue"));
			asrResult.setClientEvStat(clientEvStat);

			ServiceSrStat serviceSrStat = new ServiceSrStat();
			serviceSrStat.setSrole(context.integerValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.serviceSrStat.srole"));
			serviceSrStat.setSmaxSpeechRate(context.floatValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.serviceSrStat.smaxSpeechRate"));
			serviceSrStat.setSminSpeechRate(context.floatValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.serviceSrStat.sminSpeechRate"));
			serviceSrStat.setSavgSpeechRate(context.floatValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.serviceSrStat.savgSpeechRate"));
			asrResult.setServiceSrStat(serviceSrStat);

			ClientSrStat clientSrStat = new ClientSrStat();
			clientSrStat.setCrole(context.integerValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.clientSrStat.crole"));
			clientSrStat.setCmaxSpeechRate(context.floatValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.clientSrStat.cmaxSpeechRate"));
			clientSrStat.setCminSpeechRate(context.floatValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.clientSrStat.cminSpeechRate"));
			clientSrStat.setCavgSpeechRate(context.floatValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.clientSrStat.cavgSpeechRate"));
			asrResult.setClientSrStat(clientSrStat);

			List<SentenceResult> sentenceResults = new ArrayList<SentenceResult>();
			for (int j = 0; j < context.lengthValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.sentenceResults.Length"); j++) {
				SentenceResult sentenceResult = new SentenceResult();
				sentenceResult.setBeginTime(context.integerValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.sentenceResults["+ j +"].beginTime"));
				sentenceResult.setEndTime(context.integerValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.sentenceResults["+ j +"].endTime"));
				sentenceResult.setChannelId(context.integerValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.sentenceResults["+ j +"].channelId"));
				sentenceResult.setText(context.stringValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.sentenceResults["+ j +"].text"));
				sentenceResult.setEmotionValue(context.integerValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.sentenceResults["+ j +"].emotionValue"));
				sentenceResult.setSilenceDuration(context.integerValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.sentenceResults["+ j +"].silenceDuration"));
				sentenceResult.setSpeechRate(context.integerValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.sentenceResults["+ j +"].speechRate"));
				sentenceResult.setSpeakerId(context.stringValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.sentenceResults["+ j +"].speakerId"));
				sentenceResult.setAgentId(context.stringValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.sentenceResults["+ j +"].agentId"));
				sentenceResult.setChannelKey(context.stringValue("GetAudioDataStatusResponse.data["+ i +"].asrResult.sentenceResults["+ j +"].channelKey"));

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