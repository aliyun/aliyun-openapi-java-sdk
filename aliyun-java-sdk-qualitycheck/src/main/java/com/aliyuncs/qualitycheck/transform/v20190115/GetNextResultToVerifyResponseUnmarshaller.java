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

	public static GetNextResultToVerifyResponse unmarshall(GetNextResultToVerifyResponse getNextResultToVerifyResponse, UnmarshallerContext context) {
		
		getNextResultToVerifyResponse.setRequestId(context.stringValue("GetNextResultToVerifyResponse.RequestId"));
		getNextResultToVerifyResponse.setSuccess(context.booleanValue("GetNextResultToVerifyResponse.Success"));
		getNextResultToVerifyResponse.setCode(context.stringValue("GetNextResultToVerifyResponse.Code"));
		getNextResultToVerifyResponse.setMessage(context.stringValue("GetNextResultToVerifyResponse.Message"));

		Data data = new Data();
		data.setStatus(context.integerValue("GetNextResultToVerifyResponse.Data.Status"));
		data.setAudioURL(context.stringValue("GetNextResultToVerifyResponse.Data.AudioURL"));
		data.setAudioScheme(context.stringValue("GetNextResultToVerifyResponse.Data.AudioScheme"));
		data.setFileName(context.stringValue("GetNextResultToVerifyResponse.Data.FileName"));
		data.setFileId(context.stringValue("GetNextResultToVerifyResponse.Data.FileId"));
		data.setVerified(context.booleanValue("GetNextResultToVerifyResponse.Data.Verified"));
		data.setTotalCount(context.integerValue("GetNextResultToVerifyResponse.Data.TotalCount"));
		data.setVerifiedCount(context.integerValue("GetNextResultToVerifyResponse.Data.VerifiedCount"));
		data.setIncorrectWords(context.integerValue("GetNextResultToVerifyResponse.Data.IncorrectWords"));
		data.setPrecision(context.floatValue("GetNextResultToVerifyResponse.Data.Precision"));
		data.setUpdateTime(context.stringValue("GetNextResultToVerifyResponse.Data.UpdateTime"));
		data.setDuration(context.integerValue("GetNextResultToVerifyResponse.Data.Duration"));
		data.setIndex(context.integerValue("GetNextResultToVerifyResponse.Data.Index"));

		List<Dialogue> dialogues = new ArrayList<Dialogue>();
		for (int i = 0; i < context.lengthValue("GetNextResultToVerifyResponse.Data.Dialogues.Length"); i++) {
			Dialogue dialogue = new Dialogue();
			dialogue.setBegin(context.longValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Begin"));
			dialogue.setBeginTime(context.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].BeginTime"));
			dialogue.setEmotionValue(context.integerValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].EmotionValue"));
			dialogue.setEnd(context.longValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].End"));
			dialogue.setHourMinSec(context.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].HourMinSec"));
			dialogue.setIdentity(context.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Identity"));
			dialogue.setRole(context.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Role"));
			dialogue.setSourceRole(context.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].SourceRole"));
			dialogue.setSilenceDuration(context.integerValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].SilenceDuration"));
			dialogue.setSpeechRate(context.integerValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].SpeechRate"));
			dialogue.setWords(context.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Words"));
			dialogue.setSourceWords(context.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].SourceWords"));
			dialogue.setIncorrectWords(context.integerValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].IncorrectWords"));

			List<Delta> deltas = new ArrayList<Delta>();
			for (int j = 0; j < context.lengthValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas.Length"); j++) {
				Delta delta = new Delta();
				delta.setType(context.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Type"));

				Source source = new Source();
				source.setPosition(context.integerValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Source.Position"));

				List<String> line = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Source.Line.Length"); k++) {
					line.add(context.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Source.Line["+ k +"]"));
				}
				source.setLine(line);
				delta.setSource(source);

				Target target = new Target();
				target.setPosition(context.integerValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Target.Position"));

				List<String> line1 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Target.Line.Length"); k++) {
					line1.add(context.stringValue("GetNextResultToVerifyResponse.Data.Dialogues["+ i +"].Deltas["+ j +"].Target.Line["+ k +"]"));
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