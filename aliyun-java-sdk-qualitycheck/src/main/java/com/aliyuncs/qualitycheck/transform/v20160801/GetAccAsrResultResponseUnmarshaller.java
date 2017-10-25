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

import com.aliyuncs.qualitycheck.model.v20160801.GetAccAsrResultResponse;
import com.aliyuncs.qualitycheck.model.v20160801.GetAccAsrResultResponse.AccAsrSentenceResult;
import com.aliyuncs.qualitycheck.model.v20160801.GetAccAsrResultResponse.AccAsrSentenceResult.SentenceResult;
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

			List<SentenceResult> results = new ArrayList<SentenceResult>();
			for (int j = 0; j < context.lengthValue("GetAccAsrResultResponse.Data["+ i +"].Results.Length"); j++) {
				SentenceResult sentenceResult = new SentenceResult();
				sentenceResult.setBeginTime(context.integerValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].BeginTime"));
				sentenceResult.setEndTime(context.integerValue("GetAccAsrResultResponse.Data["+ i +"].Results["+ j +"].EndTime"));
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