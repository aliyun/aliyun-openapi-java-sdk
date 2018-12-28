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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoResponseUnmarshaller {

	public static GetVideoResponse unmarshall(GetVideoResponse getVideoResponse, UnmarshallerContext context) {
		
		getVideoResponse.setRequestId(context.stringValue("GetVideoResponse.RequestId"));
		getVideoResponse.setSetId(context.stringValue("GetVideoResponse.SetId"));
		getVideoResponse.setVideoUri(context.stringValue("GetVideoResponse.VideoUri"));
		getVideoResponse.setRemarksA(context.stringValue("GetVideoResponse.RemarksA"));
		getVideoResponse.setRemarksB(context.stringValue("GetVideoResponse.RemarksB"));
		getVideoResponse.setCreateTime(context.stringValue("GetVideoResponse.CreateTime"));
		getVideoResponse.setModifyTime(context.stringValue("GetVideoResponse.ModifyTime"));
		getVideoResponse.setVideoWidth(context.integerValue("GetVideoResponse.VideoWidth"));
		getVideoResponse.setVideoHeight(context.integerValue("GetVideoResponse.VideoHeight"));
		getVideoResponse.setVideoFormat(context.stringValue("GetVideoResponse.VideoFormat"));
		getVideoResponse.setVideoDuration(context.floatValue("GetVideoResponse.VideoDuration"));
		getVideoResponse.setFileSize(context.integerValue("GetVideoResponse.FileSize"));
		getVideoResponse.setVideoFrames(context.integerValue("GetVideoResponse.VideoFrames"));
		getVideoResponse.setSourceType(context.stringValue("GetVideoResponse.SourceType"));
		getVideoResponse.setSourceUri(context.stringValue("GetVideoResponse.SourceUri"));
		getVideoResponse.setSourcePosition(context.stringValue("GetVideoResponse.SourcePosition"));
		getVideoResponse.setProcessStatus(context.stringValue("GetVideoResponse.ProcessStatus"));
		getVideoResponse.setProcessModifyTime(context.stringValue("GetVideoResponse.ProcessModifyTime"));
		getVideoResponse.setVideoTagsStatus(context.stringValue("GetVideoResponse.VideoTagsStatus"));
		getVideoResponse.setVideoTagsModifyTime(context.stringValue("GetVideoResponse.VideoTagsModifyTime"));
		getVideoResponse.setCelebrityStatus(context.stringValue("GetVideoResponse.CelebrityStatus"));
		getVideoResponse.setCelebrityModifyTime(context.stringValue("GetVideoResponse.CelebrityModifyTime"));
		getVideoResponse.setProcessFailReason(context.stringValue("GetVideoResponse.ProcessFailReason"));
		getVideoResponse.setVideoTagsFailReason(context.stringValue("GetVideoResponse.VideoTagsFailReason"));
		getVideoResponse.setCelebrityFailReason(context.stringValue("GetVideoResponse.CelebrityFailReason"));

		List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
		for (int i = 0; i < context.lengthValue("GetVideoResponse.Celebrity.Length"); i++) {
			CelebrityItem celebrityItem = new CelebrityItem();
			celebrityItem.setCelebrityName(context.stringValue("GetVideoResponse.Celebrity["+ i +"].CelebrityName"));
			celebrityItem.setCelebrityNum(context.integerValue("GetVideoResponse.Celebrity["+ i +"].CelebrityNum"));
			celebrityItem.setCelebrityLibraryName(context.stringValue("GetVideoResponse.Celebrity["+ i +"].CelebrityLibraryName"));

			celebrity.add(celebrityItem);
		}
		getVideoResponse.setCelebrity(celebrity);

		List<VideoTagsItem> videoTags = new ArrayList<VideoTagsItem>();
		for (int i = 0; i < context.lengthValue("GetVideoResponse.VideoTags.Length"); i++) {
			VideoTagsItem videoTagsItem = new VideoTagsItem();
			videoTagsItem.setVideoTagName(context.stringValue("GetVideoResponse.VideoTags["+ i +"].VideoTagName"));
			videoTagsItem.setVideoTagEnName(context.stringValue("GetVideoResponse.VideoTags["+ i +"].VideoTagEnName"));
			videoTagsItem.setVideoTagConfidence(context.floatValue("GetVideoResponse.VideoTags["+ i +"].VideoTagConfidence"));

			videoTags.add(videoTagsItem);
		}
		getVideoResponse.setVideoTags(videoTags);

		List<PersonsItem> persons = new ArrayList<PersonsItem>();
		for (int i = 0; i < context.lengthValue("GetVideoResponse.Persons.Length"); i++) {
			PersonsItem personsItem = new PersonsItem();
			personsItem.setPersonId(context.stringValue("GetVideoResponse.Persons["+ i +"].PersonId"));
			personsItem.setAge(context.integerValue("GetVideoResponse.Persons["+ i +"].Age"));
			personsItem.setAgeConfidence(context.floatValue("GetVideoResponse.Persons["+ i +"].AgeConfidence"));
			personsItem.setGender(context.stringValue("GetVideoResponse.Persons["+ i +"].Gender"));
			personsItem.setGenderConfidence(context.floatValue("GetVideoResponse.Persons["+ i +"].GenderConfidence"));

			persons.add(personsItem);
		}
		getVideoResponse.setPersons(persons);
	 
	 	return getVideoResponse;
	}
}