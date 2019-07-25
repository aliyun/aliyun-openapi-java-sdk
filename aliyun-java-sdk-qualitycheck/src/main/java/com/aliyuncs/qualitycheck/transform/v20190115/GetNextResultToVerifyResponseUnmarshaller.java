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

import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToVerifyResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToVerifyResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToVerifyResponse.Data.Dialogue;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToVerifyResponse.Data.Dialogue.Delta;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToVerifyResponse.Data.Dialogue.Delta.Source;
import com.aliyuncs.qualitycheck.model.v20190115.GetNextResultToVerifyResponse.Data.Dialogue.Delta.Target;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNextResultToVerifyResponseUnmarshaller {

	public static GetNextResultToVerifyResponse unmarshall(GetNextResultToVerifyResponse getNextResultToVerifyResponse, UnmarshallerContext _ctx) {
		
		getNextResultToVerifyResponse.setRequestId(_ctx.stringValue("GetNextResultToVerifyResponse.RequestId"));
		getNextResultToVerifyResponse.setSuccess(_ctx.booleanValue("GetNextResultToVerifyResponse.Success"));
		getNextResultToVerifyResponse.setCode(_ctx.stringValue("GetNextResultToVerifyResponse.Code"));
		getNextResultToVerifyResponse.setMessage(_ctx.stringValue("GetNextResultToVerifyResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("GetNextResultToVerifyResponse.Data.Status"));
		data.setAudioURL(_ctx.stringValue("GetNextResultToVerifyResponse.Data.AudioURL"));
		data.setAudioScheme(_ctx.stringValue("GetNextResultToVerifyResponse.Data.AudioScheme"));
		data.setFileName(_ctx.stringValue("GetNextResultToVerifyResponse.Data.FileName"));
		data.setFileId(_ctx.stringValue("GetNextResultToVerifyResponse.Data.FileId"));
		data.setVerified(_ctx.booleanValue("GetNextResultToVerifyResponse.Data.Verified"));
		data.setTotalCount(_ctx.integerValue("GetNextResultToVerifyResponse.Data.TotalCount"));
		data.setVerifiedCount(_ctx.integerValue("GetNextResultToVerifyResponse.Data.VerifiedCount"));
		data.setIncorrectWords(_ctx.integerValue("GetNextResultToVerifyResponse.Data.IncorrectWords"));
		data.setPrecision(_ctx.floatValue("GetNextResultToVerifyResponse.Data.Precision"));
		data.setUpdateTime(_ctx.stringValue("GetNextResultToVerifyResponse.Data.UpdateTime"));
		data.setDuration(_ctx.integerValue("GetNextResultToVerifyResponse.Data.Duration"));
		data.setIndex(_ctx.integerValue("GetNextResultToVerifyResponse.Data.Index"));

		List<Dialogue> dialogues = new ArrayList<Dialogue>();
		for (int i = 0; i < _ctx.lengthValue("GetNextResultToVerifyResponse.Data.Dialogues.Length"); i++) {
			Dialogue dialogue = new Dialogue();
			dialogue.setBegin(_ctx.longValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Begin"));
			dialogue.setBeginTime(_ctx.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].BeginTime"));
			dialogue.setEmotionValue(_ctx.integerValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].EmotionValue"));
			dialogue.setEnd(_ctx.longValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].End"));
			dialogue.setHourMinSec(_ctx.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].HourMinSec"));
			dialogue.setIdentity(_ctx.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Identity"));
			dialogue.setRole(_ctx.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Role"));
			dialogue.setSourceRole(_ctx.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].SourceRole"));
			dialogue.setSilenceDuration(_ctx.integerValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].SilenceDuration"));
			dialogue.setSpeechRate(_ctx.integerValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].SpeechRate"));
			dialogue.setWords(_ctx.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Words"));
			dialogue.setSourceWords(_ctx.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].SourceWords"));
			dialogue.setIncorrectWords(_ctx.integerValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].IncorrectWords"));

			List<Delta> deltas = new ArrayList<Delta>();
			for (int j = 0; j < _ctx.lengthValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas.Length"); j++) {
				Delta delta = new Delta();
				delta.setType(_ctx.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Type"));

				Source source = new Source();
				source.setPosition(_ctx.integerValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Source.Position"));

				List<String> line = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Source.Line.Length"); k++) {
					line.add(_ctx.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Source.Line["+ k +"]"));
				}
				source.setLine(line);
				delta.setSource(source);

				Target target = new Target();
				target.setPosition(_ctx.integerValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Target.Position"));

				List<String> line1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Target.Line.Length"); k++) {
					line1.add(_ctx.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Target.Line["+ k +"]"));
				}
				target.setLine1(line1);
				delta.setTarget(target);

				deltas.add(delta);
			}
			dialogue.setDeltas(deltas);

			dialogues.add(dialogue);
		}
		data.setDialogues(dialogues);
		getNextResultToVerifyResponse.setData(data);
	 
	 	return getNextResultToVerifyResponse;
	}
}