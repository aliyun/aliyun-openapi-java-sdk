/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.qualitycheck.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20160801.GetAudioDataStatusResponse;
import com.aliyuncs.qualitycheck.model.v20160801.GetAudioDataStatusResponse.TaskAsrResult;
import com.aliyuncs.qualitycheck.model.v20160801.GetAudioDataStatusResponse.TaskAsrResult.AsrResult;
import com.aliyuncs.qualitycheck.model.v20160801.GetAudioDataStatusResponse.TaskAsrResult.AsrResult.SentenceResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAudioDataStatusResponseUnmarshaller {

	public static GetAudioDataStatusResponse unmarshall(GetAudioDataStatusResponse getAudioDataStatusResponse, UnmarshallerContext context) {
		
		getAudioDataStatusResponse.setRequestId(context.stringValue("GetAudioDataStatusResponse.RequestId"));
		getAudioDataStatusResponse.setSuccess(context.booleanValue("GetAudioDataStatusResponse.Success"));
		getAudioDataStatusResponse.setCode(context.stringValue("GetAudioDataStatusResponse.Code"));
		getAudioDataStatusResponse.setMessage(context.stringValue("GetAudioDataStatusResponse.Message"));
		getAudioDataStatusResponse.setCount(context.integerValue("GetAudioDataStatusResponse.Count"));

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

			List<SentenceResult> sentenceResults = new ArrayList<SentenceResult>();
			for (int j = 0; j < context.lengthValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults.Length"); j++) {
				SentenceResult sentenceResult = new SentenceResult();
				sentenceResult.setBeginTime(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].BeginTime"));
				sentenceResult.setEndTime(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].EndTime"));
				sentenceResult.setChannelId(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].ChannelId"));
				sentenceResult.setText(context.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].Text"));
				sentenceResult.setEmotionValue(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].emotionValue"));
				sentenceResult.setSilenceDuration(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].silenceDuration"));
				sentenceResult.setSpeechRate(context.integerValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].speechRate"));
				sentenceResult.setSpeakerId(context.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].speakerId"));
				sentenceResult.setAgentId(context.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].agentId"));
				sentenceResult.setChannelKey(context.stringValue("GetAudioDataStatusResponse.Data["+ i +"].AsrResult.SentenceResults["+ j +"].channelKey"));

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