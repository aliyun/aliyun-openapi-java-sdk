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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListVideoAudiosResponse;
import com.aliyuncs.imm.model.v20170906.ListVideoAudiosResponse.AudiosItem;
import com.aliyuncs.imm.model.v20170906.ListVideoAudiosResponse.AudiosItem.AudioTextsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVideoAudiosResponseUnmarshaller {

	public static ListVideoAudiosResponse unmarshall(ListVideoAudiosResponse listVideoAudiosResponse, UnmarshallerContext context) {
		
		listVideoAudiosResponse.setRequestId(context.stringValue("ListVideoAudiosResponse.RequestId"));
		listVideoAudiosResponse.setSetId(context.stringValue("ListVideoAudiosResponse.SetId"));
		listVideoAudiosResponse.setVideoUri(context.stringValue("ListVideoAudiosResponse.VideoUri"));
		listVideoAudiosResponse.setNextMarker(context.stringValue("ListVideoAudiosResponse.NextMarker"));

		List<AudiosItem> audios = new ArrayList<AudiosItem>();
		for (int i = 0; i < context.lengthValue("ListVideoAudiosResponse.Audios.Length"); i++) {
			AudiosItem audiosItem = new AudiosItem();
			audiosItem.setAudioDuration(context.floatValue("ListVideoAudiosResponse.Audios["+ i +"].AudioDuration"));
			audiosItem.setAudioUri(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioUri"));
			audiosItem.setAudioRate(context.integerValue("ListVideoAudiosResponse.Audios["+ i +"].AudioRate"));
			audiosItem.setSourceType(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].SourceType"));
			audiosItem.setModifyTime(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].ModifyTime"));
			audiosItem.setFileSize(context.integerValue("ListVideoAudiosResponse.Audios["+ i +"].FileSize"));
			audiosItem.setSourceUri(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].SourceUri"));
			audiosItem.setCreateTime(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].CreateTime"));
			audiosItem.setRemarksA(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].RemarksA"));
			audiosItem.setRemarksB(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].RemarksB"));
			audiosItem.setAudioTextsStatus(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTextsStatus"));
			audiosItem.setAudioTextsModifyTime(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTextsModifyTime"));
			audiosItem.setProcessModifyTime(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].ProcessModifyTime"));
			audiosItem.setProcessStatus(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].ProcessStatus"));
			audiosItem.setSourcePosition(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].SourcePosition"));
			audiosItem.setAudioFormat(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioFormat"));
			audiosItem.setAudioTextsFailReason(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTextsFailReason"));
			audiosItem.setProcessFailReason(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].ProcessFailReason"));
			audiosItem.setRemarksC(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].RemarksC"));
			audiosItem.setRemarksD(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].RemarksD"));
			audiosItem.setExternalId(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].ExternalId"));

			List<AudioTextsItem> audioTexts = new ArrayList<AudioTextsItem>();
			for (int j = 0; j < context.lengthValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts.Length"); j++) {
				AudioTextsItem audioTextsItem = new AudioTextsItem();
				audioTextsItem.setText(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].Text"));
				audioTextsItem.setBeginTime(context.floatValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].BeginTime"));
				audioTextsItem.setEndTime(context.floatValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].EndTime"));
				audioTextsItem.setSilenceDuration(context.floatValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].SilenceDuration"));
				audioTextsItem.setEmotionValue(context.floatValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].EmotionValue"));
				audioTextsItem.setChannelId(context.integerValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].ChannelId"));
				audioTextsItem.setSpeechRate(context.integerValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].SpeechRate"));
				audioTextsItem.setConfidence(context.floatValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].Confidence"));
				audioTextsItem.setPerson(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].Person"));
				audioTextsItem.setLibrary(context.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].Library"));

				audioTexts.add(audioTextsItem);
			}
			audiosItem.setAudioTexts(audioTexts);

			audios.add(audiosItem);
		}
		listVideoAudiosResponse.setAudios(audios);
	 
	 	return listVideoAudiosResponse;
	}
}