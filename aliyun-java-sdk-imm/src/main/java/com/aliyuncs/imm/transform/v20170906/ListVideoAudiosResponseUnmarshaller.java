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

	public static ListVideoAudiosResponse unmarshall(ListVideoAudiosResponse listVideoAudiosResponse, UnmarshallerContext _ctx) {
		
		listVideoAudiosResponse.setRequestId(_ctx.stringValue("ListVideoAudiosResponse.RequestId"));
		listVideoAudiosResponse.setVideoUri(_ctx.stringValue("ListVideoAudiosResponse.VideoUri"));
		listVideoAudiosResponse.setNextMarker(_ctx.stringValue("ListVideoAudiosResponse.NextMarker"));
		listVideoAudiosResponse.setSetId(_ctx.stringValue("ListVideoAudiosResponse.SetId"));

		List<AudiosItem> audios = new ArrayList<AudiosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVideoAudiosResponse.Audios.Length"); i++) {
			AudiosItem audiosItem = new AudiosItem();
			audiosItem.setSourcePosition(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].SourcePosition"));
			audiosItem.setCreateTime(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].CreateTime"));
			audiosItem.setRemarksC(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].RemarksC"));
			audiosItem.setAudioDuration(_ctx.floatValue("ListVideoAudiosResponse.Audios["+ i +"].AudioDuration"));
			audiosItem.setSourceType(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].SourceType"));
			audiosItem.setAudioTextsStatus(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTextsStatus"));
			audiosItem.setAudioFormat(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioFormat"));
			audiosItem.setRemarksD(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].RemarksD"));
			audiosItem.setProcessModifyTime(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].ProcessModifyTime"));
			audiosItem.setProcessFailReason(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].ProcessFailReason"));
			audiosItem.setAudioUri(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioUri"));
			audiosItem.setAudioRate(_ctx.integerValue("ListVideoAudiosResponse.Audios["+ i +"].AudioRate"));
			audiosItem.setAudioTextsModifyTime(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTextsModifyTime"));
			audiosItem.setRemarksA(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].RemarksA"));
			audiosItem.setExternalId(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].ExternalId"));
			audiosItem.setSourceUri(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].SourceUri"));
			audiosItem.setProcessStatus(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].ProcessStatus"));
			audiosItem.setAudioTextsFailReason(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTextsFailReason"));
			audiosItem.setRemarksB(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].RemarksB"));
			audiosItem.setFileSize(_ctx.integerValue("ListVideoAudiosResponse.Audios["+ i +"].FileSize"));
			audiosItem.setModifyTime(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].ModifyTime"));

			List<AudioTextsItem> audioTexts = new ArrayList<AudioTextsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts.Length"); j++) {
				AudioTextsItem audioTextsItem = new AudioTextsItem();
				audioTextsItem.setEndTime(_ctx.floatValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].EndTime"));
				audioTextsItem.setLibrary(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].Library"));
				audioTextsItem.setConfidence(_ctx.floatValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].Confidence"));
				audioTextsItem.setBeginTime(_ctx.floatValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].BeginTime"));
				audioTextsItem.setChannelId(_ctx.integerValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].ChannelId"));
				audioTextsItem.setEmotionValue(_ctx.floatValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].EmotionValue"));
				audioTextsItem.setSpeechRate(_ctx.integerValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].SpeechRate"));
				audioTextsItem.setText(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].Text"));
				audioTextsItem.setPerson(_ctx.stringValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].Person"));
				audioTextsItem.setSilenceDuration(_ctx.floatValue("ListVideoAudiosResponse.Audios["+ i +"].AudioTexts["+ j +"].SilenceDuration"));

				audioTexts.add(audioTextsItem);
			}
			audiosItem.setAudioTexts(audioTexts);

			audios.add(audiosItem);
		}
		listVideoAudiosResponse.setAudios(audios);
	 
	 	return listVideoAudiosResponse;
	}
}