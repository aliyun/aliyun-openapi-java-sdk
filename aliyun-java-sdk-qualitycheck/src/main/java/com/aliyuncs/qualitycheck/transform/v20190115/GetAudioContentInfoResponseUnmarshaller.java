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

import com.aliyuncs.qualitycheck.model.v20190115.GetAudioContentInfoResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioContentInfoResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioContentInfoResponse.Data.DiffAsrContentInfoItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioContentInfoResponse.Data.DiffAsrContentInfoItem.DiffContentHighlightItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioContentInfoResponse.Data.DiffAsrContentInfoItem.DiffContentHighlightItem.DiffContentPositionItem;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioContentInfoResponse.Data.DiffAsrContentInfoItem.SentenceResult1;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioContentInfoResponse.Data.SentenceResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAudioContentInfoResponseUnmarshaller {

	public static GetAudioContentInfoResponse unmarshall(GetAudioContentInfoResponse getAudioContentInfoResponse, UnmarshallerContext _ctx) {
		
		getAudioContentInfoResponse.setRequestId(_ctx.stringValue("GetAudioContentInfoResponse.RequestId"));
		getAudioContentInfoResponse.setSuccess(_ctx.booleanValue("GetAudioContentInfoResponse.Success"));
		getAudioContentInfoResponse.setCode(_ctx.stringValue("GetAudioContentInfoResponse.Code"));
		getAudioContentInfoResponse.setMessage(_ctx.stringValue("GetAudioContentInfoResponse.Message"));

		Data data = new Data();
		data.setTaskType(_ctx.integerValue("GetAudioContentInfoResponse.Data.TaskType"));

		List<SentenceResult> recognizeDialogue = new ArrayList<SentenceResult>();
		for (int i = 0; i < _ctx.lengthValue("GetAudioContentInfoResponse.Data.RecognizeDialogue.Length"); i++) {
			SentenceResult sentenceResult = new SentenceResult();
			sentenceResult.setBeginTime(_ctx.longValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].BeginTime"));
			sentenceResult.setChannelId(_ctx.integerValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].ChannelId"));
			sentenceResult.setEndTime(_ctx.longValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].EndTime"));
			sentenceResult.setText(_ctx.stringValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].Text"));
			sentenceResult.setEmotionValue(_ctx.integerValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].EmotionValue"));
			sentenceResult.setSilenceDuration(_ctx.integerValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].SilenceDuration"));
			sentenceResult.setSpeechRate(_ctx.integerValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].SpeechRate"));
			sentenceResult.setSpeakerId(_ctx.stringValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].SpeakerId"));
			sentenceResult.setChannelKey(_ctx.stringValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].ChannelKey"));
			sentenceResult.setAgentId(_ctx.stringValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].AgentId"));
			sentenceResult.setIdentificationId(_ctx.integerValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].IdentificationId"));

			recognizeDialogue.add(sentenceResult);
		}
		data.setRecognizeDialogue(recognizeDialogue);

		List<DiffAsrContentInfoItem> diffAsrContentInfo = new ArrayList<DiffAsrContentInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo.Length"); i++) {
			DiffAsrContentInfoItem diffAsrContentInfoItem = new DiffAsrContentInfoItem();

			List<SentenceResult1> ordinaryModelDialogues = new ArrayList<SentenceResult1>();
			for (int j = 0; j < _ctx.lengthValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues.Length"); j++) {
				SentenceResult1 sentenceResult1 = new SentenceResult1();
				sentenceResult1.setBeginTime(_ctx.longValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].BeginTime"));
				sentenceResult1.setChannelId(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].ChannelId"));
				sentenceResult1.setEndTime(_ctx.longValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].EndTime"));
				sentenceResult1.setText(_ctx.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].Text"));
				sentenceResult1.setEmotionValue(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].EmotionValue"));
				sentenceResult1.setSilenceDuration(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].SilenceDuration"));
				sentenceResult1.setSpeechRate(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].SpeechRate"));
				sentenceResult1.setSpeakerId(_ctx.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].SpeakerId"));
				sentenceResult1.setChannelKey(_ctx.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].ChannelKey"));
				sentenceResult1.setAgentId(_ctx.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].AgentId"));
				sentenceResult1.setIdentificationId(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].IdentificationId"));

				ordinaryModelDialogues.add(sentenceResult1);
			}
			diffAsrContentInfoItem.setOrdinaryModelDialogues(ordinaryModelDialogues);

			List<SentenceResult> customModelDialogues = new ArrayList<SentenceResult>();
			for (int j = 0; j < _ctx.lengthValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues.Length"); j++) {
				SentenceResult sentenceResult = new SentenceResult();
				sentenceResult.setBeginTime(_ctx.longValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].BeginTime"));
				sentenceResult.setChannelId(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].ChannelId"));
				sentenceResult.setEndTime(_ctx.longValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].EndTime"));
				sentenceResult.setText(_ctx.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].Text"));
				sentenceResult.setEmotionValue(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].EmotionValue"));
				sentenceResult.setSilenceDuration(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].SilenceDuration"));
				sentenceResult.setSpeechRate(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].SpeechRate"));
				sentenceResult.setSpeakerId(_ctx.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].SpeakerId"));
				sentenceResult.setChannelKey(_ctx.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].ChannelKey"));
				sentenceResult.setAgentId(_ctx.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].AgentId"));
				sentenceResult.setIdentificationId(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].IdentificationId"));

				customModelDialogues.add(sentenceResult);
			}
			diffAsrContentInfoItem.setCustomModelDialogues(customModelDialogues);

			List<DiffContentHighlightItem> diffContentHighlight = new ArrayList<DiffContentHighlightItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight.Length"); j++) {
				DiffContentHighlightItem diffContentHighlightItem = new DiffContentHighlightItem();
				diffContentHighlightItem.setOrdinaryModelContent(_ctx.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].OrdinaryModelContent"));
				diffContentHighlightItem.setCustomModelContent(_ctx.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].CustomModelContent"));
				diffContentHighlightItem.setIdentificationId(_ctx.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].IdentificationId"));

				List<DiffContentPositionItem> diffContentPosition = new ArrayList<DiffContentPositionItem>();
				for (int k = 0; k < _ctx.lengthValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition.Length"); k++) {
					DiffContentPositionItem diffContentPositionItem = new DiffContentPositionItem();
					diffContentPositionItem.setOrdinaryModelfrom(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition["+ k +"].OrdinaryModelfrom"));
					diffContentPositionItem.setOrdinaryModelto(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition["+ k +"].OrdinaryModelto"));
					diffContentPositionItem.setOrdinaryModelKeyWord(_ctx.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition["+ k +"].OrdinaryModelKeyWord"));
					diffContentPositionItem.setCustomModelModelfrom(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition["+ k +"].CustomModelModelfrom"));
					diffContentPositionItem.setCustomModelModelto(_ctx.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition["+ k +"].CustomModelModelto"));
					diffContentPositionItem.setCustomModellKeyWord(_ctx.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition["+ k +"].CustomModellKeyWord"));

					diffContentPosition.add(diffContentPositionItem);
				}
				diffContentHighlightItem.setDiffContentPosition(diffContentPosition);

				diffContentHighlight.add(diffContentHighlightItem);
			}
			diffAsrContentInfoItem.setDiffContentHighlight(diffContentHighlight);

			diffAsrContentInfo.add(diffAsrContentInfoItem);
		}
		data.setDiffAsrContentInfo(diffAsrContentInfo);
		getAudioContentInfoResponse.setData(data);
	 
	 	return getAudioContentInfoResponse;
	}
}