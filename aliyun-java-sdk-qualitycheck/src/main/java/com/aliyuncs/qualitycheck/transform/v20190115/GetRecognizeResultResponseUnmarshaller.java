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

import com.aliyuncs.qualitycheck.model.v20190115.GetRecognizeResultResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetRecognizeResultResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetRecognizeResultResponse.Data.SentenceResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRecognizeResultResponseUnmarshaller {

	public static GetRecognizeResultResponse unmarshall(GetRecognizeResultResponse getRecognizeResultResponse, UnmarshallerContext context) {
		
		getRecognizeResultResponse.setRequestId(context.stringValue("GetRecognizeResultResponse.RequestId"));
		getRecognizeResultResponse.setSuccess(context.booleanValue("GetRecognizeResultResponse.Success"));
		getRecognizeResultResponse.setCode(context.stringValue("GetRecognizeResultResponse.Code"));
		getRecognizeResultResponse.setMessage(context.stringValue("GetRecognizeResultResponse.Message"));

		Data data = new Data();
		data.setTaskAsrResqusetId(context.longValue("GetRecognizeResultResponse.Data.TaskAsrResqusetId"));

		List<SentenceResult> sentenceResultList = new ArrayList<SentenceResult>();
		for (int i = 0; i < context.lengthValue("GetRecognizeResultResponse.Data.SentenceResultList.Length"); i++) {
			SentenceResult sentenceResult = new SentenceResult();
			sentenceResult.setBeginTime(context.longValue("GetRecognizeResultResponse.Data.SentenceResultList["+ i +"].BeginTime"));
			sentenceResult.setChannelId(context.longValue("GetRecognizeResultResponse.Data.SentenceResultList["+ i +"].ChannelId"));
			sentenceResult.setEndTime(context.longValue("GetRecognizeResultResponse.Data.SentenceResultList["+ i +"].EndTime"));
			sentenceResult.setEmotionValue(context.integerValue("GetRecognizeResultResponse.Data.SentenceResultList["+ i +"].EmotionValue"));
			sentenceResult.setSilenceDuration(context.integerValue("GetRecognizeResultResponse.Data.SentenceResultList["+ i +"].SilenceDuration"));
			sentenceResult.setSpeechRate(context.integerValue("GetRecognizeResultResponse.Data.SentenceResultList["+ i +"].SpeechRate"));
			sentenceResult.setText(context.stringValue("GetRecognizeResultResponse.Data.SentenceResultList["+ i +"].Text"));

			sentenceResultList.add(sentenceResult);
		}
		data.setSentenceResultList(sentenceResultList);
		getRecognizeResultResponse.setData(data);
	 
	 	return getRecognizeResultResponse;
	}
}