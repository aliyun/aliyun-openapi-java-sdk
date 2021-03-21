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

import com.aliyuncs.imm.model.v20170906.GetVideoResponse;
import com.aliyuncs.imm.model.v20170906.GetVideoResponse.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.GetVideoResponse.PersonsItem;
import com.aliyuncs.imm.model.v20170906.GetVideoResponse.VideoTagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoResponseUnmarshaller {

	public static GetVideoResponse unmarshall(GetVideoResponse getVideoResponse, UnmarshallerContext _ctx) {
		
		getVideoResponse.setRequestId(_ctx.stringValue("GetVideoResponse.RequestId"));
		getVideoResponse.setModifyTime(_ctx.stringValue("GetVideoResponse.ModifyTime"));
		getVideoResponse.setProcessStatus(_ctx.stringValue("GetVideoResponse.ProcessStatus"));
		getVideoResponse.setVideoWidth(_ctx.integerValue("GetVideoResponse.VideoWidth"));
		getVideoResponse.setSourceUri(_ctx.stringValue("GetVideoResponse.SourceUri"));
		getVideoResponse.setSourceType(_ctx.stringValue("GetVideoResponse.SourceType"));
		getVideoResponse.setVideoInfo(_ctx.stringValue("GetVideoResponse.VideoInfo"));
		getVideoResponse.setRemarksA(_ctx.stringValue("GetVideoResponse.RemarksA"));
		getVideoResponse.setVideoFrameTagsModifyTime(_ctx.stringValue("GetVideoResponse.VideoFrameTagsModifyTime"));
		getVideoResponse.setRemarksB(_ctx.stringValue("GetVideoResponse.RemarksB"));
		getVideoResponse.setVideoFacesFailReason(_ctx.stringValue("GetVideoResponse.VideoFacesFailReason"));
		getVideoResponse.setVideoFacesStatus(_ctx.stringValue("GetVideoResponse.VideoFacesStatus"));
		getVideoResponse.setVideoOCRModifyTime(_ctx.stringValue("GetVideoResponse.VideoOCRModifyTime"));
		getVideoResponse.setRemarksC(_ctx.stringValue("GetVideoResponse.RemarksC"));
		getVideoResponse.setRemarksD(_ctx.stringValue("GetVideoResponse.RemarksD"));
		getVideoResponse.setVideoHeight(_ctx.integerValue("GetVideoResponse.VideoHeight"));
		getVideoResponse.setSourcePosition(_ctx.stringValue("GetVideoResponse.SourcePosition"));
		getVideoResponse.setVideoOCRFailReason(_ctx.stringValue("GetVideoResponse.VideoOCRFailReason"));
		getVideoResponse.setVideoFrameTagsStatus(_ctx.stringValue("GetVideoResponse.VideoFrameTagsStatus"));
		getVideoResponse.setVideoTagsFailReason(_ctx.stringValue("GetVideoResponse.VideoTagsFailReason"));
		getVideoResponse.setVideoTagsModifyTime(_ctx.stringValue("GetVideoResponse.VideoTagsModifyTime"));
		getVideoResponse.setVideoOCRStatus(_ctx.stringValue("GetVideoResponse.VideoOCRStatus"));
		getVideoResponse.setVideoFrames(_ctx.integerValue("GetVideoResponse.VideoFrames"));
		getVideoResponse.setVideoSTTModifyTime(_ctx.stringValue("GetVideoResponse.VideoSTTModifyTime"));
		getVideoResponse.setProcessModifyTime(_ctx.stringValue("GetVideoResponse.ProcessModifyTime"));
		getVideoResponse.setProcessFailReason(_ctx.stringValue("GetVideoResponse.ProcessFailReason"));
		getVideoResponse.setVideoSTTFailReason(_ctx.stringValue("GetVideoResponse.VideoSTTFailReason"));
		getVideoResponse.setExternalId(_ctx.stringValue("GetVideoResponse.ExternalId"));
		getVideoResponse.setCreateTime(_ctx.stringValue("GetVideoResponse.CreateTime"));
		getVideoResponse.setVideoUri(_ctx.stringValue("GetVideoResponse.VideoUri"));
		getVideoResponse.setVideoFormat(_ctx.stringValue("GetVideoResponse.VideoFormat"));
		getVideoResponse.setVideoFrameTagsFailReason(_ctx.stringValue("GetVideoResponse.VideoFrameTagsFailReason"));
		getVideoResponse.setVideoSTTStatus(_ctx.stringValue("GetVideoResponse.VideoSTTStatus"));
		getVideoResponse.setVideoFacesModifyTime(_ctx.stringValue("GetVideoResponse.VideoFacesModifyTime"));
		getVideoResponse.setCelebrityModifyTime(_ctx.stringValue("GetVideoResponse.CelebrityModifyTime"));
		getVideoResponse.setVideoDuration(_ctx.floatValue("GetVideoResponse.VideoDuration"));
		getVideoResponse.setCelebrityFailReason(_ctx.stringValue("GetVideoResponse.CelebrityFailReason"));
		getVideoResponse.setCelebrityStatus(_ctx.stringValue("GetVideoResponse.CelebrityStatus"));
		getVideoResponse.setSetId(_ctx.stringValue("GetVideoResponse.SetId"));
		getVideoResponse.setVideoTagsStatus(_ctx.stringValue("GetVideoResponse.VideoTagsStatus"));
		getVideoResponse.setFileSize(_ctx.integerValue("GetVideoResponse.FileSize"));

		List<VideoTagsItem> videoTags = new ArrayList<VideoTagsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoResponse.VideoTags.Length"); i++) {
			VideoTagsItem videoTagsItem = new VideoTagsItem();
			videoTagsItem.setTagConfidence(_ctx.floatValue("GetVideoResponse.VideoTags["+ i +"].TagConfidence"));
			videoTagsItem.setTagName(_ctx.stringValue("GetVideoResponse.VideoTags["+ i +"].TagName"));
			videoTagsItem.setTagLevel(_ctx.integerValue("GetVideoResponse.VideoTags["+ i +"].TagLevel"));
			videoTagsItem.setParentTagName(_ctx.stringValue("GetVideoResponse.VideoTags["+ i +"].ParentTagName"));

			videoTags.add(videoTagsItem);
		}
		getVideoResponse.setVideoTags(videoTags);

		List<PersonsItem> persons = new ArrayList<PersonsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoResponse.Persons.Length"); i++) {
			PersonsItem personsItem = new PersonsItem();
			personsItem.setPersonId(_ctx.stringValue("GetVideoResponse.Persons["+ i +"].PersonId"));
			personsItem.setGenderConfidence(_ctx.floatValue("GetVideoResponse.Persons["+ i +"].GenderConfidence"));
			personsItem.setGender(_ctx.stringValue("GetVideoResponse.Persons["+ i +"].Gender"));
			personsItem.setAge(_ctx.integerValue("GetVideoResponse.Persons["+ i +"].Age"));
			personsItem.setAgeConfidence(_ctx.floatValue("GetVideoResponse.Persons["+ i +"].AgeConfidence"));

			persons.add(personsItem);
		}
		getVideoResponse.setPersons(persons);

		List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoResponse.Celebrity.Length"); i++) {
			CelebrityItem celebrityItem = new CelebrityItem();
			celebrityItem.setCelebrityName(_ctx.stringValue("GetVideoResponse.Celebrity["+ i +"].CelebrityName"));
			celebrityItem.setCelebrityNum(_ctx.integerValue("GetVideoResponse.Celebrity["+ i +"].CelebrityNum"));
			celebrityItem.setCelebrityLibraryName(_ctx.stringValue("GetVideoResponse.Celebrity["+ i +"].CelebrityLibraryName"));

			celebrity.add(celebrityItem);
		}
		getVideoResponse.setCelebrity(celebrity);
	 
	 	return getVideoResponse;
	}
}