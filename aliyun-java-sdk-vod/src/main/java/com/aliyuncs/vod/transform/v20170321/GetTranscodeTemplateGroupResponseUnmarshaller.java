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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetTranscodeTemplateGroupResponse;
import com.aliyuncs.vod.model.v20170321.GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup;
import com.aliyuncs.vod.model.v20170321.GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTranscodeTemplateGroupResponseUnmarshaller {

	public static GetTranscodeTemplateGroupResponse unmarshall(GetTranscodeTemplateGroupResponse getTranscodeTemplateGroupResponse, UnmarshallerContext context) {
		
		getTranscodeTemplateGroupResponse.setRequestId(context.stringValue("GetTranscodeTemplateGroupResponse.RequestId"));

		TranscodeTemplateGroup transcodeTemplateGroup = new TranscodeTemplateGroup();
		transcodeTemplateGroup.setCreationTime(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.CreationTime"));
		transcodeTemplateGroup.setModifyTime(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.ModifyTime"));
		transcodeTemplateGroup.setName(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.Name"));
		transcodeTemplateGroup.setIsDefault(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.IsDefault"));
		transcodeTemplateGroup.setLocked(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.Locked"));
		transcodeTemplateGroup.setTranscodeTemplateGroupId(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateGroupId"));

		List<TranscodeTemplate> transcodeTemplateList = new ArrayList<TranscodeTemplate>();
		for (int i = 0; i < context.lengthValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList.Length"); i++) {
			TranscodeTemplate transcodeTemplate = new TranscodeTemplate();
			transcodeTemplate.setTranscodeTemplateId(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].TranscodeTemplateId"));
			transcodeTemplate.setVideo(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].Video"));
			transcodeTemplate.setAudio(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].Audio"));
			transcodeTemplate.setContainer(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].Container"));
			transcodeTemplate.setMuxConfig(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].MuxConfig"));
			transcodeTemplate.setTransConfig(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].TransConfig"));
			transcodeTemplate.setDefinition(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].Definition"));
			transcodeTemplate.setEncryptSetting(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].EncryptSetting"));
			transcodeTemplate.setPackageSetting(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].PackageSetting"));
			transcodeTemplate.setSubtitleList(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].SubtitleList"));
			transcodeTemplate.setOpeningList(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].OpeningList"));
			transcodeTemplate.setTailSlateList(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].TailSlateList"));
			transcodeTemplate.setTemplateName(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].TemplateName"));
			transcodeTemplate.setTranscodeFileRegular(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].TranscodeFileRegular"));
			transcodeTemplate.setClip(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].Clip"));
			transcodeTemplate.setRotate(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].Rotate"));

			List<String> watermarkIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].WatermarkIds.Length"); j++) {
				watermarkIds.add(context.stringValue("GetTranscodeTemplateGroupResponse.TranscodeTemplateGroup.TranscodeTemplateList["+ i +"].WatermarkIds["+ j +"]"));
			}
			transcodeTemplate.setWatermarkIds(watermarkIds);

			transcodeTemplateList.add(transcodeTemplate);
		}
		transcodeTemplateGroup.setTranscodeTemplateList(transcodeTemplateList);
		getTranscodeTemplateGroupResponse.setTranscodeTemplateGroup(transcodeTemplateGroup);
	 
	 	return getTranscodeTemplateGroupResponse;
	}
}