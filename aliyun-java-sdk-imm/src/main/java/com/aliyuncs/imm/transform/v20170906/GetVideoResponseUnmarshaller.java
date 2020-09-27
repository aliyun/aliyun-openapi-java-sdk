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
		getVideoResponse.setSetId(_ctx.stringValue("GetVideoResponse.SetId"));
		getVideoResponse.setVideoUri(_ctx.stringValue("GetVideoResponse.VideoUri"));
		getVideoResponse.setRemarksA(_ctx.stringValue("GetVideoResponse.RemarksA"));
		getVideoResponse.setRemarksB(_ctx.stringValue("GetVideoResponse.RemarksB"));
		getVideoResponse.setCreateTime(_ctx.stringValue("GetVideoResponse.CreateTime"));
		getVideoResponse.setModifyTime(_ctx.stringValue("GetVideoResponse.ModifyTime"));
		getVideoResponse.setVideoWidth(_ctx.integerValue("GetVideoResponse.VideoWidth"));
		getVideoResponse.setVideoHeight(_ctx.integerValue("GetVideoResponse.VideoHeight"));
		getVideoResponse.setVideoFormat(_ctx.stringValue("GetVideoResponse.VideoFormat"));
		getVideoResponse.setVideoDuration(_ctx.floatValue("GetVideoResponse.VideoDuration"));
		getVideoResponse.setFileSize(_ctx.integerValue("GetVideoResponse.FileSize"));
		getVideoResponse.setVideoFrames(_ctx.integerValue("GetVideoResponse.VideoFrames"));
		getVideoResponse.setSourceType(_ctx.stringValue("GetVideoResponse.SourceType"));
		getVideoResponse.setSourceUri(_ctx.stringValue("GetVideoResponse.SourceUri"));
		getVideoResponse.setSourcePosition(_ctx.stringValue("GetVideoResponse.SourcePosition"));
		getVideoResponse.setProcessStatus(_ctx.stringValue("GetVideoResponse.ProcessStatus"));
		getVideoResponse.setProcessModifyTime(_ctx.stringValue("GetVideoResponse.ProcessModifyTime"));
		getVideoResponse.setVideoTagsStatus(_ctx.stringValue("GetVideoResponse.VideoTagsStatus"));
		getVideoResponse.setVideoTagsModifyTime(_ctx.stringValue("GetVideoResponse.VideoTagsModifyTime"));
		getVideoResponse.setCelebrityStatus(_ctx.stringValue("GetVideoResponse.CelebrityStatus"));
		getVideoResponse.setCelebrityModifyTime(_ctx.stringValue("GetVideoResponse.CelebrityModifyTime"));
		getVideoResponse.setProcessFailReason(_ctx.stringValue("GetVideoResponse.ProcessFailReason"));
		getVideoResponse.setVideoTagsFailReason(_ctx.stringValue("GetVideoResponse.VideoTagsFailReason"));
		getVideoResponse.setCelebrityFailReason(_ctx.stringValue("GetVideoResponse.CelebrityFailReason"));
		getVideoResponse.setRemarksC(_ctx.stringValue("GetVideoResponse.RemarksC"));
		getVideoResponse.setRemarksD(_ctx.stringValue("GetVideoResponse.RemarksD"));
		getVideoResponse.setExternalId(_ctx.stringValue("GetVideoResponse.ExternalId"));
		getVideoResponse.setVideoFacesStatus(_ctx.stringValue("GetVideoResponse.VideoFacesStatus"));
		getVideoResponse.setVideoFacesFailReason(_ctx.stringValue("GetVideoResponse.VideoFacesFailReason"));
		getVideoResponse.setVideoFacesModifyTime(_ctx.stringValue("GetVideoResponse.VideoFacesModifyTime"));
		getVideoResponse.setVideoFrameTagsStatus(_ctx.stringValue("GetVideoResponse.VideoFrameTagsStatus"));
		getVideoResponse.setVideoFrameTagsFailReason(_ctx.stringValue("GetVideoResponse.VideoFrameTagsFailReason"));
		getVideoResponse.setVideoFrameTagsModifyTime(_ctx.stringValue("GetVideoResponse.VideoFrameTagsModifyTime"));
		getVideoResponse.setVideoSTTStatus(_ctx.stringValue("GetVideoResponse.VideoSTTStatus"));
		getVideoResponse.setVideoSTTFailReason(_ctx.stringValue("GetVideoResponse.VideoSTTFailReason"));
		getVideoResponse.setVideoSTTModifyTime(_ctx.stringValue("GetVideoResponse.VideoSTTModifyTime"));
		getVideoResponse.setVideoOCRStatus(_ctx.stringValue("GetVideoResponse.VideoOCRStatus"));
		getVideoResponse.setVideoOCRFailReason(_ctx.stringValue("GetVideoResponse.VideoOCRFailReason"));
		getVideoResponse.setVideoOCRModifyTime(_ctx.stringValue("GetVideoResponse.VideoOCRModifyTime"));
		getVideoResponse.setVideoInfo(_ctx.stringValue("GetVideoResponse.VideoInfo"));

		List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoResponse.Celebrity.Length"); i++) {
			CelebrityItem celebrityItem = new CelebrityItem();
			celebrityItem.setCelebrityName(_ctx.stringValue("GetVideoResponse.Celebrity["+ i +"].CelebrityName"));
			celebrityItem.setCelebrityNum(_ctx.integerValue("GetVideoResponse.Celebrity["+ i +"].CelebrityNum"));
			celebrityItem.setCelebrityLibraryName(_ctx.stringValue("GetVideoResponse.Celebrity["+ i +"].CelebrityLibraryName"));

			celebrity.add(celebrityItem);
		}
		getVideoResponse.setCelebrity(celebrity);

		List<VideoTagsItem> videoTags = new ArrayList<VideoTagsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoResponse.VideoTags.Length"); i++) {
			VideoTagsItem videoTagsItem = new VideoTagsItem();
			videoTagsItem.setTagName(_ctx.stringValue("GetVideoResponse.VideoTags["+ i +"].TagName"));
			videoTagsItem.setParentTagName(_ctx.stringValue("GetVideoResponse.VideoTags["+ i +"].ParentTagName"));
			videoTagsItem.setTagConfidence(_ctx.floatValue("GetVideoResponse.VideoTags["+ i +"].TagConfidence"));
			videoTagsItem.setTagLevel(_ctx.integerValue("GetVideoResponse.VideoTags["+ i +"].TagLevel"));

			videoTags.add(videoTagsItem);
		}
		getVideoResponse.setVideoTags(videoTags);

		List<PersonsItem> persons = new ArrayList<PersonsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoResponse.Persons.Length"); i++) {
			PersonsItem personsItem = new PersonsItem();
			personsItem.setPersonId(_ctx.stringValue("GetVideoResponse.Persons["+ i +"].PersonId"));
			personsItem.setAge(_ctx.integerValue("GetVideoResponse.Persons["+ i +"].Age"));
			personsItem.setAgeConfidence(_ctx.floatValue("GetVideoResponse.Persons["+ i +"].AgeConfidence"));
			personsItem.setGender(_ctx.stringValue("GetVideoResponse.Persons["+ i +"].Gender"));
			personsItem.setGenderConfidence(_ctx.floatValue("GetVideoResponse.Persons["+ i +"].GenderConfidence"));

			persons.add(personsItem);
		}
		getVideoResponse.setPersons(persons);
	 
	 	return getVideoResponse;
	}
}