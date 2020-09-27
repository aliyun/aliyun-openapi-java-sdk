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

import com.aliyuncs.imm.model.v20170906.ListVideosResponse;
import com.aliyuncs.imm.model.v20170906.ListVideosResponse.VideosItem;
import com.aliyuncs.imm.model.v20170906.ListVideosResponse.VideosItem.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.ListVideosResponse.VideosItem.PersonsItem;
import com.aliyuncs.imm.model.v20170906.ListVideosResponse.VideosItem.VideoTagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVideosResponseUnmarshaller {

	public static ListVideosResponse unmarshall(ListVideosResponse listVideosResponse, UnmarshallerContext _ctx) {
		
		listVideosResponse.setRequestId(_ctx.stringValue("ListVideosResponse.RequestId"));
		listVideosResponse.setSetId(_ctx.stringValue("ListVideosResponse.SetId"));
		listVideosResponse.setNextMarker(_ctx.stringValue("ListVideosResponse.NextMarker"));

		List<VideosItem> videos = new ArrayList<VideosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVideosResponse.Videos.Length"); i++) {
			VideosItem videosItem = new VideosItem();
			videosItem.setVideoUri(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoUri"));
			videosItem.setRemarksA(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].RemarksA"));
			videosItem.setRemarksB(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].RemarksB"));
			videosItem.setCreateTime(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].CreateTime"));
			videosItem.setModifyTime(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].ModifyTime"));
			videosItem.setVideoWidth(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].VideoWidth"));
			videosItem.setVideoHeight(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].VideoHeight"));
			videosItem.setVideoFormat(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoFormat"));
			videosItem.setVideoDuration(_ctx.floatValue("ListVideosResponse.Videos["+ i +"].VideoDuration"));
			videosItem.setFileSize(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].FileSize"));
			videosItem.setVideoFrames(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].VideoFrames"));
			videosItem.setSourceType(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].SourceType"));
			videosItem.setSourceUri(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].SourceUri"));
			videosItem.setSourcePosition(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].SourcePosition"));
			videosItem.setProcessStatus(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].ProcessStatus"));
			videosItem.setProcessModifyTime(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].ProcessModifyTime"));
			videosItem.setVideoTagsStatus(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoTagsStatus"));
			videosItem.setVideoTagsModifyTime(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoTagsModifyTime"));
			videosItem.setCelebrityStatus(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].CelebrityStatus"));
			videosItem.setCelebrityModifyTime(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].CelebrityModifyTime"));
			videosItem.setCelebrityFailReason(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].CelebrityFailReason"));
			videosItem.setVideoTagsFailReason(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoTagsFailReason"));
			videosItem.setProcessFailReason(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].ProcessFailReason"));
			videosItem.setRemarksC(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].RemarksC"));
			videosItem.setRemarksD(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].RemarksD"));
			videosItem.setExternalId(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].ExternalId"));

			List<VideoTagsItem> videoTags = new ArrayList<VideoTagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVideosResponse.Videos["+ i +"].VideoTags.Length"); j++) {
				VideoTagsItem videoTagsItem = new VideoTagsItem();
				videoTagsItem.setTagName(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoTags["+ j +"].TagName"));
				videoTagsItem.setParentTagName(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoTags["+ j +"].ParentTagName"));
				videoTagsItem.setTagConfidence(_ctx.floatValue("ListVideosResponse.Videos["+ i +"].VideoTags["+ j +"].TagConfidence"));
				videoTagsItem.setTagLevel(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].VideoTags["+ j +"].TagLevel"));

				videoTags.add(videoTagsItem);
			}
			videosItem.setVideoTags(videoTags);

			List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVideosResponse.Videos["+ i +"].Celebrity.Length"); j++) {
				CelebrityItem celebrityItem = new CelebrityItem();
				celebrityItem.setCelebrityName(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].Celebrity["+ j +"].CelebrityName"));
				celebrityItem.setCelebrityNum(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].Celebrity["+ j +"].CelebrityNum"));
				celebrityItem.setCelebrityLibraryName(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].Celebrity["+ j +"].CelebrityLibraryName"));

				celebrity.add(celebrityItem);
			}
			videosItem.setCelebrity(celebrity);

			List<PersonsItem> persons = new ArrayList<PersonsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVideosResponse.Videos["+ i +"].Persons.Length"); j++) {
				PersonsItem personsItem = new PersonsItem();
				personsItem.setPersonId(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].PersonId"));
				personsItem.setAge(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].Age"));
				personsItem.setAgeConfidence(_ctx.floatValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].AgeConfidence"));
				personsItem.setGender(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].Gender"));
				personsItem.setGenderConfidence(_ctx.floatValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].GenderConfidence"));

				persons.add(personsItem);
			}
			videosItem.setPersons(persons);

			videos.add(videosItem);
		}
		listVideosResponse.setVideos(videos);
	 
	 	return listVideosResponse;
	}
}