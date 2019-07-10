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
import com.aliyuncs.qualitycheck.model.v20190115.GetRecognizeResultResponse.Data.Dialogue;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRecognizeResultResponseUnmarshaller {

	public static GetRecognizeResultResponse unmarshall(GetRecognizeResultResponse getRecognizeResultResponse, UnmarshallerContext _ctx) {
		
		getRecognizeResultResponse.setRequestId(_ctx.stringValue("GetRecognizeResultResponse.RequestId"));
		getRecognizeResultResponse.setSuccess(_ctx.booleanValue("GetRecognizeResultResponse.Success"));
		getRecognizeResultResponse.setCode(_ctx.stringValue("GetRecognizeResultResponse.Code"));
		getRecognizeResultResponse.setMessage(_ctx.stringValue("GetRecognizeResultResponse.Message"));

		Data data = new Data();
		data.setTaskAsrRequestId(_ctx.longValue("GetRecognizeResultResponse.Data.TaskAsrRequestId"));

		List<Dialogue> dialogues = new ArrayList<Dialogue>();
		for (int i = 0; i < _ctx.lengthValue("GetRecognizeResultResponse.Data.Dialogues.Length"); i++) {
			Dialogue dialogue = new Dialogue();
			dialogue.setBegin(_ctx.longValue("GetRecognizeResultResponse.Data.Dialogues["+ i +"].Begin"));
			dialogue.setBeginTime(_ctx.stringValue("GetRecognizeResultResponse.Data.Dialogues["+ i +"].BeginTime"));
			dialogue.setEmotionValue(_ctx.integerValue("GetRecognizeResultResponse.Data.Dialogues["+ i +"].EmotionValue"));
			dialogue.setEnd(_ctx.longValue("GetRecognizeResultResponse.Data.Dialogues["+ i +"].End"));
			dialogue.setHourMinSec(_ctx.stringValue("GetRecognizeResultResponse.Data.Dialogues["+ i +"].HourMinSec"));
			dialogue.setIdentity(_ctx.stringValue("GetRecognizeResultResponse.Data.Dialogues["+ i +"].Identity"));
			dialogue.setRole(_ctx.stringValue("GetRecognizeResultResponse.Data.Dialogues["+ i +"].Role"));
			dialogue.setSilenceDuration(_ctx.integerValue("GetRecognizeResultResponse.Data.Dialogues["+ i +"].SilenceDuration"));
			dialogue.setSpeechRate(_ctx.integerValue("GetRecognizeResultResponse.Data.Dialogues["+ i +"].SpeechRate"));
			dialogue.setWords(_ctx.stringValue("GetRecognizeResultResponse.Data.Dialogues["+ i +"].Words"));

			dialogues.add(dialogue);
		}
		data.setDialogues(dialogues);
		getRecognizeResultResponse.setData(data);
	 
	 	return getRecognizeResultResponse;
	}
}