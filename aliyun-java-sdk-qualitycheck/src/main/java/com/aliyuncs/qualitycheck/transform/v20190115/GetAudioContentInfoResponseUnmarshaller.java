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

	public static GetAudioContentInfoResponse unmarshall(GetAudioContentInfoResponse getAudioContentInfoResponse, UnmarshallerContext context) {
		
		getAudioContentInfoResponse.setRequestId(context.stringValue("GetAudioContentInfoResponse.RequestId"));
		getAudioContentInfoResponse.setSuccess(context.booleanValue("GetAudioContentInfoResponse.Success"));
		getAudioContentInfoResponse.setCode(context.stringValue("GetAudioContentInfoResponse.Code"));
		getAudioContentInfoResponse.setMessage(context.stringValue("GetAudioContentInfoResponse.Message"));

		Data data = new Data();
		data.setTaskType(context.integerValue("GetAudioContentInfoResponse.Data.TaskType"));

		List<SentenceResult> recognizeDialogue = new ArrayList<SentenceResult>();
		for (int i = 0; i < context.lengthValue("GetAudioContentInfoResponse.Data.RecognizeDialogue.Length"); i++) {
			SentenceResult sentenceResult = new SentenceResult();
			sentenceResult.setBeginTime(context.longValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].BeginTime"));
			sentenceResult.setChannelId(context.integerValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].ChannelId"));
			sentenceResult.setEndTime(context.longValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].EndTime"));
			sentenceResult.setText(context.stringValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].Text"));
			sentenceResult.setEmotionValue(context.integerValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].EmotionValue"));
			sentenceResult.setSilenceDuration(context.integerValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].SilenceDuration"));
			sentenceResult.setSpeechRate(context.integerValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].SpeechRate"));
			sentenceResult.setSpeakerId(context.stringValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].SpeakerId"));
			sentenceResult.setChannelKey(context.stringValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].ChannelKey"));
			sentenceResult.setAgentId(context.stringValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].AgentId"));
			sentenceResult.setIdentificationId(context.integerValue("GetAudioContentInfoResponse.Data.RecognizeDialogue["+ i +"].IdentificationId"));

			recognizeDialogue.add(sentenceResult);
		}
		data.setRecognizeDialogue(recognizeDialogue);

		List<DiffAsrContentInfoItem> diffAsrContentInfo = new ArrayList<DiffAsrContentInfoItem>();
		for (int i = 0; i < context.lengthValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo.Length"); i++) {
			DiffAsrContentInfoItem diffAsrContentInfoItem = new DiffAsrContentInfoItem();

			List<SentenceResult1> ordinaryModelDialogues = new ArrayList<SentenceResult1>();
			for (int j = 0; j < context.lengthValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues.Length"); j++) {
				SentenceResult1 sentenceResult1 = new SentenceResult1();
				sentenceResult1.setBeginTime(context.longValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].BeginTime"));
				sentenceResult1.setChannelId(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].ChannelId"));
				sentenceResult1.setEndTime(context.longValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].EndTime"));
				sentenceResult1.setText(context.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].Text"));
				sentenceResult1.setEmotionValue(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].EmotionValue"));
				sentenceResult1.setSilenceDuration(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].SilenceDuration"));
				sentenceResult1.setSpeechRate(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].SpeechRate"));
				sentenceResult1.setSpeakerId(context.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].SpeakerId"));
				sentenceResult1.setChannelKey(context.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].ChannelKey"));
				sentenceResult1.setAgentId(context.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].AgentId"));
				sentenceResult1.setIdentificationId(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].OrdinaryModelDialogues["+ j +"].IdentificationId"));

				ordinaryModelDialogues.add(sentenceResult1);
			}
			diffAsrContentInfoItem.setOrdinaryModelDialogues(ordinaryModelDialogues);

			List<SentenceResult> customModelDialogues = new ArrayList<SentenceResult>();
			for (int j = 0; j < context.lengthValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues.Length"); j++) {
				SentenceResult sentenceResult = new SentenceResult();
				sentenceResult.setBeginTime(context.longValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].BeginTime"));
				sentenceResult.setChannelId(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].ChannelId"));
				sentenceResult.setEndTime(context.longValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].EndTime"));
				sentenceResult.setText(context.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].Text"));
				sentenceResult.setEmotionValue(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].EmotionValue"));
				sentenceResult.setSilenceDuration(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].SilenceDuration"));
				sentenceResult.setSpeechRate(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].SpeechRate"));
				sentenceResult.setSpeakerId(context.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].SpeakerId"));
				sentenceResult.setChannelKey(context.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].ChannelKey"));
				sentenceResult.setAgentId(context.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].AgentId"));
				sentenceResult.setIdentificationId(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].CustomModelDialogues["+ j +"].IdentificationId"));

				customModelDialogues.add(sentenceResult);
			}
			diffAsrContentInfoItem.setCustomModelDialogues(customModelDialogues);

			List<DiffContentHighlightItem> diffContentHighlight = new ArrayList<DiffContentHighlightItem>();
			for (int j = 0; j < context.lengthValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight.Length"); j++) {
				DiffContentHighlightItem diffContentHighlightItem = new DiffContentHighlightItem();
				diffContentHighlightItem.setOrdinaryModelContent(context.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].OrdinaryModelContent"));
				diffContentHighlightItem.setCustomModelContent(context.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].CustomModelContent"));
				diffContentHighlightItem.setIdentificationId(context.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].IdentificationId"));

				List<DiffContentPositionItem> diffContentPosition = new ArrayList<DiffContentPositionItem>();
				for (int k = 0; k < context.lengthValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition.Length"); k++) {
					DiffContentPositionItem diffContentPositionItem = new DiffContentPositionItem();
					diffContentPositionItem.setOrdinaryModelfrom(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition["+ k +"].OrdinaryModelfrom"));
					diffContentPositionItem.setOrdinaryModelto(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition["+ k +"].OrdinaryModelto"));
					diffContentPositionItem.setOrdinaryModelKeyWord(context.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition["+ k +"].OrdinaryModelKeyWord"));
					diffContentPositionItem.setCustomModelModelfrom(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition["+ k +"].CustomModelModelfrom"));
					diffContentPositionItem.setCustomModelModelto(context.integerValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition["+ k +"].CustomModelModelto"));
					diffContentPositionItem.setCustomModellKeyWord(context.stringValue("GetAudioContentInfoResponse.Data.DiffAsrContentInfo["+ i +"].DiffContentHighlight["+ j +"].DiffContentPosition["+ k +"].CustomModellKeyWord"));

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